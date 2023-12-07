// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class RuleRuleConditionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configuration of the cookie. See See `cookie_config` below.
        /// </summary>
        [Input("cookieConfig")]
        public Input<Inputs.RuleRuleConditionCookieConfigGetArgs>? CookieConfig { get; set; }

        /// <summary>
        /// The configuration of the header field. See `header_config` below.
        /// </summary>
        [Input("headerConfig")]
        public Input<Inputs.RuleRuleConditionHeaderConfigGetArgs>? HeaderConfig { get; set; }

        /// <summary>
        /// The configuration of the host field. See `host_config` below.
        /// </summary>
        [Input("hostConfig")]
        public Input<Inputs.RuleRuleConditionHostConfigGetArgs>? HostConfig { get; set; }

        /// <summary>
        /// The configuration of the request method. See `method_config` below.
        /// </summary>
        [Input("methodConfig")]
        public Input<Inputs.RuleRuleConditionMethodConfigGetArgs>? MethodConfig { get; set; }

        /// <summary>
        /// The configuration of the path for the request to be forwarded. See `path_config` below.
        /// </summary>
        [Input("pathConfig")]
        public Input<Inputs.RuleRuleConditionPathConfigGetArgs>? PathConfig { get; set; }

        /// <summary>
        /// The configuration of the query string. See `query_string_config` below.
        /// </summary>
        [Input("queryStringConfig")]
        public Input<Inputs.RuleRuleConditionQueryStringConfigGetArgs>? QueryStringConfig { get; set; }

        /// <summary>
        /// The configuration of the header field. See `response_header_config` below.
        /// </summary>
        [Input("responseHeaderConfig")]
        public Input<Inputs.RuleRuleConditionResponseHeaderConfigGetArgs>? ResponseHeaderConfig { get; set; }

        /// <summary>
        /// The configuration of the header field. See `response_status_code_config` below.
        /// </summary>
        [Input("responseStatusCodeConfig")]
        public Input<Inputs.RuleRuleConditionResponseStatusCodeConfigGetArgs>? ResponseStatusCodeConfig { get; set; }

        /// <summary>
        /// The Based on source IP traffic matching. Required and valid when Type is SourceIP. See `source_ip_config` below.
        /// </summary>
        [Input("sourceIpConfig")]
        public Input<Inputs.RuleRuleConditionSourceIpConfigGetArgs>? SourceIpConfig { get; set; }

        /// <summary>
        /// The type of the forwarding rule. Valid values:
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public RuleRuleConditionGetArgs()
        {
        }
        public static new RuleRuleConditionGetArgs Empty => new RuleRuleConditionGetArgs();
    }
}
