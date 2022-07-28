// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceShareState extends com.pulumi.resources.ResourceArgs {

    public static final ResourceShareState Empty = new ResourceShareState();

    /**
     * The name of resource share.
     * 
     */
    @Import(name="resourceShareName")
    private @Nullable Output<String> resourceShareName;

    /**
     * @return The name of resource share.
     * 
     */
    public Optional<Output<String>> resourceShareName() {
        return Optional.ofNullable(this.resourceShareName);
    }

    /**
     * The owner of resource share.
     * 
     */
    @Import(name="resourceShareOwner")
    private @Nullable Output<String> resourceShareOwner;

    /**
     * @return The owner of resource share.
     * 
     */
    public Optional<Output<String>> resourceShareOwner() {
        return Optional.ofNullable(this.resourceShareOwner);
    }

    /**
     * The status of resource share.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of resource share.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private ResourceShareState() {}

    private ResourceShareState(ResourceShareState $) {
        this.resourceShareName = $.resourceShareName;
        this.resourceShareOwner = $.resourceShareOwner;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceShareState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceShareState $;

        public Builder() {
            $ = new ResourceShareState();
        }

        public Builder(ResourceShareState defaults) {
            $ = new ResourceShareState(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceShareName The name of resource share.
         * 
         * @return builder
         * 
         */
        public Builder resourceShareName(@Nullable Output<String> resourceShareName) {
            $.resourceShareName = resourceShareName;
            return this;
        }

        /**
         * @param resourceShareName The name of resource share.
         * 
         * @return builder
         * 
         */
        public Builder resourceShareName(String resourceShareName) {
            return resourceShareName(Output.of(resourceShareName));
        }

        /**
         * @param resourceShareOwner The owner of resource share.
         * 
         * @return builder
         * 
         */
        public Builder resourceShareOwner(@Nullable Output<String> resourceShareOwner) {
            $.resourceShareOwner = resourceShareOwner;
            return this;
        }

        /**
         * @param resourceShareOwner The owner of resource share.
         * 
         * @return builder
         * 
         */
        public Builder resourceShareOwner(String resourceShareOwner) {
            return resourceShareOwner(Output.of(resourceShareOwner));
        }

        /**
         * @param status The status of resource share.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of resource share.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public ResourceShareState build() {
            return $;
        }
    }

}
