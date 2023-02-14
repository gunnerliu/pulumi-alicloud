// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds.Outputs
{

    [OutputType]
    public sealed class RdsDbProxyReadOnlyInstanceWeight
    {
        /// <summary>
        /// The Id of instance that can run database.
        /// </summary>
        public readonly string InstanceId;
        public readonly string Weight;

        [OutputConstructor]
        private RdsDbProxyReadOnlyInstanceWeight(
            string instanceId,

            string weight)
        {
            InstanceId = instanceId;
            Weight = weight;
        }
    }
}