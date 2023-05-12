// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.alicloud.cr.outputs.GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVpcEndpointLinkedVpcsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    /**
     * @return The ID of the instance.
     * 
     */
    private final String instanceId;
    /**
     * @return The name of the module that you want to access.
     * 
     */
    private final String moduleName;
    private final @Nullable String outputFile;
    /**
     * @return The status of the Vpc Endpoint Linked Vpc.
     * 
     */
    private final @Nullable String status;
    /**
     * @return A list of CR Vpc Endpoint Linked Vpcs. Each element contains the following attributes:
     * 
     */
    private final List<GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc> vpcEndpointLinkedVpcs;

    @CustomType.Constructor
    private GetVpcEndpointLinkedVpcsResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("moduleName") String moduleName,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("vpcEndpointLinkedVpcs") List<GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc> vpcEndpointLinkedVpcs) {
        this.id = id;
        this.ids = ids;
        this.instanceId = instanceId;
        this.moduleName = moduleName;
        this.outputFile = outputFile;
        this.status = status;
        this.vpcEndpointLinkedVpcs = vpcEndpointLinkedVpcs;
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
    /**
     * @return The ID of the instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The name of the module that you want to access.
     * 
     */
    public String moduleName() {
        return this.moduleName;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The status of the Vpc Endpoint Linked Vpc.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return A list of CR Vpc Endpoint Linked Vpcs. Each element contains the following attributes:
     * 
     */
    public List<GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc> vpcEndpointLinkedVpcs() {
        return this.vpcEndpointLinkedVpcs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcEndpointLinkedVpcsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private String instanceId;
        private String moduleName;
        private @Nullable String outputFile;
        private @Nullable String status;
        private List<GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc> vpcEndpointLinkedVpcs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcEndpointLinkedVpcsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.moduleName = defaults.moduleName;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
    	      this.vpcEndpointLinkedVpcs = defaults.vpcEndpointLinkedVpcs;
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
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder moduleName(String moduleName) {
            this.moduleName = Objects.requireNonNull(moduleName);
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder vpcEndpointLinkedVpcs(List<GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc> vpcEndpointLinkedVpcs) {
            this.vpcEndpointLinkedVpcs = Objects.requireNonNull(vpcEndpointLinkedVpcs);
            return this;
        }
        public Builder vpcEndpointLinkedVpcs(GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc... vpcEndpointLinkedVpcs) {
            return vpcEndpointLinkedVpcs(List.of(vpcEndpointLinkedVpcs));
        }        public GetVpcEndpointLinkedVpcsResult build() {
            return new GetVpcEndpointLinkedVpcsResult(id, ids, instanceId, moduleName, outputFile, status, vpcEndpointLinkedVpcs);
        }
    }
}
