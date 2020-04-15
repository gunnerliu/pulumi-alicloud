// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Outputs
{

    [OutputType]
    public sealed class GetInstanceTypesInstanceTypeLocalStorageResult
    {
        /// <summary>
        /// The number of local storage devices that an instance has been attached to.
        /// </summary>
        public readonly string Amount;
        /// <summary>
        /// The capacity of a local storage in GB.
        /// </summary>
        public readonly string Capacity;
        /// <summary>
        /// The category of local storage that an instance has been attached to.
        /// </summary>
        public readonly string Category;

        [OutputConstructor]
        private GetInstanceTypesInstanceTypeLocalStorageResult(
            string amount,

            string capacity,

            string category)
        {
            Amount = amount;
            Capacity = capacity;
            Category = category;
        }
    }
}
