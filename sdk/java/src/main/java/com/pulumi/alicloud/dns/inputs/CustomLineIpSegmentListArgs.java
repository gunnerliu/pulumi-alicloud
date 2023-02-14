// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CustomLineIpSegmentListArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomLineIpSegmentListArgs Empty = new CustomLineIpSegmentListArgs();

    /**
     * The end IP address of the CIDR block.
     * 
     */
    @Import(name="endIp", required=true)
    private Output<String> endIp;

    /**
     * @return The end IP address of the CIDR block.
     * 
     */
    public Output<String> endIp() {
        return this.endIp;
    }

    /**
     * The start IP address of the CIDR block.
     * 
     */
    @Import(name="startIp", required=true)
    private Output<String> startIp;

    /**
     * @return The start IP address of the CIDR block.
     * 
     */
    public Output<String> startIp() {
        return this.startIp;
    }

    private CustomLineIpSegmentListArgs() {}

    private CustomLineIpSegmentListArgs(CustomLineIpSegmentListArgs $) {
        this.endIp = $.endIp;
        this.startIp = $.startIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomLineIpSegmentListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomLineIpSegmentListArgs $;

        public Builder() {
            $ = new CustomLineIpSegmentListArgs();
        }

        public Builder(CustomLineIpSegmentListArgs defaults) {
            $ = new CustomLineIpSegmentListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endIp The end IP address of the CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder endIp(Output<String> endIp) {
            $.endIp = endIp;
            return this;
        }

        /**
         * @param endIp The end IP address of the CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder endIp(String endIp) {
            return endIp(Output.of(endIp));
        }

        /**
         * @param startIp The start IP address of the CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder startIp(Output<String> startIp) {
            $.startIp = startIp;
            return this;
        }

        /**
         * @param startIp The start IP address of the CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder startIp(String startIp) {
            return startIp(Output.of(startIp));
        }

        public CustomLineIpSegmentListArgs build() {
            $.endIp = Objects.requireNonNull($.endIp, "expected parameter 'endIp' to be non-null");
            $.startIp = Objects.requireNonNull($.startIp, "expected parameter 'startIp' to be non-null");
            return $;
        }
    }

}