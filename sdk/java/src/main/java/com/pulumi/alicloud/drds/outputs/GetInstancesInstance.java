// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.drds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstancesInstance {
    /**
     * @return Creation time of the instance.
     * 
     */
    private final Integer createTime;
    /**
     * @return The DRDS instance description.
     * 
     */
    private final String description;
    /**
     * @return The ID of the DRDS instance.
     * 
     */
    private final String id;
    /**
     * @return `Classic` for public classic network or `VPC` for private network.
     * 
     */
    private final String networkType;
    /**
     * @return Status of the instance.
     * 
     */
    private final String status;
    /**
     * @return The DRDS Instance type.
     * 
     */
    private final String type;
    /**
     * @return The DRDS Instance version.
     * 
     */
    private final Integer version;
    /**
     * @return Zone ID the instance belongs to.
     * 
     */
    private final String zoneId;

    @CustomType.Constructor
    private GetInstancesInstance(
        @CustomType.Parameter("createTime") Integer createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("networkType") String networkType,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") Integer version,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.createTime = createTime;
        this.description = description;
        this.id = id;
        this.networkType = networkType;
        this.status = status;
        this.type = type;
        this.version = version;
        this.zoneId = zoneId;
    }

    /**
     * @return Creation time of the instance.
     * 
     */
    public Integer createTime() {
        return this.createTime;
    }
    /**
     * @return The DRDS instance description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the DRDS instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return `Classic` for public classic network or `VPC` for private network.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return Status of the instance.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The DRDS Instance type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The DRDS Instance version.
     * 
     */
    public Integer version() {
        return this.version;
    }
    /**
     * @return Zone ID the instance belongs to.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer createTime;
        private String description;
        private String id;
        private String networkType;
        private String status;
        private String type;
        private Integer version;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.networkType = defaults.networkType;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder createTime(Integer createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }        public GetInstancesInstance build() {
            return new GetInstancesInstance(createTime, description, id, networkType, status, type, version, zoneId);
        }
    }
}
