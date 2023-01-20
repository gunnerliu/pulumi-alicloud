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
    /// Provides a VPC Public Ip Address Pool Cidr Block resource.
    /// 
    /// For information about VPC Public Ip Address Pool Cidr Block and how to use it, see [What is Public Ip Address Pool Cidr Block](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/429100).
    /// 
    /// &gt; **NOTE:** Available in v1.189.0+.
    /// 
    /// &gt; **NOTE:** Only users who have the required permissions can use the IP address pool feature of Elastic IP Address (EIP). To apply for the required permissions, [submit a ticket](https://smartservice.console.aliyun.com/service/create-ticket).
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var defaultPublicIpAddressPool = new AliCloud.Vpc.PublicIpAddressPool("defaultPublicIpAddressPool", new()
    ///     {
    ///         PublicIpAddressPoolName = "example_value",
    ///         Isp = "BGP",
    ///         Description = "example_value",
    ///     });
    /// 
    ///     var defaultPublicIpAddressPoolCidrBlock = new AliCloud.Vpc.PublicIpAddressPoolCidrBlock("defaultPublicIpAddressPoolCidrBlock", new()
    ///     {
    ///         PublicIpAddressPoolId = defaultPublicIpAddressPool.Id,
    ///         CidrBlock = "your_cidr_block",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// VPC Public Ip Address Pool Cidr Block can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:vpc/publicIpAddressPoolCidrBlock:PublicIpAddressPoolCidrBlock example &lt;public_ip_address_pool_id&gt;:&lt;cidr_block&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:vpc/publicIpAddressPoolCidrBlock:PublicIpAddressPoolCidrBlock")]
    public partial class PublicIpAddressPoolCidrBlock : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The CIDR block.
        /// </summary>
        [Output("cidrBlock")]
        public Output<string> CidrBlock { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC Public IP address pool.
        /// </summary>
        [Output("publicIpAddressPoolId")]
        public Output<string> PublicIpAddressPoolId { get; private set; } = null!;

        /// <summary>
        /// The status of the VPC Public Ip Address Pool Cidr Block.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a PublicIpAddressPoolCidrBlock resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PublicIpAddressPoolCidrBlock(string name, PublicIpAddressPoolCidrBlockArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpc/publicIpAddressPoolCidrBlock:PublicIpAddressPoolCidrBlock", name, args ?? new PublicIpAddressPoolCidrBlockArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PublicIpAddressPoolCidrBlock(string name, Input<string> id, PublicIpAddressPoolCidrBlockState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpc/publicIpAddressPoolCidrBlock:PublicIpAddressPoolCidrBlock", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PublicIpAddressPoolCidrBlock resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PublicIpAddressPoolCidrBlock Get(string name, Input<string> id, PublicIpAddressPoolCidrBlockState? state = null, CustomResourceOptions? options = null)
        {
            return new PublicIpAddressPoolCidrBlock(name, id, state, options);
        }
    }

    public sealed class PublicIpAddressPoolCidrBlockArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CIDR block.
        /// </summary>
        [Input("cidrBlock", required: true)]
        public Input<string> CidrBlock { get; set; } = null!;

        /// <summary>
        /// The ID of the VPC Public IP address pool.
        /// </summary>
        [Input("publicIpAddressPoolId", required: true)]
        public Input<string> PublicIpAddressPoolId { get; set; } = null!;

        public PublicIpAddressPoolCidrBlockArgs()
        {
        }
        public static new PublicIpAddressPoolCidrBlockArgs Empty => new PublicIpAddressPoolCidrBlockArgs();
    }

    public sealed class PublicIpAddressPoolCidrBlockState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CIDR block.
        /// </summary>
        [Input("cidrBlock")]
        public Input<string>? CidrBlock { get; set; }

        /// <summary>
        /// The ID of the VPC Public IP address pool.
        /// </summary>
        [Input("publicIpAddressPoolId")]
        public Input<string>? PublicIpAddressPoolId { get; set; }

        /// <summary>
        /// The status of the VPC Public Ip Address Pool Cidr Block.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public PublicIpAddressPoolCidrBlockState()
        {
        }
        public static new PublicIpAddressPoolCidrBlockState Empty => new PublicIpAddressPoolCidrBlockState();
    }
}
