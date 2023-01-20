// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Imp.Inputs
{

    public sealed class AppTemplateConfigListGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration item key. Valid values: ["config.appCallbackAuthKey","config.appCallbackUrl","config.callbackClass.live","config.callbackClass.user","config.livePullDomain","config.livePushDomain","config.multipleClientsLogin","config.regionId","config.streamChangeCallbackUrl"].
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Configuration item content.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public AppTemplateConfigListGetArgs()
        {
        }
        public static new AppTemplateConfigListGetArgs Empty => new AppTemplateConfigListGetArgs();
    }
}
