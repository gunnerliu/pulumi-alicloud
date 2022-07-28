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
    private final String deletionProtection;
    /**
     * @return The Description of the Stack.
     * 
     */
    private final String description;
    /**
     * @return Specifies whether to disable rollback on stack creation failure..
     * 
     */
    private final Boolean disableRollback;
    /**
     * @return Drift DetectionTime.
     * 
     */
    private final String driftDetectionTime;
    /**
     * @return The ID of the Stack.
     * 
     */
    private final String id;
    /**
     * @return The parameters.
     * 
     */
    private final List<GetStacksStackParameter> parameters;
    /**
     * @return Parent Stack Id.
     * 
     */
    private final String parentStackId;
    /**
     * @return The RamRoleName.
     * 
     */
    private final String ramRoleName;
    /**
     * @return Root Stack Id.
     * 
     */
    private final String rootStackId;
    /**
     * @return Stack DriftStatus.
     * 
     */
    private final String stackDriftStatus;
    /**
     * @return Stack Id.
     * 
     */
    private final String stackId;
    /**
     * @return Stack Name.
     * 
     */
    private final String stackName;
    /**
     * @return The structure that contains the stack policy body.
     * 
     */
    private final String stackPolicyBody;
    /**
     * @return The status of Stack. Valid Values: `CREATE_COMPLETE`, `CREATE_FAILED`, `CREATE_IN_PROGRESS`, `DELETE_COMPLETE`, `DELETE_FAILED`, `DELETE_IN_PROGRESS`, `ROLLBACK_COMPLETE`, `ROLLBACK_FAILED`, `ROLLBACK_IN_PROGRESS`.
     * 
     */
    private final String status;
    /**
     * @return Status Reason.
     * 
     */
    private final String statusReason;
    /**
     * @return Query the instance bound to the tag. The format of the incoming value is `json` string, including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `{&#34;key1&#34;:&#34;value1&#34;}`.
     * 
     */
    private final Map<String,Object> tags;
    /**
     * @return Template Description.
     * 
     */
    private final String templateDescription;
    /**
     * @return Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request.
     * 
     */
    private final Integer timeoutInMinutes;

    @CustomType.Constructor
    private GetStacksStack(
        @CustomType.Parameter("deletionProtection") String deletionProtection,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("disableRollback") Boolean disableRollback,
        @CustomType.Parameter("driftDetectionTime") String driftDetectionTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("parameters") List<GetStacksStackParameter> parameters,
        @CustomType.Parameter("parentStackId") String parentStackId,
        @CustomType.Parameter("ramRoleName") String ramRoleName,
        @CustomType.Parameter("rootStackId") String rootStackId,
        @CustomType.Parameter("stackDriftStatus") String stackDriftStatus,
        @CustomType.Parameter("stackId") String stackId,
        @CustomType.Parameter("stackName") String stackName,
        @CustomType.Parameter("stackPolicyBody") String stackPolicyBody,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("statusReason") String statusReason,
        @CustomType.Parameter("tags") Map<String,Object> tags,
        @CustomType.Parameter("templateDescription") String templateDescription,
        @CustomType.Parameter("timeoutInMinutes") Integer timeoutInMinutes) {
        this.deletionProtection = deletionProtection;
        this.description = description;
        this.disableRollback = disableRollback;
        this.driftDetectionTime = driftDetectionTime;
        this.id = id;
        this.parameters = parameters;
        this.parentStackId = parentStackId;
        this.ramRoleName = ramRoleName;
        this.rootStackId = rootStackId;
        this.stackDriftStatus = stackDriftStatus;
        this.stackId = stackId;
        this.stackName = stackName;
        this.stackPolicyBody = stackPolicyBody;
        this.status = status;
        this.statusReason = statusReason;
        this.tags = tags;
        this.templateDescription = templateDescription;
        this.timeoutInMinutes = timeoutInMinutes;
    }

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

        public Builder() {
    	      // Empty
        }

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

        public Builder deletionProtection(String deletionProtection) {
            this.deletionProtection = Objects.requireNonNull(deletionProtection);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder disableRollback(Boolean disableRollback) {
            this.disableRollback = Objects.requireNonNull(disableRollback);
            return this;
        }
        public Builder driftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = Objects.requireNonNull(driftDetectionTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder parameters(List<GetStacksStackParameter> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(GetStacksStackParameter... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder parentStackId(String parentStackId) {
            this.parentStackId = Objects.requireNonNull(parentStackId);
            return this;
        }
        public Builder ramRoleName(String ramRoleName) {
            this.ramRoleName = Objects.requireNonNull(ramRoleName);
            return this;
        }
        public Builder rootStackId(String rootStackId) {
            this.rootStackId = Objects.requireNonNull(rootStackId);
            return this;
        }
        public Builder stackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = Objects.requireNonNull(stackDriftStatus);
            return this;
        }
        public Builder stackId(String stackId) {
            this.stackId = Objects.requireNonNull(stackId);
            return this;
        }
        public Builder stackName(String stackName) {
            this.stackName = Objects.requireNonNull(stackName);
            return this;
        }
        public Builder stackPolicyBody(String stackPolicyBody) {
            this.stackPolicyBody = Objects.requireNonNull(stackPolicyBody);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statusReason(String statusReason) {
            this.statusReason = Objects.requireNonNull(statusReason);
            return this;
        }
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder templateDescription(String templateDescription) {
            this.templateDescription = Objects.requireNonNull(templateDescription);
            return this;
        }
        public Builder timeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = Objects.requireNonNull(timeoutInMinutes);
            return this;
        }        public GetStacksStack build() {
            return new GetStacksStack(deletionProtection, description, disableRollback, driftDetectionTime, id, parameters, parentStackId, ramRoleName, rootStackId, stackDriftStatus, stackId, stackName, stackPolicyBody, status, statusReason, tags, templateDescription, timeoutInMinutes);
        }
    }
}
