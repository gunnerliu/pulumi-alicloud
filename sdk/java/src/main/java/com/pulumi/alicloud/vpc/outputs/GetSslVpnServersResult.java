// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetSslVpnServersServer;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSslVpnServersResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of SSL-VPN server IDs.
     * 
     */
    private final List<String> ids;
    private final @Nullable String nameRegex;
    /**
     * @return A list of SSL-VPN server names.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;
    /**
     * @return A list of SSL-VPN servers. Each element contains the following attributes:
     * 
     */
    private final List<GetSslVpnServersServer> servers;
    /**
     * @return The ID of the VPN gateway instance.
     * 
     */
    private final @Nullable String vpnGatewayId;

    @CustomType.Constructor
    private GetSslVpnServersResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("servers") List<GetSslVpnServersServer> servers,
        @CustomType.Parameter("vpnGatewayId") @Nullable String vpnGatewayId) {
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.servers = servers;
        this.vpnGatewayId = vpnGatewayId;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of SSL-VPN server IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of SSL-VPN server names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of SSL-VPN servers. Each element contains the following attributes:
     * 
     */
    public List<GetSslVpnServersServer> servers() {
        return this.servers;
    }
    /**
     * @return The ID of the VPN gateway instance.
     * 
     */
    public Optional<String> vpnGatewayId() {
        return Optional.ofNullable(this.vpnGatewayId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSslVpnServersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetSslVpnServersServer> servers;
        private @Nullable String vpnGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSslVpnServersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.servers = defaults.servers;
    	      this.vpnGatewayId = defaults.vpnGatewayId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder servers(List<GetSslVpnServersServer> servers) {
            this.servers = Objects.requireNonNull(servers);
            return this;
        }
        public Builder servers(GetSslVpnServersServer... servers) {
            return servers(List.of(servers));
        }
        public Builder vpnGatewayId(@Nullable String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }        public GetSslVpnServersResult build() {
            return new GetSslVpnServersResult(id, ids, nameRegex, names, outputFile, servers, vpnGatewayId);
        }
    }
}
