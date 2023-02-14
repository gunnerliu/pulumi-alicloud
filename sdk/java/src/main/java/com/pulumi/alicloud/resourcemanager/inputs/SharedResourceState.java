// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedResourceState extends com.pulumi.resources.ResourceArgs {

    public static final SharedResourceState Empty = new SharedResourceState();

    /**
     * The resource ID need shared.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The resource ID need shared.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The resource share ID of resource manager.
     * 
     */
    @Import(name="resourceShareId")
    private @Nullable Output<String> resourceShareId;

    /**
     * @return The resource share ID of resource manager.
     * 
     */
    public Optional<Output<String>> resourceShareId() {
        return Optional.ofNullable(this.resourceShareId);
    }

    /**
     * The resource type of should shared, valid value
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The resource type of should shared, valid value
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * status.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return status.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private SharedResourceState() {}

    private SharedResourceState(SharedResourceState $) {
        this.resourceId = $.resourceId;
        this.resourceShareId = $.resourceShareId;
        this.resourceType = $.resourceType;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedResourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedResourceState $;

        public Builder() {
            $ = new SharedResourceState();
        }

        public Builder(SharedResourceState defaults) {
            $ = new SharedResourceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceId The resource ID need shared.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The resource ID need shared.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param resourceShareId The resource share ID of resource manager.
         * 
         * @return builder
         * 
         */
        public Builder resourceShareId(@Nullable Output<String> resourceShareId) {
            $.resourceShareId = resourceShareId;
            return this;
        }

        /**
         * @param resourceShareId The resource share ID of resource manager.
         * 
         * @return builder
         * 
         */
        public Builder resourceShareId(String resourceShareId) {
            return resourceShareId(Output.of(resourceShareId));
        }

        /**
         * @param resourceType The resource type of should shared, valid value
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The resource type of should shared, valid value
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param status status.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public SharedResourceState build() {
            return $;
        }
    }

}