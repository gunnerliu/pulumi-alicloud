// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    /// <summary>
    /// Provides a network acl resource to add network acls.
    /// 
    /// &gt; **NOTE:** Available in 1.43.0+. Currently, the resource are only available in Hongkong(cn-hongkong), India(ap-south-1), and Indonesia(ap-southeast-1) regions.
    /// </summary>
    public partial class NetworkAcl : Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the network acl instance.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the network acl.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The vpc_id of the network acl, the field can't be changed.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkAcl resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkAcl(string name, NetworkAclArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpc/networkAcl:NetworkAcl", name, args ?? new NetworkAclArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkAcl(string name, Input<string> id, NetworkAclState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpc/networkAcl:NetworkAcl", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworkAcl resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkAcl Get(string name, Input<string> id, NetworkAclState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkAcl(name, id, state, options);
        }
    }

    public sealed class NetworkAclArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the network acl instance.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the network acl.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The vpc_id of the network acl, the field can't be changed.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        public NetworkAclArgs()
        {
        }
    }

    public sealed class NetworkAclState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the network acl instance.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the network acl.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The vpc_id of the network acl, the field can't be changed.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public NetworkAclState()
        {
        }
    }
}
