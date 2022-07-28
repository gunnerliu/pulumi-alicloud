// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.inputs;

import com.pulumi.alicloud.oss.inputs.BucketReplicationDestinationArgs;
import com.pulumi.alicloud.oss.inputs.BucketReplicationEncryptionConfigurationArgs;
import com.pulumi.alicloud.oss.inputs.BucketReplicationPrefixSetArgs;
import com.pulumi.alicloud.oss.inputs.BucketReplicationProgressArgs;
import com.pulumi.alicloud.oss.inputs.BucketReplicationSourceSelectionCriteriaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketReplicationState extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationState Empty = new BucketReplicationState();

    /**
     * The operations that can be synchronized to the destination bucket. You can set action to one or more of the following operation types. Valid values: `ALL`(contains PUT, DELETE, and ABORT), `PUT`, `DELETE` and `ABORT`. Defaults to `ALL`.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return The operations that can be synchronized to the destination bucket. You can set action to one or more of the following operation types. Valid values: `ALL`(contains PUT, DELETE, and ABORT), `PUT`, `DELETE` and `ABORT`. Defaults to `ALL`.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * The name of the bucket.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Specifies the destination for the rule(See the following block `destination`).
     * 
     */
    @Import(name="destination")
    private @Nullable Output<BucketReplicationDestinationArgs> destination;

    /**
     * @return Specifies the destination for the rule(See the following block `destination`).
     * 
     */
    public Optional<Output<BucketReplicationDestinationArgs>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * Specifies the encryption configuration for the objects replicated to the destination bucket(See the following block `encryption_configuration`).
     * 
     */
    @Import(name="encryptionConfiguration")
    private @Nullable Output<BucketReplicationEncryptionConfigurationArgs> encryptionConfiguration;

    /**
     * @return Specifies the encryption configuration for the objects replicated to the destination bucket(See the following block `encryption_configuration`).
     * 
     */
    public Optional<Output<BucketReplicationEncryptionConfigurationArgs>> encryptionConfiguration() {
        return Optional.ofNullable(this.encryptionConfiguration);
    }

    /**
     * Specifies whether to replicate historical data from the source bucket to the destination bucket before data replication is enabled. Can be `enabled` or `disabled`. Defaults to `enabled`.
     * 
     */
    @Import(name="historicalObjectReplication")
    private @Nullable Output<String> historicalObjectReplication;

    /**
     * @return Specifies whether to replicate historical data from the source bucket to the destination bucket before data replication is enabled. Can be `enabled` or `disabled`. Defaults to `enabled`.
     * 
     */
    public Optional<Output<String>> historicalObjectReplication() {
        return Optional.ofNullable(this.historicalObjectReplication);
    }

    /**
     * The prefixes used to specify the object to replicate. Only objects that match the prefix are replicated to the destination bucket(See the following block `prefix_set`).
     * 
     */
    @Import(name="prefixSet")
    private @Nullable Output<BucketReplicationPrefixSetArgs> prefixSet;

    /**
     * @return The prefixes used to specify the object to replicate. Only objects that match the prefix are replicated to the destination bucket(See the following block `prefix_set`).
     * 
     */
    public Optional<Output<BucketReplicationPrefixSetArgs>> prefixSet() {
        return Optional.ofNullable(this.prefixSet);
    }

    /**
     * Retrieves the progress of the data replication task. This status is returned only when the data replication task is in the doing state.
     * 
     */
    @Import(name="progress")
    private @Nullable Output<BucketReplicationProgressArgs> progress;

    /**
     * @return Retrieves the progress of the data replication task. This status is returned only when the data replication task is in the doing state.
     * 
     */
    public Optional<Output<BucketReplicationProgressArgs>> progress() {
        return Optional.ofNullable(this.progress);
    }

    /**
     * The ID of the data replication rule.
     * 
     */
    @Import(name="ruleId")
    private @Nullable Output<String> ruleId;

    /**
     * @return The ID of the data replication rule.
     * 
     */
    public Optional<Output<String>> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    /**
     * Specifies other conditions used to filter the source objects to replicate(See the following block `source_selection_criteria`).
     * 
     */
    @Import(name="sourceSelectionCriteria")
    private @Nullable Output<BucketReplicationSourceSelectionCriteriaArgs> sourceSelectionCriteria;

    /**
     * @return Specifies other conditions used to filter the source objects to replicate(See the following block `source_selection_criteria`).
     * 
     */
    public Optional<Output<BucketReplicationSourceSelectionCriteriaArgs>> sourceSelectionCriteria() {
        return Optional.ofNullable(this.sourceSelectionCriteria);
    }

    /**
     * Specifies whether to replicate objects encrypted by using SSE-KMS. Can be `Enabled` or `Disabled`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Specifies whether to replicate objects encrypted by using SSE-KMS. Can be `Enabled` or `Disabled`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Specifies the role that you authorize OSS to use to replicate data. If SSE-KMS is specified to encrypt the objects replicated to the destination bucket, it must be specified.
     * 
     */
    @Import(name="syncRole")
    private @Nullable Output<String> syncRole;

    /**
     * @return Specifies the role that you authorize OSS to use to replicate data. If SSE-KMS is specified to encrypt the objects replicated to the destination bucket, it must be specified.
     * 
     */
    public Optional<Output<String>> syncRole() {
        return Optional.ofNullable(this.syncRole);
    }

    private BucketReplicationState() {}

    private BucketReplicationState(BucketReplicationState $) {
        this.action = $.action;
        this.bucket = $.bucket;
        this.destination = $.destination;
        this.encryptionConfiguration = $.encryptionConfiguration;
        this.historicalObjectReplication = $.historicalObjectReplication;
        this.prefixSet = $.prefixSet;
        this.progress = $.progress;
        this.ruleId = $.ruleId;
        this.sourceSelectionCriteria = $.sourceSelectionCriteria;
        this.status = $.status;
        this.syncRole = $.syncRole;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationState $;

        public Builder() {
            $ = new BucketReplicationState();
        }

        public Builder(BucketReplicationState defaults) {
            $ = new BucketReplicationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The operations that can be synchronized to the destination bucket. You can set action to one or more of the following operation types. Valid values: `ALL`(contains PUT, DELETE, and ABORT), `PUT`, `DELETE` and `ABORT`. Defaults to `ALL`.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The operations that can be synchronized to the destination bucket. You can set action to one or more of the following operation types. Valid values: `ALL`(contains PUT, DELETE, and ABORT), `PUT`, `DELETE` and `ABORT`. Defaults to `ALL`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param destination Specifies the destination for the rule(See the following block `destination`).
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<BucketReplicationDestinationArgs> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination Specifies the destination for the rule(See the following block `destination`).
         * 
         * @return builder
         * 
         */
        public Builder destination(BucketReplicationDestinationArgs destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param encryptionConfiguration Specifies the encryption configuration for the objects replicated to the destination bucket(See the following block `encryption_configuration`).
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfiguration(@Nullable Output<BucketReplicationEncryptionConfigurationArgs> encryptionConfiguration) {
            $.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        /**
         * @param encryptionConfiguration Specifies the encryption configuration for the objects replicated to the destination bucket(See the following block `encryption_configuration`).
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfiguration(BucketReplicationEncryptionConfigurationArgs encryptionConfiguration) {
            return encryptionConfiguration(Output.of(encryptionConfiguration));
        }

        /**
         * @param historicalObjectReplication Specifies whether to replicate historical data from the source bucket to the destination bucket before data replication is enabled. Can be `enabled` or `disabled`. Defaults to `enabled`.
         * 
         * @return builder
         * 
         */
        public Builder historicalObjectReplication(@Nullable Output<String> historicalObjectReplication) {
            $.historicalObjectReplication = historicalObjectReplication;
            return this;
        }

        /**
         * @param historicalObjectReplication Specifies whether to replicate historical data from the source bucket to the destination bucket before data replication is enabled. Can be `enabled` or `disabled`. Defaults to `enabled`.
         * 
         * @return builder
         * 
         */
        public Builder historicalObjectReplication(String historicalObjectReplication) {
            return historicalObjectReplication(Output.of(historicalObjectReplication));
        }

        /**
         * @param prefixSet The prefixes used to specify the object to replicate. Only objects that match the prefix are replicated to the destination bucket(See the following block `prefix_set`).
         * 
         * @return builder
         * 
         */
        public Builder prefixSet(@Nullable Output<BucketReplicationPrefixSetArgs> prefixSet) {
            $.prefixSet = prefixSet;
            return this;
        }

        /**
         * @param prefixSet The prefixes used to specify the object to replicate. Only objects that match the prefix are replicated to the destination bucket(See the following block `prefix_set`).
         * 
         * @return builder
         * 
         */
        public Builder prefixSet(BucketReplicationPrefixSetArgs prefixSet) {
            return prefixSet(Output.of(prefixSet));
        }

        /**
         * @param progress Retrieves the progress of the data replication task. This status is returned only when the data replication task is in the doing state.
         * 
         * @return builder
         * 
         */
        public Builder progress(@Nullable Output<BucketReplicationProgressArgs> progress) {
            $.progress = progress;
            return this;
        }

        /**
         * @param progress Retrieves the progress of the data replication task. This status is returned only when the data replication task is in the doing state.
         * 
         * @return builder
         * 
         */
        public Builder progress(BucketReplicationProgressArgs progress) {
            return progress(Output.of(progress));
        }

        /**
         * @param ruleId The ID of the data replication rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(@Nullable Output<String> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        /**
         * @param ruleId The ID of the data replication rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(String ruleId) {
            return ruleId(Output.of(ruleId));
        }

        /**
         * @param sourceSelectionCriteria Specifies other conditions used to filter the source objects to replicate(See the following block `source_selection_criteria`).
         * 
         * @return builder
         * 
         */
        public Builder sourceSelectionCriteria(@Nullable Output<BucketReplicationSourceSelectionCriteriaArgs> sourceSelectionCriteria) {
            $.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }

        /**
         * @param sourceSelectionCriteria Specifies other conditions used to filter the source objects to replicate(See the following block `source_selection_criteria`).
         * 
         * @return builder
         * 
         */
        public Builder sourceSelectionCriteria(BucketReplicationSourceSelectionCriteriaArgs sourceSelectionCriteria) {
            return sourceSelectionCriteria(Output.of(sourceSelectionCriteria));
        }

        /**
         * @param status Specifies whether to replicate objects encrypted by using SSE-KMS. Can be `Enabled` or `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Specifies whether to replicate objects encrypted by using SSE-KMS. Can be `Enabled` or `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param syncRole Specifies the role that you authorize OSS to use to replicate data. If SSE-KMS is specified to encrypt the objects replicated to the destination bucket, it must be specified.
         * 
         * @return builder
         * 
         */
        public Builder syncRole(@Nullable Output<String> syncRole) {
            $.syncRole = syncRole;
            return this;
        }

        /**
         * @param syncRole Specifies the role that you authorize OSS to use to replicate data. If SSE-KMS is specified to encrypt the objects replicated to the destination bucket, it must be specified.
         * 
         * @return builder
         * 
         */
        public Builder syncRole(String syncRole) {
            return syncRole(Output.of(syncRole));
        }

        public BucketReplicationState build() {
            return $;
        }
    }

}
