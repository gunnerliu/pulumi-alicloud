// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CR.Inputs
{

    public sealed class ChainChainConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("nodes")]
        private InputList<Inputs.ChainChainConfigNodeGetArgs>? _nodes;

        /// <summary>
        /// Each node in the delivery chain.
        /// </summary>
        public InputList<Inputs.ChainChainConfigNodeGetArgs> Nodes
        {
            get => _nodes ?? (_nodes = new InputList<Inputs.ChainChainConfigNodeGetArgs>());
            set => _nodes = value;
        }

        [Input("routers")]
        private InputList<Inputs.ChainChainConfigRouterGetArgs>? _routers;

        /// <summary>
        /// Execution sequence relationship between delivery chain nodes.
        /// </summary>
        public InputList<Inputs.ChainChainConfigRouterGetArgs> Routers
        {
            get => _routers ?? (_routers = new InputList<Inputs.ChainChainConfigRouterGetArgs>());
            set => _routers = value;
        }

        public ChainChainConfigGetArgs()
        {
        }
    }
}
