// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.imm.outputs;

import com.pulumi.alicloud.imm.outputs.GetProjectsProject;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String outputFile;
    private List<GetProjectsProject> projects;

    private GetProjectsResult() {}
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
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetProjectsProject> projects() {
        return this.projects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private List<GetProjectsProject> projects;
        public Builder() {}
        public Builder(GetProjectsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.projects = defaults.projects;
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
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder projects(List<GetProjectsProject> projects) {
            this.projects = Objects.requireNonNull(projects);
            return this;
        }
        public Builder projects(GetProjectsProject... projects) {
            return projects(List.of(projects));
        }
        public GetProjectsResult build() {
            final var _resultValue = new GetProjectsResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.outputFile = outputFile;
            _resultValue.projects = projects;
            return _resultValue;
        }
    }
}
