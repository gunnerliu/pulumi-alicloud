// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Inputs
{

    public sealed class SiteMonitorIspCityGetArgs : Pulumi.ResourceArgs
    {
        [Input("city", required: true)]
        public Input<string> City { get; set; } = null!;

        [Input("isp", required: true)]
        public Input<string> Isp { get; set; } = null!;

        public SiteMonitorIspCityGetArgs()
        {
        }
    }
}
