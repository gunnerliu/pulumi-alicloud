// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess
{
    public static class GetScalingConfigurations
    {
        /// <summary>
        /// This data source provides available scaling configuration resources. 
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetScalingConfigurationsResult> InvokeAsync(GetScalingConfigurationsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetScalingConfigurationsResult>("alicloud:ess/getScalingConfigurations:getScalingConfigurations", args ?? new GetScalingConfigurationsArgs(), options.WithVersion());
    }


    public sealed class GetScalingConfigurationsArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of scaling configuration IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter resulting scaling configurations by name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Scaling group id the scaling configurations belong to.
        /// </summary>
        [Input("scalingGroupId")]
        public string? ScalingGroupId { get; set; }

        public GetScalingConfigurationsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetScalingConfigurationsResult
    {
        /// <summary>
        /// A list of scaling rules. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetScalingConfigurationsConfigurationResult> Configurations;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of scaling configuration ids.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of scaling configuration names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// ID of the scaling group.
        /// </summary>
        public readonly string? ScalingGroupId;

        [OutputConstructor]
        private GetScalingConfigurationsResult(
            ImmutableArray<Outputs.GetScalingConfigurationsConfigurationResult> configurations,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? scalingGroupId)
        {
            Configurations = configurations;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ScalingGroupId = scalingGroupId;
        }
    }
}
