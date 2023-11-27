// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudconnect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworksNetwork {
    /**
     * @return CidrBlock of the CCN instance.
     * 
     */
    private String cidrBlock;
    private String description;
    /**
     * @return ID of the CCN instance.
     * 
     */
    private String id;
    /**
     * @return IsDefault of the CCN instance.
     * 
     */
    private Boolean isDefault;
    /**
     * @return Name of the CCN instance.
     * 
     */
    private String name;

    private GetNetworksNetwork() {}
    /**
     * @return CidrBlock of the CCN instance.
     * 
     */
    public String cidrBlock() {
        return this.cidrBlock;
    }
    public String description() {
        return this.description;
    }
    /**
     * @return ID of the CCN instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return IsDefault of the CCN instance.
     * 
     */
    public Boolean isDefault() {
        return this.isDefault;
    }
    /**
     * @return Name of the CCN instance.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworksNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidrBlock;
        private String description;
        private String id;
        private Boolean isDefault;
        private String name;
        public Builder() {}
        public Builder(GetNetworksNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.isDefault = defaults.isDefault;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = Objects.requireNonNull(isDefault);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetNetworksNetwork build() {
            final var _resultValue = new GetNetworksNetwork();
            _resultValue.cidrBlock = cidrBlock;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.isDefault = isDefault;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
