// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Log.Inputs
{

    public sealed class AlertNotificationListArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Notice content of alarm.
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        [Input("emailLists")]
        private InputList<string>? _emailLists;

        /// <summary>
        /// Email address list.
        /// </summary>
        public InputList<string> EmailLists
        {
            get => _emailLists ?? (_emailLists = new InputList<string>());
            set => _emailLists = value;
        }

        [Input("mobileLists")]
        private InputList<string>? _mobileLists;

        /// <summary>
        /// SMS sending mobile number.
        /// </summary>
        public InputList<string> MobileLists
        {
            get => _mobileLists ?? (_mobileLists = new InputList<string>());
            set => _mobileLists = value;
        }

        /// <summary>
        /// Request address.
        /// </summary>
        [Input("serviceUri")]
        public Input<string>? ServiceUri { get; set; }

        /// <summary>
        /// including FixedRate,Hourly,Daily,Weekly,Cron.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public AlertNotificationListArgs()
        {
        }
    }
}
