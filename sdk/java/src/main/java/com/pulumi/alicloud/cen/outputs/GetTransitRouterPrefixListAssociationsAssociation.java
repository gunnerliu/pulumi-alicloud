// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransitRouterPrefixListAssociationsAssociation {
    /**
     * @return The ID of the Cen Transit Router Prefix List Association. It formats as `&lt;prefix_list_id&gt;:&lt;transit_router_id&gt;:&lt;transit_router_table_id&gt;:&lt;next_hop&gt;`.
     * 
     */
    private final String id;
    /**
     * @return The ID of the next hop connection.
     * 
     */
    private final String nextHop;
    /**
     * @return The ID of the network instance associated with the next hop connection.
     * 
     */
    private final String nextHopInstanceId;
    /**
     * @return The type of the next hop.
     * 
     */
    private final String nextHopType;
    /**
     * @return The ID of the Alibaba Cloud account to which the prefix list belongs.
     * 
     */
    private final Integer ownerUid;
    /**
     * @return The ID of the prefix list.
     * 
     */
    private final String prefixListId;
    /**
     * @return The status of the prefix list.
     * 
     */
    private final String status;
    /**
     * @return The ID of the transit router.
     * 
     */
    private final String transitRouterId;
    /**
     * @return The ID of the route table of the transit router.
     * 
     */
    private final String transitRouterTableId;

    @CustomType.Constructor
    private GetTransitRouterPrefixListAssociationsAssociation(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("nextHop") String nextHop,
        @CustomType.Parameter("nextHopInstanceId") String nextHopInstanceId,
        @CustomType.Parameter("nextHopType") String nextHopType,
        @CustomType.Parameter("ownerUid") Integer ownerUid,
        @CustomType.Parameter("prefixListId") String prefixListId,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("transitRouterId") String transitRouterId,
        @CustomType.Parameter("transitRouterTableId") String transitRouterTableId) {
        this.id = id;
        this.nextHop = nextHop;
        this.nextHopInstanceId = nextHopInstanceId;
        this.nextHopType = nextHopType;
        this.ownerUid = ownerUid;
        this.prefixListId = prefixListId;
        this.status = status;
        this.transitRouterId = transitRouterId;
        this.transitRouterTableId = transitRouterTableId;
    }

    /**
     * @return The ID of the Cen Transit Router Prefix List Association. It formats as `&lt;prefix_list_id&gt;:&lt;transit_router_id&gt;:&lt;transit_router_table_id&gt;:&lt;next_hop&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the next hop connection.
     * 
     */
    public String nextHop() {
        return this.nextHop;
    }
    /**
     * @return The ID of the network instance associated with the next hop connection.
     * 
     */
    public String nextHopInstanceId() {
        return this.nextHopInstanceId;
    }
    /**
     * @return The type of the next hop.
     * 
     */
    public String nextHopType() {
        return this.nextHopType;
    }
    /**
     * @return The ID of the Alibaba Cloud account to which the prefix list belongs.
     * 
     */
    public Integer ownerUid() {
        return this.ownerUid;
    }
    /**
     * @return The ID of the prefix list.
     * 
     */
    public String prefixListId() {
        return this.prefixListId;
    }
    /**
     * @return The status of the prefix list.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The ID of the transit router.
     * 
     */
    public String transitRouterId() {
        return this.transitRouterId;
    }
    /**
     * @return The ID of the route table of the transit router.
     * 
     */
    public String transitRouterTableId() {
        return this.transitRouterTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitRouterPrefixListAssociationsAssociation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String nextHop;
        private String nextHopInstanceId;
        private String nextHopType;
        private Integer ownerUid;
        private String prefixListId;
        private String status;
        private String transitRouterId;
        private String transitRouterTableId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitRouterPrefixListAssociationsAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.nextHop = defaults.nextHop;
    	      this.nextHopInstanceId = defaults.nextHopInstanceId;
    	      this.nextHopType = defaults.nextHopType;
    	      this.ownerUid = defaults.ownerUid;
    	      this.prefixListId = defaults.prefixListId;
    	      this.status = defaults.status;
    	      this.transitRouterId = defaults.transitRouterId;
    	      this.transitRouterTableId = defaults.transitRouterTableId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder nextHop(String nextHop) {
            this.nextHop = Objects.requireNonNull(nextHop);
            return this;
        }
        public Builder nextHopInstanceId(String nextHopInstanceId) {
            this.nextHopInstanceId = Objects.requireNonNull(nextHopInstanceId);
            return this;
        }
        public Builder nextHopType(String nextHopType) {
            this.nextHopType = Objects.requireNonNull(nextHopType);
            return this;
        }
        public Builder ownerUid(Integer ownerUid) {
            this.ownerUid = Objects.requireNonNull(ownerUid);
            return this;
        }
        public Builder prefixListId(String prefixListId) {
            this.prefixListId = Objects.requireNonNull(prefixListId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder transitRouterId(String transitRouterId) {
            this.transitRouterId = Objects.requireNonNull(transitRouterId);
            return this;
        }
        public Builder transitRouterTableId(String transitRouterTableId) {
            this.transitRouterTableId = Objects.requireNonNull(transitRouterTableId);
            return this;
        }        public GetTransitRouterPrefixListAssociationsAssociation build() {
            return new GetTransitRouterPrefixListAssociationsAssociation(id, nextHop, nextHopInstanceId, nextHopType, ownerUid, prefixListId, status, transitRouterId, transitRouterTableId);
        }
    }
}
