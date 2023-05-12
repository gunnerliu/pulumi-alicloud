// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.alicloud.cen.outputs.GetTransitRouterVpnAttachmentsAttachmentZone;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTransitRouterVpnAttachmentsAttachment {
    /**
     * @return Whether to allow the forwarding router instance to automatically publish routing entries to IPsec connections.
     * 
     */
    private final Boolean autoPublishRouteEnabled;
    /**
     * @return The creation time of the resource.
     * 
     */
    private final String createTime;
    private final String id;
    /**
     * @return Type of the resource.
     * 
     */
    private final String resourceType;
    /**
     * @return The status of the transit router attachment.
     * 
     */
    private final String status;
    /**
     * @return The description of the VPN connection.
     * 
     */
    private final String transitRouterAttachmentDescription;
    private final String transitRouterAttachmentId;
    /**
     * @return The name of the VPN connection.
     * 
     */
    private final String transitRouterAttachmentName;
    /**
     * @return The ID of the forwarding router instance.
     * 
     */
    private final String transitRouterId;
    /**
     * @return The id of the vpn.
     * 
     */
    private final String vpnId;
    /**
     * @return The owner id of vpn.
     * 
     */
    private final String vpnOwnerId;
    /**
     * @return The list of zone mapping.
     * 
     */
    private final List<GetTransitRouterVpnAttachmentsAttachmentZone> zones;

    @CustomType.Constructor
    private GetTransitRouterVpnAttachmentsAttachment(
        @CustomType.Parameter("autoPublishRouteEnabled") Boolean autoPublishRouteEnabled,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("resourceType") String resourceType,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("transitRouterAttachmentDescription") String transitRouterAttachmentDescription,
        @CustomType.Parameter("transitRouterAttachmentId") String transitRouterAttachmentId,
        @CustomType.Parameter("transitRouterAttachmentName") String transitRouterAttachmentName,
        @CustomType.Parameter("transitRouterId") String transitRouterId,
        @CustomType.Parameter("vpnId") String vpnId,
        @CustomType.Parameter("vpnOwnerId") String vpnOwnerId,
        @CustomType.Parameter("zones") List<GetTransitRouterVpnAttachmentsAttachmentZone> zones) {
        this.autoPublishRouteEnabled = autoPublishRouteEnabled;
        this.createTime = createTime;
        this.id = id;
        this.resourceType = resourceType;
        this.status = status;
        this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        this.transitRouterAttachmentName = transitRouterAttachmentName;
        this.transitRouterId = transitRouterId;
        this.vpnId = vpnId;
        this.vpnOwnerId = vpnOwnerId;
        this.zones = zones;
    }

    /**
     * @return Whether to allow the forwarding router instance to automatically publish routing entries to IPsec connections.
     * 
     */
    public Boolean autoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }
    /**
     * @return The creation time of the resource.
     * 
     */
    public String createTime() {
        return this.createTime;
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
     * @return The status of the transit router attachment.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The description of the VPN connection.
     * 
     */
    public String transitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
    }
    public String transitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }
    /**
     * @return The name of the VPN connection.
     * 
     */
    public String transitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }
    /**
     * @return The ID of the forwarding router instance.
     * 
     */
    public String transitRouterId() {
        return this.transitRouterId;
    }
    /**
     * @return The id of the vpn.
     * 
     */
    public String vpnId() {
        return this.vpnId;
    }
    /**
     * @return The owner id of vpn.
     * 
     */
    public String vpnOwnerId() {
        return this.vpnOwnerId;
    }
    /**
     * @return The list of zone mapping.
     * 
     */
    public List<GetTransitRouterVpnAttachmentsAttachmentZone> zones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitRouterVpnAttachmentsAttachment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoPublishRouteEnabled;
        private String createTime;
        private String id;
        private String resourceType;
        private String status;
        private String transitRouterAttachmentDescription;
        private String transitRouterAttachmentId;
        private String transitRouterAttachmentName;
        private String transitRouterId;
        private String vpnId;
        private String vpnOwnerId;
        private List<GetTransitRouterVpnAttachmentsAttachmentZone> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitRouterVpnAttachmentsAttachment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoPublishRouteEnabled = defaults.autoPublishRouteEnabled;
    	      this.createTime = defaults.createTime;
    	      this.id = defaults.id;
    	      this.resourceType = defaults.resourceType;
    	      this.status = defaults.status;
    	      this.transitRouterAttachmentDescription = defaults.transitRouterAttachmentDescription;
    	      this.transitRouterAttachmentId = defaults.transitRouterAttachmentId;
    	      this.transitRouterAttachmentName = defaults.transitRouterAttachmentName;
    	      this.transitRouterId = defaults.transitRouterId;
    	      this.vpnId = defaults.vpnId;
    	      this.vpnOwnerId = defaults.vpnOwnerId;
    	      this.zones = defaults.zones;
        }

        public Builder autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
            this.autoPublishRouteEnabled = Objects.requireNonNull(autoPublishRouteEnabled);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
            this.transitRouterAttachmentDescription = Objects.requireNonNull(transitRouterAttachmentDescription);
            return this;
        }
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = Objects.requireNonNull(transitRouterAttachmentId);
            return this;
        }
        public Builder transitRouterAttachmentName(String transitRouterAttachmentName) {
            this.transitRouterAttachmentName = Objects.requireNonNull(transitRouterAttachmentName);
            return this;
        }
        public Builder transitRouterId(String transitRouterId) {
            this.transitRouterId = Objects.requireNonNull(transitRouterId);
            return this;
        }
        public Builder vpnId(String vpnId) {
            this.vpnId = Objects.requireNonNull(vpnId);
            return this;
        }
        public Builder vpnOwnerId(String vpnOwnerId) {
            this.vpnOwnerId = Objects.requireNonNull(vpnOwnerId);
            return this;
        }
        public Builder zones(List<GetTransitRouterVpnAttachmentsAttachmentZone> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }
        public Builder zones(GetTransitRouterVpnAttachmentsAttachmentZone... zones) {
            return zones(List.of(zones));
        }        public GetTransitRouterVpnAttachmentsAttachment build() {
            return new GetTransitRouterVpnAttachmentsAttachment(autoPublishRouteEnabled, createTime, id, resourceType, status, transitRouterAttachmentDescription, transitRouterAttachmentId, transitRouterAttachmentName, transitRouterId, vpnId, vpnOwnerId, zones);
        }
    }
}
