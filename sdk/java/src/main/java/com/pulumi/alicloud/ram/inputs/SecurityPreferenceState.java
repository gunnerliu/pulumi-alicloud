// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityPreferenceState extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPreferenceState Empty = new SecurityPreferenceState();

    /**
     * Specifies whether RAM users can change their passwords. Valid values: `true` and `false`
     * 
     */
    @Import(name="allowUserToChangePassword")
    private @Nullable Output<Boolean> allowUserToChangePassword;

    /**
     * @return Specifies whether RAM users can change their passwords. Valid values: `true` and `false`
     * 
     */
    public Optional<Output<Boolean>> allowUserToChangePassword() {
        return Optional.ofNullable(this.allowUserToChangePassword);
    }

    /**
     * Specifies whether RAM users can manage their AccessKey pairs. Valid values: `true` and `false`
     * 
     */
    @Import(name="allowUserToManageAccessKeys")
    private @Nullable Output<Boolean> allowUserToManageAccessKeys;

    /**
     * @return Specifies whether RAM users can manage their AccessKey pairs. Valid values: `true` and `false`
     * 
     */
    public Optional<Output<Boolean>> allowUserToManageAccessKeys() {
        return Optional.ofNullable(this.allowUserToManageAccessKeys);
    }

    /**
     * Specifies whether RAM users can manage their MFA devices. Valid values: `true` and `false`
     * 
     */
    @Import(name="allowUserToManageMfaDevices")
    private @Nullable Output<Boolean> allowUserToManageMfaDevices;

    /**
     * @return Specifies whether RAM users can manage their MFA devices. Valid values: `true` and `false`
     * 
     */
    public Optional<Output<Boolean>> allowUserToManageMfaDevices() {
        return Optional.ofNullable(this.allowUserToManageMfaDevices);
    }

    /**
     * Specifies whether to remember the MFA devices for seven days. Valid values: `true` and `false`
     * 
     */
    @Import(name="enableSaveMfaTicket")
    private @Nullable Output<Boolean> enableSaveMfaTicket;

    /**
     * @return Specifies whether to remember the MFA devices for seven days. Valid values: `true` and `false`
     * 
     */
    public Optional<Output<Boolean>> enableSaveMfaTicket() {
        return Optional.ofNullable(this.enableSaveMfaTicket);
    }

    /**
     * Specifies whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console by using usernames and passwords. Valid values: `true` and `false`
     * 
     */
    @Import(name="enforceMfaForLogin")
    private @Nullable Output<Boolean> enforceMfaForLogin;

    /**
     * @return Specifies whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console by using usernames and passwords. Valid values: `true` and `false`
     * 
     */
    public Optional<Output<Boolean>> enforceMfaForLogin() {
        return Optional.ofNullable(this.enforceMfaForLogin);
    }

    /**
     * The subnet mask that specifies the IP addresses from which you can log on to the Alibaba Cloud Management Console. This parameter takes effect on password-based logon and single sign-on (SSO). However, this parameter does not take effect on API calls that are authenticated by using AccessKey pairs.**NOTE:** You can specify up to 25 subnet masks. The total length of the subnet masks can be a maximum of 512 characters.
     * * If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.
     * * If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.
     * * If you need to specify multiple subnet masks, separate the subnet masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.
     * 
     */
    @Import(name="loginNetworkMasks")
    private @Nullable Output<String> loginNetworkMasks;

    /**
     * @return The subnet mask that specifies the IP addresses from which you can log on to the Alibaba Cloud Management Console. This parameter takes effect on password-based logon and single sign-on (SSO). However, this parameter does not take effect on API calls that are authenticated by using AccessKey pairs.**NOTE:** You can specify up to 25 subnet masks. The total length of the subnet masks can be a maximum of 512 characters.
     * * If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.
     * * If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.
     * * If you need to specify multiple subnet masks, separate the subnet masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.
     * 
     */
    public Optional<Output<String>> loginNetworkMasks() {
        return Optional.ofNullable(this.loginNetworkMasks);
    }

    /**
     * The validity period of the logon session of RAM users. Valid values: 6 to 24. Unit: hours. Default value: 6.
     * 
     */
    @Import(name="loginSessionDuration")
    private @Nullable Output<Integer> loginSessionDuration;

    /**
     * @return The validity period of the logon session of RAM users. Valid values: 6 to 24. Unit: hours. Default value: 6.
     * 
     */
    public Optional<Output<Integer>> loginSessionDuration() {
        return Optional.ofNullable(this.loginSessionDuration);
    }

    private SecurityPreferenceState() {}

    private SecurityPreferenceState(SecurityPreferenceState $) {
        this.allowUserToChangePassword = $.allowUserToChangePassword;
        this.allowUserToManageAccessKeys = $.allowUserToManageAccessKeys;
        this.allowUserToManageMfaDevices = $.allowUserToManageMfaDevices;
        this.enableSaveMfaTicket = $.enableSaveMfaTicket;
        this.enforceMfaForLogin = $.enforceMfaForLogin;
        this.loginNetworkMasks = $.loginNetworkMasks;
        this.loginSessionDuration = $.loginSessionDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPreferenceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPreferenceState $;

        public Builder() {
            $ = new SecurityPreferenceState();
        }

        public Builder(SecurityPreferenceState defaults) {
            $ = new SecurityPreferenceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowUserToChangePassword Specifies whether RAM users can change their passwords. Valid values: `true` and `false`
         * 
         * @return builder
         * 
         */
        public Builder allowUserToChangePassword(@Nullable Output<Boolean> allowUserToChangePassword) {
            $.allowUserToChangePassword = allowUserToChangePassword;
            return this;
        }

        /**
         * @param allowUserToChangePassword Specifies whether RAM users can change their passwords. Valid values: `true` and `false`
         * 
         * @return builder
         * 
         */
        public Builder allowUserToChangePassword(Boolean allowUserToChangePassword) {
            return allowUserToChangePassword(Output.of(allowUserToChangePassword));
        }

        /**
         * @param allowUserToManageAccessKeys Specifies whether RAM users can manage their AccessKey pairs. Valid values: `true` and `false`
         * 
         * @return builder
         * 
         */
        public Builder allowUserToManageAccessKeys(@Nullable Output<Boolean> allowUserToManageAccessKeys) {
            $.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
            return this;
        }

        /**
         * @param allowUserToManageAccessKeys Specifies whether RAM users can manage their AccessKey pairs. Valid values: `true` and `false`
         * 
         * @return builder
         * 
         */
        public Builder allowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
            return allowUserToManageAccessKeys(Output.of(allowUserToManageAccessKeys));
        }

        /**
         * @param allowUserToManageMfaDevices Specifies whether RAM users can manage their MFA devices. Valid values: `true` and `false`
         * 
         * @return builder
         * 
         */
        public Builder allowUserToManageMfaDevices(@Nullable Output<Boolean> allowUserToManageMfaDevices) {
            $.allowUserToManageMfaDevices = allowUserToManageMfaDevices;
            return this;
        }

        /**
         * @param allowUserToManageMfaDevices Specifies whether RAM users can manage their MFA devices. Valid values: `true` and `false`
         * 
         * @return builder
         * 
         */
        public Builder allowUserToManageMfaDevices(Boolean allowUserToManageMfaDevices) {
            return allowUserToManageMfaDevices(Output.of(allowUserToManageMfaDevices));
        }

        /**
         * @param enableSaveMfaTicket Specifies whether to remember the MFA devices for seven days. Valid values: `true` and `false`
         * 
         * @return builder
         * 
         */
        public Builder enableSaveMfaTicket(@Nullable Output<Boolean> enableSaveMfaTicket) {
            $.enableSaveMfaTicket = enableSaveMfaTicket;
            return this;
        }

        /**
         * @param enableSaveMfaTicket Specifies whether to remember the MFA devices for seven days. Valid values: `true` and `false`
         * 
         * @return builder
         * 
         */
        public Builder enableSaveMfaTicket(Boolean enableSaveMfaTicket) {
            return enableSaveMfaTicket(Output.of(enableSaveMfaTicket));
        }

        /**
         * @param enforceMfaForLogin Specifies whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console by using usernames and passwords. Valid values: `true` and `false`
         * 
         * @return builder
         * 
         */
        public Builder enforceMfaForLogin(@Nullable Output<Boolean> enforceMfaForLogin) {
            $.enforceMfaForLogin = enforceMfaForLogin;
            return this;
        }

        /**
         * @param enforceMfaForLogin Specifies whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console by using usernames and passwords. Valid values: `true` and `false`
         * 
         * @return builder
         * 
         */
        public Builder enforceMfaForLogin(Boolean enforceMfaForLogin) {
            return enforceMfaForLogin(Output.of(enforceMfaForLogin));
        }

        /**
         * @param loginNetworkMasks The subnet mask that specifies the IP addresses from which you can log on to the Alibaba Cloud Management Console. This parameter takes effect on password-based logon and single sign-on (SSO). However, this parameter does not take effect on API calls that are authenticated by using AccessKey pairs.**NOTE:** You can specify up to 25 subnet masks. The total length of the subnet masks can be a maximum of 512 characters.
         * * If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.
         * * If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.
         * * If you need to specify multiple subnet masks, separate the subnet masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.
         * 
         * @return builder
         * 
         */
        public Builder loginNetworkMasks(@Nullable Output<String> loginNetworkMasks) {
            $.loginNetworkMasks = loginNetworkMasks;
            return this;
        }

        /**
         * @param loginNetworkMasks The subnet mask that specifies the IP addresses from which you can log on to the Alibaba Cloud Management Console. This parameter takes effect on password-based logon and single sign-on (SSO). However, this parameter does not take effect on API calls that are authenticated by using AccessKey pairs.**NOTE:** You can specify up to 25 subnet masks. The total length of the subnet masks can be a maximum of 512 characters.
         * * If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.
         * * If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.
         * * If you need to specify multiple subnet masks, separate the subnet masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.
         * 
         * @return builder
         * 
         */
        public Builder loginNetworkMasks(String loginNetworkMasks) {
            return loginNetworkMasks(Output.of(loginNetworkMasks));
        }

        /**
         * @param loginSessionDuration The validity period of the logon session of RAM users. Valid values: 6 to 24. Unit: hours. Default value: 6.
         * 
         * @return builder
         * 
         */
        public Builder loginSessionDuration(@Nullable Output<Integer> loginSessionDuration) {
            $.loginSessionDuration = loginSessionDuration;
            return this;
        }

        /**
         * @param loginSessionDuration The validity period of the logon session of RAM users. Valid values: 6 to 24. Unit: hours. Default value: 6.
         * 
         * @return builder
         * 
         */
        public Builder loginSessionDuration(Integer loginSessionDuration) {
            return loginSessionDuration(Output.of(loginSessionDuration));
        }

        public SecurityPreferenceState build() {
            return $;
        }
    }

}
