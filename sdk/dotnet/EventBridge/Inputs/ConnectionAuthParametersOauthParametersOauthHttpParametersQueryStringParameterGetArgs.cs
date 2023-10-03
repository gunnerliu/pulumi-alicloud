// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.EventBridge.Inputs
{

    public sealed class ConnectionAuthParametersOauthParametersOauthHttpParametersQueryStringParameterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to enable authentication.
        /// </summary>
        [Input("isValueSecret")]
        public Input<string>? IsValueSecret { get; set; }

        /// <summary>
        /// The key of the request path.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The key of the request path.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ConnectionAuthParametersOauthParametersOauthHttpParametersQueryStringParameterGetArgs()
        {
        }
        public static new ConnectionAuthParametersOauthParametersOauthHttpParametersQueryStringParameterGetArgs Empty => new ConnectionAuthParametersOauthParametersOauthHttpParametersQueryStringParameterGetArgs();
    }
}
