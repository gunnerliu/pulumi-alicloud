// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetEcsImageComponentsComponent {
    /**
     * @return The type of the image component.
     * 
     */
    private String componentType;
    /**
     * @return The content of the image component.
     * 
     */
    private String content;
    /**
     * @return The time when the image component was created.
     * 
     */
    private String createTime;
    /**
     * @return The description of the image component.
     * 
     */
    private String description;
    /**
     * @return The ID of the Image Component.
     * 
     */
    private String id;
    /**
     * @return The ID of the image component.
     * 
     */
    private String imageComponentId;
    /**
     * @return The name of the image component.
     * 
     */
    private String imageComponentName;
    /**
     * @return The type of the image component.
     * 
     */
    private String owner;
    /**
     * @return The ID of the resource group.
     * 
     */
    private String resourceGroupId;
    /**
     * @return The operating system type supported by the image component.
     * 
     */
    private String systemType;
    /**
     * @return List of label key-value pairs.
     * 
     */
    private Map<String,Object> tags;

    private GetEcsImageComponentsComponent() {}
    /**
     * @return The type of the image component.
     * 
     */
    public String componentType() {
        return this.componentType;
    }
    /**
     * @return The content of the image component.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return The time when the image component was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of the image component.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Image Component.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the image component.
     * 
     */
    public String imageComponentId() {
        return this.imageComponentId;
    }
    /**
     * @return The name of the image component.
     * 
     */
    public String imageComponentName() {
        return this.imageComponentName;
    }
    /**
     * @return The type of the image component.
     * 
     */
    public String owner() {
        return this.owner;
    }
    /**
     * @return The ID of the resource group.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The operating system type supported by the image component.
     * 
     */
    public String systemType() {
        return this.systemType;
    }
    /**
     * @return List of label key-value pairs.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsImageComponentsComponent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String componentType;
        private String content;
        private String createTime;
        private String description;
        private String id;
        private String imageComponentId;
        private String imageComponentName;
        private String owner;
        private String resourceGroupId;
        private String systemType;
        private Map<String,Object> tags;
        public Builder() {}
        public Builder(GetEcsImageComponentsComponent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentType = defaults.componentType;
    	      this.content = defaults.content;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.imageComponentId = defaults.imageComponentId;
    	      this.imageComponentName = defaults.imageComponentName;
    	      this.owner = defaults.owner;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.systemType = defaults.systemType;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder componentType(String componentType) {
            if (componentType == null) {
              throw new MissingRequiredPropertyException("GetEcsImageComponentsComponent", "componentType");
            }
            this.componentType = componentType;
            return this;
        }
        @CustomType.Setter
        public Builder content(String content) {
            if (content == null) {
              throw new MissingRequiredPropertyException("GetEcsImageComponentsComponent", "content");
            }
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetEcsImageComponentsComponent", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetEcsImageComponentsComponent", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEcsImageComponentsComponent", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder imageComponentId(String imageComponentId) {
            if (imageComponentId == null) {
              throw new MissingRequiredPropertyException("GetEcsImageComponentsComponent", "imageComponentId");
            }
            this.imageComponentId = imageComponentId;
            return this;
        }
        @CustomType.Setter
        public Builder imageComponentName(String imageComponentName) {
            if (imageComponentName == null) {
              throw new MissingRequiredPropertyException("GetEcsImageComponentsComponent", "imageComponentName");
            }
            this.imageComponentName = imageComponentName;
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            if (owner == null) {
              throw new MissingRequiredPropertyException("GetEcsImageComponentsComponent", "owner");
            }
            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            if (resourceGroupId == null) {
              throw new MissingRequiredPropertyException("GetEcsImageComponentsComponent", "resourceGroupId");
            }
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder systemType(String systemType) {
            if (systemType == null) {
              throw new MissingRequiredPropertyException("GetEcsImageComponentsComponent", "systemType");
            }
            this.systemType = systemType;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetEcsImageComponentsComponent", "tags");
            }
            this.tags = tags;
            return this;
        }
        public GetEcsImageComponentsComponent build() {
            final var _resultValue = new GetEcsImageComponentsComponent();
            _resultValue.componentType = componentType;
            _resultValue.content = content;
            _resultValue.createTime = createTime;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.imageComponentId = imageComponentId;
            _resultValue.imageComponentName = imageComponentName;
            _resultValue.owner = owner;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.systemType = systemType;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
