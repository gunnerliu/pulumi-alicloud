// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mongodb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * The description of the account.
     * * The description must start with a letter, and cannot start with `http://` or `https://`.
     * * It must be `2` to `256` characters in length, and can contain letters, digits, underscores (_), and hyphens (-).
     * 
     */
    @Import(name="accountDescription")
    private @Nullable Output<String> accountDescription;

    /**
     * @return The description of the account.
     * * The description must start with a letter, and cannot start with `http://` or `https://`.
     * * It must be `2` to `256` characters in length, and can contain letters, digits, underscores (_), and hyphens (-).
     * 
     */
    public Optional<Output<String>> accountDescription() {
        return Optional.ofNullable(this.accountDescription);
    }

    /**
     * The name of the account. Valid values: `root`.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the account. Valid values: `root`.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The Password of the Account.
     * * The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!#$%^&amp;*()_+-=`.
     * * The password must be `8` to `32` characters in length.
     * 
     */
    @Import(name="accountPassword", required=true)
    private Output<String> accountPassword;

    /**
     * @return The Password of the Account.
     * * The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!#$%^&amp;*()_+-=`.
     * * The password must be `8` to `32` characters in length.
     * 
     */
    public Output<String> accountPassword() {
        return this.accountPassword;
    }

    /**
     * The ID of the instance.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The ID of the instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    private AccountArgs() {}

    private AccountArgs(AccountArgs $) {
        this.accountDescription = $.accountDescription;
        this.accountName = $.accountName;
        this.accountPassword = $.accountPassword;
        this.instanceId = $.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountArgs $;

        public Builder() {
            $ = new AccountArgs();
        }

        public Builder(AccountArgs defaults) {
            $ = new AccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountDescription The description of the account.
         * * The description must start with a letter, and cannot start with `http://` or `https://`.
         * * It must be `2` to `256` characters in length, and can contain letters, digits, underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder accountDescription(@Nullable Output<String> accountDescription) {
            $.accountDescription = accountDescription;
            return this;
        }

        /**
         * @param accountDescription The description of the account.
         * * The description must start with a letter, and cannot start with `http://` or `https://`.
         * * It must be `2` to `256` characters in length, and can contain letters, digits, underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder accountDescription(String accountDescription) {
            return accountDescription(Output.of(accountDescription));
        }

        /**
         * @param accountName The name of the account. Valid values: `root`.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the account. Valid values: `root`.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param accountPassword The Password of the Account.
         * * The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!#$%^&amp;*()_+-=`.
         * * The password must be `8` to `32` characters in length.
         * 
         * @return builder
         * 
         */
        public Builder accountPassword(Output<String> accountPassword) {
            $.accountPassword = accountPassword;
            return this;
        }

        /**
         * @param accountPassword The Password of the Account.
         * * The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!#$%^&amp;*()_+-=`.
         * * The password must be `8` to `32` characters in length.
         * 
         * @return builder
         * 
         */
        public Builder accountPassword(String accountPassword) {
            return accountPassword(Output.of(accountPassword));
        }

        /**
         * @param instanceId The ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public AccountArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.accountPassword = Objects.requireNonNull($.accountPassword, "expected parameter 'accountPassword' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
