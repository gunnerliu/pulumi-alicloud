// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.alicloud.cr.outputs.GetChainsChainChainConfigRouterFrom;
import com.pulumi.alicloud.cr.outputs.GetChainsChainChainConfigRouterTo;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetChainsChainChainConfigRouter {
    /**
     * @return Source node.
     * 
     */
    private List<GetChainsChainChainConfigRouterFrom> froms;
    /**
     * @return Destination node.
     * 
     */
    private List<GetChainsChainChainConfigRouterTo> tos;

    private GetChainsChainChainConfigRouter() {}
    /**
     * @return Source node.
     * 
     */
    public List<GetChainsChainChainConfigRouterFrom> froms() {
        return this.froms;
    }
    /**
     * @return Destination node.
     * 
     */
    public List<GetChainsChainChainConfigRouterTo> tos() {
        return this.tos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChainsChainChainConfigRouter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetChainsChainChainConfigRouterFrom> froms;
        private List<GetChainsChainChainConfigRouterTo> tos;
        public Builder() {}
        public Builder(GetChainsChainChainConfigRouter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.froms = defaults.froms;
    	      this.tos = defaults.tos;
        }

        @CustomType.Setter
        public Builder froms(List<GetChainsChainChainConfigRouterFrom> froms) {
            this.froms = Objects.requireNonNull(froms);
            return this;
        }
        public Builder froms(GetChainsChainChainConfigRouterFrom... froms) {
            return froms(List.of(froms));
        }
        @CustomType.Setter
        public Builder tos(List<GetChainsChainChainConfigRouterTo> tos) {
            this.tos = Objects.requireNonNull(tos);
            return this;
        }
        public Builder tos(GetChainsChainChainConfigRouterTo... tos) {
            return tos(List.of(tos));
        }
        public GetChainsChainChainConfigRouter build() {
            final var _resultValue = new GetChainsChainChainConfigRouter();
            _resultValue.froms = froms;
            _resultValue.tos = tos;
            return _resultValue;
        }
    }
}
