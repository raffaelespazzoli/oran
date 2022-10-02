package org.acme.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.smallrye.common.constraint.NotNull;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
public class ResourcePool {
    @JsonProperty("resourcePoolID")
    @NotNull
    UUID resourcePoolID;
    @JsonProperty("oCloudID")
    @NotNull
    UUID oCloudID;
    @JsonProperty("globalLocationID")
    @NotNull
    UUID globalLocationID;
    @JsonProperty("name")
    @NotNull
    String name;
    @JsonProperty("description")
    @NotNull
    String description;
    @JsonProperty("location")
    @NotNull
    String location;
    @JsonProperty("extensions")
    Map<String, String> extensions;
    @JsonProperty("elements")
    List<Resource> elements;
}
