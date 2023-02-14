// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitRouterPrefixListAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransitRouterPrefixListAssociationArgs Empty = new TransitRouterPrefixListAssociationArgs();

    /**
     * The ID of the next hop. **NOTE:** If `next_hop` is set to `BlackHole`, you must set this parameter to `BlackHole`.
     * 
     */
    @Import(name="nextHop", required=true)
    private Output<String> nextHop;

    /**
     * @return The ID of the next hop. **NOTE:** If `next_hop` is set to `BlackHole`, you must set this parameter to `BlackHole`.
     * 
     */
    public Output<String> nextHop() {
        return this.nextHop;
    }

    /**
     * The type of the next hop. Valid values:
     * 
     */
    @Import(name="nextHopType")
    private @Nullable Output<String> nextHopType;

    /**
     * @return The type of the next hop. Valid values:
     * 
     */
    public Optional<Output<String>> nextHopType() {
        return Optional.ofNullable(this.nextHopType);
    }

    /**
     * The ID of the Alibaba Cloud account to which the prefix list belongs.
     * 
     */
    @Import(name="ownerUid")
    private @Nullable Output<Integer> ownerUid;

    /**
     * @return The ID of the Alibaba Cloud account to which the prefix list belongs.
     * 
     */
    public Optional<Output<Integer>> ownerUid() {
        return Optional.ofNullable(this.ownerUid);
    }

    /**
     * The ID of the prefix list.
     * 
     */
    @Import(name="prefixListId", required=true)
    private Output<String> prefixListId;

    /**
     * @return The ID of the prefix list.
     * 
     */
    public Output<String> prefixListId() {
        return this.prefixListId;
    }

    /**
     * The ID of the transit router.
     * 
     */
    @Import(name="transitRouterId", required=true)
    private Output<String> transitRouterId;

    /**
     * @return The ID of the transit router.
     * 
     */
    public Output<String> transitRouterId() {
        return this.transitRouterId;
    }

    /**
     * The ID of the route table of the transit router.
     * 
     */
    @Import(name="transitRouterTableId", required=true)
    private Output<String> transitRouterTableId;

    /**
     * @return The ID of the route table of the transit router.
     * 
     */
    public Output<String> transitRouterTableId() {
        return this.transitRouterTableId;
    }

    private TransitRouterPrefixListAssociationArgs() {}

    private TransitRouterPrefixListAssociationArgs(TransitRouterPrefixListAssociationArgs $) {
        this.nextHop = $.nextHop;
        this.nextHopType = $.nextHopType;
        this.ownerUid = $.ownerUid;
        this.prefixListId = $.prefixListId;
        this.transitRouterId = $.transitRouterId;
        this.transitRouterTableId = $.transitRouterTableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitRouterPrefixListAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitRouterPrefixListAssociationArgs $;

        public Builder() {
            $ = new TransitRouterPrefixListAssociationArgs();
        }

        public Builder(TransitRouterPrefixListAssociationArgs defaults) {
            $ = new TransitRouterPrefixListAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nextHop The ID of the next hop. **NOTE:** If `next_hop` is set to `BlackHole`, you must set this parameter to `BlackHole`.
         * 
         * @return builder
         * 
         */
        public Builder nextHop(Output<String> nextHop) {
            $.nextHop = nextHop;
            return this;
        }

        /**
         * @param nextHop The ID of the next hop. **NOTE:** If `next_hop` is set to `BlackHole`, you must set this parameter to `BlackHole`.
         * 
         * @return builder
         * 
         */
        public Builder nextHop(String nextHop) {
            return nextHop(Output.of(nextHop));
        }

        /**
         * @param nextHopType The type of the next hop. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder nextHopType(@Nullable Output<String> nextHopType) {
            $.nextHopType = nextHopType;
            return this;
        }

        /**
         * @param nextHopType The type of the next hop. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder nextHopType(String nextHopType) {
            return nextHopType(Output.of(nextHopType));
        }

        /**
         * @param ownerUid The ID of the Alibaba Cloud account to which the prefix list belongs.
         * 
         * @return builder
         * 
         */
        public Builder ownerUid(@Nullable Output<Integer> ownerUid) {
            $.ownerUid = ownerUid;
            return this;
        }

        /**
         * @param ownerUid The ID of the Alibaba Cloud account to which the prefix list belongs.
         * 
         * @return builder
         * 
         */
        public Builder ownerUid(Integer ownerUid) {
            return ownerUid(Output.of(ownerUid));
        }

        /**
         * @param prefixListId The ID of the prefix list.
         * 
         * @return builder
         * 
         */
        public Builder prefixListId(Output<String> prefixListId) {
            $.prefixListId = prefixListId;
            return this;
        }

        /**
         * @param prefixListId The ID of the prefix list.
         * 
         * @return builder
         * 
         */
        public Builder prefixListId(String prefixListId) {
            return prefixListId(Output.of(prefixListId));
        }

        /**
         * @param transitRouterId The ID of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(Output<String> transitRouterId) {
            $.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * @param transitRouterId The ID of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(String transitRouterId) {
            return transitRouterId(Output.of(transitRouterId));
        }

        /**
         * @param transitRouterTableId The ID of the route table of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterTableId(Output<String> transitRouterTableId) {
            $.transitRouterTableId = transitRouterTableId;
            return this;
        }

        /**
         * @param transitRouterTableId The ID of the route table of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterTableId(String transitRouterTableId) {
            return transitRouterTableId(Output.of(transitRouterTableId));
        }

        public TransitRouterPrefixListAssociationArgs build() {
            $.nextHop = Objects.requireNonNull($.nextHop, "expected parameter 'nextHop' to be non-null");
            $.prefixListId = Objects.requireNonNull($.prefixListId, "expected parameter 'prefixListId' to be non-null");
            $.transitRouterId = Objects.requireNonNull($.transitRouterId, "expected parameter 'transitRouterId' to be non-null");
            $.transitRouterTableId = Objects.requireNonNull($.transitRouterTableId, "expected parameter 'transitRouterTableId' to be non-null");
            return $;
        }
    }

}