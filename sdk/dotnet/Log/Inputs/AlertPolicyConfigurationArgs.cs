// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Log.Inputs
{

    public sealed class AlertPolicyConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Action Policy Id.
        /// </summary>
        [Input("actionPolicyId")]
        public Input<string>? ActionPolicyId { get; set; }

        /// <summary>
        /// Alert Policy Id.
        /// </summary>
        [Input("alertPolicyId", required: true)]
        public Input<string> AlertPolicyId { get; set; } = null!;

        /// <summary>
        /// Repeat interval used by alert policy, 1h, 1m.e.g.
        /// </summary>
        [Input("repeatInterval", required: true)]
        public Input<string> RepeatInterval { get; set; } = null!;

        public AlertPolicyConfigurationArgs()
        {
        }
        public static new AlertPolicyConfigurationArgs Empty => new AlertPolicyConfigurationArgs();
    }
}
