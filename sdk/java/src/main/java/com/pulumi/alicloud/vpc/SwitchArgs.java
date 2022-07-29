// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchArgs Empty = new SwitchArgs();

    /**
     * Field `availability_zone` has been deprecated from provider version 1.119.0. New field `zone_id` instead.
     * 
     * @deprecated
     * Field &#39;availability_zone&#39; has been deprecated from provider version 1.119.0. New field &#39;zone_id&#39; instead.
     * 
     */
    @Deprecated /* Field 'availability_zone' has been deprecated from provider version 1.119.0. New field 'zone_id' instead. */
    @Import(name="availabilityZone")
    private @Nullable Output<String> availabilityZone;

    /**
     * @return Field `availability_zone` has been deprecated from provider version 1.119.0. New field `zone_id` instead.
     * 
     * @deprecated
     * Field &#39;availability_zone&#39; has been deprecated from provider version 1.119.0. New field &#39;zone_id&#39; instead.
     * 
     */
    @Deprecated /* Field 'availability_zone' has been deprecated from provider version 1.119.0. New field 'zone_id' instead. */
    public Optional<Output<String>> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    /**
     * The CIDR block for the switch.
     * 
     */
    @Import(name="cidrBlock", required=true)
    private Output<String> cidrBlock;

    /**
     * @return The CIDR block for the switch.
     * 
     */
    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }

    /**
     * The switch description. Defaults to null.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The switch description. Defaults to null.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Field `name` has been deprecated from provider version 1.119.0. New field `vswitch_name` instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.119.0. New field &#39;vswitch_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.119.0. New field 'vswitch_name' instead. */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Field `name` has been deprecated from provider version 1.119.0. New field `vswitch_name` instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.119.0. New field &#39;vswitch_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.119.0. New field 'vswitch_name' instead. */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * The VPC ID.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The VPC ID.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     * The name of the switch. Defaults to null.
     * 
     */
    @Import(name="vswitchName")
    private @Nullable Output<String> vswitchName;

    /**
     * @return The name of the switch. Defaults to null.
     * 
     */
    public Optional<Output<String>> vswitchName() {
        return Optional.ofNullable(this.vswitchName);
    }

    /**
     * The AZ for the switch.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The AZ for the switch.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private SwitchArgs() {}

    private SwitchArgs(SwitchArgs $) {
        this.availabilityZone = $.availabilityZone;
        this.cidrBlock = $.cidrBlock;
        this.description = $.description;
        this.name = $.name;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
        this.vswitchName = $.vswitchName;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchArgs $;

        public Builder() {
            $ = new SwitchArgs();
        }

        public Builder(SwitchArgs defaults) {
            $ = new SwitchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityZone Field `availability_zone` has been deprecated from provider version 1.119.0. New field `zone_id` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;availability_zone&#39; has been deprecated from provider version 1.119.0. New field &#39;zone_id&#39; instead.
         * 
         */
        @Deprecated /* Field 'availability_zone' has been deprecated from provider version 1.119.0. New field 'zone_id' instead. */
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * @param availabilityZone Field `availability_zone` has been deprecated from provider version 1.119.0. New field `zone_id` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;availability_zone&#39; has been deprecated from provider version 1.119.0. New field &#39;zone_id&#39; instead.
         * 
         */
        @Deprecated /* Field 'availability_zone' has been deprecated from provider version 1.119.0. New field 'zone_id' instead. */
        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        /**
         * @param cidrBlock The CIDR block for the switch.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param cidrBlock The CIDR block for the switch.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        /**
         * @param description The switch description. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The switch description. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Field `name` has been deprecated from provider version 1.119.0. New field `vswitch_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated from provider version 1.119.0. New field &#39;vswitch_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated from provider version 1.119.0. New field 'vswitch_name' instead. */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Field `name` has been deprecated from provider version 1.119.0. New field `vswitch_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated from provider version 1.119.0. New field &#39;vswitch_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated from provider version 1.119.0. New field 'vswitch_name' instead. */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param vpcId The VPC ID.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The VPC ID.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vswitchName The name of the switch. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder vswitchName(@Nullable Output<String> vswitchName) {
            $.vswitchName = vswitchName;
            return this;
        }

        /**
         * @param vswitchName The name of the switch. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder vswitchName(String vswitchName) {
            return vswitchName(Output.of(vswitchName));
        }

        /**
         * @param zoneId The AZ for the switch.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The AZ for the switch.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public SwitchArgs build() {
            $.cidrBlock = Objects.requireNonNull($.cidrBlock, "expected parameter 'cidrBlock' to be non-null");
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}
