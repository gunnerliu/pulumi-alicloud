// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.alicloud.cr.outputs.ChainChainConfigNodeNodeConfigDenyPolicy;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ChainChainConfigNodeNodeConfig {
    /**
     * @return Blocking rules for scanning nodes in delivery chain nodes. See `deny_policy` below. **Note:** When `node_name` is `VULNERABILITY_SCANNING`, the parameters in `deny_policy` need to be filled in.
     * 
     */
    private @Nullable List<ChainChainConfigNodeNodeConfigDenyPolicy> denyPolicies;

    private ChainChainConfigNodeNodeConfig() {}
    /**
     * @return Blocking rules for scanning nodes in delivery chain nodes. See `deny_policy` below. **Note:** When `node_name` is `VULNERABILITY_SCANNING`, the parameters in `deny_policy` need to be filled in.
     * 
     */
    public List<ChainChainConfigNodeNodeConfigDenyPolicy> denyPolicies() {
        return this.denyPolicies == null ? List.of() : this.denyPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChainChainConfigNodeNodeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ChainChainConfigNodeNodeConfigDenyPolicy> denyPolicies;
        public Builder() {}
        public Builder(ChainChainConfigNodeNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.denyPolicies = defaults.denyPolicies;
        }

        @CustomType.Setter
        public Builder denyPolicies(@Nullable List<ChainChainConfigNodeNodeConfigDenyPolicy> denyPolicies) {
            this.denyPolicies = denyPolicies;
            return this;
        }
        public Builder denyPolicies(ChainChainConfigNodeNodeConfigDenyPolicy... denyPolicies) {
            return denyPolicies(List.of(denyPolicies));
        }
        public ChainChainConfigNodeNodeConfig build() {
            final var _resultValue = new ChainChainConfigNodeNodeConfig();
            _resultValue.denyPolicies = denyPolicies;
            return _resultValue;
        }
    }
}
