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
    public sealed class GetRulesRuleRuleConditionMethodConfigResult
    {
        /// <summary>
        /// The path of the request to be forwarded. The path must be 1 to 128 characters in length and must start with a forward slash (/). The path can contain letters, digits, and the following special characters: $ - _ . + / &amp; ~ @ :. It cannot contain the following special characters: " % # ; ! ( ) [ ] ^ , ". The value is case-sensitive, and can contain asterisks (*) and question marks (?).
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetRulesRuleRuleConditionMethodConfigResult(ImmutableArray<string> values)
        {
            Values = values;
        }
    }
}
