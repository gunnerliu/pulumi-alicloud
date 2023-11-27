// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetExtensionProvidersProvider {
    /**
     * @return The config of the Service Mesh Extension Provider.
     * 
     */
    private String config;
    /**
     * @return The name of the Service Mesh Extension Provider.
     * 
     */
    private String extensionProviderName;
    /**
     * @return The ID of the Service Mesh Extension Provider. It formats as `&lt;service_mesh_id&gt;:&lt;type&gt;:&lt;extension_provider_name&gt;`.
     * 
     */
    private String id;
    /**
     * @return The ID of the Service Mesh.
     * 
     */
    private String serviceMeshId;
    /**
     * @return The type of the Service Mesh Extension Provider. Valid values: `httpextauth`, `grpcextauth`.
     * 
     */
    private String type;

    private GetExtensionProvidersProvider() {}
    /**
     * @return The config of the Service Mesh Extension Provider.
     * 
     */
    public String config() {
        return this.config;
    }
    /**
     * @return The name of the Service Mesh Extension Provider.
     * 
     */
    public String extensionProviderName() {
        return this.extensionProviderName;
    }
    /**
     * @return The ID of the Service Mesh Extension Provider. It formats as `&lt;service_mesh_id&gt;:&lt;type&gt;:&lt;extension_provider_name&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the Service Mesh.
     * 
     */
    public String serviceMeshId() {
        return this.serviceMeshId;
    }
    /**
     * @return The type of the Service Mesh Extension Provider. Valid values: `httpextauth`, `grpcextauth`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExtensionProvidersProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String config;
        private String extensionProviderName;
        private String id;
        private String serviceMeshId;
        private String type;
        public Builder() {}
        public Builder(GetExtensionProvidersProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.extensionProviderName = defaults.extensionProviderName;
    	      this.id = defaults.id;
    	      this.serviceMeshId = defaults.serviceMeshId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder config(String config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        @CustomType.Setter
        public Builder extensionProviderName(String extensionProviderName) {
            this.extensionProviderName = Objects.requireNonNull(extensionProviderName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder serviceMeshId(String serviceMeshId) {
            this.serviceMeshId = Objects.requireNonNull(serviceMeshId);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetExtensionProvidersProvider build() {
            final var _resultValue = new GetExtensionProvidersProvider();
            _resultValue.config = config;
            _resultValue.extensionProviderName = extensionProviderName;
            _resultValue.id = id;
            _resultValue.serviceMeshId = serviceMeshId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
