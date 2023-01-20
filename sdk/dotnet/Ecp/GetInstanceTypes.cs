// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecp
{
    public static class GetInstanceTypes
    {
        /// <summary>
        /// This data source provides the available instance types with the Cloud Phone (ECP) Instance of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.158.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var @default = AliCloud.Ecp.GetInstanceTypes.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstEcpInstanceTypesInstanceType"] = @default.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult).Apply(@default =&gt; @default.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.InstanceType)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInstanceTypesResult> InvokeAsync(GetInstanceTypesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceTypesResult>("alicloud:ecp/getInstanceTypes:getInstanceTypes", args ?? new GetInstanceTypesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the available instance types with the Cloud Phone (ECP) Instance of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.158.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var @default = AliCloud.Ecp.GetInstanceTypes.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstEcpInstanceTypesInstanceType"] = @default.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult).Apply(@default =&gt; @default.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.InstanceType)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetInstanceTypesResult> Invoke(GetInstanceTypesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceTypesResult>("alicloud:ecp/getInstanceTypes:getInstanceTypes", args ?? new GetInstanceTypesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceTypesArgs : global::Pulumi.InvokeArgs
    {
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetInstanceTypesArgs()
        {
        }
        public static new GetInstanceTypesArgs Empty => new GetInstanceTypesArgs();
    }

    public sealed class GetInstanceTypesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetInstanceTypesInvokeArgs()
        {
        }
        public static new GetInstanceTypesInvokeArgs Empty => new GetInstanceTypesInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceTypesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetInstanceTypesInstanceTypeResult> InstanceTypes;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetInstanceTypesResult(
            string id,

            ImmutableArray<Outputs.GetInstanceTypesInstanceTypeResult> instanceTypes,

            string? outputFile)
        {
            Id = id;
            InstanceTypes = instanceTypes;
            OutputFile = outputFile;
        }
    }
}
