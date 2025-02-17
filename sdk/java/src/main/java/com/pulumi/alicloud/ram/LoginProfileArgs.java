// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoginProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoginProfileArgs Empty = new LoginProfileArgs();

    /**
     * This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
     * 
     */
    @Import(name="mfaBindRequired")
    private @Nullable Output<Boolean> mfaBindRequired;

    /**
     * @return This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> mfaBindRequired() {
        return Optional.ofNullable(this.mfaBindRequired);
    }

    /**
     * Password of the RAM user.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Password of the RAM user.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
     * 
     */
    @Import(name="passwordResetRequired")
    private @Nullable Output<Boolean> passwordResetRequired;

    /**
     * @return This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> passwordResetRequired() {
        return Optional.ofNullable(this.passwordResetRequired);
    }

    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    @Import(name="userName", required=true)
    private Output<String> userName;

    /**
     * @return Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    private LoginProfileArgs() {}

    private LoginProfileArgs(LoginProfileArgs $) {
        this.mfaBindRequired = $.mfaBindRequired;
        this.password = $.password;
        this.passwordResetRequired = $.passwordResetRequired;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoginProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoginProfileArgs $;

        public Builder() {
            $ = new LoginProfileArgs();
        }

        public Builder(LoginProfileArgs defaults) {
            $ = new LoginProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mfaBindRequired This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder mfaBindRequired(@Nullable Output<Boolean> mfaBindRequired) {
            $.mfaBindRequired = mfaBindRequired;
            return this;
        }

        /**
         * @param mfaBindRequired This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder mfaBindRequired(Boolean mfaBindRequired) {
            return mfaBindRequired(Output.of(mfaBindRequired));
        }

        /**
         * @param password Password of the RAM user.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password of the RAM user.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param passwordResetRequired This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder passwordResetRequired(@Nullable Output<Boolean> passwordResetRequired) {
            $.passwordResetRequired = passwordResetRequired;
            return this;
        }

        /**
         * @param passwordResetRequired This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder passwordResetRequired(Boolean passwordResetRequired) {
            return passwordResetRequired(Output.of(passwordResetRequired));
        }

        /**
         * @param userName Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder userName(Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public LoginProfileArgs build() {
            if ($.password == null) {
                throw new MissingRequiredPropertyException("LoginProfileArgs", "password");
            }
            if ($.userName == null) {
                throw new MissingRequiredPropertyException("LoginProfileArgs", "userName");
            }
            return $;
        }
    }

}
