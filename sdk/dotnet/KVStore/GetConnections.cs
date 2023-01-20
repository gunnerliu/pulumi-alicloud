// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.KVStore
{
    public static class GetConnections
    {
        /// <summary>
        /// This data source can query the public IP of the specified KVStore DBInstance.
        ///  
        /// &gt; **NOTE:** Available in v1.101.0+.
        /// </summary>
        public static Task<GetConnectionsResult> InvokeAsync(GetConnectionsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConnectionsResult>("alicloud:kvstore/getConnections:getConnections", args ?? new GetConnectionsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can query the public IP of the specified KVStore DBInstance.
        ///  
        /// &gt; **NOTE:** Available in v1.101.0+.
        /// </summary>
        public static Output<GetConnectionsResult> Invoke(GetConnectionsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConnectionsResult>("alicloud:kvstore/getConnections:getConnections", args ?? new GetConnectionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConnectionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A list of KVStore DBInstance ids, only support one item.
        /// </summary>
        [Input("ids", required: true)]
        public string Ids { get; set; } = null!;

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetConnectionsArgs()
        {
        }
        public static new GetConnectionsArgs Empty => new GetConnectionsArgs();
    }

    public sealed class GetConnectionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A list of KVStore DBInstance ids, only support one item.
        /// </summary>
        [Input("ids", required: true)]
        public Input<string> Ids { get; set; } = null!;

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetConnectionsInvokeArgs()
        {
        }
        public static new GetConnectionsInvokeArgs Empty => new GetConnectionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetConnectionsResult
    {
        /// <summary>
        /// Public network details of the specified resource. contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionsConnectionResult> Connections;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of KVStore DBInstance ids.
        /// </summary>
        public readonly string Ids;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetConnectionsResult(
            ImmutableArray<Outputs.GetConnectionsConnectionResult> connections,

            string id,

            string ids,

            string? outputFile)
        {
            Connections = connections;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
        }
    }
}
