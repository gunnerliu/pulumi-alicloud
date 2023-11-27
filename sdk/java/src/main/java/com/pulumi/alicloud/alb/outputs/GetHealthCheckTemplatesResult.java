// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.alicloud.alb.outputs.GetHealthCheckTemplatesTemplate;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHealthCheckTemplatesResult {
    private @Nullable List<String> healthCheckTemplateIds;
    private @Nullable String healthCheckTemplateName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private List<GetHealthCheckTemplatesTemplate> templates;

    private GetHealthCheckTemplatesResult() {}
    public List<String> healthCheckTemplateIds() {
        return this.healthCheckTemplateIds == null ? List.of() : this.healthCheckTemplateIds;
    }
    public Optional<String> healthCheckTemplateName() {
        return Optional.ofNullable(this.healthCheckTemplateName);
    }
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
    public List<GetHealthCheckTemplatesTemplate> templates() {
        return this.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthCheckTemplatesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> healthCheckTemplateIds;
        private @Nullable String healthCheckTemplateName;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetHealthCheckTemplatesTemplate> templates;
        public Builder() {}
        public Builder(GetHealthCheckTemplatesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheckTemplateIds = defaults.healthCheckTemplateIds;
    	      this.healthCheckTemplateName = defaults.healthCheckTemplateName;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.templates = defaults.templates;
        }

        @CustomType.Setter
        public Builder healthCheckTemplateIds(@Nullable List<String> healthCheckTemplateIds) {
            this.healthCheckTemplateIds = healthCheckTemplateIds;
            return this;
        }
        public Builder healthCheckTemplateIds(String... healthCheckTemplateIds) {
            return healthCheckTemplateIds(List.of(healthCheckTemplateIds));
        }
        @CustomType.Setter
        public Builder healthCheckTemplateName(@Nullable String healthCheckTemplateName) {
            this.healthCheckTemplateName = healthCheckTemplateName;
            return this;
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
        public Builder templates(List<GetHealthCheckTemplatesTemplate> templates) {
            this.templates = Objects.requireNonNull(templates);
            return this;
        }
        public Builder templates(GetHealthCheckTemplatesTemplate... templates) {
            return templates(List.of(templates));
        }
        public GetHealthCheckTemplatesResult build() {
            final var _resultValue = new GetHealthCheckTemplatesResult();
            _resultValue.healthCheckTemplateIds = healthCheckTemplateIds;
            _resultValue.healthCheckTemplateName = healthCheckTemplateName;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.templates = templates;
            return _resultValue;
        }
    }
}
