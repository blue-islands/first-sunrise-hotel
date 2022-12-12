
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
        "title",
        "id",
        "language",
        "ontologyId",
        "resultType",
        "address",
        "position",
        "access",
        "distance",
        "categories",
        "references",
        "contacts"
})
@Generated ("jsonschema2pojo")
@ToString
public class Item {

    @JsonProperty ("title")
    public String                      title;

    @JsonProperty ("id")
    public String                      id;

    @JsonProperty ("language")
    public String                      language;

    @JsonProperty ("ontologyId")
    public String                      ontologyId;

    @JsonProperty ("resultType")
    public String                      resultType;

    @JsonProperty ("address")
    public Address                     address;

    @JsonProperty ("position")
    public Position                    position;

    @JsonProperty ("access")
    public List <Access>               access               = null;

    @JsonProperty ("distance")
    public Integer                     distance;

    @JsonProperty ("categories")
    public List <Category>             categories           = null;

    @JsonProperty ("references")
    public List <Reference>            references           = null;

    @JsonProperty ("contacts")
    public List <Contact>              contacts             = null;

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
