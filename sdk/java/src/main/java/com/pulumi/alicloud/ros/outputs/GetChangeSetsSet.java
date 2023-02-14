// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros.outputs;

import com.pulumi.alicloud.ros.outputs.GetChangeSetsSetParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetChangeSetsSet {
    /**
     * @return The ID of the change set.
     * 
     */
    private String changeSetId;
    /**
     * @return The name of the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
     * 
     */
    private String changeSetName;
    /**
     * @return The type of the change set. Valid values:  CREATE: creates a change set for a new stack. UPDATE: creates a change set for an existing stack. IMPORT: creates a change set for a new stack or an existing stack to import non-ROS-managed resources. If you create a change set for a new stack, ROS creates a stack that has a unique stack ID. The stack is in the REVIEW_IN_PROGRESS state until you execute the change set.  You cannot use the UPDATE type to create a change set for a new stack or the CREATE type to create a change set for an existing stack.
     * 
     */
    private String changeSetType;
    /**
     * @return The description of the change set. The description can be up to 1,024 bytes in length.
     * 
     */
    private String description;
    /**
     * @return Specifies whether to disable rollback on stack creation failure. Default value: false.  Valid values:  true: disables rollback on stack creation failure. false: enables rollback on stack creation failure. Note This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.
     * 
     */
    private Boolean disableRollback;
    /**
     * @return The execution status of change set N. Maximum value of N: 5. Valid values:  UNAVAILABLE AVAILABLE EXECUTE_IN_PROGRESS EXECUTE_COMPLETE EXECUTE_FAILED OBSOLETE.
     * 
     */
    private String executionStatus;
    /**
     * @return The ID of the Change Set.
     * 
     */
    private String id;
    /**
     * @return Parameters.
     * 
     */
    private List<GetChangeSetsSetParameter> parameters;
    /**
     * @return The ID of the stack for which you want to create the change set. ROS generates the change set by comparing the stack information with the information that you submit, such as a modified template or different inputs.
     * 
     */
    private String stackId;
    /**
     * @return The name of the stack for which you want to create the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.  Note This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.
     * 
     */
    private String stackName;
    /**
     * @return The status of the change set.
     * 
     */
    private String status;
    /**
     * @return The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You can specify one of TemplateBody or TemplateURL parameters, but you cannot specify both of them.
     * 
     */
    private String templateBody;
    /**
     * @return Timeout In Minutes.
     * 
     */
    private Integer timeoutInMinutes;

    private GetChangeSetsSet() {}
    /**
     * @return The ID of the change set.
     * 
     */
    public String changeSetId() {
        return this.changeSetId;
    }
    /**
     * @return The name of the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
     * 
     */
    public String changeSetName() {
        return this.changeSetName;
    }
    /**
     * @return The type of the change set. Valid values:  CREATE: creates a change set for a new stack. UPDATE: creates a change set for an existing stack. IMPORT: creates a change set for a new stack or an existing stack to import non-ROS-managed resources. If you create a change set for a new stack, ROS creates a stack that has a unique stack ID. The stack is in the REVIEW_IN_PROGRESS state until you execute the change set.  You cannot use the UPDATE type to create a change set for a new stack or the CREATE type to create a change set for an existing stack.
     * 
     */
    public String changeSetType() {
        return this.changeSetType;
    }
    /**
     * @return The description of the change set. The description can be up to 1,024 bytes in length.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Specifies whether to disable rollback on stack creation failure. Default value: false.  Valid values:  true: disables rollback on stack creation failure. false: enables rollback on stack creation failure. Note This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.
     * 
     */
    public Boolean disableRollback() {
        return this.disableRollback;
    }
    /**
     * @return The execution status of change set N. Maximum value of N: 5. Valid values:  UNAVAILABLE AVAILABLE EXECUTE_IN_PROGRESS EXECUTE_COMPLETE EXECUTE_FAILED OBSOLETE.
     * 
     */
    public String executionStatus() {
        return this.executionStatus;
    }
    /**
     * @return The ID of the Change Set.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Parameters.
     * 
     */
    public List<GetChangeSetsSetParameter> parameters() {
        return this.parameters;
    }
    /**
     * @return The ID of the stack for which you want to create the change set. ROS generates the change set by comparing the stack information with the information that you submit, such as a modified template or different inputs.
     * 
     */
    public String stackId() {
        return this.stackId;
    }
    /**
     * @return The name of the stack for which you want to create the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.  Note This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.
     * 
     */
    public String stackName() {
        return this.stackName;
    }
    /**
     * @return The status of the change set.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You can specify one of TemplateBody or TemplateURL parameters, but you cannot specify both of them.
     * 
     */
    public String templateBody() {
        return this.templateBody;
    }
    /**
     * @return Timeout In Minutes.
     * 
     */
    public Integer timeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChangeSetsSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String changeSetId;
        private String changeSetName;
        private String changeSetType;
        private String description;
        private Boolean disableRollback;
        private String executionStatus;
        private String id;
        private List<GetChangeSetsSetParameter> parameters;
        private String stackId;
        private String stackName;
        private String status;
        private String templateBody;
        private Integer timeoutInMinutes;
        public Builder() {}
        public Builder(GetChangeSetsSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeSetId = defaults.changeSetId;
    	      this.changeSetName = defaults.changeSetName;
    	      this.changeSetType = defaults.changeSetType;
    	      this.description = defaults.description;
    	      this.disableRollback = defaults.disableRollback;
    	      this.executionStatus = defaults.executionStatus;
    	      this.id = defaults.id;
    	      this.parameters = defaults.parameters;
    	      this.stackId = defaults.stackId;
    	      this.stackName = defaults.stackName;
    	      this.status = defaults.status;
    	      this.templateBody = defaults.templateBody;
    	      this.timeoutInMinutes = defaults.timeoutInMinutes;
        }

        @CustomType.Setter
        public Builder changeSetId(String changeSetId) {
            this.changeSetId = Objects.requireNonNull(changeSetId);
            return this;
        }
        @CustomType.Setter
        public Builder changeSetName(String changeSetName) {
            this.changeSetName = Objects.requireNonNull(changeSetName);
            return this;
        }
        @CustomType.Setter
        public Builder changeSetType(String changeSetType) {
            this.changeSetType = Objects.requireNonNull(changeSetType);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder disableRollback(Boolean disableRollback) {
            this.disableRollback = Objects.requireNonNull(disableRollback);
            return this;
        }
        @CustomType.Setter
        public Builder executionStatus(String executionStatus) {
            this.executionStatus = Objects.requireNonNull(executionStatus);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder parameters(List<GetChangeSetsSetParameter> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(GetChangeSetsSetParameter... parameters) {
            return parameters(List.of(parameters));
        }
        @CustomType.Setter
        public Builder stackId(String stackId) {
            this.stackId = Objects.requireNonNull(stackId);
            return this;
        }
        @CustomType.Setter
        public Builder stackName(String stackName) {
            this.stackName = Objects.requireNonNull(stackName);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder templateBody(String templateBody) {
            this.templateBody = Objects.requireNonNull(templateBody);
            return this;
        }
        @CustomType.Setter
        public Builder timeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = Objects.requireNonNull(timeoutInMinutes);
            return this;
        }
        public GetChangeSetsSet build() {
            final var o = new GetChangeSetsSet();
            o.changeSetId = changeSetId;
            o.changeSetName = changeSetName;
            o.changeSetType = changeSetType;
            o.description = description;
            o.disableRollback = disableRollback;
            o.executionStatus = executionStatus;
            o.id = id;
            o.parameters = parameters;
            o.stackId = stackId;
            o.stackName = stackName;
            o.status = status;
            o.templateBody = templateBody;
            o.timeoutInMinutes = timeoutInMinutes;
            return o;
        }
    }
}