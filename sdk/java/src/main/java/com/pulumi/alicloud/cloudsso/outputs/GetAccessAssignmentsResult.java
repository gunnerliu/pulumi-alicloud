// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso.outputs;

import com.pulumi.alicloud.cloudsso.outputs.GetAccessAssignmentsAssignment;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccessAssignmentsResult {
    private @Nullable String accessConfigurationId;
    private List<GetAccessAssignmentsAssignment> assignments;
    private String directoryId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String outputFile;
    private @Nullable String principalType;
    private @Nullable String targetId;
    private @Nullable String targetType;

    private GetAccessAssignmentsResult() {}
    public Optional<String> accessConfigurationId() {
        return Optional.ofNullable(this.accessConfigurationId);
    }
    public List<GetAccessAssignmentsAssignment> assignments() {
        return this.assignments;
    }
    public String directoryId() {
        return this.directoryId;
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
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> principalType() {
        return Optional.ofNullable(this.principalType);
    }
    public Optional<String> targetId() {
        return Optional.ofNullable(this.targetId);
    }
    public Optional<String> targetType() {
        return Optional.ofNullable(this.targetType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessAssignmentsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessConfigurationId;
        private List<GetAccessAssignmentsAssignment> assignments;
        private String directoryId;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private @Nullable String principalType;
        private @Nullable String targetId;
        private @Nullable String targetType;
        public Builder() {}
        public Builder(GetAccessAssignmentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigurationId = defaults.accessConfigurationId;
    	      this.assignments = defaults.assignments;
    	      this.directoryId = defaults.directoryId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.principalType = defaults.principalType;
    	      this.targetId = defaults.targetId;
    	      this.targetType = defaults.targetType;
        }

        @CustomType.Setter
        public Builder accessConfigurationId(@Nullable String accessConfigurationId) {
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }
        @CustomType.Setter
        public Builder assignments(List<GetAccessAssignmentsAssignment> assignments) {
            this.assignments = Objects.requireNonNull(assignments);
            return this;
        }
        public Builder assignments(GetAccessAssignmentsAssignment... assignments) {
            return assignments(List.of(assignments));
        }
        @CustomType.Setter
        public Builder directoryId(String directoryId) {
            this.directoryId = Objects.requireNonNull(directoryId);
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
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder principalType(@Nullable String principalType) {
            this.principalType = principalType;
            return this;
        }
        @CustomType.Setter
        public Builder targetId(@Nullable String targetId) {
            this.targetId = targetId;
            return this;
        }
        @CustomType.Setter
        public Builder targetType(@Nullable String targetType) {
            this.targetType = targetType;
            return this;
        }
        public GetAccessAssignmentsResult build() {
            final var _resultValue = new GetAccessAssignmentsResult();
            _resultValue.accessConfigurationId = accessConfigurationId;
            _resultValue.assignments = assignments;
            _resultValue.directoryId = directoryId;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.outputFile = outputFile;
            _resultValue.principalType = principalType;
            _resultValue.targetId = targetId;
            _resultValue.targetType = targetType;
            return _resultValue;
        }
    }
}
