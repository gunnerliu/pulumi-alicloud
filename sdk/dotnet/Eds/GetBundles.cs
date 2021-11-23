// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.AliCloud.Eds
{
    public static class GetBundles
    {
        /// <summary>
        /// This data source provides the Ecd bundles of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.143.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///         var @default = Output.Create(AliCloud.Eds.GetBundles.InvokeAsync(new AliCloud.Eds.GetBundlesArgs
        ///         {
        ///             BundleType = "SYSTEM",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetBundlesResult> InvokeAsync(GetBundlesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetBundlesResult>("alicloud:eds/getBundles:getBundles", args ?? new GetBundlesArgs(), options.WithVersion());

        /// <summary>
        /// This data source provides the Ecd bundles of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.143.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///         var @default = Output.Create(AliCloud.Eds.GetBundles.InvokeAsync(new AliCloud.Eds.GetBundlesArgs
        ///         {
        ///             BundleType = "SYSTEM",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetBundlesResult> Invoke(GetBundlesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetBundlesResult>("alicloud:eds/getBundles:getBundles", args ?? new GetBundlesInvokeArgs(), options.WithVersion());
    }


    public sealed class GetBundlesArgs : Pulumi.InvokeArgs
    {
        [Input("bundleIds")]
        private List<string>? _bundleIds;

        /// <summary>
        /// The bundle id of the bundle.
        /// </summary>
        public List<string> BundleIds
        {
            get => _bundleIds ?? (_bundleIds = new List<string>());
            set => _bundleIds = value;
        }

        /// <summary>
        /// The bundle type of  the bundle. Valid values: `SYSTEM`,`CUSTOM`.
        /// </summary>
        [Input("bundleType")]
        public string? BundleType { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Bundle IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Bundle name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetBundlesArgs()
        {
        }
    }

    public sealed class GetBundlesInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("bundleIds")]
        private InputList<string>? _bundleIds;

        /// <summary>
        /// The bundle id of the bundle.
        /// </summary>
        public InputList<string> BundleIds
        {
            get => _bundleIds ?? (_bundleIds = new InputList<string>());
            set => _bundleIds = value;
        }

        /// <summary>
        /// The bundle type of  the bundle. Valid values: `SYSTEM`,`CUSTOM`.
        /// </summary>
        [Input("bundleType")]
        public Input<string>? BundleType { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Bundle IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Bundle name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetBundlesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetBundlesResult
    {
        public readonly ImmutableArray<string> BundleIds;
        public readonly string? BundleType;
        public readonly ImmutableArray<Outputs.GetBundlesBundleResult> Bundles;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetBundlesResult(
            ImmutableArray<string> bundleIds,

            string? bundleType,

            ImmutableArray<Outputs.GetBundlesBundleResult> bundles,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            BundleIds = bundleIds;
            BundleType = bundleType;
            Bundles = bundles;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}