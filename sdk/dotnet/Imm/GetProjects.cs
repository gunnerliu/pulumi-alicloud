// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.AliCloud.Imm
{
    public static class GetProjects
    {
        /// <summary>
        /// This data source provides the Intelligent Media Management Projects of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
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
        ///         var ids = Output.Create(AliCloud.Imm.GetProjects.InvokeAsync(new AliCloud.Imm.GetProjectsArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.ImmProjectId1 = ids.Apply(ids =&gt; ids.Projects?[0]?.Id);
        ///     }
        /// 
        ///     [Output("immProjectId1")]
        ///     public Output&lt;string&gt; ImmProjectId1 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetProjectsResult> InvokeAsync(GetProjectsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetProjectsResult>("alicloud:imm/getProjects:getProjects", args ?? new GetProjectsArgs(), options.WithVersion());

        /// <summary>
        /// This data source provides the Intelligent Media Management Projects of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
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
        ///         var ids = Output.Create(AliCloud.Imm.GetProjects.InvokeAsync(new AliCloud.Imm.GetProjectsArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.ImmProjectId1 = ids.Apply(ids =&gt; ids.Projects?[0]?.Id);
        ///     }
        /// 
        ///     [Output("immProjectId1")]
        ///     public Output&lt;string&gt; ImmProjectId1 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetProjectsResult> Invoke(GetProjectsInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetProjectsResult>("alicloud:imm/getProjects:getProjects", args ?? new GetProjectsInvokeArgs(), options.WithVersion());
    }


    public sealed class GetProjectsArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Project IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetProjectsArgs()
        {
        }
    }

    public sealed class GetProjectsInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Project IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetProjectsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetProjectsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetProjectsProjectResult> Projects;

        [OutputConstructor]
        private GetProjectsResult(
            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetProjectsProjectResult> projects)
        {
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Projects = projects;
        }
    }
}