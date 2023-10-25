// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Pvtz
{
    public static class GetZoneRecords
    {
        /// <summary>
        /// This data source provides Private Zone Records resource information owned by an Alibaba Cloud account.
        /// </summary>
        public static Task<GetZoneRecordsResult> InvokeAsync(GetZoneRecordsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZoneRecordsResult>("alicloud:pvtz/getZoneRecords:getZoneRecords", args ?? new GetZoneRecordsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Private Zone Records resource information owned by an Alibaba Cloud account.
        /// </summary>
        public static Output<GetZoneRecordsResult> Invoke(GetZoneRecordsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZoneRecordsResult>("alicloud:pvtz/getZoneRecords:getZoneRecords", args ?? new GetZoneRecordsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZoneRecordsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Private Zone Record IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Keyword for record rr and value.
        /// </summary>
        [Input("keyword")]
        public string? Keyword { get; set; }

        /// <summary>
        /// User language.
        /// </summary>
        [Input("lang")]
        public string? Lang { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Search mode. Value: 
        /// - LIKE: fuzzy search.
        /// - EXACT: precise search. It is not filled in by default.
        /// </summary>
        [Input("searchMode")]
        public string? SearchMode { get; set; }

        /// <summary>
        /// Resolve record status. Value:
        /// - ENABLE: enable resolution.
        /// - DISABLE: pause parsing.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// It is not filled in by default, and queries the current zone resolution records. Fill in "ecs" to query the host name record list under the VPC associated with the current zone.
        /// </summary>
        [Input("tag")]
        public string? Tag { get; set; }

        /// <summary>
        /// User ip.
        /// </summary>
        [Input("userClientIp")]
        public string? UserClientIp { get; set; }

        /// <summary>
        /// ID of the Private Zone.
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetZoneRecordsArgs()
        {
        }
        public static new GetZoneRecordsArgs Empty => new GetZoneRecordsArgs();
    }

    public sealed class GetZoneRecordsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Private Zone Record IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Keyword for record rr and value.
        /// </summary>
        [Input("keyword")]
        public Input<string>? Keyword { get; set; }

        /// <summary>
        /// User language.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// Search mode. Value: 
        /// - LIKE: fuzzy search.
        /// - EXACT: precise search. It is not filled in by default.
        /// </summary>
        [Input("searchMode")]
        public Input<string>? SearchMode { get; set; }

        /// <summary>
        /// Resolve record status. Value:
        /// - ENABLE: enable resolution.
        /// - DISABLE: pause parsing.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// It is not filled in by default, and queries the current zone resolution records. Fill in "ecs" to query the host name record list under the VPC associated with the current zone.
        /// </summary>
        [Input("tag")]
        public Input<string>? Tag { get; set; }

        /// <summary>
        /// User ip.
        /// </summary>
        [Input("userClientIp")]
        public Input<string>? UserClientIp { get; set; }

        /// <summary>
        /// ID of the Private Zone.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetZoneRecordsInvokeArgs()
        {
        }
        public static new GetZoneRecordsInvokeArgs Empty => new GetZoneRecordsInvokeArgs();
    }


    [OutputType]
    public sealed class GetZoneRecordsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Private Zone Record IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? Keyword;
        public readonly string? Lang;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of zone records. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetZoneRecordsRecordResult> Records;
        public readonly string? SearchMode;
        /// <summary>
        /// Status of the Private Zone Record.
        /// </summary>
        public readonly string? Status;
        public readonly string? Tag;
        public readonly string? UserClientIp;
        public readonly string ZoneId;

        [OutputConstructor]
        private GetZoneRecordsResult(
            string id,

            ImmutableArray<string> ids,

            string? keyword,

            string? lang,

            string? outputFile,

            ImmutableArray<Outputs.GetZoneRecordsRecordResult> records,

            string? searchMode,

            string? status,

            string? tag,

            string? userClientIp,

            string zoneId)
        {
            Id = id;
            Ids = ids;
            Keyword = keyword;
            Lang = lang;
            OutputFile = outputFile;
            Records = records;
            SearchMode = searchMode;
            Status = status;
            Tag = tag;
            UserClientIp = userClientIp;
            ZoneId = zoneId;
        }
    }
}
