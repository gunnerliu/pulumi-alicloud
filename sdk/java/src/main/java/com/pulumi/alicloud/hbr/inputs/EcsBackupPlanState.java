// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EcsBackupPlanState extends com.pulumi.resources.ResourceArgs {

    public static final EcsBackupPlanState Empty = new EcsBackupPlanState();

    /**
     * Backup type. Valid values: `COMPLETE`.
     * 
     */
    @Import(name="backupType")
    private @Nullable Output<String> backupType;

    /**
     * @return Backup type. Valid values: `COMPLETE`.
     * 
     */
    public Optional<Output<String>> backupType() {
        return Optional.ofNullable(this.backupType);
    }

    /**
     * The detail of the backup plan.
     * 
     */
    @Import(name="detail")
    private @Nullable Output<String> detail;

    /**
     * @return The detail of the backup plan.
     * 
     */
    public Optional<Output<String>> detail() {
        return Optional.ofNullable(this.detail);
    }

    /**
     * Whether to disable the backup task. Valid values: `true`, `false`.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Whether to disable the backup task. Valid values: `true`, `false`.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     * 
     */
    @Import(name="ecsBackupPlanName")
    private @Nullable Output<String> ecsBackupPlanName;

    /**
     * @return The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     * 
     */
    public Optional<Output<String>> ecsBackupPlanName() {
        return Optional.ofNullable(this.ecsBackupPlanName);
    }

    /**
     * Exclude path. String of Json list, up to 255 characters. e.g. `&#34;[\&#34;/home/work\&#34;]&#34;`
     * 
     */
    @Import(name="exclude")
    private @Nullable Output<String> exclude;

    /**
     * @return Exclude path. String of Json list, up to 255 characters. e.g. `&#34;[\&#34;/home/work\&#34;]&#34;`
     * 
     */
    public Optional<Output<String>> exclude() {
        return Optional.ofNullable(this.exclude);
    }

    /**
     * Include path. String of Json list, up to 255 characters. e.g. `&#34;[\&#34;/var\&#34;]&#34;`
     * 
     */
    @Import(name="include")
    private @Nullable Output<String> include;

    /**
     * @return Include path. String of Json list, up to 255 characters. e.g. `&#34;[\&#34;/var\&#34;]&#34;`
     * 
     */
    public Optional<Output<String>> include() {
        return Optional.ofNullable(this.include);
    }

    /**
     * The ID of ECS instance. The ecs backup client must have been installed on the host.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The ID of ECS instance. The ecs backup client must have been installed on the host.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Windows operating system with application consistency using VSS, e.g: `{\&#34;UseVSS\&#34;:false}`.
     * 
     */
    @Import(name="options")
    private @Nullable Output<String> options;

    /**
     * @return Windows operating system with application consistency using VSS, e.g: `{\&#34;UseVSS\&#34;:false}`.
     * 
     */
    public Optional<Output<String>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * List of backup path. e.g. `[&#34;/home&#34;, &#34;/var&#34;]`. **Note** If `path` is empty, it means that all directories will be backed up.
     * 
     */
    @Import(name="paths")
    private @Nullable Output<List<String>> paths;

    /**
     * @return List of backup path. e.g. `[&#34;/home&#34;, &#34;/var&#34;]`. **Note** If `path` is empty, it means that all directories will be backed up.
     * 
     */
    public Optional<Output<List<String>>> paths() {
        return Optional.ofNullable(this.paths);
    }

    /**
     * Backup retention days, the minimum is 1.
     * 
     */
    @Import(name="retention")
    private @Nullable Output<String> retention;

    /**
     * @return Backup retention days, the minimum is 1.
     * 
     */
    public Optional<Output<String>> retention() {
        return Optional.ofNullable(this.retention);
    }

    /**
     * Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    /**
     * @return Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
     * 
     */
    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * Flow control. The format is: `{start}|{end}|{bandwidth}`. Use `|` to separate multiple flow control configurations, multiple flow control configurations not allowed to have overlapping times.
     * 
     */
    @Import(name="speedLimit")
    private @Nullable Output<String> speedLimit;

    /**
     * @return Flow control. The format is: `{start}|{end}|{bandwidth}`. Use `|` to separate multiple flow control configurations, multiple flow control configurations not allowed to have overlapping times.
     * 
     */
    public Optional<Output<String>> speedLimit() {
        return Optional.ofNullable(this.speedLimit);
    }

    /**
     * Attribute update_paths has been deprecated in v1.139.0+, and you do not need to set it anymore.
     * 
     * @deprecated
     * Attribute update_paths has been deprecated in v1.139.0+ and you do not need to set it anymore.
     * 
     */
    @Deprecated /* Attribute update_paths has been deprecated in v1.139.0+ and you do not need to set it anymore. */
    @Import(name="updatePaths")
    private @Nullable Output<Boolean> updatePaths;

    /**
     * @return Attribute update_paths has been deprecated in v1.139.0+, and you do not need to set it anymore.
     * 
     * @deprecated
     * Attribute update_paths has been deprecated in v1.139.0+ and you do not need to set it anymore.
     * 
     */
    @Deprecated /* Attribute update_paths has been deprecated in v1.139.0+ and you do not need to set it anymore. */
    public Optional<Output<Boolean>> updatePaths() {
        return Optional.ofNullable(this.updatePaths);
    }

    /**
     * The ID of Backup vault.
     * 
     */
    @Import(name="vaultId")
    private @Nullable Output<String> vaultId;

    /**
     * @return The ID of Backup vault.
     * 
     */
    public Optional<Output<String>> vaultId() {
        return Optional.ofNullable(this.vaultId);
    }

    private EcsBackupPlanState() {}

    private EcsBackupPlanState(EcsBackupPlanState $) {
        this.backupType = $.backupType;
        this.detail = $.detail;
        this.disabled = $.disabled;
        this.ecsBackupPlanName = $.ecsBackupPlanName;
        this.exclude = $.exclude;
        this.include = $.include;
        this.instanceId = $.instanceId;
        this.options = $.options;
        this.paths = $.paths;
        this.retention = $.retention;
        this.schedule = $.schedule;
        this.speedLimit = $.speedLimit;
        this.updatePaths = $.updatePaths;
        this.vaultId = $.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EcsBackupPlanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EcsBackupPlanState $;

        public Builder() {
            $ = new EcsBackupPlanState();
        }

        public Builder(EcsBackupPlanState defaults) {
            $ = new EcsBackupPlanState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupType Backup type. Valid values: `COMPLETE`.
         * 
         * @return builder
         * 
         */
        public Builder backupType(@Nullable Output<String> backupType) {
            $.backupType = backupType;
            return this;
        }

        /**
         * @param backupType Backup type. Valid values: `COMPLETE`.
         * 
         * @return builder
         * 
         */
        public Builder backupType(String backupType) {
            return backupType(Output.of(backupType));
        }

        /**
         * @param detail The detail of the backup plan.
         * 
         * @return builder
         * 
         */
        public Builder detail(@Nullable Output<String> detail) {
            $.detail = detail;
            return this;
        }

        /**
         * @param detail The detail of the backup plan.
         * 
         * @return builder
         * 
         */
        public Builder detail(String detail) {
            return detail(Output.of(detail));
        }

        /**
         * @param disabled Whether to disable the backup task. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Whether to disable the backup task. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param ecsBackupPlanName The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
         * 
         * @return builder
         * 
         */
        public Builder ecsBackupPlanName(@Nullable Output<String> ecsBackupPlanName) {
            $.ecsBackupPlanName = ecsBackupPlanName;
            return this;
        }

        /**
         * @param ecsBackupPlanName The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
         * 
         * @return builder
         * 
         */
        public Builder ecsBackupPlanName(String ecsBackupPlanName) {
            return ecsBackupPlanName(Output.of(ecsBackupPlanName));
        }

        /**
         * @param exclude Exclude path. String of Json list, up to 255 characters. e.g. `&#34;[\&#34;/home/work\&#34;]&#34;`
         * 
         * @return builder
         * 
         */
        public Builder exclude(@Nullable Output<String> exclude) {
            $.exclude = exclude;
            return this;
        }

        /**
         * @param exclude Exclude path. String of Json list, up to 255 characters. e.g. `&#34;[\&#34;/home/work\&#34;]&#34;`
         * 
         * @return builder
         * 
         */
        public Builder exclude(String exclude) {
            return exclude(Output.of(exclude));
        }

        /**
         * @param include Include path. String of Json list, up to 255 characters. e.g. `&#34;[\&#34;/var\&#34;]&#34;`
         * 
         * @return builder
         * 
         */
        public Builder include(@Nullable Output<String> include) {
            $.include = include;
            return this;
        }

        /**
         * @param include Include path. String of Json list, up to 255 characters. e.g. `&#34;[\&#34;/var\&#34;]&#34;`
         * 
         * @return builder
         * 
         */
        public Builder include(String include) {
            return include(Output.of(include));
        }

        /**
         * @param instanceId The ID of ECS instance. The ecs backup client must have been installed on the host.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of ECS instance. The ecs backup client must have been installed on the host.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param options Windows operating system with application consistency using VSS, e.g: `{\&#34;UseVSS\&#34;:false}`.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<String> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Windows operating system with application consistency using VSS, e.g: `{\&#34;UseVSS\&#34;:false}`.
         * 
         * @return builder
         * 
         */
        public Builder options(String options) {
            return options(Output.of(options));
        }

        /**
         * @param paths List of backup path. e.g. `[&#34;/home&#34;, &#34;/var&#34;]`. **Note** If `path` is empty, it means that all directories will be backed up.
         * 
         * @return builder
         * 
         */
        public Builder paths(@Nullable Output<List<String>> paths) {
            $.paths = paths;
            return this;
        }

        /**
         * @param paths List of backup path. e.g. `[&#34;/home&#34;, &#34;/var&#34;]`. **Note** If `path` is empty, it means that all directories will be backed up.
         * 
         * @return builder
         * 
         */
        public Builder paths(List<String> paths) {
            return paths(Output.of(paths));
        }

        /**
         * @param paths List of backup path. e.g. `[&#34;/home&#34;, &#34;/var&#34;]`. **Note** If `path` is empty, it means that all directories will be backed up.
         * 
         * @return builder
         * 
         */
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }

        /**
         * @param retention Backup retention days, the minimum is 1.
         * 
         * @return builder
         * 
         */
        public Builder retention(@Nullable Output<String> retention) {
            $.retention = retention;
            return this;
        }

        /**
         * @param retention Backup retention days, the minimum is 1.
         * 
         * @return builder
         * 
         */
        public Builder retention(String retention) {
            return retention(Output.of(retention));
        }

        /**
         * @param schedule Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param speedLimit Flow control. The format is: `{start}|{end}|{bandwidth}`. Use `|` to separate multiple flow control configurations, multiple flow control configurations not allowed to have overlapping times.
         * 
         * @return builder
         * 
         */
        public Builder speedLimit(@Nullable Output<String> speedLimit) {
            $.speedLimit = speedLimit;
            return this;
        }

        /**
         * @param speedLimit Flow control. The format is: `{start}|{end}|{bandwidth}`. Use `|` to separate multiple flow control configurations, multiple flow control configurations not allowed to have overlapping times.
         * 
         * @return builder
         * 
         */
        public Builder speedLimit(String speedLimit) {
            return speedLimit(Output.of(speedLimit));
        }

        /**
         * @param updatePaths Attribute update_paths has been deprecated in v1.139.0+, and you do not need to set it anymore.
         * 
         * @return builder
         * 
         * @deprecated
         * Attribute update_paths has been deprecated in v1.139.0+ and you do not need to set it anymore.
         * 
         */
        @Deprecated /* Attribute update_paths has been deprecated in v1.139.0+ and you do not need to set it anymore. */
        public Builder updatePaths(@Nullable Output<Boolean> updatePaths) {
            $.updatePaths = updatePaths;
            return this;
        }

        /**
         * @param updatePaths Attribute update_paths has been deprecated in v1.139.0+, and you do not need to set it anymore.
         * 
         * @return builder
         * 
         * @deprecated
         * Attribute update_paths has been deprecated in v1.139.0+ and you do not need to set it anymore.
         * 
         */
        @Deprecated /* Attribute update_paths has been deprecated in v1.139.0+ and you do not need to set it anymore. */
        public Builder updatePaths(Boolean updatePaths) {
            return updatePaths(Output.of(updatePaths));
        }

        /**
         * @param vaultId The ID of Backup vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(@Nullable Output<String> vaultId) {
            $.vaultId = vaultId;
            return this;
        }

        /**
         * @param vaultId The ID of Backup vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(String vaultId) {
            return vaultId(Output.of(vaultId));
        }

        public EcsBackupPlanState build() {
            return $;
        }
    }

}
