package org.acme.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.smallrye.common.constraint.NotNull;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
public class Resource {
    @JsonProperty("resourceID")
    @NotNull
    UUID resourceID;
    @JsonProperty("resourceTypeID")
    @NotNull
    UUID resourceTypeID;
    @JsonProperty("resourcePoolID")
    @NotNull
    UUID resourcePoolID;
    @JsonProperty("globalAssetID")
    String globalAssetID;
    @JsonProperty("description")
    @NotNull
    String description;
    @JsonProperty("elements")
    List<Resource> elements;
    @JsonProperty("extensions")
    Map<String, String> extensions;
}