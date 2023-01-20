// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess
{
    public static class GetAlarms
    {
        /// <summary>
        /// This data source provides available alarm resources. 
        /// 
        /// &gt; **NOTE** Available in 1.72.0+
        /// </summary>
        public static Task<GetAlarmsResult> InvokeAsync(GetAlarmsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAlarmsResult>("alicloud:ess/getAlarms:getAlarms", args ?? new GetAlarmsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides available alarm resources. 
        /// 
        /// &gt; **NOTE** Available in 1.72.0+
        /// </summary>
        public static Output<GetAlarmsResult> Invoke(GetAlarmsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAlarmsResult>("alicloud:ess/getAlarms:getAlarms", args ?? new GetAlarmsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAlarmsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of alarm IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The type for the alarm's associated metric. Supported value: system, custom. "system" means the metric data is collected by Aliyun Cloud Monitor Service(CMS), "custom" means the metric data is upload to CMS by users. Defaults to system.
        /// </summary>
        [Input("metricType")]
        public string? MetricType { get; set; }

        /// <summary>
        /// A regex string to filter resulting alarms by name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Scaling group id the alarms belong to.
        /// </summary>
        [Input("scalingGroupId")]
        public string? ScalingGroupId { get; set; }

        public GetAlarmsArgs()
        {
        }
        public static new GetAlarmsArgs Empty => new GetAlarmsArgs();
    }

    public sealed class GetAlarmsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of alarm IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The type for the alarm's associated metric. Supported value: system, custom. "system" means the metric data is collected by Aliyun Cloud Monitor Service(CMS), "custom" means the metric data is upload to CMS by users. Defaults to system.
        /// </summary>
        [Input("metricType")]
        public Input<string>? MetricType { get; set; }

        /// <summary>
        /// A regex string to filter resulting alarms by name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// Scaling group id the alarms belong to.
        /// </summary>
        [Input("scalingGroupId")]
        public Input<string>? ScalingGroupId { get; set; }

        public GetAlarmsInvokeArgs()
        {
        }
        public static new GetAlarmsInvokeArgs Empty => new GetAlarmsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAlarmsResult
    {
        /// <summary>
        /// A list of alarms. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAlarmsAlarmResult> Alarms;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of alarm ids.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// The type for the alarm's associated metric.
        /// </summary>
        public readonly string? MetricType;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of alarm names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The scaling group associated with this alarm.
        /// </summary>
        public readonly string? ScalingGroupId;

        [OutputConstructor]
        private GetAlarmsResult(
            ImmutableArray<Outputs.GetAlarmsAlarmResult> alarms,

            string id,

            ImmutableArray<string> ids,

            string? metricType,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? scalingGroupId)
        {
            Alarms = alarms;
            Id = id;
            Ids = ids;
            MetricType = metricType;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ScalingGroupId = scalingGroupId;
        }
    }
}
