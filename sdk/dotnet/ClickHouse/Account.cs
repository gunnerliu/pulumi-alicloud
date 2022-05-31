// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ClickHouse
{
    /// <summary>
    /// Provides a Click House Account resource.
    /// 
    /// For information about Click House Account and how to use it, see [What is Account](https://www.alibabacloud.com/product/clickhouse).
    /// 
    /// &gt; **NOTE:** Available in v1.134.0+.
    /// 
    /// ## Example Usage
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
    ///         var config = new Config();
    ///         var name = config.Get("name") ?? "testaccountname";
    ///         var pwd = config.Get("pwd") ?? "Tf-testpwd";
    ///         var defaultRegions = Output.Create(AliCloud.ClickHouse.GetRegions.InvokeAsync(new AliCloud.ClickHouse.GetRegionsArgs
    ///         {
    ///             Current = true,
    ///         }));
    ///         var defaultNetworks = Output.Create(AliCloud.Vpc.GetNetworks.InvokeAsync(new AliCloud.Vpc.GetNetworksArgs
    ///         {
    ///             NameRegex = "default-NODELETING",
    ///         }));
    ///         var defaultSwitches = Output.Tuple(defaultNetworks, defaultRegions).Apply(values =&gt;
    ///         {
    ///             var defaultNetworks = values.Item1;
    ///             var defaultRegions = values.Item2;
    ///             return Output.Create(AliCloud.Vpc.GetSwitches.InvokeAsync(new AliCloud.Vpc.GetSwitchesArgs
    ///             {
    ///                 VpcId = defaultNetworks.Ids?[0],
    ///                 ZoneId = defaultRegions.Regions?[0]?.ZoneIds?[0]?.ZoneId,
    ///             }));
    ///         });
    ///         var defaultDbCluster = new AliCloud.ClickHouse.DbCluster("defaultDbCluster", new AliCloud.ClickHouse.DbClusterArgs
    ///         {
    ///             DbClusterVersion = "20.3.10.75",
    ///             Category = "Basic",
    ///             DbClusterClass = "S8",
    ///             DbClusterNetworkType = "vpc",
    ///             DbClusterDescription = name,
    ///             DbNodeGroupCount = 1,
    ///             PaymentType = "PayAsYouGo",
    ///             DbNodeStorage = "500",
    ///             StorageType = "cloud_essd",
    ///             VswitchId = defaultSwitches.Apply(defaultSwitches =&gt; defaultSwitches.Vswitches?[0]?.Id),
    ///         });
    ///         var defaultAccount = new AliCloud.ClickHouse.Account("defaultAccount", new AliCloud.ClickHouse.AccountArgs
    ///         {
    ///             DbClusterId = defaultDbCluster.Id,
    ///             AccountDescription = "your_description",
    ///             AccountName = name,
    ///             AccountPassword = pwd,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Click House Account can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:clickhouse/account:Account example &lt;db_cluster_id&gt;:&lt;account_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:clickhouse/account:Account")]
    public partial class Account : Pulumi.CustomResource
    {
        /// <summary>
        /// In Chinese, English letter. May contain Chinese and English characters, lowercase letters, numbers, and underscores (_), the dash (-). Cannot start with http:// and https:// at the beginning. Length is from 2 to 256 characters.
        /// </summary>
        [Output("accountDescription")]
        public Output<string?> AccountDescription { get; private set; } = null!;

        /// <summary>
        /// Account name: lowercase letters, numbers, underscores, lowercase letter; length no more than 16 characters.
        /// </summary>
        [Output("accountName")]
        public Output<string> AccountName { get; private set; } = null!;

        /// <summary>
        /// The account password: uppercase letters, lowercase letters, lowercase letters, numbers, and special characters (special character! #$%^&amp; author (s):_+-=) in a length of 8-32 bit.
        /// </summary>
        [Output("accountPassword")]
        public Output<string> AccountPassword { get; private set; } = null!;

        /// <summary>
        /// The list of databases to which you want to grant permissions. Separate databases with commas (,).
        /// </summary>
        [Output("allowDatabases")]
        public Output<string> AllowDatabases { get; private set; } = null!;

        /// <summary>
        /// The list of dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).
        /// </summary>
        [Output("allowDictionaries")]
        public Output<string> AllowDictionaries { get; private set; } = null!;

        /// <summary>
        /// The db cluster id.
        /// </summary>
        [Output("dbClusterId")]
        public Output<string> DbClusterId { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to grant DDL permissions to the database account. Valid values: `true` and `false`.
        /// -`true`: grants DDL permissions to the database account.
        /// -`false`: does not grant DDL permissions to the database account.
        /// </summary>
        [Output("ddlAuthority")]
        public Output<bool> DdlAuthority { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to grant DML permissions to the database account. Valid values: `all` and `readOnly,modify`.
        /// </summary>
        [Output("dmlAuthority")]
        public Output<string> DmlAuthority { get; private set; } = null!;

        /// <summary>
        /// The status of the resource. Valid Status: `Creating`,`Available`,`Deleting`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The list of all databases. Separate databases with commas (,).
        /// </summary>
        [Output("totalDatabases")]
        public Output<string> TotalDatabases { get; private set; } = null!;

        /// <summary>
        /// The list of all dictionaries. Separate dictionaries with commas (,).
        /// </summary>
        [Output("totalDictionaries")]
        public Output<string> TotalDictionaries { get; private set; } = null!;

        /// <summary>
        /// The type of the database account. Valid values: `Normal` or `Super`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Account resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Account(string name, AccountArgs args, CustomResourceOptions? options = null)
            : base("alicloud:clickhouse/account:Account", name, args ?? new AccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Account(string name, Input<string> id, AccountState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:clickhouse/account:Account", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Account resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Account Get(string name, Input<string> id, AccountState? state = null, CustomResourceOptions? options = null)
        {
            return new Account(name, id, state, options);
        }
    }

    public sealed class AccountArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// In Chinese, English letter. May contain Chinese and English characters, lowercase letters, numbers, and underscores (_), the dash (-). Cannot start with http:// and https:// at the beginning. Length is from 2 to 256 characters.
        /// </summary>
        [Input("accountDescription")]
        public Input<string>? AccountDescription { get; set; }

        /// <summary>
        /// Account name: lowercase letters, numbers, underscores, lowercase letter; length no more than 16 characters.
        /// </summary>
        [Input("accountName", required: true)]
        public Input<string> AccountName { get; set; } = null!;

        /// <summary>
        /// The account password: uppercase letters, lowercase letters, lowercase letters, numbers, and special characters (special character! #$%^&amp; author (s):_+-=) in a length of 8-32 bit.
        /// </summary>
        [Input("accountPassword", required: true)]
        public Input<string> AccountPassword { get; set; } = null!;

        /// <summary>
        /// The list of databases to which you want to grant permissions. Separate databases with commas (,).
        /// </summary>
        [Input("allowDatabases")]
        public Input<string>? AllowDatabases { get; set; }

        /// <summary>
        /// The list of dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).
        /// </summary>
        [Input("allowDictionaries")]
        public Input<string>? AllowDictionaries { get; set; }

        /// <summary>
        /// The db cluster id.
        /// </summary>
        [Input("dbClusterId", required: true)]
        public Input<string> DbClusterId { get; set; } = null!;

        /// <summary>
        /// Specifies whether to grant DDL permissions to the database account. Valid values: `true` and `false`.
        /// -`true`: grants DDL permissions to the database account.
        /// -`false`: does not grant DDL permissions to the database account.
        /// </summary>
        [Input("ddlAuthority")]
        public Input<bool>? DdlAuthority { get; set; }

        /// <summary>
        /// Specifies whether to grant DML permissions to the database account. Valid values: `all` and `readOnly,modify`.
        /// </summary>
        [Input("dmlAuthority")]
        public Input<string>? DmlAuthority { get; set; }

        /// <summary>
        /// The list of all databases. Separate databases with commas (,).
        /// </summary>
        [Input("totalDatabases")]
        public Input<string>? TotalDatabases { get; set; }

        /// <summary>
        /// The list of all dictionaries. Separate dictionaries with commas (,).
        /// </summary>
        [Input("totalDictionaries")]
        public Input<string>? TotalDictionaries { get; set; }

        public AccountArgs()
        {
        }
    }

    public sealed class AccountState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// In Chinese, English letter. May contain Chinese and English characters, lowercase letters, numbers, and underscores (_), the dash (-). Cannot start with http:// and https:// at the beginning. Length is from 2 to 256 characters.
        /// </summary>
        [Input("accountDescription")]
        public Input<string>? AccountDescription { get; set; }

        /// <summary>
        /// Account name: lowercase letters, numbers, underscores, lowercase letter; length no more than 16 characters.
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        /// <summary>
        /// The account password: uppercase letters, lowercase letters, lowercase letters, numbers, and special characters (special character! #$%^&amp; author (s):_+-=) in a length of 8-32 bit.
        /// </summary>
        [Input("accountPassword")]
        public Input<string>? AccountPassword { get; set; }

        /// <summary>
        /// The list of databases to which you want to grant permissions. Separate databases with commas (,).
        /// </summary>
        [Input("allowDatabases")]
        public Input<string>? AllowDatabases { get; set; }

        /// <summary>
        /// The list of dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).
        /// </summary>
        [Input("allowDictionaries")]
        public Input<string>? AllowDictionaries { get; set; }

        /// <summary>
        /// The db cluster id.
        /// </summary>
        [Input("dbClusterId")]
        public Input<string>? DbClusterId { get; set; }

        /// <summary>
        /// Specifies whether to grant DDL permissions to the database account. Valid values: `true` and `false`.
        /// -`true`: grants DDL permissions to the database account.
        /// -`false`: does not grant DDL permissions to the database account.
        /// </summary>
        [Input("ddlAuthority")]
        public Input<bool>? DdlAuthority { get; set; }

        /// <summary>
        /// Specifies whether to grant DML permissions to the database account. Valid values: `all` and `readOnly,modify`.
        /// </summary>
        [Input("dmlAuthority")]
        public Input<string>? DmlAuthority { get; set; }

        /// <summary>
        /// The status of the resource. Valid Status: `Creating`,`Available`,`Deleting`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The list of all databases. Separate databases with commas (,).
        /// </summary>
        [Input("totalDatabases")]
        public Input<string>? TotalDatabases { get; set; }

        /// <summary>
        /// The list of all dictionaries. Separate dictionaries with commas (,).
        /// </summary>
        [Input("totalDictionaries")]
        public Input<string>? TotalDictionaries { get; set; }

        /// <summary>
        /// The type of the database account. Valid values: `Normal` or `Super`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AccountState()
        {
        }
    }
}
