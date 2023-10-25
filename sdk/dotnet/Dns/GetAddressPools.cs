// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns
{
    public static class GetAddressPools
    {
        /// <summary>
        /// This data source provides the Alidns Address Pools of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.152.0+.
        /// </summary>
        public static Task<GetAddressPoolsResult> InvokeAsync(GetAddressPoolsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAddressPoolsResult>("alicloud:dns/getAddressPools:getAddressPools", args ?? new GetAddressPoolsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Alidns Address Pools of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.152.0+.
        /// </summary>
        public static Output<GetAddressPoolsResult> Invoke(GetAddressPoolsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAddressPoolsResult>("alicloud:dns/getAddressPools:getAddressPools", args ?? new GetAddressPoolsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAddressPoolsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Address Pool IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The id of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Address Pool name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetAddressPoolsArgs()
        {
        }
        public static new GetAddressPoolsArgs Empty => new GetAddressPoolsArgs();
    }

    public sealed class GetAddressPoolsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Address Pool IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The id of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Address Pool name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetAddressPoolsInvokeArgs()
        {
        }
        public static new GetAddressPoolsInvokeArgs Empty => new GetAddressPoolsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAddressPoolsResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string InstanceId;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetAddressPoolsPoolResult> Pools;

        [OutputConstructor]
        private GetAddressPoolsResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string instanceId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetAddressPoolsPoolResult> pools)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Pools = pools;
        }
    }
}
