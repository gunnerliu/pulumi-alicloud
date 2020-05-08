// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbase
{
    /// <summary>
    /// Provides a HBase instance resource supports replica set instances only. the HBase provides stable, reliable, and automatic scalable database services. 
    /// It offers a full range of database solutions, such as disaster recovery, backup, recovery, monitoring, and alarms.
    /// You can see detail product introduction [here](https://help.aliyun.com/product/49055.html)
    /// 
    /// &gt; **NOTE:**  Available in 1.67.0+
    /// 
    /// &gt; **NOTE:**  The following regions don't support create Classic network HBase instance.
    /// [`cn-hangzhou`,`cn-shanghai`,`cn-qingdao`,`cn-beijing`,`cn-shenzhen`,`ap-southeast-1a`,.....]
    /// the official website mark  more regions. or you can call [DescribeRegions](https://help.aliyun.com/document_detail/144489.html)
    /// 
    /// &gt; **NOTE:**  Create HBase instance or change instance type and storage would cost 15 minutes. Please make full preparation
    /// </summary>
    public partial class Instance : Pulumi.CustomResource
    {
        /// <summary>
        /// `true`, `false`, System default to `false`, valid when pay_type = PrePaid.
        /// </summary>
        [Output("autoRenew")]
        public Output<bool> AutoRenew { get; private set; } = null!;

        /// <summary>
        /// 0 or 0+. 0 means is_cold_storage = false. 0+ means is_cold_storage = true
        /// </summary>
        [Output("coldStorageSize")]
        public Output<int> ColdStorageSize { get; private set; } = null!;

        /// <summary>
        /// User-defined HBase instance one core node's storage space.Unit: GB. Value range:
        /// - Custom storage space; value range: [400, 8000]
        /// - 40-GB increments.
        /// </summary>
        [Output("coreDiskSize")]
        public Output<int?> CoreDiskSize { get; private set; } = null!;

        /// <summary>
        /// Valid values are `cloud_ssd`, `cloud_efficiency`, `local_hdd_pro`, `local_ssd_pro`. local_disk size is fixed.
        /// </summary>
        [Output("coreDiskType")]
        public Output<string> CoreDiskType { get; private set; } = null!;

        /// <summary>
        /// default=2. if core_instance_quantity &gt; 1,this is cluster's instance.  if core_instance_quantity = 1,this is a single instance. 
        /// </summary>
        [Output("coreInstanceQuantity")]
        public Output<int?> CoreInstanceQuantity { get; private set; } = null!;

        [Output("coreInstanceType")]
        public Output<string> CoreInstanceType { get; private set; } = null!;

        /// <summary>
        /// the switch of delete protection. true: delete protect, false: no delete protect. you must set false when you want to delete cluster.
        /// </summary>
        [Output("deletionProtection")]
        public Output<bool?> DeletionProtection { get; private set; } = null!;

        /// <summary>
        /// 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60, valid when pay_type = PrePaid. unit: month.
        /// </summary>
        [Output("duration")]
        public Output<int> Duration { get; private set; } = null!;

        [Output("engine")]
        public Output<string?> Engine { get; private set; } = null!;

        /// <summary>
        /// hbase major version. hbase:1.1/2.0, hbaseue:2.0, bds:1.0, unsupport other engine temporarily. Value options can refer to the latest docs [CreateInstance](https://help.aliyun.com/document_detail/144607.html).
        /// * `master_instance_type`、`core_instance_type` - (Required, ForceNew) Instance specification. see [Instance specifications](https://help.aliyun.com/document_detail/53532.html). or you can call describeInstanceType api.
        /// </summary>
        [Output("engineVersion")]
        public Output<string> EngineVersion { get; private set; } = null!;

        /// <summary>
        /// The end time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
        /// </summary>
        [Output("maintainEndTime")]
        public Output<string> MaintainEndTime { get; private set; } = null!;

        /// <summary>
        /// The start time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
        /// </summary>
        [Output("maintainStartTime")]
        public Output<string> MaintainStartTime { get; private set; } = null!;

        [Output("masterInstanceType")]
        public Output<string> MasterInstanceType { get; private set; } = null!;

        /// <summary>
        /// HBase instance name. Length must be 2-128 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted. 
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
        /// </summary>
        [Output("payType")]
        public Output<string?> PayType { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// if vswitch_id is not empty, that mean net_type = vpc and has a same region. if vswitch_id is empty, net_type_classic
        /// </summary>
        [Output("vswitchId")]
        public Output<string?> VswitchId { get; private set; } = null!;

        /// <summary>
        /// The Zone to launch the HBase instance. if vswitch_id is not empty, this zone_id can be "" or consistent.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:hbase/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:hbase/instance:Instance", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Instance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Instance Get(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new Instance(name, id, state, options);
        }
    }

    public sealed class InstanceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// `true`, `false`, System default to `false`, valid when pay_type = PrePaid.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// 0 or 0+. 0 means is_cold_storage = false. 0+ means is_cold_storage = true
        /// </summary>
        [Input("coldStorageSize")]
        public Input<int>? ColdStorageSize { get; set; }

        /// <summary>
        /// User-defined HBase instance one core node's storage space.Unit: GB. Value range:
        /// - Custom storage space; value range: [400, 8000]
        /// - 40-GB increments.
        /// </summary>
        [Input("coreDiskSize")]
        public Input<int>? CoreDiskSize { get; set; }

        /// <summary>
        /// Valid values are `cloud_ssd`, `cloud_efficiency`, `local_hdd_pro`, `local_ssd_pro`. local_disk size is fixed.
        /// </summary>
        [Input("coreDiskType", required: true)]
        public Input<string> CoreDiskType { get; set; } = null!;

        /// <summary>
        /// default=2. if core_instance_quantity &gt; 1,this is cluster's instance.  if core_instance_quantity = 1,this is a single instance. 
        /// </summary>
        [Input("coreInstanceQuantity")]
        public Input<int>? CoreInstanceQuantity { get; set; }

        [Input("coreInstanceType", required: true)]
        public Input<string> CoreInstanceType { get; set; } = null!;

        /// <summary>
        /// the switch of delete protection. true: delete protect, false: no delete protect. you must set false when you want to delete cluster.
        /// </summary>
        [Input("deletionProtection")]
        public Input<bool>? DeletionProtection { get; set; }

        /// <summary>
        /// 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60, valid when pay_type = PrePaid. unit: month.
        /// </summary>
        [Input("duration")]
        public Input<int>? Duration { get; set; }

        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// hbase major version. hbase:1.1/2.0, hbaseue:2.0, bds:1.0, unsupport other engine temporarily. Value options can refer to the latest docs [CreateInstance](https://help.aliyun.com/document_detail/144607.html).
        /// * `master_instance_type`、`core_instance_type` - (Required, ForceNew) Instance specification. see [Instance specifications](https://help.aliyun.com/document_detail/53532.html). or you can call describeInstanceType api.
        /// </summary>
        [Input("engineVersion", required: true)]
        public Input<string> EngineVersion { get; set; } = null!;

        /// <summary>
        /// The end time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
        /// </summary>
        [Input("maintainEndTime")]
        public Input<string>? MaintainEndTime { get; set; }

        /// <summary>
        /// The start time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
        /// </summary>
        [Input("maintainStartTime")]
        public Input<string>? MaintainStartTime { get; set; }

        [Input("masterInstanceType", required: true)]
        public Input<string> MasterInstanceType { get; set; } = null!;

        /// <summary>
        /// HBase instance name. Length must be 2-128 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted. 
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
        /// </summary>
        [Input("payType")]
        public Input<string>? PayType { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// if vswitch_id is not empty, that mean net_type = vpc and has a same region. if vswitch_id is empty, net_type_classic
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The Zone to launch the HBase instance. if vswitch_id is not empty, this zone_id can be "" or consistent.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public InstanceArgs()
        {
        }
    }

    public sealed class InstanceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// `true`, `false`, System default to `false`, valid when pay_type = PrePaid.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// 0 or 0+. 0 means is_cold_storage = false. 0+ means is_cold_storage = true
        /// </summary>
        [Input("coldStorageSize")]
        public Input<int>? ColdStorageSize { get; set; }

        /// <summary>
        /// User-defined HBase instance one core node's storage space.Unit: GB. Value range:
        /// - Custom storage space; value range: [400, 8000]
        /// - 40-GB increments.
        /// </summary>
        [Input("coreDiskSize")]
        public Input<int>? CoreDiskSize { get; set; }

        /// <summary>
        /// Valid values are `cloud_ssd`, `cloud_efficiency`, `local_hdd_pro`, `local_ssd_pro`. local_disk size is fixed.
        /// </summary>
        [Input("coreDiskType")]
        public Input<string>? CoreDiskType { get; set; }

        /// <summary>
        /// default=2. if core_instance_quantity &gt; 1,this is cluster's instance.  if core_instance_quantity = 1,this is a single instance. 
        /// </summary>
        [Input("coreInstanceQuantity")]
        public Input<int>? CoreInstanceQuantity { get; set; }

        [Input("coreInstanceType")]
        public Input<string>? CoreInstanceType { get; set; }

        /// <summary>
        /// the switch of delete protection. true: delete protect, false: no delete protect. you must set false when you want to delete cluster.
        /// </summary>
        [Input("deletionProtection")]
        public Input<bool>? DeletionProtection { get; set; }

        /// <summary>
        /// 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60, valid when pay_type = PrePaid. unit: month.
        /// </summary>
        [Input("duration")]
        public Input<int>? Duration { get; set; }

        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// hbase major version. hbase:1.1/2.0, hbaseue:2.0, bds:1.0, unsupport other engine temporarily. Value options can refer to the latest docs [CreateInstance](https://help.aliyun.com/document_detail/144607.html).
        /// * `master_instance_type`、`core_instance_type` - (Required, ForceNew) Instance specification. see [Instance specifications](https://help.aliyun.com/document_detail/53532.html). or you can call describeInstanceType api.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// The end time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
        /// </summary>
        [Input("maintainEndTime")]
        public Input<string>? MaintainEndTime { get; set; }

        /// <summary>
        /// The start time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
        /// </summary>
        [Input("maintainStartTime")]
        public Input<string>? MaintainStartTime { get; set; }

        [Input("masterInstanceType")]
        public Input<string>? MasterInstanceType { get; set; }

        /// <summary>
        /// HBase instance name. Length must be 2-128 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted. 
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
        /// </summary>
        [Input("payType")]
        public Input<string>? PayType { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// if vswitch_id is not empty, that mean net_type = vpc and has a same region. if vswitch_id is empty, net_type_classic
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The Zone to launch the HBase instance. if vswitch_id is not empty, this zone_id can be "" or consistent.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public InstanceState()
        {
        }
    }
}