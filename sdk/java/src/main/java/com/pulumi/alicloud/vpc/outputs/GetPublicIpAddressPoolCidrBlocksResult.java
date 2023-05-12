// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetPublicIpAddressPoolCidrBlocksBlock;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPublicIpAddressPoolCidrBlocksResult {
    /**
     * @return A list of Vpc Public Ip Address Pool Cidr Blocks. Each element contains the following attributes:
     * 
     */
    private final List<GetPublicIpAddressPoolCidrBlocksBlock> blocks;
    /**
     * @return The CIDR block.
     * 
     */
    private final @Nullable String cidrBlock;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String outputFile;
    /**
     * @return The ID of the Vpc Public IP address pool.
     * 
     */
    private final String publicIpAddressPoolId;
    /**
     * @return The status of the CIDR block in the Vpc Public IP address pool.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private GetPublicIpAddressPoolCidrBlocksResult(
        @CustomType.Parameter("blocks") List<GetPublicIpAddressPoolCidrBlocksBlock> blocks,
        @CustomType.Parameter("cidrBlock") @Nullable String cidrBlock,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("publicIpAddressPoolId") String publicIpAddressPoolId,
        @CustomType.Parameter("status") @Nullable String status) {
        this.blocks = blocks;
        this.cidrBlock = cidrBlock;
        this.id = id;
        this.ids = ids;
        this.outputFile = outputFile;
        this.publicIpAddressPoolId = publicIpAddressPoolId;
        this.status = status;
    }

    /**
     * @return A list of Vpc Public Ip Address Pool Cidr Blocks. Each element contains the following attributes:
     * 
     */
    public List<GetPublicIpAddressPoolCidrBlocksBlock> blocks() {
        return this.blocks;
    }
    /**
     * @return The CIDR block.
     * 
     */
    public Optional<String> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
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
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The ID of the Vpc Public IP address pool.
     * 
     */
    public String publicIpAddressPoolId() {
        return this.publicIpAddressPoolId;
    }
    /**
     * @return The status of the CIDR block in the Vpc Public IP address pool.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicIpAddressPoolCidrBlocksResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetPublicIpAddressPoolCidrBlocksBlock> blocks;
        private @Nullable String cidrBlock;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private String publicIpAddressPoolId;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicIpAddressPoolCidrBlocksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blocks = defaults.blocks;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.publicIpAddressPoolId = defaults.publicIpAddressPoolId;
    	      this.status = defaults.status;
        }

        public Builder blocks(List<GetPublicIpAddressPoolCidrBlocksBlock> blocks) {
            this.blocks = Objects.requireNonNull(blocks);
            return this;
        }
        public Builder blocks(GetPublicIpAddressPoolCidrBlocksBlock... blocks) {
            return blocks(List.of(blocks));
        }
        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
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
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
            this.publicIpAddressPoolId = Objects.requireNonNull(publicIpAddressPoolId);
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetPublicIpAddressPoolCidrBlocksResult build() {
            return new GetPublicIpAddressPoolCidrBlocksResult(blocks, cidrBlock, id, ids, outputFile, publicIpAddressPoolId, status);
        }
    }
}
