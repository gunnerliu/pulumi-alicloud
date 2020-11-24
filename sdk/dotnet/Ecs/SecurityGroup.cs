// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    /// <summary>
    /// ## Import
    /// 
    /// Security Group can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ecs/securityGroup:SecurityGroup example sg-abc123456
    /// ```
    /// </summary>
    public partial class SecurityGroup : Pulumi.CustomResource
    {
        /// <summary>
        /// The security group description. Defaults to null.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
        /// </summary>
        [Output("innerAccess")]
        public Output<bool> InnerAccess { get; private set; } = null!;

        /// <summary>
        /// Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
        /// </summary>
        [Output("innerAccessPolicy")]
        public Output<string> InnerAccessPolicy { get; private set; } = null!;

        /// <summary>
        /// The name of the security group. Defaults to null.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Id of resource group which the security_group belongs.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string?> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The type of the security group. Valid values:
        /// `normal`: basic security group.
        /// `enterprise`: advanced security group For more information.
        /// </summary>
        [Output("securityGroupType")]
        public Output<string?> SecurityGroupType { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The VPC ID.
        /// </summary>
        [Output("vpcId")]
        public Output<string?> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a SecurityGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecurityGroup(string name, SecurityGroupArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/securityGroup:SecurityGroup", name, args ?? new SecurityGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecurityGroup(string name, Input<string> id, SecurityGroupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/securityGroup:SecurityGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecurityGroup Get(string name, Input<string> id, SecurityGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new SecurityGroup(name, id, state, options);
        }
    }

    public sealed class SecurityGroupArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The security group description. Defaults to null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
        /// </summary>
        [Input("innerAccess")]
        public Input<bool>? InnerAccess { get; set; }

        /// <summary>
        /// Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
        /// </summary>
        [Input("innerAccessPolicy")]
        public Input<string>? InnerAccessPolicy { get; set; }

        /// <summary>
        /// The name of the security group. Defaults to null.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Id of resource group which the security_group belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The type of the security group. Valid values:
        /// `normal`: basic security group.
        /// `enterprise`: advanced security group For more information.
        /// </summary>
        [Input("securityGroupType")]
        public Input<string>? SecurityGroupType { get; set; }

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
        /// The VPC ID.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public SecurityGroupArgs()
        {
        }
    }

    public sealed class SecurityGroupState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The security group description. Defaults to null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
        /// </summary>
        [Input("innerAccess")]
        public Input<bool>? InnerAccess { get; set; }

        /// <summary>
        /// Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
        /// </summary>
        [Input("innerAccessPolicy")]
        public Input<string>? InnerAccessPolicy { get; set; }

        /// <summary>
        /// The name of the security group. Defaults to null.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Id of resource group which the security_group belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The type of the security group. Valid values:
        /// `normal`: basic security group.
        /// `enterprise`: advanced security group For more information.
        /// </summary>
        [Input("securityGroupType")]
        public Input<string>? SecurityGroupType { get; set; }

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
        /// The VPC ID.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public SecurityGroupState()
        {
        }
    }
}
