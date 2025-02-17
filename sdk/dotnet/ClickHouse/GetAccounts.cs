// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ClickHouse
{
    public static class GetAccounts
    {
        /// <summary>
        /// This data source provides the Click House Accounts of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "testaccountname";
        ///     var pwd = config.Get("pwd") ?? "Tf-testpwd";
        ///     var defaultDbCluster = new AliCloud.ClickHouse.DbCluster("defaultDbCluster", new()
        ///     {
        ///         DbClusterVersion = "20.3.10.75",
        ///         Category = "Basic",
        ///         DbClusterClass = "S8",
        ///         DbClusterNetworkType = "vpc",
        ///         DbClusterDescription = name,
        ///         DbNodeGroupCount = 1,
        ///         PaymentType = "PayAsYouGo",
        ///         DbNodeStorage = "500",
        ///         StorageType = "cloud_essd",
        ///         VswitchId = "your_vswitch_id",
        ///     });
        /// 
        ///     var defaultAccount = new AliCloud.ClickHouse.Account("defaultAccount", new()
        ///     {
        ///         DbClusterId = defaultDbCluster.Id,
        ///         AccountDescription = "your_description",
        ///         AccountName = name,
        ///         AccountPassword = pwd,
        ///     });
        /// 
        ///     var defaultAccounts = AliCloud.ClickHouse.GetAccounts.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultAccount.Id,
        ///         },
        ///         DbClusterId = defaultDbCluster.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["accountId"] = defaultAccounts.Apply(getAccountsResult =&gt; getAccountsResult.Ids[0]),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAccountsResult> InvokeAsync(GetAccountsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountsResult>("alicloud:clickhouse/getAccounts:getAccounts", args ?? new GetAccountsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Click House Accounts of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "testaccountname";
        ///     var pwd = config.Get("pwd") ?? "Tf-testpwd";
        ///     var defaultDbCluster = new AliCloud.ClickHouse.DbCluster("defaultDbCluster", new()
        ///     {
        ///         DbClusterVersion = "20.3.10.75",
        ///         Category = "Basic",
        ///         DbClusterClass = "S8",
        ///         DbClusterNetworkType = "vpc",
        ///         DbClusterDescription = name,
        ///         DbNodeGroupCount = 1,
        ///         PaymentType = "PayAsYouGo",
        ///         DbNodeStorage = "500",
        ///         StorageType = "cloud_essd",
        ///         VswitchId = "your_vswitch_id",
        ///     });
        /// 
        ///     var defaultAccount = new AliCloud.ClickHouse.Account("defaultAccount", new()
        ///     {
        ///         DbClusterId = defaultDbCluster.Id,
        ///         AccountDescription = "your_description",
        ///         AccountName = name,
        ///         AccountPassword = pwd,
        ///     });
        /// 
        ///     var defaultAccounts = AliCloud.ClickHouse.GetAccounts.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultAccount.Id,
        ///         },
        ///         DbClusterId = defaultDbCluster.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["accountId"] = defaultAccounts.Apply(getAccountsResult =&gt; getAccountsResult.Ids[0]),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAccountsResult> Invoke(GetAccountsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountsResult>("alicloud:clickhouse/getAccounts:getAccounts", args ?? new GetAccountsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccountsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The DBCluster id.
        /// </summary>
        [Input("dbClusterId", required: true)]
        public string DbClusterId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Account IDs. Its element value is same as Account Name.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Account name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetAccountsArgs()
        {
        }
        public static new GetAccountsArgs Empty => new GetAccountsArgs();
    }

    public sealed class GetAccountsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The DBCluster id.
        /// </summary>
        [Input("dbClusterId", required: true)]
        public Input<string> DbClusterId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Account IDs. Its element value is same as Account Name.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Account name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetAccountsInvokeArgs()
        {
        }
        public static new GetAccountsInvokeArgs Empty => new GetAccountsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccountsResult
    {
        public readonly ImmutableArray<Outputs.GetAccountsAccountResult> Accounts;
        public readonly string DbClusterId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? Status;

        [OutputConstructor]
        private GetAccountsResult(
            ImmutableArray<Outputs.GetAccountsAccountResult> accounts,

            string dbClusterId,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? status)
        {
            Accounts = accounts;
            DbClusterId = dbClusterId;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
