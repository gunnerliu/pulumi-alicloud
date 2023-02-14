// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTransitRouterMulticastDomainAssociationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitRouterMulticastDomainAssociationsArgs Empty = new GetTransitRouterMulticastDomainAssociationsArgs();

    /**
     * A list of Transit Router Multicast Domain Association IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Transit Router Multicast Domain Association IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The ID of the resource associated with the multicast domain.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The ID of the resource associated with the multicast domain.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The type of resource associated with the multicast domain. Valid Value: `VPC`.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The type of resource associated with the multicast domain. Valid Value: `VPC`.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * The status of the associated resource. Valid Value: `Associated`, `Associating`, `Dissociating`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the associated resource. Valid Value: `Associated`, `Associating`, `Dissociating`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the network instance connection.
     * 
     */
    @Import(name="transitRouterAttachmentId")
    private @Nullable Output<String> transitRouterAttachmentId;

    /**
     * @return The ID of the network instance connection.
     * 
     */
    public Optional<Output<String>> transitRouterAttachmentId() {
        return Optional.ofNullable(this.transitRouterAttachmentId);
    }

    /**
     * The ID of the multicast domain.
     * 
     */
    @Import(name="transitRouterMulticastDomainId", required=true)
    private Output<String> transitRouterMulticastDomainId;

    /**
     * @return The ID of the multicast domain.
     * 
     */
    public Output<String> transitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    /**
     * The ID of the vSwitch.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The ID of the vSwitch.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private GetTransitRouterMulticastDomainAssociationsArgs() {}

    private GetTransitRouterMulticastDomainAssociationsArgs(GetTransitRouterMulticastDomainAssociationsArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.resourceId = $.resourceId;
        this.resourceType = $.resourceType;
        this.status = $.status;
        this.transitRouterAttachmentId = $.transitRouterAttachmentId;
        this.transitRouterMulticastDomainId = $.transitRouterMulticastDomainId;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitRouterMulticastDomainAssociationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitRouterMulticastDomainAssociationsArgs $;

        public Builder() {
            $ = new GetTransitRouterMulticastDomainAssociationsArgs();
        }

        public Builder(GetTransitRouterMulticastDomainAssociationsArgs defaults) {
            $ = new GetTransitRouterMulticastDomainAssociationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Transit Router Multicast Domain Association IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Transit Router Multicast Domain Association IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Transit Router Multicast Domain Association IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param resourceId The ID of the resource associated with the multicast domain.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The ID of the resource associated with the multicast domain.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param resourceType The type of resource associated with the multicast domain. Valid Value: `VPC`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The type of resource associated with the multicast domain. Valid Value: `VPC`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param status The status of the associated resource. Valid Value: `Associated`, `Associating`, `Dissociating`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the associated resource. Valid Value: `Associated`, `Associating`, `Dissociating`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param transitRouterAttachmentId The ID of the network instance connection.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentId(@Nullable Output<String> transitRouterAttachmentId) {
            $.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * @param transitRouterAttachmentId The ID of the network instance connection.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            return transitRouterAttachmentId(Output.of(transitRouterAttachmentId));
        }

        /**
         * @param transitRouterMulticastDomainId The ID of the multicast domain.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterMulticastDomainId(Output<String> transitRouterMulticastDomainId) {
            $.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }

        /**
         * @param transitRouterMulticastDomainId The ID of the multicast domain.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            return transitRouterMulticastDomainId(Output.of(transitRouterMulticastDomainId));
        }

        /**
         * @param vswitchId The ID of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The ID of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public GetTransitRouterMulticastDomainAssociationsArgs build() {
            $.transitRouterMulticastDomainId = Objects.requireNonNull($.transitRouterMulticastDomainId, "expected parameter 'transitRouterMulticastDomainId' to be non-null");
            return $;
        }
    }

}