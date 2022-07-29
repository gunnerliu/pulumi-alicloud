// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr;

import com.pulumi.alicloud.hbr.inputs.OtsBackupPlanOtsDetailArgs;
import com.pulumi.alicloud.hbr.inputs.OtsBackupPlanRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OtsBackupPlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final OtsBackupPlanArgs Empty = new OtsBackupPlanArgs();

    /**
     * The name of the tableStore instance. Valid values: `COMPLETE`, `INCREMENTAL`. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    @Import(name="backupType", required=true)
    private Output<String> backupType;

    /**
     * @return The name of the tableStore instance. Valid values: `COMPLETE`, `INCREMENTAL`. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    public Output<String> backupType() {
        return this.backupType;
    }

    /**
     * Whether to disable the backup task. Valid values: true, false.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Whether to disable the backup task. Valid values: true, false.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The name of the Table store instance. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return The name of the Table store instance. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     * 
     */
    @Import(name="otsBackupPlanName", required=true)
    private Output<String> otsBackupPlanName;

    /**
     * @return The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     * 
     */
    public Output<String> otsBackupPlanName() {
        return this.otsBackupPlanName;
    }

    /**
     * The details about the Table store instance. See the following `Block ots_detail`. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    @Import(name="otsDetails")
    private @Nullable Output<List<OtsBackupPlanOtsDetailArgs>> otsDetails;

    /**
     * @return The details about the Table store instance. See the following `Block ots_detail`. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    public Optional<Output<List<OtsBackupPlanOtsDetailArgs>>> otsDetails() {
        return Optional.ofNullable(this.otsDetails);
    }

    /**
     * Backup retention days, the minimum is 1. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    @Import(name="retention", required=true)
    private Output<String> retention;

    /**
     * @return Backup retention days, the minimum is 1. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    public Output<String> retention() {
        return this.retention;
    }

    /**
     * The backup plan rule. See the following `Block rules`. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<OtsBackupPlanRuleArgs>> rules;

    /**
     * @return The backup plan rule. See the following `Block rules`. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    public Optional<Output<List<OtsBackupPlanRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     * @deprecated
     * Field &#39;schedule&#39; has been deprecated from version 1.163.0. Use &#39;rules&#39; instead.
     * 
     */
    @Deprecated /* Field 'schedule' has been deprecated from version 1.163.0. Use 'rules' instead. */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    /**
     * @return Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     * @deprecated
     * Field &#39;schedule&#39; has been deprecated from version 1.163.0. Use &#39;rules&#39; instead.
     * 
     */
    @Deprecated /* Field 'schedule' has been deprecated from version 1.163.0. Use 'rules' instead. */
    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * The ID of backup vault.
     * 
     */
    @Import(name="vaultId")
    private @Nullable Output<String> vaultId;

    /**
     * @return The ID of backup vault.
     * 
     */
    public Optional<Output<String>> vaultId() {
        return Optional.ofNullable(this.vaultId);
    }

    private OtsBackupPlanArgs() {}

    private OtsBackupPlanArgs(OtsBackupPlanArgs $) {
        this.backupType = $.backupType;
        this.disabled = $.disabled;
        this.instanceName = $.instanceName;
        this.otsBackupPlanName = $.otsBackupPlanName;
        this.otsDetails = $.otsDetails;
        this.retention = $.retention;
        this.rules = $.rules;
        this.schedule = $.schedule;
        this.vaultId = $.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OtsBackupPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OtsBackupPlanArgs $;

        public Builder() {
            $ = new OtsBackupPlanArgs();
        }

        public Builder(OtsBackupPlanArgs defaults) {
            $ = new OtsBackupPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupType The name of the tableStore instance. Valid values: `COMPLETE`, `INCREMENTAL`. **Note:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder backupType(Output<String> backupType) {
            $.backupType = backupType;
            return this;
        }

        /**
         * @param backupType The name of the tableStore instance. Valid values: `COMPLETE`, `INCREMENTAL`. **Note:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder backupType(String backupType) {
            return backupType(Output.of(backupType));
        }

        /**
         * @param disabled Whether to disable the backup task. Valid values: true, false.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Whether to disable the backup task. Valid values: true, false.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param instanceName The name of the Table store instance. **Note:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName The name of the Table store instance. **Note:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param otsBackupPlanName The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
         * 
         * @return builder
         * 
         */
        public Builder otsBackupPlanName(Output<String> otsBackupPlanName) {
            $.otsBackupPlanName = otsBackupPlanName;
            return this;
        }

        /**
         * @param otsBackupPlanName The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
         * 
         * @return builder
         * 
         */
        public Builder otsBackupPlanName(String otsBackupPlanName) {
            return otsBackupPlanName(Output.of(otsBackupPlanName));
        }

        /**
         * @param otsDetails The details about the Table store instance. See the following `Block ots_detail`. **Note:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder otsDetails(@Nullable Output<List<OtsBackupPlanOtsDetailArgs>> otsDetails) {
            $.otsDetails = otsDetails;
            return this;
        }

        /**
         * @param otsDetails The details about the Table store instance. See the following `Block ots_detail`. **Note:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder otsDetails(List<OtsBackupPlanOtsDetailArgs> otsDetails) {
            return otsDetails(Output.of(otsDetails));
        }

        /**
         * @param otsDetails The details about the Table store instance. See the following `Block ots_detail`. **Note:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder otsDetails(OtsBackupPlanOtsDetailArgs... otsDetails) {
            return otsDetails(List.of(otsDetails));
        }

        /**
         * @param retention Backup retention days, the minimum is 1. **Note:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder retention(Output<String> retention) {
            $.retention = retention;
            return this;
        }

        /**
         * @param retention Backup retention days, the minimum is 1. **Note:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder retention(String retention) {
            return retention(Output.of(retention));
        }

        /**
         * @param rules The backup plan rule. See the following `Block rules`. **Note:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<OtsBackupPlanRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules The backup plan rule. See the following `Block rules`. **Note:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<OtsBackupPlanRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules The backup plan rule. See the following `Block rules`. **Note:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder rules(OtsBackupPlanRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param schedule Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered. **Note:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;schedule&#39; has been deprecated from version 1.163.0. Use &#39;rules&#39; instead.
         * 
         */
        @Deprecated /* Field 'schedule' has been deprecated from version 1.163.0. Use 'rules' instead. */
        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered. **Note:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;schedule&#39; has been deprecated from version 1.163.0. Use &#39;rules&#39; instead.
         * 
         */
        @Deprecated /* Field 'schedule' has been deprecated from version 1.163.0. Use 'rules' instead. */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param vaultId The ID of backup vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(@Nullable Output<String> vaultId) {
            $.vaultId = vaultId;
            return this;
        }

        /**
         * @param vaultId The ID of backup vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(String vaultId) {
            return vaultId(Output.of(vaultId));
        }

        public OtsBackupPlanArgs build() {
            $.backupType = Objects.requireNonNull($.backupType, "expected parameter 'backupType' to be non-null");
            $.otsBackupPlanName = Objects.requireNonNull($.otsBackupPlanName, "expected parameter 'otsBackupPlanName' to be non-null");
            $.retention = Objects.requireNonNull($.retention, "expected parameter 'retention' to be non-null");
            return $;
        }
    }

}
