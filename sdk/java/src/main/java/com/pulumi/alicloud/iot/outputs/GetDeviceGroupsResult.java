// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.iot.outputs;

import com.pulumi.alicloud.iot.outputs.GetDeviceGroupsGroup;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDeviceGroupsResult {
    private final @Nullable Boolean enableDetails;
    private final @Nullable String groupName;
    private final List<GetDeviceGroupsGroup> groups;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String iotInstanceId;
    private final @Nullable String nameRegex;
    private final @Nullable String outputFile;
    private final @Nullable String superGroupId;

    @CustomType.Constructor
    private GetDeviceGroupsResult(
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("groupName") @Nullable String groupName,
        @CustomType.Parameter("groups") List<GetDeviceGroupsGroup> groups,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("iotInstanceId") @Nullable String iotInstanceId,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("superGroupId") @Nullable String superGroupId) {
        this.enableDetails = enableDetails;
        this.groupName = groupName;
        this.groups = groups;
        this.id = id;
        this.ids = ids;
        this.iotInstanceId = iotInstanceId;
        this.nameRegex = nameRegex;
        this.outputFile = outputFile;
        this.superGroupId = superGroupId;
    }

    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    public Optional<String> groupName() {
        return Optional.ofNullable(this.groupName);
    }
    public List<GetDeviceGroupsGroup> groups() {
        return this.groups;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> iotInstanceId() {
        return Optional.ofNullable(this.iotInstanceId);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> superGroupId() {
        return Optional.ofNullable(this.superGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceGroupsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableDetails;
        private @Nullable String groupName;
        private List<GetDeviceGroupsGroup> groups;
        private String id;
        private List<String> ids;
        private @Nullable String iotInstanceId;
        private @Nullable String nameRegex;
        private @Nullable String outputFile;
        private @Nullable String superGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeviceGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDetails = defaults.enableDetails;
    	      this.groupName = defaults.groupName;
    	      this.groups = defaults.groups;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.iotInstanceId = defaults.iotInstanceId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.outputFile = defaults.outputFile;
    	      this.superGroupId = defaults.superGroupId;
        }

        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
        }
        public Builder groupName(@Nullable String groupName) {
            this.groupName = groupName;
            return this;
        }
        public Builder groups(List<GetDeviceGroupsGroup> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        public Builder groups(GetDeviceGroupsGroup... groups) {
            return groups(List.of(groups));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder iotInstanceId(@Nullable String iotInstanceId) {
            this.iotInstanceId = iotInstanceId;
            return this;
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder superGroupId(@Nullable String superGroupId) {
            this.superGroupId = superGroupId;
            return this;
        }        public GetDeviceGroupsResult build() {
            return new GetDeviceGroupsResult(enableDetails, groupName, groups, id, ids, iotInstanceId, nameRegex, outputFile, superGroupId);
        }
    }
}
