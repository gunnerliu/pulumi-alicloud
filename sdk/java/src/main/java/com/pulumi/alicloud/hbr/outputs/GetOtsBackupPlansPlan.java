// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.outputs;

import com.pulumi.alicloud.hbr.outputs.GetOtsBackupPlansPlanOtsDetail;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOtsBackupPlansPlan {
    /**
     * @return The Backup type. Valid values: `COMPLETE`.
     * 
     */
    private String backupType;
    /**
     * @return The creation time of the backup plan. UNIX time in seconds.
     * 
     */
    private String createdTime;
    /**
     * @return Whether to be suspended. Valid values: `true`, `false`.
     * 
     */
    private Boolean disabled;
    /**
     * @return The ID of ots backup plan.
     * 
     */
    private String id;
    /**
     * @return The ID of ots backup plan.
     * 
     */
    private String otsBackupPlanId;
    /**
     * @return The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     * 
     */
    private String otsBackupPlanName;
    private List<GetOtsBackupPlansPlanOtsDetail> otsDetails;
    /**
     * @return The Backup retention days, the minimum is 1.
     * 
     */
    private String retention;
    /**
     * @return The Backup strategy. Optional format: I|{startTime}|{interval}. It means to execute a backup task every {interval} starting from {startTime}. The backup task for the elapsed time will not be compensated. If the last backup task is not completed yet, the next backup task will not be triggered.
     * 
     */
    private String schedule;
    /**
     * @return The type of the data source.
     * 
     */
    private String sourceType;
    /**
     * @return The update time of the backup plan. UNIX time in seconds.
     * *ots_detail - The details about the Tablestore instance.
     * 
     */
    private String updatedTime;
    /**
     * @return The ID of backup vault.
     * 
     */
    private String vaultId;

    private GetOtsBackupPlansPlan() {}
    /**
     * @return The Backup type. Valid values: `COMPLETE`.
     * 
     */
    public String backupType() {
        return this.backupType;
    }
    /**
     * @return The creation time of the backup plan. UNIX time in seconds.
     * 
     */
    public String createdTime() {
        return this.createdTime;
    }
    /**
     * @return Whether to be suspended. Valid values: `true`, `false`.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return The ID of ots backup plan.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of ots backup plan.
     * 
     */
    public String otsBackupPlanId() {
        return this.otsBackupPlanId;
    }
    /**
     * @return The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     * 
     */
    public String otsBackupPlanName() {
        return this.otsBackupPlanName;
    }
    public List<GetOtsBackupPlansPlanOtsDetail> otsDetails() {
        return this.otsDetails;
    }
    /**
     * @return The Backup retention days, the minimum is 1.
     * 
     */
    public String retention() {
        return this.retention;
    }
    /**
     * @return The Backup strategy. Optional format: I|{startTime}|{interval}. It means to execute a backup task every {interval} starting from {startTime}. The backup task for the elapsed time will not be compensated. If the last backup task is not completed yet, the next backup task will not be triggered.
     * 
     */
    public String schedule() {
        return this.schedule;
    }
    /**
     * @return The type of the data source.
     * 
     */
    public String sourceType() {
        return this.sourceType;
    }
    /**
     * @return The update time of the backup plan. UNIX time in seconds.
     * *ots_detail - The details about the Tablestore instance.
     * 
     */
    public String updatedTime() {
        return this.updatedTime;
    }
    /**
     * @return The ID of backup vault.
     * 
     */
    public String vaultId() {
        return this.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOtsBackupPlansPlan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backupType;
        private String createdTime;
        private Boolean disabled;
        private String id;
        private String otsBackupPlanId;
        private String otsBackupPlanName;
        private List<GetOtsBackupPlansPlanOtsDetail> otsDetails;
        private String retention;
        private String schedule;
        private String sourceType;
        private String updatedTime;
        private String vaultId;
        public Builder() {}
        public Builder(GetOtsBackupPlansPlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupType = defaults.backupType;
    	      this.createdTime = defaults.createdTime;
    	      this.disabled = defaults.disabled;
    	      this.id = defaults.id;
    	      this.otsBackupPlanId = defaults.otsBackupPlanId;
    	      this.otsBackupPlanName = defaults.otsBackupPlanName;
    	      this.otsDetails = defaults.otsDetails;
    	      this.retention = defaults.retention;
    	      this.schedule = defaults.schedule;
    	      this.sourceType = defaults.sourceType;
    	      this.updatedTime = defaults.updatedTime;
    	      this.vaultId = defaults.vaultId;
        }

        @CustomType.Setter
        public Builder backupType(String backupType) {
            this.backupType = Objects.requireNonNull(backupType);
            return this;
        }
        @CustomType.Setter
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }
        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder otsBackupPlanId(String otsBackupPlanId) {
            this.otsBackupPlanId = Objects.requireNonNull(otsBackupPlanId);
            return this;
        }
        @CustomType.Setter
        public Builder otsBackupPlanName(String otsBackupPlanName) {
            this.otsBackupPlanName = Objects.requireNonNull(otsBackupPlanName);
            return this;
        }
        @CustomType.Setter
        public Builder otsDetails(List<GetOtsBackupPlansPlanOtsDetail> otsDetails) {
            this.otsDetails = Objects.requireNonNull(otsDetails);
            return this;
        }
        public Builder otsDetails(GetOtsBackupPlansPlanOtsDetail... otsDetails) {
            return otsDetails(List.of(otsDetails));
        }
        @CustomType.Setter
        public Builder retention(String retention) {
            this.retention = Objects.requireNonNull(retention);
            return this;
        }
        @CustomType.Setter
        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        @CustomType.Setter
        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        @CustomType.Setter
        public Builder updatedTime(String updatedTime) {
            this.updatedTime = Objects.requireNonNull(updatedTime);
            return this;
        }
        @CustomType.Setter
        public Builder vaultId(String vaultId) {
            this.vaultId = Objects.requireNonNull(vaultId);
            return this;
        }
        public GetOtsBackupPlansPlan build() {
            final var o = new GetOtsBackupPlansPlan();
            o.backupType = backupType;
            o.createdTime = createdTime;
            o.disabled = disabled;
            o.id = id;
            o.otsBackupPlanId = otsBackupPlanId;
            o.otsBackupPlanName = otsBackupPlanName;
            o.otsDetails = otsDetails;
            o.retention = retention;
            o.schedule = schedule;
            o.sourceType = sourceType;
            o.updatedTime = updatedTime;
            o.vaultId = vaultId;
            return o;
        }
    }
}
