// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApisApi {
    /**
     * @return API description.
     * 
     */
    private String description;
    /**
     * @return ID of the specified group.
     * 
     */
    private String groupId;
    /**
     * @return The group name that the apis belong to.
     * 
     */
    private String groupName;
    /**
     * @return API ID, which is generated by the system and globally unique.
     * 
     */
    private String id;
    /**
     * @return API name.
     * 
     */
    private String name;
    /**
     * @return The ID of the region where the API is located.
     * 
     */
    private String regionId;

    private GetApisApi() {}
    /**
     * @return API description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return ID of the specified group.
     * 
     */
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The group name that the apis belong to.
     * 
     */
    public String groupName() {
        return this.groupName;
    }
    /**
     * @return API ID, which is generated by the system and globally unique.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return API name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the region where the API is located.
     * 
     */
    public String regionId() {
        return this.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApisApi defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String groupId;
        private String groupName;
        private String id;
        private String name;
        private String regionId;
        public Builder() {}
        public Builder(GetApisApi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.groupId = defaults.groupId;
    	      this.groupName = defaults.groupName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.regionId = defaults.regionId;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        @CustomType.Setter
        public Builder groupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        public GetApisApi build() {
            final var _resultValue = new GetApisApi();
            _resultValue.description = description;
            _resultValue.groupId = groupId;
            _resultValue.groupName = groupName;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.regionId = regionId;
            return _resultValue;
        }
    }
}
