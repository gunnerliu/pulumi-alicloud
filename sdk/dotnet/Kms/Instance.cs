// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Kms
{
    /// <summary>
    /// Provides a KMS Instance resource.
    /// 
    /// For information about KMS Instance and how to use it, see [What is Instance](https://www.alibabacloud.com/help/zh/key-management-service/latest/kms-instance-management).
    /// 
    /// &gt; **NOTE:** Available since v1.210.0.
    /// 
    /// ## Import
    /// 
    /// KMS Instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:kms/instance:Instance example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:kms/instance:Instance")]
    public partial class Instance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Aucillary VPCs used to access this KMS instance. See `bind_vpcs` below.
        /// </summary>
        [Output("bindVpcs")]
        public Output<ImmutableArray<Outputs.InstanceBindVpc>> BindVpcs { get; private set; } = null!;

        /// <summary>
        /// KMS instance certificate chain in PEM format.
        /// </summary>
        [Output("caCertificateChainPem")]
        public Output<string> CaCertificateChainPem { get; private set; } = null!;

        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// Maximum number of stored keys.
        /// </summary>
        [Output("keyNum")]
        public Output<int> KeyNum { get; private set; } = null!;

        /// <summary>
        /// Instance Audit Log Switch.
        /// </summary>
        [Output("log")]
        public Output<string> Log { get; private set; } = null!;

        /// <summary>
        /// Instance log capacity.
        /// </summary>
        [Output("logStorage")]
        public Output<int> LogStorage { get; private set; } = null!;

        /// <summary>
        /// Purchase cycle, in months.
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// KMS Instance commodity type (software/hardware).
        /// </summary>
        [Output("productVersion")]
        public Output<string?> ProductVersion { get; private set; } = null!;

        /// <summary>
        /// Automatic renewal period, in months.
        /// </summary>
        [Output("renewPeriod")]
        public Output<int?> RenewPeriod { get; private set; } = null!;

        /// <summary>
        /// Renewal options (manual renewal, automatic renewal, no renewal).
        /// </summary>
        [Output("renewStatus")]
        public Output<string?> RenewStatus { get; private set; } = null!;

        /// <summary>
        /// Maximum number of Secrets.
        /// </summary>
        [Output("secretNum")]
        public Output<int> SecretNum { get; private set; } = null!;

        /// <summary>
        /// The computation performance level of the KMS instance.
        /// </summary>
        [Output("spec")]
        public Output<int> Spec { get; private set; } = null!;

        /// <summary>
        /// Instance status.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Instance VPC id.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;

        /// <summary>
        /// The number of managed accesses. The maximum number of VPCs that can access this KMS instance.
        /// </summary>
        [Output("vpcNum")]
        public Output<int> VpcNum { get; private set; } = null!;

        /// <summary>
        /// Instance bind vswitches.
        /// </summary>
        [Output("vswitchIds")]
        public Output<ImmutableArray<string>> VswitchIds { get; private set; } = null!;

        /// <summary>
        /// zone id.
        /// </summary>
        [Output("zoneIds")]
        public Output<ImmutableArray<string>> ZoneIds { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:kms/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:kms/instance:Instance", name, state, MakeResourceOptions(options, id))
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

    public sealed class InstanceArgs : global::Pulumi.ResourceArgs
    {
        [Input("bindVpcs")]
        private InputList<Inputs.InstanceBindVpcArgs>? _bindVpcs;

        /// <summary>
        /// Aucillary VPCs used to access this KMS instance. See `bind_vpcs` below.
        /// </summary>
        public InputList<Inputs.InstanceBindVpcArgs> BindVpcs
        {
            get => _bindVpcs ?? (_bindVpcs = new InputList<Inputs.InstanceBindVpcArgs>());
            set => _bindVpcs = value;
        }

        /// <summary>
        /// Maximum number of stored keys.
        /// </summary>
        [Input("keyNum", required: true)]
        public Input<int> KeyNum { get; set; } = null!;

        /// <summary>
        /// Instance Audit Log Switch.
        /// </summary>
        [Input("log")]
        public Input<string>? Log { get; set; }

        /// <summary>
        /// Instance log capacity.
        /// </summary>
        [Input("logStorage")]
        public Input<int>? LogStorage { get; set; }

        /// <summary>
        /// Purchase cycle, in months.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// KMS Instance commodity type (software/hardware).
        /// </summary>
        [Input("productVersion")]
        public Input<string>? ProductVersion { get; set; }

        /// <summary>
        /// Automatic renewal period, in months.
        /// </summary>
        [Input("renewPeriod")]
        public Input<int>? RenewPeriod { get; set; }

        /// <summary>
        /// Renewal options (manual renewal, automatic renewal, no renewal).
        /// </summary>
        [Input("renewStatus")]
        public Input<string>? RenewStatus { get; set; }

        /// <summary>
        /// Maximum number of Secrets.
        /// </summary>
        [Input("secretNum", required: true)]
        public Input<int> SecretNum { get; set; } = null!;

        /// <summary>
        /// The computation performance level of the KMS instance.
        /// </summary>
        [Input("spec", required: true)]
        public Input<int> Spec { get; set; } = null!;

        /// <summary>
        /// Instance VPC id.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        /// <summary>
        /// The number of managed accesses. The maximum number of VPCs that can access this KMS instance.
        /// </summary>
        [Input("vpcNum", required: true)]
        public Input<int> VpcNum { get; set; } = null!;

        [Input("vswitchIds", required: true)]
        private InputList<string>? _vswitchIds;

        /// <summary>
        /// Instance bind vswitches.
        /// </summary>
        public InputList<string> VswitchIds
        {
            get => _vswitchIds ?? (_vswitchIds = new InputList<string>());
            set => _vswitchIds = value;
        }

        [Input("zoneIds", required: true)]
        private InputList<string>? _zoneIds;

        /// <summary>
        /// zone id.
        /// </summary>
        public InputList<string> ZoneIds
        {
            get => _zoneIds ?? (_zoneIds = new InputList<string>());
            set => _zoneIds = value;
        }

        public InstanceArgs()
        {
        }
        public static new InstanceArgs Empty => new InstanceArgs();
    }

    public sealed class InstanceState : global::Pulumi.ResourceArgs
    {
        [Input("bindVpcs")]
        private InputList<Inputs.InstanceBindVpcGetArgs>? _bindVpcs;

        /// <summary>
        /// Aucillary VPCs used to access this KMS instance. See `bind_vpcs` below.
        /// </summary>
        public InputList<Inputs.InstanceBindVpcGetArgs> BindVpcs
        {
            get => _bindVpcs ?? (_bindVpcs = new InputList<Inputs.InstanceBindVpcGetArgs>());
            set => _bindVpcs = value;
        }

        /// <summary>
        /// KMS instance certificate chain in PEM format.
        /// </summary>
        [Input("caCertificateChainPem")]
        public Input<string>? CaCertificateChainPem { get; set; }

        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// Maximum number of stored keys.
        /// </summary>
        [Input("keyNum")]
        public Input<int>? KeyNum { get; set; }

        /// <summary>
        /// Instance Audit Log Switch.
        /// </summary>
        [Input("log")]
        public Input<string>? Log { get; set; }

        /// <summary>
        /// Instance log capacity.
        /// </summary>
        [Input("logStorage")]
        public Input<int>? LogStorage { get; set; }

        /// <summary>
        /// Purchase cycle, in months.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// KMS Instance commodity type (software/hardware).
        /// </summary>
        [Input("productVersion")]
        public Input<string>? ProductVersion { get; set; }

        /// <summary>
        /// Automatic renewal period, in months.
        /// </summary>
        [Input("renewPeriod")]
        public Input<int>? RenewPeriod { get; set; }

        /// <summary>
        /// Renewal options (manual renewal, automatic renewal, no renewal).
        /// </summary>
        [Input("renewStatus")]
        public Input<string>? RenewStatus { get; set; }

        /// <summary>
        /// Maximum number of Secrets.
        /// </summary>
        [Input("secretNum")]
        public Input<int>? SecretNum { get; set; }

        /// <summary>
        /// The computation performance level of the KMS instance.
        /// </summary>
        [Input("spec")]
        public Input<int>? Spec { get; set; }

        /// <summary>
        /// Instance status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Instance VPC id.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The number of managed accesses. The maximum number of VPCs that can access this KMS instance.
        /// </summary>
        [Input("vpcNum")]
        public Input<int>? VpcNum { get; set; }

        [Input("vswitchIds")]
        private InputList<string>? _vswitchIds;

        /// <summary>
        /// Instance bind vswitches.
        /// </summary>
        public InputList<string> VswitchIds
        {
            get => _vswitchIds ?? (_vswitchIds = new InputList<string>());
            set => _vswitchIds = value;
        }

        [Input("zoneIds")]
        private InputList<string>? _zoneIds;

        /// <summary>
        /// zone id.
        /// </summary>
        public InputList<string> ZoneIds
        {
            get => _zoneIds ?? (_zoneIds = new InputList<string>());
            set => _zoneIds = value;
        }

        public InstanceState()
        {
        }
        public static new InstanceState Empty => new InstanceState();
    }
}
