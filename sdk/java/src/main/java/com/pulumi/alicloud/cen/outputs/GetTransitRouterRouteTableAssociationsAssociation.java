// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransitRouterRouteTableAssociationsAssociation {
    private String id;
    /**
     * @return ID of the transit router route table association.
     * 
     */
    private String resourceId;
    /**
     * @return Type of the resource.
     * 
     */
    private String resourceType;
    /**
     * @return The status of the route table, including `Active`, `Associating`, `Dissociating`.
     * 
     */
    private String status;
    /**
     * @return The ID of the network instance connection.
     * 
     */
    private String transitRouterAttachmentId;
    /**
     * @return The ID of the route table of the Enterprise Edition transit router.
     * 
     */
    private String transitRouterRouteTableId;

    private GetTransitRouterRouteTableAssociationsAssociation() {}
    public String id() {
        return this.id;
    }
    /**
     * @return ID of the transit router route table association.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }
    /**
     * @return Type of the resource.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return The status of the route table, including `Active`, `Associating`, `Dissociating`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The ID of the network instance connection.
     * 
     */
    public String transitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }
    /**
     * @return The ID of the route table of the Enterprise Edition transit router.
     * 
     */
    public String transitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitRouterRouteTableAssociationsAssociation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String resourceId;
        private String resourceType;
        private String status;
        private String transitRouterAttachmentId;
        private String transitRouterRouteTableId;
        public Builder() {}
        public Builder(GetTransitRouterRouteTableAssociationsAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
    	      this.status = defaults.status;
    	      this.transitRouterAttachmentId = defaults.transitRouterAttachmentId;
    	      this.transitRouterRouteTableId = defaults.transitRouterRouteTableId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = Objects.requireNonNull(transitRouterAttachmentId);
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            this.transitRouterRouteTableId = Objects.requireNonNull(transitRouterRouteTableId);
            return this;
        }
        public GetTransitRouterRouteTableAssociationsAssociation build() {
            final var _resultValue = new GetTransitRouterRouteTableAssociationsAssociation();
            _resultValue.id = id;
            _resultValue.resourceId = resourceId;
            _resultValue.resourceType = resourceType;
            _resultValue.status = status;
            _resultValue.transitRouterAttachmentId = transitRouterAttachmentId;
            _resultValue.transitRouterRouteTableId = transitRouterRouteTableId;
            return _resultValue;
        }
    }
}
