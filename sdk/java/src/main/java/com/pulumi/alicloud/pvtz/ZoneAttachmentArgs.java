// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pvtz;

import com.pulumi.alicloud.pvtz.inputs.ZoneAttachmentVpcArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZoneAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZoneAttachmentArgs Empty = new ZoneAttachmentArgs();

    /**
     * The language of code.
     * 
     */
    @Import(name="lang")
    private @Nullable Output<String> lang;

    /**
     * @return The language of code.
     * 
     */
    public Optional<Output<String>> lang() {
        return Optional.ofNullable(this.lang);
    }

    /**
     * The user custom IP address.
     * 
     */
    @Import(name="userClientIp")
    private @Nullable Output<String> userClientIp;

    /**
     * @return The user custom IP address.
     * 
     */
    public Optional<Output<String>> userClientIp() {
        return Optional.ofNullable(this.userClientIp);
    }

    /**
     * The id List of the VPC with the same region, for example:[&#34;vpc-1&#34;,&#34;vpc-2&#34;].
     * 
     */
    @Import(name="vpcIds")
    private @Nullable Output<List<String>> vpcIds;

    /**
     * @return The id List of the VPC with the same region, for example:[&#34;vpc-1&#34;,&#34;vpc-2&#34;].
     * 
     */
    public Optional<Output<List<String>>> vpcIds() {
        return Optional.ofNullable(this.vpcIds);
    }

    /**
     * The List of the VPC:
     * 
     */
    @Import(name="vpcs")
    private @Nullable Output<List<ZoneAttachmentVpcArgs>> vpcs;

    /**
     * @return The List of the VPC:
     * 
     */
    public Optional<Output<List<ZoneAttachmentVpcArgs>>> vpcs() {
        return Optional.ofNullable(this.vpcs);
    }

    /**
     * The name of the Private Zone Record.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The name of the Private Zone Record.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private ZoneAttachmentArgs() {}

    private ZoneAttachmentArgs(ZoneAttachmentArgs $) {
        this.lang = $.lang;
        this.userClientIp = $.userClientIp;
        this.vpcIds = $.vpcIds;
        this.vpcs = $.vpcs;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZoneAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZoneAttachmentArgs $;

        public Builder() {
            $ = new ZoneAttachmentArgs();
        }

        public Builder(ZoneAttachmentArgs defaults) {
            $ = new ZoneAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lang The language of code.
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable Output<String> lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param lang The language of code.
         * 
         * @return builder
         * 
         */
        public Builder lang(String lang) {
            return lang(Output.of(lang));
        }

        /**
         * @param userClientIp The user custom IP address.
         * 
         * @return builder
         * 
         */
        public Builder userClientIp(@Nullable Output<String> userClientIp) {
            $.userClientIp = userClientIp;
            return this;
        }

        /**
         * @param userClientIp The user custom IP address.
         * 
         * @return builder
         * 
         */
        public Builder userClientIp(String userClientIp) {
            return userClientIp(Output.of(userClientIp));
        }

        /**
         * @param vpcIds The id List of the VPC with the same region, for example:[&#34;vpc-1&#34;,&#34;vpc-2&#34;].
         * 
         * @return builder
         * 
         */
        public Builder vpcIds(@Nullable Output<List<String>> vpcIds) {
            $.vpcIds = vpcIds;
            return this;
        }

        /**
         * @param vpcIds The id List of the VPC with the same region, for example:[&#34;vpc-1&#34;,&#34;vpc-2&#34;].
         * 
         * @return builder
         * 
         */
        public Builder vpcIds(List<String> vpcIds) {
            return vpcIds(Output.of(vpcIds));
        }

        /**
         * @param vpcIds The id List of the VPC with the same region, for example:[&#34;vpc-1&#34;,&#34;vpc-2&#34;].
         * 
         * @return builder
         * 
         */
        public Builder vpcIds(String... vpcIds) {
            return vpcIds(List.of(vpcIds));
        }

        /**
         * @param vpcs The List of the VPC:
         * 
         * @return builder
         * 
         */
        public Builder vpcs(@Nullable Output<List<ZoneAttachmentVpcArgs>> vpcs) {
            $.vpcs = vpcs;
            return this;
        }

        /**
         * @param vpcs The List of the VPC:
         * 
         * @return builder
         * 
         */
        public Builder vpcs(List<ZoneAttachmentVpcArgs> vpcs) {
            return vpcs(Output.of(vpcs));
        }

        /**
         * @param vpcs The List of the VPC:
         * 
         * @return builder
         * 
         */
        public Builder vpcs(ZoneAttachmentVpcArgs... vpcs) {
            return vpcs(List.of(vpcs));
        }

        /**
         * @param zoneId The name of the Private Zone Record.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The name of the Private Zone Record.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ZoneAttachmentArgs build() {
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
