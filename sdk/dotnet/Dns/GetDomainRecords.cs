// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns
{
    public static partial class Invokes
    {
        /// <summary>
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/dns_domain_records.html.markdown.
        /// </summary>
        public static Task<GetDomainRecordsResult> GetDomainRecords(GetDomainRecordsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDomainRecordsResult>("alicloud:dns/getDomainRecords:getDomainRecords", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetDomainRecordsArgs : Pulumi.InvokeArgs
    {
        [Input("domainName", required: true)]
        public string DomainName { get; set; } = null!;

        [Input("hostRecordRegex")]
        public string? HostRecordRegex { get; set; }

        [Input("ids")]
        private List<string>? _ids;
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("isLocked")]
        public bool? IsLocked { get; set; }

        [Input("line")]
        public string? Line { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("status")]
        public string? Status { get; set; }

        [Input("type")]
        public string? Type { get; set; }

        [Input("valueRegex")]
        public string? ValueRegex { get; set; }

        public GetDomainRecordsArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetDomainRecordsResult
    {
        public readonly string DomainName;
        public readonly string? HostRecordRegex;
        public readonly ImmutableArray<string> Ids;
        public readonly bool? IsLocked;
        public readonly string? Line;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetDomainRecordsRecordsResult> Records;
        public readonly string? Status;
        public readonly string? Type;
        public readonly ImmutableArray<string> Urls;
        public readonly string? ValueRegex;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetDomainRecordsResult(
            string domainName,
            string? hostRecordRegex,
            ImmutableArray<string> ids,
            bool? isLocked,
            string? line,
            string? outputFile,
            ImmutableArray<Outputs.GetDomainRecordsRecordsResult> records,
            string? status,
            string? type,
            ImmutableArray<string> urls,
            string? valueRegex,
            string id)
        {
            DomainName = domainName;
            HostRecordRegex = hostRecordRegex;
            Ids = ids;
            IsLocked = isLocked;
            Line = line;
            OutputFile = outputFile;
            Records = records;
            Status = status;
            Type = type;
            Urls = urls;
            ValueRegex = valueRegex;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetDomainRecordsRecordsResult
    {
        public readonly string DomainName;
        public readonly string HostRecord;
        public readonly string Line;
        public readonly bool Locked;
        public readonly int Priority;
        public readonly string RecordId;
        public readonly string Status;
        public readonly double Ttl;
        public readonly string Type;
        public readonly string Value;

        [OutputConstructor]
        private GetDomainRecordsRecordsResult(
            string domainName,
            string hostRecord,
            string line,
            bool locked,
            int priority,
            string recordId,
            string status,
            double ttl,
            string type,
            string value)
        {
            DomainName = domainName;
            HostRecord = hostRecord;
            Line = line;
            Locked = locked;
            Priority = priority;
            RecordId = recordId;
            Status = status;
            Ttl = ttl;
            Type = type;
            Value = value;
        }
    }
    }
}