// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.inputs;

import com.pulumi.alicloud.resourcemanager.inputs.ResourceGroupRegionStatusArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceGroupState extends com.pulumi.resources.ResourceArgs {

    public static final ResourceGroupState Empty = new ResourceGroupState();

    /**
     * The ID of the Alibaba Cloud account to which the resource group belongs.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The ID of the Alibaba Cloud account to which the resource group belongs.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Field `name` has been deprecated from version 1.114.0. Use `resource_group_name` instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from version 1.114.0. Use &#39;resource_group_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from version 1.114.0. Use 'resource_group_name' instead. */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Field `name` has been deprecated from version 1.114.0. Use `resource_group_name` instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from version 1.114.0. Use &#39;resource_group_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from version 1.114.0. Use 'resource_group_name' instead. */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The status of the resource group in all regions.
     * 
     */
    @Import(name="regionStatuses")
    private @Nullable Output<List<ResourceGroupRegionStatusArgs>> regionStatuses;

    /**
     * @return The status of the resource group in all regions.
     * 
     */
    public Optional<Output<List<ResourceGroupRegionStatusArgs>>> regionStatuses() {
        return Optional.ofNullable(this.regionStatuses);
    }

    /**
     * The unique identifier of the resource group.The identifier must be 3 to 12 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The identifier must start with a letter.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The unique identifier of the resource group.The identifier must be 3 to 12 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The identifier must start with a letter.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The status of the regional resource group.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the regional resource group.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private ResourceGroupState() {}

    private ResourceGroupState(ResourceGroupState $) {
        this.accountId = $.accountId;
        this.displayName = $.displayName;
        this.name = $.name;
        this.regionStatuses = $.regionStatuses;
        this.resourceGroupName = $.resourceGroupName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceGroupState $;

        public Builder() {
            $ = new ResourceGroupState();
        }

        public Builder(ResourceGroupState defaults) {
            $ = new ResourceGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The ID of the Alibaba Cloud account to which the resource group belongs.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The ID of the Alibaba Cloud account to which the resource group belongs.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param displayName The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param name Field `name` has been deprecated from version 1.114.0. Use `resource_group_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated from version 1.114.0. Use &#39;resource_group_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated from version 1.114.0. Use 'resource_group_name' instead. */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Field `name` has been deprecated from version 1.114.0. Use `resource_group_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated from version 1.114.0. Use &#39;resource_group_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated from version 1.114.0. Use 'resource_group_name' instead. */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param regionStatuses The status of the resource group in all regions.
         * 
         * @return builder
         * 
         */
        public Builder regionStatuses(@Nullable Output<List<ResourceGroupRegionStatusArgs>> regionStatuses) {
            $.regionStatuses = regionStatuses;
            return this;
        }

        /**
         * @param regionStatuses The status of the resource group in all regions.
         * 
         * @return builder
         * 
         */
        public Builder regionStatuses(List<ResourceGroupRegionStatusArgs> regionStatuses) {
            return regionStatuses(Output.of(regionStatuses));
        }

        /**
         * @param regionStatuses The status of the resource group in all regions.
         * 
         * @return builder
         * 
         */
        public Builder regionStatuses(ResourceGroupRegionStatusArgs... regionStatuses) {
            return regionStatuses(List.of(regionStatuses));
        }

        /**
         * @param resourceGroupName The unique identifier of the resource group.The identifier must be 3 to 12 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The identifier must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The unique identifier of the resource group.The identifier must be 3 to 12 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The identifier must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param status The status of the regional resource group.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the regional resource group.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public ResourceGroupState build() {
            return $;
        }
    }

}