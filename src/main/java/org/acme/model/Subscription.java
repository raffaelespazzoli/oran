package org.acme.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.smallrye.common.constraint.NotNull;
import lombok.Data;

import java.net.URI;
import java.util.UUID;

@Data
public class Subscription {
    @JsonProperty("subscriptionId")
    @NotNull
    UUID subscriptionId;
    @JsonProperty("callback")
    @NotNull
    URI callback;
    @JsonProperty("consumerSubscriptionId")
    UUID consumerSubscriptionId;
    @JsonProperty("filter")
    String filter;
}
