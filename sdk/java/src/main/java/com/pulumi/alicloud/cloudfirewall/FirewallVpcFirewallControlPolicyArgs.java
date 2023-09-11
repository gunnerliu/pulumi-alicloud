// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallVpcFirewallControlPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallVpcFirewallControlPolicyArgs Empty = new FirewallVpcFirewallControlPolicyArgs();

    /**
     * The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     * 
     */
    @Import(name="aclAction", required=true)
    private Output<String> aclAction;

    /**
     * @return The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     * 
     */
    public Output<String> aclAction() {
        return this.aclAction;
    }

    /**
     * The type of the applications that the access control policy supports. Valid values: `FTP`, `HTTP`, `HTTPS`, `MySQL`, `SMTP`, `SMTPS`, `RDP`, `VNC`, `SSH`, `Redis`, `MQTT`, `MongoDB`, `Memcache`, `SSL`, `ANY`.
     * 
     */
    @Import(name="applicationName", required=true)
    private Output<String> applicationName;

    /**
     * @return The type of the applications that the access control policy supports. Valid values: `FTP`, `HTTP`, `HTTPS`, `MySQL`, `SMTP`, `SMTPS`, `RDP`, `VNC`, `SSH`, `Redis`, `MQTT`, `MongoDB`, `Memcache`, `SSL`, `ANY`.
     * 
     */
    public Output<String> applicationName() {
        return this.applicationName;
    }

    /**
     * Access control over VPC firewalls description of the strategy information.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Access control over VPC firewalls description of the strategy information.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The destination port in the access control policy. **Note:** If `dest_port_type` is set to `port`, you must specify this parameter.
     * 
     */
    @Import(name="destPort")
    private @Nullable Output<String> destPort;

    /**
     * @return The destination port in the access control policy. **Note:** If `dest_port_type` is set to `port`, you must specify this parameter.
     * 
     */
    public Optional<Output<String>> destPort() {
        return Optional.ofNullable(this.destPort);
    }

    /**
     * Access control policy in the access traffic of the destination port address book name. **Note:** If `dest_port_type` is set to `group`, you must specify this parameter.
     * 
     */
    @Import(name="destPortGroup")
    private @Nullable Output<String> destPortGroup;

    /**
     * @return Access control policy in the access traffic of the destination port address book name. **Note:** If `dest_port_type` is set to `group`, you must specify this parameter.
     * 
     */
    public Optional<Output<String>> destPortGroup() {
        return Optional.ofNullable(this.destPortGroup);
    }

    /**
     * The type of the destination port in the access control policy. Valid values: `port`, `group`.
     * 
     */
    @Import(name="destPortType")
    private @Nullable Output<String> destPortType;

    /**
     * @return The type of the destination port in the access control policy. Valid values: `port`, `group`.
     * 
     */
    public Optional<Output<String>> destPortType() {
        return Optional.ofNullable(this.destPortType);
    }

    /**
     * The destination address in the access control policy. Valid values:
     * - If `destination_type` is set to `net`, the value of `destination` must be a CIDR block.
     * - If `destination_type` is set to `group`, the value of `destination` must be an address book.
     * - If `destination_type` is set to `domain`, the value of `destination` must be a domain name.
     * 
     */
    @Import(name="destination", required=true)
    private Output<String> destination;

    /**
     * @return The destination address in the access control policy. Valid values:
     * - If `destination_type` is set to `net`, the value of `destination` must be a CIDR block.
     * - If `destination_type` is set to `group`, the value of `destination` must be an address book.
     * - If `destination_type` is set to `domain`, the value of `destination` must be a domain name.
     * 
     */
    public Output<String> destination() {
        return this.destination;
    }

    /**
     * The type of the destination address in the access control policy. Valid values: `net`, `group`, `domain`.
     * 
     */
    @Import(name="destinationType", required=true)
    private Output<String> destinationType;

    /**
     * @return The type of the destination address in the access control policy. Valid values: `net`, `group`, `domain`.
     * 
     */
    public Output<String> destinationType() {
        return this.destinationType;
    }

    /**
     * The language of the content within the request and response. Valid values: `zh`, `en`.
     * 
     */
    @Import(name="lang")
    private @Nullable Output<String> lang;

    /**
     * @return The language of the content within the request and response. Valid values: `zh`, `en`.
     * 
     */
    public Optional<Output<String>> lang() {
        return Optional.ofNullable(this.lang);
    }

    /**
     * The UID of the member account of the current Alibaba cloud account.
     * 
     */
    @Import(name="memberUid")
    private @Nullable Output<String> memberUid;

    /**
     * @return The UID of the member account of the current Alibaba cloud account.
     * 
     */
    public Optional<Output<String>> memberUid() {
        return Optional.ofNullable(this.memberUid);
    }

    /**
     * The priority of the access control policy. The priority value starts from 1. A smaller priority value indicates a higher priority.
     * 
     */
    @Import(name="order", required=true)
    private Output<Integer> order;

    /**
     * @return The priority of the access control policy. The priority value starts from 1. A smaller priority value indicates a higher priority.
     * 
     */
    public Output<Integer> order() {
        return this.order;
    }

    /**
     * The type of the protocol in the access control policy. Valid values: `ANY`, `TCP`, `UDP`, `ICMP`.
     * 
     */
    @Import(name="proto", required=true)
    private Output<String> proto;

    /**
     * @return The type of the protocol in the access control policy. Valid values: `ANY`, `TCP`, `UDP`, `ICMP`.
     * 
     */
    public Output<String> proto() {
        return this.proto;
    }

    /**
     * The enabled status of the access control policy. The policy is enabled by default after it is created.. Valid values:
     * 
     */
    @Import(name="release")
    private @Nullable Output<Boolean> release;

    /**
     * @return The enabled status of the access control policy. The policy is enabled by default after it is created.. Valid values:
     * 
     */
    public Optional<Output<Boolean>> release() {
        return Optional.ofNullable(this.release);
    }

    /**
     * Access control over VPC firewalls strategy in the source address.
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    /**
     * @return Access control over VPC firewalls strategy in the source address.
     * 
     */
    public Output<String> source() {
        return this.source;
    }

    /**
     * The type of the source address in the access control policy. Valid values: `net`, `group`.
     * 
     */
    @Import(name="sourceType", required=true)
    private Output<String> sourceType;

    /**
     * @return The type of the source address in the access control policy. Valid values: `net`, `group`.
     * 
     */
    public Output<String> sourceType() {
        return this.sourceType;
    }

    /**
     * The ID of the VPC firewall instance. Valid values:
     * - When the VPC firewall protects traffic between two VPCs connected through the cloud enterprise network, the policy group ID uses the cloud enterprise network instance ID.
     * - When the VPC firewall protects traffic between two VPCs connected through the express connection, the policy group ID uses the ID of the VPC firewall instance.
     * 
     */
    @Import(name="vpcFirewallId", required=true)
    private Output<String> vpcFirewallId;

    /**
     * @return The ID of the VPC firewall instance. Valid values:
     * - When the VPC firewall protects traffic between two VPCs connected through the cloud enterprise network, the policy group ID uses the cloud enterprise network instance ID.
     * - When the VPC firewall protects traffic between two VPCs connected through the express connection, the policy group ID uses the ID of the VPC firewall instance.
     * 
     */
    public Output<String> vpcFirewallId() {
        return this.vpcFirewallId;
    }

    private FirewallVpcFirewallControlPolicyArgs() {}

    private FirewallVpcFirewallControlPolicyArgs(FirewallVpcFirewallControlPolicyArgs $) {
        this.aclAction = $.aclAction;
        this.applicationName = $.applicationName;
        this.description = $.description;
        this.destPort = $.destPort;
        this.destPortGroup = $.destPortGroup;
        this.destPortType = $.destPortType;
        this.destination = $.destination;
        this.destinationType = $.destinationType;
        this.lang = $.lang;
        this.memberUid = $.memberUid;
        this.order = $.order;
        this.proto = $.proto;
        this.release = $.release;
        this.source = $.source;
        this.sourceType = $.sourceType;
        this.vpcFirewallId = $.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallVpcFirewallControlPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallVpcFirewallControlPolicyArgs $;

        public Builder() {
            $ = new FirewallVpcFirewallControlPolicyArgs();
        }

        public Builder(FirewallVpcFirewallControlPolicyArgs defaults) {
            $ = new FirewallVpcFirewallControlPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclAction The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
         * 
         * @return builder
         * 
         */
        public Builder aclAction(Output<String> aclAction) {
            $.aclAction = aclAction;
            return this;
        }

        /**
         * @param aclAction The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
         * 
         * @return builder
         * 
         */
        public Builder aclAction(String aclAction) {
            return aclAction(Output.of(aclAction));
        }

        /**
         * @param applicationName The type of the applications that the access control policy supports. Valid values: `FTP`, `HTTP`, `HTTPS`, `MySQL`, `SMTP`, `SMTPS`, `RDP`, `VNC`, `SSH`, `Redis`, `MQTT`, `MongoDB`, `Memcache`, `SSL`, `ANY`.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(Output<String> applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        /**
         * @param applicationName The type of the applications that the access control policy supports. Valid values: `FTP`, `HTTP`, `HTTPS`, `MySQL`, `SMTP`, `SMTPS`, `RDP`, `VNC`, `SSH`, `Redis`, `MQTT`, `MongoDB`, `Memcache`, `SSL`, `ANY`.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(String applicationName) {
            return applicationName(Output.of(applicationName));
        }

        /**
         * @param description Access control over VPC firewalls description of the strategy information.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Access control over VPC firewalls description of the strategy information.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destPort The destination port in the access control policy. **Note:** If `dest_port_type` is set to `port`, you must specify this parameter.
         * 
         * @return builder
         * 
         */
        public Builder destPort(@Nullable Output<String> destPort) {
            $.destPort = destPort;
            return this;
        }

        /**
         * @param destPort The destination port in the access control policy. **Note:** If `dest_port_type` is set to `port`, you must specify this parameter.
         * 
         * @return builder
         * 
         */
        public Builder destPort(String destPort) {
            return destPort(Output.of(destPort));
        }

        /**
         * @param destPortGroup Access control policy in the access traffic of the destination port address book name. **Note:** If `dest_port_type` is set to `group`, you must specify this parameter.
         * 
         * @return builder
         * 
         */
        public Builder destPortGroup(@Nullable Output<String> destPortGroup) {
            $.destPortGroup = destPortGroup;
            return this;
        }

        /**
         * @param destPortGroup Access control policy in the access traffic of the destination port address book name. **Note:** If `dest_port_type` is set to `group`, you must specify this parameter.
         * 
         * @return builder
         * 
         */
        public Builder destPortGroup(String destPortGroup) {
            return destPortGroup(Output.of(destPortGroup));
        }

        /**
         * @param destPortType The type of the destination port in the access control policy. Valid values: `port`, `group`.
         * 
         * @return builder
         * 
         */
        public Builder destPortType(@Nullable Output<String> destPortType) {
            $.destPortType = destPortType;
            return this;
        }

        /**
         * @param destPortType The type of the destination port in the access control policy. Valid values: `port`, `group`.
         * 
         * @return builder
         * 
         */
        public Builder destPortType(String destPortType) {
            return destPortType(Output.of(destPortType));
        }

        /**
         * @param destination The destination address in the access control policy. Valid values:
         * - If `destination_type` is set to `net`, the value of `destination` must be a CIDR block.
         * - If `destination_type` is set to `group`, the value of `destination` must be an address book.
         * - If `destination_type` is set to `domain`, the value of `destination` must be a domain name.
         * 
         * @return builder
         * 
         */
        public Builder destination(Output<String> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination The destination address in the access control policy. Valid values:
         * - If `destination_type` is set to `net`, the value of `destination` must be a CIDR block.
         * - If `destination_type` is set to `group`, the value of `destination` must be an address book.
         * - If `destination_type` is set to `domain`, the value of `destination` must be a domain name.
         * 
         * @return builder
         * 
         */
        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param destinationType The type of the destination address in the access control policy. Valid values: `net`, `group`, `domain`.
         * 
         * @return builder
         * 
         */
        public Builder destinationType(Output<String> destinationType) {
            $.destinationType = destinationType;
            return this;
        }

        /**
         * @param destinationType The type of the destination address in the access control policy. Valid values: `net`, `group`, `domain`.
         * 
         * @return builder
         * 
         */
        public Builder destinationType(String destinationType) {
            return destinationType(Output.of(destinationType));
        }

        /**
         * @param lang The language of the content within the request and response. Valid values: `zh`, `en`.
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable Output<String> lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param lang The language of the content within the request and response. Valid values: `zh`, `en`.
         * 
         * @return builder
         * 
         */
        public Builder lang(String lang) {
            return lang(Output.of(lang));
        }

        /**
         * @param memberUid The UID of the member account of the current Alibaba cloud account.
         * 
         * @return builder
         * 
         */
        public Builder memberUid(@Nullable Output<String> memberUid) {
            $.memberUid = memberUid;
            return this;
        }

        /**
         * @param memberUid The UID of the member account of the current Alibaba cloud account.
         * 
         * @return builder
         * 
         */
        public Builder memberUid(String memberUid) {
            return memberUid(Output.of(memberUid));
        }

        /**
         * @param order The priority of the access control policy. The priority value starts from 1. A smaller priority value indicates a higher priority.
         * 
         * @return builder
         * 
         */
        public Builder order(Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order The priority of the access control policy. The priority value starts from 1. A smaller priority value indicates a higher priority.
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        /**
         * @param proto The type of the protocol in the access control policy. Valid values: `ANY`, `TCP`, `UDP`, `ICMP`.
         * 
         * @return builder
         * 
         */
        public Builder proto(Output<String> proto) {
            $.proto = proto;
            return this;
        }

        /**
         * @param proto The type of the protocol in the access control policy. Valid values: `ANY`, `TCP`, `UDP`, `ICMP`.
         * 
         * @return builder
         * 
         */
        public Builder proto(String proto) {
            return proto(Output.of(proto));
        }

        /**
         * @param release The enabled status of the access control policy. The policy is enabled by default after it is created.. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder release(@Nullable Output<Boolean> release) {
            $.release = release;
            return this;
        }

        /**
         * @param release The enabled status of the access control policy. The policy is enabled by default after it is created.. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder release(Boolean release) {
            return release(Output.of(release));
        }

        /**
         * @param source Access control over VPC firewalls strategy in the source address.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Access control over VPC firewalls strategy in the source address.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param sourceType The type of the source address in the access control policy. Valid values: `net`, `group`.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        /**
         * @param sourceType The type of the source address in the access control policy. Valid values: `net`, `group`.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        /**
         * @param vpcFirewallId The ID of the VPC firewall instance. Valid values:
         * - When the VPC firewall protects traffic between two VPCs connected through the cloud enterprise network, the policy group ID uses the cloud enterprise network instance ID.
         * - When the VPC firewall protects traffic between two VPCs connected through the express connection, the policy group ID uses the ID of the VPC firewall instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcFirewallId(Output<String> vpcFirewallId) {
            $.vpcFirewallId = vpcFirewallId;
            return this;
        }

        /**
         * @param vpcFirewallId The ID of the VPC firewall instance. Valid values:
         * - When the VPC firewall protects traffic between two VPCs connected through the cloud enterprise network, the policy group ID uses the cloud enterprise network instance ID.
         * - When the VPC firewall protects traffic between two VPCs connected through the express connection, the policy group ID uses the ID of the VPC firewall instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            return vpcFirewallId(Output.of(vpcFirewallId));
        }

        public FirewallVpcFirewallControlPolicyArgs build() {
            $.aclAction = Objects.requireNonNull($.aclAction, "expected parameter 'aclAction' to be non-null");
            $.applicationName = Objects.requireNonNull($.applicationName, "expected parameter 'applicationName' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            $.destinationType = Objects.requireNonNull($.destinationType, "expected parameter 'destinationType' to be non-null");
            $.order = Objects.requireNonNull($.order, "expected parameter 'order' to be non-null");
            $.proto = Objects.requireNonNull($.proto, "expected parameter 'proto' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            $.sourceType = Objects.requireNonNull($.sourceType, "expected parameter 'sourceType' to be non-null");
            $.vpcFirewallId = Objects.requireNonNull($.vpcFirewallId, "expected parameter 'vpcFirewallId' to be non-null");
            return $;
        }
    }

}
