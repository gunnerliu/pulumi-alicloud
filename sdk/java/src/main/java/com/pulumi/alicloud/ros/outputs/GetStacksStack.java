// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros.outputs;

import com.pulumi.alicloud.ros.outputs.GetStacksStackParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetStacksStack {
    /**
     * @return Specifies whether to enable deletion protection on the stack.
     * 
     */
    private String deletionProtection;
    /**
     * @return The Description of the Stack.
     * 
     */
    private String description;
    /**
     * @return Specifies whether to disable rollback on stack creation failure..
     * 
     */
    private Boolean disableRollback;
    /**
     * @return Drift DetectionTime.
     * 
     */
    private String driftDetectionTime;
    /**
     * @return The ID of the Stack.
     * 
     */
    private String id;
    /**
     * @return The parameters.
     * 
     */
    private List<GetStacksStackParameter> parameters;
    /**
     * @return Parent Stack Id.
     * 
     */
    private String parentStackId;
    /**
     * @return The RamRoleName.
     * 
     */
    private String ramRoleName;
    /**
     * @return Root Stack Id.
     * 
     */
    private String rootStackId;
    /**
     * @return Stack DriftStatus.
     * 
     */
    private String stackDriftStatus;
    /**
     * @return Stack Id.
     * 
     */
    private String stackId;
    /**
     * @return Stack Name.
     * 
     */
    private String stackName;
    /**
     * @return The structure that contains the stack policy body.
     * 
     */
    private String stackPolicyBody;
    /**
     * @return The status of Stack. Valid Values: `CREATE_COMPLETE`, `CREATE_FAILED`, `CREATE_IN_PROGRESS`, `DELETE_COMPLETE`, `DELETE_FAILED`, `DELETE_IN_PROGRESS`, `ROLLBACK_COMPLETE`, `ROLLBACK_FAILED`, `ROLLBACK_IN_PROGRESS`.
     * 
     */
    private String status;
    /**
     * @return Status Reason.
     * 
     */
    private String statusReason;
    /**
     * @return Query the instance bound to the tag. The format of the incoming value is `json` string, including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `{&#34;key1&#34;:&#34;value1&#34;}`.
     * 
     */
    private Map<String,Object> tags;
    /**
     * @return Template Description.
     * 
     */
    private String templateDescription;
    /**
     * @return Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request.
     * 
     */
    private Integer timeoutInMinutes;

    private GetStacksStack() {}
    /**
     * @return Specifies whether to enable deletion protection on the stack.
     * 
     */
    public String deletionProtection() {
        return this.deletionProtection;
    }
    /**
     * @return The Description of the Stack.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Specifies whether to disable rollback on stack creation failure..
     * 
     */
    public Boolean disableRollback() {
        return this.disableRollback;
    }
    /**
     * @return Drift DetectionTime.
     * 
     */
    public String driftDetectionTime() {
        return this.driftDetectionTime;
    }
    /**
     * @return The ID of the Stack.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The parameters.
     * 
     */
    public List<GetStacksStackParameter> parameters() {
        return this.parameters;
    }
    /**
     * @return Parent Stack Id.
     * 
     */
    public String parentStackId() {
        return this.parentStackId;
    }
    /**
     * @return The RamRoleName.
     * 
     */
    public String ramRoleName() {
        return this.ramRoleName;
    }
    /**
     * @return Root Stack Id.
     * 
     */
    public String rootStackId() {
        return this.rootStackId;
    }
    /**
     * @return Stack DriftStatus.
     * 
     */
    public String stackDriftStatus() {
        return this.stackDriftStatus;
    }
    /**
     * @return Stack Id.
     * 
     */
    public String stackId() {
        return this.stackId;
    }
    /**
     * @return Stack Name.
     * 
     */
    public String stackName() {
        return this.stackName;
    }
    /**
     * @return The structure that contains the stack policy body.
     * 
     */
    public String stackPolicyBody() {
        return this.stackPolicyBody;
    }
    /**
     * @return The status of Stack. Valid Values: `CREATE_COMPLETE`, `CREATE_FAILED`, `CREATE_IN_PROGRESS`, `DELETE_COMPLETE`, `DELETE_FAILED`, `DELETE_IN_PROGRESS`, `ROLLBACK_COMPLETE`, `ROLLBACK_FAILED`, `ROLLBACK_IN_PROGRESS`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Status Reason.
     * 
     */
    public String statusReason() {
        return this.statusReason;
    }
    /**
     * @return Query the instance bound to the tag. The format of the incoming value is `json` string, including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `{&#34;key1&#34;:&#34;value1&#34;}`.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return Template Description.
     * 
     */
    public String templateDescription() {
        return this.templateDescription;
    }
    /**
     * @return Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request.
     * 
     */
    public Integer timeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStacksStack defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deletionProtection;
        private String description;
        private Boolean disableRollback;
        private String driftDetectionTime;
        private String id;
        private List<GetStacksStackParameter> parameters;
        private String parentStackId;
        private String ramRoleName;
        private String rootStackId;
        private String stackDriftStatus;
        private String stackId;
        private String stackName;
        private String stackPolicyBody;
        private String status;
        private String statusReason;
        private Map<String,Object> tags;
        private String templateDescription;
        private Integer timeoutInMinutes;
        public Builder() {}
        public Builder(GetStacksStack defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.description = defaults.description;
    	      this.disableRollback = defaults.disableRollback;
    	      this.driftDetectionTime = defaults.driftDetectionTime;
    	      this.id = defaults.id;
    	      this.parameters = defaults.parameters;
    	      this.parentStackId = defaults.parentStackId;
    	      this.ramRoleName = defaults.ramRoleName;
    	      this.rootStackId = defaults.rootStackId;
    	      this.stackDriftStatus = defaults.stackDriftStatus;
    	      this.stackId = defaults.stackId;
    	      this.stackName = defaults.stackName;
    	      this.stackPolicyBody = defaults.stackPolicyBody;
    	      this.status = defaults.status;
    	      this.statusReason = defaults.statusReason;
    	      this.tags = defaults.tags;
    	      this.templateDescription = defaults.templateDescription;
    	      this.timeoutInMinutes = defaults.timeoutInMinutes;
        }

        @CustomType.Setter
        public Builder deletionProtection(String deletionProtection) {
            this.deletionProtection = Objects.requireNonNull(deletionProtection);
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
        public Builder driftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = Objects.requireNonNull(driftDetectionTime);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder parameters(List<GetStacksStackParameter> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(GetStacksStackParameter... parameters) {
            return parameters(List.of(parameters));
        }
        @CustomType.Setter
        public Builder parentStackId(String parentStackId) {
            this.parentStackId = Objects.requireNonNull(parentStackId);
            return this;
        }
        @CustomType.Setter
        public Builder ramRoleName(String ramRoleName) {
            this.ramRoleName = Objects.requireNonNull(ramRoleName);
            return this;
        }
        @CustomType.Setter
        public Builder rootStackId(String rootStackId) {
            this.rootStackId = Objects.requireNonNull(rootStackId);
            return this;
        }
        @CustomType.Setter
        public Builder stackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = Objects.requireNonNull(stackDriftStatus);
            return this;
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
        public Builder stackPolicyBody(String stackPolicyBody) {
            this.stackPolicyBody = Objects.requireNonNull(stackPolicyBody);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder statusReason(String statusReason) {
            this.statusReason = Objects.requireNonNull(statusReason);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder templateDescription(String templateDescription) {
            this.templateDescription = Objects.requireNonNull(templateDescription);
            return this;
        }
        @CustomType.Setter
        public Builder timeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = Objects.requireNonNull(timeoutInMinutes);
            return this;
        }
        public GetStacksStack build() {
            final var o = new GetStacksStack();
            o.deletionProtection = deletionProtection;
            o.description = description;
            o.disableRollback = disableRollback;
            o.driftDetectionTime = driftDetectionTime;
            o.id = id;
            o.parameters = parameters;
            o.parentStackId = parentStackId;
            o.ramRoleName = ramRoleName;
            o.rootStackId = rootStackId;
            o.stackDriftStatus = stackDriftStatus;
            o.stackId = stackId;
            o.stackName = stackName;
            o.stackPolicyBody = stackPolicyBody;
            o.status = status;
            o.statusReason = statusReason;
            o.tags = tags;
            o.templateDescription = templateDescription;
            o.timeoutInMinutes = timeoutInMinutes;
            return o;
        }
    }
}