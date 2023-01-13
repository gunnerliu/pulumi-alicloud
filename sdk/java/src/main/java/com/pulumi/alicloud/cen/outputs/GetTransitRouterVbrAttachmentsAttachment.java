// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransitRouterVbrAttachmentsAttachment {
    /**
     * @return ID of the region where the conflicted VBR is located.
     * 
     */
    private Boolean autoPublishRouteEnabled;
    private String id;
    /**
     * @return Type of the resource.
     * 
     */
    private String resourceType;
    /**
     * @return The status of the resource. Valid values `Attached`, `Attaching` and `Detaching`.
     * 
     */
    private String status;
    private String transitRouterAttachmentDescription;
    /**
     * @return ID of the transit router VBR attachment.
     * 
     */
    private String transitRouterAttachmentId;
    /**
     * @return Name of the transit router attachment.
     * 
     */
    private String transitRouterAttachmentName;
    /**
     * @return ID of the VBR.
     * 
     */
    private String vbrId;
    /**
     * @return The Owner ID of the VBR.
     * 
     */
    private String vbrOwnerId;

    private GetTransitRouterVbrAttachmentsAttachment() {}
    /**
     * @return ID of the region where the conflicted VBR is located.
     * 
     */
    public Boolean autoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Type of the resource.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return The status of the resource. Valid values `Attached`, `Attaching` and `Detaching`.
     * 
     */
    public String status() {
        return this.status;
    }
    public String transitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
    }
    /**
     * @return ID of the transit router VBR attachment.
     * 
     */
    public String transitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }
    /**
     * @return Name of the transit router attachment.
     * 
     */
    public String transitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }
    /**
     * @return ID of the VBR.
     * 
     */
    public String vbrId() {
        return this.vbrId;
    }
    /**
     * @return The Owner ID of the VBR.
     * 
     */
    public String vbrOwnerId() {
        return this.vbrOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitRouterVbrAttachmentsAttachment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autoPublishRouteEnabled;
        private String id;
        private String resourceType;
        private String status;
        private String transitRouterAttachmentDescription;
        private String transitRouterAttachmentId;
        private String transitRouterAttachmentName;
        private String vbrId;
        private String vbrOwnerId;
        public Builder() {}
        public Builder(GetTransitRouterVbrAttachmentsAttachment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoPublishRouteEnabled = defaults.autoPublishRouteEnabled;
    	      this.id = defaults.id;
    	      this.resourceType = defaults.resourceType;
    	      this.status = defaults.status;
    	      this.transitRouterAttachmentDescription = defaults.transitRouterAttachmentDescription;
    	      this.transitRouterAttachmentId = defaults.transitRouterAttachmentId;
    	      this.transitRouterAttachmentName = defaults.transitRouterAttachmentName;
    	      this.vbrId = defaults.vbrId;
    	      this.vbrOwnerId = defaults.vbrOwnerId;
        }

        @CustomType.Setter
        public Builder autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
            this.autoPublishRouteEnabled = Objects.requireNonNull(autoPublishRouteEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
            this.transitRouterAttachmentDescription = Objects.requireNonNull(transitRouterAttachmentDescription);
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = Objects.requireNonNull(transitRouterAttachmentId);
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterAttachmentName(String transitRouterAttachmentName) {
            this.transitRouterAttachmentName = Objects.requireNonNull(transitRouterAttachmentName);
            return this;
        }
        @CustomType.Setter
        public Builder vbrId(String vbrId) {
            this.vbrId = Objects.requireNonNull(vbrId);
            return this;
        }
        @CustomType.Setter
        public Builder vbrOwnerId(String vbrOwnerId) {
            this.vbrOwnerId = Objects.requireNonNull(vbrOwnerId);
            return this;
        }
        public GetTransitRouterVbrAttachmentsAttachment build() {
            final var o = new GetTransitRouterVbrAttachmentsAttachment();
            o.autoPublishRouteEnabled = autoPublishRouteEnabled;
            o.id = id;
            o.resourceType = resourceType;
            o.status = status;
            o.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
            o.transitRouterAttachmentId = transitRouterAttachmentId;
            o.transitRouterAttachmentName = transitRouterAttachmentName;
            o.vbrId = vbrId;
            o.vbrOwnerId = vbrOwnerId;
            return o;
        }
    }
}
