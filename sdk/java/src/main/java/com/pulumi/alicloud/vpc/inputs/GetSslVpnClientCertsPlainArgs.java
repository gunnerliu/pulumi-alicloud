// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSslVpnClientCertsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSslVpnClientCertsPlainArgs Empty = new GetSslVpnClientCertsPlainArgs();

    /**
     * IDs of the SSL-VPN client certificates.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return IDs of the SSL-VPN client certificates.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string of SSL-VPN client certificate name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string of SSL-VPN client certificate name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * Save the result to the file.
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return Save the result to the file.
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * Use the SSL-VPN server ID as the search key.
     * 
     */
    @Import(name="sslVpnServerId")
    private @Nullable String sslVpnServerId;

    /**
     * @return Use the SSL-VPN server ID as the search key.
     * 
     */
    public Optional<String> sslVpnServerId() {
        return Optional.ofNullable(this.sslVpnServerId);
    }

    private GetSslVpnClientCertsPlainArgs() {}

    private GetSslVpnClientCertsPlainArgs(GetSslVpnClientCertsPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.sslVpnServerId = $.sslVpnServerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSslVpnClientCertsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSslVpnClientCertsPlainArgs $;

        public Builder() {
            $ = new GetSslVpnClientCertsPlainArgs();
        }

        public Builder(GetSslVpnClientCertsPlainArgs defaults) {
            $ = new GetSslVpnClientCertsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids IDs of the SSL-VPN client certificates.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids IDs of the SSL-VPN client certificates.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string of SSL-VPN client certificate name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param outputFile Save the result to the file.
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param sslVpnServerId Use the SSL-VPN server ID as the search key.
         * 
         * @return builder
         * 
         */
        public Builder sslVpnServerId(@Nullable String sslVpnServerId) {
            $.sslVpnServerId = sslVpnServerId;
            return this;
        }

        public GetSslVpnClientCertsPlainArgs build() {
            return $;
        }
    }

}