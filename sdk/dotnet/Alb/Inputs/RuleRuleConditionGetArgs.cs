// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class RuleRuleConditionGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configuration of the cookie. See the following `Block cookie_config`.
        /// </summary>
        [Input("cookieConfig")]
        public Input<Inputs.RuleRuleConditionCookieConfigGetArgs>? CookieConfig { get; set; }

        /// <summary>
        /// The configuration of the header field. See the following `Block header_config`.
        /// </summary>
        [Input("headerConfig")]
        public Input<Inputs.RuleRuleConditionHeaderConfigGetArgs>? HeaderConfig { get; set; }

        /// <summary>
        /// The configuration of the host field. See the following `Block host_config`.
        /// </summary>
        [Input("hostConfig")]
        public Input<Inputs.RuleRuleConditionHostConfigGetArgs>? HostConfig { get; set; }

        /// <summary>
        /// The configuration of the request method. See the following `Block method_config`.
        /// </summary>
        [Input("methodConfig")]
        public Input<Inputs.RuleRuleConditionMethodConfigGetArgs>? MethodConfig { get; set; }

        /// <summary>
        /// The configuration of the path for the request to be forwarded. See the following `Block path_config`.
        /// </summary>
        [Input("pathConfig")]
        public Input<Inputs.RuleRuleConditionPathConfigGetArgs>? PathConfig { get; set; }

        /// <summary>
        /// The configuration of the query string. See the following `Block query_string_config`.
        /// </summary>
        [Input("queryStringConfig")]
        public Input<Inputs.RuleRuleConditionQueryStringConfigGetArgs>? QueryStringConfig { get; set; }

        /// <summary>
        /// The action. Valid values: `ForwardGroup`, `Redirect`, `FixedResponse`, `Rewrite`, `InsertHeader`. **Note:**  The preceding actions can be classified into two types:  `FinalType`: A forwarding rule can contain only one `FinalType` action, which is executed last. This type of action can contain only one `ForwardGroup`, `Redirect` or `FixedResponse` action. `ExtType`: A forwarding rule can contain one or more `ExtType` actions, which are executed before `FinalType` actions and need to coexist with the `FinalType` actions. This type of action can contain multiple `InsertHeader` actions or one `Rewrite` action.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public RuleRuleConditionGetArgs()
        {
        }
    }
}