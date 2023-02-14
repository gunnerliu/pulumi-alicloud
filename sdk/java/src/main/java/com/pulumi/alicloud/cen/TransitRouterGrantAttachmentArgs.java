// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitRouterGrantAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransitRouterGrantAttachmentArgs Empty = new TransitRouterGrantAttachmentArgs();

    /**
     * The ID of the Cloud Enterprise Network (CEN) instance to which the transit router belongs.
     * 
     */
    @Import(name="cenId", required=true)
    private Output<String> cenId;

    /**
     * @return The ID of the Cloud Enterprise Network (CEN) instance to which the transit router belongs.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }

    /**
     * The ID of the Alibaba Cloud account to which the CEN instance belongs.
     * 
     */
    @Import(name="cenOwnerId", required=true)
    private Output<String> cenOwnerId;

    /**
     * @return The ID of the Alibaba Cloud account to which the CEN instance belongs.
     * 
     */
    public Output<String> cenOwnerId() {
        return this.cenOwnerId;
    }

    /**
     * The ID of the network instance.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The ID of the network instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * The type of the network instance. Valid values: `VPC`, `ExpressConnect`, `VPN`.
     * 
     */
    @Import(name="instanceType", required=true)
    private Output<String> instanceType;

    /**
     * @return The type of the network instance. Valid values: `VPC`, `ExpressConnect`, `VPN`.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }

    /**
     * The entity that pays the fees of the network instance. Valid values: `PayByResourceOwner`, `PayByCenOwner`.
     * 
     */
    @Import(name="orderType")
    private @Nullable Output<String> orderType;

    /**
     * @return The entity that pays the fees of the network instance. Valid values: `PayByResourceOwner`, `PayByCenOwner`.
     * 
     */
    public Optional<Output<String>> orderType() {
        return Optional.ofNullable(this.orderType);
    }

    private TransitRouterGrantAttachmentArgs() {}

    private TransitRouterGrantAttachmentArgs(TransitRouterGrantAttachmentArgs $) {
        this.cenId = $.cenId;
        this.cenOwnerId = $.cenOwnerId;
        this.instanceId = $.instanceId;
        this.instanceType = $.instanceType;
        this.orderType = $.orderType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitRouterGrantAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitRouterGrantAttachmentArgs $;

        public Builder() {
            $ = new TransitRouterGrantAttachmentArgs();
        }

        public Builder(TransitRouterGrantAttachmentArgs defaults) {
            $ = new TransitRouterGrantAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cenId The ID of the Cloud Enterprise Network (CEN) instance to which the transit router belongs.
         * 
         * @return builder
         * 
         */
        public Builder cenId(Output<String> cenId) {
            $.cenId = cenId;
            return this;
        }

        /**
         * @param cenId The ID of the Cloud Enterprise Network (CEN) instance to which the transit router belongs.
         * 
         * @return builder
         * 
         */
        public Builder cenId(String cenId) {
            return cenId(Output.of(cenId));
        }

        /**
         * @param cenOwnerId The ID of the Alibaba Cloud account to which the CEN instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder cenOwnerId(Output<String> cenOwnerId) {
            $.cenOwnerId = cenOwnerId;
            return this;
        }

        /**
         * @param cenOwnerId The ID of the Alibaba Cloud account to which the CEN instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder cenOwnerId(String cenOwnerId) {
            return cenOwnerId(Output.of(cenOwnerId));
        }

        /**
         * @param instanceId The ID of the network instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the network instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param instanceType The type of the network instance. Valid values: `VPC`, `ExpressConnect`, `VPN`.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The type of the network instance. Valid values: `VPC`, `ExpressConnect`, `VPN`.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param orderType The entity that pays the fees of the network instance. Valid values: `PayByResourceOwner`, `PayByCenOwner`.
         * 
         * @return builder
         * 
         */
        public Builder orderType(@Nullable Output<String> orderType) {
            $.orderType = orderType;
            return this;
        }

        /**
         * @param orderType The entity that pays the fees of the network instance. Valid values: `PayByResourceOwner`, `PayByCenOwner`.
         * 
         * @return builder
         * 
         */
        public Builder orderType(String orderType) {
            return orderType(Output.of(orderType));
        }

        public TransitRouterGrantAttachmentArgs build() {
            $.cenId = Objects.requireNonNull($.cenId, "expected parameter 'cenId' to be non-null");
            $.cenOwnerId = Objects.requireNonNull($.cenOwnerId, "expected parameter 'cenOwnerId' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.instanceType = Objects.requireNonNull($.instanceType, "expected parameter 'instanceType' to be non-null");
            return $;
        }
    }

}