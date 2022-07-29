// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.adb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * Prefix of the cluster public endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter. Default to `&lt;db_cluster_id&gt; + tf`.
     * 
     */
    @Import(name="connectionPrefix")
    private @Nullable Output<String> connectionPrefix;

    /**
     * @return Prefix of the cluster public endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter. Default to `&lt;db_cluster_id&gt; + tf`.
     * 
     */
    public Optional<Output<String>> connectionPrefix() {
        return Optional.ofNullable(this.connectionPrefix);
    }

    /**
     * The Id of cluster that can run database.
     * 
     */
    @Import(name="dbClusterId", required=true)
    private Output<String> dbClusterId;

    /**
     * @return The Id of cluster that can run database.
     * 
     */
    public Output<String> dbClusterId() {
        return this.dbClusterId;
    }

    private ConnectionArgs() {}

    private ConnectionArgs(ConnectionArgs $) {
        this.connectionPrefix = $.connectionPrefix;
        this.dbClusterId = $.dbClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionArgs $;

        public Builder() {
            $ = new ConnectionArgs();
        }

        public Builder(ConnectionArgs defaults) {
            $ = new ConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionPrefix Prefix of the cluster public endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter. Default to `&lt;db_cluster_id&gt; + tf`.
         * 
         * @return builder
         * 
         */
        public Builder connectionPrefix(@Nullable Output<String> connectionPrefix) {
            $.connectionPrefix = connectionPrefix;
            return this;
        }

        /**
         * @param connectionPrefix Prefix of the cluster public endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter. Default to `&lt;db_cluster_id&gt; + tf`.
         * 
         * @return builder
         * 
         */
        public Builder connectionPrefix(String connectionPrefix) {
            return connectionPrefix(Output.of(connectionPrefix));
        }

        /**
         * @param dbClusterId The Id of cluster that can run database.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterId(Output<String> dbClusterId) {
            $.dbClusterId = dbClusterId;
            return this;
        }

        /**
         * @param dbClusterId The Id of cluster that can run database.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterId(String dbClusterId) {
            return dbClusterId(Output.of(dbClusterId));
        }

        public ConnectionArgs build() {
            $.dbClusterId = Objects.requireNonNull($.dbClusterId, "expected parameter 'dbClusterId' to be non-null");
            return $;
        }
    }

}
