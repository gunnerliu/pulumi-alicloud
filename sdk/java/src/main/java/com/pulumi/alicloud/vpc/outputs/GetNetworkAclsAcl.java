// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetNetworkAclsAclEgressAclEntry;
import com.pulumi.alicloud.vpc.outputs.GetNetworkAclsAclIngressAclEntry;
import com.pulumi.alicloud.vpc.outputs.GetNetworkAclsAclResource;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworkAclsAcl {
    /**
     * @return Description of the entry direction rule.
     * 
     */
    private String description;
    /**
     * @return Output direction rule information.
     * 
     */
    private List<GetNetworkAclsAclEgressAclEntry> egressAclEntries;
    /**
     * @return The ID of the Network Acl.
     * 
     */
    private String id;
    /**
     * @return Entry direction rule information.
     * 
     */
    private List<GetNetworkAclsAclIngressAclEntry> ingressAclEntries;
    /**
     * @return The first ID of the resource.
     * 
     */
    private String networkAclId;
    /**
     * @return The name of the network ACL.
     * 
     */
    private String networkAclName;
    /**
     * @return The associated resource.
     * 
     */
    private List<GetNetworkAclsAclResource> resources;
    /**
     * @return The state of the network ACL.
     * 
     */
    private String status;
    /**
     * @return The ID of the associated VPC.
     * 
     */
    private String vpcId;

    private GetNetworkAclsAcl() {}
    /**
     * @return Description of the entry direction rule.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Output direction rule information.
     * 
     */
    public List<GetNetworkAclsAclEgressAclEntry> egressAclEntries() {
        return this.egressAclEntries;
    }
    /**
     * @return The ID of the Network Acl.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Entry direction rule information.
     * 
     */
    public List<GetNetworkAclsAclIngressAclEntry> ingressAclEntries() {
        return this.ingressAclEntries;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String networkAclId() {
        return this.networkAclId;
    }
    /**
     * @return The name of the network ACL.
     * 
     */
    public String networkAclName() {
        return this.networkAclName;
    }
    /**
     * @return The associated resource.
     * 
     */
    public List<GetNetworkAclsAclResource> resources() {
        return this.resources;
    }
    /**
     * @return The state of the network ACL.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The ID of the associated VPC.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkAclsAcl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private List<GetNetworkAclsAclEgressAclEntry> egressAclEntries;
        private String id;
        private List<GetNetworkAclsAclIngressAclEntry> ingressAclEntries;
        private String networkAclId;
        private String networkAclName;
        private List<GetNetworkAclsAclResource> resources;
        private String status;
        private String vpcId;
        public Builder() {}
        public Builder(GetNetworkAclsAcl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.egressAclEntries = defaults.egressAclEntries;
    	      this.id = defaults.id;
    	      this.ingressAclEntries = defaults.ingressAclEntries;
    	      this.networkAclId = defaults.networkAclId;
    	      this.networkAclName = defaults.networkAclName;
    	      this.resources = defaults.resources;
    	      this.status = defaults.status;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder egressAclEntries(List<GetNetworkAclsAclEgressAclEntry> egressAclEntries) {
            this.egressAclEntries = Objects.requireNonNull(egressAclEntries);
            return this;
        }
        public Builder egressAclEntries(GetNetworkAclsAclEgressAclEntry... egressAclEntries) {
            return egressAclEntries(List.of(egressAclEntries));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ingressAclEntries(List<GetNetworkAclsAclIngressAclEntry> ingressAclEntries) {
            this.ingressAclEntries = Objects.requireNonNull(ingressAclEntries);
            return this;
        }
        public Builder ingressAclEntries(GetNetworkAclsAclIngressAclEntry... ingressAclEntries) {
            return ingressAclEntries(List.of(ingressAclEntries));
        }
        @CustomType.Setter
        public Builder networkAclId(String networkAclId) {
            this.networkAclId = Objects.requireNonNull(networkAclId);
            return this;
        }
        @CustomType.Setter
        public Builder networkAclName(String networkAclName) {
            this.networkAclName = Objects.requireNonNull(networkAclName);
            return this;
        }
        @CustomType.Setter
        public Builder resources(List<GetNetworkAclsAclResource> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(GetNetworkAclsAclResource... resources) {
            return resources(List.of(resources));
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetNetworkAclsAcl build() {
            final var _resultValue = new GetNetworkAclsAcl();
            _resultValue.description = description;
            _resultValue.egressAclEntries = egressAclEntries;
            _resultValue.id = id;
            _resultValue.ingressAclEntries = ingressAclEntries;
            _resultValue.networkAclId = networkAclId;
            _resultValue.networkAclName = networkAclName;
            _resultValue.resources = resources;
            _resultValue.status = status;
            _resultValue.vpcId = vpcId;
            return _resultValue;
        }
    }
}
