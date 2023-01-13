// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSlsGroupsGroupSlsGroupConfig {
    /**
     * @return The name of the Log Store.
     * 
     */
    private String slsLogstore;
    /**
     * @return The name of the Project.
     * 
     */
    private String slsProject;
    /**
     * @return The Sls Region.
     * 
     */
    private String slsRegion;
    /**
     * @return The ID of the Sls User.
     * 
     */
    private String slsUserId;

    private GetSlsGroupsGroupSlsGroupConfig() {}
    /**
     * @return The name of the Log Store.
     * 
     */
    public String slsLogstore() {
        return this.slsLogstore;
    }
    /**
     * @return The name of the Project.
     * 
     */
    public String slsProject() {
        return this.slsProject;
    }
    /**
     * @return The Sls Region.
     * 
     */
    public String slsRegion() {
        return this.slsRegion;
    }
    /**
     * @return The ID of the Sls User.
     * 
     */
    public String slsUserId() {
        return this.slsUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSlsGroupsGroupSlsGroupConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String slsLogstore;
        private String slsProject;
        private String slsRegion;
        private String slsUserId;
        public Builder() {}
        public Builder(GetSlsGroupsGroupSlsGroupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.slsLogstore = defaults.slsLogstore;
    	      this.slsProject = defaults.slsProject;
    	      this.slsRegion = defaults.slsRegion;
    	      this.slsUserId = defaults.slsUserId;
        }

        @CustomType.Setter
        public Builder slsLogstore(String slsLogstore) {
            this.slsLogstore = Objects.requireNonNull(slsLogstore);
            return this;
        }
        @CustomType.Setter
        public Builder slsProject(String slsProject) {
            this.slsProject = Objects.requireNonNull(slsProject);
            return this;
        }
        @CustomType.Setter
        public Builder slsRegion(String slsRegion) {
            this.slsRegion = Objects.requireNonNull(slsRegion);
            return this;
        }
        @CustomType.Setter
        public Builder slsUserId(String slsUserId) {
            this.slsUserId = Objects.requireNonNull(slsUserId);
            return this;
        }
        public GetSlsGroupsGroupSlsGroupConfig build() {
            final var o = new GetSlsGroupsGroupSlsGroupConfig();
            o.slsLogstore = slsLogstore;
            o.slsProject = slsProject;
            o.slsRegion = slsRegion;
            o.slsUserId = slsUserId;
            return o;
        }
    }
}
