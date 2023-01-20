// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitRouterMulticastDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransitRouterMulticastDomainArgs Empty = new TransitRouterMulticastDomainArgs();

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
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
     * The description of the multicast domain. The description must be 0 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).
     * 
     */
    @Import(name="transitRouterMulticastDomainDescription")
    private @Nullable Output<String> transitRouterMulticastDomainDescription;

    /**
     * @return The description of the multicast domain. The description must be 0 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).
     * 
     */
    public Optional<Output<String>> transitRouterMulticastDomainDescription() {
        return Optional.ofNullable(this.transitRouterMulticastDomainDescription);
    }

    /**
     * The name of the multicast domain. The name must be 0 to 128 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).
     * 
     */
    @Import(name="transitRouterMulticastDomainName")
    private @Nullable Output<String> transitRouterMulticastDomainName;

    /**
     * @return The name of the multicast domain. The name must be 0 to 128 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).
     * 
     */
    public Optional<Output<String>> transitRouterMulticastDomainName() {
        return Optional.ofNullable(this.transitRouterMulticastDomainName);
    }

    private TransitRouterMulticastDomainArgs() {}

    private TransitRouterMulticastDomainArgs(TransitRouterMulticastDomainArgs $) {
        this.tags = $.tags;
        this.transitRouterId = $.transitRouterId;
        this.transitRouterMulticastDomainDescription = $.transitRouterMulticastDomainDescription;
        this.transitRouterMulticastDomainName = $.transitRouterMulticastDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitRouterMulticastDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitRouterMulticastDomainArgs $;

        public Builder() {
            $ = new TransitRouterMulticastDomainArgs();
        }

        public Builder(TransitRouterMulticastDomainArgs defaults) {
            $ = new TransitRouterMulticastDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
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
         * @param transitRouterMulticastDomainDescription The description of the multicast domain. The description must be 0 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder transitRouterMulticastDomainDescription(@Nullable Output<String> transitRouterMulticastDomainDescription) {
            $.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
            return this;
        }

        /**
         * @param transitRouterMulticastDomainDescription The description of the multicast domain. The description must be 0 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder transitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
            return transitRouterMulticastDomainDescription(Output.of(transitRouterMulticastDomainDescription));
        }

        /**
         * @param transitRouterMulticastDomainName The name of the multicast domain. The name must be 0 to 128 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder transitRouterMulticastDomainName(@Nullable Output<String> transitRouterMulticastDomainName) {
            $.transitRouterMulticastDomainName = transitRouterMulticastDomainName;
            return this;
        }

        /**
         * @param transitRouterMulticastDomainName The name of the multicast domain. The name must be 0 to 128 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder transitRouterMulticastDomainName(String transitRouterMulticastDomainName) {
            return transitRouterMulticastDomainName(Output.of(transitRouterMulticastDomainName));
        }

        public TransitRouterMulticastDomainArgs build() {
            $.transitRouterId = Objects.requireNonNull($.transitRouterId, "expected parameter 'transitRouterId' to be non-null");
            return $;
        }
    }

}
