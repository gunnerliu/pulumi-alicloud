// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds
{
    /// <summary>
    /// Provides an RDS account privilege resource and used to grant several database some access privilege. A database can be granted by multiple account, see [What is DB Account Privilege](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-grantaccountprivilege).
    /// 
    /// &gt; **NOTE:** At present, a database can only have one database owner.
    /// 
    /// &gt; **NOTE:** Available since v1.5.0.
    /// 
    /// ## Import
    /// 
    /// RDS account privilege can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:rds/accountPrivilege:AccountPrivilege example "rm-12345:tf_account:ReadOnly"
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:rds/accountPrivilege:AccountPrivilege")]
    public partial class AccountPrivilege : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A specified account name.
        /// </summary>
        [Output("accountName")]
        public Output<string> AccountName { get; private set; } = null!;

        /// <summary>
        /// List of specified database name.
        /// </summary>
        [Output("dbNames")]
        public Output<ImmutableArray<string>> DbNames { get; private set; } = null!;

        /// <summary>
        /// The Id of instance in which account belongs.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The privilege of one account access database. Valid values: 
        /// - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
        /// - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
        /// - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
        /// - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
        /// - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
        /// Default to "ReadOnly".
        /// </summary>
        [Output("privilege")]
        public Output<string?> Privilege { get; private set; } = null!;


        /// <summary>
        /// Create a AccountPrivilege resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccountPrivilege(string name, AccountPrivilegeArgs args, CustomResourceOptions? options = null)
            : base("alicloud:rds/accountPrivilege:AccountPrivilege", name, args ?? new AccountPrivilegeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccountPrivilege(string name, Input<string> id, AccountPrivilegeState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:rds/accountPrivilege:AccountPrivilege", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccountPrivilege resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccountPrivilege Get(string name, Input<string> id, AccountPrivilegeState? state = null, CustomResourceOptions? options = null)
        {
            return new AccountPrivilege(name, id, state, options);
        }
    }

    public sealed class AccountPrivilegeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A specified account name.
        /// </summary>
        [Input("accountName", required: true)]
        public Input<string> AccountName { get; set; } = null!;

        [Input("dbNames", required: true)]
        private InputList<string>? _dbNames;

        /// <summary>
        /// List of specified database name.
        /// </summary>
        public InputList<string> DbNames
        {
            get => _dbNames ?? (_dbNames = new InputList<string>());
            set => _dbNames = value;
        }

        /// <summary>
        /// The Id of instance in which account belongs.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// The privilege of one account access database. Valid values: 
        /// - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
        /// - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
        /// - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
        /// - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
        /// - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
        /// Default to "ReadOnly".
        /// </summary>
        [Input("privilege")]
        public Input<string>? Privilege { get; set; }

        public AccountPrivilegeArgs()
        {
        }
        public static new AccountPrivilegeArgs Empty => new AccountPrivilegeArgs();
    }

    public sealed class AccountPrivilegeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A specified account name.
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        [Input("dbNames")]
        private InputList<string>? _dbNames;

        /// <summary>
        /// List of specified database name.
        /// </summary>
        public InputList<string> DbNames
        {
            get => _dbNames ?? (_dbNames = new InputList<string>());
            set => _dbNames = value;
        }

        /// <summary>
        /// The Id of instance in which account belongs.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The privilege of one account access database. Valid values: 
        /// - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
        /// - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
        /// - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
        /// - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
        /// - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
        /// Default to "ReadOnly".
        /// </summary>
        [Input("privilege")]
        public Input<string>? Privilege { get; set; }

        public AccountPrivilegeState()
        {
        }
        public static new AccountPrivilegeState Empty => new AccountPrivilegeState();
    }
}
