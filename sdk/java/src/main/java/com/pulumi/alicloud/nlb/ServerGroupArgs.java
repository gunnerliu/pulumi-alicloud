// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nlb;

import com.pulumi.alicloud.nlb.inputs.ServerGroupHealthCheckArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerGroupArgs Empty = new ServerGroupArgs();

    /**
     * The protocol version. Valid values: `Ipv4` (default), `DualStack`.
     * 
     */
    @Import(name="addressIpVersion")
    private @Nullable Output<String> addressIpVersion;

    /**
     * @return The protocol version. Valid values: `Ipv4` (default), `DualStack`.
     * 
     */
    public Optional<Output<String>> addressIpVersion() {
        return Optional.ofNullable(this.addressIpVersion);
    }

    /**
     * Specifies whether to enable connection draining.
     * 
     */
    @Import(name="connectionDrain")
    private @Nullable Output<Boolean> connectionDrain;

    /**
     * @return Specifies whether to enable connection draining.
     * 
     */
    public Optional<Output<Boolean>> connectionDrain() {
        return Optional.ofNullable(this.connectionDrain);
    }

    /**
     * The timeout period of connection draining. Unit: seconds. Valid values: 10 to 900.
     * 
     */
    @Import(name="connectionDrainTimeout")
    private @Nullable Output<Integer> connectionDrainTimeout;

    /**
     * @return The timeout period of connection draining. Unit: seconds. Valid values: 10 to 900.
     * 
     */
    public Optional<Output<Integer>> connectionDrainTimeout() {
        return Optional.ofNullable(this.connectionDrainTimeout);
    }

    /**
     * HealthCheck. See the following `Block health_check`.
     * 
     */
    @Import(name="healthCheck", required=true)
    private Output<ServerGroupHealthCheckArgs> healthCheck;

    /**
     * @return HealthCheck. See the following `Block health_check`.
     * 
     */
    public Output<ServerGroupHealthCheckArgs> healthCheck() {
        return this.healthCheck;
    }

    /**
     * Indicates whether client address retention is enabled.
     * 
     */
    @Import(name="preserveClientIpEnabled")
    private @Nullable Output<Boolean> preserveClientIpEnabled;

    /**
     * @return Indicates whether client address retention is enabled.
     * 
     */
    public Optional<Output<Boolean>> preserveClientIpEnabled() {
        return Optional.ofNullable(this.preserveClientIpEnabled);
    }

    /**
     * The backend protocol. Valid values: `TCP` (default), `UDP`, and `TCPSSL`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The backend protocol. Valid values: `TCP` (default), `UDP`, and `TCPSSL`.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The ID of the resource group to which the security group belongs.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group to which the security group belongs.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The routing algorithm. Valid values:
     * 
     */
    @Import(name="scheduler")
    private @Nullable Output<String> scheduler;

    /**
     * @return The routing algorithm. Valid values:
     * 
     */
    public Optional<Output<String>> scheduler() {
        return Optional.ofNullable(this.scheduler);
    }

    /**
     * The name of the server group. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
     * 
     */
    @Import(name="serverGroupName", required=true)
    private Output<String> serverGroupName;

    /**
     * @return The name of the server group. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
     * 
     */
    public Output<String> serverGroupName() {
        return this.serverGroupName;
    }

    /**
     * The type of the server group. Valid values:
     * 
     */
    @Import(name="serverGroupType")
    private @Nullable Output<String> serverGroupType;

    /**
     * @return The type of the server group. Valid values:
     * 
     */
    public Optional<Output<String>> serverGroupType() {
        return Optional.ofNullable(this.serverGroupType);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The id of the vpc.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The id of the vpc.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    private ServerGroupArgs() {}

    private ServerGroupArgs(ServerGroupArgs $) {
        this.addressIpVersion = $.addressIpVersion;
        this.connectionDrain = $.connectionDrain;
        this.connectionDrainTimeout = $.connectionDrainTimeout;
        this.healthCheck = $.healthCheck;
        this.preserveClientIpEnabled = $.preserveClientIpEnabled;
        this.protocol = $.protocol;
        this.resourceGroupId = $.resourceGroupId;
        this.scheduler = $.scheduler;
        this.serverGroupName = $.serverGroupName;
        this.serverGroupType = $.serverGroupType;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerGroupArgs $;

        public Builder() {
            $ = new ServerGroupArgs();
        }

        public Builder(ServerGroupArgs defaults) {
            $ = new ServerGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressIpVersion The protocol version. Valid values: `Ipv4` (default), `DualStack`.
         * 
         * @return builder
         * 
         */
        public Builder addressIpVersion(@Nullable Output<String> addressIpVersion) {
            $.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * @param addressIpVersion The protocol version. Valid values: `Ipv4` (default), `DualStack`.
         * 
         * @return builder
         * 
         */
        public Builder addressIpVersion(String addressIpVersion) {
            return addressIpVersion(Output.of(addressIpVersion));
        }

        /**
         * @param connectionDrain Specifies whether to enable connection draining.
         * 
         * @return builder
         * 
         */
        public Builder connectionDrain(@Nullable Output<Boolean> connectionDrain) {
            $.connectionDrain = connectionDrain;
            return this;
        }

        /**
         * @param connectionDrain Specifies whether to enable connection draining.
         * 
         * @return builder
         * 
         */
        public Builder connectionDrain(Boolean connectionDrain) {
            return connectionDrain(Output.of(connectionDrain));
        }

        /**
         * @param connectionDrainTimeout The timeout period of connection draining. Unit: seconds. Valid values: 10 to 900.
         * 
         * @return builder
         * 
         */
        public Builder connectionDrainTimeout(@Nullable Output<Integer> connectionDrainTimeout) {
            $.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }

        /**
         * @param connectionDrainTimeout The timeout period of connection draining. Unit: seconds. Valid values: 10 to 900.
         * 
         * @return builder
         * 
         */
        public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
            return connectionDrainTimeout(Output.of(connectionDrainTimeout));
        }

        /**
         * @param healthCheck HealthCheck. See the following `Block health_check`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheck(Output<ServerGroupHealthCheckArgs> healthCheck) {
            $.healthCheck = healthCheck;
            return this;
        }

        /**
         * @param healthCheck HealthCheck. See the following `Block health_check`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheck(ServerGroupHealthCheckArgs healthCheck) {
            return healthCheck(Output.of(healthCheck));
        }

        /**
         * @param preserveClientIpEnabled Indicates whether client address retention is enabled.
         * 
         * @return builder
         * 
         */
        public Builder preserveClientIpEnabled(@Nullable Output<Boolean> preserveClientIpEnabled) {
            $.preserveClientIpEnabled = preserveClientIpEnabled;
            return this;
        }

        /**
         * @param preserveClientIpEnabled Indicates whether client address retention is enabled.
         * 
         * @return builder
         * 
         */
        public Builder preserveClientIpEnabled(Boolean preserveClientIpEnabled) {
            return preserveClientIpEnabled(Output.of(preserveClientIpEnabled));
        }

        /**
         * @param protocol The backend protocol. Valid values: `TCP` (default), `UDP`, and `TCPSSL`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The backend protocol. Valid values: `TCP` (default), `UDP`, and `TCPSSL`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param resourceGroupId The ID of the resource group to which the security group belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group to which the security group belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param scheduler The routing algorithm. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder scheduler(@Nullable Output<String> scheduler) {
            $.scheduler = scheduler;
            return this;
        }

        /**
         * @param scheduler The routing algorithm. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder scheduler(String scheduler) {
            return scheduler(Output.of(scheduler));
        }

        /**
         * @param serverGroupName The name of the server group. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupName(Output<String> serverGroupName) {
            $.serverGroupName = serverGroupName;
            return this;
        }

        /**
         * @param serverGroupName The name of the server group. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupName(String serverGroupName) {
            return serverGroupName(Output.of(serverGroupName));
        }

        /**
         * @param serverGroupType The type of the server group. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder serverGroupType(@Nullable Output<String> serverGroupType) {
            $.serverGroupType = serverGroupType;
            return this;
        }

        /**
         * @param serverGroupType The type of the server group. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder serverGroupType(String serverGroupType) {
            return serverGroupType(Output.of(serverGroupType));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcId The id of the vpc.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The id of the vpc.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public ServerGroupArgs build() {
            $.healthCheck = Objects.requireNonNull($.healthCheck, "expected parameter 'healthCheck' to be non-null");
            $.serverGroupName = Objects.requireNonNull($.serverGroupName, "expected parameter 'serverGroupName' to be non-null");
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}
