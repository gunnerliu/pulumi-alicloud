// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.outputs;

import com.pulumi.alicloud.ram.outputs.GetPolicyDocumentStatementCondition;
import com.pulumi.alicloud.ram.outputs.GetPolicyDocumentStatementPrincipal;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPolicyDocumentStatement {
    /**
     * @return Action of the RAM policy document. If you want to create a RAM role policy document, it must be `[&#34;sts:AssumeRole&#34;]`.
     * 
     */
    private final List<String> actions;
    /**
     * @return Specifies the condition that are required for a policy to take effect. See the following `Block condition`.
     * 
     */
    private final @Nullable List<GetPolicyDocumentStatementCondition> conditions;
    /**
     * @return This parameter indicates whether or not the `action` is allowed. Valid values are `Allow` and `Deny`. Default value is `Allow`. If you want to create a RAM role policy document, it must be `Allow`.
     * 
     */
    private final @Nullable String effect;
    /**
     * @return Principal of the RAM policy document. If you want to create a RAM role policy document, it must be set. See the following `Block principal`.
     * 
     */
    private final @Nullable List<GetPolicyDocumentStatementPrincipal> principals;
    /**
     * @return List of specific objects which will be authorized. If you want to create a RAM policy document, it must be set.
     * 
     */
    private final @Nullable List<String> resources;

    @CustomType.Constructor
    private GetPolicyDocumentStatement(
        @CustomType.Parameter("actions") List<String> actions,
        @CustomType.Parameter("conditions") @Nullable List<GetPolicyDocumentStatementCondition> conditions,
        @CustomType.Parameter("effect") @Nullable String effect,
        @CustomType.Parameter("principals") @Nullable List<GetPolicyDocumentStatementPrincipal> principals,
        @CustomType.Parameter("resources") @Nullable List<String> resources) {
        this.actions = actions;
        this.conditions = conditions;
        this.effect = effect;
        this.principals = principals;
        this.resources = resources;
    }

    /**
     * @return Action of the RAM policy document. If you want to create a RAM role policy document, it must be `[&#34;sts:AssumeRole&#34;]`.
     * 
     */
    public List<String> actions() {
        return this.actions;
    }
    /**
     * @return Specifies the condition that are required for a policy to take effect. See the following `Block condition`.
     * 
     */
    public List<GetPolicyDocumentStatementCondition> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * @return This parameter indicates whether or not the `action` is allowed. Valid values are `Allow` and `Deny`. Default value is `Allow`. If you want to create a RAM role policy document, it must be `Allow`.
     * 
     */
    public Optional<String> effect() {
        return Optional.ofNullable(this.effect);
    }
    /**
     * @return Principal of the RAM policy document. If you want to create a RAM role policy document, it must be set. See the following `Block principal`.
     * 
     */
    public List<GetPolicyDocumentStatementPrincipal> principals() {
        return this.principals == null ? List.of() : this.principals;
    }
    /**
     * @return List of specific objects which will be authorized. If you want to create a RAM policy document, it must be set.
     * 
     */
    public List<String> resources() {
        return this.resources == null ? List.of() : this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyDocumentStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> actions;
        private @Nullable List<GetPolicyDocumentStatementCondition> conditions;
        private @Nullable String effect;
        private @Nullable List<GetPolicyDocumentStatementPrincipal> principals;
        private @Nullable List<String> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyDocumentStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.conditions = defaults.conditions;
    	      this.effect = defaults.effect;
    	      this.principals = defaults.principals;
    	      this.resources = defaults.resources;
        }

        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        public Builder conditions(@Nullable List<GetPolicyDocumentStatementCondition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(GetPolicyDocumentStatementCondition... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder effect(@Nullable String effect) {
            this.effect = effect;
            return this;
        }
        public Builder principals(@Nullable List<GetPolicyDocumentStatementPrincipal> principals) {
            this.principals = principals;
            return this;
        }
        public Builder principals(GetPolicyDocumentStatementPrincipal... principals) {
            return principals(List.of(principals));
        }
        public Builder resources(@Nullable List<String> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }        public GetPolicyDocumentStatement build() {
            return new GetPolicyDocumentStatement(actions, conditions, effect, principals, resources);
        }
    }
}
