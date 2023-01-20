// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.clickhouse;

import com.pulumi.alicloud.clickhouse.inputs.DbClusterDbClusterAccessWhiteListArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DbClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final DbClusterArgs Empty = new DbClusterArgs();

    /**
     * The Category of DBCluster. Valid values: `Basic`,`HighAvailability`.
     * 
     */
    @Import(name="category", required=true)
    private Output<String> category;

    /**
     * @return The Category of DBCluster. Valid values: `Basic`,`HighAvailability`.
     * 
     */
    public Output<String> category() {
        return this.category;
    }

    /**
     * The db cluster access white list.
     * 
     */
    @Import(name="dbClusterAccessWhiteLists")
    private @Nullable Output<List<DbClusterDbClusterAccessWhiteListArgs>> dbClusterAccessWhiteLists;

    /**
     * @return The db cluster access white list.
     * 
     */
    public Optional<Output<List<DbClusterDbClusterAccessWhiteListArgs>>> dbClusterAccessWhiteLists() {
        return Optional.ofNullable(this.dbClusterAccessWhiteLists);
    }

    /**
     * The DBCluster class. According to the category, db_cluster_class has two value ranges:
     * * Under the condition that the category is the `Basic`, Valid values: `S4-NEW`, `S8`, `S16`, `S32`, `S64`, `S104`.
     * * Under the condition that the category is the `HighAvailability`, Valid values: `C4-NEW`, `C8`, `C16`, `C32`, `C64`, `C104`.
     * 
     */
    @Import(name="dbClusterClass", required=true)
    private Output<String> dbClusterClass;

    /**
     * @return The DBCluster class. According to the category, db_cluster_class has two value ranges:
     * * Under the condition that the category is the `Basic`, Valid values: `S4-NEW`, `S8`, `S16`, `S32`, `S64`, `S104`.
     * * Under the condition that the category is the `HighAvailability`, Valid values: `C4-NEW`, `C8`, `C16`, `C32`, `C64`, `C104`.
     * 
     */
    public Output<String> dbClusterClass() {
        return this.dbClusterClass;
    }

    /**
     * The DBCluster description.
     * 
     */
    @Import(name="dbClusterDescription")
    private @Nullable Output<String> dbClusterDescription;

    /**
     * @return The DBCluster description.
     * 
     */
    public Optional<Output<String>> dbClusterDescription() {
        return Optional.ofNullable(this.dbClusterDescription);
    }

    /**
     * The DBCluster network type. Valid values: `vpc`.
     * 
     */
    @Import(name="dbClusterNetworkType", required=true)
    private Output<String> dbClusterNetworkType;

    /**
     * @return The DBCluster network type. Valid values: `vpc`.
     * 
     */
    public Output<String> dbClusterNetworkType() {
        return this.dbClusterNetworkType;
    }

    /**
     * The DBCluster version. Valid values: `20.3.10.75`, `20.8.7.15`, `21.8.10.19`, `22.8.5.29`. **NOTE:** `19.15.2.2` is no longer supported. From version 1.191.0, `db_cluster_version` can be set to `22.8.5.29`.
     * 
     */
    @Import(name="dbClusterVersion", required=true)
    private Output<String> dbClusterVersion;

    /**
     * @return The DBCluster version. Valid values: `20.3.10.75`, `20.8.7.15`, `21.8.10.19`, `22.8.5.29`. **NOTE:** `19.15.2.2` is no longer supported. From version 1.191.0, `db_cluster_version` can be set to `22.8.5.29`.
     * 
     */
    public Output<String> dbClusterVersion() {
        return this.dbClusterVersion;
    }

    /**
     * The db node group count. The number should between 1 and 48.
     * 
     */
    @Import(name="dbNodeGroupCount", required=true)
    private Output<Integer> dbNodeGroupCount;

    /**
     * @return The db node group count. The number should between 1 and 48.
     * 
     */
    public Output<Integer> dbNodeGroupCount() {
        return this.dbNodeGroupCount;
    }

    /**
     * The db node storage.
     * 
     */
    @Import(name="dbNodeStorage", required=true)
    private Output<String> dbNodeStorage;

    /**
     * @return The db node storage.
     * 
     */
    public Output<String> dbNodeStorage() {
        return this.dbNodeStorage;
    }

    /**
     * Key management service KMS key ID.
     * 
     */
    @Import(name="encryptionKey")
    private @Nullable Output<String> encryptionKey;

    /**
     * @return Key management service KMS key ID.
     * 
     */
    public Optional<Output<String>> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }

    /**
     * Currently only supports ECS disk encryption, with a value of CloudDisk, not encrypted when empty.
     * 
     */
    @Import(name="encryptionType")
    private @Nullable Output<String> encryptionType;

    /**
     * @return Currently only supports ECS disk encryption, with a value of CloudDisk, not encrypted when empty.
     * 
     */
    public Optional<Output<String>> encryptionType() {
        return Optional.ofNullable(this.encryptionType);
    }

    /**
     * The maintenance window of DBCluster. Valid format: `hh:mmZ-hh:mm Z`.
     * 
     */
    @Import(name="maintainTime")
    private @Nullable Output<String> maintainTime;

    /**
     * @return The maintenance window of DBCluster. Valid format: `hh:mmZ-hh:mm Z`.
     * 
     */
    public Optional<Output<String>> maintainTime() {
        return Optional.ofNullable(this.maintainTime);
    }

    /**
     * The payment type of the resource. Valid values: `PayAsYouGo`,`Subscription`.
     * 
     */
    @Import(name="paymentType", required=true)
    private Output<String> paymentType;

    /**
     * @return The payment type of the resource. Valid values: `PayAsYouGo`,`Subscription`.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }

    /**
     * Pre-paid cluster of the pay-as-you-go cycle. Valid values: `Month`, `Year`.
     * 
     */
    @Import(name="period")
    private @Nullable Output<String> period;

    /**
     * @return Pre-paid cluster of the pay-as-you-go cycle. Valid values: `Month`, `Year`.
     * 
     */
    public Optional<Output<String>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * The status of the resource. Valid values: `Running`,`Creating`,`Deleting`,`Restarting`,`Preparing`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource. Valid values: `Running`,`Creating`,`Deleting`,`Restarting`,`Preparing`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Storage type of DBCluster. Valid values: `cloud_essd`, `cloud_efficiency`, `cloud_essd_pl2`, `cloud_essd_pl3`.
     * 
     */
    @Import(name="storageType", required=true)
    private Output<String> storageType;

    /**
     * @return Storage type of DBCluster. Valid values: `cloud_essd`, `cloud_efficiency`, `cloud_essd_pl2`, `cloud_essd_pl3`.
     * 
     */
    public Output<String> storageType() {
        return this.storageType;
    }

    /**
     * The used time of DBCluster.
     * 
     */
    @Import(name="usedTime")
    private @Nullable Output<String> usedTime;

    /**
     * @return The used time of DBCluster.
     * 
     */
    public Optional<Output<String>> usedTime() {
        return Optional.ofNullable(this.usedTime);
    }

    /**
     * The id of the VPC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The id of the VPC.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * The vswitch id of DBCluster.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The vswitch id of DBCluster.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    /**
     * The zone ID of the instance.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone ID of the instance.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private DbClusterArgs() {}

    private DbClusterArgs(DbClusterArgs $) {
        this.category = $.category;
        this.dbClusterAccessWhiteLists = $.dbClusterAccessWhiteLists;
        this.dbClusterClass = $.dbClusterClass;
        this.dbClusterDescription = $.dbClusterDescription;
        this.dbClusterNetworkType = $.dbClusterNetworkType;
        this.dbClusterVersion = $.dbClusterVersion;
        this.dbNodeGroupCount = $.dbNodeGroupCount;
        this.dbNodeStorage = $.dbNodeStorage;
        this.encryptionKey = $.encryptionKey;
        this.encryptionType = $.encryptionType;
        this.maintainTime = $.maintainTime;
        this.paymentType = $.paymentType;
        this.period = $.period;
        this.status = $.status;
        this.storageType = $.storageType;
        this.usedTime = $.usedTime;
        this.vpcId = $.vpcId;
        this.vswitchId = $.vswitchId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DbClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DbClusterArgs $;

        public Builder() {
            $ = new DbClusterArgs();
        }

        public Builder(DbClusterArgs defaults) {
            $ = new DbClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category The Category of DBCluster. Valid values: `Basic`,`HighAvailability`.
         * 
         * @return builder
         * 
         */
        public Builder category(Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category The Category of DBCluster. Valid values: `Basic`,`HighAvailability`.
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param dbClusterAccessWhiteLists The db cluster access white list.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterAccessWhiteLists(@Nullable Output<List<DbClusterDbClusterAccessWhiteListArgs>> dbClusterAccessWhiteLists) {
            $.dbClusterAccessWhiteLists = dbClusterAccessWhiteLists;
            return this;
        }

        /**
         * @param dbClusterAccessWhiteLists The db cluster access white list.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterAccessWhiteLists(List<DbClusterDbClusterAccessWhiteListArgs> dbClusterAccessWhiteLists) {
            return dbClusterAccessWhiteLists(Output.of(dbClusterAccessWhiteLists));
        }

        /**
         * @param dbClusterAccessWhiteLists The db cluster access white list.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterAccessWhiteLists(DbClusterDbClusterAccessWhiteListArgs... dbClusterAccessWhiteLists) {
            return dbClusterAccessWhiteLists(List.of(dbClusterAccessWhiteLists));
        }

        /**
         * @param dbClusterClass The DBCluster class. According to the category, db_cluster_class has two value ranges:
         * * Under the condition that the category is the `Basic`, Valid values: `S4-NEW`, `S8`, `S16`, `S32`, `S64`, `S104`.
         * * Under the condition that the category is the `HighAvailability`, Valid values: `C4-NEW`, `C8`, `C16`, `C32`, `C64`, `C104`.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterClass(Output<String> dbClusterClass) {
            $.dbClusterClass = dbClusterClass;
            return this;
        }

        /**
         * @param dbClusterClass The DBCluster class. According to the category, db_cluster_class has two value ranges:
         * * Under the condition that the category is the `Basic`, Valid values: `S4-NEW`, `S8`, `S16`, `S32`, `S64`, `S104`.
         * * Under the condition that the category is the `HighAvailability`, Valid values: `C4-NEW`, `C8`, `C16`, `C32`, `C64`, `C104`.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterClass(String dbClusterClass) {
            return dbClusterClass(Output.of(dbClusterClass));
        }

        /**
         * @param dbClusterDescription The DBCluster description.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterDescription(@Nullable Output<String> dbClusterDescription) {
            $.dbClusterDescription = dbClusterDescription;
            return this;
        }

        /**
         * @param dbClusterDescription The DBCluster description.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterDescription(String dbClusterDescription) {
            return dbClusterDescription(Output.of(dbClusterDescription));
        }

        /**
         * @param dbClusterNetworkType The DBCluster network type. Valid values: `vpc`.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterNetworkType(Output<String> dbClusterNetworkType) {
            $.dbClusterNetworkType = dbClusterNetworkType;
            return this;
        }

        /**
         * @param dbClusterNetworkType The DBCluster network type. Valid values: `vpc`.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterNetworkType(String dbClusterNetworkType) {
            return dbClusterNetworkType(Output.of(dbClusterNetworkType));
        }

        /**
         * @param dbClusterVersion The DBCluster version. Valid values: `20.3.10.75`, `20.8.7.15`, `21.8.10.19`, `22.8.5.29`. **NOTE:** `19.15.2.2` is no longer supported. From version 1.191.0, `db_cluster_version` can be set to `22.8.5.29`.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterVersion(Output<String> dbClusterVersion) {
            $.dbClusterVersion = dbClusterVersion;
            return this;
        }

        /**
         * @param dbClusterVersion The DBCluster version. Valid values: `20.3.10.75`, `20.8.7.15`, `21.8.10.19`, `22.8.5.29`. **NOTE:** `19.15.2.2` is no longer supported. From version 1.191.0, `db_cluster_version` can be set to `22.8.5.29`.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterVersion(String dbClusterVersion) {
            return dbClusterVersion(Output.of(dbClusterVersion));
        }

        /**
         * @param dbNodeGroupCount The db node group count. The number should between 1 and 48.
         * 
         * @return builder
         * 
         */
        public Builder dbNodeGroupCount(Output<Integer> dbNodeGroupCount) {
            $.dbNodeGroupCount = dbNodeGroupCount;
            return this;
        }

        /**
         * @param dbNodeGroupCount The db node group count. The number should between 1 and 48.
         * 
         * @return builder
         * 
         */
        public Builder dbNodeGroupCount(Integer dbNodeGroupCount) {
            return dbNodeGroupCount(Output.of(dbNodeGroupCount));
        }

        /**
         * @param dbNodeStorage The db node storage.
         * 
         * @return builder
         * 
         */
        public Builder dbNodeStorage(Output<String> dbNodeStorage) {
            $.dbNodeStorage = dbNodeStorage;
            return this;
        }

        /**
         * @param dbNodeStorage The db node storage.
         * 
         * @return builder
         * 
         */
        public Builder dbNodeStorage(String dbNodeStorage) {
            return dbNodeStorage(Output.of(dbNodeStorage));
        }

        /**
         * @param encryptionKey Key management service KMS key ID.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(@Nullable Output<String> encryptionKey) {
            $.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * @param encryptionKey Key management service KMS key ID.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(String encryptionKey) {
            return encryptionKey(Output.of(encryptionKey));
        }

        /**
         * @param encryptionType Currently only supports ECS disk encryption, with a value of CloudDisk, not encrypted when empty.
         * 
         * @return builder
         * 
         */
        public Builder encryptionType(@Nullable Output<String> encryptionType) {
            $.encryptionType = encryptionType;
            return this;
        }

        /**
         * @param encryptionType Currently only supports ECS disk encryption, with a value of CloudDisk, not encrypted when empty.
         * 
         * @return builder
         * 
         */
        public Builder encryptionType(String encryptionType) {
            return encryptionType(Output.of(encryptionType));
        }

        /**
         * @param maintainTime The maintenance window of DBCluster. Valid format: `hh:mmZ-hh:mm Z`.
         * 
         * @return builder
         * 
         */
        public Builder maintainTime(@Nullable Output<String> maintainTime) {
            $.maintainTime = maintainTime;
            return this;
        }

        /**
         * @param maintainTime The maintenance window of DBCluster. Valid format: `hh:mmZ-hh:mm Z`.
         * 
         * @return builder
         * 
         */
        public Builder maintainTime(String maintainTime) {
            return maintainTime(Output.of(maintainTime));
        }

        /**
         * @param paymentType The payment type of the resource. Valid values: `PayAsYouGo`,`Subscription`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType The payment type of the resource. Valid values: `PayAsYouGo`,`Subscription`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param period Pre-paid cluster of the pay-as-you-go cycle. Valid values: `Month`, `Year`.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<String> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period Pre-paid cluster of the pay-as-you-go cycle. Valid values: `Month`, `Year`.
         * 
         * @return builder
         * 
         */
        public Builder period(String period) {
            return period(Output.of(period));
        }

        /**
         * @param status The status of the resource. Valid values: `Running`,`Creating`,`Deleting`,`Restarting`,`Preparing`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource. Valid values: `Running`,`Creating`,`Deleting`,`Restarting`,`Preparing`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param storageType Storage type of DBCluster. Valid values: `cloud_essd`, `cloud_efficiency`, `cloud_essd_pl2`, `cloud_essd_pl3`.
         * 
         * @return builder
         * 
         */
        public Builder storageType(Output<String> storageType) {
            $.storageType = storageType;
            return this;
        }

        /**
         * @param storageType Storage type of DBCluster. Valid values: `cloud_essd`, `cloud_efficiency`, `cloud_essd_pl2`, `cloud_essd_pl3`.
         * 
         * @return builder
         * 
         */
        public Builder storageType(String storageType) {
            return storageType(Output.of(storageType));
        }

        /**
         * @param usedTime The used time of DBCluster.
         * 
         * @return builder
         * 
         */
        public Builder usedTime(@Nullable Output<String> usedTime) {
            $.usedTime = usedTime;
            return this;
        }

        /**
         * @param usedTime The used time of DBCluster.
         * 
         * @return builder
         * 
         */
        public Builder usedTime(String usedTime) {
            return usedTime(Output.of(usedTime));
        }

        /**
         * @param vpcId The id of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The id of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vswitchId The vswitch id of DBCluster.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The vswitch id of DBCluster.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        /**
         * @param zoneId The zone ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public DbClusterArgs build() {
            $.category = Objects.requireNonNull($.category, "expected parameter 'category' to be non-null");
            $.dbClusterClass = Objects.requireNonNull($.dbClusterClass, "expected parameter 'dbClusterClass' to be non-null");
            $.dbClusterNetworkType = Objects.requireNonNull($.dbClusterNetworkType, "expected parameter 'dbClusterNetworkType' to be non-null");
            $.dbClusterVersion = Objects.requireNonNull($.dbClusterVersion, "expected parameter 'dbClusterVersion' to be non-null");
            $.dbNodeGroupCount = Objects.requireNonNull($.dbNodeGroupCount, "expected parameter 'dbNodeGroupCount' to be non-null");
            $.dbNodeStorage = Objects.requireNonNull($.dbNodeStorage, "expected parameter 'dbNodeStorage' to be non-null");
            $.paymentType = Objects.requireNonNull($.paymentType, "expected parameter 'paymentType' to be non-null");
            $.storageType = Objects.requireNonNull($.storageType, "expected parameter 'storageType' to be non-null");
            return $;
        }
    }

}
