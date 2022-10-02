package org.acme.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.smallrye.common.constraint.NotNull;
import lombok.Data;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
public class DeploymentManager {
    @JsonProperty("deploymentManagerID")
    @NotNull
    UUID deploymentManagerID;
    @JsonProperty("name")
    @NotNull
    String name;
    @JsonProperty("description")
    @NotNull
    String description;

    @JsonProperty("oCloudID")
    @NotNull
    UUID oCloudID;

    @JsonProperty("serviceUri")
    @NotNull
    URI serviceUri;

    @JsonProperty("extensions")
    Map<String, String> extensions;

    @JsonProperty("supportedLocations")
    @NotNull
    List<UUID> supportedLocations;

    @JsonProperty("capabilities")
    @NotNull
    Map<String, String> capabilities;
}
