// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ApiGateway.Inputs
{

    public sealed class ApiConstantParameterArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of Constant parameter.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// System parameter location; values: 'HEAD' and 'QUERY'.
        /// </summary>
        [Input("in", required: true)]
        public Input<string> In { get; set; } = null!;

        /// <summary>
        /// System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Constant parameter value.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public ApiConstantParameterArgs()
        {
        }
    }
}
