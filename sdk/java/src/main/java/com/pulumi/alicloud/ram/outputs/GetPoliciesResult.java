// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.outputs;

import com.pulumi.alicloud.ram.outputs.GetPoliciesPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPoliciesResult {
    private final @Nullable Boolean enableDetails;
    private final @Nullable String groupName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String nameRegex;
    /**
     * @return A list of ram group names.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;
    /**
     * @return A list of policies. Each element contains the following attributes:
     * 
     */
    private final List<GetPoliciesPolicy> policies;
    private final @Nullable String roleName;
    /**
     * @return Type of the policy.
     * 
     */
    private final @Nullable String type;
    private final @Nullable String userName;

    @CustomType.Constructor
    private GetPoliciesResult(
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("groupName") @Nullable String groupName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("policies") List<GetPoliciesPolicy> policies,
        @CustomType.Parameter("roleName") @Nullable String roleName,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("userName") @Nullable String userName) {
        this.enableDetails = enableDetails;
        this.groupName = groupName;
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.policies = policies;
        this.roleName = roleName;
        this.type = type;
        this.userName = userName;
    }

    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    public Optional<String> groupName() {
        return Optional.ofNullable(this.groupName);
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
    /**
     * @return A list of ram group names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of policies. Each element contains the following attributes:
     * 
     */
    public List<GetPoliciesPolicy> policies() {
        return this.policies;
    }
    public Optional<String> roleName() {
        return Optional.ofNullable(this.roleName);
    }
    /**
     * @return Type of the policy.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoliciesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableDetails;
        private @Nullable String groupName;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetPoliciesPolicy> policies;
        private @Nullable String roleName;
        private @Nullable String type;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPoliciesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDetails = defaults.enableDetails;
    	      this.groupName = defaults.groupName;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.policies = defaults.policies;
    	      this.roleName = defaults.roleName;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
        }
        public Builder groupName(@Nullable String groupName) {
            this.groupName = groupName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder policies(List<GetPoliciesPolicy> policies) {
            this.policies = Objects.requireNonNull(policies);
            return this;
        }
        public Builder policies(GetPoliciesPolicy... policies) {
            return policies(List.of(policies));
        }
        public Builder roleName(@Nullable String roleName) {
            this.roleName = roleName;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }        public GetPoliciesResult build() {
            return new GetPoliciesResult(enableDetails, groupName, id, ids, nameRegex, names, outputFile, policies, roleName, type, userName);
        }
    }
}
