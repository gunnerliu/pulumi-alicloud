// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InstanceBabelfishConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceBabelfishConfigArgs Empty = new InstanceBabelfishConfigArgs();

    /**
     * specifies whether to enable the Babelfish for the instance. If you set this parameter to **true**, you enable Babelfish for the instance. If you leave this parameter empty, you disable Babelfish for the instance.
     * 
     */
    @Import(name="babelfishEnabled", required=true)
    private Output<String> babelfishEnabled;

    /**
     * @return specifies whether to enable the Babelfish for the instance. If you set this parameter to **true**, you enable Babelfish for the instance. If you leave this parameter empty, you disable Babelfish for the instance.
     * 
     */
    public Output<String> babelfishEnabled() {
        return this.babelfishEnabled;
    }

    /**
     * The password of the administrator account. The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. It must be 8 to 32 characters in length. The password can contain any of the following characters:! @ # $ % ^ &amp; * () _ + - =
     * 
     */
    @Import(name="masterUserPassword", required=true)
    private Output<String> masterUserPassword;

    /**
     * @return The password of the administrator account. The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. It must be 8 to 32 characters in length. The password can contain any of the following characters:! @ # $ % ^ &amp; * () _ + - =
     * 
     */
    public Output<String> masterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * The name of the administrator account. The name can contain lowercase letters, digits, and underscores (_). It must start with a letter and end with a letter or digit. It can be up to 63 characters in length and cannot start with pg.
     * 
     */
    @Import(name="masterUsername", required=true)
    private Output<String> masterUsername;

    /**
     * @return The name of the administrator account. The name can contain lowercase letters, digits, and underscores (_). It must start with a letter and end with a letter or digit. It can be up to 63 characters in length and cannot start with pg.
     * 
     */
    public Output<String> masterUsername() {
        return this.masterUsername;
    }

    /**
     * The migration mode of the instance. Valid values: **single-db** and **multi-db**.
     * 
     */
    @Import(name="migrationMode", required=true)
    private Output<String> migrationMode;

    /**
     * @return The migration mode of the instance. Valid values: **single-db** and **multi-db**.
     * 
     */
    public Output<String> migrationMode() {
        return this.migrationMode;
    }

    private InstanceBabelfishConfigArgs() {}

    private InstanceBabelfishConfigArgs(InstanceBabelfishConfigArgs $) {
        this.babelfishEnabled = $.babelfishEnabled;
        this.masterUserPassword = $.masterUserPassword;
        this.masterUsername = $.masterUsername;
        this.migrationMode = $.migrationMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceBabelfishConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceBabelfishConfigArgs $;

        public Builder() {
            $ = new InstanceBabelfishConfigArgs();
        }

        public Builder(InstanceBabelfishConfigArgs defaults) {
            $ = new InstanceBabelfishConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param babelfishEnabled specifies whether to enable the Babelfish for the instance. If you set this parameter to **true**, you enable Babelfish for the instance. If you leave this parameter empty, you disable Babelfish for the instance.
         * 
         * @return builder
         * 
         */
        public Builder babelfishEnabled(Output<String> babelfishEnabled) {
            $.babelfishEnabled = babelfishEnabled;
            return this;
        }

        /**
         * @param babelfishEnabled specifies whether to enable the Babelfish for the instance. If you set this parameter to **true**, you enable Babelfish for the instance. If you leave this parameter empty, you disable Babelfish for the instance.
         * 
         * @return builder
         * 
         */
        public Builder babelfishEnabled(String babelfishEnabled) {
            return babelfishEnabled(Output.of(babelfishEnabled));
        }

        /**
         * @param masterUserPassword The password of the administrator account. The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. It must be 8 to 32 characters in length. The password can contain any of the following characters:! @ # $ % ^ &amp; * () _ + - =
         * 
         * @return builder
         * 
         */
        public Builder masterUserPassword(Output<String> masterUserPassword) {
            $.masterUserPassword = masterUserPassword;
            return this;
        }

        /**
         * @param masterUserPassword The password of the administrator account. The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. It must be 8 to 32 characters in length. The password can contain any of the following characters:! @ # $ % ^ &amp; * () _ + - =
         * 
         * @return builder
         * 
         */
        public Builder masterUserPassword(String masterUserPassword) {
            return masterUserPassword(Output.of(masterUserPassword));
        }

        /**
         * @param masterUsername The name of the administrator account. The name can contain lowercase letters, digits, and underscores (_). It must start with a letter and end with a letter or digit. It can be up to 63 characters in length and cannot start with pg.
         * 
         * @return builder
         * 
         */
        public Builder masterUsername(Output<String> masterUsername) {
            $.masterUsername = masterUsername;
            return this;
        }

        /**
         * @param masterUsername The name of the administrator account. The name can contain lowercase letters, digits, and underscores (_). It must start with a letter and end with a letter or digit. It can be up to 63 characters in length and cannot start with pg.
         * 
         * @return builder
         * 
         */
        public Builder masterUsername(String masterUsername) {
            return masterUsername(Output.of(masterUsername));
        }

        /**
         * @param migrationMode The migration mode of the instance. Valid values: **single-db** and **multi-db**.
         * 
         * @return builder
         * 
         */
        public Builder migrationMode(Output<String> migrationMode) {
            $.migrationMode = migrationMode;
            return this;
        }

        /**
         * @param migrationMode The migration mode of the instance. Valid values: **single-db** and **multi-db**.
         * 
         * @return builder
         * 
         */
        public Builder migrationMode(String migrationMode) {
            return migrationMode(Output.of(migrationMode));
        }

        public InstanceBabelfishConfigArgs build() {
            $.babelfishEnabled = Objects.requireNonNull($.babelfishEnabled, "expected parameter 'babelfishEnabled' to be non-null");
            $.masterUserPassword = Objects.requireNonNull($.masterUserPassword, "expected parameter 'masterUserPassword' to be non-null");
            $.masterUsername = Objects.requireNonNull($.masterUsername, "expected parameter 'masterUsername' to be non-null");
            $.migrationMode = Objects.requireNonNull($.migrationMode, "expected parameter 'migrationMode' to be non-null");
            return $;
        }
    }

}