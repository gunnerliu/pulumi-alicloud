// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EcsImageComponentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EcsImageComponentArgs Empty = new EcsImageComponentArgs();

    /**
     * The component type. Currently, only mirror build components are supported. Value: Build.  Default value: Build.
     * 
     */
    @Import(name="componentType")
    private @Nullable Output<String> componentType;

    /**
     * @return The component type. Currently, only mirror build components are supported. Value: Build.  Default value: Build.
     * 
     */
    public Optional<Output<String>> componentType() {
        return Optional.ofNullable(this.componentType);
    }

    /**
     * Component content.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    /**
     * @return Component content.
     * 
     */
    public Output<String> content() {
        return this.content;
    }

    /**
     * Describe the information.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Describe the information.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The component name. The name must be 2 to 128 characters in length and must start with an uppercase letter or a Chinese character. It cannot start with http:// or https. Can contain Chinese, English, numbers, half-length colons (:), underscores (_), half-length periods (.), or dashes (-).  Note: If Name is not set, the return value of ImageComponentId is used by default.
     * 
     */
    @Import(name="imageComponentName")
    private @Nullable Output<String> imageComponentName;

    /**
     * @return The component name. The name must be 2 to 128 characters in length and must start with an uppercase letter or a Chinese character. It cannot start with http:// or https. Can contain Chinese, English, numbers, half-length colons (:), underscores (_), half-length periods (.), or dashes (-).  Note: If Name is not set, the return value of ImageComponentId is used by default.
     * 
     */
    public Optional<Output<String>> imageComponentName() {
        return Optional.ofNullable(this.imageComponentName);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The operating system supported by the component. Currently, only Linux systems are supported. Value: Linux.  Default value: Linux.
     * 
     */
    @Import(name="systemType")
    private @Nullable Output<String> systemType;

    /**
     * @return The operating system supported by the component. Currently, only Linux systems are supported. Value: Linux.  Default value: Linux.
     * 
     */
    public Optional<Output<String>> systemType() {
        return Optional.ofNullable(this.systemType);
    }

    /**
     * List of label key-value pairs.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return List of label key-value pairs.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private EcsImageComponentArgs() {}

    private EcsImageComponentArgs(EcsImageComponentArgs $) {
        this.componentType = $.componentType;
        this.content = $.content;
        this.description = $.description;
        this.imageComponentName = $.imageComponentName;
        this.resourceGroupId = $.resourceGroupId;
        this.systemType = $.systemType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EcsImageComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EcsImageComponentArgs $;

        public Builder() {
            $ = new EcsImageComponentArgs();
        }

        public Builder(EcsImageComponentArgs defaults) {
            $ = new EcsImageComponentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentType The component type. Currently, only mirror build components are supported. Value: Build.  Default value: Build.
         * 
         * @return builder
         * 
         */
        public Builder componentType(@Nullable Output<String> componentType) {
            $.componentType = componentType;
            return this;
        }

        /**
         * @param componentType The component type. Currently, only mirror build components are supported. Value: Build.  Default value: Build.
         * 
         * @return builder
         * 
         */
        public Builder componentType(String componentType) {
            return componentType(Output.of(componentType));
        }

        /**
         * @param content Component content.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content Component content.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param description Describe the information.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Describe the information.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param imageComponentName The component name. The name must be 2 to 128 characters in length and must start with an uppercase letter or a Chinese character. It cannot start with http:// or https. Can contain Chinese, English, numbers, half-length colons (:), underscores (_), half-length periods (.), or dashes (-).  Note: If Name is not set, the return value of ImageComponentId is used by default.
         * 
         * @return builder
         * 
         */
        public Builder imageComponentName(@Nullable Output<String> imageComponentName) {
            $.imageComponentName = imageComponentName;
            return this;
        }

        /**
         * @param imageComponentName The component name. The name must be 2 to 128 characters in length and must start with an uppercase letter or a Chinese character. It cannot start with http:// or https. Can contain Chinese, English, numbers, half-length colons (:), underscores (_), half-length periods (.), or dashes (-).  Note: If Name is not set, the return value of ImageComponentId is used by default.
         * 
         * @return builder
         * 
         */
        public Builder imageComponentName(String imageComponentName) {
            return imageComponentName(Output.of(imageComponentName));
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param systemType The operating system supported by the component. Currently, only Linux systems are supported. Value: Linux.  Default value: Linux.
         * 
         * @return builder
         * 
         */
        public Builder systemType(@Nullable Output<String> systemType) {
            $.systemType = systemType;
            return this;
        }

        /**
         * @param systemType The operating system supported by the component. Currently, only Linux systems are supported. Value: Linux.  Default value: Linux.
         * 
         * @return builder
         * 
         */
        public Builder systemType(String systemType) {
            return systemType(Output.of(systemType));
        }

        /**
         * @param tags List of label key-value pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags List of label key-value pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        public EcsImageComponentArgs build() {
            if ($.content == null) {
                throw new MissingRequiredPropertyException("EcsImageComponentArgs", "content");
            }
            return $;
        }
    }

}
