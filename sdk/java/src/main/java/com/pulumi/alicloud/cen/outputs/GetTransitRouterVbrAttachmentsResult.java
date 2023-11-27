// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.alicloud.cen.outputs.GetTransitRouterVbrAttachmentsAttachment;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTransitRouterVbrAttachmentsResult {
    /**
     * @return A list of CEN Transit Router VBR Attachments. Each element contains the following attributes:
     * 
     */
    private List<GetTransitRouterVbrAttachmentsAttachment> attachments;
    private String cenId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of CEN Transit Router VBR attachment IDs.
     * 
     */
    private List<String> ids;
    private @Nullable String outputFile;
    /**
     * @return The status of the transit router attachment.
     * 
     */
    private @Nullable String status;
    private @Nullable String transitRouterId;

    private GetTransitRouterVbrAttachmentsResult() {}
    /**
     * @return A list of CEN Transit Router VBR Attachments. Each element contains the following attributes:
     * 
     */
    public List<GetTransitRouterVbrAttachmentsAttachment> attachments() {
        return this.attachments;
    }
    public String cenId() {
        return this.cenId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of CEN Transit Router VBR attachment IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The status of the transit router attachment.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> transitRouterId() {
        return Optional.ofNullable(this.transitRouterId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitRouterVbrAttachmentsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTransitRouterVbrAttachmentsAttachment> attachments;
        private String cenId;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private @Nullable String status;
        private @Nullable String transitRouterId;
        public Builder() {}
        public Builder(GetTransitRouterVbrAttachmentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachments = defaults.attachments;
    	      this.cenId = defaults.cenId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
    	      this.transitRouterId = defaults.transitRouterId;
        }

        @CustomType.Setter
        public Builder attachments(List<GetTransitRouterVbrAttachmentsAttachment> attachments) {
            this.attachments = Objects.requireNonNull(attachments);
            return this;
        }
        public Builder attachments(GetTransitRouterVbrAttachmentsAttachment... attachments) {
            return attachments(List.of(attachments));
        }
        @CustomType.Setter
        public Builder cenId(String cenId) {
            this.cenId = Objects.requireNonNull(cenId);
            return this;
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
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterId(@Nullable String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public GetTransitRouterVbrAttachmentsResult build() {
            final var _resultValue = new GetTransitRouterVbrAttachmentsResult();
            _resultValue.attachments = attachments;
            _resultValue.cenId = cenId;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            _resultValue.transitRouterId = transitRouterId;
            return _resultValue;
        }
    }
}
