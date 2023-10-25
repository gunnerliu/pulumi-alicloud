// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ExpressConnect
{
    /// <summary>
    /// Provides a Express Connect Grant Rule To Cen resource.
    /// 
    /// For information about Express Connect Grant Rule To Cen and how to use it, see [What is Grant Rule To Cen](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/grantinstancetocen).
    /// 
    /// &gt; **NOTE:** Available since v1.196.0.
    /// 
    /// ## Import
    /// 
    /// Express Connect Grant Rule To Cen can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:expressconnect/grantRuleToCen:GrantRuleToCen example &lt;cen_id&gt;:&lt;cen_owner_id&gt;:&lt;instance_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:expressconnect/grantRuleToCen:GrantRuleToCen")]
    public partial class GrantRuleToCen : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the CEN instance to which you want to grant permissions.
        /// </summary>
        [Output("cenId")]
        public Output<string> CenId { get; private set; } = null!;

        /// <summary>
        /// The user ID (UID) of the Alibaba Cloud account to which the CEN instance belongs.
        /// </summary>
        [Output("cenOwnerId")]
        public Output<int> CenOwnerId { get; private set; } = null!;

        /// <summary>
        /// The ID of the VBR.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;


        /// <summary>
        /// Create a GrantRuleToCen resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GrantRuleToCen(string name, GrantRuleToCenArgs args, CustomResourceOptions? options = null)
            : base("alicloud:expressconnect/grantRuleToCen:GrantRuleToCen", name, args ?? new GrantRuleToCenArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GrantRuleToCen(string name, Input<string> id, GrantRuleToCenState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:expressconnect/grantRuleToCen:GrantRuleToCen", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GrantRuleToCen resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GrantRuleToCen Get(string name, Input<string> id, GrantRuleToCenState? state = null, CustomResourceOptions? options = null)
        {
            return new GrantRuleToCen(name, id, state, options);
        }
    }

    public sealed class GrantRuleToCenArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the CEN instance to which you want to grant permissions.
        /// </summary>
        [Input("cenId", required: true)]
        public Input<string> CenId { get; set; } = null!;

        /// <summary>
        /// The user ID (UID) of the Alibaba Cloud account to which the CEN instance belongs.
        /// </summary>
        [Input("cenOwnerId", required: true)]
        public Input<int> CenOwnerId { get; set; } = null!;

        /// <summary>
        /// The ID of the VBR.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        public GrantRuleToCenArgs()
        {
        }
        public static new GrantRuleToCenArgs Empty => new GrantRuleToCenArgs();
    }

    public sealed class GrantRuleToCenState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the CEN instance to which you want to grant permissions.
        /// </summary>
        [Input("cenId")]
        public Input<string>? CenId { get; set; }

        /// <summary>
        /// The user ID (UID) of the Alibaba Cloud account to which the CEN instance belongs.
        /// </summary>
        [Input("cenOwnerId")]
        public Input<int>? CenOwnerId { get; set; }

        /// <summary>
        /// The ID of the VBR.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        public GrantRuleToCenState()
        {
        }
        public static new GrantRuleToCenState Empty => new GrantRuleToCenState();
    }
}
