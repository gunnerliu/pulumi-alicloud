// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.alicloud.ga.outputs.GetEndpointGroupIpAddressCidrBlocksEndpointGroupIpAddressCidrBlock;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEndpointGroupIpAddressCidrBlocksResult {
    /**
     * @return A list of Endpoint Group Ip Address Cidr Blocks. Each element contains the following attributes:
     * 
     */
    private List<GetEndpointGroupIpAddressCidrBlocksEndpointGroupIpAddressCidrBlock> endpointGroupIpAddressCidrBlocks;
    /**
     * @return The region ID of the endpoint group.
     * 
     */
    private String endpointGroupRegion;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String outputFile;

    private GetEndpointGroupIpAddressCidrBlocksResult() {}
    /**
     * @return A list of Endpoint Group Ip Address Cidr Blocks. Each element contains the following attributes:
     * 
     */
    public List<GetEndpointGroupIpAddressCidrBlocksEndpointGroupIpAddressCidrBlock> endpointGroupIpAddressCidrBlocks() {
        return this.endpointGroupIpAddressCidrBlocks;
    }
    /**
     * @return The region ID of the endpoint group.
     * 
     */
    public String endpointGroupRegion() {
        return this.endpointGroupRegion;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointGroupIpAddressCidrBlocksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetEndpointGroupIpAddressCidrBlocksEndpointGroupIpAddressCidrBlock> endpointGroupIpAddressCidrBlocks;
        private String endpointGroupRegion;
        private String id;
        private @Nullable String outputFile;
        public Builder() {}
        public Builder(GetEndpointGroupIpAddressCidrBlocksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointGroupIpAddressCidrBlocks = defaults.endpointGroupIpAddressCidrBlocks;
    	      this.endpointGroupRegion = defaults.endpointGroupRegion;
    	      this.id = defaults.id;
    	      this.outputFile = defaults.outputFile;
        }

        @CustomType.Setter
        public Builder endpointGroupIpAddressCidrBlocks(List<GetEndpointGroupIpAddressCidrBlocksEndpointGroupIpAddressCidrBlock> endpointGroupIpAddressCidrBlocks) {
            this.endpointGroupIpAddressCidrBlocks = Objects.requireNonNull(endpointGroupIpAddressCidrBlocks);
            return this;
        }
        public Builder endpointGroupIpAddressCidrBlocks(GetEndpointGroupIpAddressCidrBlocksEndpointGroupIpAddressCidrBlock... endpointGroupIpAddressCidrBlocks) {
            return endpointGroupIpAddressCidrBlocks(List.of(endpointGroupIpAddressCidrBlocks));
        }
        @CustomType.Setter
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = Objects.requireNonNull(endpointGroupRegion);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public GetEndpointGroupIpAddressCidrBlocksResult build() {
            final var _resultValue = new GetEndpointGroupIpAddressCidrBlocksResult();
            _resultValue.endpointGroupIpAddressCidrBlocks = endpointGroupIpAddressCidrBlocks;
            _resultValue.endpointGroupRegion = endpointGroupRegion;
            _resultValue.id = id;
            _resultValue.outputFile = outputFile;
            return _resultValue;
        }
    }
}
