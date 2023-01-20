// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ehpc.Inputs
{

    public sealed class ClusterPostInstallScriptArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The parameter that is used to run the script after the cluster is created.
        /// </summary>
        [Input("args")]
        public Input<string>? Args { get; set; }

        /// <summary>
        /// The URL that is used to download the script after the cluster is created.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public ClusterPostInstallScriptArgs()
        {
        }
        public static new ClusterPostInstallScriptArgs Empty => new ClusterPostInstallScriptArgs();
    }
}
