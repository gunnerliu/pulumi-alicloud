// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class RuleRuleActionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configuration of the fixed response. See the following `Block fixed_response_config`.
        /// </summary>
        [Input("fixedResponseConfig")]
        public Input<Inputs.RuleRuleActionFixedResponseConfigArgs>? FixedResponseConfig { get; set; }

        /// <summary>
        /// The forward response action within ALB. See the following `Block forward_group_config`.
        /// </summary>
        [Input("forwardGroupConfig")]
        public Input<Inputs.RuleRuleActionForwardGroupConfigArgs>? ForwardGroupConfig { get; set; }

        /// <summary>
        /// The configuration of the inserted header field. See the following `Block insert_header_config`.
        /// </summary>
        [Input("insertHeaderConfig")]
        public Input<Inputs.RuleRuleActionInsertHeaderConfigArgs>? InsertHeaderConfig { get; set; }

        /// <summary>
        /// The order of the forwarding rule actions. Valid values: 1 to 50000. The actions are performed in ascending order. You cannot leave this parameter empty. Each value must be unique.
        /// </summary>
        [Input("order", required: true)]
        public Input<int> Order { get; set; } = null!;

        /// <summary>
        /// The configuration of the external redirect action. See the following `Block redirect_config`.
        /// </summary>
        [Input("redirectConfig")]
        public Input<Inputs.RuleRuleActionRedirectConfigArgs>? RedirectConfig { get; set; }

        /// <summary>
        /// The redirect action within ALB. See the following `Block rewrite_config`.
        /// </summary>
        [Input("rewriteConfig")]
        public Input<Inputs.RuleRuleActionRewriteConfigArgs>? RewriteConfig { get; set; }

        /// <summary>
        /// The action. Valid values: `ForwardGroup`, `Redirect`, `FixedResponse`, `Rewrite`, `InsertHeader`. **Note:**  The preceding actions can be classified into two types:  `FinalType`: A forwarding rule can contain only one `FinalType` action, which is executed last. This type of action can contain only one `ForwardGroup`, `Redirect` or `FixedResponse` action. `ExtType`: A forwarding rule can contain one or more `ExtType` actions, which are executed before `FinalType` actions and need to coexist with the `FinalType` actions. This type of action can contain multiple `InsertHeader` actions or one `Rewrite` action.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public RuleRuleActionArgs()
        {
        }
    }
}
