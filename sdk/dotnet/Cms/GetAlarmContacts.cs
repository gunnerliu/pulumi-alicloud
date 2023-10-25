// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms
{
    public static class GetAlarmContacts
    {
        /// <summary>
        /// Provides a list of alarm contact owned by an Alibaba Cloud account.
        /// 
        /// &gt; **NOTE:** Available in v1.99.0+.
        /// </summary>
        public static Task<GetAlarmContactsResult> InvokeAsync(GetAlarmContactsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAlarmContactsResult>("alicloud:cms/getAlarmContacts:getAlarmContacts", args ?? new GetAlarmContactsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a list of alarm contact owned by an Alibaba Cloud account.
        /// 
        /// &gt; **NOTE:** Available in v1.99.0+.
        /// </summary>
        public static Output<GetAlarmContactsResult> Invoke(GetAlarmContactsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAlarmContactsResult>("alicloud:cms/getAlarmContacts:getAlarmContacts", args ?? new GetAlarmContactsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAlarmContactsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The alarm notification method. Alarm notifications can be sent by using `Email` or `DingWebHook`.
        /// </summary>
        [Input("chanelType")]
        public string? ChanelType { get; set; }

        /// <summary>
        /// The alarm notification target.
        /// </summary>
        [Input("chanelValue")]
        public string? ChanelValue { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of alarm contact IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by alarm contact name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`). 
        /// 
        /// &gt; **NOTE:** Specify at least one of the following alarm notification targets: phone number, email address, webhook URL of the DingTalk chatbot, and TradeManager ID.
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetAlarmContactsArgs()
        {
        }
        public static new GetAlarmContactsArgs Empty => new GetAlarmContactsArgs();
    }

    public sealed class GetAlarmContactsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The alarm notification method. Alarm notifications can be sent by using `Email` or `DingWebHook`.
        /// </summary>
        [Input("chanelType")]
        public Input<string>? ChanelType { get; set; }

        /// <summary>
        /// The alarm notification target.
        /// </summary>
        [Input("chanelValue")]
        public Input<string>? ChanelValue { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of alarm contact IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by alarm contact name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`). 
        /// 
        /// &gt; **NOTE:** Specify at least one of the following alarm notification targets: phone number, email address, webhook URL of the DingTalk chatbot, and TradeManager ID.
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetAlarmContactsInvokeArgs()
        {
        }
        public static new GetAlarmContactsInvokeArgs Empty => new GetAlarmContactsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAlarmContactsResult
    {
        public readonly string? ChanelType;
        public readonly string? ChanelValue;
        /// <summary>
        /// A list of alarm contacts. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAlarmContactsContactResult> Contacts;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of alarm contact IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of alarm contact names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetAlarmContactsResult(
            string? chanelType,

            string? chanelValue,

            ImmutableArray<Outputs.GetAlarmContactsContactResult> contacts,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            ChanelType = chanelType;
            ChanelValue = chanelValue;
            Contacts = contacts;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
