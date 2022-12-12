
package jp.livlog.firstSunriseHotel.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.ToString;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "date",
        "sunriseElevation04",
        "sunriseElevation16",
        "sunsetRate",
        "sunriseElevation01",
        "sunriseElevation12",
        "sunriseElevation02",
        "sunsetElevation08",
        "sunriseRate",
        "positions",
        "sunsetElevation16",
        "sunsetElevation04",
        "sunsetElevation02",
        "sunsetElevation01",
        "sunsetElevation12",
        "baseElevation",
        "location",
        "sunriseElevation08",
        "riseAndSet"
})
@Generated ("jsonschema2pojo")
@ToString
public class Result {

    @JsonProperty ("date")
    public Date                        date;

    @JsonProperty ("sunriseElevation04")
    public Float                       sunriseElevation04;

    @JsonProperty ("sunriseElevation16")
    public Float                       sunriseElevation16;

    @JsonProperty ("sunsetRate")
    public Float                       sunsetRate;

    @JsonProperty ("sunriseElevation01")
    public Float                       sunriseElevation01;

    @JsonProperty ("sunriseElevation12")
    public Float                       sunriseElevation12;

    @JsonProperty ("sunriseElevation02")
    public Float                       sunriseElevation02;

    @JsonProperty ("sunsetElevation08")
    public Float                       sunsetElevation08;

    @JsonProperty ("sunriseRate")
    public Float                       sunriseRate;

    @JsonProperty ("positions")
    public Positions                   positions;

    @JsonProperty ("sunsetElevation16")
    public Float                       sunsetElevation16;

    @JsonProperty ("sunsetElevation04")
    public Float                       sunsetElevation04;

    @JsonProperty ("sunsetElevation02")
    public Float                       sunsetElevation02;

    @JsonProperty ("sunsetElevation01")
    public Float                       sunsetElevation01;

    @JsonProperty ("sunsetElevation12")
    public Float                       sunsetElevation12;

    @JsonProperty ("baseElevation")
    public Float                       baseElevation;

    @JsonProperty ("location")
    public Location                    location;

    @JsonProperty ("sunriseElevation08")
    public Float                       sunriseElevation08;

    @JsonProperty ("riseAndSet")
    public RiseAndSet                  riseAndSet;

    @JsonIgnore
    private final Map <String, Object> additionalProperties = new HashMap <>();

    @JsonAnyGetter
    public Map <String, Object> getAdditionalProperties() {

        return this.additionalProperties;
    }


    @JsonAnySetter
    public void setAdditionalProperty(final String name, final Object value) {

        this.additionalProperties.put(name, value);
    }

}
