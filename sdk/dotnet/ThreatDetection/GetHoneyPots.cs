// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ThreatDetection
{
    public static class GetHoneyPots
    {
        /// <summary>
        /// This data source provides Threat Detection Honey Pot available to the user.[What is Honey Pot](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypot)
        /// 
        /// &gt; **NOTE:** Available since v1.195.0.
        /// </summary>
        public static Task<GetHoneyPotsResult> InvokeAsync(GetHoneyPotsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHoneyPotsResult>("alicloud:threatdetection/getHoneyPots:getHoneyPots", args ?? new GetHoneyPotsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Threat Detection Honey Pot available to the user.[What is Honey Pot](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypot)
        /// 
        /// &gt; **NOTE:** Available since v1.195.0.
        /// </summary>
        public static Output<GetHoneyPotsResult> Invoke(GetHoneyPotsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHoneyPotsResult>("alicloud:threatdetection/getHoneyPots:getHoneyPots", args ?? new GetHoneyPotsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHoneyPotsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Honeypot ID.
        /// </summary>
        [Input("honeypotId")]
        public string? HoneypotId { get; set; }

        /// <summary>
        /// Honeypot custom name.
        /// </summary>
        [Input("honeypotName")]
        public string? HoneypotName { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Honey Pot IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by honey pot name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// The ID of the honeypot management node.
        /// </summary>
        [Input("nodeId")]
        public string? NodeId { get; set; }

        /// <summary>
        /// The name of the honeypot management node.
        /// </summary>
        [Input("nodeName")]
        public string? NodeName { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetHoneyPotsArgs()
        {
        }
        public static new GetHoneyPotsArgs Empty => new GetHoneyPotsArgs();
    }

    public sealed class GetHoneyPotsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Honeypot ID.
        /// </summary>
        [Input("honeypotId")]
        public Input<string>? HoneypotId { get; set; }

        /// <summary>
        /// Honeypot custom name.
        /// </summary>
        [Input("honeypotName")]
        public Input<string>? HoneypotName { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Honey Pot IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by honey pot name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// The ID of the honeypot management node.
        /// </summary>
        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        /// <summary>
        /// The name of the honeypot management node.
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetHoneyPotsInvokeArgs()
        {
        }
        public static new GetHoneyPotsInvokeArgs Empty => new GetHoneyPotsInvokeArgs();
    }


    [OutputType]
    public sealed class GetHoneyPotsResult
    {
        /// <summary>
        /// Honeypot ID.
        /// </summary>
        public readonly string? HoneypotId;
        /// <summary>
        /// Honeypot custom name.
        /// </summary>
        public readonly string? HoneypotName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Honey Pot IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// The ID of the honeypot management node.
        /// </summary>
        public readonly string? NodeId;
        public readonly string? NodeName;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of Honey Pot Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHoneyPotsPotResult> Pots;

        [OutputConstructor]
        private GetHoneyPotsResult(
            string? honeypotId,

            string? honeypotName,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            string? nodeId,

            string? nodeName,

            string? outputFile,

            ImmutableArray<Outputs.GetHoneyPotsPotResult> pots)
        {
            HoneypotId = honeypotId;
            HoneypotName = honeypotName;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            NodeId = nodeId;
            NodeName = nodeName;
            OutputFile = outputFile;
            Pots = pots;
        }
    }
}
