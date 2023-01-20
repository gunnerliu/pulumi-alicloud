// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.BastionHost.Inputs
{

    public sealed class InstanceAdAuthServerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The username of the account that is used for the AD server.
        /// </summary>
        [Input("account", required: true)]
        public Input<string> Account { get; set; } = null!;

        /// <summary>
        /// The Base distinguished name (DN).
        /// </summary>
        [Input("baseDn", required: true)]
        public Input<string> BaseDn { get; set; } = null!;

        /// <summary>
        /// The domain on the AD server.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        /// <summary>
        /// The field that is used to indicate the email address of a user on the AD server.
        /// </summary>
        [Input("emailMapping")]
        public Input<string>? EmailMapping { get; set; }

        /// <summary>
        /// The condition that is used to filter users.
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// Specifies whether to support SSL.
        /// </summary>
        [Input("isSsl", required: true)]
        public Input<bool> IsSsl { get; set; } = null!;

        /// <summary>
        /// The field that is used to indicate the mobile phone number of a user on the AD server.
        /// </summary>
        [Input("mobileMapping")]
        public Input<string>? MobileMapping { get; set; }

        /// <summary>
        /// The field that is used to indicate the name of a user on the AD server.
        /// </summary>
        [Input("nameMapping")]
        public Input<string>? NameMapping { get; set; }

        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// The password of the account that is used for the AD server.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The port that is used to access the AD server.
        /// </summary>
        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        /// <summary>
        /// The address of the AD server.
        /// </summary>
        [Input("server", required: true)]
        public Input<string> Server { get; set; } = null!;

        /// <summary>
        /// The address of the secondary AD server.
        /// </summary>
        [Input("standbyServer")]
        public Input<string>? StandbyServer { get; set; }

        public InstanceAdAuthServerGetArgs()
        {
        }
        public static new InstanceAdAuthServerGetArgs Empty => new InstanceAdAuthServerGetArgs();
    }
}
