// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransitRouterRouteEntriesEntry {
    private String id;
    private String status;
    private String transitRouterRouteEntryDescription;
    /**
     * @return The target network segment of the route entry.
     * 
     */
    private String transitRouterRouteEntryDestinationCidrBlock;
    private String transitRouterRouteEntryId;
    private String transitRouterRouteEntryName;
    /**
     * @return ID of the next hop.
     * 
     */
    private String transitRouterRouteEntryNextHopId;
    /**
     * @return Type of the next hop.
     * 
     */
    private String transitRouterRouteEntryNextHopType;
    /**
     * @return Type of the route entry.
     * 
     */
    private String transitRouterRouteEntryType;

    private GetTransitRouterRouteEntriesEntry() {}
    public String id() {
        return this.id;
    }
    public String status() {
        return this.status;
    }
    public String transitRouterRouteEntryDescription() {
        return this.transitRouterRouteEntryDescription;
    }
    /**
     * @return The target network segment of the route entry.
     * 
     */
    public String transitRouterRouteEntryDestinationCidrBlock() {
        return this.transitRouterRouteEntryDestinationCidrBlock;
    }
    public String transitRouterRouteEntryId() {
        return this.transitRouterRouteEntryId;
    }
    public String transitRouterRouteEntryName() {
        return this.transitRouterRouteEntryName;
    }
    /**
     * @return ID of the next hop.
     * 
     */
    public String transitRouterRouteEntryNextHopId() {
        return this.transitRouterRouteEntryNextHopId;
    }
    /**
     * @return Type of the next hop.
     * 
     */
    public String transitRouterRouteEntryNextHopType() {
        return this.transitRouterRouteEntryNextHopType;
    }
    /**
     * @return Type of the route entry.
     * 
     */
    public String transitRouterRouteEntryType() {
        return this.transitRouterRouteEntryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitRouterRouteEntriesEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String status;
        private String transitRouterRouteEntryDescription;
        private String transitRouterRouteEntryDestinationCidrBlock;
        private String transitRouterRouteEntryId;
        private String transitRouterRouteEntryName;
        private String transitRouterRouteEntryNextHopId;
        private String transitRouterRouteEntryNextHopType;
        private String transitRouterRouteEntryType;
        public Builder() {}
        public Builder(GetTransitRouterRouteEntriesEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.status = defaults.status;
    	      this.transitRouterRouteEntryDescription = defaults.transitRouterRouteEntryDescription;
    	      this.transitRouterRouteEntryDestinationCidrBlock = defaults.transitRouterRouteEntryDestinationCidrBlock;
    	      this.transitRouterRouteEntryId = defaults.transitRouterRouteEntryId;
    	      this.transitRouterRouteEntryName = defaults.transitRouterRouteEntryName;
    	      this.transitRouterRouteEntryNextHopId = defaults.transitRouterRouteEntryNextHopId;
    	      this.transitRouterRouteEntryNextHopType = defaults.transitRouterRouteEntryNextHopType;
    	      this.transitRouterRouteEntryType = defaults.transitRouterRouteEntryType;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
            this.transitRouterRouteEntryDescription = Objects.requireNonNull(transitRouterRouteEntryDescription);
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
            this.transitRouterRouteEntryDestinationCidrBlock = Objects.requireNonNull(transitRouterRouteEntryDestinationCidrBlock);
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterRouteEntryId(String transitRouterRouteEntryId) {
            this.transitRouterRouteEntryId = Objects.requireNonNull(transitRouterRouteEntryId);
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterRouteEntryName(String transitRouterRouteEntryName) {
            this.transitRouterRouteEntryName = Objects.requireNonNull(transitRouterRouteEntryName);
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
            this.transitRouterRouteEntryNextHopId = Objects.requireNonNull(transitRouterRouteEntryNextHopId);
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
            this.transitRouterRouteEntryNextHopType = Objects.requireNonNull(transitRouterRouteEntryNextHopType);
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterRouteEntryType(String transitRouterRouteEntryType) {
            this.transitRouterRouteEntryType = Objects.requireNonNull(transitRouterRouteEntryType);
            return this;
        }
        public GetTransitRouterRouteEntriesEntry build() {
            final var o = new GetTransitRouterRouteEntriesEntry();
            o.id = id;
            o.status = status;
            o.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
            o.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
            o.transitRouterRouteEntryId = transitRouterRouteEntryId;
            o.transitRouterRouteEntryName = transitRouterRouteEntryName;
            o.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
            o.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
            o.transitRouterRouteEntryType = transitRouterRouteEntryType;
            return o;
        }
    }
}