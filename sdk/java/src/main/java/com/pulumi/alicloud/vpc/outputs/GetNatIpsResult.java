// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetNatIpsIp;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNatIpsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final List<GetNatIpsIp> ips;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final String natGatewayId;
    private final @Nullable String natIpCidr;
    private final @Nullable List<String> natIpIds;
    private final @Nullable List<String> natIpNames;
    private final @Nullable String outputFile;
    private final @Nullable String status;

    @CustomType.Constructor
    private GetNatIpsResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("ips") List<GetNatIpsIp> ips,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("natGatewayId") String natGatewayId,
        @CustomType.Parameter("natIpCidr") @Nullable String natIpCidr,
        @CustomType.Parameter("natIpIds") @Nullable List<String> natIpIds,
        @CustomType.Parameter("natIpNames") @Nullable List<String> natIpNames,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("status") @Nullable String status) {
        this.id = id;
        this.ids = ids;
        this.ips = ips;
        this.nameRegex = nameRegex;
        this.names = names;
        this.natGatewayId = natGatewayId;
        this.natIpCidr = natIpCidr;
        this.natIpIds = natIpIds;
        this.natIpNames = natIpNames;
        this.outputFile = outputFile;
        this.status = status;
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
    public List<GetNatIpsIp> ips() {
        return this.ips;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public String natGatewayId() {
        return this.natGatewayId;
    }
    public Optional<String> natIpCidr() {
        return Optional.ofNullable(this.natIpCidr);
    }
    public List<String> natIpIds() {
        return this.natIpIds == null ? List.of() : this.natIpIds;
    }
    public List<String> natIpNames() {
        return this.natIpNames == null ? List.of() : this.natIpNames;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatIpsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private List<GetNatIpsIp> ips;
        private @Nullable String nameRegex;
        private List<String> names;
        private String natGatewayId;
        private @Nullable String natIpCidr;
        private @Nullable List<String> natIpIds;
        private @Nullable List<String> natIpNames;
        private @Nullable String outputFile;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNatIpsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.ips = defaults.ips;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.natGatewayId = defaults.natGatewayId;
    	      this.natIpCidr = defaults.natIpCidr;
    	      this.natIpIds = defaults.natIpIds;
    	      this.natIpNames = defaults.natIpNames;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
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
        public Builder ips(List<GetNatIpsIp> ips) {
            this.ips = Objects.requireNonNull(ips);
            return this;
        }
        public Builder ips(GetNatIpsIp... ips) {
            return ips(List.of(ips));
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
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = Objects.requireNonNull(natGatewayId);
            return this;
        }
        public Builder natIpCidr(@Nullable String natIpCidr) {
            this.natIpCidr = natIpCidr;
            return this;
        }
        public Builder natIpIds(@Nullable List<String> natIpIds) {
            this.natIpIds = natIpIds;
            return this;
        }
        public Builder natIpIds(String... natIpIds) {
            return natIpIds(List.of(natIpIds));
        }
        public Builder natIpNames(@Nullable List<String> natIpNames) {
            this.natIpNames = natIpNames;
            return this;
        }
        public Builder natIpNames(String... natIpNames) {
            return natIpNames(List.of(natIpNames));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetNatIpsResult build() {
            return new GetNatIpsResult(id, ids, ips, nameRegex, names, natGatewayId, natIpCidr, natIpIds, natIpNames, outputFile, status);
        }
    }
}
