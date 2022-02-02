// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ros
{
    public static class GetTemplateScratches
    {
        /// <summary>
        /// This data source provides the Ros Template Scratches of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.151.0+.
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
        ///         var ids = Output.Create(AliCloud.Ros.GetTemplateScratches.InvokeAsync(new AliCloud.Ros.GetTemplateScratchesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_value",
        ///             },
        ///         }));
        ///         this.RosTemplateScratchId1 = ids.Apply(ids =&gt; ids.Scratches?[0]?.Id);
        ///         var status = Output.Create(AliCloud.Ros.GetTemplateScratches.InvokeAsync(new AliCloud.Ros.GetTemplateScratchesArgs
        ///         {
        ///             Status = "GENERATE_COMPLETE",
        ///         }));
        ///         this.RosTemplateScratchId2 = status.Apply(status =&gt; status.Scratches?[0]?.Id);
        ///         var templateScratchType = Output.Create(AliCloud.Ros.GetTemplateScratches.InvokeAsync(new AliCloud.Ros.GetTemplateScratchesArgs
        ///         {
        ///             TemplateScratchType = "ResourceImport",
        ///         }));
        ///         this.RosTemplateScratchId3 = templateScratchType.Apply(templateScratchType =&gt; templateScratchType.Scratches?[0]?.Id);
        ///     }
        /// 
        ///     [Output("rosTemplateScratchId1")]
        ///     public Output&lt;string&gt; RosTemplateScratchId1 { get; set; }
        ///     [Output("rosTemplateScratchId2")]
        ///     public Output&lt;string&gt; RosTemplateScratchId2 { get; set; }
        ///     [Output("rosTemplateScratchId3")]
        ///     public Output&lt;string&gt; RosTemplateScratchId3 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTemplateScratchesResult> InvokeAsync(GetTemplateScratchesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetTemplateScratchesResult>("alicloud:ros/getTemplateScratches:getTemplateScratches", args ?? new GetTemplateScratchesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ros Template Scratches of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.151.0+.
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
        ///         var ids = Output.Create(AliCloud.Ros.GetTemplateScratches.InvokeAsync(new AliCloud.Ros.GetTemplateScratchesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_value",
        ///             },
        ///         }));
        ///         this.RosTemplateScratchId1 = ids.Apply(ids =&gt; ids.Scratches?[0]?.Id);
        ///         var status = Output.Create(AliCloud.Ros.GetTemplateScratches.InvokeAsync(new AliCloud.Ros.GetTemplateScratchesArgs
        ///         {
        ///             Status = "GENERATE_COMPLETE",
        ///         }));
        ///         this.RosTemplateScratchId2 = status.Apply(status =&gt; status.Scratches?[0]?.Id);
        ///         var templateScratchType = Output.Create(AliCloud.Ros.GetTemplateScratches.InvokeAsync(new AliCloud.Ros.GetTemplateScratchesArgs
        ///         {
        ///             TemplateScratchType = "ResourceImport",
        ///         }));
        ///         this.RosTemplateScratchId3 = templateScratchType.Apply(templateScratchType =&gt; templateScratchType.Scratches?[0]?.Id);
        ///     }
        /// 
        ///     [Output("rosTemplateScratchId1")]
        ///     public Output&lt;string&gt; RosTemplateScratchId1 { get; set; }
        ///     [Output("rosTemplateScratchId2")]
        ///     public Output&lt;string&gt; RosTemplateScratchId2 { get; set; }
        ///     [Output("rosTemplateScratchId3")]
        ///     public Output&lt;string&gt; RosTemplateScratchId3 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetTemplateScratchesResult> Invoke(GetTemplateScratchesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetTemplateScratchesResult>("alicloud:ros/getTemplateScratches:getTemplateScratches", args ?? new GetTemplateScratchesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTemplateScratchesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Template Scratch IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// The type of the Template Scratch.
        /// </summary>
        [Input("templateScratchType")]
        public string? TemplateScratchType { get; set; }

        public GetTemplateScratchesArgs()
        {
        }
    }

    public sealed class GetTemplateScratchesInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Template Scratch IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The type of the Template Scratch.
        /// </summary>
        [Input("templateScratchType")]
        public Input<string>? TemplateScratchType { get; set; }

        public GetTemplateScratchesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetTemplateScratchesResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetTemplateScratchesScratchResult> Scratches;
        public readonly string? Status;
        public readonly string? TemplateScratchType;

        [OutputConstructor]
        private GetTemplateScratchesResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetTemplateScratchesScratchResult> scratches,

            string? status,

            string? templateScratchType)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Scratches = scratches;
            Status = status;
            TemplateScratchType = templateScratchType;
        }
    }
}
