// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudMonitor.Inputs
{

    public sealed class ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Alibaba Cloud Resource Name (ARN) of the resource.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The parameters of the alert callback. Specify the parameters in the JSON format.
        /// </summary>
        [Input("jsonParams")]
        public Input<string>? JsonParams { get; set; }

        /// <summary>
        /// The alert level. Valid values: `CRITICAL`, `WARN`, `INFO`.
        /// </summary>
        [Input("level")]
        public Input<string>? Level { get; set; }

        /// <summary>
        /// The ID of the resource for which alerts are triggered.
        /// </summary>
        [Input("targetListId")]
        public Input<string>? TargetListId { get; set; }

        public ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs()
        {
        }
        public static new ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs Empty => new ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs();
    }
}
