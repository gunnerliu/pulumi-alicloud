// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTransitRouterServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitRouterServiceArgs Empty = new GetTransitRouterServiceArgs();

    /**
     * Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<String> enable;

    /**
     * @return Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
     * 
     */
    public Optional<Output<String>> enable() {
        return Optional.ofNullable(this.enable);
    }

    private GetTransitRouterServiceArgs() {}

    private GetTransitRouterServiceArgs(GetTransitRouterServiceArgs $) {
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitRouterServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitRouterServiceArgs $;

        public Builder() {
            $ = new GetTransitRouterServiceArgs();
        }

        public Builder(GetTransitRouterServiceArgs defaults) {
            $ = new GetTransitRouterServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<String> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
         * 
         * @return builder
         * 
         */
        public Builder enable(String enable) {
            return enable(Output.of(enable));
        }

        public GetTransitRouterServiceArgs build() {
            return $;
        }
    }

}