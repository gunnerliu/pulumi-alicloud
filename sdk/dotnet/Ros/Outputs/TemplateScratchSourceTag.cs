// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ros.Outputs
{

    [OutputType]
    public sealed class TemplateScratchSourceTag
    {
        /// <summary>
        /// Source label. **NOTE:** A maximum of 10 source labels can be configured.
        /// </summary>
        public readonly ImmutableDictionary<string, object> ResourceTags;
        /// <summary>
        /// Source resource type filter list. If the resource type list is specified, it means to scan the resources of the specified resource type and in the specified resource group; Otherwise, it means to scan all resources in the specified resource group. **NOTE:** A maximum of `20` resource type filter can be configured.
        /// </summary>
        public readonly ImmutableArray<string> ResourceTypeFilters;

        [OutputConstructor]
        private TemplateScratchSourceTag(
            ImmutableDictionary<string, object> resourceTags,

            ImmutableArray<string> resourceTypeFilters)
        {
            ResourceTags = resourceTags;
            ResourceTypeFilters = resourceTypeFilters;
        }
    }
}
