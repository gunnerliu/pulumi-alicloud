// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.BastionHost
{
    /// <summary>
    /// &gt; **NOTE:** From the version 1.132.0, the resource has been renamed to `alicloud.bastionhost.Instance`.
    /// 
    /// Cloud Bastion Host instance resource ("Yundun_bastionhost" is the short term of this product).
    /// For information about Resource Manager Resource Directory and how to use it, see [What is Bastionhost](https://www.alibabacloud.com/help/en/doc-detail/52922.htm).
    /// 
    /// &gt; **NOTE:** The endpoint of bssopenapi used only support "business.aliyuncs.com" at present.
    /// 
    /// &gt; **NOTE:** Available in 1.63.0+ .
    /// 
    /// &gt; **NOTE:** In order to destroy Cloud Bastionhost instance , users are required to apply for white list first
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var @default = new AliCloud.BastionHost.Instance("default", new AliCloud.BastionHost.InstanceArgs
    ///         {
    ///             Description = "Terraform-test",
    ///             LicenseCode = "bhah_ent_50_asset",
    ///             Period = 1,
    ///             SecurityGroupIds = 
    ///             {
    ///                 "sg-test",
    ///                 "sg-12345",
    ///             },
    ///             VswitchId = "v-testVswitch",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Yundun_bastionhost instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:bastionhost/instance:Instance example bastionhost-exampe123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:bastionhost/instance:Instance")]
    public partial class Instance : Pulumi.CustomResource
    {
        /// <summary>
        /// Description of the instance. This name can have a string of 1 to 63 characters.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Whether to Enable the public internet access to a specified Bastionhost instance. The valid values: `true`, `false`.
        /// </summary>
        [Output("enablePublicAccess")]
        public Output<bool> EnablePublicAccess { get; private set; } = null!;

        /// <summary>
        /// The package type of Cloud Bastionhost instance. You can query more supported types through the [DescribePricingModule](https://help.aliyun.com/document_detail/96469.html).
        /// </summary>
        [Output("licenseCode")]
        public Output<string> LicenseCode { get; private set; } = null!;

        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// The Id of resource group which the Bastionhost Instance belongs. If not set, the resource is created in the default resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string?> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// security group IDs configured to Bastionhost.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// VSwitch ID configured to Bastionhost.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:bastionhost/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:bastionhost/instance:Instance", name, state, MakeResourceOptions(options, id))
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
        /// Description of the instance. This name can have a string of 1 to 63 characters.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// Whether to Enable the public internet access to a specified Bastionhost instance. The valid values: `true`, `false`.
        /// </summary>
        [Input("enablePublicAccess")]
        public Input<bool>? EnablePublicAccess { get; set; }

        /// <summary>
        /// The package type of Cloud Bastionhost instance. You can query more supported types through the [DescribePricingModule](https://help.aliyun.com/document_detail/96469.html).
        /// </summary>
        [Input("licenseCode", required: true)]
        public Input<string> LicenseCode { get; set; } = null!;

        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The Id of resource group which the Bastionhost Instance belongs. If not set, the resource is created in the default resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("securityGroupIds", required: true)]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// security group IDs configured to Bastionhost.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

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
        /// VSwitch ID configured to Bastionhost.
        /// </summary>
        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        public InstanceArgs()
        {
        }
    }

    public sealed class InstanceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the instance. This name can have a string of 1 to 63 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether to Enable the public internet access to a specified Bastionhost instance. The valid values: `true`, `false`.
        /// </summary>
        [Input("enablePublicAccess")]
        public Input<bool>? EnablePublicAccess { get; set; }

        /// <summary>
        /// The package type of Cloud Bastionhost instance. You can query more supported types through the [DescribePricingModule](https://help.aliyun.com/document_detail/96469.html).
        /// </summary>
        [Input("licenseCode")]
        public Input<string>? LicenseCode { get; set; }

        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The Id of resource group which the Bastionhost Instance belongs. If not set, the resource is created in the default resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// security group IDs configured to Bastionhost.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

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
        /// VSwitch ID configured to Bastionhost.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public InstanceState()
        {
        }
    }
}
