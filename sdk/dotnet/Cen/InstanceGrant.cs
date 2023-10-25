// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    /// <summary>
    /// Provides a CEN child instance grant resource, which allow you to authorize a VPC or VBR to a CEN of a different account.
    /// 
    /// For more information about how to use it, see [Attach a network in a different account](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-attachcenchildinstance).
    /// 
    /// &gt; **NOTE:** Available since v1.37.0.
    /// 
    /// ## Import
    /// 
    /// CEN instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cen/instanceGrant:InstanceGrant example cen-abc123456:vpc-abc123456:uid123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cen/instanceGrant:InstanceGrant")]
    public partial class InstanceGrant : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the CEN.
        /// </summary>
        [Output("cenId")]
        public Output<string> CenId { get; private set; } = null!;

        /// <summary>
        /// The owner UID of the  CEN which the child instance granted to.
        /// </summary>
        [Output("cenOwnerId")]
        public Output<string> CenOwnerId { get; private set; } = null!;

        /// <summary>
        /// The ID of the child instance to grant.
        /// </summary>
        [Output("childInstanceId")]
        public Output<string> ChildInstanceId { get; private set; } = null!;


        /// <summary>
        /// Create a InstanceGrant resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstanceGrant(string name, InstanceGrantArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cen/instanceGrant:InstanceGrant", name, args ?? new InstanceGrantArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstanceGrant(string name, Input<string> id, InstanceGrantState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cen/instanceGrant:InstanceGrant", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InstanceGrant resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstanceGrant Get(string name, Input<string> id, InstanceGrantState? state = null, CustomResourceOptions? options = null)
        {
            return new InstanceGrant(name, id, state, options);
        }
    }

    public sealed class InstanceGrantArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the CEN.
        /// </summary>
        [Input("cenId", required: true)]
        public Input<string> CenId { get; set; } = null!;

        /// <summary>
        /// The owner UID of the  CEN which the child instance granted to.
        /// </summary>
        [Input("cenOwnerId", required: true)]
        public Input<string> CenOwnerId { get; set; } = null!;

        /// <summary>
        /// The ID of the child instance to grant.
        /// </summary>
        [Input("childInstanceId", required: true)]
        public Input<string> ChildInstanceId { get; set; } = null!;

        public InstanceGrantArgs()
        {
        }
        public static new InstanceGrantArgs Empty => new InstanceGrantArgs();
    }

    public sealed class InstanceGrantState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the CEN.
        /// </summary>
        [Input("cenId")]
        public Input<string>? CenId { get; set; }

        /// <summary>
        /// The owner UID of the  CEN which the child instance granted to.
        /// </summary>
        [Input("cenOwnerId")]
        public Input<string>? CenOwnerId { get; set; }

        /// <summary>
        /// The ID of the child instance to grant.
        /// </summary>
        [Input("childInstanceId")]
        public Input<string>? ChildInstanceId { get; set; }

        public InstanceGrantState()
        {
        }
        public static new InstanceGrantState Empty => new InstanceGrantState();
    }
}
