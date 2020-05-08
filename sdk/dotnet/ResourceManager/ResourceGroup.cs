// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager
{
    /// <summary>
    /// Provides a Resource Manager Resource Group resource. If you need to group cloud resources according to business departments, projects, and other dimensions, you can create resource groups.
    /// For information about Resource Manager Resoource Group and how to use it, see [What is Resource Manager Resource Group](https://www.alibabacloud.com/help/en/doc-detail/94485.htm)
    /// 
    /// &gt; **NOTE:** Available in v1.82.0+.
    /// </summary>
    public partial class ResourceGroup : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Alibaba Cloud account to which the resource group belongs.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The time when the resource group was created.
        /// * `region_statuses` -The status of the resource group in all regions.
        /// - `region_id` - The region ID.
        /// - `status` - The status of the regional resource group.
        /// </summary>
        [Output("createDate")]
        public Output<string> CreateDate { get; private set; } = null!;

        /// <summary>
        /// The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The unique identifier of the resource group.The identifier must be 3 to 12 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The identifier must start with a letter.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("regionStatuses")]
        public Output<ImmutableArray<Outputs.ResourceGroupRegionStatus>> RegionStatuses { get; private set; } = null!;

        /// <summary>
        /// The status of the resource group.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a ResourceGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResourceGroup(string name, ResourceGroupArgs args, CustomResourceOptions? options = null)
            : base("alicloud:resourcemanager/resourceGroup:ResourceGroup", name, args ?? new ResourceGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResourceGroup(string name, Input<string> id, ResourceGroupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:resourcemanager/resourceGroup:ResourceGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResourceGroup Get(string name, Input<string> id, ResourceGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new ResourceGroup(name, id, state, options);
        }
    }

    public sealed class ResourceGroupArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The unique identifier of the resource group.The identifier must be 3 to 12 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The identifier must start with a letter.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ResourceGroupArgs()
        {
        }
    }

    public sealed class ResourceGroupState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Alibaba Cloud account to which the resource group belongs.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The time when the resource group was created.
        /// * `region_statuses` -The status of the resource group in all regions.
        /// - `region_id` - The region ID.
        /// - `status` - The status of the regional resource group.
        /// </summary>
        [Input("createDate")]
        public Input<string>? CreateDate { get; set; }

        /// <summary>
        /// The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The unique identifier of the resource group.The identifier must be 3 to 12 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The identifier must start with a letter.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("regionStatuses")]
        private InputList<Inputs.ResourceGroupRegionStatusGetArgs>? _regionStatuses;
        public InputList<Inputs.ResourceGroupRegionStatusGetArgs> RegionStatuses
        {
            get => _regionStatuses ?? (_regionStatuses = new InputList<Inputs.ResourceGroupRegionStatusGetArgs>());
            set => _regionStatuses = value;
        }

        /// <summary>
        /// The status of the resource group.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public ResourceGroupState()
        {
        }
    }
}
