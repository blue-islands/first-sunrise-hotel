
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
        "label",
        "countryCode",
        "countryName",
        "state",
        "county",
        "city",
        "subdistrict",
        "subblock",
        "postalCode"
})
@Generated ("jsonschema2pojo")
@ToString
public class Address {

    @JsonProperty ("label")
    public String                      label;

    @JsonProperty ("countryCode")
    public String                      countryCode;

    @JsonProperty ("countryName")
    public String                      countryName;

    @JsonProperty ("state")
    public String                      state;

    @JsonProperty ("county")
    public String                      county;

    @JsonProperty ("city")
    public String                      city;

    @JsonProperty ("subdistrict")
    public String                      subdistrict;

    @JsonProperty ("subblock")
    public String                      subblock;

    @JsonProperty ("postalCode")
    public String                      postalCode;

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
