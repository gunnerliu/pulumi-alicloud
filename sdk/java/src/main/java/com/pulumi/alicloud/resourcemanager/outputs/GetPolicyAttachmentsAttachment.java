// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPolicyAttachmentsAttachment {
    /**
     * @return The time when the policy was attached.
     * 
     */
    private String attachDate;
    /**
     * @return The description of the policy.
     * 
     */
    private String description;
    /**
     * @return The ID of the Resource Manager Policy Attachment.
     * * `policy_name`- The name of the policy.
     * * `policy_type`- The type of the policy.
     * * `principal_name`- The name of the object to which the policy is attached.
     * * `principal_type`- The type of the object to which the policy is attached.
     * 
     */
    private String id;
    /**
     * @return The name of the policy. The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
     * 
     */
    private String policyName;
    /**
     * @return The type of the policy. Valid values: `Custom` and `System`.
     * 
     */
    private String policyType;
    /**
     * @return The name of the object to which the policy is attached.
     * 
     */
    private String principalName;
    /**
     * @return The type of the object to which the policy is attached. If you do not specify this parameter, the system lists all types of objects. Valid values: `IMSUser`: RAM user, `IMSGroup`: RAM user group, `ServiceRole`: RAM role.
     * 
     */
    private String principalType;
    /**
     * @return The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs. If you do not specify this parameter, the system lists all policy attachment records under the current account.
     * 
     */
    private String resourceGroupId;

    private GetPolicyAttachmentsAttachment() {}
    /**
     * @return The time when the policy was attached.
     * 
     */
    public String attachDate() {
        return this.attachDate;
    }
    /**
     * @return The description of the policy.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Resource Manager Policy Attachment.
     * * `policy_name`- The name of the policy.
     * * `policy_type`- The type of the policy.
     * * `principal_name`- The name of the object to which the policy is attached.
     * * `principal_type`- The type of the object to which the policy is attached.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the policy. The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
     * 
     */
    public String policyName() {
        return this.policyName;
    }
    /**
     * @return The type of the policy. Valid values: `Custom` and `System`.
     * 
     */
    public String policyType() {
        return this.policyType;
    }
    /**
     * @return The name of the object to which the policy is attached.
     * 
     */
    public String principalName() {
        return this.principalName;
    }
    /**
     * @return The type of the object to which the policy is attached. If you do not specify this parameter, the system lists all types of objects. Valid values: `IMSUser`: RAM user, `IMSGroup`: RAM user group, `ServiceRole`: RAM role.
     * 
     */
    public String principalType() {
        return this.principalType;
    }
    /**
     * @return The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs. If you do not specify this parameter, the system lists all policy attachment records under the current account.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyAttachmentsAttachment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attachDate;
        private String description;
        private String id;
        private String policyName;
        private String policyType;
        private String principalName;
        private String principalType;
        private String resourceGroupId;
        public Builder() {}
        public Builder(GetPolicyAttachmentsAttachment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachDate = defaults.attachDate;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.policyName = defaults.policyName;
    	      this.policyType = defaults.policyType;
    	      this.principalName = defaults.principalName;
    	      this.principalType = defaults.principalType;
    	      this.resourceGroupId = defaults.resourceGroupId;
        }

        @CustomType.Setter
        public Builder attachDate(String attachDate) {
            this.attachDate = Objects.requireNonNull(attachDate);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder policyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }
        @CustomType.Setter
        public Builder policyType(String policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }
        @CustomType.Setter
        public Builder principalName(String principalName) {
            this.principalName = Objects.requireNonNull(principalName);
            return this;
        }
        @CustomType.Setter
        public Builder principalType(String principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        public GetPolicyAttachmentsAttachment build() {
            final var o = new GetPolicyAttachmentsAttachment();
            o.attachDate = attachDate;
            o.description = description;
            o.id = id;
            o.policyName = policyName;
            o.policyType = policyType;
            o.principalName = principalName;
            o.principalType = principalType;
            o.resourceGroupId = resourceGroupId;
            return o;
        }
    }
}
