// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ros.Inputs
{

    public sealed class TemplateScratchSourceResourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Source Resource.
        /// </summary>
        [Input("resourceId", required: true)]
        public Input<string> ResourceId { get; set; } = null!;

        /// <summary>
        /// The type of the Source resource.
        /// </summary>
        [Input("resourceType", required: true)]
        public Input<string> ResourceType { get; set; } = null!;

        public TemplateScratchSourceResourceArgs()
        {
        }
        public static new TemplateScratchSourceResourceArgs Empty => new TemplateScratchSourceResourceArgs();
    }
}
