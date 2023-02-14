// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros.outputs;

import com.pulumi.alicloud.ros.outputs.GetTemplatesTemplate;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTemplatesResult {
    private @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String shareType;
    private @Nullable Map<String,Object> tags;
    private @Nullable String templateName;
    private List<GetTemplatesTemplate> templates;

    private GetTemplatesResult() {}
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
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
    public Optional<String> shareType() {
        return Optional.ofNullable(this.shareType);
    }
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<String> templateName() {
        return Optional.ofNullable(this.templateName);
    }
    public List<GetTemplatesTemplate> templates() {
        return this.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplatesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String shareType;
        private @Nullable Map<String,Object> tags;
        private @Nullable String templateName;
        private List<GetTemplatesTemplate> templates;
        public Builder() {}
        public Builder(GetTemplatesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.shareType = defaults.shareType;
    	      this.tags = defaults.tags;
    	      this.templateName = defaults.templateName;
    	      this.templates = defaults.templates;
        }

        @CustomType.Setter
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
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
        public Builder shareType(@Nullable String shareType) {
            this.shareType = shareType;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder templateName(@Nullable String templateName) {
            this.templateName = templateName;
            return this;
        }
        @CustomType.Setter
        public Builder templates(List<GetTemplatesTemplate> templates) {
            this.templates = Objects.requireNonNull(templates);
            return this;
        }
        public Builder templates(GetTemplatesTemplate... templates) {
            return templates(List.of(templates));
        }
        public GetTemplatesResult build() {
            final var o = new GetTemplatesResult();
            o.enableDetails = enableDetails;
            o.id = id;
            o.ids = ids;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            o.shareType = shareType;
            o.tags = tags;
            o.templateName = templateName;
            o.templates = templates;
            return o;
        }
    }
}