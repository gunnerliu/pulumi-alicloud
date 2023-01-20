// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetInstanceKeywords
    {
        /// <summary>
        /// Operation to query the reserved keywords of an ApsaraDB RDS instance. The reserved keywords cannot be used for the usernames of accounts or the names of databases.
        /// 
        /// &gt; **NOTE:** Available in v1.196.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var resources = AliCloud.Ecs.GetInstanceKeywords.Invoke(new()
        ///     {
        ///         Key = "account",
        ///         OutputFile = "./classes.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["accountKeywords"] = resources.Apply(getInstanceKeywordsResult =&gt; getInstanceKeywordsResult.Keywords[0]),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInstanceKeywordsResult> InvokeAsync(GetInstanceKeywordsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceKeywordsResult>("alicloud:ecs/getInstanceKeywords:getInstanceKeywords", args ?? new GetInstanceKeywordsArgs(), options.WithDefaults());

        /// <summary>
        /// Operation to query the reserved keywords of an ApsaraDB RDS instance. The reserved keywords cannot be used for the usernames of accounts or the names of databases.
        /// 
        /// &gt; **NOTE:** Available in v1.196.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var resources = AliCloud.Ecs.GetInstanceKeywords.Invoke(new()
        ///     {
        ///         Key = "account",
        ///         OutputFile = "./classes.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["accountKeywords"] = resources.Apply(getInstanceKeywordsResult =&gt; getInstanceKeywordsResult.Keywords[0]),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetInstanceKeywordsResult> Invoke(GetInstanceKeywordsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceKeywordsResult>("alicloud:ecs/getInstanceKeywords:getInstanceKeywords", args ?? new GetInstanceKeywordsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceKeywordsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The type of reserved keyword to query. Valid values: `account`, `database`.
        /// </summary>
        [Input("key", required: true)]
        public string Key { get; set; } = null!;

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetInstanceKeywordsArgs()
        {
        }
        public static new GetInstanceKeywordsArgs Empty => new GetInstanceKeywordsArgs();
    }

    public sealed class GetInstanceKeywordsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The type of reserved keyword to query. Valid values: `account`, `database`.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetInstanceKeywordsInvokeArgs()
        {
        }
        public static new GetInstanceKeywordsInvokeArgs Empty => new GetInstanceKeywordsInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceKeywordsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of keywords.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string Key;
        /// <summary>
        /// An array that consists of reserved keywords.
        /// </summary>
        public readonly ImmutableArray<string> Keywords;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetInstanceKeywordsResult(
            string id,

            ImmutableArray<string> ids,

            string key,

            ImmutableArray<string> keywords,

            string? outputFile)
        {
            Id = id;
            Ids = ids;
            Key = key;
            Keywords = keywords;
            OutputFile = outputFile;
        }
    }
}
