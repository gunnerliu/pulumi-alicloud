// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.alicloud.fc.outputs.ServiceNasConfigMountPoint;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServiceNasConfig {
    /**
     * @return The group id of your NAS file system.
     * 
     */
    private final Integer groupId;
    /**
     * @return Config the NAS mount points, including following attributes:
     * 
     */
    private final List<ServiceNasConfigMountPoint> mountPoints;
    /**
     * @return The user id of your NAS file system.
     * 
     */
    private final Integer userId;

    @CustomType.Constructor
    private ServiceNasConfig(
        @CustomType.Parameter("groupId") Integer groupId,
        @CustomType.Parameter("mountPoints") List<ServiceNasConfigMountPoint> mountPoints,
        @CustomType.Parameter("userId") Integer userId) {
        this.groupId = groupId;
        this.mountPoints = mountPoints;
        this.userId = userId;
    }

    /**
     * @return The group id of your NAS file system.
     * 
     */
    public Integer groupId() {
        return this.groupId;
    }
    /**
     * @return Config the NAS mount points, including following attributes:
     * 
     */
    public List<ServiceNasConfigMountPoint> mountPoints() {
        return this.mountPoints;
    }
    /**
     * @return The user id of your NAS file system.
     * 
     */
    public Integer userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceNasConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer groupId;
        private List<ServiceNasConfigMountPoint> mountPoints;
        private Integer userId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceNasConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.mountPoints = defaults.mountPoints;
    	      this.userId = defaults.userId;
        }

        public Builder groupId(Integer groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder mountPoints(List<ServiceNasConfigMountPoint> mountPoints) {
            this.mountPoints = Objects.requireNonNull(mountPoints);
            return this;
        }
        public Builder mountPoints(ServiceNasConfigMountPoint... mountPoints) {
            return mountPoints(List.of(mountPoints));
        }
        public Builder userId(Integer userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public ServiceNasConfig build() {
            return new ServiceNasConfig(groupId, mountPoints, userId);
        }
    }
}
