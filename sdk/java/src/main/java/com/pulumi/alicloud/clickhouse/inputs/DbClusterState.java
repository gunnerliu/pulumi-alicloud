// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.clickhouse.inputs;

import com.pulumi.alicloud.clickhouse.inputs.DbClusterDbClusterAccessWhiteListArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DbClusterState extends com.pulumi.resources.ResourceArgs {

    public static final DbClusterState Empty = new DbClusterState();

    /**
     * The Category of DBCluster. Valid values: `Basic`,`HighAvailability`.
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return The Category of DBCluster. Valid values: `Basic`,`HighAvailability`.
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * (Available since v1.196.0) - The connection string of the cluster.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    /**
     * @return (Available since v1.196.0) - The connection string of the cluster.
     * 
     */
    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * The db cluster access white list. See `db_cluster_access_white_list` below.
     * 
     */
    @Import(name="dbClusterAccessWhiteLists")
    private @Nullable Output<List<DbClusterDbClusterAccessWhiteListArgs>> dbClusterAccessWhiteLists;

    /**
     * @return The db cluster access white list. See `db_cluster_access_white_list` below.
     * 
     */
    public Optional<Output<List<DbClusterDbClusterAccessWhiteListArgs>>> dbClusterAccessWhiteLists() {
        return Optional.ofNullable(this.dbClusterAccessWhiteLists);
    }

    /**
     * The DBCluster class. According to the category, db_cluster_class has two value ranges:
     * * Under the condition that the category is the `Basic`, Valid values: `LS20`, `LS40`, `LS80`,`S8`, `S16`, `S32`, `S64`,`S80`, `S104`.
     * * Under the condition that the category is the `HighAvailability`, Valid values: `LC20`, `LC40`, `LC80`,`C8`, `C16`, `C32`, `C64`, `C80`, `C104`.
     * 
     */
    @Import(name="dbClusterClass")
    private @Nullable Output<String> dbClusterClass;

    /**
     * @return The DBCluster class. According to the category, db_cluster_class has two value ranges:
     * * Under the condition that the category is the `Basic`, Valid values: `LS20`, `LS40`, `LS80`,`S8`, `S16`, `S32`, `S64`,`S80`, `S104`.
     * * Under the condition that the category is the `HighAvailability`, Valid values: `LC20`, `LC40`, `LC80`,`C8`, `C16`, `C32`, `C64`, `C80`, `C104`.
     * 
     */
    public Optional<Output<String>> dbClusterClass() {
        return Optional.ofNullable(this.dbClusterClass);
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
    @Import(name="dbClusterNetworkType")
    private @Nullable Output<String> dbClusterNetworkType;

    /**
     * @return The DBCluster network type. Valid values: `vpc`.
     * 
     */
    public Optional<Output<String>> dbClusterNetworkType() {
        return Optional.ofNullable(this.dbClusterNetworkType);
    }

    /**
     * The DBCluster version. Valid values: `20.3.10.75`, `20.8.7.15`, `21.8.10.19`, `22.8.5.29`. **NOTE:** `19.15.2.2` is no longer supported. From version 1.191.0, `db_cluster_version` can be set to `22.8.5.29`.
     * 
     */
    @Import(name="dbClusterVersion")
    private @Nullable Output<String> dbClusterVersion;

    /**
     * @return The DBCluster version. Valid values: `20.3.10.75`, `20.8.7.15`, `21.8.10.19`, `22.8.5.29`. **NOTE:** `19.15.2.2` is no longer supported. From version 1.191.0, `db_cluster_version` can be set to `22.8.5.29`.
     * 
     */
    public Optional<Output<String>> dbClusterVersion() {
        return Optional.ofNullable(this.dbClusterVersion);
    }

    /**
     * The db node group count. The number should between 1 and 48.
     * 
     */
    @Import(name="dbNodeGroupCount")
    private @Nullable Output<Integer> dbNodeGroupCount;

    /**
     * @return The db node group count. The number should between 1 and 48.
     * 
     */
    public Optional<Output<Integer>> dbNodeGroupCount() {
        return Optional.ofNullable(this.dbNodeGroupCount);
    }

    /**
     * The db node storage.
     * 
     */
    @Import(name="dbNodeStorage")
    private @Nullable Output<String> dbNodeStorage;

    /**
     * @return The db node storage.
     * 
     */
    public Optional<Output<String>> dbNodeStorage() {
        return Optional.ofNullable(this.dbNodeStorage);
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
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return The payment type of the resource. Valid values: `PayAsYouGo`,`Subscription`.
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
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
     * (Available since v1.196.0) The connection port of the cluster.
     * 
     */
    @Import(name="port")
    private @Nullable Output<String> port;

    /**
     * @return (Available since v1.196.0) The connection port of the cluster.
     * 
     */
    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
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
    @Import(name="storageType")
    private @Nullable Output<String> storageType;

    /**
     * @return Storage type of DBCluster. Valid values: `cloud_essd`, `cloud_efficiency`, `cloud_essd_pl2`, `cloud_essd_pl3`.
     * 
     */
    public Optional<Output<String>> storageType() {
        return Optional.ofNullable(this.storageType);
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

    private DbClusterState() {}

    private DbClusterState(DbClusterState $) {
        this.category = $.category;
        this.connectionString = $.connectionString;
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
        this.port = $.port;
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
    public static Builder builder(DbClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DbClusterState $;

        public Builder() {
            $ = new DbClusterState();
        }

        public Builder(DbClusterState defaults) {
            $ = new DbClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param category The Category of DBCluster. Valid values: `Basic`,`HighAvailability`.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
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
         * @param connectionString (Available since v1.196.0) - The connection string of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString (Available since v1.196.0) - The connection string of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param dbClusterAccessWhiteLists The db cluster access white list. See `db_cluster_access_white_list` below.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterAccessWhiteLists(@Nullable Output<List<DbClusterDbClusterAccessWhiteListArgs>> dbClusterAccessWhiteLists) {
            $.dbClusterAccessWhiteLists = dbClusterAccessWhiteLists;
            return this;
        }

        /**
         * @param dbClusterAccessWhiteLists The db cluster access white list. See `db_cluster_access_white_list` below.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterAccessWhiteLists(List<DbClusterDbClusterAccessWhiteListArgs> dbClusterAccessWhiteLists) {
            return dbClusterAccessWhiteLists(Output.of(dbClusterAccessWhiteLists));
        }

        /**
         * @param dbClusterAccessWhiteLists The db cluster access white list. See `db_cluster_access_white_list` below.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterAccessWhiteLists(DbClusterDbClusterAccessWhiteListArgs... dbClusterAccessWhiteLists) {
            return dbClusterAccessWhiteLists(List.of(dbClusterAccessWhiteLists));
        }

        /**
         * @param dbClusterClass The DBCluster class. According to the category, db_cluster_class has two value ranges:
         * * Under the condition that the category is the `Basic`, Valid values: `LS20`, `LS40`, `LS80`,`S8`, `S16`, `S32`, `S64`,`S80`, `S104`.
         * * Under the condition that the category is the `HighAvailability`, Valid values: `LC20`, `LC40`, `LC80`,`C8`, `C16`, `C32`, `C64`, `C80`, `C104`.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterClass(@Nullable Output<String> dbClusterClass) {
            $.dbClusterClass = dbClusterClass;
            return this;
        }

        /**
         * @param dbClusterClass The DBCluster class. According to the category, db_cluster_class has two value ranges:
         * * Under the condition that the category is the `Basic`, Valid values: `LS20`, `LS40`, `LS80`,`S8`, `S16`, `S32`, `S64`,`S80`, `S104`.
         * * Under the condition that the category is the `HighAvailability`, Valid values: `LC20`, `LC40`, `LC80`,`C8`, `C16`, `C32`, `C64`, `C80`, `C104`.
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
        public Builder dbClusterNetworkType(@Nullable Output<String> dbClusterNetworkType) {
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
        public Builder dbClusterVersion(@Nullable Output<String> dbClusterVersion) {
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
        public Builder dbNodeGroupCount(@Nullable Output<Integer> dbNodeGroupCount) {
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
        public Builder dbNodeStorage(@Nullable Output<String> dbNodeStorage) {
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
        public Builder paymentType(@Nullable Output<String> paymentType) {
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
         * @param port (Available since v1.196.0) The connection port of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port (Available since v1.196.0) The connection port of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Output.of(port));
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
        public Builder storageType(@Nullable Output<String> storageType) {
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

        public DbClusterState build() {
            return $;
        }
    }

}
