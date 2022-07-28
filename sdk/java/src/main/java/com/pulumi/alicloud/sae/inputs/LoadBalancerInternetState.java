// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.inputs;

import com.pulumi.alicloud.sae.inputs.LoadBalancerInternetInternetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerInternetState extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerInternetState Empty = new LoadBalancerInternetState();

    /**
     * The target application ID that needs to be bound to the SLB.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return The target application ID that needs to be bound to the SLB.
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * Use designated public network SLBs that have been purchased to support non-shared instances.
     * 
     */
    @Import(name="internetIp")
    private @Nullable Output<String> internetIp;

    /**
     * @return Use designated public network SLBs that have been purchased to support non-shared instances.
     * 
     */
    public Optional<Output<String>> internetIp() {
        return Optional.ofNullable(this.internetIp);
    }

    /**
     * The internet SLB ID.
     * 
     */
    @Import(name="internetSlbId")
    private @Nullable Output<String> internetSlbId;

    /**
     * @return The internet SLB ID.
     * 
     */
    public Optional<Output<String>> internetSlbId() {
        return Optional.ofNullable(this.internetSlbId);
    }

    /**
     * The bound private network SLB. See the following `Block internet`.
     * 
     */
    @Import(name="internets")
    private @Nullable Output<List<LoadBalancerInternetInternetArgs>> internets;

    /**
     * @return The bound private network SLB. See the following `Block internet`.
     * 
     */
    public Optional<Output<List<LoadBalancerInternetInternetArgs>>> internets() {
        return Optional.ofNullable(this.internets);
    }

    private LoadBalancerInternetState() {}

    private LoadBalancerInternetState(LoadBalancerInternetState $) {
        this.appId = $.appId;
        this.internetIp = $.internetIp;
        this.internetSlbId = $.internetSlbId;
        this.internets = $.internets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerInternetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerInternetState $;

        public Builder() {
            $ = new LoadBalancerInternetState();
        }

        public Builder(LoadBalancerInternetState defaults) {
            $ = new LoadBalancerInternetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The target application ID that needs to be bound to the SLB.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The target application ID that needs to be bound to the SLB.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param internetIp Use designated public network SLBs that have been purchased to support non-shared instances.
         * 
         * @return builder
         * 
         */
        public Builder internetIp(@Nullable Output<String> internetIp) {
            $.internetIp = internetIp;
            return this;
        }

        /**
         * @param internetIp Use designated public network SLBs that have been purchased to support non-shared instances.
         * 
         * @return builder
         * 
         */
        public Builder internetIp(String internetIp) {
            return internetIp(Output.of(internetIp));
        }

        /**
         * @param internetSlbId The internet SLB ID.
         * 
         * @return builder
         * 
         */
        public Builder internetSlbId(@Nullable Output<String> internetSlbId) {
            $.internetSlbId = internetSlbId;
            return this;
        }

        /**
         * @param internetSlbId The internet SLB ID.
         * 
         * @return builder
         * 
         */
        public Builder internetSlbId(String internetSlbId) {
            return internetSlbId(Output.of(internetSlbId));
        }

        /**
         * @param internets The bound private network SLB. See the following `Block internet`.
         * 
         * @return builder
         * 
         */
        public Builder internets(@Nullable Output<List<LoadBalancerInternetInternetArgs>> internets) {
            $.internets = internets;
            return this;
        }

        /**
         * @param internets The bound private network SLB. See the following `Block internet`.
         * 
         * @return builder
         * 
         */
        public Builder internets(List<LoadBalancerInternetInternetArgs> internets) {
            return internets(Output.of(internets));
        }

        /**
         * @param internets The bound private network SLB. See the following `Block internet`.
         * 
         * @return builder
         * 
         */
        public Builder internets(LoadBalancerInternetInternetArgs... internets) {
            return internets(List.of(internets));
        }

        public LoadBalancerInternetState build() {
            return $;
        }
    }

}
