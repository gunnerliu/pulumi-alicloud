// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall.Inputs
{

    public sealed class AddressBookEcsTagGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The key of ECS tag that to be matched.
        /// </summary>
        [Input("tagKey")]
        public Input<string>? TagKey { get; set; }

        /// <summary>
        /// The value of ECS tag that to be matched.
        /// </summary>
        [Input("tagValue")]
        public Input<string>? TagValue { get; set; }

        public AddressBookEcsTagGetArgs()
        {
        }
        public static new AddressBookEcsTagGetArgs Empty => new AddressBookEcsTagGetArgs();
    }
}