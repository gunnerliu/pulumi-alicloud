// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RdsInstanceCrossBackupPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final RdsInstanceCrossBackupPolicyState Empty = new RdsInstanceCrossBackupPolicyState();

    /**
     * The status of the overall cross-region backup switch on the instance. Valid values:
     * - Disabled
     * - Enable
     * 
     */
    @Import(name="backupEnabled")
    private @Nullable Output<String> backupEnabled;

    /**
     * @return The status of the overall cross-region backup switch on the instance. Valid values:
     * - Disabled
     * - Enable
     * 
     */
    public Optional<Output<String>> backupEnabled() {
        return Optional.ofNullable(this.backupEnabled);
    }

    /**
     * The time when cross-region backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
     * 
     */
    @Import(name="backupEnabledTime")
    private @Nullable Output<String> backupEnabledTime;

    /**
     * @return The time when cross-region backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
     * 
     */
    public Optional<Output<String>> backupEnabledTime() {
        return Optional.ofNullable(this.backupEnabledTime);
    }

    /**
     * The ID of the destination region where the cross-region backup files of the instance are stored.
     * 
     */
    @Import(name="crossBackupRegion")
    private @Nullable Output<String> crossBackupRegion;

    /**
     * @return The ID of the destination region where the cross-region backup files of the instance are stored.
     * 
     */
    public Optional<Output<String>> crossBackupRegion() {
        return Optional.ofNullable(this.crossBackupRegion);
    }

    /**
     * The policy that is used to save cross-region backups of the instance. Default value: 1. The default value 1 indicates that all cross-region backups are saved.
     * 
     */
    @Import(name="crossBackupType")
    private @Nullable Output<String> crossBackupType;

    /**
     * @return The policy that is used to save cross-region backups of the instance. Default value: 1. The default value 1 indicates that all cross-region backups are saved.
     * 
     */
    public Optional<Output<String>> crossBackupType() {
        return Optional.ofNullable(this.crossBackupType);
    }

    /**
     * The state of the instance. For more information, see Instance status.
     * 
     */
    @Import(name="dbInstanceStatus")
    private @Nullable Output<String> dbInstanceStatus;

    /**
     * @return The state of the instance. For more information, see Instance status.
     * 
     */
    public Optional<Output<String>> dbInstanceStatus() {
        return Optional.ofNullable(this.dbInstanceStatus);
    }

    /**
     * The ID of the instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The ID of the instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The lock status of the instance. Valid values:
     * - Unlock: The instance is not locked.
     * - ManualLock: The instance is manually locked.
     * - LockByExpiration: The instance is locked upon expiration.
     * - LockByRestoration: The instance is automatically locked before a rollback.
     * - LockByDiskQuota: The instance is automatically locked because its storage space is exhausted. In this situation, the instance is inaccessible.
     * 
     */
    @Import(name="lockMode")
    private @Nullable Output<String> lockMode;

    /**
     * @return The lock status of the instance. Valid values:
     * - Unlock: The instance is not locked.
     * - ManualLock: The instance is manually locked.
     * - LockByExpiration: The instance is locked upon expiration.
     * - LockByRestoration: The instance is automatically locked before a rollback.
     * - LockByDiskQuota: The instance is automatically locked because its storage space is exhausted. In this situation, the instance is inaccessible.
     * 
     */
    public Optional<Output<String>> lockMode() {
        return Optional.ofNullable(this.lockMode);
    }

    /**
     * The status of the cross-region log backup feature on the instance. Valid values:
     * - Enable: Enables the feature.
     * - Disabled: Disables the feature.
     * 
     */
    @Import(name="logBackupEnabled")
    private @Nullable Output<String> logBackupEnabled;

    /**
     * @return The status of the cross-region log backup feature on the instance. Valid values:
     * - Enable: Enables the feature.
     * - Disabled: Disables the feature.
     * 
     */
    public Optional<Output<String>> logBackupEnabled() {
        return Optional.ofNullable(this.logBackupEnabled);
    }

    /**
     * The time when cross-region log backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
     * 
     */
    @Import(name="logBackupEnabledTime")
    private @Nullable Output<String> logBackupEnabledTime;

    /**
     * @return The time when cross-region log backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
     * 
     */
    public Optional<Output<String>> logBackupEnabledTime() {
        return Optional.ofNullable(this.logBackupEnabledTime);
    }

    /**
     * The policy that is used to retain cross-region backups of the instance. Default value: 1. The default value 1 indicate that cross-region backups are retained based on the specified retention period.
     * 
     */
    @Import(name="retentType")
    private @Nullable Output<String> retentType;

    /**
     * @return The policy that is used to retain cross-region backups of the instance. Default value: 1. The default value 1 indicate that cross-region backups are retained based on the specified retention period.
     * 
     */
    public Optional<Output<String>> retentType() {
        return Optional.ofNullable(this.retentType);
    }

    /**
     * The number of days for which the cross-region backup files of the instance are retained. Valid values: 7 to 1825. Default value: 7.
     * 
     */
    @Import(name="retention")
    private @Nullable Output<Integer> retention;

    /**
     * @return The number of days for which the cross-region backup files of the instance are retained. Valid values: 7 to 1825. Default value: 7.
     * 
     */
    public Optional<Output<Integer>> retention() {
        return Optional.ofNullable(this.retention);
    }

    private RdsInstanceCrossBackupPolicyState() {}

    private RdsInstanceCrossBackupPolicyState(RdsInstanceCrossBackupPolicyState $) {
        this.backupEnabled = $.backupEnabled;
        this.backupEnabledTime = $.backupEnabledTime;
        this.crossBackupRegion = $.crossBackupRegion;
        this.crossBackupType = $.crossBackupType;
        this.dbInstanceStatus = $.dbInstanceStatus;
        this.instanceId = $.instanceId;
        this.lockMode = $.lockMode;
        this.logBackupEnabled = $.logBackupEnabled;
        this.logBackupEnabledTime = $.logBackupEnabledTime;
        this.retentType = $.retentType;
        this.retention = $.retention;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RdsInstanceCrossBackupPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RdsInstanceCrossBackupPolicyState $;

        public Builder() {
            $ = new RdsInstanceCrossBackupPolicyState();
        }

        public Builder(RdsInstanceCrossBackupPolicyState defaults) {
            $ = new RdsInstanceCrossBackupPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupEnabled The status of the overall cross-region backup switch on the instance. Valid values:
         * - Disabled
         * - Enable
         * 
         * @return builder
         * 
         */
        public Builder backupEnabled(@Nullable Output<String> backupEnabled) {
            $.backupEnabled = backupEnabled;
            return this;
        }

        /**
         * @param backupEnabled The status of the overall cross-region backup switch on the instance. Valid values:
         * - Disabled
         * - Enable
         * 
         * @return builder
         * 
         */
        public Builder backupEnabled(String backupEnabled) {
            return backupEnabled(Output.of(backupEnabled));
        }

        /**
         * @param backupEnabledTime The time when cross-region backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
         * 
         * @return builder
         * 
         */
        public Builder backupEnabledTime(@Nullable Output<String> backupEnabledTime) {
            $.backupEnabledTime = backupEnabledTime;
            return this;
        }

        /**
         * @param backupEnabledTime The time when cross-region backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
         * 
         * @return builder
         * 
         */
        public Builder backupEnabledTime(String backupEnabledTime) {
            return backupEnabledTime(Output.of(backupEnabledTime));
        }

        /**
         * @param crossBackupRegion The ID of the destination region where the cross-region backup files of the instance are stored.
         * 
         * @return builder
         * 
         */
        public Builder crossBackupRegion(@Nullable Output<String> crossBackupRegion) {
            $.crossBackupRegion = crossBackupRegion;
            return this;
        }

        /**
         * @param crossBackupRegion The ID of the destination region where the cross-region backup files of the instance are stored.
         * 
         * @return builder
         * 
         */
        public Builder crossBackupRegion(String crossBackupRegion) {
            return crossBackupRegion(Output.of(crossBackupRegion));
        }

        /**
         * @param crossBackupType The policy that is used to save cross-region backups of the instance. Default value: 1. The default value 1 indicates that all cross-region backups are saved.
         * 
         * @return builder
         * 
         */
        public Builder crossBackupType(@Nullable Output<String> crossBackupType) {
            $.crossBackupType = crossBackupType;
            return this;
        }

        /**
         * @param crossBackupType The policy that is used to save cross-region backups of the instance. Default value: 1. The default value 1 indicates that all cross-region backups are saved.
         * 
         * @return builder
         * 
         */
        public Builder crossBackupType(String crossBackupType) {
            return crossBackupType(Output.of(crossBackupType));
        }

        /**
         * @param dbInstanceStatus The state of the instance. For more information, see Instance status.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceStatus(@Nullable Output<String> dbInstanceStatus) {
            $.dbInstanceStatus = dbInstanceStatus;
            return this;
        }

        /**
         * @param dbInstanceStatus The state of the instance. For more information, see Instance status.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceStatus(String dbInstanceStatus) {
            return dbInstanceStatus(Output.of(dbInstanceStatus));
        }

        /**
         * @param instanceId The ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param lockMode The lock status of the instance. Valid values:
         * - Unlock: The instance is not locked.
         * - ManualLock: The instance is manually locked.
         * - LockByExpiration: The instance is locked upon expiration.
         * - LockByRestoration: The instance is automatically locked before a rollback.
         * - LockByDiskQuota: The instance is automatically locked because its storage space is exhausted. In this situation, the instance is inaccessible.
         * 
         * @return builder
         * 
         */
        public Builder lockMode(@Nullable Output<String> lockMode) {
            $.lockMode = lockMode;
            return this;
        }

        /**
         * @param lockMode The lock status of the instance. Valid values:
         * - Unlock: The instance is not locked.
         * - ManualLock: The instance is manually locked.
         * - LockByExpiration: The instance is locked upon expiration.
         * - LockByRestoration: The instance is automatically locked before a rollback.
         * - LockByDiskQuota: The instance is automatically locked because its storage space is exhausted. In this situation, the instance is inaccessible.
         * 
         * @return builder
         * 
         */
        public Builder lockMode(String lockMode) {
            return lockMode(Output.of(lockMode));
        }

        /**
         * @param logBackupEnabled The status of the cross-region log backup feature on the instance. Valid values:
         * - Enable: Enables the feature.
         * - Disabled: Disables the feature.
         * 
         * @return builder
         * 
         */
        public Builder logBackupEnabled(@Nullable Output<String> logBackupEnabled) {
            $.logBackupEnabled = logBackupEnabled;
            return this;
        }

        /**
         * @param logBackupEnabled The status of the cross-region log backup feature on the instance. Valid values:
         * - Enable: Enables the feature.
         * - Disabled: Disables the feature.
         * 
         * @return builder
         * 
         */
        public Builder logBackupEnabled(String logBackupEnabled) {
            return logBackupEnabled(Output.of(logBackupEnabled));
        }

        /**
         * @param logBackupEnabledTime The time when cross-region log backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
         * 
         * @return builder
         * 
         */
        public Builder logBackupEnabledTime(@Nullable Output<String> logBackupEnabledTime) {
            $.logBackupEnabledTime = logBackupEnabledTime;
            return this;
        }

        /**
         * @param logBackupEnabledTime The time when cross-region log backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
         * 
         * @return builder
         * 
         */
        public Builder logBackupEnabledTime(String logBackupEnabledTime) {
            return logBackupEnabledTime(Output.of(logBackupEnabledTime));
        }

        /**
         * @param retentType The policy that is used to retain cross-region backups of the instance. Default value: 1. The default value 1 indicate that cross-region backups are retained based on the specified retention period.
         * 
         * @return builder
         * 
         */
        public Builder retentType(@Nullable Output<String> retentType) {
            $.retentType = retentType;
            return this;
        }

        /**
         * @param retentType The policy that is used to retain cross-region backups of the instance. Default value: 1. The default value 1 indicate that cross-region backups are retained based on the specified retention period.
         * 
         * @return builder
         * 
         */
        public Builder retentType(String retentType) {
            return retentType(Output.of(retentType));
        }

        /**
         * @param retention The number of days for which the cross-region backup files of the instance are retained. Valid values: 7 to 1825. Default value: 7.
         * 
         * @return builder
         * 
         */
        public Builder retention(@Nullable Output<Integer> retention) {
            $.retention = retention;
            return this;
        }

        /**
         * @param retention The number of days for which the cross-region backup files of the instance are retained. Valid values: 7 to 1825. Default value: 7.
         * 
         * @return builder
         * 
         */
        public Builder retention(Integer retention) {
            return retention(Output.of(retention));
        }

        public RdsInstanceCrossBackupPolicyState build() {
            return $;
        }
    }

}
