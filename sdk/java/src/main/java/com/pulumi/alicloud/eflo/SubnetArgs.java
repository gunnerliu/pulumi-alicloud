// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eflo;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubnetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubnetArgs Empty = new SubnetArgs();

    /**
     * CIDR network segment.
     * 
     */
    @Import(name="cidr", required=true)
    private Output<String> cidr;

    /**
     * @return CIDR network segment.
     * 
     */
    public Output<String> cidr() {
        return this.cidr;
    }

    /**
     * The Subnet name.
     * 
     */
    @Import(name="subnetName", required=true)
    private Output<String> subnetName;

    /**
     * @return The Subnet name.
     * 
     */
    public Output<String> subnetName() {
        return this.subnetName;
    }

    /**
     * Eflo subnet usage type. optional value:
     * - General type is not filled in
     * - OOB:OOB type
     * - LB: LB type
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Eflo subnet usage type. optional value:
     * - General type is not filled in
     * - OOB:OOB type
     * - LB: LB type
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The Eflo VPD ID.
     * 
     */
    @Import(name="vpdId", required=true)
    private Output<String> vpdId;

    /**
     * @return The Eflo VPD ID.
     * 
     */
    public Output<String> vpdId() {
        return this.vpdId;
    }

    /**
     * The zone ID  of the resource.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone ID  of the resource.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private SubnetArgs() {}

    private SubnetArgs(SubnetArgs $) {
        this.cidr = $.cidr;
        this.subnetName = $.subnetName;
        this.type = $.type;
        this.vpdId = $.vpdId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetArgs $;

        public Builder() {
            $ = new SubnetArgs();
        }

        public Builder(SubnetArgs defaults) {
            $ = new SubnetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr CIDR network segment.
         * 
         * @return builder
         * 
         */
        public Builder cidr(Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr CIDR network segment.
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param subnetName The Subnet name.
         * 
         * @return builder
         * 
         */
        public Builder subnetName(Output<String> subnetName) {
            $.subnetName = subnetName;
            return this;
        }

        /**
         * @param subnetName The Subnet name.
         * 
         * @return builder
         * 
         */
        public Builder subnetName(String subnetName) {
            return subnetName(Output.of(subnetName));
        }

        /**
         * @param type Eflo subnet usage type. optional value:
         * - General type is not filled in
         * - OOB:OOB type
         * - LB: LB type
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Eflo subnet usage type. optional value:
         * - General type is not filled in
         * - OOB:OOB type
         * - LB: LB type
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vpdId The Eflo VPD ID.
         * 
         * @return builder
         * 
         */
        public Builder vpdId(Output<String> vpdId) {
            $.vpdId = vpdId;
            return this;
        }

        /**
         * @param vpdId The Eflo VPD ID.
         * 
         * @return builder
         * 
         */
        public Builder vpdId(String vpdId) {
            return vpdId(Output.of(vpdId));
        }

        /**
         * @param zoneId The zone ID  of the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone ID  of the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public SubnetArgs build() {
            $.cidr = Objects.requireNonNull($.cidr, "expected parameter 'cidr' to be non-null");
            $.subnetName = Objects.requireNonNull($.subnetName, "expected parameter 'subnetName' to be non-null");
            $.vpdId = Objects.requireNonNull($.vpdId, "expected parameter 'vpdId' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
