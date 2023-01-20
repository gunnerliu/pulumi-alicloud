// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Inputs
{

    public sealed class ContainerGroupContainerLivenessProbeExecArgs : global::Pulumi.ResourceArgs
    {
        [Input("commands")]
        private InputList<string>? _commands;

        /// <summary>
        /// The commands run by the init container.
        /// </summary>
        public InputList<string> Commands
        {
            get => _commands ?? (_commands = new InputList<string>());
            set => _commands = value;
        }

        public ContainerGroupContainerLivenessProbeExecArgs()
        {
        }
        public static new ContainerGroupContainerLivenessProbeExecArgs Empty => new ContainerGroupContainerLivenessProbeExecArgs();
    }
}
