// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudstoragegateway.outputs;

import com.pulumi.alicloud.cloudstoragegateway.outputs.GetGatewayCacheDisksDisk;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGatewayCacheDisksResult {
    private List<GetGatewayCacheDisksDisk> disks;
    private String gatewayId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String outputFile;
    private @Nullable Integer status;

    private GetGatewayCacheDisksResult() {}
    public List<GetGatewayCacheDisksDisk> disks() {
        return this.disks;
    }
    public String gatewayId() {
        return this.gatewayId;
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
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayCacheDisksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGatewayCacheDisksDisk> disks;
        private String gatewayId;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private @Nullable Integer status;
        public Builder() {}
        public Builder(GetGatewayCacheDisksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disks = defaults.disks;
    	      this.gatewayId = defaults.gatewayId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder disks(List<GetGatewayCacheDisksDisk> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }
        public Builder disks(GetGatewayCacheDisksDisk... disks) {
            return disks(List.of(disks));
        }
        @CustomType.Setter
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable Integer status) {
            this.status = status;
            return this;
        }
        public GetGatewayCacheDisksResult build() {
            final var o = new GetGatewayCacheDisksResult();
            o.disks = disks;
            o.gatewayId = gatewayId;
            o.id = id;
            o.ids = ids;
            o.outputFile = outputFile;
            o.status = status;
            return o;
        }
    }
}
