// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dcdn.Inputs
{

    public sealed class ErEnvConfPresetCanaryLiaoningArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedHosts")]
        private InputList<string>? _allowedHosts;

        /// <summary>
        /// Allowed DCDN domain names.
        /// </summary>
        public InputList<string> AllowedHosts
        {
            get => _allowedHosts ?? (_allowedHosts = new InputList<string>());
            set => _allowedHosts = value;
        }

        /// <summary>
        /// The version number of the code.
        /// </summary>
        [Input("codeRev")]
        public Input<string>? CodeRev { get; set; }

        /// <summary>
        /// The specification of the CPU time slice. Valid values: `5ms`, `50ms`, `100ms`.
        /// </summary>
        [Input("specName")]
        public Input<string>? SpecName { get; set; }

        public ErEnvConfPresetCanaryLiaoningArgs()
        {
        }
        public static new ErEnvConfPresetCanaryLiaoningArgs Empty => new ErEnvConfPresetCanaryLiaoningArgs();
    }
}
