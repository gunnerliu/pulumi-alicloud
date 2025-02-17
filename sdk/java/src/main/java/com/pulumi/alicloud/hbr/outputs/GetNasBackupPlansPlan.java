// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNasBackupPlansPlan {
    /**
     * @return Backup type. Valid values: `COMPLETE`.
     * 
     */
    private String backupType;
    /**
     * @return File System Creation Time. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST`.
     * 
     */
    private String createTime;
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
     * @return The File System ID of Nas.
     * 
     */
    private String fileSystemId;
    /**
     * @return The ID of Nas backup plan.
     * 
     */
    private String id;
    /**
     * @return The ID of Nas backup plan.
     * 
     */
    private String nasBackupPlanId;
    /**
     * @return The name of the resource.
     * 
     */
    private String nasBackupPlanName;
    /**
     * @return Options field of Nas backup plan.
     * 
     */
    private String options;
    /**
     * @return List of backup path. Up to 65536 Characters. e.g.`[&#34;/home&#34;, &#34;/var&#34;]`
     * 
     */
    private List<String> paths;
    /**
     * @return Backup retention days, the minimum is 1.
     * 
     */
    private String retention;
    /**
     * @return Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
     * 
     */
    private String schedule;
    /**
     * @return The update time of the backup plan. UNIX time in seconds.
     * 
     */
    private String updatedTime;
    /**
     * @return The ID of backup vault.
     * 
     */
    private String vaultId;

    private GetNasBackupPlansPlan() {}
    /**
     * @return Backup type. Valid values: `COMPLETE`.
     * 
     */
    public String backupType() {
        return this.backupType;
    }
    /**
     * @return File System Creation Time. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST`.
     * 
     */
    public String createTime() {
        return this.createTime;
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
     * @return The File System ID of Nas.
     * 
     */
    public String fileSystemId() {
        return this.fileSystemId;
    }
    /**
     * @return The ID of Nas backup plan.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of Nas backup plan.
     * 
     */
    public String nasBackupPlanId() {
        return this.nasBackupPlanId;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String nasBackupPlanName() {
        return this.nasBackupPlanName;
    }
    /**
     * @return Options field of Nas backup plan.
     * 
     */
    public String options() {
        return this.options;
    }
    /**
     * @return List of backup path. Up to 65536 Characters. e.g.`[&#34;/home&#34;, &#34;/var&#34;]`
     * 
     */
    public List<String> paths() {
        return this.paths;
    }
    /**
     * @return Backup retention days, the minimum is 1.
     * 
     */
    public String retention() {
        return this.retention;
    }
    /**
     * @return Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
     * 
     */
    public String schedule() {
        return this.schedule;
    }
    /**
     * @return The update time of the backup plan. UNIX time in seconds.
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

    public static Builder builder(GetNasBackupPlansPlan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backupType;
        private String createTime;
        private String createdTime;
        private Boolean disabled;
        private String fileSystemId;
        private String id;
        private String nasBackupPlanId;
        private String nasBackupPlanName;
        private String options;
        private List<String> paths;
        private String retention;
        private String schedule;
        private String updatedTime;
        private String vaultId;
        public Builder() {}
        public Builder(GetNasBackupPlansPlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupType = defaults.backupType;
    	      this.createTime = defaults.createTime;
    	      this.createdTime = defaults.createdTime;
    	      this.disabled = defaults.disabled;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.id = defaults.id;
    	      this.nasBackupPlanId = defaults.nasBackupPlanId;
    	      this.nasBackupPlanName = defaults.nasBackupPlanName;
    	      this.options = defaults.options;
    	      this.paths = defaults.paths;
    	      this.retention = defaults.retention;
    	      this.schedule = defaults.schedule;
    	      this.updatedTime = defaults.updatedTime;
    	      this.vaultId = defaults.vaultId;
        }

        @CustomType.Setter
        public Builder backupType(String backupType) {
            if (backupType == null) {
              throw new MissingRequiredPropertyException("GetNasBackupPlansPlan", "backupType");
            }
            this.backupType = backupType;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetNasBackupPlansPlan", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder createdTime(String createdTime) {
            if (createdTime == null) {
              throw new MissingRequiredPropertyException("GetNasBackupPlansPlan", "createdTime");
            }
            this.createdTime = createdTime;
            return this;
        }
        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            if (disabled == null) {
              throw new MissingRequiredPropertyException("GetNasBackupPlansPlan", "disabled");
            }
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder fileSystemId(String fileSystemId) {
            if (fileSystemId == null) {
              throw new MissingRequiredPropertyException("GetNasBackupPlansPlan", "fileSystemId");
            }
            this.fileSystemId = fileSystemId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNasBackupPlansPlan", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder nasBackupPlanId(String nasBackupPlanId) {
            if (nasBackupPlanId == null) {
              throw new MissingRequiredPropertyException("GetNasBackupPlansPlan", "nasBackupPlanId");
            }
            this.nasBackupPlanId = nasBackupPlanId;
            return this;
        }
        @CustomType.Setter
        public Builder nasBackupPlanName(String nasBackupPlanName) {
            if (nasBackupPlanName == null) {
              throw new MissingRequiredPropertyException("GetNasBackupPlansPlan", "nasBackupPlanName");
            }
            this.nasBackupPlanName = nasBackupPlanName;
            return this;
        }
        @CustomType.Setter
        public Builder options(String options) {
            if (options == null) {
              throw new MissingRequiredPropertyException("GetNasBackupPlansPlan", "options");
            }
            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder paths(List<String> paths) {
            if (paths == null) {
              throw new MissingRequiredPropertyException("GetNasBackupPlansPlan", "paths");
            }
            this.paths = paths;
            return this;
        }
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }
        @CustomType.Setter
        public Builder retention(String retention) {
            if (retention == null) {
              throw new MissingRequiredPropertyException("GetNasBackupPlansPlan", "retention");
            }
            this.retention = retention;
            return this;
        }
        @CustomType.Setter
        public Builder schedule(String schedule) {
            if (schedule == null) {
              throw new MissingRequiredPropertyException("GetNasBackupPlansPlan", "schedule");
            }
            this.schedule = schedule;
            return this;
        }
        @CustomType.Setter
        public Builder updatedTime(String updatedTime) {
            if (updatedTime == null) {
              throw new MissingRequiredPropertyException("GetNasBackupPlansPlan", "updatedTime");
            }
            this.updatedTime = updatedTime;
            return this;
        }
        @CustomType.Setter
        public Builder vaultId(String vaultId) {
            if (vaultId == null) {
              throw new MissingRequiredPropertyException("GetNasBackupPlansPlan", "vaultId");
            }
            this.vaultId = vaultId;
            return this;
        }
        public GetNasBackupPlansPlan build() {
            final var _resultValue = new GetNasBackupPlansPlan();
            _resultValue.backupType = backupType;
            _resultValue.createTime = createTime;
            _resultValue.createdTime = createdTime;
            _resultValue.disabled = disabled;
            _resultValue.fileSystemId = fileSystemId;
            _resultValue.id = id;
            _resultValue.nasBackupPlanId = nasBackupPlanId;
            _resultValue.nasBackupPlanName = nasBackupPlanName;
            _resultValue.options = options;
            _resultValue.paths = paths;
            _resultValue.retention = retention;
            _resultValue.schedule = schedule;
            _resultValue.updatedTime = updatedTime;
            _resultValue.vaultId = vaultId;
            return _resultValue;
        }
    }
}
