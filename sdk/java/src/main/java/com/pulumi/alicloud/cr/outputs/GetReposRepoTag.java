// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetReposRepoTag {
    /**
     * @return Digest of this image.
     * 
     */
    private final String digest;
    /**
     * @return Create time of this image, unix time in nanoseconds.
     * 
     */
    private final Integer imageCreate;
    /**
     * @return Id of this image.
     * 
     */
    private final String imageId;
    /**
     * @return Status of this image, in bytes.
     * 
     */
    private final Integer imageSize;
    /**
     * @return Last update time of this image, unix time in nanoseconds.
     * 
     */
    private final Integer imageUpdate;
    /**
     * @return Status of this image.
     * 
     */
    private final String status;
    /**
     * @return Tag of this image.
     * 
     */
    private final String tag;

    @CustomType.Constructor
    private GetReposRepoTag(
        @CustomType.Parameter("digest") String digest,
        @CustomType.Parameter("imageCreate") Integer imageCreate,
        @CustomType.Parameter("imageId") String imageId,
        @CustomType.Parameter("imageSize") Integer imageSize,
        @CustomType.Parameter("imageUpdate") Integer imageUpdate,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tag") String tag) {
        this.digest = digest;
        this.imageCreate = imageCreate;
        this.imageId = imageId;
        this.imageSize = imageSize;
        this.imageUpdate = imageUpdate;
        this.status = status;
        this.tag = tag;
    }

    /**
     * @return Digest of this image.
     * 
     */
    public String digest() {
        return this.digest;
    }
    /**
     * @return Create time of this image, unix time in nanoseconds.
     * 
     */
    public Integer imageCreate() {
        return this.imageCreate;
    }
    /**
     * @return Id of this image.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return Status of this image, in bytes.
     * 
     */
    public Integer imageSize() {
        return this.imageSize;
    }
    /**
     * @return Last update time of this image, unix time in nanoseconds.
     * 
     */
    public Integer imageUpdate() {
        return this.imageUpdate;
    }
    /**
     * @return Status of this image.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Tag of this image.
     * 
     */
    public String tag() {
        return this.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReposRepoTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String digest;
        private Integer imageCreate;
        private String imageId;
        private Integer imageSize;
        private Integer imageUpdate;
        private String status;
        private String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReposRepoTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.imageCreate = defaults.imageCreate;
    	      this.imageId = defaults.imageId;
    	      this.imageSize = defaults.imageSize;
    	      this.imageUpdate = defaults.imageUpdate;
    	      this.status = defaults.status;
    	      this.tag = defaults.tag;
        }

        public Builder digest(String digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        public Builder imageCreate(Integer imageCreate) {
            this.imageCreate = Objects.requireNonNull(imageCreate);
            return this;
        }
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public Builder imageSize(Integer imageSize) {
            this.imageSize = Objects.requireNonNull(imageSize);
            return this;
        }
        public Builder imageUpdate(Integer imageUpdate) {
            this.imageUpdate = Objects.requireNonNull(imageUpdate);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }        public GetReposRepoTag build() {
            return new GetReposRepoTag(digest, imageCreate, imageId, imageSize, imageUpdate, status, tag);
        }
    }
}
