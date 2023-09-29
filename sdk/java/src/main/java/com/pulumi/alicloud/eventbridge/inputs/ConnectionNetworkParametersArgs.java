// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionNetworkParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionNetworkParametersArgs Empty = new ConnectionNetworkParametersArgs();

    /**
     * The network type. Valid values: `PublicNetwork`, `PrivateNetwork`. **NOTE:** If you set `network_type` to `PrivateNetwork`, you must configure `vpc_id`, `vswitche_id`, and `security_group_id`.
     * 
     */
    @Import(name="networkType", required=true)
    private Output<String> networkType;

    /**
     * @return The network type. Valid values: `PublicNetwork`, `PrivateNetwork`. **NOTE:** If you set `network_type` to `PrivateNetwork`, you must configure `vpc_id`, `vswitche_id`, and `security_group_id`.
     * 
     */
    public Output<String> networkType() {
        return this.networkType;
    }

    /**
     * The ID of the security group.
     * 
     */
    @Import(name="securityGroupId")
    private @Nullable Output<String> securityGroupId;

    /**
     * @return The ID of the security group.
     * 
     */
    public Optional<Output<String>> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }

    /**
     * The ID of the VPC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the VPC.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * The ID of the VSwitch.
     * 
     */
    @Import(name="vswitcheId")
    private @Nullable Output<String> vswitcheId;

    /**
     * @return The ID of the VSwitch.
     * 
     */
    public Optional<Output<String>> vswitcheId() {
        return Optional.ofNullable(this.vswitcheId);
    }

    private ConnectionNetworkParametersArgs() {}

    private ConnectionNetworkParametersArgs(ConnectionNetworkParametersArgs $) {
        this.networkType = $.networkType;
        this.securityGroupId = $.securityGroupId;
        this.vpcId = $.vpcId;
        this.vswitcheId = $.vswitcheId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionNetworkParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionNetworkParametersArgs $;

        public Builder() {
            $ = new ConnectionNetworkParametersArgs();
        }

        public Builder(ConnectionNetworkParametersArgs defaults) {
            $ = new ConnectionNetworkParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkType The network type. Valid values: `PublicNetwork`, `PrivateNetwork`. **NOTE:** If you set `network_type` to `PrivateNetwork`, you must configure `vpc_id`, `vswitche_id`, and `security_group_id`.
         * 
         * @return builder
         * 
         */
        public Builder networkType(Output<String> networkType) {
            $.networkType = networkType;
            return this;
        }

        /**
         * @param networkType The network type. Valid values: `PublicNetwork`, `PrivateNetwork`. **NOTE:** If you set `network_type` to `PrivateNetwork`, you must configure `vpc_id`, `vswitche_id`, and `security_group_id`.
         * 
         * @return builder
         * 
         */
        public Builder networkType(String networkType) {
            return networkType(Output.of(networkType));
        }

        /**
         * @param securityGroupId The ID of the security group.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(@Nullable Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * @param securityGroupId The ID of the security group.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        /**
         * @param vpcId The ID of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vswitcheId The ID of the VSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitcheId(@Nullable Output<String> vswitcheId) {
            $.vswitcheId = vswitcheId;
            return this;
        }

        /**
         * @param vswitcheId The ID of the VSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitcheId(String vswitcheId) {
            return vswitcheId(Output.of(vswitcheId));
        }

        public ConnectionNetworkParametersArgs build() {
            $.networkType = Objects.requireNonNull($.networkType, "expected parameter 'networkType' to be non-null");
            return $;
        }
    }

}