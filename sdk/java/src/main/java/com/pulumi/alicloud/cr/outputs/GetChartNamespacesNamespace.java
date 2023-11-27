// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetChartNamespacesNamespace {
    /**
     * @return Indicates whether a repository is automatically created when an image is pushed to the namespace.
     * 
     */
    private Boolean autoCreateRepo;
    /**
     * @return The ID of the namespace.
     * 
     */
    private String chartNamespaceId;
    /**
     * @return The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
     * 
     */
    private String defaultRepoType;
    /**
     * @return The ID of the Chart Namespace.
     * 
     */
    private String id;
    /**
     * @return The ID of the namespace.
     * 
     */
    private String instanceId;
    /**
     * @return The name of the namespace.
     * 
     */
    private String namespaceName;

    private GetChartNamespacesNamespace() {}
    /**
     * @return Indicates whether a repository is automatically created when an image is pushed to the namespace.
     * 
     */
    public Boolean autoCreateRepo() {
        return this.autoCreateRepo;
    }
    /**
     * @return The ID of the namespace.
     * 
     */
    public String chartNamespaceId() {
        return this.chartNamespaceId;
    }
    /**
     * @return The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
     * 
     */
    public String defaultRepoType() {
        return this.defaultRepoType;
    }
    /**
     * @return The ID of the Chart Namespace.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the namespace.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The name of the namespace.
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChartNamespacesNamespace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autoCreateRepo;
        private String chartNamespaceId;
        private String defaultRepoType;
        private String id;
        private String instanceId;
        private String namespaceName;
        public Builder() {}
        public Builder(GetChartNamespacesNamespace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateRepo = defaults.autoCreateRepo;
    	      this.chartNamespaceId = defaults.chartNamespaceId;
    	      this.defaultRepoType = defaults.defaultRepoType;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.namespaceName = defaults.namespaceName;
        }

        @CustomType.Setter
        public Builder autoCreateRepo(Boolean autoCreateRepo) {
            this.autoCreateRepo = Objects.requireNonNull(autoCreateRepo);
            return this;
        }
        @CustomType.Setter
        public Builder chartNamespaceId(String chartNamespaceId) {
            this.chartNamespaceId = Objects.requireNonNull(chartNamespaceId);
            return this;
        }
        @CustomType.Setter
        public Builder defaultRepoType(String defaultRepoType) {
            this.defaultRepoType = Objects.requireNonNull(defaultRepoType);
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
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public GetChartNamespacesNamespace build() {
            final var _resultValue = new GetChartNamespacesNamespace();
            _resultValue.autoCreateRepo = autoCreateRepo;
            _resultValue.chartNamespaceId = chartNamespaceId;
            _resultValue.defaultRepoType = defaultRepoType;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.namespaceName = namespaceName;
            return _resultValue;
        }
    }
}
