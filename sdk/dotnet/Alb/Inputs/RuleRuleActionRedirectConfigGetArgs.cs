// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class RuleRuleActionRedirectConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The host name of the destination to which requests are redirected within ALB. Valid values:  The host name must be 3 to 128 characters in length, and can contain letters, digits, hyphens (-), periods (.), asterisks (*), and question marks (?). The host name must contain at least one period (.), and cannot start or end with a period (.). The rightmost domain label can contain only letters, asterisks (*) and question marks (?) and cannot contain digits or hyphens (-). Other domain labels cannot start or end with a hyphen (-). You can include asterisks (*) and question marks (?) anywhere in a domain label. Default value: ${host}. You cannot use this value with other characters at the same time.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// The redirect method. Valid values: `301`, `302`, `303`, `307`, and `308`.
        /// </summary>
        [Input("httpCode")]
        public Input<string>? HttpCode { get; set; }

        /// <summary>
        /// The path to which requests are to be redirected within ALB. Valid values: The path must be 1 to 128 characters in length, and start with a forward slash (/). The path can contain letters, digits, asterisks (*), question marks (?)and the following special characters: $ - _ . + / &amp; ~ @ :. It cannot contain the following special characters: " % # ; ! ( ) [ ] ^ , ”. The path is case-sensitive. Default value: ${path}. This value can be used only once. You can use it with a valid string.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The port of the destination to which requests are redirected. Valid values: 1 to 63335. Default value: ${port}. You cannot use this value together with other characters at the same time.
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        /// <summary>
        /// The protocol of the requests to be redirected. Valid values: `HTTP` and `HTTPS`. Default value: `${protocol}`. You cannot use this value together with other characters at the same time. Note HTTPS listeners can redirect only HTTPS requests.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// The query string of the request to be redirected within ALB. The query string must be 1 to 128 characters in length, can contain letters and printable characters. It cannot contain the following special characters: # [ ] { } \ | &lt; &gt; &amp;. Default value: ${query}. This value can be used only once. You can use it with a valid string.
        /// </summary>
        [Input("query")]
        public Input<string>? Query { get; set; }

        public RuleRuleActionRedirectConfigGetArgs()
        {
        }
        public static new RuleRuleActionRedirectConfigGetArgs Empty => new RuleRuleActionRedirectConfigGetArgs();
    }
}
