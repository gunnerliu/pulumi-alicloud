// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ddos
{
    public static partial class Invokes
    {
        /// <summary>
        /// This data source provides a list of BGP-Line Anti-DDoS Pro instances in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/ddoscoo_instances.html.markdown.
        /// </summary>
        public static Task<GetDdosCooInstancesResult> GetDdosCooInstances(GetDdosCooInstancesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDdosCooInstancesResult>("alicloud:ddos/getDdosCooInstances:getDdosCooInstances", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetDdosCooInstancesArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of instance IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by the instance name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetDdosCooInstancesArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetDdosCooInstancesResult
    {
        /// <summary>
        /// A list of instance IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// A list of apis. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDdosCooInstancesInstancesResult> Instances;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of instance names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetDdosCooInstancesResult(
            ImmutableArray<string> ids,
            ImmutableArray<Outputs.GetDdosCooInstancesInstancesResult> instances,
            string? nameRegex,
            ImmutableArray<string> names,
            string? outputFile,
            string id)
        {
            Ids = ids;
            Instances = instances;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetDdosCooInstancesInstancesResult
    {
        /// <summary>
        /// The instance's elastic defend bandwidth.
        /// </summary>
        public readonly int Bandwidth;
        /// <summary>
        /// The instance's base defend bandwidth.
        /// </summary>
        public readonly int BaseBandwidth;
        /// <summary>
        /// The instance's count of domain retransmission config.
        /// </summary>
        public readonly int DomainCount;
        /// <summary>
        /// The instance's id.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The instance's remark.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The instance's count of port retransmission config.
        /// </summary>
        public readonly int PortCount;
        /// <summary>
        /// The instance's business bandwidth.
        /// </summary>
        public readonly int ServiceBandwidth;

        [OutputConstructor]
        private GetDdosCooInstancesInstancesResult(
            int bandwidth,
            int baseBandwidth,
            int domainCount,
            string id,
            string name,
            int portCount,
            int serviceBandwidth)
        {
            Bandwidth = bandwidth;
            BaseBandwidth = baseBandwidth;
            DomainCount = domainCount;
            Id = id;
            Name = name;
            PortCount = portCount;
            ServiceBandwidth = serviceBandwidth;
        }
    }
    }
}