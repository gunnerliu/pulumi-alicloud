// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Inputs
{

    public sealed class HybridMonitorSlsTaskSlsProcessConfigStatisticGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
        /// </summary>
        [Input("alias")]
        public Input<string>? Alias { get; set; }

        /// <summary>
        /// The function that is used to aggregate log data within a statistical period. Valid values: `count`, `sum`, `avg`, `max`, `min`, `value`, `countps`, `sumps`, `distinct`, `distribution`, `percentile`.
        /// </summary>
        [Input("function")]
        public Input<string>? Function { get; set; }

        /// <summary>
        /// The value of the function that is used to aggregate logs imported from Log Service.
        /// - If you set the `function` parameter to `distribution`, this parameter specifies the lower limit of the statistical interval. For example, if you want to calculate the number of HTTP requests whose status code is 2XX, set this parameter to 200.
        /// - If you set the `function` parameter to `percentile`, this parameter specifies the percentile at which the expected value is. For example, 0.5 specifies P50.
        /// </summary>
        [Input("parameterOne")]
        public Input<string>? ParameterOne { get; set; }

        /// <summary>
        /// The value of the function that is used to aggregate logs imported from Log Service. **Note:** This parameter is required only if the `function` parameter is set to `distribution`. This parameter specifies the upper limit of the statistical interval.
        /// </summary>
        [Input("parameterTwo")]
        public Input<string>? ParameterTwo { get; set; }

        /// <summary>
        /// The name of the key that is used to filter logs imported from Log Service.
        /// </summary>
        [Input("slsKeyName")]
        public Input<string>? SlsKeyName { get; set; }

        public HybridMonitorSlsTaskSlsProcessConfigStatisticGetArgs()
        {
        }
        public static new HybridMonitorSlsTaskSlsProcessConfigStatisticGetArgs Empty => new HybridMonitorSlsTaskSlsProcessConfigStatisticGetArgs();
    }
}
