// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTransitRouterVpcAttachmentsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitRouterVpcAttachmentsPlainArgs Empty = new GetTransitRouterVpcAttachmentsPlainArgs();

    /**
     * ID of the CEN instance.
     * 
     */
    @Import(name="cenId", required=true)
    private String cenId;

    /**
     * @return ID of the CEN instance.
     * 
     */
    public String cenId() {
        return this.cenId;
    }

    /**
     * A list of resource id. The element value is same as `transit_router_id`.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of resource id. The element value is same as `transit_router_id`.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of the resource. Valid values `Attached`, `Attaching` and `Detaching`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the resource. Valid values `Attached`, `Attaching` and `Detaching`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The transit router ID.
     * 
     */
    @Import(name="transitRouterId")
    private @Nullable String transitRouterId;

    /**
     * @return The transit router ID.
     * 
     */
    public Optional<String> transitRouterId() {
        return Optional.ofNullable(this.transitRouterId);
    }

    private GetTransitRouterVpcAttachmentsPlainArgs() {}

    private GetTransitRouterVpcAttachmentsPlainArgs(GetTransitRouterVpcAttachmentsPlainArgs $) {
        this.cenId = $.cenId;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.status = $.status;
        this.transitRouterId = $.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitRouterVpcAttachmentsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitRouterVpcAttachmentsPlainArgs $;

        public Builder() {
            $ = new GetTransitRouterVpcAttachmentsPlainArgs();
        }

        public Builder(GetTransitRouterVpcAttachmentsPlainArgs defaults) {
            $ = new GetTransitRouterVpcAttachmentsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cenId ID of the CEN instance.
         * 
         * @return builder
         * 
         */
        public Builder cenId(String cenId) {
            $.cenId = cenId;
            return this;
        }

        /**
         * @param ids A list of resource id. The element value is same as `transit_router_id`.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of resource id. The element value is same as `transit_router_id`.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param status The status of the resource. Valid values `Attached`, `Attaching` and `Detaching`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param transitRouterId The transit router ID.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(@Nullable String transitRouterId) {
            $.transitRouterId = transitRouterId;
            return this;
        }

        public GetTransitRouterVpcAttachmentsPlainArgs build() {
            $.cenId = Objects.requireNonNull($.cenId, "expected parameter 'cenId' to be non-null");
            return $;
        }
    }

}