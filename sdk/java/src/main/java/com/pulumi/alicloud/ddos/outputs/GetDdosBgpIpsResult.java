// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos.outputs;

import com.pulumi.alicloud.ddos.outputs.GetDdosBgpIpsIp;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDdosBgpIpsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private String instanceId;
    private List<GetDdosBgpIpsIp> ips;
    private @Nullable String outputFile;
    private @Nullable Integer pageNumber;
    private @Nullable Integer pageSize;
    private @Nullable String productName;
    private @Nullable String status;

    private GetDdosBgpIpsResult() {}
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
    public String instanceId() {
        return this.instanceId;
    }
    public List<GetDdosBgpIpsIp> ips() {
        return this.ips;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }
    public Optional<String> productName() {
        return Optional.ofNullable(this.productName);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDdosBgpIpsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private String instanceId;
        private List<GetDdosBgpIpsIp> ips;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        private @Nullable String productName;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetDdosBgpIpsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.ips = defaults.ips;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
    	      this.productName = defaults.productName;
    	      this.status = defaults.status;
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
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder ips(List<GetDdosBgpIpsIp> ips) {
            this.ips = Objects.requireNonNull(ips);
            return this;
        }
        public Builder ips(GetDdosBgpIpsIp... ips) {
            return ips(List.of(ips));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder pageNumber(@Nullable Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        @CustomType.Setter
        public Builder pageSize(@Nullable Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        @CustomType.Setter
        public Builder productName(@Nullable String productName) {
            this.productName = productName;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public GetDdosBgpIpsResult build() {
            final var o = new GetDdosBgpIpsResult();
            o.id = id;
            o.ids = ids;
            o.instanceId = instanceId;
            o.ips = ips;
            o.outputFile = outputFile;
            o.pageNumber = pageNumber;
            o.pageSize = pageSize;
            o.productName = productName;
            o.status = status;
            return o;
        }
    }
}
