// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.adb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BackupPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupPolicyArgs Empty = new BackupPolicyArgs();

    /**
     * The Id of cluster that can run database.
     * 
     */
    @Import(name="dbClusterId", required=true)
    private Output<String> dbClusterId;

    /**
     * @return The Id of cluster that can run database.
     * 
     */
    public Output<String> dbClusterId() {
        return this.dbClusterId;
    }

    /**
     * ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
     * 
     */
    @Import(name="preferredBackupPeriods", required=true)
    private Output<List<String>> preferredBackupPeriods;

    /**
     * @return ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
     * 
     */
    public Output<List<String>> preferredBackupPeriods() {
        return this.preferredBackupPeriods;
    }

    /**
     * ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
     * 
     */
    @Import(name="preferredBackupTime", required=true)
    private Output<String> preferredBackupTime;

    /**
     * @return ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
     * 
     */
    public Output<String> preferredBackupTime() {
        return this.preferredBackupTime;
    }

    private BackupPolicyArgs() {}

    private BackupPolicyArgs(BackupPolicyArgs $) {
        this.dbClusterId = $.dbClusterId;
        this.preferredBackupPeriods = $.preferredBackupPeriods;
        this.preferredBackupTime = $.preferredBackupTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyArgs $;

        public Builder() {
            $ = new BackupPolicyArgs();
        }

        public Builder(BackupPolicyArgs defaults) {
            $ = new BackupPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbClusterId The Id of cluster that can run database.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterId(Output<String> dbClusterId) {
            $.dbClusterId = dbClusterId;
            return this;
        }

        /**
         * @param dbClusterId The Id of cluster that can run database.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterId(String dbClusterId) {
            return dbClusterId(Output.of(dbClusterId));
        }

        /**
         * @param preferredBackupPeriods ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupPeriods(Output<List<String>> preferredBackupPeriods) {
            $.preferredBackupPeriods = preferredBackupPeriods;
            return this;
        }

        /**
         * @param preferredBackupPeriods ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupPeriods(List<String> preferredBackupPeriods) {
            return preferredBackupPeriods(Output.of(preferredBackupPeriods));
        }

        /**
         * @param preferredBackupPeriods ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupPeriods(String... preferredBackupPeriods) {
            return preferredBackupPeriods(List.of(preferredBackupPeriods));
        }

        /**
         * @param preferredBackupTime ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupTime(Output<String> preferredBackupTime) {
            $.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * @param preferredBackupTime ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            return preferredBackupTime(Output.of(preferredBackupTime));
        }

        public BackupPolicyArgs build() {
            $.dbClusterId = Objects.requireNonNull($.dbClusterId, "expected parameter 'dbClusterId' to be non-null");
            $.preferredBackupPeriods = Objects.requireNonNull($.preferredBackupPeriods, "expected parameter 'preferredBackupPeriods' to be non-null");
            $.preferredBackupTime = Objects.requireNonNull($.preferredBackupTime, "expected parameter 'preferredBackupTime' to be non-null");
            return $;
        }
    }

}