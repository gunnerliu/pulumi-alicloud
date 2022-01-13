// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ros.Inputs
{

    public sealed class TemplateScratchSourceTagGetArgs : Pulumi.ResourceArgs
    {
        [Input("resourceTags", required: true)]
        private InputMap<object>? _resourceTags;

        /// <summary>
        /// Source label. **NOTE:** A maximum of 10 source labels can be configured.
        /// </summary>
        public InputMap<object> ResourceTags
        {
            get => _resourceTags ?? (_resourceTags = new InputMap<object>());
            set => _resourceTags = value;
        }

        [Input("resourceTypeFilters")]
        private InputList<string>? _resourceTypeFilters;

        /// <summary>
        /// Source resource type filter list. If the resource type list is specified, it means to scan the resources of the specified resource type and in the specified resource group; Otherwise, it means to scan all resources in the specified resource group. **NOTE:** A maximum of `20` resource type filter can be configured.
        /// </summary>
        public InputList<string> ResourceTypeFilters
        {
            get => _resourceTypeFilters ?? (_resourceTypeFilters = new InputList<string>());
            set => _resourceTypeFilters = value;
        }

        public TemplateScratchSourceTagGetArgs()
        {
        }
    }
}
