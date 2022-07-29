// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RestoreJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestoreJobArgs Empty = new RestoreJobArgs();

    /**
     * The exclude path. **NOTE:** Invalid while source_type equals `OSS` or `NAS`. It&#39;s a json string with format:`[&#34;/excludePath]`, up to 255 characters. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
     * 
     */
    @Import(name="exclude")
    private @Nullable Output<String> exclude;

    /**
     * @return The exclude path. **NOTE:** Invalid while source_type equals `OSS` or `NAS`. It&#39;s a json string with format:`[&#34;/excludePath]`, up to 255 characters. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
     * 
     */
    public Optional<Output<String>> exclude() {
        return Optional.ofNullable(this.exclude);
    }

    /**
     * The include path. **NOTE:** Invalid while source_type equals `OSS` or `NAS`. It&#39;s a json string with format:`[&#34;/includePath&#34;]`, Up to 255 characters. **WARNING:** The field is required while source_type equals `OTS_TABLE` which means source table name. If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
     * 
     */
    @Import(name="include")
    private @Nullable Output<String> include;

    /**
     * @return The include path. **NOTE:** Invalid while source_type equals `OSS` or `NAS`. It&#39;s a json string with format:`[&#34;/includePath&#34;]`, Up to 255 characters. **WARNING:** The field is required while source_type equals `OTS_TABLE` which means source table name. If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
     * 
     */
    public Optional<Output<String>> include() {
        return Optional.ofNullable(this.include);
    }

    /**
     * Recovery options. **NOTE:** Required while source_type equals `OSS` or `NAS`, invalid while source_type equals `ECS_FILE`. It&#39;s a json string with format:`&#34;{&#34;includes&#34;:[],&#34;excludes&#34;:[]}&#34;,`. Recovery options. When restores OTS_TABLE and real target time is the rangEnd time of the snapshot, it should be a string with format: `{&#34;UI_TargetTime&#34;:1650032529018}`.
     * 
     */
    @Import(name="options")
    private @Nullable Output<String> options;

    /**
     * @return Recovery options. **NOTE:** Required while source_type equals `OSS` or `NAS`, invalid while source_type equals `ECS_FILE`. It&#39;s a json string with format:`&#34;{&#34;includes&#34;:[],&#34;excludes&#34;:[]}&#34;,`. Recovery options. When restores OTS_TABLE and real target time is the rangEnd time of the snapshot, it should be a string with format: `{&#34;UI_TargetTime&#34;:1650032529018}`.
     * 
     */
    public Optional<Output<String>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Restore Job ID. It&#39;s the unique key of this resource, if you want to set this argument by yourself, you must specify a unique keyword that never appears.
     * 
     */
    @Import(name="restoreJobId")
    private @Nullable Output<String> restoreJobId;

    /**
     * @return Restore Job ID. It&#39;s the unique key of this resource, if you want to set this argument by yourself, you must specify a unique keyword that never appears.
     * 
     */
    public Optional<Output<String>> restoreJobId() {
        return Optional.ofNullable(this.restoreJobId);
    }

    /**
     * The type of recovery destination. Valid values: `ECS_FILE`, `NAS`, `OSS`,`OTS_TABLE`,`UDM_ECS_ROLLBACK`. **Note**: Currently, there is a one-to-one correspondence between the data source type with the recovery destination type.
     * 
     */
    @Import(name="restoreType", required=true)
    private Output<String> restoreType;

    /**
     * @return The type of recovery destination. Valid values: `ECS_FILE`, `NAS`, `OSS`,`OTS_TABLE`,`UDM_ECS_ROLLBACK`. **Note**: Currently, there is a one-to-one correspondence between the data source type with the recovery destination type.
     * 
     */
    public Output<String> restoreType() {
        return this.restoreType;
    }

    /**
     * The hashcode of Snapshot.
     * 
     */
    @Import(name="snapshotHash", required=true)
    private Output<String> snapshotHash;

    /**
     * @return The hashcode of Snapshot.
     * 
     */
    public Output<String> snapshotHash() {
        return this.snapshotHash;
    }

    /**
     * The ID of Snapshot.
     * 
     */
    @Import(name="snapshotId", required=true)
    private Output<String> snapshotId;

    /**
     * @return The ID of Snapshot.
     * 
     */
    public Output<String> snapshotId() {
        return this.snapshotId;
    }

    /**
     * The type of data source. Valid values: `ECS_FILE`, `NAS`, `OSS`,`OTS_TABLE`,`UDM_ECS`.
     * 
     */
    @Import(name="sourceType", required=true)
    private Output<String> sourceType;

    /**
     * @return The type of data source. Valid values: `ECS_FILE`, `NAS`, `OSS`,`OTS_TABLE`,`UDM_ECS`.
     * 
     */
    public Output<String> sourceType() {
        return this.sourceType;
    }

    /**
     * The target name of OSS bucket. **NOTE:** Required while source_type equals `OSS`,
     * 
     */
    @Import(name="targetBucket")
    private @Nullable Output<String> targetBucket;

    /**
     * @return The target name of OSS bucket. **NOTE:** Required while source_type equals `OSS`,
     * 
     */
    public Optional<Output<String>> targetBucket() {
        return Optional.ofNullable(this.targetBucket);
    }

    /**
     * The target client ID.
     * 
     */
    @Import(name="targetClientId")
    private @Nullable Output<String> targetClientId;

    /**
     * @return The target client ID.
     * 
     */
    public Optional<Output<String>> targetClientId() {
        return Optional.ofNullable(this.targetClientId);
    }

    /**
     * The creation time of destination File System. **NOTE:** While source_type equals `NAS`, this parameter must be set. **Note:** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
     * 
     */
    @Import(name="targetCreateTime")
    private @Nullable Output<String> targetCreateTime;

    /**
     * @return The creation time of destination File System. **NOTE:** While source_type equals `NAS`, this parameter must be set. **Note:** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
     * 
     */
    public Optional<Output<String>> targetCreateTime() {
        return Optional.ofNullable(this.targetCreateTime);
    }

    /**
     * The target data source ID.
     * 
     */
    @Import(name="targetDataSourceId")
    private @Nullable Output<String> targetDataSourceId;

    /**
     * @return The target data source ID.
     * 
     */
    public Optional<Output<String>> targetDataSourceId() {
        return Optional.ofNullable(this.targetDataSourceId);
    }

    /**
     * The ID of destination File System. **NOTE:** Required while source_type equals `NAS`
     * 
     */
    @Import(name="targetFileSystemId")
    private @Nullable Output<String> targetFileSystemId;

    /**
     * @return The ID of destination File System. **NOTE:** Required while source_type equals `NAS`
     * 
     */
    public Optional<Output<String>> targetFileSystemId() {
        return Optional.ofNullable(this.targetFileSystemId);
    }

    /**
     * The target ID of ECS instance. **NOTE:** Required while source_type equals `ECS_FILE`
     * 
     */
    @Import(name="targetInstanceId")
    private @Nullable Output<String> targetInstanceId;

    /**
     * @return The target ID of ECS instance. **NOTE:** Required while source_type equals `ECS_FILE`
     * 
     */
    public Optional<Output<String>> targetInstanceId() {
        return Optional.ofNullable(this.targetInstanceId);
    }

    /**
     * The name of the Table store instance to which you want to restore data.**WARNING:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    @Import(name="targetInstanceName")
    private @Nullable Output<String> targetInstanceName;

    /**
     * @return The name of the Table store instance to which you want to restore data.**WARNING:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    public Optional<Output<String>> targetInstanceName() {
        return Optional.ofNullable(this.targetInstanceName);
    }

    /**
     * The target file path of (ECS) instance. **WARNING:** Required while source_type equals `NAS` or `ECS_FILE`, If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
     * 
     */
    @Import(name="targetPath")
    private @Nullable Output<String> targetPath;

    /**
     * @return The target file path of (ECS) instance. **WARNING:** Required while source_type equals `NAS` or `ECS_FILE`, If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
     * 
     */
    public Optional<Output<String>> targetPath() {
        return Optional.ofNullable(this.targetPath);
    }

    /**
     * The target prefix of the OSS object. **WARNING:** Required while source_type equals `OSS`. If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
     * 
     */
    @Import(name="targetPrefix")
    private @Nullable Output<String> targetPrefix;

    /**
     * @return The target prefix of the OSS object. **WARNING:** Required while source_type equals `OSS`. If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
     * 
     */
    public Optional<Output<String>> targetPrefix() {
        return Optional.ofNullable(this.targetPrefix);
    }

    /**
     * The name of the table that stores the restored data. **WARNING:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    @Import(name="targetTableName")
    private @Nullable Output<String> targetTableName;

    /**
     * @return The name of the table that stores the restored data. **WARNING:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    public Optional<Output<String>> targetTableName() {
        return Optional.ofNullable(this.targetTableName);
    }

    /**
     * The time when data is restored to the Table store instance. This value is a UNIX timestamp. Unit: seconds. **WARNING:** Required while source_type equals `OTS_TABLE`. **Note:** The time when data is restored to the Tablestore instance. It should be 0 if restores data at the End time of the snapshot.
     * 
     */
    @Import(name="targetTime")
    private @Nullable Output<String> targetTime;

    /**
     * @return The time when data is restored to the Table store instance. This value is a UNIX timestamp. Unit: seconds. **WARNING:** Required while source_type equals `OTS_TABLE`. **Note:** The time when data is restored to the Tablestore instance. It should be 0 if restores data at the End time of the snapshot.
     * 
     */
    public Optional<Output<String>> targetTime() {
        return Optional.ofNullable(this.targetTime);
    }

    /**
     * The full machine backup details.
     * 
     */
    @Import(name="udmDetail")
    private @Nullable Output<String> udmDetail;

    /**
     * @return The full machine backup details.
     * 
     */
    public Optional<Output<String>> udmDetail() {
        return Optional.ofNullable(this.udmDetail);
    }

    /**
     * The ID of backup vault.
     * 
     */
    @Import(name="vaultId", required=true)
    private Output<String> vaultId;

    /**
     * @return The ID of backup vault.
     * 
     */
    public Output<String> vaultId() {
        return this.vaultId;
    }

    private RestoreJobArgs() {}

    private RestoreJobArgs(RestoreJobArgs $) {
        this.exclude = $.exclude;
        this.include = $.include;
        this.options = $.options;
        this.restoreJobId = $.restoreJobId;
        this.restoreType = $.restoreType;
        this.snapshotHash = $.snapshotHash;
        this.snapshotId = $.snapshotId;
        this.sourceType = $.sourceType;
        this.targetBucket = $.targetBucket;
        this.targetClientId = $.targetClientId;
        this.targetCreateTime = $.targetCreateTime;
        this.targetDataSourceId = $.targetDataSourceId;
        this.targetFileSystemId = $.targetFileSystemId;
        this.targetInstanceId = $.targetInstanceId;
        this.targetInstanceName = $.targetInstanceName;
        this.targetPath = $.targetPath;
        this.targetPrefix = $.targetPrefix;
        this.targetTableName = $.targetTableName;
        this.targetTime = $.targetTime;
        this.udmDetail = $.udmDetail;
        this.vaultId = $.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestoreJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestoreJobArgs $;

        public Builder() {
            $ = new RestoreJobArgs();
        }

        public Builder(RestoreJobArgs defaults) {
            $ = new RestoreJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exclude The exclude path. **NOTE:** Invalid while source_type equals `OSS` or `NAS`. It&#39;s a json string with format:`[&#34;/excludePath]`, up to 255 characters. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
         * 
         * @return builder
         * 
         */
        public Builder exclude(@Nullable Output<String> exclude) {
            $.exclude = exclude;
            return this;
        }

        /**
         * @param exclude The exclude path. **NOTE:** Invalid while source_type equals `OSS` or `NAS`. It&#39;s a json string with format:`[&#34;/excludePath]`, up to 255 characters. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
         * 
         * @return builder
         * 
         */
        public Builder exclude(String exclude) {
            return exclude(Output.of(exclude));
        }

        /**
         * @param include The include path. **NOTE:** Invalid while source_type equals `OSS` or `NAS`. It&#39;s a json string with format:`[&#34;/includePath&#34;]`, Up to 255 characters. **WARNING:** The field is required while source_type equals `OTS_TABLE` which means source table name. If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
         * 
         * @return builder
         * 
         */
        public Builder include(@Nullable Output<String> include) {
            $.include = include;
            return this;
        }

        /**
         * @param include The include path. **NOTE:** Invalid while source_type equals `OSS` or `NAS`. It&#39;s a json string with format:`[&#34;/includePath&#34;]`, Up to 255 characters. **WARNING:** The field is required while source_type equals `OTS_TABLE` which means source table name. If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
         * 
         * @return builder
         * 
         */
        public Builder include(String include) {
            return include(Output.of(include));
        }

        /**
         * @param options Recovery options. **NOTE:** Required while source_type equals `OSS` or `NAS`, invalid while source_type equals `ECS_FILE`. It&#39;s a json string with format:`&#34;{&#34;includes&#34;:[],&#34;excludes&#34;:[]}&#34;,`. Recovery options. When restores OTS_TABLE and real target time is the rangEnd time of the snapshot, it should be a string with format: `{&#34;UI_TargetTime&#34;:1650032529018}`.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<String> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Recovery options. **NOTE:** Required while source_type equals `OSS` or `NAS`, invalid while source_type equals `ECS_FILE`. It&#39;s a json string with format:`&#34;{&#34;includes&#34;:[],&#34;excludes&#34;:[]}&#34;,`. Recovery options. When restores OTS_TABLE and real target time is the rangEnd time of the snapshot, it should be a string with format: `{&#34;UI_TargetTime&#34;:1650032529018}`.
         * 
         * @return builder
         * 
         */
        public Builder options(String options) {
            return options(Output.of(options));
        }

        /**
         * @param restoreJobId Restore Job ID. It&#39;s the unique key of this resource, if you want to set this argument by yourself, you must specify a unique keyword that never appears.
         * 
         * @return builder
         * 
         */
        public Builder restoreJobId(@Nullable Output<String> restoreJobId) {
            $.restoreJobId = restoreJobId;
            return this;
        }

        /**
         * @param restoreJobId Restore Job ID. It&#39;s the unique key of this resource, if you want to set this argument by yourself, you must specify a unique keyword that never appears.
         * 
         * @return builder
         * 
         */
        public Builder restoreJobId(String restoreJobId) {
            return restoreJobId(Output.of(restoreJobId));
        }

        /**
         * @param restoreType The type of recovery destination. Valid values: `ECS_FILE`, `NAS`, `OSS`,`OTS_TABLE`,`UDM_ECS_ROLLBACK`. **Note**: Currently, there is a one-to-one correspondence between the data source type with the recovery destination type.
         * 
         * @return builder
         * 
         */
        public Builder restoreType(Output<String> restoreType) {
            $.restoreType = restoreType;
            return this;
        }

        /**
         * @param restoreType The type of recovery destination. Valid values: `ECS_FILE`, `NAS`, `OSS`,`OTS_TABLE`,`UDM_ECS_ROLLBACK`. **Note**: Currently, there is a one-to-one correspondence between the data source type with the recovery destination type.
         * 
         * @return builder
         * 
         */
        public Builder restoreType(String restoreType) {
            return restoreType(Output.of(restoreType));
        }

        /**
         * @param snapshotHash The hashcode of Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotHash(Output<String> snapshotHash) {
            $.snapshotHash = snapshotHash;
            return this;
        }

        /**
         * @param snapshotHash The hashcode of Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotHash(String snapshotHash) {
            return snapshotHash(Output.of(snapshotHash));
        }

        /**
         * @param snapshotId The ID of Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId The ID of Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        /**
         * @param sourceType The type of data source. Valid values: `ECS_FILE`, `NAS`, `OSS`,`OTS_TABLE`,`UDM_ECS`.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        /**
         * @param sourceType The type of data source. Valid values: `ECS_FILE`, `NAS`, `OSS`,`OTS_TABLE`,`UDM_ECS`.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        /**
         * @param targetBucket The target name of OSS bucket. **NOTE:** Required while source_type equals `OSS`,
         * 
         * @return builder
         * 
         */
        public Builder targetBucket(@Nullable Output<String> targetBucket) {
            $.targetBucket = targetBucket;
            return this;
        }

        /**
         * @param targetBucket The target name of OSS bucket. **NOTE:** Required while source_type equals `OSS`,
         * 
         * @return builder
         * 
         */
        public Builder targetBucket(String targetBucket) {
            return targetBucket(Output.of(targetBucket));
        }

        /**
         * @param targetClientId The target client ID.
         * 
         * @return builder
         * 
         */
        public Builder targetClientId(@Nullable Output<String> targetClientId) {
            $.targetClientId = targetClientId;
            return this;
        }

        /**
         * @param targetClientId The target client ID.
         * 
         * @return builder
         * 
         */
        public Builder targetClientId(String targetClientId) {
            return targetClientId(Output.of(targetClientId));
        }

        /**
         * @param targetCreateTime The creation time of destination File System. **NOTE:** While source_type equals `NAS`, this parameter must be set. **Note:** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
         * 
         * @return builder
         * 
         */
        public Builder targetCreateTime(@Nullable Output<String> targetCreateTime) {
            $.targetCreateTime = targetCreateTime;
            return this;
        }

        /**
         * @param targetCreateTime The creation time of destination File System. **NOTE:** While source_type equals `NAS`, this parameter must be set. **Note:** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
         * 
         * @return builder
         * 
         */
        public Builder targetCreateTime(String targetCreateTime) {
            return targetCreateTime(Output.of(targetCreateTime));
        }

        /**
         * @param targetDataSourceId The target data source ID.
         * 
         * @return builder
         * 
         */
        public Builder targetDataSourceId(@Nullable Output<String> targetDataSourceId) {
            $.targetDataSourceId = targetDataSourceId;
            return this;
        }

        /**
         * @param targetDataSourceId The target data source ID.
         * 
         * @return builder
         * 
         */
        public Builder targetDataSourceId(String targetDataSourceId) {
            return targetDataSourceId(Output.of(targetDataSourceId));
        }

        /**
         * @param targetFileSystemId The ID of destination File System. **NOTE:** Required while source_type equals `NAS`
         * 
         * @return builder
         * 
         */
        public Builder targetFileSystemId(@Nullable Output<String> targetFileSystemId) {
            $.targetFileSystemId = targetFileSystemId;
            return this;
        }

        /**
         * @param targetFileSystemId The ID of destination File System. **NOTE:** Required while source_type equals `NAS`
         * 
         * @return builder
         * 
         */
        public Builder targetFileSystemId(String targetFileSystemId) {
            return targetFileSystemId(Output.of(targetFileSystemId));
        }

        /**
         * @param targetInstanceId The target ID of ECS instance. **NOTE:** Required while source_type equals `ECS_FILE`
         * 
         * @return builder
         * 
         */
        public Builder targetInstanceId(@Nullable Output<String> targetInstanceId) {
            $.targetInstanceId = targetInstanceId;
            return this;
        }

        /**
         * @param targetInstanceId The target ID of ECS instance. **NOTE:** Required while source_type equals `ECS_FILE`
         * 
         * @return builder
         * 
         */
        public Builder targetInstanceId(String targetInstanceId) {
            return targetInstanceId(Output.of(targetInstanceId));
        }

        /**
         * @param targetInstanceName The name of the Table store instance to which you want to restore data.**WARNING:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder targetInstanceName(@Nullable Output<String> targetInstanceName) {
            $.targetInstanceName = targetInstanceName;
            return this;
        }

        /**
         * @param targetInstanceName The name of the Table store instance to which you want to restore data.**WARNING:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder targetInstanceName(String targetInstanceName) {
            return targetInstanceName(Output.of(targetInstanceName));
        }

        /**
         * @param targetPath The target file path of (ECS) instance. **WARNING:** Required while source_type equals `NAS` or `ECS_FILE`, If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
         * 
         * @return builder
         * 
         */
        public Builder targetPath(@Nullable Output<String> targetPath) {
            $.targetPath = targetPath;
            return this;
        }

        /**
         * @param targetPath The target file path of (ECS) instance. **WARNING:** Required while source_type equals `NAS` or `ECS_FILE`, If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
         * 
         * @return builder
         * 
         */
        public Builder targetPath(String targetPath) {
            return targetPath(Output.of(targetPath));
        }

        /**
         * @param targetPrefix The target prefix of the OSS object. **WARNING:** Required while source_type equals `OSS`. If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
         * 
         * @return builder
         * 
         */
        public Builder targetPrefix(@Nullable Output<String> targetPrefix) {
            $.targetPrefix = targetPrefix;
            return this;
        }

        /**
         * @param targetPrefix The target prefix of the OSS object. **WARNING:** Required while source_type equals `OSS`. If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
         * 
         * @return builder
         * 
         */
        public Builder targetPrefix(String targetPrefix) {
            return targetPrefix(Output.of(targetPrefix));
        }

        /**
         * @param targetTableName The name of the table that stores the restored data. **WARNING:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder targetTableName(@Nullable Output<String> targetTableName) {
            $.targetTableName = targetTableName;
            return this;
        }

        /**
         * @param targetTableName The name of the table that stores the restored data. **WARNING:** Required while source_type equals `OTS_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder targetTableName(String targetTableName) {
            return targetTableName(Output.of(targetTableName));
        }

        /**
         * @param targetTime The time when data is restored to the Table store instance. This value is a UNIX timestamp. Unit: seconds. **WARNING:** Required while source_type equals `OTS_TABLE`. **Note:** The time when data is restored to the Tablestore instance. It should be 0 if restores data at the End time of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder targetTime(@Nullable Output<String> targetTime) {
            $.targetTime = targetTime;
            return this;
        }

        /**
         * @param targetTime The time when data is restored to the Table store instance. This value is a UNIX timestamp. Unit: seconds. **WARNING:** Required while source_type equals `OTS_TABLE`. **Note:** The time when data is restored to the Tablestore instance. It should be 0 if restores data at the End time of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder targetTime(String targetTime) {
            return targetTime(Output.of(targetTime));
        }

        /**
         * @param udmDetail The full machine backup details.
         * 
         * @return builder
         * 
         */
        public Builder udmDetail(@Nullable Output<String> udmDetail) {
            $.udmDetail = udmDetail;
            return this;
        }

        /**
         * @param udmDetail The full machine backup details.
         * 
         * @return builder
         * 
         */
        public Builder udmDetail(String udmDetail) {
            return udmDetail(Output.of(udmDetail));
        }

        /**
         * @param vaultId The ID of backup vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(Output<String> vaultId) {
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

        public RestoreJobArgs build() {
            $.restoreType = Objects.requireNonNull($.restoreType, "expected parameter 'restoreType' to be non-null");
            $.snapshotHash = Objects.requireNonNull($.snapshotHash, "expected parameter 'snapshotHash' to be non-null");
            $.snapshotId = Objects.requireNonNull($.snapshotId, "expected parameter 'snapshotId' to be non-null");
            $.sourceType = Objects.requireNonNull($.sourceType, "expected parameter 'sourceType' to be non-null");
            $.vaultId = Objects.requireNonNull($.vaultId, "expected parameter 'vaultId' to be non-null");
            return $;
        }
    }

}
