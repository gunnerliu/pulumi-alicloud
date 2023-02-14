// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStudioApplicationsApplication {
    /**
     * @return The ID of the Application.
     * 
     */
    private String applicationId;
    /**
     * @return The name of the Application.
     * 
     */
    private String applicationName;
    /**
     * @return The creation time of the Application.
     * 
     */
    private String createTime;
    /**
     * @return The ID of the Application.
     * 
     */
    private String id;
    /**
     * @return The image url of the Application.
     * 
     */
    private String imageUrl;
    /**
     * @return The ID of the resource group.
     * 
     */
    private String resourceGroupId;
    /**
     * @return The status of the Application. Valid values: `success`, `release`.
     * 
     */
    private String status;
    /**
     * @return The topo url of the Application.
     * 
     */
    private String topoUrl;

    private GetStudioApplicationsApplication() {}
    /**
     * @return The ID of the Application.
     * 
     */
    public String applicationId() {
        return this.applicationId;
    }
    /**
     * @return The name of the Application.
     * 
     */
    public String applicationName() {
        return this.applicationName;
    }
    /**
     * @return The creation time of the Application.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The ID of the Application.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The image url of the Application.
     * 
     */
    public String imageUrl() {
        return this.imageUrl;
    }
    /**
     * @return The ID of the resource group.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The status of the Application. Valid values: `success`, `release`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The topo url of the Application.
     * 
     */
    public String topoUrl() {
        return this.topoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStudioApplicationsApplication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applicationId;
        private String applicationName;
        private String createTime;
        private String id;
        private String imageUrl;
        private String resourceGroupId;
        private String status;
        private String topoUrl;
        public Builder() {}
        public Builder(GetStudioApplicationsApplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.applicationName = defaults.applicationName;
    	      this.createTime = defaults.createTime;
    	      this.id = defaults.id;
    	      this.imageUrl = defaults.imageUrl;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.status = defaults.status;
    	      this.topoUrl = defaults.topoUrl;
        }

        @CustomType.Setter
        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        @CustomType.Setter
        public Builder applicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = Objects.requireNonNull(imageUrl);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder topoUrl(String topoUrl) {
            this.topoUrl = Objects.requireNonNull(topoUrl);
            return this;
        }
        public GetStudioApplicationsApplication build() {
            final var o = new GetStudioApplicationsApplication();
            o.applicationId = applicationId;
            o.applicationName = applicationName;
            o.createTime = createTime;
            o.id = id;
            o.imageUrl = imageUrl;
            o.resourceGroupId = resourceGroupId;
            o.status = status;
            o.topoUrl = topoUrl;
            return o;
        }
    }
}