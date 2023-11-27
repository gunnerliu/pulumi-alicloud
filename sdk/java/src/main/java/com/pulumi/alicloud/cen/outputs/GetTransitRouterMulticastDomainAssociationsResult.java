// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.alicloud.cen.outputs.GetTransitRouterMulticastDomainAssociationsAssociation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTransitRouterMulticastDomainAssociationsResult {
    /**
     * @return A list of Cen Transit Router Multicast Domain Associations. Each element contains the following attributes:
     * 
     */
    private List<GetTransitRouterMulticastDomainAssociationsAssociation> associations;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String outputFile;
    /**
     * @return The ID of the resource associated with the multicast domain.
     * 
     */
    private @Nullable String resourceId;
    /**
     * @return The type of resource associated with the multicast domain.
     * 
     */
    private @Nullable String resourceType;
    /**
     * @return The status of the associated resource.
     * 
     */
    private @Nullable String status;
    /**
     * @return The ID of the network instance connection.
     * 
     */
    private @Nullable String transitRouterAttachmentId;
    /**
     * @return The ID of the multicast domain.
     * 
     */
    private String transitRouterMulticastDomainId;
    /**
     * @return The ID of the vSwitch.
     * 
     */
    private @Nullable String vswitchId;

    private GetTransitRouterMulticastDomainAssociationsResult() {}
    /**
     * @return A list of Cen Transit Router Multicast Domain Associations. Each element contains the following attributes:
     * 
     */
    public List<GetTransitRouterMulticastDomainAssociationsAssociation> associations() {
        return this.associations;
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
    /**
     * @return The ID of the resource associated with the multicast domain.
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * @return The type of resource associated with the multicast domain.
     * 
     */
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    /**
     * @return The status of the associated resource.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The ID of the network instance connection.
     * 
     */
    public Optional<String> transitRouterAttachmentId() {
        return Optional.ofNullable(this.transitRouterAttachmentId);
    }
    /**
     * @return The ID of the multicast domain.
     * 
     */
    public String transitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }
    /**
     * @return The ID of the vSwitch.
     * 
     */
    public Optional<String> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitRouterMulticastDomainAssociationsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTransitRouterMulticastDomainAssociationsAssociation> associations;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private @Nullable String resourceId;
        private @Nullable String resourceType;
        private @Nullable String status;
        private @Nullable String transitRouterAttachmentId;
        private String transitRouterMulticastDomainId;
        private @Nullable String vswitchId;
        public Builder() {}
        public Builder(GetTransitRouterMulticastDomainAssociationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associations = defaults.associations;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
    	      this.status = defaults.status;
    	      this.transitRouterAttachmentId = defaults.transitRouterAttachmentId;
    	      this.transitRouterMulticastDomainId = defaults.transitRouterMulticastDomainId;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder associations(List<GetTransitRouterMulticastDomainAssociationsAssociation> associations) {
            this.associations = Objects.requireNonNull(associations);
            return this;
        }
        public Builder associations(GetTransitRouterMulticastDomainAssociationsAssociation... associations) {
            return associations(List.of(associations));
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
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterAttachmentId(@Nullable String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            this.transitRouterMulticastDomainId = Objects.requireNonNull(transitRouterMulticastDomainId);
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(@Nullable String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public GetTransitRouterMulticastDomainAssociationsResult build() {
            final var _resultValue = new GetTransitRouterMulticastDomainAssociationsResult();
            _resultValue.associations = associations;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.outputFile = outputFile;
            _resultValue.resourceId = resourceId;
            _resultValue.resourceType = resourceType;
            _resultValue.status = status;
            _resultValue.transitRouterAttachmentId = transitRouterAttachmentId;
            _resultValue.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            _resultValue.vswitchId = vswitchId;
            return _resultValue;
        }
    }
}
