// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudstoragegateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetExpressSyncsSync {
    /**
     * @return The name of the OSS Bucket.
     * 
     */
    private final String bucketName;
    /**
     * @return The prefix of the OSS Bucket.
     * 
     */
    private final String bucketPrefix;
    /**
     * @return The region of the OSS Bucket.
     * 
     */
    private final String bucketRegion;
    /**
     * @return The description of the Express Sync.
     * 
     */
    private final String description;
    /**
     * @return The ID of the Express Sync.
     * 
     */
    private final String expressSyncId;
    /**
     * @return The name of the Express Sync.
     * 
     */
    private final String expressSyncName;
    private final String id;
    /**
     * @return The name of the message topic (Topic) corresponding to the Express Sync in the Alibaba Cloud Message Service MNS.
     * 
     */
    private final String mnsTopic;

    @CustomType.Constructor
    private GetExpressSyncsSync(
        @CustomType.Parameter("bucketName") String bucketName,
        @CustomType.Parameter("bucketPrefix") String bucketPrefix,
        @CustomType.Parameter("bucketRegion") String bucketRegion,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("expressSyncId") String expressSyncId,
        @CustomType.Parameter("expressSyncName") String expressSyncName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("mnsTopic") String mnsTopic) {
        this.bucketName = bucketName;
        this.bucketPrefix = bucketPrefix;
        this.bucketRegion = bucketRegion;
        this.description = description;
        this.expressSyncId = expressSyncId;
        this.expressSyncName = expressSyncName;
        this.id = id;
        this.mnsTopic = mnsTopic;
    }

    /**
     * @return The name of the OSS Bucket.
     * 
     */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * @return The prefix of the OSS Bucket.
     * 
     */
    public String bucketPrefix() {
        return this.bucketPrefix;
    }
    /**
     * @return The region of the OSS Bucket.
     * 
     */
    public String bucketRegion() {
        return this.bucketRegion;
    }
    /**
     * @return The description of the Express Sync.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Express Sync.
     * 
     */
    public String expressSyncId() {
        return this.expressSyncId;
    }
    /**
     * @return The name of the Express Sync.
     * 
     */
    public String expressSyncName() {
        return this.expressSyncName;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the message topic (Topic) corresponding to the Express Sync in the Alibaba Cloud Message Service MNS.
     * 
     */
    public String mnsTopic() {
        return this.mnsTopic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExpressSyncsSync defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private String bucketPrefix;
        private String bucketRegion;
        private String description;
        private String expressSyncId;
        private String expressSyncName;
        private String id;
        private String mnsTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExpressSyncsSync defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.bucketRegion = defaults.bucketRegion;
    	      this.description = defaults.description;
    	      this.expressSyncId = defaults.expressSyncId;
    	      this.expressSyncName = defaults.expressSyncName;
    	      this.id = defaults.id;
    	      this.mnsTopic = defaults.mnsTopic;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder bucketPrefix(String bucketPrefix) {
            this.bucketPrefix = Objects.requireNonNull(bucketPrefix);
            return this;
        }
        public Builder bucketRegion(String bucketRegion) {
            this.bucketRegion = Objects.requireNonNull(bucketRegion);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder expressSyncId(String expressSyncId) {
            this.expressSyncId = Objects.requireNonNull(expressSyncId);
            return this;
        }
        public Builder expressSyncName(String expressSyncName) {
            this.expressSyncName = Objects.requireNonNull(expressSyncName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder mnsTopic(String mnsTopic) {
            this.mnsTopic = Objects.requireNonNull(mnsTopic);
            return this;
        }        public GetExpressSyncsSync build() {
            return new GetExpressSyncsSync(bucketName, bucketPrefix, bucketRegion, description, expressSyncId, expressSyncName, id, mnsTopic);
        }
    }
}
