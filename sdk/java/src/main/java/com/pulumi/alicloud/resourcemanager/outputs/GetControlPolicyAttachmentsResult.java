// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.alicloud.resourcemanager.outputs.GetControlPolicyAttachmentsAttachment;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetControlPolicyAttachmentsResult {
    private List<GetControlPolicyAttachmentsAttachment> attachments;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String language;
    private @Nullable String outputFile;
    private @Nullable String policyType;
    private String targetId;

    private GetControlPolicyAttachmentsResult() {}
    public List<GetControlPolicyAttachmentsAttachment> attachments() {
        return this.attachments;
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
    public Optional<String> language() {
        return Optional.ofNullable(this.language);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> policyType() {
        return Optional.ofNullable(this.policyType);
    }
    public String targetId() {
        return this.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetControlPolicyAttachmentsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetControlPolicyAttachmentsAttachment> attachments;
        private String id;
        private List<String> ids;
        private @Nullable String language;
        private @Nullable String outputFile;
        private @Nullable String policyType;
        private String targetId;
        public Builder() {}
        public Builder(GetControlPolicyAttachmentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachments = defaults.attachments;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.language = defaults.language;
    	      this.outputFile = defaults.outputFile;
    	      this.policyType = defaults.policyType;
    	      this.targetId = defaults.targetId;
        }

        @CustomType.Setter
        public Builder attachments(List<GetControlPolicyAttachmentsAttachment> attachments) {
            this.attachments = Objects.requireNonNull(attachments);
            return this;
        }
        public Builder attachments(GetControlPolicyAttachmentsAttachment... attachments) {
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
        public Builder policyType(@Nullable String policyType) {
            this.policyType = policyType;
            return this;
        }
        @CustomType.Setter
        public Builder targetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }
        public GetControlPolicyAttachmentsResult build() {
            final var _resultValue = new GetControlPolicyAttachmentsResult();
            _resultValue.attachments = attachments;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.language = language;
            _resultValue.outputFile = outputFile;
            _resultValue.policyType = policyType;
            _resultValue.targetId = targetId;
            return _resultValue;
        }
    }
}
