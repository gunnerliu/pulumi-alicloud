// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.AliCloud.Ens
{
    public static class GetKeyPairs
    {
        /// <summary>
        /// This data source provides the Ens Key Pairs of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.133.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var nameRegex = Output.Create(AliCloud.Ens.GetKeyPairs.InvokeAsync(new AliCloud.Ens.GetKeyPairsArgs
        ///         {
        ///             Version = "example_value",
        ///             NameRegex = "^my-KeyPair",
        ///         }));
        ///         this.EnsKeyPairId1 = nameRegex.Apply(nameRegex =&gt; nameRegex.Pairs?[0]?.Id);
        ///     }
        /// 
        ///     [Output("ensKeyPairId1")]
        ///     public Output&lt;string&gt; EnsKeyPairId1 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetKeyPairsResult> InvokeAsync(GetKeyPairsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetKeyPairsResult>("alicloud:ens/getKeyPairs:getKeyPairs", args ?? new GetKeyPairsArgs(), options.WithVersion());

        /// <summary>
        /// This data source provides the Ens Key Pairs of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.133.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var nameRegex = Output.Create(AliCloud.Ens.GetKeyPairs.InvokeAsync(new AliCloud.Ens.GetKeyPairsArgs
        ///         {
        ///             Version = "example_value",
        ///             NameRegex = "^my-KeyPair",
        ///         }));
        ///         this.EnsKeyPairId1 = nameRegex.Apply(nameRegex =&gt; nameRegex.Pairs?[0]?.Id);
        ///     }
        /// 
        ///     [Output("ensKeyPairId1")]
        ///     public Output&lt;string&gt; EnsKeyPairId1 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetKeyPairsResult> Invoke(GetKeyPairsInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetKeyPairsResult>("alicloud:ens/getKeyPairs:getKeyPairs", args ?? new GetKeyPairsInvokeArgs(), options.WithVersion());
    }


    public sealed class GetKeyPairsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the key pair.
        /// </summary>
        [Input("keyPairName")]
        public string? KeyPairName { get; set; }

        /// <summary>
        /// A regex string to filter results by Key Pair name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The version number.
        /// </summary>
        [Input("version", required: true)]
        public string Version { get; set; } = null!;

        public GetKeyPairsArgs()
        {
        }
    }

    public sealed class GetKeyPairsInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the key pair.
        /// </summary>
        [Input("keyPairName")]
        public Input<string>? KeyPairName { get; set; }

        /// <summary>
        /// A regex string to filter results by Key Pair name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The version number.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public GetKeyPairsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetKeyPairsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? KeyPairName;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetKeyPairsPairResult> Pairs;
        public readonly string Version;

        [OutputConstructor]
        private GetKeyPairsResult(
            string id,

            ImmutableArray<string> ids,

            string? keyPairName,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetKeyPairsPairResult> pairs,

            string version)
        {
            Id = id;
            Ids = ids;
            KeyPairName = keyPairName;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Pairs = pairs;
            Version = version;
        }
    }
}