// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.outputs;

import com.pulumi.alicloud.apigateway.outputs.GetPluginsPlugin;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPluginsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable Integer pageNumber;
    private @Nullable Integer pageSize;
    private @Nullable String pluginName;
    private @Nullable String pluginType;
    private List<GetPluginsPlugin> plugins;
    private @Nullable Map<String,Object> tags;

    private GetPluginsResult() {}
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
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }
    public Optional<String> pluginName() {
        return Optional.ofNullable(this.pluginName);
    }
    public Optional<String> pluginType() {
        return Optional.ofNullable(this.pluginType);
    }
    public List<GetPluginsPlugin> plugins() {
        return this.plugins;
    }
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPluginsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        private @Nullable String pluginName;
        private @Nullable String pluginType;
        private List<GetPluginsPlugin> plugins;
        private @Nullable Map<String,Object> tags;
        public Builder() {}
        public Builder(GetPluginsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
    	      this.pluginName = defaults.pluginName;
    	      this.pluginType = defaults.pluginType;
    	      this.plugins = defaults.plugins;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPluginsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetPluginsResult", "ids");
            }
            this.ids = ids;
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
            if (names == null) {
              throw new MissingRequiredPropertyException("GetPluginsResult", "names");
            }
            this.names = names;
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
        public Builder pageNumber(@Nullable Integer pageNumber) {

            this.pageNumber = pageNumber;
            return this;
        }
        @CustomType.Setter
        public Builder pageSize(@Nullable Integer pageSize) {

            this.pageSize = pageSize;
            return this;
        }
        @CustomType.Setter
        public Builder pluginName(@Nullable String pluginName) {

            this.pluginName = pluginName;
            return this;
        }
        @CustomType.Setter
        public Builder pluginType(@Nullable String pluginType) {

            this.pluginType = pluginType;
            return this;
        }
        @CustomType.Setter
        public Builder plugins(List<GetPluginsPlugin> plugins) {
            if (plugins == null) {
              throw new MissingRequiredPropertyException("GetPluginsResult", "plugins");
            }
            this.plugins = plugins;
            return this;
        }
        public Builder plugins(GetPluginsPlugin... plugins) {
            return plugins(List.of(plugins));
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,Object> tags) {

            this.tags = tags;
            return this;
        }
        public GetPluginsResult build() {
            final var _resultValue = new GetPluginsResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.pageNumber = pageNumber;
            _resultValue.pageSize = pageSize;
            _resultValue.pluginName = pluginName;
            _resultValue.pluginType = pluginType;
            _resultValue.plugins = plugins;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
