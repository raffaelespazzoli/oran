package org.acme.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.smallrye.common.constraint.NotNull;
import lombok.Data;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
public class OCloud {
    @JsonProperty("oCloudID")
    @NotNull
    String oCloudID;

    @JsonProperty("globalCloudID")
    @NotNull
    UUID globalCloudID;

    @JsonProperty("name")
    @NotNull
    String name;

    @JsonProperty("description")
    @NotNull
    String description;

    @JsonProperty("serviceURI")
    @NotNull
    URI serviceURI;

    @JsonProperty("smoRegistrationService")
    @NotNull
    URI smoRegistrationService;

    @JsonProperty("resourceTypes")
    List<ResourceType> resourceTypes;

    @JsonProperty("resourcePools")
    List<ResourcePool> resourcePools;

    @JsonProperty("deploymentManagers")
    List<DeploymentManager> deploymentManagers;

    @JsonProperty("extensions")
    Map<String, String> extensions;
}
