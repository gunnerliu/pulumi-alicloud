// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ebs.Outputs
{

    [OutputType]
    public sealed class EnterpriseSnapshotPolicySpecialRetainRules
    {
        /// <summary>
        /// Whether special reservations are enabled. Value range:
        /// - true
        /// - false.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// List of special retention rules. See `rules` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.EnterpriseSnapshotPolicySpecialRetainRulesRule> Rules;

        [OutputConstructor]
        private EnterpriseSnapshotPolicySpecialRetainRules(
            bool? enabled,

            ImmutableArray<Outputs.EnterpriseSnapshotPolicySpecialRetainRulesRule> rules)
        {
            Enabled = enabled;
            Rules = rules;
        }
    }
}