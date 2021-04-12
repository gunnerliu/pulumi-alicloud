// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS
{
    /// <summary>
    /// ## Import
    /// 
    /// Cluster nodepool can be imported using the id, e.g. Then complete the nodepool.tf accords to the result of `terraform plan`.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cs/nodePool:NodePool alicloud_cs_node_pool.custom_nodepool cluster_id:nodepool_id
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cs/nodePool:NodePool")]
    public partial class NodePool : Pulumi.CustomResource
    {
        /// <summary>
        /// Enable Node payment auto-renew, default is `false`.
        /// </summary>
        [Output("autoRenew")]
        public Output<bool?> AutoRenew { get; private set; } = null!;

        /// <summary>
        /// Node payment auto-renew period, one of `1`, `2`, `3`,`6`, `12`.
        /// </summary>
        [Output("autoRenewPeriod")]
        public Output<int?> AutoRenewPeriod { get; private set; } = null!;

        /// <summary>
        /// The id of kubernetes cluster.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The data disk configurations of worker nodes, such as the disk type and disk size.
        /// </summary>
        [Output("dataDisks")]
        public Output<ImmutableArray<Outputs.NodePoolDataDisk>> DataDisks { get; private set; } = null!;

        /// <summary>
        /// Custom Image support. Must based on CentOS7 or AliyunLinux2.
        /// </summary>
        [Output("imageId")]
        public Output<string> ImageId { get; private set; } = null!;

        /// <summary>
        /// Install the cloud monitoring plug-in on the node, and you can view the monitoring information of the instance through the cloud monitoring console. Default is `true`.
        /// </summary>
        [Output("installCloudMonitor")]
        public Output<bool?> InstallCloudMonitor { get; private set; } = null!;

        /// <summary>
        /// Node payment type. Valid values: `PostPaid`, `PrePaid`, default is `PostPaid`. If value is `PrePaid`, the arguments `period`, `period_unit`, `auto_renew` and `auto_renew_period` are required.
        /// </summary>
        [Output("instanceChargeType")]
        public Output<string?> InstanceChargeType { get; private set; } = null!;

        /// <summary>
        /// The instance type of worker node.
        /// </summary>
        [Output("instanceTypes")]
        public Output<ImmutableArray<string>> InstanceTypes { get; private set; } = null!;

        /// <summary>
        /// The keypair of ssh login cluster node, you have to create it first. You have to specify one of `password` `key_name` `kms_encrypted_password` fields. Only `key_name` is supported in the management node pool.
        /// </summary>
        [Output("keyName")]
        public Output<string?> KeyName { get; private set; } = null!;

        /// <summary>
        /// An KMS encrypts password used to a cs kubernetes. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
        /// </summary>
        [Output("kmsEncryptedPassword")]
        public Output<string?> KmsEncryptedPassword { get; private set; } = null!;

        /// <summary>
        /// A List of Kubernetes labels to assign to the nodes . Only labels that are applied with the ACK API are managed by this argument.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableArray<Outputs.NodePoolLabel>> Labels { get; private set; } = null!;

        /// <summary>
        /// Managed node pool configuration. When using a managed node pool, the node key must use `key_name`. Detailed below.
        /// </summary>
        [Output("management")]
        public Output<Outputs.NodePoolManagement?> Management { get; private set; } = null!;

        /// <summary>
        /// The name of node pool.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The worker node number of the node pool. From version 1.111.0, `node_count` is not required.
        /// </summary>
        [Output("nodeCount")]
        public Output<int> NodeCount { get; private set; } = null!;

        /// <summary>
        /// Each node name consists of a prefix, an IP substring, and a suffix. For example "customized,aliyun.com,5,test", if the node IP address is 192.168.0.55, the prefix is aliyun.com, IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.
        /// </summary>
        [Output("nodeNameMode")]
        public Output<string> NodeNameMode { get; private set; } = null!;

        /// <summary>
        /// The password of ssh login cluster node. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// Node payment period. Its valid value is one of {1, 2, 3, 6, 12, 24, 36, 48, 60}.
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// Node payment period unit, valid value: `Month`. Default is `Month`.
        /// </summary>
        [Output("periodUnit")]
        public Output<string?> PeriodUnit { get; private set; } = null!;

        /// <summary>
        /// Auto scaling node pool configuration. For more details, see `scaling_config`.
        /// </summary>
        [Output("scalingConfig")]
        public Output<Outputs.NodePoolScalingConfig> ScalingConfig { get; private set; } = null!;

        /// <summary>
        /// (Available in 1.105.0+) Id of the Scaling Group.
        /// </summary>
        [Output("scalingGroupId")]
        public Output<string> ScalingGroupId { get; private set; } = null!;

        /// <summary>
        /// The system disk size of worker node.
        /// </summary>
        [Output("securityGroupId")]
        public Output<string> SecurityGroupId { get; private set; } = null!;

        /// <summary>
        /// The system disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
        /// </summary>
        [Output("systemDiskCategory")]
        public Output<string?> SystemDiskCategory { get; private set; } = null!;

        [Output("systemDiskPerformanceLevel")]
        public Output<string?> SystemDiskPerformanceLevel { get; private set; } = null!;

        /// <summary>
        /// The system disk category of worker node. Its valid value range [40~500] in GB. Default to `120`.
        /// </summary>
        [Output("systemDiskSize")]
        public Output<int?> SystemDiskSize { get; private set; } = null!;

        /// <summary>
        /// A Map of tags to assign to the resource. It will be applied for ECS instances finally.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A List of Kubernetes taints to assign to the nodes.
        /// </summary>
        [Output("taints")]
        public Output<ImmutableArray<Outputs.NodePoolTaint>> Taints { get; private set; } = null!;

        /// <summary>
        /// Set the newly added node as unschedulable. If you want to open the scheduling option, you can open it in the node list of the console. If you are using an auto-scaling node pool, the setting will not take effect. Default is `false`.
        /// </summary>
        [Output("unschedulable")]
        public Output<bool?> Unschedulable { get; private set; } = null!;

        /// <summary>
        /// Windows instances support batch and PowerShell scripts. If your script file is larger than 1 KB, we recommend that you upload the script to Object Storage Service (OSS) and pull it through the internal endpoint of your OSS bucket.
        /// </summary>
        [Output("userData")]
        public Output<string?> UserData { get; private set; } = null!;

        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;

        /// <summary>
        /// The vswitches used by node pool workers.
        /// </summary>
        [Output("vswitchIds")]
        public Output<ImmutableArray<string>> VswitchIds { get; private set; } = null!;


        /// <summary>
        /// Create a NodePool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NodePool(string name, NodePoolArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cs/nodePool:NodePool", name, args ?? new NodePoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NodePool(string name, Input<string> id, NodePoolState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cs/nodePool:NodePool", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NodePool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NodePool Get(string name, Input<string> id, NodePoolState? state = null, CustomResourceOptions? options = null)
        {
            return new NodePool(name, id, state, options);
        }
    }

    public sealed class NodePoolArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable Node payment auto-renew, default is `false`.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// Node payment auto-renew period, one of `1`, `2`, `3`,`6`, `12`.
        /// </summary>
        [Input("autoRenewPeriod")]
        public Input<int>? AutoRenewPeriod { get; set; }

        /// <summary>
        /// The id of kubernetes cluster.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("dataDisks")]
        private InputList<Inputs.NodePoolDataDiskArgs>? _dataDisks;

        /// <summary>
        /// The data disk configurations of worker nodes, such as the disk type and disk size.
        /// </summary>
        public InputList<Inputs.NodePoolDataDiskArgs> DataDisks
        {
            get => _dataDisks ?? (_dataDisks = new InputList<Inputs.NodePoolDataDiskArgs>());
            set => _dataDisks = value;
        }

        /// <summary>
        /// Custom Image support. Must based on CentOS7 or AliyunLinux2.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        /// <summary>
        /// Install the cloud monitoring plug-in on the node, and you can view the monitoring information of the instance through the cloud monitoring console. Default is `true`.
        /// </summary>
        [Input("installCloudMonitor")]
        public Input<bool>? InstallCloudMonitor { get; set; }

        /// <summary>
        /// Node payment type. Valid values: `PostPaid`, `PrePaid`, default is `PostPaid`. If value is `PrePaid`, the arguments `period`, `period_unit`, `auto_renew` and `auto_renew_period` are required.
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        [Input("instanceTypes", required: true)]
        private InputList<string>? _instanceTypes;

        /// <summary>
        /// The instance type of worker node.
        /// </summary>
        public InputList<string> InstanceTypes
        {
            get => _instanceTypes ?? (_instanceTypes = new InputList<string>());
            set => _instanceTypes = value;
        }

        /// <summary>
        /// The keypair of ssh login cluster node, you have to create it first. You have to specify one of `password` `key_name` `kms_encrypted_password` fields. Only `key_name` is supported in the management node pool.
        /// </summary>
        [Input("keyName")]
        public Input<string>? KeyName { get; set; }

        /// <summary>
        /// An KMS encrypts password used to a cs kubernetes. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
        /// </summary>
        [Input("kmsEncryptedPassword")]
        public Input<string>? KmsEncryptedPassword { get; set; }

        [Input("labels")]
        private InputList<Inputs.NodePoolLabelArgs>? _labels;

        /// <summary>
        /// A List of Kubernetes labels to assign to the nodes . Only labels that are applied with the ACK API are managed by this argument.
        /// </summary>
        public InputList<Inputs.NodePoolLabelArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.NodePoolLabelArgs>());
            set => _labels = value;
        }

        /// <summary>
        /// Managed node pool configuration. When using a managed node pool, the node key must use `key_name`. Detailed below.
        /// </summary>
        [Input("management")]
        public Input<Inputs.NodePoolManagementArgs>? Management { get; set; }

        /// <summary>
        /// The name of node pool.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The worker node number of the node pool. From version 1.111.0, `node_count` is not required.
        /// </summary>
        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        /// <summary>
        /// Each node name consists of a prefix, an IP substring, and a suffix. For example "customized,aliyun.com,5,test", if the node IP address is 192.168.0.55, the prefix is aliyun.com, IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.
        /// </summary>
        [Input("nodeNameMode")]
        public Input<string>? NodeNameMode { get; set; }

        /// <summary>
        /// The password of ssh login cluster node. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Node payment period. Its valid value is one of {1, 2, 3, 6, 12, 24, 36, 48, 60}.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Node payment period unit, valid value: `Month`. Default is `Month`.
        /// </summary>
        [Input("periodUnit")]
        public Input<string>? PeriodUnit { get; set; }

        /// <summary>
        /// Auto scaling node pool configuration. For more details, see `scaling_config`.
        /// </summary>
        [Input("scalingConfig")]
        public Input<Inputs.NodePoolScalingConfigArgs>? ScalingConfig { get; set; }

        /// <summary>
        /// The system disk size of worker node.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// The system disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
        /// </summary>
        [Input("systemDiskCategory")]
        public Input<string>? SystemDiskCategory { get; set; }

        [Input("systemDiskPerformanceLevel")]
        public Input<string>? SystemDiskPerformanceLevel { get; set; }

        /// <summary>
        /// The system disk category of worker node. Its valid value range [40~500] in GB. Default to `120`.
        /// </summary>
        [Input("systemDiskSize")]
        public Input<int>? SystemDiskSize { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A Map of tags to assign to the resource. It will be applied for ECS instances finally.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        [Input("taints")]
        private InputList<Inputs.NodePoolTaintArgs>? _taints;

        /// <summary>
        /// A List of Kubernetes taints to assign to the nodes.
        /// </summary>
        public InputList<Inputs.NodePoolTaintArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.NodePoolTaintArgs>());
            set => _taints = value;
        }

        /// <summary>
        /// Set the newly added node as unschedulable. If you want to open the scheduling option, you can open it in the node list of the console. If you are using an auto-scaling node pool, the setting will not take effect. Default is `false`.
        /// </summary>
        [Input("unschedulable")]
        public Input<bool>? Unschedulable { get; set; }

        /// <summary>
        /// Windows instances support batch and PowerShell scripts. If your script file is larger than 1 KB, we recommend that you upload the script to Object Storage Service (OSS) and pull it through the internal endpoint of your OSS bucket.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        [Input("vswitchIds", required: true)]
        private InputList<string>? _vswitchIds;

        /// <summary>
        /// The vswitches used by node pool workers.
        /// </summary>
        public InputList<string> VswitchIds
        {
            get => _vswitchIds ?? (_vswitchIds = new InputList<string>());
            set => _vswitchIds = value;
        }

        public NodePoolArgs()
        {
        }
    }

    public sealed class NodePoolState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable Node payment auto-renew, default is `false`.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// Node payment auto-renew period, one of `1`, `2`, `3`,`6`, `12`.
        /// </summary>
        [Input("autoRenewPeriod")]
        public Input<int>? AutoRenewPeriod { get; set; }

        /// <summary>
        /// The id of kubernetes cluster.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("dataDisks")]
        private InputList<Inputs.NodePoolDataDiskGetArgs>? _dataDisks;

        /// <summary>
        /// The data disk configurations of worker nodes, such as the disk type and disk size.
        /// </summary>
        public InputList<Inputs.NodePoolDataDiskGetArgs> DataDisks
        {
            get => _dataDisks ?? (_dataDisks = new InputList<Inputs.NodePoolDataDiskGetArgs>());
            set => _dataDisks = value;
        }

        /// <summary>
        /// Custom Image support. Must based on CentOS7 or AliyunLinux2.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        /// <summary>
        /// Install the cloud monitoring plug-in on the node, and you can view the monitoring information of the instance through the cloud monitoring console. Default is `true`.
        /// </summary>
        [Input("installCloudMonitor")]
        public Input<bool>? InstallCloudMonitor { get; set; }

        /// <summary>
        /// Node payment type. Valid values: `PostPaid`, `PrePaid`, default is `PostPaid`. If value is `PrePaid`, the arguments `period`, `period_unit`, `auto_renew` and `auto_renew_period` are required.
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        [Input("instanceTypes")]
        private InputList<string>? _instanceTypes;

        /// <summary>
        /// The instance type of worker node.
        /// </summary>
        public InputList<string> InstanceTypes
        {
            get => _instanceTypes ?? (_instanceTypes = new InputList<string>());
            set => _instanceTypes = value;
        }

        /// <summary>
        /// The keypair of ssh login cluster node, you have to create it first. You have to specify one of `password` `key_name` `kms_encrypted_password` fields. Only `key_name` is supported in the management node pool.
        /// </summary>
        [Input("keyName")]
        public Input<string>? KeyName { get; set; }

        /// <summary>
        /// An KMS encrypts password used to a cs kubernetes. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
        /// </summary>
        [Input("kmsEncryptedPassword")]
        public Input<string>? KmsEncryptedPassword { get; set; }

        [Input("labels")]
        private InputList<Inputs.NodePoolLabelGetArgs>? _labels;

        /// <summary>
        /// A List of Kubernetes labels to assign to the nodes . Only labels that are applied with the ACK API are managed by this argument.
        /// </summary>
        public InputList<Inputs.NodePoolLabelGetArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.NodePoolLabelGetArgs>());
            set => _labels = value;
        }

        /// <summary>
        /// Managed node pool configuration. When using a managed node pool, the node key must use `key_name`. Detailed below.
        /// </summary>
        [Input("management")]
        public Input<Inputs.NodePoolManagementGetArgs>? Management { get; set; }

        /// <summary>
        /// The name of node pool.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The worker node number of the node pool. From version 1.111.0, `node_count` is not required.
        /// </summary>
        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        /// <summary>
        /// Each node name consists of a prefix, an IP substring, and a suffix. For example "customized,aliyun.com,5,test", if the node IP address is 192.168.0.55, the prefix is aliyun.com, IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.
        /// </summary>
        [Input("nodeNameMode")]
        public Input<string>? NodeNameMode { get; set; }

        /// <summary>
        /// The password of ssh login cluster node. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Node payment period. Its valid value is one of {1, 2, 3, 6, 12, 24, 36, 48, 60}.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Node payment period unit, valid value: `Month`. Default is `Month`.
        /// </summary>
        [Input("periodUnit")]
        public Input<string>? PeriodUnit { get; set; }

        /// <summary>
        /// Auto scaling node pool configuration. For more details, see `scaling_config`.
        /// </summary>
        [Input("scalingConfig")]
        public Input<Inputs.NodePoolScalingConfigGetArgs>? ScalingConfig { get; set; }

        /// <summary>
        /// (Available in 1.105.0+) Id of the Scaling Group.
        /// </summary>
        [Input("scalingGroupId")]
        public Input<string>? ScalingGroupId { get; set; }

        /// <summary>
        /// The system disk size of worker node.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// The system disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
        /// </summary>
        [Input("systemDiskCategory")]
        public Input<string>? SystemDiskCategory { get; set; }

        [Input("systemDiskPerformanceLevel")]
        public Input<string>? SystemDiskPerformanceLevel { get; set; }

        /// <summary>
        /// The system disk category of worker node. Its valid value range [40~500] in GB. Default to `120`.
        /// </summary>
        [Input("systemDiskSize")]
        public Input<int>? SystemDiskSize { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A Map of tags to assign to the resource. It will be applied for ECS instances finally.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        [Input("taints")]
        private InputList<Inputs.NodePoolTaintGetArgs>? _taints;

        /// <summary>
        /// A List of Kubernetes taints to assign to the nodes.
        /// </summary>
        public InputList<Inputs.NodePoolTaintGetArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.NodePoolTaintGetArgs>());
            set => _taints = value;
        }

        /// <summary>
        /// Set the newly added node as unschedulable. If you want to open the scheduling option, you can open it in the node list of the console. If you are using an auto-scaling node pool, the setting will not take effect. Default is `false`.
        /// </summary>
        [Input("unschedulable")]
        public Input<bool>? Unschedulable { get; set; }

        /// <summary>
        /// Windows instances support batch and PowerShell scripts. If your script file is larger than 1 KB, we recommend that you upload the script to Object Storage Service (OSS) and pull it through the internal endpoint of your OSS bucket.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        [Input("vswitchIds")]
        private InputList<string>? _vswitchIds;

        /// <summary>
        /// The vswitches used by node pool workers.
        /// </summary>
        public InputList<string> VswitchIds
        {
            get => _vswitchIds ?? (_vswitchIds = new InputList<string>());
            set => _vswitchIds = value;
        }

        public NodePoolState()
        {
        }
    }
}
