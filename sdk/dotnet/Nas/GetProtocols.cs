// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nas
{
    public static class GetProtocols
    {
        /// <summary>
        /// Provide  a data source to retrieve the type of protocol used to create NAS file system.
        /// 
        /// &gt; **NOTE:** Available in 1.42.0
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var @default = Output.Create(AliCloud.Nas.GetProtocols.InvokeAsync(new AliCloud.Nas.GetProtocolsArgs
        ///         {
        ///             OutputFile = "protocols.txt",
        ///             Type = "Performance",
        ///             ZoneId = "cn-beijing-e",
        ///         }));
        ///         this.NasProtocolsProtocol = @default.Apply(@default =&gt; @default.Protocols[0]);
        ///     }
        /// 
        ///     [Output("nasProtocolsProtocol")]
        ///     public Output&lt;string&gt; NasProtocolsProtocol { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetProtocolsResult> InvokeAsync(GetProtocolsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetProtocolsResult>("alicloud:nas/getProtocols:getProtocols", args ?? new GetProtocolsArgs(), options.WithVersion());
    }


    public sealed class GetProtocolsArgs : Pulumi.InvokeArgs
    {
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The file system type. Valid Values: `Performance` and `Capacity`.
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        /// <summary>
        /// String to filter results by zone id.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetProtocolsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetProtocolsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of supported protocol type..
        /// </summary>
        public readonly ImmutableArray<string> Protocols;
        public readonly string Type;
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetProtocolsResult(
            string id,

            string? outputFile,

            ImmutableArray<string> protocols,

            string type,

            string? zoneId)
        {
            Id = id;
            OutputFile = outputFile;
            Protocols = protocols;
            Type = type;
            ZoneId = zoneId;
        }
    }
}
