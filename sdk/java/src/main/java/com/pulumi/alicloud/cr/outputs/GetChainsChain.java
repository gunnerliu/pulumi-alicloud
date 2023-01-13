// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.alicloud.cr.outputs.GetChainsChainChainConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetChainsChain {
    /**
     * @return The configuration of delivery chain.
     * 
     */
    private List<GetChainsChainChainConfig> chainConfigs;
    /**
     * @return The ID of delivery chain.
     * 
     */
    private String chainId;
    /**
     * @return The name of delivery chain.
     * 
     */
    private String chainName;
    /**
     * @return The creation time of delivery chain.
     * 
     */
    private String createTime;
    /**
     * @return The description of delivery chain.
     * 
     */
    private String description;
    /**
     * @return The resource ID of the delivery chain. The value formats as `&lt;instance_id&gt;:&lt;chain_id&gt;`.
     * 
     */
    private String id;
    /**
     * @return The ID of CR Enterprise Edition instance.
     * 
     */
    private String instanceId;
    /**
     * @return The modification time of delivery chain description.
     * 
     */
    private String modifiedTime;
    /**
     * @return Delivery chain scope ID.
     * 
     */
    private String scopeId;
    /**
     * @return Delivery chain scope type.
     * 
     */
    private String scopeType;

    private GetChainsChain() {}
    /**
     * @return The configuration of delivery chain.
     * 
     */
    public List<GetChainsChainChainConfig> chainConfigs() {
        return this.chainConfigs;
    }
    /**
     * @return The ID of delivery chain.
     * 
     */
    public String chainId() {
        return this.chainId;
    }
    /**
     * @return The name of delivery chain.
     * 
     */
    public String chainName() {
        return this.chainName;
    }
    /**
     * @return The creation time of delivery chain.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of delivery chain.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The resource ID of the delivery chain. The value formats as `&lt;instance_id&gt;:&lt;chain_id&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of CR Enterprise Edition instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The modification time of delivery chain description.
     * 
     */
    public String modifiedTime() {
        return this.modifiedTime;
    }
    /**
     * @return Delivery chain scope ID.
     * 
     */
    public String scopeId() {
        return this.scopeId;
    }
    /**
     * @return Delivery chain scope type.
     * 
     */
    public String scopeType() {
        return this.scopeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChainsChain defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetChainsChainChainConfig> chainConfigs;
        private String chainId;
        private String chainName;
        private String createTime;
        private String description;
        private String id;
        private String instanceId;
        private String modifiedTime;
        private String scopeId;
        private String scopeType;
        public Builder() {}
        public Builder(GetChainsChain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chainConfigs = defaults.chainConfigs;
    	      this.chainId = defaults.chainId;
    	      this.chainName = defaults.chainName;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.scopeId = defaults.scopeId;
    	      this.scopeType = defaults.scopeType;
        }

        @CustomType.Setter
        public Builder chainConfigs(List<GetChainsChainChainConfig> chainConfigs) {
            this.chainConfigs = Objects.requireNonNull(chainConfigs);
            return this;
        }
        public Builder chainConfigs(GetChainsChainChainConfig... chainConfigs) {
            return chainConfigs(List.of(chainConfigs));
        }
        @CustomType.Setter
        public Builder chainId(String chainId) {
            this.chainId = Objects.requireNonNull(chainId);
            return this;
        }
        @CustomType.Setter
        public Builder chainName(String chainName) {
            this.chainName = Objects.requireNonNull(chainName);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
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
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = Objects.requireNonNull(modifiedTime);
            return this;
        }
        @CustomType.Setter
        public Builder scopeId(String scopeId) {
            this.scopeId = Objects.requireNonNull(scopeId);
            return this;
        }
        @CustomType.Setter
        public Builder scopeType(String scopeType) {
            this.scopeType = Objects.requireNonNull(scopeType);
            return this;
        }
        public GetChainsChain build() {
            final var o = new GetChainsChain();
            o.chainConfigs = chainConfigs;
            o.chainId = chainId;
            o.chainName = chainName;
            o.createTime = createTime;
            o.description = description;
            o.id = id;
            o.instanceId = instanceId;
            o.modifiedTime = modifiedTime;
            o.scopeId = scopeId;
            o.scopeType = scopeType;
            return o;
        }
    }
}
