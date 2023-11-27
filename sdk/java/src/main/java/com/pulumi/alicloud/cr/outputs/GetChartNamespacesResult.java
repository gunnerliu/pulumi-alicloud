// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.alicloud.cr.outputs.GetChartNamespacesNamespace;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetChartNamespacesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private String instanceId;
    private @Nullable String nameRegex;
    private List<String> names;
    private List<GetChartNamespacesNamespace> namespaces;
    private @Nullable String outputFile;

    private GetChartNamespacesResult() {}
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
    public String instanceId() {
        return this.instanceId;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public List<GetChartNamespacesNamespace> namespaces() {
        return this.namespaces;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChartNamespacesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private String instanceId;
        private @Nullable String nameRegex;
        private List<String> names;
        private List<GetChartNamespacesNamespace> namespaces;
        private @Nullable String outputFile;
        public Builder() {}
        public Builder(GetChartNamespacesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.namespaces = defaults.namespaces;
    	      this.outputFile = defaults.outputFile;
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
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
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
        public Builder namespaces(List<GetChartNamespacesNamespace> namespaces) {
            this.namespaces = Objects.requireNonNull(namespaces);
            return this;
        }
        public Builder namespaces(GetChartNamespacesNamespace... namespaces) {
            return namespaces(List.of(namespaces));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public GetChartNamespacesResult build() {
            final var _resultValue = new GetChartNamespacesResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceId = instanceId;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.namespaces = namespaces;
            _resultValue.outputFile = outputFile;
            return _resultValue;
        }
    }
}
