// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eipanycast.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAnycastEipAddressesAddressAnycastEipBindInfoList {
    /**
     * @return The bound cloud resource instance ID.
     * 
     */
    private String bindInstanceId;
    /**
     * @return The region ID of the bound cloud resource instance.
     * 
     */
    private String bindInstanceRegionId;
    /**
     * @return Bind the cloud resource instance type.
     * 
     */
    private String bindInstanceType;
    /**
     * @return Binding time.
     * 
     */
    private String bindTime;

    private GetAnycastEipAddressesAddressAnycastEipBindInfoList() {}
    /**
     * @return The bound cloud resource instance ID.
     * 
     */
    public String bindInstanceId() {
        return this.bindInstanceId;
    }
    /**
     * @return The region ID of the bound cloud resource instance.
     * 
     */
    public String bindInstanceRegionId() {
        return this.bindInstanceRegionId;
    }
    /**
     * @return Bind the cloud resource instance type.
     * 
     */
    public String bindInstanceType() {
        return this.bindInstanceType;
    }
    /**
     * @return Binding time.
     * 
     */
    public String bindTime() {
        return this.bindTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnycastEipAddressesAddressAnycastEipBindInfoList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bindInstanceId;
        private String bindInstanceRegionId;
        private String bindInstanceType;
        private String bindTime;
        public Builder() {}
        public Builder(GetAnycastEipAddressesAddressAnycastEipBindInfoList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindInstanceId = defaults.bindInstanceId;
    	      this.bindInstanceRegionId = defaults.bindInstanceRegionId;
    	      this.bindInstanceType = defaults.bindInstanceType;
    	      this.bindTime = defaults.bindTime;
        }

        @CustomType.Setter
        public Builder bindInstanceId(String bindInstanceId) {
            this.bindInstanceId = Objects.requireNonNull(bindInstanceId);
            return this;
        }
        @CustomType.Setter
        public Builder bindInstanceRegionId(String bindInstanceRegionId) {
            this.bindInstanceRegionId = Objects.requireNonNull(bindInstanceRegionId);
            return this;
        }
        @CustomType.Setter
        public Builder bindInstanceType(String bindInstanceType) {
            this.bindInstanceType = Objects.requireNonNull(bindInstanceType);
            return this;
        }
        @CustomType.Setter
        public Builder bindTime(String bindTime) {
            this.bindTime = Objects.requireNonNull(bindTime);
            return this;
        }
        public GetAnycastEipAddressesAddressAnycastEipBindInfoList build() {
            final var _resultValue = new GetAnycastEipAddressesAddressAnycastEipBindInfoList();
            _resultValue.bindInstanceId = bindInstanceId;
            _resultValue.bindInstanceRegionId = bindInstanceRegionId;
            _resultValue.bindInstanceType = bindInstanceType;
            _resultValue.bindTime = bindTime;
            return _resultValue;
        }
    }
}
