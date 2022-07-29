// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSslVpnServersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSslVpnServersArgs Empty = new GetSslVpnServersArgs();

    /**
     * IDs of the SSL-VPN servers.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return IDs of the SSL-VPN servers.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string of SSL-VPN server name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string of SSL-VPN server name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * Save the result to the file.
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return Save the result to the file.
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * Use the VPN gateway ID as the search key.
     * 
     */
    @Import(name="vpnGatewayId")
    private @Nullable Output<String> vpnGatewayId;

    /**
     * @return Use the VPN gateway ID as the search key.
     * 
     */
    public Optional<Output<String>> vpnGatewayId() {
        return Optional.ofNullable(this.vpnGatewayId);
    }

    private GetSslVpnServersArgs() {}

    private GetSslVpnServersArgs(GetSslVpnServersArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.vpnGatewayId = $.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSslVpnServersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSslVpnServersArgs $;

        public Builder() {
            $ = new GetSslVpnServersArgs();
        }

        public Builder(GetSslVpnServersArgs defaults) {
            $ = new GetSslVpnServersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids IDs of the SSL-VPN servers.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids IDs of the SSL-VPN servers.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids IDs of the SSL-VPN servers.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string of SSL-VPN server name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string of SSL-VPN server name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        /**
         * @param outputFile Save the result to the file.
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile Save the result to the file.
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param vpnGatewayId Use the VPN gateway ID as the search key.
         * 
         * @return builder
         * 
         */
        public Builder vpnGatewayId(@Nullable Output<String> vpnGatewayId) {
            $.vpnGatewayId = vpnGatewayId;
            return this;
        }

        /**
         * @param vpnGatewayId Use the VPN gateway ID as the search key.
         * 
         * @return builder
         * 
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            return vpnGatewayId(Output.of(vpnGatewayId));
        }

        public GetSslVpnServersArgs build() {
            return $;
        }
    }

}
