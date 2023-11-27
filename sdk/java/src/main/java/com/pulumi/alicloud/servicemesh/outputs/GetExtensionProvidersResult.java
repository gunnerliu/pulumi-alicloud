// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.outputs;

import com.pulumi.alicloud.servicemesh.outputs.GetExtensionProvidersProvider;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExtensionProvidersResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    /**
     * @return A list of Extension Provider names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return A list of Service Mesh Extension Providers. Each element contains the following attributes:
     * 
     */
    private List<GetExtensionProvidersProvider> providers;
    /**
     * @return The ID of the Service Mesh.
     * 
     */
    private String serviceMeshId;
    /**
     * @return The type of the Service Mesh Extension Provider.
     * 
     */
    private String type;

    private GetExtensionProvidersResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of Extension Provider names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of Service Mesh Extension Providers. Each element contains the following attributes:
     * 
     */
    public List<GetExtensionProvidersProvider> providers() {
        return this.providers;
    }
    /**
     * @return The ID of the Service Mesh.
     * 
     */
    public String serviceMeshId() {
        return this.serviceMeshId;
    }
    /**
     * @return The type of the Service Mesh Extension Provider.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExtensionProvidersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetExtensionProvidersProvider> providers;
        private String serviceMeshId;
        private String type;
        public Builder() {}
        public Builder(GetExtensionProvidersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.providers = defaults.providers;
    	      this.serviceMeshId = defaults.serviceMeshId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder providers(List<GetExtensionProvidersProvider> providers) {
            this.providers = Objects.requireNonNull(providers);
            return this;
        }
        public Builder providers(GetExtensionProvidersProvider... providers) {
            return providers(List.of(providers));
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
        public GetExtensionProvidersResult build() {
            final var _resultValue = new GetExtensionProvidersResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.providers = providers;
            _resultValue.serviceMeshId = serviceMeshId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
