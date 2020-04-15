// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Log.Inputs
{

    public sealed class AlertQueryListArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// chart title
        /// </summary>
        [Input("chartTitle", required: true)]
        public Input<string> ChartTitle { get; set; } = null!;

        /// <summary>
        /// end time. example: 20s.
        /// </summary>
        [Input("end", required: true)]
        public Input<string> End { get; set; } = null!;

        /// <summary>
        /// Query logstore
        /// </summary>
        [Input("logstore", required: true)]
        public Input<string> Logstore { get; set; } = null!;

        /// <summary>
        /// query corresponding to chart. example: * AND aliyun.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        /// <summary>
        /// begin time. example: -60s.
        /// </summary>
        [Input("start", required: true)]
        public Input<string> Start { get; set; } = null!;

        /// <summary>
        /// default Custom. No need to configure this parameter.
        /// </summary>
        [Input("timeSpanType")]
        public Input<string>? TimeSpanType { get; set; }

        public AlertQueryListArgs()
        {
        }
    }
}
