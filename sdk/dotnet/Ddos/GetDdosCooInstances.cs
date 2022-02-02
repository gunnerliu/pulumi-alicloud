// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ddos
{
    public static class GetDdosCooInstances
    {
        /// <summary>
        /// This data source provides a list of BGP-Line Anti-DDoS Pro instances in an Alibaba Cloud account according to the specified filters.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var instanceDdosCooInstances = Output.Create(AliCloud.Ddos.GetDdosCooInstances.InvokeAsync(new AliCloud.Ddos.GetDdosCooInstancesArgs
        ///         {
        ///             NameRegex = "^ddoscoo",
        ///         }));
        ///         this.Instance = alicloud_ddoscoo_instances.Instance.Select(__item =&gt; __item.Id).ToList();
        ///     }
        /// 
        ///     [Output("instance")]
        ///     public Output&lt;string&gt; Instance { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDdosCooInstancesResult> InvokeAsync(GetDdosCooInstancesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDdosCooInstancesResult>("alicloud:ddos/getDdosCooInstances:getDdosCooInstances", args ?? new GetDdosCooInstancesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of BGP-Line Anti-DDoS Pro instances in an Alibaba Cloud account according to the specified filters.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var instanceDdosCooInstances = Output.Create(AliCloud.Ddos.GetDdosCooInstances.InvokeAsync(new AliCloud.Ddos.GetDdosCooInstancesArgs
        ///         {
        ///             NameRegex = "^ddoscoo",
        ///         }));
        ///         this.Instance = alicloud_ddoscoo_instances.Instance.Select(__item =&gt; __item.Id).ToList();
        ///     }
        /// 
        ///     [Output("instance")]
        ///     public Output&lt;string&gt; Instance { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDdosCooInstancesResult> Invoke(GetDdosCooInstancesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetDdosCooInstancesResult>("alicloud:ddos/getDdosCooInstances:getDdosCooInstances", args ?? new GetDdosCooInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDdosCooInstancesArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of instance IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by the instance name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetDdosCooInstancesArgs()
        {
        }
    }

    public sealed class GetDdosCooInstancesInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of instance IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by the instance name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetDdosCooInstancesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDdosCooInstancesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of instance IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// A list of apis. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDdosCooInstancesInstanceResult> Instances;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of instance names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetDdosCooInstancesResult(
            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetDdosCooInstancesInstanceResult> instances,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            Id = id;
            Ids = ids;
            Instances = instances;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
