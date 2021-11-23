// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Log.Inputs
{

    public sealed class StoreEncryptConfUserCmkInfoGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// role arn.
        /// </summary>
        [Input("arn", required: true)]
        public Input<string> Arn { get; set; } = null!;

        /// <summary>
        /// User master key id.
        /// </summary>
        [Input("cmkKeyId", required: true)]
        public Input<string> CmkKeyId { get; set; } = null!;

        /// <summary>
        /// Region id where the  user master key id is located.
        /// </summary>
        [Input("regionId", required: true)]
        public Input<string> RegionId { get; set; } = null!;

        public StoreEncryptConfUserCmkInfoGetArgs()
        {
        }
    }
}
