// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkAclResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAclResourceArgs Empty = new NetworkAclResourceArgs();

    /**
     * The ID of the associated resource.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The ID of the associated resource.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The type of the associated resource. Valid values `VSwitch`.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The type of the associated resource. Valid values `VSwitch`.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    private NetworkAclResourceArgs() {}

    private NetworkAclResourceArgs(NetworkAclResourceArgs $) {
        this.resourceId = $.resourceId;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAclResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAclResourceArgs $;

        public Builder() {
            $ = new NetworkAclResourceArgs();
        }

        public Builder(NetworkAclResourceArgs defaults) {
            $ = new NetworkAclResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceId The ID of the associated resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The ID of the associated resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param resourceType The type of the associated resource. Valid values `VSwitch`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The type of the associated resource. Valid values `VSwitch`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public NetworkAclResourceArgs build() {
            return $;
        }
    }

}
