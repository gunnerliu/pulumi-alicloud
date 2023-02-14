// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceCatalog.Inputs
{

    public sealed class ProvisionedProductParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the parameter defined in the template.
        /// </summary>
        [Input("parameterKey")]
        public Input<string>? ParameterKey { get; set; }

        /// <summary>
        /// The Template parameter value entered by the user.
        /// </summary>
        [Input("parameterValue")]
        public Input<string>? ParameterValue { get; set; }

        public ProvisionedProductParameterArgs()
        {
        }
        public static new ProvisionedProductParameterArgs Empty => new ProvisionedProductParameterArgs();
    }
}