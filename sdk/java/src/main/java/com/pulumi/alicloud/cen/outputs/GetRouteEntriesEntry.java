// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.alicloud.cen.outputs.GetRouteEntriesEntryConflict;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRouteEntriesEntry {
    /**
     * @return The destination CIDR block of the route entry to query.
     * 
     */
    private final String cidrBlock;
    /**
     * @return A list of conflicted Route Entries. Each element contains the following attributes:
     * 
     */
    private final List<GetRouteEntriesEntryConflict> conflicts;
    /**
     * @return ID of the next hop.
     * 
     */
    private final String nextHopId;
    /**
     * @return Type of the next hop, including &#34;Instance&#34;, &#34;HaVip&#34; and &#34;RouterInterface&#34;.
     * 
     */
    private final String nextHopType;
    /**
     * @return Whether to allow the route entry to be published or removed to or from CEN.
     * 
     */
    private final Boolean operationalMode;
    /**
     * @return The publish status of the route entry in CEN, including &#34;Published&#34; and &#34;NonPublished&#34;.
     * 
     */
    private final String publishStatus;
    /**
     * @return ID of the route table of the VPC or VBR.
     * 
     */
    private final String routeTableId;
    /**
     * @return Type of the route entry, including &#34;System&#34;, &#34;Custom&#34; and &#34;BGP&#34;.
     * 
     */
    private final String routeType;

    @CustomType.Constructor
    private GetRouteEntriesEntry(
        @CustomType.Parameter("cidrBlock") String cidrBlock,
        @CustomType.Parameter("conflicts") List<GetRouteEntriesEntryConflict> conflicts,
        @CustomType.Parameter("nextHopId") String nextHopId,
        @CustomType.Parameter("nextHopType") String nextHopType,
        @CustomType.Parameter("operationalMode") Boolean operationalMode,
        @CustomType.Parameter("publishStatus") String publishStatus,
        @CustomType.Parameter("routeTableId") String routeTableId,
        @CustomType.Parameter("routeType") String routeType) {
        this.cidrBlock = cidrBlock;
        this.conflicts = conflicts;
        this.nextHopId = nextHopId;
        this.nextHopType = nextHopType;
        this.operationalMode = operationalMode;
        this.publishStatus = publishStatus;
        this.routeTableId = routeTableId;
        this.routeType = routeType;
    }

    /**
     * @return The destination CIDR block of the route entry to query.
     * 
     */
    public String cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * @return A list of conflicted Route Entries. Each element contains the following attributes:
     * 
     */
    public List<GetRouteEntriesEntryConflict> conflicts() {
        return this.conflicts;
    }
    /**
     * @return ID of the next hop.
     * 
     */
    public String nextHopId() {
        return this.nextHopId;
    }
    /**
     * @return Type of the next hop, including &#34;Instance&#34;, &#34;HaVip&#34; and &#34;RouterInterface&#34;.
     * 
     */
    public String nextHopType() {
        return this.nextHopType;
    }
    /**
     * @return Whether to allow the route entry to be published or removed to or from CEN.
     * 
     */
    public Boolean operationalMode() {
        return this.operationalMode;
    }
    /**
     * @return The publish status of the route entry in CEN, including &#34;Published&#34; and &#34;NonPublished&#34;.
     * 
     */
    public String publishStatus() {
        return this.publishStatus;
    }
    /**
     * @return ID of the route table of the VPC or VBR.
     * 
     */
    public String routeTableId() {
        return this.routeTableId;
    }
    /**
     * @return Type of the route entry, including &#34;System&#34;, &#34;Custom&#34; and &#34;BGP&#34;.
     * 
     */
    public String routeType() {
        return this.routeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteEntriesEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidrBlock;
        private List<GetRouteEntriesEntryConflict> conflicts;
        private String nextHopId;
        private String nextHopType;
        private Boolean operationalMode;
        private String publishStatus;
        private String routeTableId;
        private String routeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteEntriesEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.conflicts = defaults.conflicts;
    	      this.nextHopId = defaults.nextHopId;
    	      this.nextHopType = defaults.nextHopType;
    	      this.operationalMode = defaults.operationalMode;
    	      this.publishStatus = defaults.publishStatus;
    	      this.routeTableId = defaults.routeTableId;
    	      this.routeType = defaults.routeType;
        }

        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }
        public Builder conflicts(List<GetRouteEntriesEntryConflict> conflicts) {
            this.conflicts = Objects.requireNonNull(conflicts);
            return this;
        }
        public Builder conflicts(GetRouteEntriesEntryConflict... conflicts) {
            return conflicts(List.of(conflicts));
        }
        public Builder nextHopId(String nextHopId) {
            this.nextHopId = Objects.requireNonNull(nextHopId);
            return this;
        }
        public Builder nextHopType(String nextHopType) {
            this.nextHopType = Objects.requireNonNull(nextHopType);
            return this;
        }
        public Builder operationalMode(Boolean operationalMode) {
            this.operationalMode = Objects.requireNonNull(operationalMode);
            return this;
        }
        public Builder publishStatus(String publishStatus) {
            this.publishStatus = Objects.requireNonNull(publishStatus);
            return this;
        }
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = Objects.requireNonNull(routeTableId);
            return this;
        }
        public Builder routeType(String routeType) {
            this.routeType = Objects.requireNonNull(routeType);
            return this;
        }        public GetRouteEntriesEntry build() {
            return new GetRouteEntriesEntry(cidrBlock, conflicts, nextHopId, nextHopType, operationalMode, publishStatus, routeTableId, routeType);
        }
    }
}
