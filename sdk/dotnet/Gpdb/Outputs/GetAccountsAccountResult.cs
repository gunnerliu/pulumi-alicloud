// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gpdb.Outputs
{

    [OutputType]
    public sealed class GetAccountsAccountResult
    {
        /// <summary>
        /// The description of the account.
        /// </summary>
        public readonly string AccountDescription;
        /// <summary>
        /// The name of the account.
        /// </summary>
        public readonly string AccountName;
        /// <summary>
        /// The ID of the instance.
        /// </summary>
        public readonly string DbInstanceId;
        /// <summary>
        /// The ID of the Account. Its value is same as Queue Name.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The status of the account. Valid values: `Active`, `Creating` and `Deleting`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetAccountsAccountResult(
            string accountDescription,

            string accountName,

            string dbInstanceId,

            string id,

            string status)
        {
            AccountDescription = accountDescription;
            AccountName = accountName;
            DbInstanceId = dbInstanceId;
            Id = id;
            Status = status;
        }
    }
}
