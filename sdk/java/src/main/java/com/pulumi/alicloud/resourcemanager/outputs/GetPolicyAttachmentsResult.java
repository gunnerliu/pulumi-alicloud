// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.alicloud.resourcemanager.outputs.GetPolicyAttachmentsAttachment;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPolicyAttachmentsResult {
    /**
     * @return A list of Resource Manager Policy Attachment. Each element contains the following attributes:
     * 
     */
    private List<GetPolicyAttachmentsAttachment> attachments;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of Resource Manager Policy Attachment IDs.
     * 
     */
    private List<String> ids;
    private @Nullable String language;
    private @Nullable String outputFile;
    private @Nullable String policyName;
    private @Nullable String policyType;
    private @Nullable String principalName;
    private @Nullable String principalType;
    /**
     * @return The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.
     * 
     */
    private @Nullable String resourceGroupId;

    private GetPolicyAttachmentsResult() {}
    /**
     * @return A list of Resource Manager Policy Attachment. Each element contains the following attributes:
     * 
     */
    public List<GetPolicyAttachmentsAttachment> attachments() {
        return this.attachments;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of Resource Manager Policy Attachment IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> language() {
        return Optional.ofNullable(this.language);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> policyName() {
        return Optional.ofNullable(this.policyName);
    }
    public Optional<String> policyType() {
        return Optional.ofNullable(this.policyType);
    }
    public Optional<String> principalName() {
        return Optional.ofNullable(this.principalName);
    }
    public Optional<String> principalType() {
        return Optional.ofNullable(this.principalType);
    }
    /**
     * @return The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyAttachmentsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPolicyAttachmentsAttachment> attachments;
        private String id;
        private List<String> ids;
        private @Nullable String language;
        private @Nullable String outputFile;
        private @Nullable String policyName;
        private @Nullable String policyType;
        private @Nullable String principalName;
        private @Nullable String principalType;
        private @Nullable String resourceGroupId;
        public Builder() {}
        public Builder(GetPolicyAttachmentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachments = defaults.attachments;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.language = defaults.language;
    	      this.outputFile = defaults.outputFile;
    	      this.policyName = defaults.policyName;
    	      this.policyType = defaults.policyType;
    	      this.principalName = defaults.principalName;
    	      this.principalType = defaults.principalType;
    	      this.resourceGroupId = defaults.resourceGroupId;
        }

        @CustomType.Setter
        public Builder attachments(List<GetPolicyAttachmentsAttachment> attachments) {
            this.attachments = Objects.requireNonNull(attachments);
            return this;
        }
        public Builder attachments(GetPolicyAttachmentsAttachment... attachments) {
            return attachments(List.of(attachments));
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
        public Builder language(@Nullable String language) {
            this.language = language;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder policyName(@Nullable String policyName) {
            this.policyName = policyName;
            return this;
        }
        @CustomType.Setter
        public Builder policyType(@Nullable String policyType) {
            this.policyType = policyType;
            return this;
        }
        @CustomType.Setter
        public Builder principalName(@Nullable String principalName) {
            this.principalName = principalName;
            return this;
        }
        @CustomType.Setter
        public Builder principalType(@Nullable String principalType) {
            this.principalType = principalType;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public GetPolicyAttachmentsResult build() {
            final var o = new GetPolicyAttachmentsResult();
            o.attachments = attachments;
            o.id = id;
            o.ids = ids;
            o.language = language;
            o.outputFile = outputFile;
            o.policyName = policyName;
            o.policyType = policyType;
            o.principalName = principalName;
            o.principalType = principalType;
            o.resourceGroupId = resourceGroupId;
            return o;
        }
    }
}
