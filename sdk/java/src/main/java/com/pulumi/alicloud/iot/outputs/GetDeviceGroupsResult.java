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
    private @Nullable Boolean enableDetails;
    private @Nullable String groupName;
    private List<GetDeviceGroupsGroup> groups;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String iotInstanceId;
    private @Nullable String nameRegex;
    private @Nullable String outputFile;
    private @Nullable String superGroupId;

    private GetDeviceGroupsResult() {}
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
    @CustomType.Builder
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
        public Builder() {}
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

        @CustomType.Setter
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
        }
        @CustomType.Setter
        public Builder groupName(@Nullable String groupName) {
            this.groupName = groupName;
            return this;
        }
        @CustomType.Setter
        public Builder groups(List<GetDeviceGroupsGroup> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        public Builder groups(GetDeviceGroupsGroup... groups) {
            return groups(List.of(groups));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder iotInstanceId(@Nullable String iotInstanceId) {
            this.iotInstanceId = iotInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder superGroupId(@Nullable String superGroupId) {
            this.superGroupId = superGroupId;
            return this;
        }
        public GetDeviceGroupsResult build() {
            final var _resultValue = new GetDeviceGroupsResult();
            _resultValue.enableDetails = enableDetails;
            _resultValue.groupName = groupName;
            _resultValue.groups = groups;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.iotInstanceId = iotInstanceId;
            _resultValue.nameRegex = nameRegex;
            _resultValue.outputFile = outputFile;
            _resultValue.superGroupId = superGroupId;
            return _resultValue;
        }
    }
}
