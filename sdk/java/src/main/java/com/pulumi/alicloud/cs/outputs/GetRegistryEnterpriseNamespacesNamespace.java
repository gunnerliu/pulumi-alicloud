// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegistryEnterpriseNamespacesNamespace {
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
     * @return ID of Container Registry Enterprise Edition namespace. It formats as `&lt;instance_id&gt;:&lt;namespace_name&gt;`. Before 1.161.0, it is a namespace uuid.
     * 
     */
    private String id;
    /**
     * @return ID of Container Registry Enterprise Edition instance.
     * 
     */
    private String instanceId;
    /**
     * @return Name of Container Registry Enterprise Edition namespace.
     * 
     */
    private String name;
    /**
     * @return Container Registry Enterprise Edition namespace id. It is a uuid.
     * 
     */
    private String namespaceId;
    /**
     * @return Name of Container Registry Enterprise Edition namespace.
     * 
     */
    private String namespaceName;

    private GetRegistryEnterpriseNamespacesNamespace() {}
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
     * @return ID of Container Registry Enterprise Edition namespace. It formats as `&lt;instance_id&gt;:&lt;namespace_name&gt;`. Before 1.161.0, it is a namespace uuid.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return ID of Container Registry Enterprise Edition instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return Name of Container Registry Enterprise Edition namespace.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Container Registry Enterprise Edition namespace id. It is a uuid.
     * 
     */
    public String namespaceId() {
        return this.namespaceId;
    }
    /**
     * @return Name of Container Registry Enterprise Edition namespace.
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryEnterpriseNamespacesNamespace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autoCreate;
        private String defaultVisibility;
        private String id;
        private String instanceId;
        private String name;
        private String namespaceId;
        private String namespaceName;
        public Builder() {}
        public Builder(GetRegistryEnterpriseNamespacesNamespace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreate = defaults.autoCreate;
    	      this.defaultVisibility = defaults.defaultVisibility;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
    	      this.namespaceName = defaults.namespaceName;
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
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
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
        public GetRegistryEnterpriseNamespacesNamespace build() {
            final var _resultValue = new GetRegistryEnterpriseNamespacesNamespace();
            _resultValue.autoCreate = autoCreate;
            _resultValue.defaultVisibility = defaultVisibility;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.name = name;
            _resultValue.namespaceId = namespaceId;
            _resultValue.namespaceName = namespaceName;
            return _resultValue;
        }
    }
}
