// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dfs
{
    public static class GetAccessRules
    {
        /// <summary>
        /// This data source provides the Dfs Access Rules of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.140.0+.
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
        ///         var ids = Output.Create(AliCloud.Dfs.GetAccessRules.InvokeAsync(new AliCloud.Dfs.GetAccessRulesArgs
        ///         {
        ///             AccessGroupId = "example_value",
        ///             Ids = 
        ///             {
        ///                 "example_value-1",
        ///                 "example_value-2",
        ///             },
        ///         }));
        ///         this.DfsAccessRuleId1 = ids.Apply(ids =&gt; ids.Rules?[0]?.Id);
        ///     }
        /// 
        ///     [Output("dfsAccessRuleId1")]
        ///     public Output&lt;string&gt; DfsAccessRuleId1 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAccessRulesResult> InvokeAsync(GetAccessRulesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAccessRulesResult>("alicloud:dfs/getAccessRules:getAccessRules", args ?? new GetAccessRulesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Dfs Access Rules of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.140.0+.
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
        ///         var ids = Output.Create(AliCloud.Dfs.GetAccessRules.InvokeAsync(new AliCloud.Dfs.GetAccessRulesArgs
        ///         {
        ///             AccessGroupId = "example_value",
        ///             Ids = 
        ///             {
        ///                 "example_value-1",
        ///                 "example_value-2",
        ///             },
        ///         }));
        ///         this.DfsAccessRuleId1 = ids.Apply(ids =&gt; ids.Rules?[0]?.Id);
        ///     }
        /// 
        ///     [Output("dfsAccessRuleId1")]
        ///     public Output&lt;string&gt; DfsAccessRuleId1 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAccessRulesResult> Invoke(GetAccessRulesInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetAccessRulesResult>("alicloud:dfs/getAccessRules:getAccessRules", args ?? new GetAccessRulesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccessRulesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The resource ID of the Access Group.
        /// </summary>
        [Input("accessGroupId", required: true)]
        public string AccessGroupId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Access Rule IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetAccessRulesArgs()
        {
        }
    }

    public sealed class GetAccessRulesInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The resource ID of the Access Group.
        /// </summary>
        [Input("accessGroupId", required: true)]
        public Input<string> AccessGroupId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Access Rule IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetAccessRulesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAccessRulesResult
    {
        public readonly string AccessGroupId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetAccessRulesRuleResult> Rules;

        [OutputConstructor]
        private GetAccessRulesResult(
            string accessGroupId,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetAccessRulesRuleResult> rules)
        {
            AccessGroupId = accessGroupId;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Rules = rules;
        }
    }
}
