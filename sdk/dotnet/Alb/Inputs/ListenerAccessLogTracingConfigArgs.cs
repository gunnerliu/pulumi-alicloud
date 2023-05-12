// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class ListenerAccessLogTracingConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Xtrace Function. Value: `True` Or `False` . Default Value: `False`.
        /// 
        /// &gt; **NOTE:** Only Instances outside the Security Group to Access the Log Switch `accesslogenabled` Open, in Order to Set This Parameter to the `True`.
        /// </summary>
        [Input("tracingEnabled")]
        public Input<bool>? TracingEnabled { get; set; }

        /// <summary>
        /// Xtrace Sampling Rate. Value: `1` to `10000`.
        /// 
        /// &gt; **NOTE:** This attribute is valid when `tracingenabled` is `true`.
        /// </summary>
        [Input("tracingSample")]
        public Input<int>? TracingSample { get; set; }

        /// <summary>
        /// Xtrace Type Value Is `Zipkin`.
        /// 
        /// &gt; **NOTE:** This attribute is valid when `tracingenabled` is `true`.
        /// </summary>
        [Input("tracingType")]
        public Input<string>? TracingType { get; set; }

        public ListenerAccessLogTracingConfigArgs()
        {
        }
        public static new ListenerAccessLogTracingConfigArgs Empty => new ListenerAccessLogTracingConfigArgs();
    }
}
