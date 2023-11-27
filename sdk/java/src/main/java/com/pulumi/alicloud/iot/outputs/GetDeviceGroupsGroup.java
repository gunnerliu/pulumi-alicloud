// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeviceGroupsGroup {
    /**
     * @return The Group CreateTime.
     * 
     */
    private String createTime;
    /**
     * @return The Group Number of activated devices.
     * 
     */
    private String deviceActive;
    /**
     * @return The Group Total number of devices.
     * 
     */
    private String deviceCount;
    /**
     * @return The Group Number of online devices.
     * 
     */
    private String deviceOnline;
    /**
     * @return The Error_Message of the device group.
     * 
     */
    private String errorMessage;
    /**
     * @return The GroupDesc of the device group.
     * 
     */
    private String groupDesc;
    /**
     * @return The GroupId of the device group.
     * 
     */
    private String groupId;
    /**
     * @return The GroupName of the device group.
     * 
     */
    private String groupName;
    /**
     * @return The ID of the device group.
     * 
     */
    private String id;
    /**
     * @return Whether the call is successful.
     * 
     */
    private Boolean success;

    private GetDeviceGroupsGroup() {}
    /**
     * @return The Group CreateTime.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The Group Number of activated devices.
     * 
     */
    public String deviceActive() {
        return this.deviceActive;
    }
    /**
     * @return The Group Total number of devices.
     * 
     */
    public String deviceCount() {
        return this.deviceCount;
    }
    /**
     * @return The Group Number of online devices.
     * 
     */
    public String deviceOnline() {
        return this.deviceOnline;
    }
    /**
     * @return The Error_Message of the device group.
     * 
     */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * @return The GroupDesc of the device group.
     * 
     */
    public String groupDesc() {
        return this.groupDesc;
    }
    /**
     * @return The GroupId of the device group.
     * 
     */
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The GroupName of the device group.
     * 
     */
    public String groupName() {
        return this.groupName;
    }
    /**
     * @return The ID of the device group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether the call is successful.
     * 
     */
    public Boolean success() {
        return this.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String deviceActive;
        private String deviceCount;
        private String deviceOnline;
        private String errorMessage;
        private String groupDesc;
        private String groupId;
        private String groupName;
        private String id;
        private Boolean success;
        public Builder() {}
        public Builder(GetDeviceGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deviceActive = defaults.deviceActive;
    	      this.deviceCount = defaults.deviceCount;
    	      this.deviceOnline = defaults.deviceOnline;
    	      this.errorMessage = defaults.errorMessage;
    	      this.groupDesc = defaults.groupDesc;
    	      this.groupId = defaults.groupId;
    	      this.groupName = defaults.groupName;
    	      this.id = defaults.id;
    	      this.success = defaults.success;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder deviceActive(String deviceActive) {
            this.deviceActive = Objects.requireNonNull(deviceActive);
            return this;
        }
        @CustomType.Setter
        public Builder deviceCount(String deviceCount) {
            this.deviceCount = Objects.requireNonNull(deviceCount);
            return this;
        }
        @CustomType.Setter
        public Builder deviceOnline(String deviceOnline) {
            this.deviceOnline = Objects.requireNonNull(deviceOnline);
            return this;
        }
        @CustomType.Setter
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }
        @CustomType.Setter
        public Builder groupDesc(String groupDesc) {
            this.groupDesc = Objects.requireNonNull(groupDesc);
            return this;
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        @CustomType.Setter
        public Builder groupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder success(Boolean success) {
            this.success = Objects.requireNonNull(success);
            return this;
        }
        public GetDeviceGroupsGroup build() {
            final var _resultValue = new GetDeviceGroupsGroup();
            _resultValue.createTime = createTime;
            _resultValue.deviceActive = deviceActive;
            _resultValue.deviceCount = deviceCount;
            _resultValue.deviceOnline = deviceOnline;
            _resultValue.errorMessage = errorMessage;
            _resultValue.groupDesc = groupDesc;
            _resultValue.groupId = groupId;
            _resultValue.groupName = groupName;
            _resultValue.id = id;
            _resultValue.success = success;
            return _resultValue;
        }
    }
}
