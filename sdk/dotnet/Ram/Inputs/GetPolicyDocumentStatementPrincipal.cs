// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ram.Inputs
{

    public sealed class GetPolicyDocumentStatementPrincipalArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The trusted entity. Valid values: `RAM`, `Service` and `Federated`.
        /// </summary>
        [Input("entity", required: true)]
        public string Entity { get; set; } = null!;

        [Input("identifiers", required: true)]
        private List<string>? _identifiers;

        /// <summary>
        /// The identifiers of the principal.
        /// </summary>
        public List<string> Identifiers
        {
            get => _identifiers ?? (_identifiers = new List<string>());
            set => _identifiers = value;
        }

        public GetPolicyDocumentStatementPrincipalArgs()
        {
        }
        public static new GetPolicyDocumentStatementPrincipalArgs Empty => new GetPolicyDocumentStatementPrincipalArgs();
    }
}
