// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CR
{
    /// <summary>
    /// Provides a CR Vpc Endpoint Linked Vpc resource.
    /// 
    /// For information about CR Vpc Endpoint Linked Vpc and how to use it, see [What is Vpc Endpoint Linked Vpc](https://www.alibabacloud.com/help/en/acr/developer-reference/api-cr-2018-12-01-createinstancevpcendpointlinkedvpc).
    /// 
    /// &gt; **NOTE:** Available since v1.199.0.
    /// 
    /// ## Import
    /// 
    /// CR Vpc Endpoint Linked Vpc can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cr/vpcEndpointLinkedVpc:VpcEndpointLinkedVpc example &lt;instance_id&gt;:&lt;vpc_id&gt;:&lt;vswitch_id&gt;:&lt;module_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cr/vpcEndpointLinkedVpc:VpcEndpointLinkedVpc")]
    public partial class VpcEndpointLinkedVpc : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies whether to automatically create an Alibaba Cloud DNS PrivateZone record. Valid Values:
        /// </summary>
        [Output("enableCreateDnsRecordInPvzt")]
        public Output<bool?> EnableCreateDnsRecordInPvzt { get; private set; } = null!;

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The name of the module that you want to access. Valid Values:
        /// </summary>
        [Output("moduleName")]
        public Output<string> ModuleName { get; private set; } = null!;

        /// <summary>
        /// The status of the Vpc Endpoint Linked Vpc.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;

        /// <summary>
        /// The ID of the vSwitch.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a VpcEndpointLinkedVpc resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcEndpointLinkedVpc(string name, VpcEndpointLinkedVpcArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cr/vpcEndpointLinkedVpc:VpcEndpointLinkedVpc", name, args ?? new VpcEndpointLinkedVpcArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcEndpointLinkedVpc(string name, Input<string> id, VpcEndpointLinkedVpcState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cr/vpcEndpointLinkedVpc:VpcEndpointLinkedVpc", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcEndpointLinkedVpc resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcEndpointLinkedVpc Get(string name, Input<string> id, VpcEndpointLinkedVpcState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcEndpointLinkedVpc(name, id, state, options);
        }
    }

    public sealed class VpcEndpointLinkedVpcArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to automatically create an Alibaba Cloud DNS PrivateZone record. Valid Values:
        /// </summary>
        [Input("enableCreateDnsRecordInPvzt")]
        public Input<bool>? EnableCreateDnsRecordInPvzt { get; set; }

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// The name of the module that you want to access. Valid Values:
        /// </summary>
        [Input("moduleName", required: true)]
        public Input<string> ModuleName { get; set; } = null!;

        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        /// <summary>
        /// The ID of the vSwitch.
        /// </summary>
        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        public VpcEndpointLinkedVpcArgs()
        {
        }
        public static new VpcEndpointLinkedVpcArgs Empty => new VpcEndpointLinkedVpcArgs();
    }

    public sealed class VpcEndpointLinkedVpcState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to automatically create an Alibaba Cloud DNS PrivateZone record. Valid Values:
        /// </summary>
        [Input("enableCreateDnsRecordInPvzt")]
        public Input<bool>? EnableCreateDnsRecordInPvzt { get; set; }

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The name of the module that you want to access. Valid Values:
        /// </summary>
        [Input("moduleName")]
        public Input<string>? ModuleName { get; set; }

        /// <summary>
        /// The status of the Vpc Endpoint Linked Vpc.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The ID of the vSwitch.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public VpcEndpointLinkedVpcState()
        {
        }
        public static new VpcEndpointLinkedVpcState Empty => new VpcEndpointLinkedVpcState();
    }
}
