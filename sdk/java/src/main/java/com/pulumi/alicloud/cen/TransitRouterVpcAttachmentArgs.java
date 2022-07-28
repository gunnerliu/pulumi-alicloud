// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.cen.inputs.TransitRouterVpcAttachmentZoneMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitRouterVpcAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransitRouterVpcAttachmentArgs Empty = new TransitRouterVpcAttachmentArgs();

    /**
     * The ID of the CEN.
     * 
     */
    @Import(name="cenId", required=true)
    private Output<String> cenId;

    /**
     * @return The ID of the CEN.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }

    /**
     * The dry run.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The payment type of the resource. Valid values: `PayAsYouGo`.
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return The payment type of the resource. Valid values: `PayAsYouGo`.
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * Whether to enabled route table association. The system default value is `true`.
     * 
     */
    @Import(name="routeTableAssociationEnabled")
    private @Nullable Output<Boolean> routeTableAssociationEnabled;

    /**
     * @return Whether to enabled route table association. The system default value is `true`.
     * 
     */
    public Optional<Output<Boolean>> routeTableAssociationEnabled() {
        return Optional.ofNullable(this.routeTableAssociationEnabled);
    }

    /**
     * Whether to enabled route table propagation. The system default value is `true`.
     * 
     */
    @Import(name="routeTablePropagationEnabled")
    private @Nullable Output<Boolean> routeTablePropagationEnabled;

    /**
     * @return Whether to enabled route table propagation. The system default value is `true`.
     * 
     */
    public Optional<Output<Boolean>> routeTablePropagationEnabled() {
        return Optional.ofNullable(this.routeTablePropagationEnabled);
    }

    /**
     * The description of the transit router vbr attachment.
     * 
     */
    @Import(name="transitRouterAttachmentDescription")
    private @Nullable Output<String> transitRouterAttachmentDescription;

    /**
     * @return The description of the transit router vbr attachment.
     * 
     */
    public Optional<Output<String>> transitRouterAttachmentDescription() {
        return Optional.ofNullable(this.transitRouterAttachmentDescription);
    }

    /**
     * The name of the transit router vbr attachment.
     * 
     */
    @Import(name="transitRouterAttachmentName")
    private @Nullable Output<String> transitRouterAttachmentName;

    /**
     * @return The name of the transit router vbr attachment.
     * 
     */
    public Optional<Output<String>> transitRouterAttachmentName() {
        return Optional.ofNullable(this.transitRouterAttachmentName);
    }

    /**
     * The ID of the transit router.
     * 
     */
    @Import(name="transitRouterId")
    private @Nullable Output<String> transitRouterId;

    /**
     * @return The ID of the transit router.
     * 
     */
    public Optional<Output<String>> transitRouterId() {
        return Optional.ofNullable(this.transitRouterId);
    }

    /**
     * The ID of the VPC.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     * The owner id of vpc.
     * 
     */
    @Import(name="vpcOwnerId")
    private @Nullable Output<String> vpcOwnerId;

    /**
     * @return The owner id of vpc.
     * 
     */
    public Optional<Output<String>> vpcOwnerId() {
        return Optional.ofNullable(this.vpcOwnerId);
    }

    /**
     * The list of zone mapping of the VPC.
     * 
     */
    @Import(name="zoneMappings", required=true)
    private Output<List<TransitRouterVpcAttachmentZoneMappingArgs>> zoneMappings;

    /**
     * @return The list of zone mapping of the VPC.
     * 
     */
    public Output<List<TransitRouterVpcAttachmentZoneMappingArgs>> zoneMappings() {
        return this.zoneMappings;
    }

    private TransitRouterVpcAttachmentArgs() {}

    private TransitRouterVpcAttachmentArgs(TransitRouterVpcAttachmentArgs $) {
        this.cenId = $.cenId;
        this.dryRun = $.dryRun;
        this.paymentType = $.paymentType;
        this.resourceType = $.resourceType;
        this.routeTableAssociationEnabled = $.routeTableAssociationEnabled;
        this.routeTablePropagationEnabled = $.routeTablePropagationEnabled;
        this.transitRouterAttachmentDescription = $.transitRouterAttachmentDescription;
        this.transitRouterAttachmentName = $.transitRouterAttachmentName;
        this.transitRouterId = $.transitRouterId;
        this.vpcId = $.vpcId;
        this.vpcOwnerId = $.vpcOwnerId;
        this.zoneMappings = $.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitRouterVpcAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitRouterVpcAttachmentArgs $;

        public Builder() {
            $ = new TransitRouterVpcAttachmentArgs();
        }

        public Builder(TransitRouterVpcAttachmentArgs defaults) {
            $ = new TransitRouterVpcAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cenId The ID of the CEN.
         * 
         * @return builder
         * 
         */
        public Builder cenId(Output<String> cenId) {
            $.cenId = cenId;
            return this;
        }

        /**
         * @param cenId The ID of the CEN.
         * 
         * @return builder
         * 
         */
        public Builder cenId(String cenId) {
            return cenId(Output.of(cenId));
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param paymentType The payment type of the resource. Valid values: `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType The payment type of the resource. Valid values: `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param resourceType The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param routeTableAssociationEnabled Whether to enabled route table association. The system default value is `true`.
         * 
         * @return builder
         * 
         */
        public Builder routeTableAssociationEnabled(@Nullable Output<Boolean> routeTableAssociationEnabled) {
            $.routeTableAssociationEnabled = routeTableAssociationEnabled;
            return this;
        }

        /**
         * @param routeTableAssociationEnabled Whether to enabled route table association. The system default value is `true`.
         * 
         * @return builder
         * 
         */
        public Builder routeTableAssociationEnabled(Boolean routeTableAssociationEnabled) {
            return routeTableAssociationEnabled(Output.of(routeTableAssociationEnabled));
        }

        /**
         * @param routeTablePropagationEnabled Whether to enabled route table propagation. The system default value is `true`.
         * 
         * @return builder
         * 
         */
        public Builder routeTablePropagationEnabled(@Nullable Output<Boolean> routeTablePropagationEnabled) {
            $.routeTablePropagationEnabled = routeTablePropagationEnabled;
            return this;
        }

        /**
         * @param routeTablePropagationEnabled Whether to enabled route table propagation. The system default value is `true`.
         * 
         * @return builder
         * 
         */
        public Builder routeTablePropagationEnabled(Boolean routeTablePropagationEnabled) {
            return routeTablePropagationEnabled(Output.of(routeTablePropagationEnabled));
        }

        /**
         * @param transitRouterAttachmentDescription The description of the transit router vbr attachment.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentDescription(@Nullable Output<String> transitRouterAttachmentDescription) {
            $.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
            return this;
        }

        /**
         * @param transitRouterAttachmentDescription The description of the transit router vbr attachment.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
            return transitRouterAttachmentDescription(Output.of(transitRouterAttachmentDescription));
        }

        /**
         * @param transitRouterAttachmentName The name of the transit router vbr attachment.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentName(@Nullable Output<String> transitRouterAttachmentName) {
            $.transitRouterAttachmentName = transitRouterAttachmentName;
            return this;
        }

        /**
         * @param transitRouterAttachmentName The name of the transit router vbr attachment.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentName(String transitRouterAttachmentName) {
            return transitRouterAttachmentName(Output.of(transitRouterAttachmentName));
        }

        /**
         * @param transitRouterId The ID of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(@Nullable Output<String> transitRouterId) {
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
         * @param vpcId The ID of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vpcOwnerId The owner id of vpc.
         * 
         * @return builder
         * 
         */
        public Builder vpcOwnerId(@Nullable Output<String> vpcOwnerId) {
            $.vpcOwnerId = vpcOwnerId;
            return this;
        }

        /**
         * @param vpcOwnerId The owner id of vpc.
         * 
         * @return builder
         * 
         */
        public Builder vpcOwnerId(String vpcOwnerId) {
            return vpcOwnerId(Output.of(vpcOwnerId));
        }

        /**
         * @param zoneMappings The list of zone mapping of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(Output<List<TransitRouterVpcAttachmentZoneMappingArgs>> zoneMappings) {
            $.zoneMappings = zoneMappings;
            return this;
        }

        /**
         * @param zoneMappings The list of zone mapping of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(List<TransitRouterVpcAttachmentZoneMappingArgs> zoneMappings) {
            return zoneMappings(Output.of(zoneMappings));
        }

        /**
         * @param zoneMappings The list of zone mapping of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(TransitRouterVpcAttachmentZoneMappingArgs... zoneMappings) {
            return zoneMappings(List.of(zoneMappings));
        }

        public TransitRouterVpcAttachmentArgs build() {
            $.cenId = Objects.requireNonNull($.cenId, "expected parameter 'cenId' to be non-null");
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            $.zoneMappings = Objects.requireNonNull($.zoneMappings, "expected parameter 'zoneMappings' to be non-null");
            return $;
        }
    }

}
