// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emr.Inputs
{

    public sealed class ClusterMetaStoreConfGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Custom rds database password.
        /// </summary>
        [Input("dbPassword", required: true)]
        public Input<string> DbPassword { get; set; } = null!;

        /// <summary>
        /// Custom rds database connection url.
        /// </summary>
        [Input("dbUrl", required: true)]
        public Input<string> DbUrl { get; set; } = null!;

        /// <summary>
        /// Custom rds database user name.
        /// </summary>
        [Input("dbUserName", required: true)]
        public Input<string> DbUserName { get; set; } = null!;

        public ClusterMetaStoreConfGetArgs()
        {
        }
    }
}
