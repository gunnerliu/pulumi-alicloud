// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElasticInstanceState extends com.pulumi.resources.ResourceArgs {

    public static final ElasticInstanceState Empty = new ElasticInstanceState();

    /**
     * ADB PG instance connection string.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    /**
     * @return ADB PG instance connection string.
     * 
     */
    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * The edition of the instance. Valid values: `Basic`, `HighAvailability`. Default value: `HighAvailability`.
     * 
     */
    @Import(name="dbInstanceCategory")
    private @Nullable Output<String> dbInstanceCategory;

    /**
     * @return The edition of the instance. Valid values: `Basic`, `HighAvailability`. Default value: `HighAvailability`.
     * 
     */
    public Optional<Output<String>> dbInstanceCategory() {
        return Optional.ofNullable(this.dbInstanceCategory);
    }

    /**
     * The description of ADB PG instance. It is a string of 2 to 256 characters.
     * 
     */
    @Import(name="dbInstanceDescription")
    private @Nullable Output<String> dbInstanceDescription;

    /**
     * @return The description of ADB PG instance. It is a string of 2 to 256 characters.
     * 
     */
    public Optional<Output<String>> dbInstanceDescription() {
        return Optional.ofNullable(this.dbInstanceDescription);
    }

    /**
     * The ID of the encryption key. **Note:** If the `encryption_type` parameter is set to `CloudDisk`, you must specify this parameter to the encryption key that is in the same region as the disk that is specified by the EncryptionType parameter. Otherwise, leave this parameter empty.
     * 
     */
    @Import(name="encryptionKey")
    private @Nullable Output<String> encryptionKey;

    /**
     * @return The ID of the encryption key. **Note:** If the `encryption_type` parameter is set to `CloudDisk`, you must specify this parameter to the encryption key that is in the same region as the disk that is specified by the EncryptionType parameter. Otherwise, leave this parameter empty.
     * 
     */
    public Optional<Output<String>> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }

    /**
     * The type of the encryption. Valid values: `CloudDisk`. **Note:** Disk encryption cannot be disabled after it is enabled.
     * 
     */
    @Import(name="encryptionType")
    private @Nullable Output<String> encryptionType;

    /**
     * @return The type of the encryption. Valid values: `CloudDisk`. **Note:** Disk encryption cannot be disabled after it is enabled.
     * 
     */
    public Optional<Output<String>> encryptionType() {
        return Optional.ofNullable(this.encryptionType);
    }

    /**
     * Database engine: `gpdb`.
     * 
     */
    @Import(name="engine")
    private @Nullable Output<String> engine;

    /**
     * @return Database engine: `gpdb`.
     * 
     */
    public Optional<Output<String>> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * Database version. Valid value is `6.0`.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    /**
     * @return Database version. Valid value is `6.0`.
     * 
     */
    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * The network type of ADB PG instance. Only `VPC` supported now.
     * 
     */
    @Import(name="instanceNetworkType")
    private @Nullable Output<String> instanceNetworkType;

    /**
     * @return The network type of ADB PG instance. Only `VPC` supported now.
     * 
     */
    public Optional<Output<String>> instanceNetworkType() {
        return Optional.ofNullable(this.instanceNetworkType);
    }

    /**
     * The specification of segment nodes.
     * * When `db_instance_category` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
     * * When `db_instance_category` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
     * 
     */
    @Import(name="instanceSpec")
    private @Nullable Output<String> instanceSpec;

    /**
     * @return The specification of segment nodes.
     * * When `db_instance_category` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
     * * When `db_instance_category` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
     * 
     */
    public Optional<Output<String>> instanceSpec() {
        return Optional.ofNullable(this.instanceSpec);
    }

    /**
     * The subscription period. Valid values: [1~12]. It is valid when payment_type is `Subscription`.\
     * **NOTE:** Will not take effect after modifying `payment_duration` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
     * 
     */
    @Import(name="paymentDuration")
    private @Nullable Output<Integer> paymentDuration;

    /**
     * @return The subscription period. Valid values: [1~12]. It is valid when payment_type is `Subscription`.\
     * **NOTE:** Will not take effect after modifying `payment_duration` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
     * 
     */
    public Optional<Output<Integer>> paymentDuration() {
        return Optional.ofNullable(this.paymentDuration);
    }

    /**
     * The unit of the subscription period. Valid values: `Month`, `Year`. It is valid when payment_type is `Subscription`.\
     * **NOTE:** Will not take effect after modifying `payment_duration_unit` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
     * 
     */
    @Import(name="paymentDurationUnit")
    private @Nullable Output<String> paymentDurationUnit;

    /**
     * @return The unit of the subscription period. Valid values: `Month`, `Year`. It is valid when payment_type is `Subscription`.\
     * **NOTE:** Will not take effect after modifying `payment_duration_unit` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
     * 
     */
    public Optional<Output<String>> paymentDurationUnit() {
        return Optional.ofNullable(this.paymentDurationUnit);
    }

    /**
     * Valid values are `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return Valid values are `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     * 
     */
    @Import(name="securityIpLists")
    private @Nullable Output<List<String>> securityIpLists;

    /**
     * @return List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     * 
     */
    public Optional<Output<List<String>>> securityIpLists() {
        return Optional.ofNullable(this.securityIpLists);
    }

    /**
     * The number of segment nodes. Minimum is `4`, max is `256`, step is `4`.
     * 
     */
    @Import(name="segNodeNum")
    private @Nullable Output<Integer> segNodeNum;

    /**
     * @return The number of segment nodes. Minimum is `4`, max is `256`, step is `4`.
     * 
     */
    public Optional<Output<Integer>> segNodeNum() {
        return Optional.ofNullable(this.segNodeNum);
    }

    /**
     * The disk type of segment nodes. Valid values: `cloud_essd`, `cloud_efficiency`.
     * 
     */
    @Import(name="segStorageType")
    private @Nullable Output<String> segStorageType;

    /**
     * @return The disk type of segment nodes. Valid values: `cloud_essd`, `cloud_efficiency`.
     * 
     */
    public Optional<Output<String>> segStorageType() {
        return Optional.ofNullable(this.segStorageType);
    }

    /**
     * Instance status.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Instance status.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The storage capacity of per segment node. Unit: GB. Minimum is `50`, max is `4000`, step is `50`.
     * 
     */
    @Import(name="storageSize")
    private @Nullable Output<Integer> storageSize;

    /**
     * @return The storage capacity of per segment node. Unit: GB. Minimum is `50`, max is `4000`, step is `50`.
     * 
     */
    public Optional<Output<Integer>> storageSize() {
        return Optional.ofNullable(this.storageSize);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The virtual switch ID to launch ADB PG instances in one VPC.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The virtual switch ID to launch ADB PG instances in one VPC.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    /**
     * The Zone to launch the ADB PG instance. If specified, must be consistent with the zone where the vswitch is located.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The Zone to launch the ADB PG instance. If specified, must be consistent with the zone where the vswitch is located.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private ElasticInstanceState() {}

    private ElasticInstanceState(ElasticInstanceState $) {
        this.connectionString = $.connectionString;
        this.dbInstanceCategory = $.dbInstanceCategory;
        this.dbInstanceDescription = $.dbInstanceDescription;
        this.encryptionKey = $.encryptionKey;
        this.encryptionType = $.encryptionType;
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.instanceNetworkType = $.instanceNetworkType;
        this.instanceSpec = $.instanceSpec;
        this.paymentDuration = $.paymentDuration;
        this.paymentDurationUnit = $.paymentDurationUnit;
        this.paymentType = $.paymentType;
        this.securityIpLists = $.securityIpLists;
        this.segNodeNum = $.segNodeNum;
        this.segStorageType = $.segStorageType;
        this.status = $.status;
        this.storageSize = $.storageSize;
        this.tags = $.tags;
        this.vswitchId = $.vswitchId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElasticInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElasticInstanceState $;

        public Builder() {
            $ = new ElasticInstanceState();
        }

        public Builder(ElasticInstanceState defaults) {
            $ = new ElasticInstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionString ADB PG instance connection string.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString ADB PG instance connection string.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param dbInstanceCategory The edition of the instance. Valid values: `Basic`, `HighAvailability`. Default value: `HighAvailability`.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceCategory(@Nullable Output<String> dbInstanceCategory) {
            $.dbInstanceCategory = dbInstanceCategory;
            return this;
        }

        /**
         * @param dbInstanceCategory The edition of the instance. Valid values: `Basic`, `HighAvailability`. Default value: `HighAvailability`.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceCategory(String dbInstanceCategory) {
            return dbInstanceCategory(Output.of(dbInstanceCategory));
        }

        /**
         * @param dbInstanceDescription The description of ADB PG instance. It is a string of 2 to 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceDescription(@Nullable Output<String> dbInstanceDescription) {
            $.dbInstanceDescription = dbInstanceDescription;
            return this;
        }

        /**
         * @param dbInstanceDescription The description of ADB PG instance. It is a string of 2 to 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceDescription(String dbInstanceDescription) {
            return dbInstanceDescription(Output.of(dbInstanceDescription));
        }

        /**
         * @param encryptionKey The ID of the encryption key. **Note:** If the `encryption_type` parameter is set to `CloudDisk`, you must specify this parameter to the encryption key that is in the same region as the disk that is specified by the EncryptionType parameter. Otherwise, leave this parameter empty.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(@Nullable Output<String> encryptionKey) {
            $.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * @param encryptionKey The ID of the encryption key. **Note:** If the `encryption_type` parameter is set to `CloudDisk`, you must specify this parameter to the encryption key that is in the same region as the disk that is specified by the EncryptionType parameter. Otherwise, leave this parameter empty.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(String encryptionKey) {
            return encryptionKey(Output.of(encryptionKey));
        }

        /**
         * @param encryptionType The type of the encryption. Valid values: `CloudDisk`. **Note:** Disk encryption cannot be disabled after it is enabled.
         * 
         * @return builder
         * 
         */
        public Builder encryptionType(@Nullable Output<String> encryptionType) {
            $.encryptionType = encryptionType;
            return this;
        }

        /**
         * @param encryptionType The type of the encryption. Valid values: `CloudDisk`. **Note:** Disk encryption cannot be disabled after it is enabled.
         * 
         * @return builder
         * 
         */
        public Builder encryptionType(String encryptionType) {
            return encryptionType(Output.of(encryptionType));
        }

        /**
         * @param engine Database engine: `gpdb`.
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable Output<String> engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engine Database engine: `gpdb`.
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param engineVersion Database version. Valid value is `6.0`.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param engineVersion Database version. Valid value is `6.0`.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        /**
         * @param instanceNetworkType The network type of ADB PG instance. Only `VPC` supported now.
         * 
         * @return builder
         * 
         */
        public Builder instanceNetworkType(@Nullable Output<String> instanceNetworkType) {
            $.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * @param instanceNetworkType The network type of ADB PG instance. Only `VPC` supported now.
         * 
         * @return builder
         * 
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            return instanceNetworkType(Output.of(instanceNetworkType));
        }

        /**
         * @param instanceSpec The specification of segment nodes.
         * * When `db_instance_category` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
         * * When `db_instance_category` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
         * 
         * @return builder
         * 
         */
        public Builder instanceSpec(@Nullable Output<String> instanceSpec) {
            $.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * @param instanceSpec The specification of segment nodes.
         * * When `db_instance_category` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
         * * When `db_instance_category` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
         * 
         * @return builder
         * 
         */
        public Builder instanceSpec(String instanceSpec) {
            return instanceSpec(Output.of(instanceSpec));
        }

        /**
         * @param paymentDuration The subscription period. Valid values: [1~12]. It is valid when payment_type is `Subscription`.\
         * **NOTE:** Will not take effect after modifying `payment_duration` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
         * 
         * @return builder
         * 
         */
        public Builder paymentDuration(@Nullable Output<Integer> paymentDuration) {
            $.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * @param paymentDuration The subscription period. Valid values: [1~12]. It is valid when payment_type is `Subscription`.\
         * **NOTE:** Will not take effect after modifying `payment_duration` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
         * 
         * @return builder
         * 
         */
        public Builder paymentDuration(Integer paymentDuration) {
            return paymentDuration(Output.of(paymentDuration));
        }

        /**
         * @param paymentDurationUnit The unit of the subscription period. Valid values: `Month`, `Year`. It is valid when payment_type is `Subscription`.\
         * **NOTE:** Will not take effect after modifying `payment_duration_unit` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
         * 
         * @return builder
         * 
         */
        public Builder paymentDurationUnit(@Nullable Output<String> paymentDurationUnit) {
            $.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        /**
         * @param paymentDurationUnit The unit of the subscription period. Valid values: `Month`, `Year`. It is valid when payment_type is `Subscription`.\
         * **NOTE:** Will not take effect after modifying `payment_duration_unit` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
         * 
         * @return builder
         * 
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            return paymentDurationUnit(Output.of(paymentDurationUnit));
        }

        /**
         * @param paymentType Valid values are `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType Valid values are `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param securityIpLists List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
         * 
         * @return builder
         * 
         */
        public Builder securityIpLists(@Nullable Output<List<String>> securityIpLists) {
            $.securityIpLists = securityIpLists;
            return this;
        }

        /**
         * @param securityIpLists List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
         * 
         * @return builder
         * 
         */
        public Builder securityIpLists(List<String> securityIpLists) {
            return securityIpLists(Output.of(securityIpLists));
        }

        /**
         * @param securityIpLists List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
         * 
         * @return builder
         * 
         */
        public Builder securityIpLists(String... securityIpLists) {
            return securityIpLists(List.of(securityIpLists));
        }

        /**
         * @param segNodeNum The number of segment nodes. Minimum is `4`, max is `256`, step is `4`.
         * 
         * @return builder
         * 
         */
        public Builder segNodeNum(@Nullable Output<Integer> segNodeNum) {
            $.segNodeNum = segNodeNum;
            return this;
        }

        /**
         * @param segNodeNum The number of segment nodes. Minimum is `4`, max is `256`, step is `4`.
         * 
         * @return builder
         * 
         */
        public Builder segNodeNum(Integer segNodeNum) {
            return segNodeNum(Output.of(segNodeNum));
        }

        /**
         * @param segStorageType The disk type of segment nodes. Valid values: `cloud_essd`, `cloud_efficiency`.
         * 
         * @return builder
         * 
         */
        public Builder segStorageType(@Nullable Output<String> segStorageType) {
            $.segStorageType = segStorageType;
            return this;
        }

        /**
         * @param segStorageType The disk type of segment nodes. Valid values: `cloud_essd`, `cloud_efficiency`.
         * 
         * @return builder
         * 
         */
        public Builder segStorageType(String segStorageType) {
            return segStorageType(Output.of(segStorageType));
        }

        /**
         * @param status Instance status.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Instance status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param storageSize The storage capacity of per segment node. Unit: GB. Minimum is `50`, max is `4000`, step is `50`.
         * 
         * @return builder
         * 
         */
        public Builder storageSize(@Nullable Output<Integer> storageSize) {
            $.storageSize = storageSize;
            return this;
        }

        /**
         * @param storageSize The storage capacity of per segment node. Unit: GB. Minimum is `50`, max is `4000`, step is `50`.
         * 
         * @return builder
         * 
         */
        public Builder storageSize(Integer storageSize) {
            return storageSize(Output.of(storageSize));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vswitchId The virtual switch ID to launch ADB PG instances in one VPC.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The virtual switch ID to launch ADB PG instances in one VPC.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        /**
         * @param zoneId The Zone to launch the ADB PG instance. If specified, must be consistent with the zone where the vswitch is located.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The Zone to launch the ADB PG instance. If specified, must be consistent with the zone where the vswitch is located.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ElasticInstanceState build() {
            return $;
        }
    }

}
