// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ram
{
    /// <summary>
    /// Provides a RAM Security Preference resource.
    /// 
    /// For information about RAM Security Preference and how to use it, see [What is Security Preference](https://www.alibabacloud.com/help/en/doc-detail/186694.htm).
    /// 
    /// &gt; **NOTE:** Available since v1.152.0.
    /// 
    /// ## Import
    /// 
    /// RAM Security Preference can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ram/securityPreference:SecurityPreference example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ram/securityPreference:SecurityPreference")]
    public partial class SecurityPreference : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies whether RAM users can change their passwords. Valid values: `true` and `false`
        /// </summary>
        [Output("allowUserToChangePassword")]
        public Output<bool> AllowUserToChangePassword { get; private set; } = null!;

        /// <summary>
        /// Specifies whether RAM users can manage their AccessKey pairs. Valid values: `true` and `false`
        /// </summary>
        [Output("allowUserToManageAccessKeys")]
        public Output<bool> AllowUserToManageAccessKeys { get; private set; } = null!;

        /// <summary>
        /// Specifies whether RAM users can manage their MFA devices. Valid values: `true` and `false`
        /// </summary>
        [Output("allowUserToManageMfaDevices")]
        public Output<bool> AllowUserToManageMfaDevices { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to remember the MFA devices for seven days. Valid values: `true` and `false`
        /// </summary>
        [Output("enableSaveMfaTicket")]
        public Output<bool> EnableSaveMfaTicket { get; private set; } = null!;

        /// <summary>
        /// Specifies whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console by using usernames and passwords. Valid values: `true` and `false`
        /// </summary>
        [Output("enforceMfaForLogin")]
        public Output<bool> EnforceMfaForLogin { get; private set; } = null!;

        /// <summary>
        /// The subnet mask that specifies the IP addresses from which you can log on to the Alibaba Cloud Management Console. This parameter takes effect on password-based logon and single sign-on (SSO). However, this parameter does not take effect on API calls that are authenticated by using AccessKey pairs.**NOTE:** You can specify up to 25 subnet masks. The total length of the subnet masks can be a maximum of 512 characters.
        /// * If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.
        /// * If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.
        /// * If you need to specify multiple subnet masks, separate the subnet masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.
        /// </summary>
        [Output("loginNetworkMasks")]
        public Output<string?> LoginNetworkMasks { get; private set; } = null!;

        /// <summary>
        /// The validity period of the logon session of RAM users. Valid values: 6 to 24. Unit: hours. Default value: 6.
        /// </summary>
        [Output("loginSessionDuration")]
        public Output<int> LoginSessionDuration { get; private set; } = null!;


        /// <summary>
        /// Create a SecurityPreference resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecurityPreference(string name, SecurityPreferenceArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:ram/securityPreference:SecurityPreference", name, args ?? new SecurityPreferenceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecurityPreference(string name, Input<string> id, SecurityPreferenceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ram/securityPreference:SecurityPreference", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecurityPreference resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecurityPreference Get(string name, Input<string> id, SecurityPreferenceState? state = null, CustomResourceOptions? options = null)
        {
            return new SecurityPreference(name, id, state, options);
        }
    }

    public sealed class SecurityPreferenceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether RAM users can change their passwords. Valid values: `true` and `false`
        /// </summary>
        [Input("allowUserToChangePassword")]
        public Input<bool>? AllowUserToChangePassword { get; set; }

        /// <summary>
        /// Specifies whether RAM users can manage their AccessKey pairs. Valid values: `true` and `false`
        /// </summary>
        [Input("allowUserToManageAccessKeys")]
        public Input<bool>? AllowUserToManageAccessKeys { get; set; }

        /// <summary>
        /// Specifies whether RAM users can manage their MFA devices. Valid values: `true` and `false`
        /// </summary>
        [Input("allowUserToManageMfaDevices")]
        public Input<bool>? AllowUserToManageMfaDevices { get; set; }

        /// <summary>
        /// Specifies whether to remember the MFA devices for seven days. Valid values: `true` and `false`
        /// </summary>
        [Input("enableSaveMfaTicket")]
        public Input<bool>? EnableSaveMfaTicket { get; set; }

        /// <summary>
        /// Specifies whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console by using usernames and passwords. Valid values: `true` and `false`
        /// </summary>
        [Input("enforceMfaForLogin")]
        public Input<bool>? EnforceMfaForLogin { get; set; }

        /// <summary>
        /// The subnet mask that specifies the IP addresses from which you can log on to the Alibaba Cloud Management Console. This parameter takes effect on password-based logon and single sign-on (SSO). However, this parameter does not take effect on API calls that are authenticated by using AccessKey pairs.**NOTE:** You can specify up to 25 subnet masks. The total length of the subnet masks can be a maximum of 512 characters.
        /// * If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.
        /// * If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.
        /// * If you need to specify multiple subnet masks, separate the subnet masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.
        /// </summary>
        [Input("loginNetworkMasks")]
        public Input<string>? LoginNetworkMasks { get; set; }

        /// <summary>
        /// The validity period of the logon session of RAM users. Valid values: 6 to 24. Unit: hours. Default value: 6.
        /// </summary>
        [Input("loginSessionDuration")]
        public Input<int>? LoginSessionDuration { get; set; }

        public SecurityPreferenceArgs()
        {
        }
        public static new SecurityPreferenceArgs Empty => new SecurityPreferenceArgs();
    }

    public sealed class SecurityPreferenceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether RAM users can change their passwords. Valid values: `true` and `false`
        /// </summary>
        [Input("allowUserToChangePassword")]
        public Input<bool>? AllowUserToChangePassword { get; set; }

        /// <summary>
        /// Specifies whether RAM users can manage their AccessKey pairs. Valid values: `true` and `false`
        /// </summary>
        [Input("allowUserToManageAccessKeys")]
        public Input<bool>? AllowUserToManageAccessKeys { get; set; }

        /// <summary>
        /// Specifies whether RAM users can manage their MFA devices. Valid values: `true` and `false`
        /// </summary>
        [Input("allowUserToManageMfaDevices")]
        public Input<bool>? AllowUserToManageMfaDevices { get; set; }

        /// <summary>
        /// Specifies whether to remember the MFA devices for seven days. Valid values: `true` and `false`
        /// </summary>
        [Input("enableSaveMfaTicket")]
        public Input<bool>? EnableSaveMfaTicket { get; set; }

        /// <summary>
        /// Specifies whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console by using usernames and passwords. Valid values: `true` and `false`
        /// </summary>
        [Input("enforceMfaForLogin")]
        public Input<bool>? EnforceMfaForLogin { get; set; }

        /// <summary>
        /// The subnet mask that specifies the IP addresses from which you can log on to the Alibaba Cloud Management Console. This parameter takes effect on password-based logon and single sign-on (SSO). However, this parameter does not take effect on API calls that are authenticated by using AccessKey pairs.**NOTE:** You can specify up to 25 subnet masks. The total length of the subnet masks can be a maximum of 512 characters.
        /// * If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.
        /// * If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.
        /// * If you need to specify multiple subnet masks, separate the subnet masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.
        /// </summary>
        [Input("loginNetworkMasks")]
        public Input<string>? LoginNetworkMasks { get; set; }

        /// <summary>
        /// The validity period of the logon session of RAM users. Valid values: 6 to 24. Unit: hours. Default value: 6.
        /// </summary>
        [Input("loginSessionDuration")]
        public Input<int>? LoginSessionDuration { get; set; }

        public SecurityPreferenceState()
        {
        }
        public static new SecurityPreferenceState Empty => new SecurityPreferenceState();
    }
}
