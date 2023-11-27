// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.alicloud.cen.outputs.GetTransitRouterVpnAttachmentsAttachment;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTransitRouterVpnAttachmentsResult {
    private List<GetTransitRouterVpnAttachmentsAttachment> attachments;
    private String cenId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String status;
    private @Nullable String transitRouterId;

    private GetTransitRouterVpnAttachmentsResult() {}
    public List<GetTransitRouterVpnAttachmentsAttachment> attachments() {
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
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> transitRouterId() {
        return Optional.ofNullable(this.transitRouterId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitRouterVpnAttachmentsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTransitRouterVpnAttachmentsAttachment> attachments;
        private String cenId;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String status;
        private @Nullable String transitRouterId;
        public Builder() {}
        public Builder(GetTransitRouterVpnAttachmentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachments = defaults.attachments;
    	      this.cenId = defaults.cenId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
    	      this.transitRouterId = defaults.transitRouterId;
        }

        @CustomType.Setter
        public Builder attachments(List<GetTransitRouterVpnAttachmentsAttachment> attachments) {
            this.attachments = Objects.requireNonNull(attachments);
            return this;
        }
        public Builder attachments(GetTransitRouterVpnAttachmentsAttachment... attachments) {
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
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
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
        public GetTransitRouterVpnAttachmentsResult build() {
            final var _resultValue = new GetTransitRouterVpnAttachmentsResult();
            _resultValue.attachments = attachments;
            _resultValue.cenId = cenId;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            _resultValue.transitRouterId = transitRouterId;
            return _resultValue;
        }
    }
}
