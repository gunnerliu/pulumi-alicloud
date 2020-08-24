// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Yundun
{
    public static class GetBastionHostInstances
    {
        /// <summary>
        /// This data source provides a list of cloud Bastionhost instances in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.63.0+ .
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
        ///         var instanceBastionHostInstances = Output.Create(AliCloud.Yundun.GetBastionHostInstances.InvokeAsync(new AliCloud.Yundun.GetBastionHostInstancesArgs
        ///         {
        ///             NameRegex = "^bastionhost",
        ///         }));
        ///         this.Instance = alicloud_yundun_bastionhost_instances.Instance.Select(__item =&gt; __item.Id).ToList();
        ///     }
        /// 
        ///     [Output("instance")]
        ///     public Output&lt;string&gt; Instance { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetBastionHostInstancesResult> InvokeAsync(GetBastionHostInstancesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetBastionHostInstancesResult>("alicloud:yundun/getBastionHostInstances:getBastionHostInstances", args ?? new GetBastionHostInstancesArgs(), options.WithVersion());
    }


    public sealed class GetBastionHostInstancesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// A regex string to filter results by the instance description.
        /// </summary>
        [Input("descriptionRegex")]
        public string? DescriptionRegex { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// Matched instance IDs to filter data source result.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name to persist data source output.
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// A map of tags assigned to the bastionhost instance. It must be in the format:
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var instance = Output.Create(AliCloud.Yundun.GetBastionHostInstances.InvokeAsync(new AliCloud.Yundun.GetBastionHostInstancesArgs
        ///         {
        ///             Tags = 
        ///             {
        ///                 { "tagKey1", "tagValue1" },
        ///             },
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        public GetBastionHostInstancesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetBastionHostInstancesResult
    {
        public readonly string? DescriptionRegex;
        public readonly ImmutableArray<string> Descriptions;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// A list of apis. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBastionHostInstancesInstanceResult> Instances;
        public readonly string? OutputFile;
        /// <summary>
        /// A map of tags assigned to the bastionhost instance.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Tags;

        [OutputConstructor]
        private GetBastionHostInstancesResult(
            string? descriptionRegex,

            ImmutableArray<string> descriptions,

            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetBastionHostInstancesInstanceResult> instances,

            string? outputFile,

            ImmutableDictionary<string, object>? tags)
        {
            DescriptionRegex = descriptionRegex;
            Descriptions = descriptions;
            Id = id;
            Ids = ids;
            Instances = instances;
            OutputFile = outputFile;
            Tags = tags;
        }
    }
}
