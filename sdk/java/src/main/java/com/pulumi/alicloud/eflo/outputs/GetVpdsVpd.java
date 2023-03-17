// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eflo.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVpdsVpd {
    /**
     * @return CIDR network segment
     * 
     */
    private String cidr;
    /**
     * @return The creation time of the resource
     * 
     */
    private String createTime;
    /**
     * @return Modification time
     * 
     */
    private String gmtModified;
    /**
     * @return The id of the vpd.
     * 
     */
    private String id;
    /**
     * @return The Resource group id
     * 
     */
    private String resourceGroupId;
    /**
     * @return The Vpd status. Valid values: `Available`, `Not Available`, `Executing`, `Deleting`,
     * 
     */
    private String status;
    /**
     * @return The id of the vpd.
     * 
     */
    private String vpdId;
    /**
     * @return The Name of the VPD.
     * 
     */
    private String vpdName;

    private GetVpdsVpd() {}
    /**
     * @return CIDR network segment
     * 
     */
    public String cidr() {
        return this.cidr;
    }
    /**
     * @return The creation time of the resource
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Modification time
     * 
     */
    public String gmtModified() {
        return this.gmtModified;
    }
    /**
     * @return The id of the vpd.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Resource group id
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The Vpd status. Valid values: `Available`, `Not Available`, `Executing`, `Deleting`,
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The id of the vpd.
     * 
     */
    public String vpdId() {
        return this.vpdId;
    }
    /**
     * @return The Name of the VPD.
     * 
     */
    public String vpdName() {
        return this.vpdName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpdsVpd defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidr;
        private String createTime;
        private String gmtModified;
        private String id;
        private String resourceGroupId;
        private String status;
        private String vpdId;
        private String vpdName;
        public Builder() {}
        public Builder(GetVpdsVpd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.createTime = defaults.createTime;
    	      this.gmtModified = defaults.gmtModified;
    	      this.id = defaults.id;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.status = defaults.status;
    	      this.vpdId = defaults.vpdId;
    	      this.vpdName = defaults.vpdName;
        }

        @CustomType.Setter
        public Builder cidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = Objects.requireNonNull(gmtModified);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder vpdId(String vpdId) {
            this.vpdId = Objects.requireNonNull(vpdId);
            return this;
        }
        @CustomType.Setter
        public Builder vpdName(String vpdName) {
            this.vpdName = Objects.requireNonNull(vpdName);
            return this;
        }
        public GetVpdsVpd build() {
            final var o = new GetVpdsVpd();
            o.cidr = cidr;
            o.createTime = createTime;
            o.gmtModified = gmtModified;
            o.id = id;
            o.resourceGroupId = resourceGroupId;
            o.status = status;
            o.vpdId = vpdId;
            o.vpdName = vpdName;
            return o;
        }
    }
}
