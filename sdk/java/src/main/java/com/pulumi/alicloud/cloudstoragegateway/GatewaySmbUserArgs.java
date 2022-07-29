// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudstoragegateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GatewaySmbUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaySmbUserArgs Empty = new GatewaySmbUserArgs();

    /**
     * The Gateway ID of the Gateway SMB User.
     * 
     */
    @Import(name="gatewayId", required=true)
    private Output<String> gatewayId;

    /**
     * @return The Gateway ID of the Gateway SMB User.
     * 
     */
    public Output<String> gatewayId() {
        return this.gatewayId;
    }

    /**
     * The password of the Gateway SMB User.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The password of the Gateway SMB User.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The username of the Gateway SMB User.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The username of the Gateway SMB User.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private GatewaySmbUserArgs() {}

    private GatewaySmbUserArgs(GatewaySmbUserArgs $) {
        this.gatewayId = $.gatewayId;
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaySmbUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaySmbUserArgs $;

        public Builder() {
            $ = new GatewaySmbUserArgs();
        }

        public Builder(GatewaySmbUserArgs defaults) {
            $ = new GatewaySmbUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayId The Gateway ID of the Gateway SMB User.
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(Output<String> gatewayId) {
            $.gatewayId = gatewayId;
            return this;
        }

        /**
         * @param gatewayId The Gateway ID of the Gateway SMB User.
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(String gatewayId) {
            return gatewayId(Output.of(gatewayId));
        }

        /**
         * @param password The password of the Gateway SMB User.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of the Gateway SMB User.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username The username of the Gateway SMB User.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username of the Gateway SMB User.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GatewaySmbUserArgs build() {
            $.gatewayId = Objects.requireNonNull($.gatewayId, "expected parameter 'gatewayId' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
