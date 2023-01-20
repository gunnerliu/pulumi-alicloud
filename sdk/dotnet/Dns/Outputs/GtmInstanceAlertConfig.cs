// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns.Outputs
{

    [OutputType]
    public sealed class GtmInstanceAlertConfig
    {
        /// <summary>
        /// Whether to configure DingTalk notifications. Valid values: `true`, `false`.
        /// </summary>
        public readonly bool? DingtalkNotice;
        /// <summary>
        /// Whether to configure mail notification. Valid values: `true`, `false`.
        /// </summary>
        public readonly bool? EmailNotice;
        /// <summary>
        /// The Alarm Event Type.
        /// </summary>
        public readonly string? NoticeType;
        /// <summary>
        /// Whether to configure SMS notification. Valid values: `true`, `false`.
        /// </summary>
        public readonly bool? SmsNotice;

        [OutputConstructor]
        private GtmInstanceAlertConfig(
            bool? dingtalkNotice,

            bool? emailNotice,

            string? noticeType,

            bool? smsNotice)
        {
            DingtalkNotice = dingtalkNotice;
            EmailNotice = emailNotice;
            NoticeType = noticeType;
            SmsNotice = smsNotice;
        }
    }
}
