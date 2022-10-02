package org.acme.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.smallrye.common.constraint.NotNull;
import lombok.Data;

import java.util.Map;
import java.util.UUID;

@Data
public class ResourceType {

    @JsonProperty("resourceTypeID")
    @NotNull
    UUID resourceID;
    @JsonProperty("name")
    @NotNull
    String name;
    @JsonProperty("description")
    @NotNull
    String description;
    @JsonProperty("vendor")
    @NotNull
    String vendor;
    @JsonProperty("model")
    @NotNull
    String model;
    @JsonProperty("alarmDictionary")
    @NotNull
    AlarmDictionary alarmDictionary;
    @JsonProperty("version")
    @NotNull
    String version;
    @JsonProperty("resourceKind")
    @NotNull
    ResourceKind resourceKind;
    @JsonProperty("resourceClass")
    @NotNull
    ResourceClass resourceClass;
    @JsonProperty("extensions")
    Map<String, String> extensions;


}
