// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fnf.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFlowsFlow {
    /**
     * @return The definition of the flow. It must comply with the Flow Definition Language (FDL) syntax.
     * 
     */
    private String definition;
    /**
     * @return The description of the flow.
     * 
     */
    private String description;
    /**
     * @return The unique ID of the flow.
     * 
     */
    private String flowId;
    /**
     * @return The ID of the Flow.
     * 
     */
    private String id;
    /**
     * @return The time when the flow was last modified.
     * 
     */
    private String lastModifiedTime;
    /**
     * @return The name of the flow. The name must be unique in an Alibaba Cloud account.
     * 
     */
    private String name;
    /**
     * @return The ARN of the specified RAM role that Serverless Workflow uses to assume the role when Serverless Workflow executes a flow.
     * 
     */
    private String roleArn;
    /**
     * @return The type of the flow. Set the value to `FDL`.
     * 
     */
    private String type;

    private GetFlowsFlow() {}
    /**
     * @return The definition of the flow. It must comply with the Flow Definition Language (FDL) syntax.
     * 
     */
    public String definition() {
        return this.definition;
    }
    /**
     * @return The description of the flow.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The unique ID of the flow.
     * 
     */
    public String flowId() {
        return this.flowId;
    }
    /**
     * @return The ID of the Flow.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The time when the flow was last modified.
     * 
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * @return The name of the flow. The name must be unique in an Alibaba Cloud account.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ARN of the specified RAM role that Serverless Workflow uses to assume the role when Serverless Workflow executes a flow.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The type of the flow. Set the value to `FDL`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlowsFlow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String definition;
        private String description;
        private String flowId;
        private String id;
        private String lastModifiedTime;
        private String name;
        private String roleArn;
        private String type;
        public Builder() {}
        public Builder(GetFlowsFlow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.description = defaults.description;
    	      this.flowId = defaults.flowId;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder definition(String definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder flowId(String flowId) {
            this.flowId = Objects.requireNonNull(flowId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetFlowsFlow build() {
            final var _resultValue = new GetFlowsFlow();
            _resultValue.definition = definition;
            _resultValue.description = description;
            _resultValue.flowId = flowId;
            _resultValue.id = id;
            _resultValue.lastModifiedTime = lastModifiedTime;
            _resultValue.name = name;
            _resultValue.roleArn = roleArn;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
