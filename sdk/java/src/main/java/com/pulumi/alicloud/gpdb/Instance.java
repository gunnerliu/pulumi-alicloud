// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.gpdb.InstanceArgs;
import com.pulumi.alicloud.gpdb.inputs.InstanceState;
import com.pulumi.alicloud.gpdb.outputs.InstanceIpWhitelist;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a AnalyticDB for PostgreSQL instance resource supports replica set instances only. the AnalyticDB for PostgreSQL provides stable, reliable, and automatic scalable database services.
 * You can see detail product introduction [here](https://www.alibabacloud.com/help/doc-detail/35387.htm)
 * 
 * &gt; **NOTE:**  Available in 1.47.0+
 * 
 * ## Import
 * 
 * AnalyticDB for PostgreSQL can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:gpdb/instance:Instance example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:gpdb/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * Field `availability_zone` has been deprecated from provider version 1.187.0. New field `zone_id` instead.
     * 
     * @deprecated
     * Field &#39;availability_zone&#39; has been deprecated from version 1.187.0. Use &#39;zone_id&#39; instead.
     * 
     */
    @Deprecated /* Field 'availability_zone' has been deprecated from version 1.187.0. Use 'zone_id' instead. */
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return Field `availability_zone` has been deprecated from provider version 1.187.0. New field `zone_id` instead.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * (Available in 1.196.0+) The connection string of the instance.
     * 
     */
    @Export(name="connectionString", type=String.class, parameters={})
    private Output<String> connectionString;

    /**
     * @return (Available in 1.196.0+) The connection string of the instance.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
    }
    /**
     * Whether to load the sample dataset after the instance is created. Valid values: `true`, `false`.
     * 
     */
    @Export(name="createSampleData", type=Boolean.class, parameters={})
    private Output<Boolean> createSampleData;

    /**
     * @return Whether to load the sample dataset after the instance is created. Valid values: `true`, `false`.
     * 
     */
    public Output<Boolean> createSampleData() {
        return this.createSampleData;
    }
    /**
     * The db instance category. Valid values: `HighAvailability`, `Basic`.
     * &gt; **NOTE:** This parameter must be passed in to create a storage reservation mode instance.
     * 
     */
    @Export(name="dbInstanceCategory", type=String.class, parameters={})
    private Output<String> dbInstanceCategory;

    /**
     * @return The db instance category. Valid values: `HighAvailability`, `Basic`.
     * &gt; **NOTE:** This parameter must be passed in to create a storage reservation mode instance.
     * 
     */
    public Output<String> dbInstanceCategory() {
        return this.dbInstanceCategory;
    }
    /**
     * The db instance class. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/86942.htm).
     * &gt; **NOTE:** This parameter must be passed in to create a storage reservation mode instance.
     * 
     */
    @Export(name="dbInstanceClass", type=String.class, parameters={})
    private Output</* @Nullable */ String> dbInstanceClass;

    /**
     * @return The db instance class. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/86942.htm).
     * &gt; **NOTE:** This parameter must be passed in to create a storage reservation mode instance.
     * 
     */
    public Output<Optional<String>> dbInstanceClass() {
        return Codegen.optional(this.dbInstanceClass);
    }
    /**
     * The db instance mode. Valid values: `StorageElastic`, `Serverless`, `Classic`.
     * 
     */
    @Export(name="dbInstanceMode", type=String.class, parameters={})
    private Output<String> dbInstanceMode;

    /**
     * @return The db instance mode. Valid values: `StorageElastic`, `Serverless`, `Classic`.
     * 
     */
    public Output<String> dbInstanceMode() {
        return this.dbInstanceMode;
    }
    /**
     * The description of the instance.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the instance.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The database engine used by the instance. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/86908.htm) `EngineVersion`.
     * 
     */
    @Export(name="engine", type=String.class, parameters={})
    private Output<String> engine;

    /**
     * @return The database engine used by the instance. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/86908.htm) `EngineVersion`.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * The version of the database engine used by the instance.
     * 
     */
    @Export(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return The version of the database engine used by the instance.
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * Field `instance_charge_type` has been deprecated from provider version 1.187.0. New field `payment_type` instead.
     * 
     * @deprecated
     * Field &#39;instance_charge_type&#39; has been deprecated from version 1.187.0. Use &#39;payment_type&#39; instead.
     * 
     */
    @Deprecated /* Field 'instance_charge_type' has been deprecated from version 1.187.0. Use 'payment_type' instead. */
    @Export(name="instanceChargeType", type=String.class, parameters={})
    private Output<String> instanceChargeType;

    /**
     * @return Field `instance_charge_type` has been deprecated from provider version 1.187.0. New field `payment_type` instead.
     * 
     */
    public Output<String> instanceChargeType() {
        return this.instanceChargeType;
    }
    /**
     * The number of nodes. Valid values: `2`, `4`, `8`, `12`, `16`, `24`, `32`, `64`, `96`, `128`.
     * 
     */
    @Export(name="instanceGroupCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> instanceGroupCount;

    /**
     * @return The number of nodes. Valid values: `2`, `4`, `8`, `12`, `16`, `24`, `32`, `64`, `96`, `128`.
     * 
     */
    public Output<Optional<Integer>> instanceGroupCount() {
        return Codegen.optional(this.instanceGroupCount);
    }
    /**
     * The network type of the instance.
     * 
     */
    @Export(name="instanceNetworkType", type=String.class, parameters={})
    private Output<String> instanceNetworkType;

    /**
     * @return The network type of the instance.
     * 
     */
    public Output<String> instanceNetworkType() {
        return this.instanceNetworkType;
    }
    /**
     * The specification of segment nodes.
     * * When `db_instance_category` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
     * * When `db_instance_category` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
     * * When `db_instance_category` is `Serverless`, Valid values: `4C16G`, `8C32G`.
     * &gt; **NOTE:** This parameter must be passed to create a storage elastic mode instance and a serverless version instance.
     * 
     */
    @Export(name="instanceSpec", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceSpec;

    /**
     * @return The specification of segment nodes.
     * * When `db_instance_category` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
     * * When `db_instance_category` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
     * * When `db_instance_category` is `Serverless`, Valid values: `4C16G`, `8C32G`.
     * &gt; **NOTE:** This parameter must be passed to create a storage elastic mode instance and a serverless version instance.
     * 
     */
    public Output<Optional<String>> instanceSpec() {
        return Codegen.optional(this.instanceSpec);
    }
    /**
     * The ip whitelist.
     * 
     */
    @Export(name="ipWhitelists", type=List.class, parameters={InstanceIpWhitelist.class})
    private Output</* @Nullable */ List<InstanceIpWhitelist>> ipWhitelists;

    /**
     * @return The ip whitelist.
     * 
     */
    public Output<Optional<List<InstanceIpWhitelist>>> ipWhitelists() {
        return Codegen.optional(this.ipWhitelists);
    }
    /**
     * The end time of the maintenance window for the instance. in the format of HH:mmZ (UTC time), for example 03:00Z. start time should be later than end time.
     * 
     */
    @Export(name="maintainEndTime", type=String.class, parameters={})
    private Output<String> maintainEndTime;

    /**
     * @return The end time of the maintenance window for the instance. in the format of HH:mmZ (UTC time), for example 03:00Z. start time should be later than end time.
     * 
     */
    public Output<String> maintainEndTime() {
        return this.maintainEndTime;
    }
    /**
     * The start time of the maintenance window for the instance. in the format of HH:mmZ (UTC time), for example 02:00Z.
     * 
     */
    @Export(name="maintainStartTime", type=String.class, parameters={})
    private Output<String> maintainStartTime;

    /**
     * @return The start time of the maintenance window for the instance. in the format of HH:mmZ (UTC time), for example 02:00Z.
     * 
     */
    public Output<String> maintainStartTime() {
        return this.maintainStartTime;
    }
    /**
     * The number of Master nodes. Valid values: 1 to 2. if it is not filled in, the default value is 1 Master node.
     * 
     */
    @Export(name="masterNodeNum", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> masterNodeNum;

    /**
     * @return The number of Master nodes. Valid values: 1 to 2. if it is not filled in, the default value is 1 Master node.
     * 
     */
    public Output<Optional<Integer>> masterNodeNum() {
        return Codegen.optional(this.masterNodeNum);
    }
    /**
     * The billing method of the instance. Valid values: `Subscription`, `PayAsYouGo`.
     * 
     */
    @Export(name="paymentType", type=String.class, parameters={})
    private Output<String> paymentType;

    /**
     * @return The billing method of the instance. Valid values: `Subscription`, `PayAsYouGo`.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }
    /**
     * The duration that you will buy the resource, in month. required when `payment_type` is `Subscription`. Valid values: `Year`, `Month`.
     * 
     */
    @Export(name="period", type=String.class, parameters={})
    private Output</* @Nullable */ String> period;

    /**
     * @return The duration that you will buy the resource, in month. required when `payment_type` is `Subscription`. Valid values: `Year`, `Month`.
     * 
     */
    public Output<Optional<String>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * (Available in 1.196.0+) The connection port of the instance.
     * 
     */
    @Export(name="port", type=String.class, parameters={})
    private Output<String> port;

    /**
     * @return (Available in 1.196.0+) The connection port of the instance.
     * 
     */
    public Output<String> port() {
        return this.port;
    }
    /**
     * The private ip address.
     * 
     */
    @Export(name="privateIpAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateIpAddress;

    /**
     * @return The private ip address.
     * 
     */
    public Output<Optional<String>> privateIpAddress() {
        return Codegen.optional(this.privateIpAddress);
    }
    /**
     * The ID of the enterprise resource group to which the instance belongs.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroupId;

    /**
     * @return The ID of the enterprise resource group to which the instance belongs.
     * 
     */
    public Output<Optional<String>> resourceGroupId() {
        return Codegen.optional(this.resourceGroupId);
    }
    /**
     * Field `security_ip_list` has been deprecated from provider version 1.187.0. New field `ip_whitelist` instead.
     * 
     * @deprecated
     * Field &#39;security_ip_list&#39; has been deprecated from version 1.187.0. Use &#39;ip_whitelist&#39; instead.
     * 
     */
    @Deprecated /* Field 'security_ip_list' has been deprecated from version 1.187.0. Use 'ip_whitelist' instead. */
    @Export(name="securityIpLists", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityIpLists;

    /**
     * @return Field `security_ip_list` has been deprecated from provider version 1.187.0. New field `ip_whitelist` instead.
     * 
     */
    public Output<Optional<List<String>>> securityIpLists() {
        return Codegen.optional(this.securityIpLists);
    }
    /**
     * Calculate the number of nodes. The value range of the high-availability version of the storage elastic mode is 4 to 512, and the value must be a multiple of 4. The value range of the basic version of the storage elastic mode is 2 to 512, and the value must be a multiple of 2. The-Serverless version has a value range of 2 to 512. The value must be a multiple of 2.
     * &gt; **NOTE:** This parameter must be passed in to create a storage elastic mode instance and a Serverless version instance. During the public beta of the Serverless version (from 0101, 2022 to 0131, 2022), a maximum of 12 compute nodes can be created.
     * 
     */
    @Export(name="segNodeNum", type=Integer.class, parameters={})
    private Output<Integer> segNodeNum;

    /**
     * @return Calculate the number of nodes. The value range of the high-availability version of the storage elastic mode is 4 to 512, and the value must be a multiple of 4. The value range of the basic version of the storage elastic mode is 2 to 512, and the value must be a multiple of 2. The-Serverless version has a value range of 2 to 512. The value must be a multiple of 2.
     * &gt; **NOTE:** This parameter must be passed in to create a storage elastic mode instance and a Serverless version instance. During the public beta of the Serverless version (from 0101, 2022 to 0131, 2022), a maximum of 12 compute nodes can be created.
     * 
     */
    public Output<Integer> segNodeNum() {
        return this.segNodeNum;
    }
    /**
     * The seg storage type. Valid values: `cloud_essd`, `cloud_efficiency`.
     * &gt; **NOTE:** This parameter must be passed in to create a storage elastic mode instance. Storage Elastic Mode Basic Edition instances only support ESSD cloud disks.
     * 
     */
    @Export(name="segStorageType", type=String.class, parameters={})
    private Output</* @Nullable */ String> segStorageType;

    /**
     * @return The seg storage type. Valid values: `cloud_essd`, `cloud_efficiency`.
     * &gt; **NOTE:** This parameter must be passed in to create a storage elastic mode instance. Storage Elastic Mode Basic Edition instances only support ESSD cloud disks.
     * 
     */
    public Output<Optional<String>> segStorageType() {
        return Codegen.optional(this.segStorageType);
    }
    /**
     * Enable or disable SSL. Valid values: `0` and `1`.
     * 
     */
    @Export(name="sslEnabled", type=Integer.class, parameters={})
    private Output<Integer> sslEnabled;

    /**
     * @return Enable or disable SSL. Valid values: `0` and `1`.
     * 
     */
    public Output<Integer> sslEnabled() {
        return this.sslEnabled;
    }
    /**
     * The status of the instance.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the instance.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The storage capacity. Unit: GB. Value: `50` to `4000`.
     * &gt; **NOTE:** This parameter must be passed in to create a storage reservation mode instance.
     * 
     */
    @Export(name="storageSize", type=Integer.class, parameters={})
    private Output<Integer> storageSize;

    /**
     * @return The storage capacity. Unit: GB. Value: `50` to `4000`.
     * &gt; **NOTE:** This parameter must be passed in to create a storage reservation mode instance.
     * 
     */
    public Output<Integer> storageSize() {
        return this.storageSize;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The used time. When the parameter `period` is `Year`, the `used_time` value is 1 to 3. When the parameter `period` is `Month`, the `used_time` value is 1 to 9.
     * 
     */
    @Export(name="usedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> usedTime;

    /**
     * @return The used time. When the parameter `period` is `Year`, the `used_time` value is 1 to 3. When the parameter `period` is `Month`, the `used_time` value is 1 to 9.
     * 
     */
    public Output<Optional<String>> usedTime() {
        return Codegen.optional(this.usedTime);
    }
    /**
     * The vpc ID of the resource.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The vpc ID of the resource.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The vswitch id.
     * 
     */
    @Export(name="vswitchId", type=String.class, parameters={})
    private Output<String> vswitchId;

    /**
     * @return The vswitch id.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }
    /**
     * The zone ID of the instance.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The zone ID of the instance.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:gpdb/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:gpdb/instance:Instance", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
