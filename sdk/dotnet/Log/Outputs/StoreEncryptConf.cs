// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Log.Outputs
{

    [OutputType]
    public sealed class StoreEncryptConf
    {
        /// <summary>
        /// enable encryption. Default `false`
        /// </summary>
        public readonly bool? Enable;
        /// <summary>
        /// Supported encryption type, only supports `default(AES)`,` m4`
        /// </summary>
        public readonly string? EncryptType;
        /// <summary>
        /// User bring your own key (BYOK) encryption.[Refer to details](https://www.alibabacloud.com/help/zh/doc-detail/187853.htm?spm=a2c63.p38356.b99.673.cafa2b38qBskFV)
        /// </summary>
        public readonly Outputs.StoreEncryptConfUserCmkInfo? UserCmkInfo;

        [OutputConstructor]
        private StoreEncryptConf(
            bool? enable,

            string? encryptType,

            Outputs.StoreEncryptConfUserCmkInfo? userCmkInfo)
        {
            Enable = enable;
            EncryptType = encryptType;
            UserCmkInfo = userCmkInfo;
        }
    }
}