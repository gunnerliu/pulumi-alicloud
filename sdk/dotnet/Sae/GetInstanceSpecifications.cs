// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae
{
    public static class GetInstanceSpecifications
    {
        /// <summary>
        /// This data source provides the Sae Instance Specifications of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.139.0+.
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
        ///     var ids = AliCloud.Sae.GetInstanceSpecifications.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["saeInstanceSpecificationId1"] = ids.Apply(getInstanceSpecificationsResult =&gt; getInstanceSpecificationsResult.Specifications[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInstanceSpecificationsResult> InvokeAsync(GetInstanceSpecificationsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceSpecificationsResult>("alicloud:sae/getInstanceSpecifications:getInstanceSpecifications", args ?? new GetInstanceSpecificationsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Sae Instance Specifications of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.139.0+.
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
        ///     var ids = AliCloud.Sae.GetInstanceSpecifications.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["saeInstanceSpecificationId1"] = ids.Apply(getInstanceSpecificationsResult =&gt; getInstanceSpecificationsResult.Specifications[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetInstanceSpecificationsResult> Invoke(GetInstanceSpecificationsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceSpecificationsResult>("alicloud:sae/getInstanceSpecifications:getInstanceSpecifications", args ?? new GetInstanceSpecificationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceSpecificationsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Instance Specification IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetInstanceSpecificationsArgs()
        {
        }
        public static new GetInstanceSpecificationsArgs Empty => new GetInstanceSpecificationsArgs();
    }

    public sealed class GetInstanceSpecificationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Instance Specification IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetInstanceSpecificationsInvokeArgs()
        {
        }
        public static new GetInstanceSpecificationsInvokeArgs Empty => new GetInstanceSpecificationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceSpecificationsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetInstanceSpecificationsSpecificationResult> Specifications;

        [OutputConstructor]
        private GetInstanceSpecificationsResult(
            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetInstanceSpecificationsSpecificationResult> specifications)
        {
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Specifications = specifications;
        }
    }
}
