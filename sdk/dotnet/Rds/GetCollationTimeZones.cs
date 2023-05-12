// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds
{
    public static class GetCollationTimeZones
    {
        /// <summary>
        /// Operation to query the character set collations and time zones available for use in ApsaraDB RDS.
        /// 
        /// &gt; **NOTE:** Available in v1.198.0+.
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
        ///     var zones = AliCloud.Rds.GetCollationTimeZones.Invoke(new()
        ///     {
        ///         OutputFile = "./classes.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstRdsCollationTimeZones"] = zones.Apply(getCollationTimeZonesResult =&gt; getCollationTimeZonesResult.CollationTimeZones[0]),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCollationTimeZonesResult> InvokeAsync(GetCollationTimeZonesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCollationTimeZonesResult>("alicloud:rds/getCollationTimeZones:getCollationTimeZones", args ?? new GetCollationTimeZonesArgs(), options.WithDefaults());

        /// <summary>
        /// Operation to query the character set collations and time zones available for use in ApsaraDB RDS.
        /// 
        /// &gt; **NOTE:** Available in v1.198.0+.
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
        ///     var zones = AliCloud.Rds.GetCollationTimeZones.Invoke(new()
        ///     {
        ///         OutputFile = "./classes.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstRdsCollationTimeZones"] = zones.Apply(getCollationTimeZonesResult =&gt; getCollationTimeZonesResult.CollationTimeZones[0]),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCollationTimeZonesResult> Invoke(GetCollationTimeZonesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCollationTimeZonesResult>("alicloud:rds/getCollationTimeZones:getCollationTimeZones", args ?? new GetCollationTimeZonesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCollationTimeZonesArgs : global::Pulumi.InvokeArgs
    {
        [Input("collationTimeZones")]
        private List<Inputs.GetCollationTimeZonesCollationTimeZoneArgs>? _collationTimeZones;

        /// <summary>
        /// An array that consists of the character set collations and time zones that are available for
        /// use in ApsaraDB RDS.
        /// </summary>
        public List<Inputs.GetCollationTimeZonesCollationTimeZoneArgs> CollationTimeZones
        {
            get => _collationTimeZones ?? (_collationTimeZones = new List<Inputs.GetCollationTimeZonesCollationTimeZoneArgs>());
            set => _collationTimeZones = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi up`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetCollationTimeZonesArgs()
        {
        }
        public static new GetCollationTimeZonesArgs Empty => new GetCollationTimeZonesArgs();
    }

    public sealed class GetCollationTimeZonesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("collationTimeZones")]
        private InputList<Inputs.GetCollationTimeZonesCollationTimeZoneInputArgs>? _collationTimeZones;

        /// <summary>
        /// An array that consists of the character set collations and time zones that are available for
        /// use in ApsaraDB RDS.
        /// </summary>
        public InputList<Inputs.GetCollationTimeZonesCollationTimeZoneInputArgs> CollationTimeZones
        {
            get => _collationTimeZones ?? (_collationTimeZones = new InputList<Inputs.GetCollationTimeZonesCollationTimeZoneInputArgs>());
            set => _collationTimeZones = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi up`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetCollationTimeZonesInvokeArgs()
        {
        }
        public static new GetCollationTimeZonesInvokeArgs Empty => new GetCollationTimeZonesInvokeArgs();
    }


    [OutputType]
    public sealed class GetCollationTimeZonesResult
    {
        public readonly ImmutableArray<Outputs.GetCollationTimeZonesCollationTimeZoneResult> CollationTimeZones;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetCollationTimeZonesResult(
            ImmutableArray<Outputs.GetCollationTimeZonesCollationTimeZoneResult> collationTimeZones,

            string id,

            ImmutableArray<string> ids,

            string? outputFile)
        {
            CollationTimeZones = collationTimeZones;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
        }
    }
}
