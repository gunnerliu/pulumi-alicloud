// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emr
{
    public static class GetInstanceTypes
    {
        /// <summary>
        /// The `alicloud.emr.getInstanceTypes` data source provides a collection of ecs
        /// instance types available in Alibaba Cloud account when create a emr cluster.
        /// 
        /// &gt; **NOTE:** Available in 1.59.0+
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInstanceTypesResult> InvokeAsync(GetInstanceTypesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetInstanceTypesResult>("alicloud:emr/getInstanceTypes:getInstanceTypes", args ?? new GetInstanceTypesArgs(), options.WithVersion());
    }


    public sealed class GetInstanceTypesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cluster type of the emr cluster instance. Possible values: `HADOOP`, `KAFKA`, `ZOOKEEPER`, `DRUID`.
        /// </summary>
        [Input("clusterType", required: true)]
        public string ClusterType { get; set; } = null!;

        /// <summary>
        /// The destination resource of emr cluster instance
        /// </summary>
        [Input("destinationResource", required: true)]
        public string DestinationResource { get; set; } = null!;

        /// <summary>
        /// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
        /// </summary>
        [Input("instanceChargeType", required: true)]
        public string InstanceChargeType { get; set; } = null!;

        /// <summary>
        /// Filter the specific ecs instance type to create emr cluster.
        /// </summary>
        [Input("instanceType")]
        public string? InstanceType { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Whether the current storage disk is local or not.
        /// </summary>
        [Input("supportLocalStorage")]
        public bool? SupportLocalStorage { get; set; }

        [Input("supportNodeTypes")]
        private List<string>? _supportNodeTypes;

        /// <summary>
        /// The specific supported node type list.
        /// Possible values may be any one or combination of these: ["MASTER", "CORE", "TASK", "GATEWAY"]
        /// </summary>
        public List<string> SupportNodeTypes
        {
            get => _supportNodeTypes ?? (_supportNodeTypes = new List<string>());
            set => _supportNodeTypes = value;
        }

        /// <summary>
        /// The supported resources of specific zoneId.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetInstanceTypesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetInstanceTypesResult
    {
        public readonly string ClusterType;
        public readonly string DestinationResource;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of emr instance types IDs. 
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string InstanceChargeType;
        public readonly string? InstanceType;
        public readonly string? OutputFile;
        public readonly bool? SupportLocalStorage;
        public readonly ImmutableArray<string> SupportNodeTypes;
        /// <summary>
        /// A list of emr instance types. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceTypesTypeResult> Types;
        /// <summary>
        /// The available zone id in Alibaba Cloud account
        /// </summary>
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetInstanceTypesResult(
            string clusterType,

            string destinationResource,

            string id,

            ImmutableArray<string> ids,

            string instanceChargeType,

            string? instanceType,

            string? outputFile,

            bool? supportLocalStorage,

            ImmutableArray<string> supportNodeTypes,

            ImmutableArray<Outputs.GetInstanceTypesTypeResult> types,

            string? zoneId)
        {
            ClusterType = clusterType;
            DestinationResource = destinationResource;
            Id = id;
            Ids = ids;
            InstanceChargeType = instanceChargeType;
            InstanceType = instanceType;
            OutputFile = outputFile;
            SupportLocalStorage = supportLocalStorage;
            SupportNodeTypes = supportNodeTypes;
            Types = types;
            ZoneId = zoneId;
        }
    }
}
