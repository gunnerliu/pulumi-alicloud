// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Inputs
{

    public sealed class AlarmEscalationsInfoArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Critical level alarm comparison operator. Valid values: ["&lt;=", "&lt;", "&gt;", "&gt;=", "==", "!="]. Default to "==".
        /// </summary>
        [Input("comparisonOperator")]
        public Input<string>? ComparisonOperator { get; set; }

        /// <summary>
        /// It has been deprecated from provider version 1.94.0 and 'escalations_critical.statistics' instead.
        /// </summary>
        [Input("statistics")]
        public Input<string>? Statistics { get; set; }

        /// <summary>
        /// It has been deprecated from provider version 1.94.0 and 'escalations_critical.threshold' instead.
        /// </summary>
        [Input("threshold")]
        public Input<string>? Threshold { get; set; }

        /// <summary>
        /// Critical level alarm retry times. Default to 3.
        /// </summary>
        [Input("times")]
        public Input<int>? Times { get; set; }

        public AlarmEscalationsInfoArgs()
        {
        }
        public static new AlarmEscalationsInfoArgs Empty => new AlarmEscalationsInfoArgs();
    }
}
