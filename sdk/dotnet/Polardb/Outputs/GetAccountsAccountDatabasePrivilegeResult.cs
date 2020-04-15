// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PolarDB.Outputs
{

    [OutputType]
    public sealed class GetAccountsAccountDatabasePrivilegeResult
    {
        /// <summary>
        /// Account privilege of database
        /// </summary>
        public readonly string AccountPrivilege;
        /// <summary>
        /// The account owned database name 
        /// </summary>
        public readonly string DbName;

        [OutputConstructor]
        private GetAccountsAccountDatabasePrivilegeResult(
            string accountPrivilege,

            string dbName)
        {
            AccountPrivilege = accountPrivilege;
            DbName = dbName;
        }
    }
}
