// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Inputs
{

    public sealed class EventRuleWebhookParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The HTTP request method.
        /// </summary>
        [Input("method")]
        public Input<string>? Method { get; set; }

        /// <summary>
        /// The name of the protocol.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// The callback URL.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// The ID of the recipient that receives alert notifications.
        /// </summary>
        [Input("webhookParametersId")]
        public Input<string>? WebhookParametersId { get; set; }

        public EventRuleWebhookParameterArgs()
        {
        }
        public static new EventRuleWebhookParameterArgs Empty => new EventRuleWebhookParameterArgs();
    }
}