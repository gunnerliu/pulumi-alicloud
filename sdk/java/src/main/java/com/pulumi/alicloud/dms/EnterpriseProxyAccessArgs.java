// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnterpriseProxyAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnterpriseProxyAccessArgs Empty = new EnterpriseProxyAccessArgs();

    /**
     * Database account.
     * 
     */
    @Import(name="indepAccount")
    private @Nullable Output<String> indepAccount;

    /**
     * @return Database account.
     * 
     */
    public Optional<Output<String>> indepAccount() {
        return Optional.ofNullable(this.indepAccount);
    }

    /**
     * Database password.
     * 
     */
    @Import(name="indepPassword")
    private @Nullable Output<String> indepPassword;

    /**
     * @return Database password.
     * 
     */
    public Optional<Output<String>> indepPassword() {
        return Optional.ofNullable(this.indepPassword);
    }

    /**
     * Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
     * 
     */
    @Import(name="proxyAccessId")
    private @Nullable Output<String> proxyAccessId;

    /**
     * @return Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
     * 
     */
    public Optional<Output<String>> proxyAccessId() {
        return Optional.ofNullable(this.proxyAccessId);
    }

    /**
     * The ID of the security agent.
     * 
     */
    @Import(name="proxyId", required=true)
    private Output<String> proxyId;

    /**
     * @return The ID of the security agent.
     * 
     */
    public Output<String> proxyId() {
        return this.proxyId;
    }

    /**
     * The user ID.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The user ID.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private EnterpriseProxyAccessArgs() {}

    private EnterpriseProxyAccessArgs(EnterpriseProxyAccessArgs $) {
        this.indepAccount = $.indepAccount;
        this.indepPassword = $.indepPassword;
        this.proxyAccessId = $.proxyAccessId;
        this.proxyId = $.proxyId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnterpriseProxyAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnterpriseProxyAccessArgs $;

        public Builder() {
            $ = new EnterpriseProxyAccessArgs();
        }

        public Builder(EnterpriseProxyAccessArgs defaults) {
            $ = new EnterpriseProxyAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param indepAccount Database account.
         * 
         * @return builder
         * 
         */
        public Builder indepAccount(@Nullable Output<String> indepAccount) {
            $.indepAccount = indepAccount;
            return this;
        }

        /**
         * @param indepAccount Database account.
         * 
         * @return builder
         * 
         */
        public Builder indepAccount(String indepAccount) {
            return indepAccount(Output.of(indepAccount));
        }

        /**
         * @param indepPassword Database password.
         * 
         * @return builder
         * 
         */
        public Builder indepPassword(@Nullable Output<String> indepPassword) {
            $.indepPassword = indepPassword;
            return this;
        }

        /**
         * @param indepPassword Database password.
         * 
         * @return builder
         * 
         */
        public Builder indepPassword(String indepPassword) {
            return indepPassword(Output.of(indepPassword));
        }

        /**
         * @param proxyAccessId Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
         * 
         * @return builder
         * 
         */
        public Builder proxyAccessId(@Nullable Output<String> proxyAccessId) {
            $.proxyAccessId = proxyAccessId;
            return this;
        }

        /**
         * @param proxyAccessId Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
         * 
         * @return builder
         * 
         */
        public Builder proxyAccessId(String proxyAccessId) {
            return proxyAccessId(Output.of(proxyAccessId));
        }

        /**
         * @param proxyId The ID of the security agent.
         * 
         * @return builder
         * 
         */
        public Builder proxyId(Output<String> proxyId) {
            $.proxyId = proxyId;
            return this;
        }

        /**
         * @param proxyId The ID of the security agent.
         * 
         * @return builder
         * 
         */
        public Builder proxyId(String proxyId) {
            return proxyId(Output.of(proxyId));
        }

        /**
         * @param userId The user ID.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The user ID.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public EnterpriseProxyAccessArgs build() {
            $.proxyId = Objects.requireNonNull($.proxyId, "expected parameter 'proxyId' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}