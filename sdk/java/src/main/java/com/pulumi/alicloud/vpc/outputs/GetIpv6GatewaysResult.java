// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetIpv6GatewaysGateway;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIpv6GatewaysResult {
    private final List<GetIpv6GatewaysGateway> gateways;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String ipv6GatewayName;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final @Nullable String outputFile;
    private final @Nullable String status;
    private final @Nullable String vpcId;

    @CustomType.Constructor
    private GetIpv6GatewaysResult(
        @CustomType.Parameter("gateways") List<GetIpv6GatewaysGateway> gateways,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("ipv6GatewayName") @Nullable String ipv6GatewayName,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("vpcId") @Nullable String vpcId) {
        this.gateways = gateways;
        this.id = id;
        this.ids = ids;
        this.ipv6GatewayName = ipv6GatewayName;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.status = status;
        this.vpcId = vpcId;
    }

    public List<GetIpv6GatewaysGateway> gateways() {
        return this.gateways;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> ipv6GatewayName() {
        return Optional.ofNullable(this.ipv6GatewayName);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpv6GatewaysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetIpv6GatewaysGateway> gateways;
        private String id;
        private List<String> ids;
        private @Nullable String ipv6GatewayName;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String status;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIpv6GatewaysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gateways = defaults.gateways;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.ipv6GatewayName = defaults.ipv6GatewayName;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder gateways(List<GetIpv6GatewaysGateway> gateways) {
            this.gateways = Objects.requireNonNull(gateways);
            return this;
        }
        public Builder gateways(GetIpv6GatewaysGateway... gateways) {
            return gateways(List.of(gateways));
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
        public Builder ipv6GatewayName(@Nullable String ipv6GatewayName) {
            this.ipv6GatewayName = ipv6GatewayName;
            return this;
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
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }        public GetIpv6GatewaysResult build() {
            return new GetIpv6GatewaysResult(gateways, id, ids, ipv6GatewayName, nameRegex, names, outputFile, status, vpcId);
        }
    }
}
