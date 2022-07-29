// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BandwidthPackageAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final BandwidthPackageAttachmentArgs Empty = new BandwidthPackageAttachmentArgs();

    /**
     * The ID of the Global Accelerator instance from which you want to disassociate the bandwidth plan.
     * 
     */
    @Import(name="acceleratorId", required=true)
    private Output<String> acceleratorId;

    /**
     * @return The ID of the Global Accelerator instance from which you want to disassociate the bandwidth plan.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }

    /**
     * The ID of the bandwidth plan to disassociate.
     * 
     */
    @Import(name="bandwidthPackageId", required=true)
    private Output<String> bandwidthPackageId;

    /**
     * @return The ID of the bandwidth plan to disassociate.
     * 
     */
    public Output<String> bandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    private BandwidthPackageAttachmentArgs() {}

    private BandwidthPackageAttachmentArgs(BandwidthPackageAttachmentArgs $) {
        this.acceleratorId = $.acceleratorId;
        this.bandwidthPackageId = $.bandwidthPackageId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BandwidthPackageAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BandwidthPackageAttachmentArgs $;

        public Builder() {
            $ = new BandwidthPackageAttachmentArgs();
        }

        public Builder(BandwidthPackageAttachmentArgs defaults) {
            $ = new BandwidthPackageAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorId The ID of the Global Accelerator instance from which you want to disassociate the bandwidth plan.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(Output<String> acceleratorId) {
            $.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * @param acceleratorId The ID of the Global Accelerator instance from which you want to disassociate the bandwidth plan.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(String acceleratorId) {
            return acceleratorId(Output.of(acceleratorId));
        }

        /**
         * @param bandwidthPackageId The ID of the bandwidth plan to disassociate.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthPackageId(Output<String> bandwidthPackageId) {
            $.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * @param bandwidthPackageId The ID of the bandwidth plan to disassociate.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            return bandwidthPackageId(Output.of(bandwidthPackageId));
        }

        public BandwidthPackageAttachmentArgs build() {
            $.acceleratorId = Objects.requireNonNull($.acceleratorId, "expected parameter 'acceleratorId' to be non-null");
            $.bandwidthPackageId = Objects.requireNonNull($.bandwidthPackageId, "expected parameter 'bandwidthPackageId' to be non-null");
            return $;
        }
    }

}
