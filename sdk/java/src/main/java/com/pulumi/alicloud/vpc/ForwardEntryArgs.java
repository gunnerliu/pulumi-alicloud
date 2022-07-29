// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ForwardEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ForwardEntryArgs Empty = new ForwardEntryArgs();

    /**
     * The external ip address, the ip must along bandwidth package public ip which `alicloud.vpc.NatGateway` argument `bandwidth_packages`.
     * 
     */
    @Import(name="externalIp", required=true)
    private Output<String> externalIp;

    /**
     * @return The external ip address, the ip must along bandwidth package public ip which `alicloud.vpc.NatGateway` argument `bandwidth_packages`.
     * 
     */
    public Output<String> externalIp() {
        return this.externalIp;
    }

    /**
     * The external port, valid value is 1~65535|any.
     * 
     */
    @Import(name="externalPort", required=true)
    private Output<String> externalPort;

    /**
     * @return The external port, valid value is 1~65535|any.
     * 
     */
    public Output<String> externalPort() {
        return this.externalPort;
    }

    /**
     * The name of forward entry.
     * 
     */
    @Import(name="forwardEntryName")
    private @Nullable Output<String> forwardEntryName;

    /**
     * @return The name of forward entry.
     * 
     */
    public Optional<Output<String>> forwardEntryName() {
        return Optional.ofNullable(this.forwardEntryName);
    }

    /**
     * The value can get from `alicloud.vpc.NatGateway` Attributes &#34;forward_table_ids&#34;.
     * 
     */
    @Import(name="forwardTableId", required=true)
    private Output<String> forwardTableId;

    /**
     * @return The value can get from `alicloud.vpc.NatGateway` Attributes &#34;forward_table_ids&#34;.
     * 
     */
    public Output<String> forwardTableId() {
        return this.forwardTableId;
    }

    /**
     * The internal ip, must a private ip.
     * 
     */
    @Import(name="internalIp", required=true)
    private Output<String> internalIp;

    /**
     * @return The internal ip, must a private ip.
     * 
     */
    public Output<String> internalIp() {
        return this.internalIp;
    }

    /**
     * The internal port, valid value is 1~65535|any.
     * 
     */
    @Import(name="internalPort", required=true)
    private Output<String> internalPort;

    /**
     * @return The internal port, valid value is 1~65535|any.
     * 
     */
    public Output<String> internalPort() {
        return this.internalPort;
    }

    /**
     * The ip protocol, valid value is tcp|udp|any.
     * 
     */
    @Import(name="ipProtocol", required=true)
    private Output<String> ipProtocol;

    /**
     * @return The ip protocol, valid value is tcp|udp|any.
     * 
     */
    public Output<String> ipProtocol() {
        return this.ipProtocol;
    }

    /**
     * Field `name` has been deprecated from provider version 1.119.1. New field `forward_entry_name` instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.119.1. New field &#39;forward_entry_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.119.1. New field 'forward_entry_name' instead. */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Field `name` has been deprecated from provider version 1.119.1. New field `forward_entry_name` instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.119.1. New field &#39;forward_entry_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.119.1. New field 'forward_entry_name' instead. */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies whether to remove limits on the port range. Default value is `false`.
     * 
     */
    @Import(name="portBreak")
    private @Nullable Output<Boolean> portBreak;

    /**
     * @return Specifies whether to remove limits on the port range. Default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> portBreak() {
        return Optional.ofNullable(this.portBreak);
    }

    private ForwardEntryArgs() {}

    private ForwardEntryArgs(ForwardEntryArgs $) {
        this.externalIp = $.externalIp;
        this.externalPort = $.externalPort;
        this.forwardEntryName = $.forwardEntryName;
        this.forwardTableId = $.forwardTableId;
        this.internalIp = $.internalIp;
        this.internalPort = $.internalPort;
        this.ipProtocol = $.ipProtocol;
        this.name = $.name;
        this.portBreak = $.portBreak;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ForwardEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ForwardEntryArgs $;

        public Builder() {
            $ = new ForwardEntryArgs();
        }

        public Builder(ForwardEntryArgs defaults) {
            $ = new ForwardEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalIp The external ip address, the ip must along bandwidth package public ip which `alicloud.vpc.NatGateway` argument `bandwidth_packages`.
         * 
         * @return builder
         * 
         */
        public Builder externalIp(Output<String> externalIp) {
            $.externalIp = externalIp;
            return this;
        }

        /**
         * @param externalIp The external ip address, the ip must along bandwidth package public ip which `alicloud.vpc.NatGateway` argument `bandwidth_packages`.
         * 
         * @return builder
         * 
         */
        public Builder externalIp(String externalIp) {
            return externalIp(Output.of(externalIp));
        }

        /**
         * @param externalPort The external port, valid value is 1~65535|any.
         * 
         * @return builder
         * 
         */
        public Builder externalPort(Output<String> externalPort) {
            $.externalPort = externalPort;
            return this;
        }

        /**
         * @param externalPort The external port, valid value is 1~65535|any.
         * 
         * @return builder
         * 
         */
        public Builder externalPort(String externalPort) {
            return externalPort(Output.of(externalPort));
        }

        /**
         * @param forwardEntryName The name of forward entry.
         * 
         * @return builder
         * 
         */
        public Builder forwardEntryName(@Nullable Output<String> forwardEntryName) {
            $.forwardEntryName = forwardEntryName;
            return this;
        }

        /**
         * @param forwardEntryName The name of forward entry.
         * 
         * @return builder
         * 
         */
        public Builder forwardEntryName(String forwardEntryName) {
            return forwardEntryName(Output.of(forwardEntryName));
        }

        /**
         * @param forwardTableId The value can get from `alicloud.vpc.NatGateway` Attributes &#34;forward_table_ids&#34;.
         * 
         * @return builder
         * 
         */
        public Builder forwardTableId(Output<String> forwardTableId) {
            $.forwardTableId = forwardTableId;
            return this;
        }

        /**
         * @param forwardTableId The value can get from `alicloud.vpc.NatGateway` Attributes &#34;forward_table_ids&#34;.
         * 
         * @return builder
         * 
         */
        public Builder forwardTableId(String forwardTableId) {
            return forwardTableId(Output.of(forwardTableId));
        }

        /**
         * @param internalIp The internal ip, must a private ip.
         * 
         * @return builder
         * 
         */
        public Builder internalIp(Output<String> internalIp) {
            $.internalIp = internalIp;
            return this;
        }

        /**
         * @param internalIp The internal ip, must a private ip.
         * 
         * @return builder
         * 
         */
        public Builder internalIp(String internalIp) {
            return internalIp(Output.of(internalIp));
        }

        /**
         * @param internalPort The internal port, valid value is 1~65535|any.
         * 
         * @return builder
         * 
         */
        public Builder internalPort(Output<String> internalPort) {
            $.internalPort = internalPort;
            return this;
        }

        /**
         * @param internalPort The internal port, valid value is 1~65535|any.
         * 
         * @return builder
         * 
         */
        public Builder internalPort(String internalPort) {
            return internalPort(Output.of(internalPort));
        }

        /**
         * @param ipProtocol The ip protocol, valid value is tcp|udp|any.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocol(Output<String> ipProtocol) {
            $.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * @param ipProtocol The ip protocol, valid value is tcp|udp|any.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocol(String ipProtocol) {
            return ipProtocol(Output.of(ipProtocol));
        }

        /**
         * @param name Field `name` has been deprecated from provider version 1.119.1. New field `forward_entry_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated from provider version 1.119.1. New field &#39;forward_entry_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated from provider version 1.119.1. New field 'forward_entry_name' instead. */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Field `name` has been deprecated from provider version 1.119.1. New field `forward_entry_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated from provider version 1.119.1. New field &#39;forward_entry_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated from provider version 1.119.1. New field 'forward_entry_name' instead. */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param portBreak Specifies whether to remove limits on the port range. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder portBreak(@Nullable Output<Boolean> portBreak) {
            $.portBreak = portBreak;
            return this;
        }

        /**
         * @param portBreak Specifies whether to remove limits on the port range. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder portBreak(Boolean portBreak) {
            return portBreak(Output.of(portBreak));
        }

        public ForwardEntryArgs build() {
            $.externalIp = Objects.requireNonNull($.externalIp, "expected parameter 'externalIp' to be non-null");
            $.externalPort = Objects.requireNonNull($.externalPort, "expected parameter 'externalPort' to be non-null");
            $.forwardTableId = Objects.requireNonNull($.forwardTableId, "expected parameter 'forwardTableId' to be non-null");
            $.internalIp = Objects.requireNonNull($.internalIp, "expected parameter 'internalIp' to be non-null");
            $.internalPort = Objects.requireNonNull($.internalPort, "expected parameter 'internalPort' to be non-null");
            $.ipProtocol = Objects.requireNonNull($.ipProtocol, "expected parameter 'ipProtocol' to be non-null");
            return $;
        }
    }

}
