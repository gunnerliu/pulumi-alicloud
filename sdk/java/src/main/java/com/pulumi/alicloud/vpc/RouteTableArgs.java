// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteTableArgs Empty = new RouteTableArgs();

    /**
     * The description of the route table instance.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the route table instance.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Field `name` has been deprecated from provider version 1.119.1. New field `route_table_name` instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.119.1. New field &#39;route_table_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead. */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Field `name` has been deprecated from provider version 1.119.1. New field `route_table_name` instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.119.1. New field &#39;route_table_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead. */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the route table.
     * 
     */
    @Import(name="routeTableName")
    private @Nullable Output<String> routeTableName;

    /**
     * @return The name of the route table.
     * 
     */
    public Optional<Output<String>> routeTableName() {
        return Optional.ofNullable(this.routeTableName);
    }

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
     * The vpc_id of the route table, the field can&#39;t be changed.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The vpc_id of the route table, the field can&#39;t be changed.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    private RouteTableArgs() {}

    private RouteTableArgs(RouteTableArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.routeTableName = $.routeTableName;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteTableArgs $;

        public Builder() {
            $ = new RouteTableArgs();
        }

        public Builder(RouteTableArgs defaults) {
            $ = new RouteTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the route table instance.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the route table instance.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Field `name` has been deprecated from provider version 1.119.1. New field `route_table_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated from provider version 1.119.1. New field &#39;route_table_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead. */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Field `name` has been deprecated from provider version 1.119.1. New field `route_table_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated from provider version 1.119.1. New field &#39;route_table_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead. */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param routeTableName The name of the route table.
         * 
         * @return builder
         * 
         */
        public Builder routeTableName(@Nullable Output<String> routeTableName) {
            $.routeTableName = routeTableName;
            return this;
        }

        /**
         * @param routeTableName The name of the route table.
         * 
         * @return builder
         * 
         */
        public Builder routeTableName(String routeTableName) {
            return routeTableName(Output.of(routeTableName));
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
         * @param vpcId The vpc_id of the route table, the field can&#39;t be changed.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The vpc_id of the route table, the field can&#39;t be changed.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public RouteTableArgs build() {
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}
