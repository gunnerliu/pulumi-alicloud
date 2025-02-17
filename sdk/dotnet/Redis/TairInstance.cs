// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Redis
{
    /// <summary>
    /// ## Import
    /// 
    /// Redis Tair Instance can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:redis/tairInstance:TairInstance example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:redis/tairInstance:TairInstance")]
    public partial class TairInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values: true(enables auto-renewal), false(disables auto-renewal).
        /// </summary>
        [Output("autoRenew")]
        public Output<string?> AutoRenew { get; private set; } = null!;

        /// <summary>
        /// The subscription duration that is supported by auto-renewal. Unit: months. Valid values: 1, 2, 3, 6, and 12. This parameter is required only if the AutoRenew parameter is set to true.
        /// </summary>
        [Output("autoRenewPeriod")]
        public Output<string?> AutoRenewPeriod { get; private set; } = null!;

        /// <summary>
        /// The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The time when to change the configurations. Default value: Immediately. Valid values: Immediately (The configurations are immediately changed), MaintainTime (The configurations are changed within the maintenance window).
        /// </summary>
        [Output("effectiveTime")]
        public Output<string?> EffectiveTime { get; private set; } = null!;

        /// <summary>
        /// Database version. Default value: 1.0.  Rules for transferring parameters of different tair product types:  tair_rdb:  Compatible with the Redis5.0 and Redis6.0 protocols, and is transmitted to 5.0 or 6.0. tair_scm: The Tair persistent memory is compatible with the Redis6.0 protocol and is passed 1.0. tair_essd: The disk (ESSD/SSD) is compatible with the Redis4.0 and Redis6.0 protocols, and is transmitted to 1.0 and 2.0 respectively.
        /// </summary>
        [Output("engineVersion")]
        public Output<string> EngineVersion { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to forcefully change the configurations of the instance. Default value: true. Valid values: false (The system does not forcefully change the configurations), true (The system forcefully changes the configurations).
        /// </summary>
        [Output("forceUpgrade")]
        public Output<bool?> ForceUpgrade { get; private set; } = null!;

        /// <summary>
        /// The instance type of the instance. For more information, see [Instance types](https://www.alibabacloud.com/help/en/apsaradb-for-redis/latest/instance-types).
        /// </summary>
        [Output("instanceClass")]
        public Output<string> InstanceClass { get; private set; } = null!;

        /// <summary>
        /// The storage medium of the instance. Valid values: tair_rdb, tair_scm, tair_essd.
        /// </summary>
        [Output("instanceType")]
        public Output<string> InstanceType { get; private set; } = null!;

        /// <summary>
        /// The password that is used to connect to the instance. The password must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include ! @ # $ % ^ &amp; * ( ) _ + - =.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
        /// </summary>
        [Output("paymentType")]
        public Output<string> PaymentType { get; private set; } = null!;

        /// <summary>
        /// The subscription duration. Unit: months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24,36, and 60. This parameter is required only if you set the PaymentType parameter to Subscription.
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// The Tair service port. The service port of the instance. Valid values: 1024 to 65535. Default value: 6379.
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group to which the instance belongs.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The ID of the secondary zone.This parameter is returned only if the instance is deployed in two zones.
        /// </summary>
        [Output("secondaryZoneId")]
        public Output<string?> SecondaryZoneId { get; private set; } = null!;

        /// <summary>
        /// The number of data nodes in the instance. When 1 is passed, it means that the instance created is a standard architecture with only one data node. You can create an instance in the standard architecture that contains only a single data node. 2 to 32: You can create an instance in the cluster architecture that contains the specified number of data nodes. Only persistent memory-optimized instances can use the cluster architecture. Therefore, you can set this parameter to an integer from 2 to 32 only if you set the InstanceType parameter to tair_scm. It is not allowed to modify the number of shards by modifying this parameter after creating a master-slave architecture instance with or without passing 1.
        /// </summary>
        [Output("shardCount")]
        public Output<int> ShardCount { get; private set; } = null!;

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The storage type. The value range is [PL1, PL2, and PL3]. The default value is PL1. When the value of instance_type is "tair_essd", this attribute takes effect and is required.
        /// </summary>
        [Output("storagePerformanceLevel")]
        public Output<string?> StoragePerformanceLevel { get; private set; } = null!;

        /// <summary>
        /// The value range of different specifications is different, see [ESSD-based instances](https://www.alibabacloud.com/help/en/tair/product-overview/essd-based-instances). When the value of instance_type is "tair_essd", this attribute takes effect and is required.
        /// </summary>
        [Output("storageSizeGb")]
        public Output<int> StorageSizeGb { get; private set; } = null!;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Output("tairInstanceName")]
        public Output<string?> TairInstanceName { get; private set; } = null!;

        /// <summary>
        /// The ID of the virtual private cloud (VPC).
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;

        /// <summary>
        /// The ID of the vSwitch to which the instance is connected.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;

        /// <summary>
        /// Zone ID.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a TairInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TairInstance(string name, TairInstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:redis/tairInstance:TairInstance", name, args ?? new TairInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TairInstance(string name, Input<string> id, TairInstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:redis/tairInstance:TairInstance", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing TairInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TairInstance Get(string name, Input<string> id, TairInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new TairInstance(name, id, state, options);
        }
    }

    public sealed class TairInstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values: true(enables auto-renewal), false(disables auto-renewal).
        /// </summary>
        [Input("autoRenew")]
        public Input<string>? AutoRenew { get; set; }

        /// <summary>
        /// The subscription duration that is supported by auto-renewal. Unit: months. Valid values: 1, 2, 3, 6, and 12. This parameter is required only if the AutoRenew parameter is set to true.
        /// </summary>
        [Input("autoRenewPeriod")]
        public Input<string>? AutoRenewPeriod { get; set; }

        /// <summary>
        /// The time when to change the configurations. Default value: Immediately. Valid values: Immediately (The configurations are immediately changed), MaintainTime (The configurations are changed within the maintenance window).
        /// </summary>
        [Input("effectiveTime")]
        public Input<string>? EffectiveTime { get; set; }

        /// <summary>
        /// Database version. Default value: 1.0.  Rules for transferring parameters of different tair product types:  tair_rdb:  Compatible with the Redis5.0 and Redis6.0 protocols, and is transmitted to 5.0 or 6.0. tair_scm: The Tair persistent memory is compatible with the Redis6.0 protocol and is passed 1.0. tair_essd: The disk (ESSD/SSD) is compatible with the Redis4.0 and Redis6.0 protocols, and is transmitted to 1.0 and 2.0 respectively.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// Specifies whether to forcefully change the configurations of the instance. Default value: true. Valid values: false (The system does not forcefully change the configurations), true (The system forcefully changes the configurations).
        /// </summary>
        [Input("forceUpgrade")]
        public Input<bool>? ForceUpgrade { get; set; }

        /// <summary>
        /// The instance type of the instance. For more information, see [Instance types](https://www.alibabacloud.com/help/en/apsaradb-for-redis/latest/instance-types).
        /// </summary>
        [Input("instanceClass", required: true)]
        public Input<string> InstanceClass { get; set; } = null!;

        /// <summary>
        /// The storage medium of the instance. Valid values: tair_rdb, tair_scm, tair_essd.
        /// </summary>
        [Input("instanceType", required: true)]
        public Input<string> InstanceType { get; set; } = null!;

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password that is used to connect to the instance. The password must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include ! @ # $ % ^ &amp; * ( ) _ + - =.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// The subscription duration. Unit: months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24,36, and 60. This parameter is required only if you set the PaymentType parameter to Subscription.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The Tair service port. The service port of the instance. Valid values: 1024 to 65535. Default value: 6379.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The ID of the resource group to which the instance belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The ID of the secondary zone.This parameter is returned only if the instance is deployed in two zones.
        /// </summary>
        [Input("secondaryZoneId")]
        public Input<string>? SecondaryZoneId { get; set; }

        /// <summary>
        /// The number of data nodes in the instance. When 1 is passed, it means that the instance created is a standard architecture with only one data node. You can create an instance in the standard architecture that contains only a single data node. 2 to 32: You can create an instance in the cluster architecture that contains the specified number of data nodes. Only persistent memory-optimized instances can use the cluster architecture. Therefore, you can set this parameter to an integer from 2 to 32 only if you set the InstanceType parameter to tair_scm. It is not allowed to modify the number of shards by modifying this parameter after creating a master-slave architecture instance with or without passing 1.
        /// </summary>
        [Input("shardCount")]
        public Input<int>? ShardCount { get; set; }

        /// <summary>
        /// The storage type. The value range is [PL1, PL2, and PL3]. The default value is PL1. When the value of instance_type is "tair_essd", this attribute takes effect and is required.
        /// </summary>
        [Input("storagePerformanceLevel")]
        public Input<string>? StoragePerformanceLevel { get; set; }

        /// <summary>
        /// The value range of different specifications is different, see [ESSD-based instances](https://www.alibabacloud.com/help/en/tair/product-overview/essd-based-instances). When the value of instance_type is "tair_essd", this attribute takes effect and is required.
        /// </summary>
        [Input("storageSizeGb")]
        public Input<int>? StorageSizeGb { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("tairInstanceName")]
        public Input<string>? TairInstanceName { get; set; }

        /// <summary>
        /// The ID of the virtual private cloud (VPC).
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        /// <summary>
        /// The ID of the vSwitch to which the instance is connected.
        /// </summary>
        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        /// <summary>
        /// Zone ID.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public TairInstanceArgs()
        {
        }
        public static new TairInstanceArgs Empty => new TairInstanceArgs();
    }

    public sealed class TairInstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values: true(enables auto-renewal), false(disables auto-renewal).
        /// </summary>
        [Input("autoRenew")]
        public Input<string>? AutoRenew { get; set; }

        /// <summary>
        /// The subscription duration that is supported by auto-renewal. Unit: months. Valid values: 1, 2, 3, 6, and 12. This parameter is required only if the AutoRenew parameter is set to true.
        /// </summary>
        [Input("autoRenewPeriod")]
        public Input<string>? AutoRenewPeriod { get; set; }

        /// <summary>
        /// The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The time when to change the configurations. Default value: Immediately. Valid values: Immediately (The configurations are immediately changed), MaintainTime (The configurations are changed within the maintenance window).
        /// </summary>
        [Input("effectiveTime")]
        public Input<string>? EffectiveTime { get; set; }

        /// <summary>
        /// Database version. Default value: 1.0.  Rules for transferring parameters of different tair product types:  tair_rdb:  Compatible with the Redis5.0 and Redis6.0 protocols, and is transmitted to 5.0 or 6.0. tair_scm: The Tair persistent memory is compatible with the Redis6.0 protocol and is passed 1.0. tair_essd: The disk (ESSD/SSD) is compatible with the Redis4.0 and Redis6.0 protocols, and is transmitted to 1.0 and 2.0 respectively.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// Specifies whether to forcefully change the configurations of the instance. Default value: true. Valid values: false (The system does not forcefully change the configurations), true (The system forcefully changes the configurations).
        /// </summary>
        [Input("forceUpgrade")]
        public Input<bool>? ForceUpgrade { get; set; }

        /// <summary>
        /// The instance type of the instance. For more information, see [Instance types](https://www.alibabacloud.com/help/en/apsaradb-for-redis/latest/instance-types).
        /// </summary>
        [Input("instanceClass")]
        public Input<string>? InstanceClass { get; set; }

        /// <summary>
        /// The storage medium of the instance. Valid values: tair_rdb, tair_scm, tair_essd.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password that is used to connect to the instance. The password must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include ! @ # $ % ^ &amp; * ( ) _ + - =.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// The subscription duration. Unit: months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24,36, and 60. This parameter is required only if you set the PaymentType parameter to Subscription.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The Tair service port. The service port of the instance. Valid values: 1024 to 65535. Default value: 6379.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The ID of the resource group to which the instance belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The ID of the secondary zone.This parameter is returned only if the instance is deployed in two zones.
        /// </summary>
        [Input("secondaryZoneId")]
        public Input<string>? SecondaryZoneId { get; set; }

        /// <summary>
        /// The number of data nodes in the instance. When 1 is passed, it means that the instance created is a standard architecture with only one data node. You can create an instance in the standard architecture that contains only a single data node. 2 to 32: You can create an instance in the cluster architecture that contains the specified number of data nodes. Only persistent memory-optimized instances can use the cluster architecture. Therefore, you can set this parameter to an integer from 2 to 32 only if you set the InstanceType parameter to tair_scm. It is not allowed to modify the number of shards by modifying this parameter after creating a master-slave architecture instance with or without passing 1.
        /// </summary>
        [Input("shardCount")]
        public Input<int>? ShardCount { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The storage type. The value range is [PL1, PL2, and PL3]. The default value is PL1. When the value of instance_type is "tair_essd", this attribute takes effect and is required.
        /// </summary>
        [Input("storagePerformanceLevel")]
        public Input<string>? StoragePerformanceLevel { get; set; }

        /// <summary>
        /// The value range of different specifications is different, see [ESSD-based instances](https://www.alibabacloud.com/help/en/tair/product-overview/essd-based-instances). When the value of instance_type is "tair_essd", this attribute takes effect and is required.
        /// </summary>
        [Input("storageSizeGb")]
        public Input<int>? StorageSizeGb { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("tairInstanceName")]
        public Input<string>? TairInstanceName { get; set; }

        /// <summary>
        /// The ID of the virtual private cloud (VPC).
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The ID of the vSwitch to which the instance is connected.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// Zone ID.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public TairInstanceState()
        {
        }
        public static new TairInstanceState Empty => new TairInstanceState();
    }
}
