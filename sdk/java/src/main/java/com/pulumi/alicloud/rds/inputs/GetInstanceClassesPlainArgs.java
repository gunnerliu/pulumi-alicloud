// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceClassesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceClassesPlainArgs Empty = new GetInstanceClassesPlainArgs();

    /**
     * DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
     * 
     */
    @Import(name="category")
    private @Nullable String category;

    /**
     * @return DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * The commodity code of the instance. Valid values:
     * * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
     * * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
     * * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
     * * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
     * * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
     * * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
     * * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
     * * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
     * 
     */
    @Import(name="commodityCode")
    private @Nullable String commodityCode;

    /**
     * @return The commodity code of the instance. Valid values:
     * * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
     * * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
     * * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
     * * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
     * * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
     * * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
     * * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
     * * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
     * 
     */
    public Optional<String> commodityCode() {
        return Optional.ofNullable(this.commodityCode);
    }

    /**
     * The DB instance class type by the user.
     * 
     */
    @Import(name="dbInstanceClass")
    private @Nullable String dbInstanceClass;

    /**
     * @return The DB instance class type by the user.
     * 
     */
    public Optional<String> dbInstanceClass() {
        return Optional.ofNullable(this.dbInstanceClass);
    }

    /**
     * The ID of the instance.
     * 
     */
    @Import(name="dbInstanceId")
    private @Nullable String dbInstanceId;

    /**
     * @return The ID of the instance.
     * 
     */
    public Optional<String> dbInstanceId() {
        return Optional.ofNullable(this.dbInstanceId);
    }

    /**
     * The DB instance storage space required by the user. Valid values: &#34;cloud_ssd&#34;, &#34;local_ssd&#34;, &#34;cloud_essd&#34;, &#34;cloud_essd2&#34;, &#34;cloud_essd3&#34;.
     * 
     */
    @Import(name="dbInstanceStorageType")
    private @Nullable String dbInstanceStorageType;

    /**
     * @return The DB instance storage space required by the user. Valid values: &#34;cloud_ssd&#34;, &#34;local_ssd&#34;, &#34;cloud_essd&#34;, &#34;cloud_essd2&#34;, &#34;cloud_essd3&#34;.
     * 
     */
    public Optional<String> dbInstanceStorageType() {
        return Optional.ofNullable(this.dbInstanceStorageType);
    }

    /**
     * Database type. Valid values:&#34;MySQL&#34;, &#34;SQLServer&#34;, &#34;PostgreSQL&#34;, &#34;PPAS&#34;, &#34;MariaDB&#34;. If not set, it will match all of engines.
     * 
     */
    @Import(name="engine")
    private @Nullable String engine;

    /**
     * @return Database type. Valid values:&#34;MySQL&#34;, &#34;SQLServer&#34;, &#34;PostgreSQL&#34;, &#34;PPAS&#34;, &#34;MariaDB&#34;. If not set, it will match all of engines.
     * 
     */
    public Optional<String> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable String engineVersion;

    /**
     * @return Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
     * 
     */
    public Optional<String> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
     * 
     */
    @Import(name="instanceChargeType")
    private @Nullable String instanceChargeType;

    /**
     * @return Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
     * 
     */
    public Optional<String> instanceChargeType() {
        return Optional.ofNullable(this.instanceChargeType);
    }

    /**
     * Whether to show multi available zone. Default false to not show multi availability zone.
     * 
     */
    @Import(name="multiZone")
    private @Nullable Boolean multiZone;

    /**
     * @return Whether to show multi available zone. Default false to not show multi availability zone.
     * 
     */
    public Optional<Boolean> multiZone() {
        return Optional.ofNullable(this.multiZone);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    @Import(name="sortedBy")
    private @Nullable String sortedBy;

    public Optional<String> sortedBy() {
        return Optional.ofNullable(this.sortedBy);
    }

    /**
     * It has been deprecated from version 1.134.0+ and using `db_instance_storage_type` instead.
     * 
     */
    @Import(name="storageType")
    private @Nullable String storageType;

    /**
     * @return It has been deprecated from version 1.134.0+ and using `db_instance_storage_type` instead.
     * 
     */
    public Optional<String> storageType() {
        return Optional.ofNullable(this.storageType);
    }

    /**
     * The Zone to launch the DB instance.
     * 
     */
    @Import(name="zoneId")
    private @Nullable String zoneId;

    /**
     * @return The Zone to launch the DB instance.
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetInstanceClassesPlainArgs() {}

    private GetInstanceClassesPlainArgs(GetInstanceClassesPlainArgs $) {
        this.category = $.category;
        this.commodityCode = $.commodityCode;
        this.dbInstanceClass = $.dbInstanceClass;
        this.dbInstanceId = $.dbInstanceId;
        this.dbInstanceStorageType = $.dbInstanceStorageType;
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.instanceChargeType = $.instanceChargeType;
        this.multiZone = $.multiZone;
        this.outputFile = $.outputFile;
        this.sortedBy = $.sortedBy;
        this.storageType = $.storageType;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceClassesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceClassesPlainArgs $;

        public Builder() {
            $ = new GetInstanceClassesPlainArgs();
        }

        public Builder(GetInstanceClassesPlainArgs defaults) {
            $ = new GetInstanceClassesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable String category) {
            $.category = category;
            return this;
        }

        /**
         * @param commodityCode The commodity code of the instance. Valid values:
         * * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
         * * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
         * * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
         * * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
         * * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
         * * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
         * * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
         * * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
         * 
         * @return builder
         * 
         */
        public Builder commodityCode(@Nullable String commodityCode) {
            $.commodityCode = commodityCode;
            return this;
        }

        /**
         * @param dbInstanceClass The DB instance class type by the user.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceClass(@Nullable String dbInstanceClass) {
            $.dbInstanceClass = dbInstanceClass;
            return this;
        }

        /**
         * @param dbInstanceId The ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(@Nullable String dbInstanceId) {
            $.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * @param dbInstanceStorageType The DB instance storage space required by the user. Valid values: &#34;cloud_ssd&#34;, &#34;local_ssd&#34;, &#34;cloud_essd&#34;, &#34;cloud_essd2&#34;, &#34;cloud_essd3&#34;.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceStorageType(@Nullable String dbInstanceStorageType) {
            $.dbInstanceStorageType = dbInstanceStorageType;
            return this;
        }

        /**
         * @param engine Database type. Valid values:&#34;MySQL&#34;, &#34;SQLServer&#34;, &#34;PostgreSQL&#34;, &#34;PPAS&#34;, &#34;MariaDB&#34;. If not set, it will match all of engines.
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable String engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engineVersion Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable String engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param instanceChargeType Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
         * 
         * @return builder
         * 
         */
        public Builder instanceChargeType(@Nullable String instanceChargeType) {
            $.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * @param multiZone Whether to show multi available zone. Default false to not show multi availability zone.
         * 
         * @return builder
         * 
         */
        public Builder multiZone(@Nullable Boolean multiZone) {
            $.multiZone = multiZone;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder sortedBy(@Nullable String sortedBy) {
            $.sortedBy = sortedBy;
            return this;
        }

        /**
         * @param storageType It has been deprecated from version 1.134.0+ and using `db_instance_storage_type` instead.
         * 
         * @return builder
         * 
         */
        public Builder storageType(@Nullable String storageType) {
            $.storageType = storageType;
            return this;
        }

        /**
         * @param zoneId The Zone to launch the DB instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetInstanceClassesPlainArgs build() {
            return $;
        }
    }

}
