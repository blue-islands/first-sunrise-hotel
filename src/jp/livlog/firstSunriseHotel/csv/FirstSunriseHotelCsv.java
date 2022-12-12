package jp.livlog.firstSunriseHotel.csv;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

import lombok.Data;

@Data
public class FirstSunriseHotelCsv {

    @CsvBindByPosition (position = 0)
    @CsvBindByName (column = "id", required = true)
    private String id;

    @CsvBindByPosition (position = 1)
    @CsvBindByName (column = "name", required = true)
    private String name;

    @CsvBindByPosition (position = 2)
    @CsvBindByName (column = "address", required = true)
    private String address;

    @CsvBindByPosition (position = 3)
    @CsvBindByName (column = "lat", required = true)
    private double lat;

    @CsvBindByPosition (position = 4)
    @CsvBindByName (column = "lng", required = true)
    private double lng;

    @CsvBindByPosition (position = 5)
    @CsvBindByName (column = "sunriseRate", required = true)
    private double sunriseRate;
}
