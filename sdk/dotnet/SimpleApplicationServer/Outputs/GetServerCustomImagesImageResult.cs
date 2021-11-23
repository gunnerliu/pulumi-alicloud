// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.SimpleApplicationServer.Outputs
{

    [OutputType]
    public sealed class GetServerCustomImagesImageResult
    {
        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        public readonly string CustomImageId;
        /// <summary>
        /// The name of the resource.
        /// </summary>
        public readonly string CustomImageName;
        /// <summary>
        /// Image description information.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the Custom Image.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The type of operating system used by the Mirror. Valid values: `Linux`, `Windows`.
        /// </summary>
        public readonly string Platform;

        [OutputConstructor]
        private GetServerCustomImagesImageResult(
            string customImageId,

            string customImageName,

            string description,

            string id,

            string platform)
        {
            CustomImageId = customImageId;
            CustomImageName = customImageName;
            Description = description;
            Id = id;
            Platform = platform;
        }
    }
}
