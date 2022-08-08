// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Outputs
{

    [OutputType]
    public sealed class HybridMonitorSlsTaskSlsProcessConfigFilter
    {
        /// <summary>
        /// The conditions that are used to filter logs imported from Log Service. See the following `Block filters`.
        /// </summary>
        public readonly ImmutableArray<Outputs.HybridMonitorSlsTaskSlsProcessConfigFilterFilter> Filters;
        /// <summary>
        /// The relationship between multiple filter conditions. Valid values: `and`(default value), `or`.
        /// </summary>
        public readonly string? Relation;

        [OutputConstructor]
        private HybridMonitorSlsTaskSlsProcessConfigFilter(
            ImmutableArray<Outputs.HybridMonitorSlsTaskSlsProcessConfigFilterFilter> filters,

            string? relation)
        {
            Filters = filters;
            Relation = relation;
        }
    }
}
