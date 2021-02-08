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
    public sealed class MonitorGroupInstancesInstance
    {
        /// <summary>
        /// The category of instance.
        /// </summary>
        public readonly string Category;
        /// <summary>
        /// The id of instance.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// The name of instance.
        /// </summary>
        public readonly string InstanceName;
        /// <summary>
        /// The region id of instance.
        /// </summary>
        public readonly string RegionId;

        [OutputConstructor]
        private MonitorGroupInstancesInstance(
            string category,

            string instanceId,

            string instanceName,

            string regionId)
        {
            Category = category;
            InstanceId = instanceId;
            InstanceName = instanceName;
            RegionId = regionId;
        }
    }
}
