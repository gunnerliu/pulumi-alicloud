// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.marketplace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProductProductSkusImage {
    /**
     * @return The Ecs image id.
     * 
     */
    private String imageId;
    /**
     * @return The Ecs image display name.
     * 
     */
    private String imageName;
    /**
     * @return The Ecs image region.
     * 
     */
    private String regionId;

    private GetProductProductSkusImage() {}
    /**
     * @return The Ecs image id.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return The Ecs image display name.
     * 
     */
    public String imageName() {
        return this.imageName;
    }
    /**
     * @return The Ecs image region.
     * 
     */
    public String regionId() {
        return this.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductProductSkusImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String imageId;
        private String imageName;
        private String regionId;
        public Builder() {}
        public Builder(GetProductProductSkusImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageId = defaults.imageId;
    	      this.imageName = defaults.imageName;
    	      this.regionId = defaults.regionId;
        }

        @CustomType.Setter
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        @CustomType.Setter
        public Builder imageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }
        @CustomType.Setter
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        public GetProductProductSkusImage build() {
            final var o = new GetProductProductSkusImage();
            o.imageId = imageId;
            o.imageName = imageName;
            o.regionId = regionId;
            return o;
        }
    }
}
