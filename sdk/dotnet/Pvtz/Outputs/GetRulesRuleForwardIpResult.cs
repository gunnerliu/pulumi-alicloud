// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Pvtz.Outputs
{

    [OutputType]
    public sealed class GetRulesRuleForwardIpResult
    {
        public readonly string Ip;
        public readonly int Port;

        [OutputConstructor]
        private GetRulesRuleForwardIpResult(
            string ip,

            int port)
        {
            Ip = ip;
            Port = port;
        }
    }
}
