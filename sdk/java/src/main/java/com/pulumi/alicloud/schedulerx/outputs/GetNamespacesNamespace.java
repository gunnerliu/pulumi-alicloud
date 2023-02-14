// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.schedulerx.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNamespacesNamespace {
    /**
     * @return The description of the resource.
     * 
     */
    private String description;
    /**
     * @return The ID of the resource.
     * 
     */
    private String id;
    /**
     * @return The ID of the Namespace.
     * 
     */
    private String namespaceId;
    /**
     * @return The name of the resource.
     * 
     */
    private String namespaceName;

    private GetNamespacesNamespace() {}
    /**
     * @return The description of the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the Namespace.
     * 
     */
    public String namespaceId() {
        return this.namespaceId;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespacesNamespace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String namespaceId;
        private String namespaceName;
        public Builder() {}
        public Builder(GetNamespacesNamespace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.namespaceId = defaults.namespaceId;
    	      this.namespaceName = defaults.namespaceName;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = Objects.requireNonNull(namespaceId);
            return this;
        }
        @CustomType.Setter
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public GetNamespacesNamespace build() {
            final var o = new GetNamespacesNamespace();
            o.description = description;
            o.id = id;
            o.namespaceId = namespaceId;
            o.namespaceName = namespaceName;
            return o;
        }
    }
}