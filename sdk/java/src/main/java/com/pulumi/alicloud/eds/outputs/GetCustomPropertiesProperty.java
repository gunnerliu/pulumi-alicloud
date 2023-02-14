// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.alicloud.eds.outputs.GetCustomPropertiesPropertyPropertyValue;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCustomPropertiesProperty {
    /**
     * @return The first ID of the resource.
     * 
     */
    private String customPropertyId;
    /**
     * @return The ID of the Custom Property.
     * 
     */
    private String id;
    /**
     * @return The Custom attribute key.
     * 
     */
    private String propertyKey;
    /**
     * @return Custom attribute sets the value of.
     * 
     */
    private List<GetCustomPropertiesPropertyPropertyValue> propertyValues;

    private GetCustomPropertiesProperty() {}
    /**
     * @return The first ID of the resource.
     * 
     */
    public String customPropertyId() {
        return this.customPropertyId;
    }
    /**
     * @return The ID of the Custom Property.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Custom attribute key.
     * 
     */
    public String propertyKey() {
        return this.propertyKey;
    }
    /**
     * @return Custom attribute sets the value of.
     * 
     */
    public List<GetCustomPropertiesPropertyPropertyValue> propertyValues() {
        return this.propertyValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomPropertiesProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String customPropertyId;
        private String id;
        private String propertyKey;
        private List<GetCustomPropertiesPropertyPropertyValue> propertyValues;
        public Builder() {}
        public Builder(GetCustomPropertiesProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customPropertyId = defaults.customPropertyId;
    	      this.id = defaults.id;
    	      this.propertyKey = defaults.propertyKey;
    	      this.propertyValues = defaults.propertyValues;
        }

        @CustomType.Setter
        public Builder customPropertyId(String customPropertyId) {
            this.customPropertyId = Objects.requireNonNull(customPropertyId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder propertyKey(String propertyKey) {
            this.propertyKey = Objects.requireNonNull(propertyKey);
            return this;
        }
        @CustomType.Setter
        public Builder propertyValues(List<GetCustomPropertiesPropertyPropertyValue> propertyValues) {
            this.propertyValues = Objects.requireNonNull(propertyValues);
            return this;
        }
        public Builder propertyValues(GetCustomPropertiesPropertyPropertyValue... propertyValues) {
            return propertyValues(List.of(propertyValues));
        }
        public GetCustomPropertiesProperty build() {
            final var o = new GetCustomPropertiesProperty();
            o.customPropertyId = customPropertyId;
            o.id = id;
            o.propertyKey = propertyKey;
            o.propertyValues = propertyValues;
            return o;
        }
    }
}