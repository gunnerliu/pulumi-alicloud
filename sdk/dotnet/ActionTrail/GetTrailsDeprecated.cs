// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ActionTrail
{
    [Obsolete(@"DataSource has been renamed to `getTrails`")]
    public static class GetTrailsDeprecated
    {
        public static Task<GetTrailsDeprecatedResult> InvokeAsync(GetTrailsDeprecatedArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetTrailsDeprecatedResult>("alicloud:actiontrail/getTrailsDeprecated:getTrailsDeprecated", args ?? new GetTrailsDeprecatedArgs(), options.WithDefaults());

        public static Output<GetTrailsDeprecatedResult> Invoke(GetTrailsDeprecatedInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetTrailsDeprecatedResult>("alicloud:actiontrail/getTrailsDeprecated:getTrailsDeprecated", args ?? new GetTrailsDeprecatedInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTrailsDeprecatedArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("includeOrganizationTrail")]
        public bool? IncludeOrganizationTrail { get; set; }

        [Input("includeShadowTrails")]
        public bool? IncludeShadowTrails { get; set; }

        /// <summary>
        /// A regex string to filter results action trail name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("status")]
        public string? Status { get; set; }

        public GetTrailsDeprecatedArgs()
        {
        }
    }

    public sealed class GetTrailsDeprecatedInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("includeOrganizationTrail")]
        public Input<bool>? IncludeOrganizationTrail { get; set; }

        [Input("includeShadowTrails")]
        public Input<bool>? IncludeShadowTrails { get; set; }

        /// <summary>
        /// A regex string to filter results action trail name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetTrailsDeprecatedInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetTrailsDeprecatedResult
    {
        /// <summary>
        /// A list of actiontrails. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTrailsDeprecatedActiontrailResult> Actiontrails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly bool? IncludeOrganizationTrail;
        public readonly bool? IncludeShadowTrails;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of trail names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? Status;
        public readonly ImmutableArray<Outputs.GetTrailsDeprecatedTrailResult> Trails;

        [OutputConstructor]
        private GetTrailsDeprecatedResult(
            ImmutableArray<Outputs.GetTrailsDeprecatedActiontrailResult> actiontrails,

            string id,

            ImmutableArray<string> ids,

            bool? includeOrganizationTrail,

            bool? includeShadowTrails,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? status,

            ImmutableArray<Outputs.GetTrailsDeprecatedTrailResult> trails)
        {
            Actiontrails = actiontrails;
            Id = id;
            Ids = ids;
            IncludeOrganizationTrail = includeOrganizationTrail;
            IncludeShadowTrails = includeShadowTrails;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Status = status;
            Trails = trails;
        }
    }
}
