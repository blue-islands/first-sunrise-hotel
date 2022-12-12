package jp.livlog.firstSunriseHotel.batch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVWriter;
import com.opencsv.ICSVWriter;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import jp.livlog.firstSunriseHotel.common.CustomMappingStrategy;
import jp.livlog.firstSunriseHotel.csv.FirstSunriseHotelCsv;
import jp.livlog.firstSunriseHotel.model.DiscoverModel;
import jp.livlog.firstSunriseHotel.model.Item;
import jp.livlog.firstSunriseHotel.model.Result;
import jp.livlog.firstSunriseHotel.model.SceneryJudgmentModel;

public class FirstSunriseHotel {

    public static void main(final String[] args) {

        final var latlng = "34.6202363,138.8274184";
        final var limit = "10";
        final var apiKey = "<<----API KEY---->>";
        final var path = "C:\\temp\\FirstSunriseHotel.csv";

        try {

            final List <FirstSunriseHotelCsv> csvList = new ArrayList <>();

            final var firstSunriseHotel = new FirstSunriseHotel();
            final var items = firstSunriseHotel.getHotel(latlng, limit, apiKey);

            FirstSunriseHotelCsv csv = null;
            for (final Item item : items) {
                System.out.println(item);
                final var sceneryJudgment = firstSunriseHotel.getSceneryJudgment(item);
                if (sceneryJudgment != null) {
                    System.out.println(sceneryJudgment.sunriseRate);
                    csv = new FirstSunriseHotelCsv();
                    csv.setId(item.id);
                    csv.setName(item.title);
                    csv.setAddress(item.address.label);
                    csv.setLat(item.position.lat);
                    csv.setLng(item.position.lng);
                    csv.setSunriseRate(sceneryJudgment.sunriseRate);
                    csvList.add(csv);
                }

            }

            firstSunriseHotel.writeCSV(csvList, FirstSunriseHotelCsv.class, path);

        } catch (final Exception e) {
            e.printStackTrace();
        }
    }


    private List <Item> getHotel(final String latlng, final String limit, final String apiKey) throws IOException {

        // URLを生成
        final var sb = new StringBuilder("https://discover.search.hereapi.com/v1/discover");
        sb.append("?at=" + latlng);// 緯度経度を指定
        sb.append("&limit=" + limit);// 件数を指定
        sb.append("&lang=ja");// 言語に日本語を指定
        sb.append("&q=ホテル");// カテゴリーにホテルを指定
        sb.append("&apiKey=" + apiKey); // APIキーを指定

        // URLを保持する適切な値オブジェクトを作成する
        final var url = new URL(sb.toString());

        // URLで接続を開き、コネクションを取得する
        final var connection = (HttpURLConnection) url.openConnection();

        // インプットストリームを取得する
        try (final var reader = new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8)) {

            final var mapper = new ObjectMapper();
            final var model = mapper.readValue(reader, DiscoverModel.class);

            return model.items;
        }
    }


    private Result getSceneryJudgment(final Item item) throws IOException {

        if (item.access.isEmpty()) {
            return null;
        }

        // 2023年の元旦の日付を設定
        final var year = "2023";
        final var month = "1";
        final var day = "1";

        // URLを生成
        final var sb = new StringBuilder("https://livlog.xyz/asayuubiyori/api/sceneryJudgment");
        sb.append("?year=" + year);// 年を指定
        sb.append("&month=" + month);// 月を指定
        sb.append("&day=" + day);// 日を指定
        sb.append("&lat=" + item.access.get(0).lat);// 緯度を指定
        sb.append("&lng=" + item.access.get(0).lng); // 経度を指定
        sb.append("&height=0"); // 建物高さを指定

        // URLを保持する適切な値オブジェクトを作成する
        final var url = new URL(sb.toString());

        // URLで接続を開き、コネクションを取得する
        final var connection = (HttpURLConnection) url.openConnection();

        // インプットストリームを取得する
        try (final var reader = new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8)) {

            final var mapper = new ObjectMapper();
            final var model = mapper.readValue(reader, SceneryJudgmentModel.class);

            return model.results.get(0);
        }
    }


    public void writeCSV(final List <FirstSunriseHotelCsv> beanList, final Class <FirstSunriseHotelCsv> bean, final String path) throws Exception {

        final var file = new File(path);
        try (var csvWriter = new CSVWriter(new FileWriter(file))) {
            final var mappingStrategy = new CustomMappingStrategy <FirstSunriseHotelCsv>();
            mappingStrategy.setType(bean);
            final var beanToCsv = new StatefulBeanToCsvBuilder <FirstSunriseHotelCsv>(csvWriter)
                    .withSeparator(ICSVWriter.DEFAULT_SEPARATOR)
                    .withMappingStrategy(mappingStrategy)
                    .build();
            beanToCsv.write(beanList);
        } catch (final Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
    }
}
