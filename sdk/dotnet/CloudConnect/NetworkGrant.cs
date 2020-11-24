// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudConnect
{
    /// <summary>
    /// Provides a Cloud Connect Network Grant resource. If the CEN instance to be attached belongs to another account, authorization by the CEN instance is required.
    /// 
    /// For information about Cloud Connect Network Grant and how to use it, see [What is Cloud Connect Network Grant](https://www.alibabacloud.com/help/doc-detail/94543.htm).
    /// 
    /// &gt; **NOTE:** Available in 1.63.0+
    /// 
    /// &gt; **NOTE:** Only the following regions support create Cloud Connect Network Grant. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-2`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]
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
    ///         var ccnAccount = new AliCloud.Provider("ccnAccount", new AliCloud.ProviderArgs
    ///         {
    ///         });
    ///         var cenAccount = new AliCloud.Provider("cenAccount", new AliCloud.ProviderArgs
    ///         {
    ///             Region = "cn-hangzhou",
    ///             AccessKey = "xxxxxx",
    ///             SecretKey = "xxxxxx",
    ///         });
    ///         var cen = new AliCloud.Cen.Instance("cen", new AliCloud.Cen.InstanceArgs
    ///         {
    ///         }, new CustomResourceOptions
    ///         {
    ///             Provider = alicloud.Cen_account,
    ///         });
    ///         var ccn = new AliCloud.CloudConnect.Network("ccn", new AliCloud.CloudConnect.NetworkArgs
    ///         {
    ///             IsDefault = true,
    ///         }, new CustomResourceOptions
    ///         {
    ///             Provider = alicloud.Ccn_account,
    ///         });
    ///         var @default = new AliCloud.CloudConnect.NetworkGrant("default", new AliCloud.CloudConnect.NetworkGrantArgs
    ///         {
    ///             CcnId = ccn.Id,
    ///             CenId = cen.Id,
    ///             CenUid = "xxxxxx",
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 ccn,
    ///                 cen,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// The Cloud Connect Network Grant can be imported using the instance_id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cloudconnect/networkGrant:NetworkGrant example ccn-abc123456:cen-abc123456
    /// ```
    /// </summary>
    public partial class NetworkGrant : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the CCN instance.
        /// </summary>
        [Output("ccnId")]
        public Output<string> CcnId { get; private set; } = null!;

        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        [Output("cenId")]
        public Output<string> CenId { get; private set; } = null!;

        /// <summary>
        /// The ID of the account to which the CEN instance belongs.
        /// </summary>
        [Output("cenUid")]
        public Output<string> CenUid { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkGrant resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkGrant(string name, NetworkGrantArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cloudconnect/networkGrant:NetworkGrant", name, args ?? new NetworkGrantArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkGrant(string name, Input<string> id, NetworkGrantState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cloudconnect/networkGrant:NetworkGrant", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworkGrant resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkGrant Get(string name, Input<string> id, NetworkGrantState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkGrant(name, id, state, options);
        }
    }

    public sealed class NetworkGrantArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the CCN instance.
        /// </summary>
        [Input("ccnId", required: true)]
        public Input<string> CcnId { get; set; } = null!;

        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        [Input("cenId", required: true)]
        public Input<string> CenId { get; set; } = null!;

        /// <summary>
        /// The ID of the account to which the CEN instance belongs.
        /// </summary>
        [Input("cenUid", required: true)]
        public Input<string> CenUid { get; set; } = null!;

        public NetworkGrantArgs()
        {
        }
    }

    public sealed class NetworkGrantState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the CCN instance.
        /// </summary>
        [Input("ccnId")]
        public Input<string>? CcnId { get; set; }

        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        [Input("cenId")]
        public Input<string>? CenId { get; set; }

        /// <summary>
        /// The ID of the account to which the CEN instance belongs.
        /// </summary>
        [Input("cenUid")]
        public Input<string>? CenUid { get; set; }

        public NetworkGrantState()
        {
        }
    }
}
