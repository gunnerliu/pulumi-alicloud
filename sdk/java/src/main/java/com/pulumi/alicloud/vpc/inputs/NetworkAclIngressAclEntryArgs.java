// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkAclIngressAclEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAclIngressAclEntryArgs Empty = new NetworkAclIngressAclEntryArgs();

    /**
     * Description of the inbound rule.The description must be 1 to 256 characters in length and cannot start with http:// or https.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the inbound rule.The description must be 1 to 256 characters in length and cannot start with http:// or https.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the inbound rule entry.The name must be 1 to 128 characters in length and cannot start with http:// or https.
     * 
     */
    @Import(name="networkAclEntryName")
    private @Nullable Output<String> networkAclEntryName;

    /**
     * @return The name of the inbound rule entry.The name must be 1 to 128 characters in length and cannot start with http:// or https.
     * 
     */
    public Optional<Output<String>> networkAclEntryName() {
        return Optional.ofNullable(this.networkAclEntryName);
    }

    /**
     * Authorization policy. Value:
     * - accept: Allow.
     * - drop: Refused.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return Authorization policy. Value:
     * - accept: Allow.
     * - drop: Refused.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * The source port range of the inbound rule.When the Protocol type of the inbound rule is all, icmp, or gre, the port range is - 1/-1, indicating that the port is not restricted.When the Protocol type of the inbound rule is tcp or udp, the port range is 1 to 65535, and the format is 1/200 or 80/80, indicating port 1 to port 200 or port 80.
     * 
     */
    @Import(name="port")
    private @Nullable Output<String> port;

    /**
     * @return The source port range of the inbound rule.When the Protocol type of the inbound rule is all, icmp, or gre, the port range is - 1/-1, indicating that the port is not restricted.When the Protocol type of the inbound rule is tcp or udp, the port range is 1 to 65535, and the format is 1/200 or 80/80, indicating port 1 to port 200 or port 80.
     * 
     */
    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The protocol type. Value:
     * - icmp: Network Control Message Protocol.
     * - gre: Generic Routing Encapsulation Protocol.
     * - tcp: Transmission Control Protocol.
     * - udp: User Datagram Protocol.
     * - all: Supports all protocols.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The protocol type. Value:
     * - icmp: Network Control Message Protocol.
     * - gre: Generic Routing Encapsulation Protocol.
     * - tcp: Transmission Control Protocol.
     * - udp: User Datagram Protocol.
     * - all: Supports all protocols.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Source address network segment.
     * 
     */
    @Import(name="sourceCidrIp")
    private @Nullable Output<String> sourceCidrIp;

    /**
     * @return Source address network segment.
     * 
     */
    public Optional<Output<String>> sourceCidrIp() {
        return Optional.ofNullable(this.sourceCidrIp);
    }

    private NetworkAclIngressAclEntryArgs() {}

    private NetworkAclIngressAclEntryArgs(NetworkAclIngressAclEntryArgs $) {
        this.description = $.description;
        this.networkAclEntryName = $.networkAclEntryName;
        this.policy = $.policy;
        this.port = $.port;
        this.protocol = $.protocol;
        this.sourceCidrIp = $.sourceCidrIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAclIngressAclEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAclIngressAclEntryArgs $;

        public Builder() {
            $ = new NetworkAclIngressAclEntryArgs();
        }

        public Builder(NetworkAclIngressAclEntryArgs defaults) {
            $ = new NetworkAclIngressAclEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the inbound rule.The description must be 1 to 256 characters in length and cannot start with http:// or https.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the inbound rule.The description must be 1 to 256 characters in length and cannot start with http:// or https.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param networkAclEntryName The name of the inbound rule entry.The name must be 1 to 128 characters in length and cannot start with http:// or https.
         * 
         * @return builder
         * 
         */
        public Builder networkAclEntryName(@Nullable Output<String> networkAclEntryName) {
            $.networkAclEntryName = networkAclEntryName;
            return this;
        }

        /**
         * @param networkAclEntryName The name of the inbound rule entry.The name must be 1 to 128 characters in length and cannot start with http:// or https.
         * 
         * @return builder
         * 
         */
        public Builder networkAclEntryName(String networkAclEntryName) {
            return networkAclEntryName(Output.of(networkAclEntryName));
        }

        /**
         * @param policy Authorization policy. Value:
         * - accept: Allow.
         * - drop: Refused.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Authorization policy. Value:
         * - accept: Allow.
         * - drop: Refused.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param port The source port range of the inbound rule.When the Protocol type of the inbound rule is all, icmp, or gre, the port range is - 1/-1, indicating that the port is not restricted.When the Protocol type of the inbound rule is tcp or udp, the port range is 1 to 65535, and the format is 1/200 or 80/80, indicating port 1 to port 200 or port 80.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The source port range of the inbound rule.When the Protocol type of the inbound rule is all, icmp, or gre, the port range is - 1/-1, indicating that the port is not restricted.When the Protocol type of the inbound rule is tcp or udp, the port range is 1 to 65535, and the format is 1/200 or 80/80, indicating port 1 to port 200 or port 80.
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol The protocol type. Value:
         * - icmp: Network Control Message Protocol.
         * - gre: Generic Routing Encapsulation Protocol.
         * - tcp: Transmission Control Protocol.
         * - udp: User Datagram Protocol.
         * - all: Supports all protocols.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol type. Value:
         * - icmp: Network Control Message Protocol.
         * - gre: Generic Routing Encapsulation Protocol.
         * - tcp: Transmission Control Protocol.
         * - udp: User Datagram Protocol.
         * - all: Supports all protocols.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param sourceCidrIp Source address network segment.
         * 
         * @return builder
         * 
         */
        public Builder sourceCidrIp(@Nullable Output<String> sourceCidrIp) {
            $.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * @param sourceCidrIp Source address network segment.
         * 
         * @return builder
         * 
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            return sourceCidrIp(Output.of(sourceCidrIp));
        }

        public NetworkAclIngressAclEntryArgs build() {
            return $;
        }
    }

}
