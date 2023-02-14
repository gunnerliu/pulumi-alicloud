// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EcsImageComponentState extends com.pulumi.resources.ResourceArgs {

    public static final EcsImageComponentState Empty = new EcsImageComponentState();

    /**
     * The type of the image component. Only image building components are supported. Valid values: `Build`.
     * 
     */
    @Import(name="componentType")
    private @Nullable Output<String> componentType;

    /**
     * @return The type of the image component. Only image building components are supported. Valid values: `Build`.
     * 
     */
    public Optional<Output<String>> componentType() {
        return Optional.ofNullable(this.componentType);
    }

    /**
     * The content of the image component. The content can consist of up to 127 commands.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The content of the image component. The content can consist of up to 127 commands.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The description of the image component. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the image component. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the image component. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
     * 
     */
    @Import(name="imageComponentName")
    private @Nullable Output<String> imageComponentName;

    /**
     * @return The name of the image component. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
     * 
     */
    public Optional<Output<String>> imageComponentName() {
        return Optional.ofNullable(this.imageComponentName);
    }

    /**
     * The ID of the resource group to which to assign the image component.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group to which to assign the image component.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The operating system type supported by the image component. Only Linux is supported. Valid values: `Linux`.
     * 
     */
    @Import(name="systemType")
    private @Nullable Output<String> systemType;

    /**
     * @return The operating system type supported by the image component. Only Linux is supported. Valid values: `Linux`.
     * 
     */
    public Optional<Output<String>> systemType() {
        return Optional.ofNullable(this.systemType);
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

    private EcsImageComponentState() {}

    private EcsImageComponentState(EcsImageComponentState $) {
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
    public static Builder builder(EcsImageComponentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EcsImageComponentState $;

        public Builder() {
            $ = new EcsImageComponentState();
        }

        public Builder(EcsImageComponentState defaults) {
            $ = new EcsImageComponentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentType The type of the image component. Only image building components are supported. Valid values: `Build`.
         * 
         * @return builder
         * 
         */
        public Builder componentType(@Nullable Output<String> componentType) {
            $.componentType = componentType;
            return this;
        }

        /**
         * @param componentType The type of the image component. Only image building components are supported. Valid values: `Build`.
         * 
         * @return builder
         * 
         */
        public Builder componentType(String componentType) {
            return componentType(Output.of(componentType));
        }

        /**
         * @param content The content of the image component. The content can consist of up to 127 commands.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The content of the image component. The content can consist of up to 127 commands.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param description The description of the image component. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the image component. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param imageComponentName The name of the image component. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder imageComponentName(@Nullable Output<String> imageComponentName) {
            $.imageComponentName = imageComponentName;
            return this;
        }

        /**
         * @param imageComponentName The name of the image component. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder imageComponentName(String imageComponentName) {
            return imageComponentName(Output.of(imageComponentName));
        }

        /**
         * @param resourceGroupId The ID of the resource group to which to assign the image component.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group to which to assign the image component.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param systemType The operating system type supported by the image component. Only Linux is supported. Valid values: `Linux`.
         * 
         * @return builder
         * 
         */
        public Builder systemType(@Nullable Output<String> systemType) {
            $.systemType = systemType;
            return this;
        }

        /**
         * @param systemType The operating system type supported by the image component. Only Linux is supported. Valid values: `Linux`.
         * 
         * @return builder
         * 
         */
        public Builder systemType(String systemType) {
            return systemType(Output.of(systemType));
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

        public EcsImageComponentState build() {
            return $;
        }
    }

}