
package jp.livlog.firstSunriseHotel.model;

import java.util.HashMap;
import java.util.List;
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
        "phone"
})
@Generated ("jsonschema2pojo")
@ToString
public class Contact {

    @JsonProperty ("phone")
    public List <Phone>                phone                = null;

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
