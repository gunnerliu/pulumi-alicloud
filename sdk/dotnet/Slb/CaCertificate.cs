// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb
{
    /// <summary>
    /// A Load Balancer CA Certificate is used by the listener of the protocol https.
    /// 
    /// For information about slb and how to use it, see [What is Server Load Balancer](https://www.alibabacloud.com/help/doc-detail/27539.htm).
    /// 
    /// For information about CA Certificate and how to use it, see [Configure CA Certificate](https://www.alibabacloud.com/help/doc-detail/85968.htm).
    /// </summary>
    public partial class CaCertificate : Pulumi.CustomResource
    {
        /// <summary>
        /// the content of the CA certificate.
        /// </summary>
        [Output("caCertificate")]
        public Output<string> Certificate { get; private set; } = null!;

        /// <summary>
        /// Name of the CA Certificate.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Id of resource group which the slb_ca certificate belongs.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a CaCertificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CaCertificate(string name, CaCertificateArgs args, CustomResourceOptions? options = null)
            : base("alicloud:slb/caCertificate:CaCertificate", name, args ?? new CaCertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CaCertificate(string name, Input<string> id, CaCertificateState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:slb/caCertificate:CaCertificate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CaCertificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CaCertificate Get(string name, Input<string> id, CaCertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new CaCertificate(name, id, state, options);
        }
    }

    public sealed class CaCertificateArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// the content of the CA certificate.
        /// </summary>
        [Input("caCertificate", required: true)]
        public Input<string> Certificate { get; set; } = null!;

        /// <summary>
        /// Name of the CA Certificate.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Id of resource group which the slb_ca certificate belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

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

        public CaCertificateArgs()
        {
        }
    }

    public sealed class CaCertificateState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// the content of the CA certificate.
        /// </summary>
        [Input("caCertificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// Name of the CA Certificate.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Id of resource group which the slb_ca certificate belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

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

        public CaCertificateState()
        {
        }
    }
}
