// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ram.Inputs
{

    public sealed class GetPolicyDocumentStatementArgs : global::Pulumi.InvokeArgs
    {
        [Input("actions", required: true)]
        private List<string>? _actions;

        /// <summary>
        /// Action of the RAM policy document. If you want to create a RAM role policy document, it must be `["sts:AssumeRole"]`.
        /// </summary>
        public List<string> Actions
        {
            get => _actions ?? (_actions = new List<string>());
            set => _actions = value;
        }

        [Input("conditions")]
        private List<Inputs.GetPolicyDocumentStatementConditionArgs>? _conditions;

        /// <summary>
        /// Specifies the condition that are required for a policy to take effect. See the following `Block condition`.
        /// </summary>
        public List<Inputs.GetPolicyDocumentStatementConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new List<Inputs.GetPolicyDocumentStatementConditionArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// This parameter indicates whether or not the `action` is allowed. Valid values are `Allow` and `Deny`. Default value is `Allow`. If you want to create a RAM role policy document, it must be `Allow`.
        /// </summary>
        [Input("effect")]
        public string? Effect { get; set; }

        [Input("principals")]
        private List<Inputs.GetPolicyDocumentStatementPrincipalArgs>? _principals;

        /// <summary>
        /// Principal of the RAM policy document. If you want to create a RAM role policy document, it must be set. See the following `Block principal`.
        /// </summary>
        public List<Inputs.GetPolicyDocumentStatementPrincipalArgs> Principals
        {
            get => _principals ?? (_principals = new List<Inputs.GetPolicyDocumentStatementPrincipalArgs>());
            set => _principals = value;
        }

        [Input("resources")]
        private List<string>? _resources;

        /// <summary>
        /// List of specific objects which will be authorized. If you want to create a RAM policy document, it must be set.
        /// </summary>
        public List<string> Resources
        {
            get => _resources ?? (_resources = new List<string>());
            set => _resources = value;
        }

        public GetPolicyDocumentStatementArgs()
        {
        }
        public static new GetPolicyDocumentStatementArgs Empty => new GetPolicyDocumentStatementArgs();
    }
}
