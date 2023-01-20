// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Outputs
{

    [OutputType]
    public sealed class RuleRuleConditionHeaderConfig
    {
        /// <summary>
        /// The key of the header field. The key must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-) and underscores (_). The key does not support Cookie or Host.
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// The value of the header field. The value must be 1 to 128 characters in length, and can contain lowercase letters, printable ASCII characters whose values are ch &gt;= 32 &amp;&amp; ch &lt; 127, asterisks (*), and question marks (?). The value cannot start or end with a space.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private RuleRuleConditionHeaderConfig(
            string? key,

            ImmutableArray<string> values)
        {
            Key = key;
            Values = values;
        }
    }
}
