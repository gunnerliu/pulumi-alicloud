// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.alicloud.cen.outputs.GetInstanceAttachmentsAttachment;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceAttachmentsResult {
    /**
     * @return A list of CEN Instance Attachments. Each element contains the following attributes:
     * 
     */
    private final List<GetInstanceAttachmentsAttachment> attachments;
    /**
     * @return The ID of the region to which the network belongs.
     * 
     */
    private final @Nullable String childInstanceRegionId;
    /**
     * @return The type of the associated network.
     * 
     */
    private final @Nullable String childInstanceType;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of CEN Instance Attachment IDs.
     * 
     */
    private final List<String> ids;
    /**
     * @return The ID of the CEN instance.
     * 
     */
    private final String instanceId;
    private final @Nullable String outputFile;
    /**
     * @return The status of the network.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private GetInstanceAttachmentsResult(
        @CustomType.Parameter("attachments") List<GetInstanceAttachmentsAttachment> attachments,
        @CustomType.Parameter("childInstanceRegionId") @Nullable String childInstanceRegionId,
        @CustomType.Parameter("childInstanceType") @Nullable String childInstanceType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("status") @Nullable String status) {
        this.attachments = attachments;
        this.childInstanceRegionId = childInstanceRegionId;
        this.childInstanceType = childInstanceType;
        this.id = id;
        this.ids = ids;
        this.instanceId = instanceId;
        this.outputFile = outputFile;
        this.status = status;
    }

    /**
     * @return A list of CEN Instance Attachments. Each element contains the following attributes:
     * 
     */
    public List<GetInstanceAttachmentsAttachment> attachments() {
        return this.attachments;
    }
    /**
     * @return The ID of the region to which the network belongs.
     * 
     */
    public Optional<String> childInstanceRegionId() {
        return Optional.ofNullable(this.childInstanceRegionId);
    }
    /**
     * @return The type of the associated network.
     * 
     */
    public Optional<String> childInstanceType() {
        return Optional.ofNullable(this.childInstanceType);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of CEN Instance Attachment IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return The ID of the CEN instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The status of the network.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceAttachmentsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetInstanceAttachmentsAttachment> attachments;
        private @Nullable String childInstanceRegionId;
        private @Nullable String childInstanceType;
        private String id;
        private List<String> ids;
        private String instanceId;
        private @Nullable String outputFile;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceAttachmentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachments = defaults.attachments;
    	      this.childInstanceRegionId = defaults.childInstanceRegionId;
    	      this.childInstanceType = defaults.childInstanceType;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        public Builder attachments(List<GetInstanceAttachmentsAttachment> attachments) {
            this.attachments = Objects.requireNonNull(attachments);
            return this;
        }
        public Builder attachments(GetInstanceAttachmentsAttachment... attachments) {
            return attachments(List.of(attachments));
        }
        public Builder childInstanceRegionId(@Nullable String childInstanceRegionId) {
            this.childInstanceRegionId = childInstanceRegionId;
            return this;
        }
        public Builder childInstanceType(@Nullable String childInstanceType) {
            this.childInstanceType = childInstanceType;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetInstanceAttachmentsResult build() {
            return new GetInstanceAttachmentsResult(attachments, childInstanceRegionId, childInstanceType, id, ids, instanceId, outputFile, status);
        }
    }
}
