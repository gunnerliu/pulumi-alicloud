// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNamespacesNamespace {
    /**
     * @return Boolean, when it set to true, repositories are automatically created when pushing new images. If it set to false, you create repository for images before pushing.
     * 
     */
    private Boolean autoCreate;
    /**
     * @return `PUBLIC` or `PRIVATE`, default repository visibility in this namespace.
     * 
     */
    private String defaultVisibility;
    /**
     * @return Name of Container Registry namespace.
     * 
     */
    private String name;

    private GetNamespacesNamespace() {}
    /**
     * @return Boolean, when it set to true, repositories are automatically created when pushing new images. If it set to false, you create repository for images before pushing.
     * 
     */
    public Boolean autoCreate() {
        return this.autoCreate;
    }
    /**
     * @return `PUBLIC` or `PRIVATE`, default repository visibility in this namespace.
     * 
     */
    public String defaultVisibility() {
        return this.defaultVisibility;
    }
    /**
     * @return Name of Container Registry namespace.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespacesNamespace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autoCreate;
        private String defaultVisibility;
        private String name;
        public Builder() {}
        public Builder(GetNamespacesNamespace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreate = defaults.autoCreate;
    	      this.defaultVisibility = defaults.defaultVisibility;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder autoCreate(Boolean autoCreate) {
            this.autoCreate = Objects.requireNonNull(autoCreate);
            return this;
        }
        @CustomType.Setter
        public Builder defaultVisibility(String defaultVisibility) {
            this.defaultVisibility = Objects.requireNonNull(defaultVisibility);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetNamespacesNamespace build() {
            final var o = new GetNamespacesNamespace();
            o.autoCreate = autoCreate;
            o.defaultVisibility = defaultVisibility;
            o.name = name;
            return o;
        }
    }
}
