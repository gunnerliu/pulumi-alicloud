// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns.Inputs
{

    public sealed class MonitorConfigIspCityNodeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The code of the city node to monitor.
        /// </summary>
        [Input("cityCode", required: true)]
        public Input<string> CityCode { get; set; } = null!;

        /// <summary>
        /// The code of the Internet provider service (ISP) node to monitor.
        /// </summary>
        [Input("ispCode", required: true)]
        public Input<string> IspCode { get; set; } = null!;

        public MonitorConfigIspCityNodeGetArgs()
        {
        }
        public static new MonitorConfigIspCityNodeGetArgs Empty => new MonitorConfigIspCityNodeGetArgs();
    }
}
