// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga.Outputs
{

    [OutputType]
    public sealed class ForwardingRuleRuleConditionHostConfig
    {
        /// <summary>
        /// The domain name is 3-128 characters long, which can contain letters, numbers, dashes (-) and width period (.), and supports the use of asterisk (*) and width question mark (?) as wildcard characters.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private ForwardingRuleRuleConditionHostConfig(ImmutableArray<string> values)
        {
            Values = values;
        }
    }
}
