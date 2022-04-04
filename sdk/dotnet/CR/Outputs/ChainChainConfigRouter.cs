// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CR.Outputs
{

    [OutputType]
    public sealed class ChainChainConfigRouter
    {
        /// <summary>
        /// Source node.
        /// </summary>
        public readonly ImmutableArray<Outputs.ChainChainConfigRouterFrom> Froms;
        /// <summary>
        /// Destination node.
        /// </summary>
        public readonly ImmutableArray<Outputs.ChainChainConfigRouterTo> Tos;

        [OutputConstructor]
        private ChainChainConfigRouter(
            ImmutableArray<Outputs.ChainChainConfigRouterFrom> froms,

            ImmutableArray<Outputs.ChainChainConfigRouterTo> tos)
        {
            Froms = froms;
            Tos = tos;
        }
    }
}
