// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.maxcompute.inputs;

import com.pulumi.alicloud.maxcompute.inputs.ProjectPropertiesEncryptionArgs;
import com.pulumi.alicloud.maxcompute.inputs.ProjectPropertiesTableLifecycleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectPropertiesArgs Empty = new ProjectPropertiesArgs();

    /**
     * Whether to allow full table scan.
     * 
     */
    @Import(name="allowFullScan")
    private @Nullable Output<Boolean> allowFullScan;

    /**
     * @return Whether to allow full table scan.
     * 
     */
    public Optional<Output<Boolean>> allowFullScan() {
        return Optional.ofNullable(this.allowFullScan);
    }

    /**
     * Whether to turn on Decimal2.0.
     * 
     */
    @Import(name="enableDecimal2")
    private @Nullable Output<Boolean> enableDecimal2;

    /**
     * @return Whether to turn on Decimal2.0.
     * 
     */
    public Optional<Output<Boolean>> enableDecimal2() {
        return Optional.ofNullable(this.enableDecimal2);
    }

    /**
     * Whether encryption is turned on. See `encryption` below.
     * 
     */
    @Import(name="encryption")
    private @Nullable Output<ProjectPropertiesEncryptionArgs> encryption;

    /**
     * @return Whether encryption is turned on. See `encryption` below.
     * 
     */
    public Optional<Output<ProjectPropertiesEncryptionArgs>> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    /**
     * Job default retention time.
     * 
     */
    @Import(name="retentionDays")
    private @Nullable Output<Integer> retentionDays;

    /**
     * @return Job default retention time.
     * 
     */
    public Optional<Output<Integer>> retentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }

    /**
     * SQL charge limit.
     * 
     */
    @Import(name="sqlMeteringMax")
    private @Nullable Output<String> sqlMeteringMax;

    /**
     * @return SQL charge limit.
     * 
     */
    public Optional<Output<String>> sqlMeteringMax() {
        return Optional.ofNullable(this.sqlMeteringMax);
    }

    /**
     * Life cycle of tables. See `table_lifecycle` below.
     * 
     */
    @Import(name="tableLifecycle")
    private @Nullable Output<ProjectPropertiesTableLifecycleArgs> tableLifecycle;

    /**
     * @return Life cycle of tables. See `table_lifecycle` below.
     * 
     */
    public Optional<Output<ProjectPropertiesTableLifecycleArgs>> tableLifecycle() {
        return Optional.ofNullable(this.tableLifecycle);
    }

    /**
     * Project time zone.
     * 
     */
    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    /**
     * @return Project time zone.
     * 
     */
    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    /**
     * Type system.
     * 
     */
    @Import(name="typeSystem")
    private @Nullable Output<String> typeSystem;

    /**
     * @return Type system.
     * 
     */
    public Optional<Output<String>> typeSystem() {
        return Optional.ofNullable(this.typeSystem);
    }

    private ProjectPropertiesArgs() {}

    private ProjectPropertiesArgs(ProjectPropertiesArgs $) {
        this.allowFullScan = $.allowFullScan;
        this.enableDecimal2 = $.enableDecimal2;
        this.encryption = $.encryption;
        this.retentionDays = $.retentionDays;
        this.sqlMeteringMax = $.sqlMeteringMax;
        this.tableLifecycle = $.tableLifecycle;
        this.timezone = $.timezone;
        this.typeSystem = $.typeSystem;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectPropertiesArgs $;

        public Builder() {
            $ = new ProjectPropertiesArgs();
        }

        public Builder(ProjectPropertiesArgs defaults) {
            $ = new ProjectPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowFullScan Whether to allow full table scan.
         * 
         * @return builder
         * 
         */
        public Builder allowFullScan(@Nullable Output<Boolean> allowFullScan) {
            $.allowFullScan = allowFullScan;
            return this;
        }

        /**
         * @param allowFullScan Whether to allow full table scan.
         * 
         * @return builder
         * 
         */
        public Builder allowFullScan(Boolean allowFullScan) {
            return allowFullScan(Output.of(allowFullScan));
        }

        /**
         * @param enableDecimal2 Whether to turn on Decimal2.0.
         * 
         * @return builder
         * 
         */
        public Builder enableDecimal2(@Nullable Output<Boolean> enableDecimal2) {
            $.enableDecimal2 = enableDecimal2;
            return this;
        }

        /**
         * @param enableDecimal2 Whether to turn on Decimal2.0.
         * 
         * @return builder
         * 
         */
        public Builder enableDecimal2(Boolean enableDecimal2) {
            return enableDecimal2(Output.of(enableDecimal2));
        }

        /**
         * @param encryption Whether encryption is turned on. See `encryption` below.
         * 
         * @return builder
         * 
         */
        public Builder encryption(@Nullable Output<ProjectPropertiesEncryptionArgs> encryption) {
            $.encryption = encryption;
            return this;
        }

        /**
         * @param encryption Whether encryption is turned on. See `encryption` below.
         * 
         * @return builder
         * 
         */
        public Builder encryption(ProjectPropertiesEncryptionArgs encryption) {
            return encryption(Output.of(encryption));
        }

        /**
         * @param retentionDays Job default retention time.
         * 
         * @return builder
         * 
         */
        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            $.retentionDays = retentionDays;
            return this;
        }

        /**
         * @param retentionDays Job default retention time.
         * 
         * @return builder
         * 
         */
        public Builder retentionDays(Integer retentionDays) {
            return retentionDays(Output.of(retentionDays));
        }

        /**
         * @param sqlMeteringMax SQL charge limit.
         * 
         * @return builder
         * 
         */
        public Builder sqlMeteringMax(@Nullable Output<String> sqlMeteringMax) {
            $.sqlMeteringMax = sqlMeteringMax;
            return this;
        }

        /**
         * @param sqlMeteringMax SQL charge limit.
         * 
         * @return builder
         * 
         */
        public Builder sqlMeteringMax(String sqlMeteringMax) {
            return sqlMeteringMax(Output.of(sqlMeteringMax));
        }

        /**
         * @param tableLifecycle Life cycle of tables. See `table_lifecycle` below.
         * 
         * @return builder
         * 
         */
        public Builder tableLifecycle(@Nullable Output<ProjectPropertiesTableLifecycleArgs> tableLifecycle) {
            $.tableLifecycle = tableLifecycle;
            return this;
        }

        /**
         * @param tableLifecycle Life cycle of tables. See `table_lifecycle` below.
         * 
         * @return builder
         * 
         */
        public Builder tableLifecycle(ProjectPropertiesTableLifecycleArgs tableLifecycle) {
            return tableLifecycle(Output.of(tableLifecycle));
        }

        /**
         * @param timezone Project time zone.
         * 
         * @return builder
         * 
         */
        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone Project time zone.
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        /**
         * @param typeSystem Type system.
         * 
         * @return builder
         * 
         */
        public Builder typeSystem(@Nullable Output<String> typeSystem) {
            $.typeSystem = typeSystem;
            return this;
        }

        /**
         * @param typeSystem Type system.
         * 
         * @return builder
         * 
         */
        public Builder typeSystem(String typeSystem) {
            return typeSystem(Output.of(typeSystem));
        }

        public ProjectPropertiesArgs build() {
            return $;
        }
    }

}
