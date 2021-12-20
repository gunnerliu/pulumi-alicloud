// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class AclAclEntryArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the ACL entry. The description must be `1` to `256` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (_). It can also contain Chinese characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The IP address for the ACL entry.
        /// </summary>
        [Input("entry")]
        public Input<string>? Entry { get; set; }

        /// <summary>
        /// The state of the ACL. Valid values:`Provisioning`, `Available` and `Configuring`. `Provisioning`: The ACL is being created. `Available`: The ACL is available. `Configuring`: The ACL is being configured.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AclAclEntryArgs()
        {
        }
    }
}
