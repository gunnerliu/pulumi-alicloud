// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageExportArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageExportArgs Empty = new ImageExportArgs();

    /**
     * The source image ID.
     * 
     */
    @Import(name="imageId", required=true)
    private Output<String> imageId;

    /**
     * @return The source image ID.
     * 
     */
    public Output<String> imageId() {
        return this.imageId;
    }

    /**
     * Save the exported OSS bucket.
     * 
     */
    @Import(name="ossBucket", required=true)
    private Output<String> ossBucket;

    /**
     * @return Save the exported OSS bucket.
     * 
     */
    public Output<String> ossBucket() {
        return this.ossBucket;
    }

    /**
     * The prefix of your OSS Object. It can be composed of numbers or letters, and the character length is 1 ~ 30.
     * 
     */
    @Import(name="ossPrefix")
    private @Nullable Output<String> ossPrefix;

    /**
     * @return The prefix of your OSS Object. It can be composed of numbers or letters, and the character length is 1 ~ 30.
     * 
     */
    public Optional<Output<String>> ossPrefix() {
        return Optional.ofNullable(this.ossPrefix);
    }

    private ImageExportArgs() {}

    private ImageExportArgs(ImageExportArgs $) {
        this.imageId = $.imageId;
        this.ossBucket = $.ossBucket;
        this.ossPrefix = $.ossPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageExportArgs $;

        public Builder() {
            $ = new ImageExportArgs();
        }

        public Builder(ImageExportArgs defaults) {
            $ = new ImageExportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageId The source image ID.
         * 
         * @return builder
         * 
         */
        public Builder imageId(Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The source image ID.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param ossBucket Save the exported OSS bucket.
         * 
         * @return builder
         * 
         */
        public Builder ossBucket(Output<String> ossBucket) {
            $.ossBucket = ossBucket;
            return this;
        }

        /**
         * @param ossBucket Save the exported OSS bucket.
         * 
         * @return builder
         * 
         */
        public Builder ossBucket(String ossBucket) {
            return ossBucket(Output.of(ossBucket));
        }

        /**
         * @param ossPrefix The prefix of your OSS Object. It can be composed of numbers or letters, and the character length is 1 ~ 30.
         * 
         * @return builder
         * 
         */
        public Builder ossPrefix(@Nullable Output<String> ossPrefix) {
            $.ossPrefix = ossPrefix;
            return this;
        }

        /**
         * @param ossPrefix The prefix of your OSS Object. It can be composed of numbers or letters, and the character length is 1 ~ 30.
         * 
         * @return builder
         * 
         */
        public Builder ossPrefix(String ossPrefix) {
            return ossPrefix(Output.of(ossPrefix));
        }

        public ImageExportArgs build() {
            $.imageId = Objects.requireNonNull($.imageId, "expected parameter 'imageId' to be non-null");
            $.ossBucket = Objects.requireNonNull($.ossBucket, "expected parameter 'ossBucket' to be non-null");
            return $;
        }
    }

}
