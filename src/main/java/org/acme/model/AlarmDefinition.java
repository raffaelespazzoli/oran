package org.acme.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.smallrye.common.constraint.NotNull;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
public class AlarmDefinition {
    @JsonProperty("alarmDefinitionId")
    @NotNull
    UUID alarmDefinitionId;
    @JsonProperty("alarmName")
    @NotNull
    String alarmName;
    @JsonProperty("alarmLastChange")
    @NotNull
    String alarmLastChange;
    @JsonProperty("alarmChangeType")
    @NotNull
    AlarmChangeType alarmChangeType;
    @JsonProperty("alarmDescription")
    @NotNull
    String alarmDescription;
    @JsonProperty("alarmDescription")
    @NotNull
    String proposedRepairActions;
    @JsonProperty("clearingType")
    @NotNull
    ClearingType clearingType;
    @JsonProperty("managementInterfaceIds")
    List<String> managementInterfaceIds;
    @JsonProperty("pkNotificationFields")
    String pkNotificationFields;
    @JsonProperty("alarmAdditionalFields")
    Map<String, String> alarmAdditionalFields;

}
