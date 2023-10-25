// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms
{
    public static class GetHybridMonitorDatas
    {
        /// <summary>
        /// This data source provides the Cms Hybrid Monitor Datas of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.177.0+.
        /// </summary>
        public static Task<GetHybridMonitorDatasResult> InvokeAsync(GetHybridMonitorDatasArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHybridMonitorDatasResult>("alicloud:cms/getHybridMonitorDatas:getHybridMonitorDatas", args ?? new GetHybridMonitorDatasArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cms Hybrid Monitor Datas of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.177.0+.
        /// </summary>
        public static Output<GetHybridMonitorDatasResult> Invoke(GetHybridMonitorDatasInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHybridMonitorDatasResult>("alicloud:cms/getHybridMonitorDatas:getHybridMonitorDatas", args ?? new GetHybridMonitorDatasInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHybridMonitorDatasArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The timestamp that specifies the end of the time range to query.
        /// </summary>
        [Input("end", required: true)]
        public string End { get; set; } = null!;

        /// <summary>
        /// The name of the namespace.
        /// </summary>
        [Input("namespace", required: true)]
        public string Namespace { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The interval at which monitoring data is collected. Unit: seconds.
        /// </summary>
        [Input("period")]
        public string? Period { get; set; }

        /// <summary>
        /// The name of the metric. Note PromQL statements are supported.
        /// </summary>
        [Input("promSql", required: true)]
        public string PromSql { get; set; } = null!;

        /// <summary>
        /// The timestamp that specifies the beginning of the time range to query.
        /// </summary>
        [Input("start", required: true)]
        public string Start { get; set; } = null!;

        public GetHybridMonitorDatasArgs()
        {
        }
        public static new GetHybridMonitorDatasArgs Empty => new GetHybridMonitorDatasArgs();
    }

    public sealed class GetHybridMonitorDatasInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The timestamp that specifies the end of the time range to query.
        /// </summary>
        [Input("end", required: true)]
        public Input<string> End { get; set; } = null!;

        /// <summary>
        /// The name of the namespace.
        /// </summary>
        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The interval at which monitoring data is collected. Unit: seconds.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        /// <summary>
        /// The name of the metric. Note PromQL statements are supported.
        /// </summary>
        [Input("promSql", required: true)]
        public Input<string> PromSql { get; set; } = null!;

        /// <summary>
        /// The timestamp that specifies the beginning of the time range to query.
        /// </summary>
        [Input("start", required: true)]
        public Input<string> Start { get; set; } = null!;

        public GetHybridMonitorDatasInvokeArgs()
        {
        }
        public static new GetHybridMonitorDatasInvokeArgs Empty => new GetHybridMonitorDatasInvokeArgs();
    }


    [OutputType]
    public sealed class GetHybridMonitorDatasResult
    {
        public readonly ImmutableArray<Outputs.GetHybridMonitorDatasDataResult> Datas;
        public readonly string End;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Namespace;
        public readonly string? OutputFile;
        public readonly string? Period;
        public readonly string PromSql;
        public readonly string Start;

        [OutputConstructor]
        private GetHybridMonitorDatasResult(
            ImmutableArray<Outputs.GetHybridMonitorDatasDataResult> datas,

            string end,

            string id,

            string @namespace,

            string? outputFile,

            string? period,

            string promSql,

            string start)
        {
            Datas = datas;
            End = end;
            Id = id;
            Namespace = @namespace;
            OutputFile = outputFile;
            Period = period;
            PromSql = promSql;
            Start = start;
        }
    }
}
