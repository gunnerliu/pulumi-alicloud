// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInterfaceAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceAttachmentState Empty = new NetworkInterfaceAttachmentState();

    /**
     * The instance ID to attach.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The instance ID to attach.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The ENI ID to attach.
     * 
     */
    @Import(name="networkInterfaceId")
    private @Nullable Output<String> networkInterfaceId;

    /**
     * @return The ENI ID to attach.
     * 
     */
    public Optional<Output<String>> networkInterfaceId() {
        return Optional.ofNullable(this.networkInterfaceId);
    }

    @Import(name="trunkNetworkInstanceId")
    private @Nullable Output<String> trunkNetworkInstanceId;

    public Optional<Output<String>> trunkNetworkInstanceId() {
        return Optional.ofNullable(this.trunkNetworkInstanceId);
    }

    @Import(name="waitForNetworkConfigurationReady")
    private @Nullable Output<Boolean> waitForNetworkConfigurationReady;

    public Optional<Output<Boolean>> waitForNetworkConfigurationReady() {
        return Optional.ofNullable(this.waitForNetworkConfigurationReady);
    }

    private NetworkInterfaceAttachmentState() {}

    private NetworkInterfaceAttachmentState(NetworkInterfaceAttachmentState $) {
        this.instanceId = $.instanceId;
        this.networkInterfaceId = $.networkInterfaceId;
        this.trunkNetworkInstanceId = $.trunkNetworkInstanceId;
        this.waitForNetworkConfigurationReady = $.waitForNetworkConfigurationReady;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInterfaceAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInterfaceAttachmentState $;

        public Builder() {
            $ = new NetworkInterfaceAttachmentState();
        }

        public Builder(NetworkInterfaceAttachmentState defaults) {
            $ = new NetworkInterfaceAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId The instance ID to attach.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The instance ID to attach.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param networkInterfaceId The ENI ID to attach.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceId(@Nullable Output<String> networkInterfaceId) {
            $.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * @param networkInterfaceId The ENI ID to attach.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            return networkInterfaceId(Output.of(networkInterfaceId));
        }

        public Builder trunkNetworkInstanceId(@Nullable Output<String> trunkNetworkInstanceId) {
            $.trunkNetworkInstanceId = trunkNetworkInstanceId;
            return this;
        }

        public Builder trunkNetworkInstanceId(String trunkNetworkInstanceId) {
            return trunkNetworkInstanceId(Output.of(trunkNetworkInstanceId));
        }

        public Builder waitForNetworkConfigurationReady(@Nullable Output<Boolean> waitForNetworkConfigurationReady) {
            $.waitForNetworkConfigurationReady = waitForNetworkConfigurationReady;
            return this;
        }

        public Builder waitForNetworkConfigurationReady(Boolean waitForNetworkConfigurationReady) {
            return waitForNetworkConfigurationReady(Output.of(waitForNetworkConfigurationReady));
        }

        public NetworkInterfaceAttachmentState build() {
            return $;
        }
    }

}
