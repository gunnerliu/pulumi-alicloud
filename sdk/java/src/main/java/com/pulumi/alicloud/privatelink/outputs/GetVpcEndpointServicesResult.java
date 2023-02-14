// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink.outputs;

import com.pulumi.alicloud.privatelink.outputs.GetVpcEndpointServicesService;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVpcEndpointServicesResult {
    private @Nullable Boolean autoAcceptConnection;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String serviceBusinessStatus;
    private List<GetVpcEndpointServicesService> services;
    private @Nullable String status;
    private @Nullable String vpcEndpointServiceName;

    private GetVpcEndpointServicesResult() {}
    public Optional<Boolean> autoAcceptConnection() {
        return Optional.ofNullable(this.autoAcceptConnection);
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
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> serviceBusinessStatus() {
        return Optional.ofNullable(this.serviceBusinessStatus);
    }
    public List<GetVpcEndpointServicesService> services() {
        return this.services;
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> vpcEndpointServiceName() {
        return Optional.ofNullable(this.vpcEndpointServiceName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcEndpointServicesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoAcceptConnection;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String serviceBusinessStatus;
        private List<GetVpcEndpointServicesService> services;
        private @Nullable String status;
        private @Nullable String vpcEndpointServiceName;
        public Builder() {}
        public Builder(GetVpcEndpointServicesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoAcceptConnection = defaults.autoAcceptConnection;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.serviceBusinessStatus = defaults.serviceBusinessStatus;
    	      this.services = defaults.services;
    	      this.status = defaults.status;
    	      this.vpcEndpointServiceName = defaults.vpcEndpointServiceName;
        }

        @CustomType.Setter
        public Builder autoAcceptConnection(@Nullable Boolean autoAcceptConnection) {
            this.autoAcceptConnection = autoAcceptConnection;
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
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder serviceBusinessStatus(@Nullable String serviceBusinessStatus) {
            this.serviceBusinessStatus = serviceBusinessStatus;
            return this;
        }
        @CustomType.Setter
        public Builder services(List<GetVpcEndpointServicesService> services) {
            this.services = Objects.requireNonNull(services);
            return this;
        }
        public Builder services(GetVpcEndpointServicesService... services) {
            return services(List.of(services));
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder vpcEndpointServiceName(@Nullable String vpcEndpointServiceName) {
            this.vpcEndpointServiceName = vpcEndpointServiceName;
            return this;
        }
        public GetVpcEndpointServicesResult build() {
            final var o = new GetVpcEndpointServicesResult();
            o.autoAcceptConnection = autoAcceptConnection;
            o.id = id;
            o.ids = ids;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            o.serviceBusinessStatus = serviceBusinessStatus;
            o.services = services;
            o.status = status;
            o.vpcEndpointServiceName = vpcEndpointServiceName;
            return o;
        }
    }
}