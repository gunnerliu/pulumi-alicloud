// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.alicloud.slb.outputs.GetTlsCipherPoliciesPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTlsCipherPoliciesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable Boolean includeListener;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private List<GetTlsCipherPoliciesPolicy> policies;
    private @Nullable String status;
    private @Nullable String tlsCipherPolicyName;

    private GetTlsCipherPoliciesResult() {}
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
    public Optional<Boolean> includeListener() {
        return Optional.ofNullable(this.includeListener);
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
    public List<GetTlsCipherPoliciesPolicy> policies() {
        return this.policies;
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> tlsCipherPolicyName() {
        return Optional.ofNullable(this.tlsCipherPolicyName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTlsCipherPoliciesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable Boolean includeListener;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetTlsCipherPoliciesPolicy> policies;
        private @Nullable String status;
        private @Nullable String tlsCipherPolicyName;
        public Builder() {}
        public Builder(GetTlsCipherPoliciesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.includeListener = defaults.includeListener;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.policies = defaults.policies;
    	      this.status = defaults.status;
    	      this.tlsCipherPolicyName = defaults.tlsCipherPolicyName;
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
        public Builder includeListener(@Nullable Boolean includeListener) {
            this.includeListener = includeListener;
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
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder policies(List<GetTlsCipherPoliciesPolicy> policies) {
            this.policies = Objects.requireNonNull(policies);
            return this;
        }
        public Builder policies(GetTlsCipherPoliciesPolicy... policies) {
            return policies(List.of(policies));
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tlsCipherPolicyName(@Nullable String tlsCipherPolicyName) {
            this.tlsCipherPolicyName = tlsCipherPolicyName;
            return this;
        }
        public GetTlsCipherPoliciesResult build() {
            final var _resultValue = new GetTlsCipherPoliciesResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.includeListener = includeListener;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.policies = policies;
            _resultValue.status = status;
            _resultValue.tlsCipherPolicyName = tlsCipherPolicyName;
            return _resultValue;
        }
    }
}
