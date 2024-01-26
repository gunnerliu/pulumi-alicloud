// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ebs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnterpriseSnapshotPolicyCrossRegionCopyInfoRegionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnterpriseSnapshotPolicyCrossRegionCopyInfoRegionArgs Empty = new EnterpriseSnapshotPolicyCrossRegionCopyInfoRegionArgs();

    /**
     * Destination region ID.
     * 
     */
    @Import(name="regionId")
    private @Nullable Output<String> regionId;

    /**
     * @return Destination region ID.
     * 
     */
    public Optional<Output<String>> regionId() {
        return Optional.ofNullable(this.regionId);
    }

    /**
     * Number of days of snapshot retention for replication.
     * 
     */
    @Import(name="retainDays")
    private @Nullable Output<Integer> retainDays;

    /**
     * @return Number of days of snapshot retention for replication.
     * 
     */
    public Optional<Output<Integer>> retainDays() {
        return Optional.ofNullable(this.retainDays);
    }

    private EnterpriseSnapshotPolicyCrossRegionCopyInfoRegionArgs() {}

    private EnterpriseSnapshotPolicyCrossRegionCopyInfoRegionArgs(EnterpriseSnapshotPolicyCrossRegionCopyInfoRegionArgs $) {
        this.regionId = $.regionId;
        this.retainDays = $.retainDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnterpriseSnapshotPolicyCrossRegionCopyInfoRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnterpriseSnapshotPolicyCrossRegionCopyInfoRegionArgs $;

        public Builder() {
            $ = new EnterpriseSnapshotPolicyCrossRegionCopyInfoRegionArgs();
        }

        public Builder(EnterpriseSnapshotPolicyCrossRegionCopyInfoRegionArgs defaults) {
            $ = new EnterpriseSnapshotPolicyCrossRegionCopyInfoRegionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param regionId Destination region ID.
         * 
         * @return builder
         * 
         */
        public Builder regionId(@Nullable Output<String> regionId) {
            $.regionId = regionId;
            return this;
        }

        /**
         * @param regionId Destination region ID.
         * 
         * @return builder
         * 
         */
        public Builder regionId(String regionId) {
            return regionId(Output.of(regionId));
        }

        /**
         * @param retainDays Number of days of snapshot retention for replication.
         * 
         * @return builder
         * 
         */
        public Builder retainDays(@Nullable Output<Integer> retainDays) {
            $.retainDays = retainDays;
            return this;
        }

        /**
         * @param retainDays Number of days of snapshot retention for replication.
         * 
         * @return builder
         * 
         */
        public Builder retainDays(Integer retainDays) {
            return retainDays(Output.of(retainDays));
        }

        public EnterpriseSnapshotPolicyCrossRegionCopyInfoRegionArgs build() {
            return $;
        }
    }

}