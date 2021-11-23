// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr.Outputs
{

    [OutputType]
    public sealed class GetServerBackupPlansFilterResult
    {
        /// <summary>
        /// The key of the field to filter. Valid values: `planId`, `instanceId`, `planName`.
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// Set of values that are accepted for the given field.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetServerBackupPlansFilterResult(
            string? key,

            ImmutableArray<string> values)
        {
            Key = key;
            Values = values;
        }
    }
}
