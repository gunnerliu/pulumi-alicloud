// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetAutoSnapshotPoliciesPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAutoSnapshotPoliciesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private List<GetAutoSnapshotPoliciesPolicy> policies;
    private @Nullable String status;
    private @Nullable Map<String,Object> tags;

    private GetAutoSnapshotPoliciesResult() {}
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
    public List<GetAutoSnapshotPoliciesPolicy> policies() {
        return this.policies;
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutoSnapshotPoliciesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetAutoSnapshotPoliciesPolicy> policies;
        private @Nullable String status;
        private @Nullable Map<String,Object> tags;
        public Builder() {}
        public Builder(GetAutoSnapshotPoliciesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.policies = defaults.policies;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
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
        public Builder policies(List<GetAutoSnapshotPoliciesPolicy> policies) {
            this.policies = Objects.requireNonNull(policies);
            return this;
        }
        public Builder policies(GetAutoSnapshotPoliciesPolicy... policies) {
            return policies(List.of(policies));
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }
        public GetAutoSnapshotPoliciesResult build() {
            final var o = new GetAutoSnapshotPoliciesResult();
            o.id = id;
            o.ids = ids;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            o.policies = policies;
            o.status = status;
            o.tags = tags;
            return o;
        }
    }
}
