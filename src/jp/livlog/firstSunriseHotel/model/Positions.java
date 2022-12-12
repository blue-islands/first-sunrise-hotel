
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
        "sunsetAzimuth",
        "moonsetAltitude",
        "solarNoonAzimuth",
        "sunriseAzimuth",
        "moonriseAzimuth",
        "moonsetAzimuth",
        "sunsetAltitude",
        "moonriseAltitude",
        "sunriseAltitude",
        "solarNoonAltitude"
})
@Generated ("jsonschema2pojo")
@ToString
public class Positions {

    @JsonProperty ("sunsetAzimuth")
    public Float                       sunsetAzimuth;

    @JsonProperty ("moonsetAltitude")
    public Float                       moonsetAltitude;

    @JsonProperty ("solarNoonAzimuth")
    public Float                       solarNoonAzimuth;

    @JsonProperty ("sunriseAzimuth")
    public Float                       sunriseAzimuth;

    @JsonProperty ("moonriseAzimuth")
    public Float                       moonriseAzimuth;

    @JsonProperty ("moonsetAzimuth")
    public Float                       moonsetAzimuth;

    @JsonProperty ("sunsetAltitude")
    public Float                       sunsetAltitude;

    @JsonProperty ("moonriseAltitude")
    public Float                       moonriseAltitude;

    @JsonProperty ("sunriseAltitude")
    public Float                       sunriseAltitude;

    @JsonProperty ("solarNoonAltitude")
    public Float                       solarNoonAltitude;

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
