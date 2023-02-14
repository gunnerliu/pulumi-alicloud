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
    private String digest;
    /**
     * @return Create time of this image, unix time in nanoseconds.
     * 
     */
    private Integer imageCreate;
    /**
     * @return Id of this image.
     * 
     */
    private String imageId;
    /**
     * @return Status of this image, in bytes.
     * 
     */
    private Integer imageSize;
    /**
     * @return Last update time of this image, unix time in nanoseconds.
     * 
     */
    private Integer imageUpdate;
    /**
     * @return Status of this image.
     * 
     */
    private String status;
    /**
     * @return Tag of this image.
     * 
     */
    private String tag;

    private GetReposRepoTag() {}
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
    @CustomType.Builder
    public static final class Builder {
        private String digest;
        private Integer imageCreate;
        private String imageId;
        private Integer imageSize;
        private Integer imageUpdate;
        private String status;
        private String tag;
        public Builder() {}
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

        @CustomType.Setter
        public Builder digest(String digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        @CustomType.Setter
        public Builder imageCreate(Integer imageCreate) {
            this.imageCreate = Objects.requireNonNull(imageCreate);
            return this;
        }
        @CustomType.Setter
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        @CustomType.Setter
        public Builder imageSize(Integer imageSize) {
            this.imageSize = Objects.requireNonNull(imageSize);
            return this;
        }
        @CustomType.Setter
        public Builder imageUpdate(Integer imageUpdate) {
            this.imageUpdate = Objects.requireNonNull(imageUpdate);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        public GetReposRepoTag build() {
            final var o = new GetReposRepoTag();
            o.digest = digest;
            o.imageCreate = imageCreate;
            o.imageId = imageId;
            o.imageSize = imageSize;
            o.imageUpdate = imageUpdate;
            o.status = status;
            o.tag = tag;
            return o;
        }
    }
}