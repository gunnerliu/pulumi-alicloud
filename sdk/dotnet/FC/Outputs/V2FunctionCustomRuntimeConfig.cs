// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Outputs
{

    [OutputType]
    public sealed class V2FunctionCustomRuntimeConfig
    {
        /// <summary>
        /// Parameters received by the start entry command.
        /// </summary>
        public readonly ImmutableArray<string> Args;
        /// <summary>
        /// List of Custom entry commands started by Custom Runtime. When there are multiple commands in the list, they are spliced in sequence.
        /// </summary>
        public readonly ImmutableArray<string> Commands;

        [OutputConstructor]
        private V2FunctionCustomRuntimeConfig(
            ImmutableArray<string> args,

            ImmutableArray<string> commands)
        {
            Args = args;
            Commands = commands;
        }
    }
}