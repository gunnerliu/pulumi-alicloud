// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emr.Inputs
{

    public sealed class ClusterHostGroupArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Auto renew for prepaid, true of false. Default is false.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// Charge Type for this group of hosts: PostPaid or PrePaid. If this is not specified, charge type will follow global charge_type value.
        /// </summary>
        [Input("chargeType")]
        public Input<string>? ChargeType { get; set; }

        /// <summary>
        /// Data disk capacity.
        /// </summary>
        [Input("diskCapacity")]
        public Input<string>? DiskCapacity { get; set; }

        /// <summary>
        /// Data disk count.
        /// </summary>
        [Input("diskCount")]
        public Input<string>? DiskCount { get; set; }

        /// <summary>
        /// Data disk type. Supported value: cloud,cloud_efficiency,cloud_ssd,local_disk,cloud_essd.
        /// </summary>
        [Input("diskType")]
        public Input<string>? DiskType { get; set; }

        [Input("gpuDriver")]
        public Input<string>? GpuDriver { get; set; }

        /// <summary>
        /// host group name.
        /// </summary>
        [Input("hostGroupName")]
        public Input<string>? HostGroupName { get; set; }

        /// <summary>
        /// host group type, supported value: MASTER, CORE or TASK, supported 'GATEWAY' available in 1.61.0+.
        /// </summary>
        [Input("hostGroupType")]
        public Input<string>? HostGroupType { get; set; }

        /// <summary>
        /// Instance list for cluster scale down. This value follows the json format, e.g. ["instance_id1","instance_id2"]. escape character for " is \".
        /// </summary>
        [Input("instanceList")]
        public Input<string>? InstanceList { get; set; }

        /// <summary>
        /// Host Ecs instance type.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// Host number in this group.
        /// </summary>
        [Input("nodeCount")]
        public Input<string>? NodeCount { get; set; }

        /// <summary>
        /// If charge type is PrePaid, this should be specified, unit is month. Supported value: 1、2、3、4、5、6、7、8、9、12、24、36.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// System disk capacity.
        /// </summary>
        [Input("sysDiskCapacity")]
        public Input<string>? SysDiskCapacity { get; set; }

        /// <summary>
        /// System disk type. Supported value: cloud,cloud_efficiency,cloud_ssd,cloud_essd.
        /// </summary>
        [Input("sysDiskType")]
        public Input<string>? SysDiskType { get; set; }

        public ClusterHostGroupArgs()
        {
        }
    }
}
