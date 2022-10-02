package org.acme.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.smallrye.common.constraint.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class AlarmDictionary {
    @JsonProperty("alarmDictionaryVersion")
    @NotNull
    String alarmDictionaryVersion;
    @JsonProperty("alarmDictionarySchemaVersion")
    @NotNull
    String alarmDictionarySchemaVersion;
    @JsonProperty("entityType")
    @NotNull
    String entityType;
    @JsonProperty("vendor")
    @NotNull
    String vendor;
    @JsonProperty("managementInterfaceIds")
    @NotNull
    List<ManagementInterfaceID> managementInterfaceIds;
    @JsonProperty("pkNotificationFields")
    @NotNull
    List<String> pkNotificationFields;
    @JsonProperty("alarmDefinitions")
    @NotNull
    List<AlarmDefinition> alarmDefinitions;
}
