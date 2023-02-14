// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ebs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskReplicaGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskReplicaGroupArgs Empty = new DiskReplicaGroupArgs();

    /**
     * The description of the consistent replication group.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the consistent replication group.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the region to which the disaster recovery site belongs.
     * 
     */
    @Import(name="destinationRegionId", required=true)
    private Output<String> destinationRegionId;

    /**
     * @return The ID of the region to which the disaster recovery site belongs.
     * 
     */
    public Output<String> destinationRegionId() {
        return this.destinationRegionId;
    }

    /**
     * The ID of the zone to which the disaster recovery site belongs.
     * 
     */
    @Import(name="destinationZoneId", required=true)
    private Output<String> destinationZoneId;

    /**
     * @return The ID of the zone to which the disaster recovery site belongs.
     * 
     */
    public Output<String> destinationZoneId() {
        return this.destinationZoneId;
    }

    /**
     * Consistent replication group name.
     * 
     */
    @Import(name="groupName")
    private @Nullable Output<String> groupName;

    /**
     * @return Consistent replication group name.
     * 
     */
    public Optional<Output<String>> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    /**
     * The recovery point objective (RPO) of the replication pair-consistent group. Unit: seconds.
     * 
     */
    @Import(name="rpo")
    private @Nullable Output<Integer> rpo;

    /**
     * @return The recovery point objective (RPO) of the replication pair-consistent group. Unit: seconds.
     * 
     */
    public Optional<Output<Integer>> rpo() {
        return Optional.ofNullable(this.rpo);
    }

    /**
     * The ID of the region to which the production site belongs.
     * 
     */
    @Import(name="sourceRegionId", required=true)
    private Output<String> sourceRegionId;

    /**
     * @return The ID of the region to which the production site belongs.
     * 
     */
    public Output<String> sourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * The ID of the zone to which the production site belongs.
     * 
     */
    @Import(name="sourceZoneId", required=true)
    private Output<String> sourceZoneId;

    /**
     * @return The ID of the zone to which the production site belongs.
     * 
     */
    public Output<String> sourceZoneId() {
        return this.sourceZoneId;
    }

    private DiskReplicaGroupArgs() {}

    private DiskReplicaGroupArgs(DiskReplicaGroupArgs $) {
        this.description = $.description;
        this.destinationRegionId = $.destinationRegionId;
        this.destinationZoneId = $.destinationZoneId;
        this.groupName = $.groupName;
        this.rpo = $.rpo;
        this.sourceRegionId = $.sourceRegionId;
        this.sourceZoneId = $.sourceZoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskReplicaGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskReplicaGroupArgs $;

        public Builder() {
            $ = new DiskReplicaGroupArgs();
        }

        public Builder(DiskReplicaGroupArgs defaults) {
            $ = new DiskReplicaGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the consistent replication group.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the consistent replication group.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinationRegionId The ID of the region to which the disaster recovery site belongs.
         * 
         * @return builder
         * 
         */
        public Builder destinationRegionId(Output<String> destinationRegionId) {
            $.destinationRegionId = destinationRegionId;
            return this;
        }

        /**
         * @param destinationRegionId The ID of the region to which the disaster recovery site belongs.
         * 
         * @return builder
         * 
         */
        public Builder destinationRegionId(String destinationRegionId) {
            return destinationRegionId(Output.of(destinationRegionId));
        }

        /**
         * @param destinationZoneId The ID of the zone to which the disaster recovery site belongs.
         * 
         * @return builder
         * 
         */
        public Builder destinationZoneId(Output<String> destinationZoneId) {
            $.destinationZoneId = destinationZoneId;
            return this;
        }

        /**
         * @param destinationZoneId The ID of the zone to which the disaster recovery site belongs.
         * 
         * @return builder
         * 
         */
        public Builder destinationZoneId(String destinationZoneId) {
            return destinationZoneId(Output.of(destinationZoneId));
        }

        /**
         * @param groupName Consistent replication group name.
         * 
         * @return builder
         * 
         */
        public Builder groupName(@Nullable Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        /**
         * @param groupName Consistent replication group name.
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        /**
         * @param rpo The recovery point objective (RPO) of the replication pair-consistent group. Unit: seconds.
         * 
         * @return builder
         * 
         */
        public Builder rpo(@Nullable Output<Integer> rpo) {
            $.rpo = rpo;
            return this;
        }

        /**
         * @param rpo The recovery point objective (RPO) of the replication pair-consistent group. Unit: seconds.
         * 
         * @return builder
         * 
         */
        public Builder rpo(Integer rpo) {
            return rpo(Output.of(rpo));
        }

        /**
         * @param sourceRegionId The ID of the region to which the production site belongs.
         * 
         * @return builder
         * 
         */
        public Builder sourceRegionId(Output<String> sourceRegionId) {
            $.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * @param sourceRegionId The ID of the region to which the production site belongs.
         * 
         * @return builder
         * 
         */
        public Builder sourceRegionId(String sourceRegionId) {
            return sourceRegionId(Output.of(sourceRegionId));
        }

        /**
         * @param sourceZoneId The ID of the zone to which the production site belongs.
         * 
         * @return builder
         * 
         */
        public Builder sourceZoneId(Output<String> sourceZoneId) {
            $.sourceZoneId = sourceZoneId;
            return this;
        }

        /**
         * @param sourceZoneId The ID of the zone to which the production site belongs.
         * 
         * @return builder
         * 
         */
        public Builder sourceZoneId(String sourceZoneId) {
            return sourceZoneId(Output.of(sourceZoneId));
        }

        public DiskReplicaGroupArgs build() {
            $.destinationRegionId = Objects.requireNonNull($.destinationRegionId, "expected parameter 'destinationRegionId' to be non-null");
            $.destinationZoneId = Objects.requireNonNull($.destinationZoneId, "expected parameter 'destinationZoneId' to be non-null");
            $.sourceRegionId = Objects.requireNonNull($.sourceRegionId, "expected parameter 'sourceRegionId' to be non-null");
            $.sourceZoneId = Objects.requireNonNull($.sourceZoneId, "expected parameter 'sourceZoneId' to be non-null");
            return $;
        }
    }

}