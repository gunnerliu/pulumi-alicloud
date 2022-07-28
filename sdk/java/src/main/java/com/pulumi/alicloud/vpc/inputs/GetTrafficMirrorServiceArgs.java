// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTrafficMirrorServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTrafficMirrorServiceArgs Empty = new GetTrafficMirrorServiceArgs();

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

    private GetTrafficMirrorServiceArgs() {}

    private GetTrafficMirrorServiceArgs(GetTrafficMirrorServiceArgs $) {
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTrafficMirrorServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTrafficMirrorServiceArgs $;

        public Builder() {
            $ = new GetTrafficMirrorServiceArgs();
        }

        public Builder(GetTrafficMirrorServiceArgs defaults) {
            $ = new GetTrafficMirrorServiceArgs(Objects.requireNonNull(defaults));
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

        public GetTrafficMirrorServiceArgs build() {
            return $;
        }
    }

}
