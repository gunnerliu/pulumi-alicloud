// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ClickHouse
{
    public static class GetRegions
    {
        /// <summary>
        /// This data source provides the Click House Accounts of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.138.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var default1 = AliCloud.ClickHouse.GetRegions.Invoke(new()
        ///     {
        ///         Current = true,
        ///     });
        /// 
        ///     var default2 = AliCloud.ClickHouse.GetRegions.Invoke(new()
        ///     {
        ///         RegionId = "cn-hangzhou",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRegionsResult> InvokeAsync(GetRegionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRegionsResult>("alicloud:clickhouse/getRegions:getRegions", args ?? new GetRegionsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Click House Accounts of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.138.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var default1 = AliCloud.ClickHouse.GetRegions.Invoke(new()
        ///     {
        ///         Current = true,
        ///     });
        /// 
        ///     var default2 = AliCloud.ClickHouse.GetRegions.Invoke(new()
        ///     {
        ///         RegionId = "cn-hangzhou",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetRegionsResult> Invoke(GetRegionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRegionsResult>("alicloud:clickhouse/getRegions:getRegions", args ?? new GetRegionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRegionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Set to true to match only the region configured in the provider. Default value: `true`.
        /// </summary>
        [Input("current")]
        public bool? Current { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The Region ID.
        /// </summary>
        [Input("regionId")]
        public string? RegionId { get; set; }

        public GetRegionsArgs()
        {
        }
        public static new GetRegionsArgs Empty => new GetRegionsArgs();
    }

    public sealed class GetRegionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Set to true to match only the region configured in the provider. Default value: `true`.
        /// </summary>
        [Input("current")]
        public Input<bool>? Current { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The Region ID.
        /// </summary>
        [Input("regionId")]
        public Input<string>? RegionId { get; set; }

        public GetRegionsInvokeArgs()
        {
        }
        public static new GetRegionsInvokeArgs Empty => new GetRegionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetRegionsResult
    {
        public readonly bool? Current;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OutputFile;
        public readonly string? RegionId;
        public readonly ImmutableArray<Outputs.GetRegionsRegionResult> Regions;

        [OutputConstructor]
        private GetRegionsResult(
            bool? current,

            string id,

            string? outputFile,

            string? regionId,

            ImmutableArray<Outputs.GetRegionsRegionResult> regions)
        {
            Current = current;
            Id = id;
            OutputFile = outputFile;
            RegionId = regionId;
            Regions = regions;
        }
    }
}
