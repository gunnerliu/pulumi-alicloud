// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetTrafficMirrorFilterIngressRules
    {
        /// <summary>
        /// This data source provides the Vpc Traffic Mirror Filter Ingress Rules of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.141.0+.
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
        ///         var ids = Output.Create(AliCloud.Vpc.GetTrafficMirrorFilterIngressRules.InvokeAsync(new AliCloud.Vpc.GetTrafficMirrorFilterIngressRulesArgs
        ///         {
        ///             TrafficMirrorFilterId = "example_traffic_mirror_filter_id",
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.VpcTrafficMirrorFilterIngressRuleId1 = ids.Apply(ids =&gt; ids.Rules?[0]?.Id);
        ///         var status = Output.Create(AliCloud.Vpc.GetTrafficMirrorFilterIngressRules.InvokeAsync(new AliCloud.Vpc.GetTrafficMirrorFilterIngressRulesArgs
        ///         {
        ///             TrafficMirrorFilterId = "example_traffic_mirror_filter_id",
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///             Status = "Created",
        ///         }));
        ///         this.VpcTrafficMirrorFilterIngressRuleId2 = status.Apply(status =&gt; status.Rules?[0]?.Id);
        ///     }
        /// 
        ///     [Output("vpcTrafficMirrorFilterIngressRuleId1")]
        ///     public Output&lt;string&gt; VpcTrafficMirrorFilterIngressRuleId1 { get; set; }
        ///     [Output("vpcTrafficMirrorFilterIngressRuleId2")]
        ///     public Output&lt;string&gt; VpcTrafficMirrorFilterIngressRuleId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTrafficMirrorFilterIngressRulesResult> InvokeAsync(GetTrafficMirrorFilterIngressRulesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetTrafficMirrorFilterIngressRulesResult>("alicloud:vpc/getTrafficMirrorFilterIngressRules:getTrafficMirrorFilterIngressRules", args ?? new GetTrafficMirrorFilterIngressRulesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Vpc Traffic Mirror Filter Ingress Rules of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.141.0+.
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
        ///         var ids = Output.Create(AliCloud.Vpc.GetTrafficMirrorFilterIngressRules.InvokeAsync(new AliCloud.Vpc.GetTrafficMirrorFilterIngressRulesArgs
        ///         {
        ///             TrafficMirrorFilterId = "example_traffic_mirror_filter_id",
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.VpcTrafficMirrorFilterIngressRuleId1 = ids.Apply(ids =&gt; ids.Rules?[0]?.Id);
        ///         var status = Output.Create(AliCloud.Vpc.GetTrafficMirrorFilterIngressRules.InvokeAsync(new AliCloud.Vpc.GetTrafficMirrorFilterIngressRulesArgs
        ///         {
        ///             TrafficMirrorFilterId = "example_traffic_mirror_filter_id",
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///             Status = "Created",
        ///         }));
        ///         this.VpcTrafficMirrorFilterIngressRuleId2 = status.Apply(status =&gt; status.Rules?[0]?.Id);
        ///     }
        /// 
        ///     [Output("vpcTrafficMirrorFilterIngressRuleId1")]
        ///     public Output&lt;string&gt; VpcTrafficMirrorFilterIngressRuleId1 { get; set; }
        ///     [Output("vpcTrafficMirrorFilterIngressRuleId2")]
        ///     public Output&lt;string&gt; VpcTrafficMirrorFilterIngressRuleId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetTrafficMirrorFilterIngressRulesResult> Invoke(GetTrafficMirrorFilterIngressRulesInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetTrafficMirrorFilterIngressRulesResult>("alicloud:vpc/getTrafficMirrorFilterIngressRules:getTrafficMirrorFilterIngressRules", args ?? new GetTrafficMirrorFilterIngressRulesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTrafficMirrorFilterIngressRulesArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Traffic Mirror Filter Ingress Rule IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource. Valid values:`Creating`, `Created`, `Modifying` and `Deleting`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// The ID of the filter associated with the inbound rule.
        /// </summary>
        [Input("trafficMirrorFilterId", required: true)]
        public string TrafficMirrorFilterId { get; set; } = null!;

        public GetTrafficMirrorFilterIngressRulesArgs()
        {
        }
    }

    public sealed class GetTrafficMirrorFilterIngressRulesInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Traffic Mirror Filter Ingress Rule IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource. Valid values:`Creating`, `Created`, `Modifying` and `Deleting`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the filter associated with the inbound rule.
        /// </summary>
        [Input("trafficMirrorFilterId", required: true)]
        public Input<string> TrafficMirrorFilterId { get; set; } = null!;

        public GetTrafficMirrorFilterIngressRulesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetTrafficMirrorFilterIngressRulesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetTrafficMirrorFilterIngressRulesRuleResult> Rules;
        public readonly string? Status;
        public readonly string TrafficMirrorFilterId;

        [OutputConstructor]
        private GetTrafficMirrorFilterIngressRulesResult(
            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetTrafficMirrorFilterIngressRulesRuleResult> rules,

            string? status,

            string trafficMirrorFilterId)
        {
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Rules = rules;
            Status = status;
            TrafficMirrorFilterId = trafficMirrorFilterId;
        }
    }
}
