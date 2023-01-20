// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds
{
    public static class GetCrossRegions
    {
        /// <summary>
        /// This data source provides an available area for remote disaster recovery for RDS.
        /// 
        /// &gt; **NOTE:** Available in v1.193.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var crossRegions = AliCloud.Rds.GetCrossRegions.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstRdsCrossRegions"] = data.Alicloud_rds_cross_regions.Regions.Ids[0],
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCrossRegionsResult> InvokeAsync(GetCrossRegionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCrossRegionsResult>("alicloud:rds/getCrossRegions:getCrossRegions", args ?? new GetCrossRegionsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides an available area for remote disaster recovery for RDS.
        /// 
        /// &gt; **NOTE:** Available in v1.193.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var crossRegions = AliCloud.Rds.GetCrossRegions.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstRdsCrossRegions"] = data.Alicloud_rds_cross_regions.Regions.Ids[0],
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCrossRegionsResult> Invoke(GetCrossRegionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCrossRegionsResult>("alicloud:rds/getCrossRegions:getCrossRegions", args ?? new GetCrossRegionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCrossRegionsArgs : global::Pulumi.InvokeArgs
    {
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetCrossRegionsArgs()
        {
        }
        public static new GetCrossRegionsArgs Empty => new GetCrossRegionsArgs();
    }

    public sealed class GetCrossRegionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetCrossRegionsInvokeArgs()
        {
        }
        public static new GetCrossRegionsInvokeArgs Empty => new GetCrossRegionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetCrossRegionsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of region IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        /// <summary>
        /// The list of destination regions that support cross-region backup. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCrossRegionsRegionResult> Regions;

        [OutputConstructor]
        private GetCrossRegionsResult(
            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetCrossRegionsRegionResult> regions)
        {
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Regions = regions;
        }
    }
}
