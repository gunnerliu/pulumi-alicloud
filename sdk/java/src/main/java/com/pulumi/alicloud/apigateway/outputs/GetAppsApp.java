// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppsApp {
    /**
     * @return App code.
     * 
     */
    private final String appCode;
    /**
     * @return Creation time (Greenwich mean time).
     * 
     */
    private final String createdTime;
    /**
     * @return App description.
     * 
     */
    private final String description;
    /**
     * @return App ID, which is generated by the system and globally unique.
     * 
     */
    private final Integer id;
    /**
     * @return Last modification time (Greenwich mean time).
     * 
     */
    private final String modifiedTime;
    /**
     * @return App name.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetAppsApp(
        @CustomType.Parameter("appCode") String appCode,
        @CustomType.Parameter("createdTime") String createdTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") Integer id,
        @CustomType.Parameter("modifiedTime") String modifiedTime,
        @CustomType.Parameter("name") String name) {
        this.appCode = appCode;
        this.createdTime = createdTime;
        this.description = description;
        this.id = id;
        this.modifiedTime = modifiedTime;
        this.name = name;
    }

    /**
     * @return App code.
     * 
     */
    public String appCode() {
        return this.appCode;
    }
    /**
     * @return Creation time (Greenwich mean time).
     * 
     */
    public String createdTime() {
        return this.createdTime;
    }
    /**
     * @return App description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return App ID, which is generated by the system and globally unique.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return Last modification time (Greenwich mean time).
     * 
     */
    public String modifiedTime() {
        return this.modifiedTime;
    }
    /**
     * @return App name.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsApp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appCode;
        private String createdTime;
        private String description;
        private Integer id;
        private String modifiedTime;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppsApp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appCode = defaults.appCode;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
        }

        public Builder appCode(String appCode) {
            this.appCode = Objects.requireNonNull(appCode);
            return this;
        }
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = Objects.requireNonNull(modifiedTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetAppsApp build() {
            return new GetAppsApp(appCode, createdTime, description, id, modifiedTime, name);
        }
    }
}
