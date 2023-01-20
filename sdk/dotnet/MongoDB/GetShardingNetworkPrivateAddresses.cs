// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MongoDB
{
    public static class GetShardingNetworkPrivateAddresses
    {
        /// <summary>
        /// This data source provides the Mongodb Sharding Network Private Addresses of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.157.0+.
        /// </summary>
        public static Task<GetShardingNetworkPrivateAddressesResult> InvokeAsync(GetShardingNetworkPrivateAddressesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetShardingNetworkPrivateAddressesResult>("alicloud:mongodb/getShardingNetworkPrivateAddresses:getShardingNetworkPrivateAddresses", args ?? new GetShardingNetworkPrivateAddressesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Mongodb Sharding Network Private Addresses of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.157.0+.
        /// </summary>
        public static Output<GetShardingNetworkPrivateAddressesResult> Invoke(GetShardingNetworkPrivateAddressesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetShardingNetworkPrivateAddressesResult>("alicloud:mongodb/getShardingNetworkPrivateAddresses:getShardingNetworkPrivateAddresses", args ?? new GetShardingNetworkPrivateAddressesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetShardingNetworkPrivateAddressesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The db instance id.
        /// </summary>
        [Input("dbInstanceId", required: true)]
        public string DbInstanceId { get; set; } = null!;

        /// <summary>
        /// The ID of the `mongos`, `shard`, or `Configserver` node in the sharded cluster instance.
        /// </summary>
        [Input("nodeId")]
        public string? NodeId { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The role of the node.
        /// </summary>
        [Input("role")]
        public string? Role { get; set; }

        public GetShardingNetworkPrivateAddressesArgs()
        {
        }
        public static new GetShardingNetworkPrivateAddressesArgs Empty => new GetShardingNetworkPrivateAddressesArgs();
    }

    public sealed class GetShardingNetworkPrivateAddressesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The db instance id.
        /// </summary>
        [Input("dbInstanceId", required: true)]
        public Input<string> DbInstanceId { get; set; } = null!;

        /// <summary>
        /// The ID of the `mongos`, `shard`, or `Configserver` node in the sharded cluster instance.
        /// </summary>
        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The role of the node.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public GetShardingNetworkPrivateAddressesInvokeArgs()
        {
        }
        public static new GetShardingNetworkPrivateAddressesInvokeArgs Empty => new GetShardingNetworkPrivateAddressesInvokeArgs();
    }


    [OutputType]
    public sealed class GetShardingNetworkPrivateAddressesResult
    {
        public readonly ImmutableArray<Outputs.GetShardingNetworkPrivateAddressesAddressResult> Addresses;
        public readonly string DbInstanceId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? NodeId;
        public readonly string? OutputFile;
        public readonly string? Role;

        [OutputConstructor]
        private GetShardingNetworkPrivateAddressesResult(
            ImmutableArray<Outputs.GetShardingNetworkPrivateAddressesAddressResult> addresses,

            string dbInstanceId,

            string id,

            string? nodeId,

            string? outputFile,

            string? role)
        {
            Addresses = addresses;
            DbInstanceId = dbInstanceId;
            Id = id;
            NodeId = nodeId;
            OutputFile = outputFile;
            Role = role;
        }
    }
}
