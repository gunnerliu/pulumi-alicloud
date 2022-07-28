// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageExportState extends com.pulumi.resources.ResourceArgs {

    public static final ImageExportState Empty = new ImageExportState();

    /**
     * The source image ID.
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return The source image ID.
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    /**
     * Save the exported OSS bucket.
     * 
     */
    @Import(name="ossBucket")
    private @Nullable Output<String> ossBucket;

    /**
     * @return Save the exported OSS bucket.
     * 
     */
    public Optional<Output<String>> ossBucket() {
        return Optional.ofNullable(this.ossBucket);
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

    private ImageExportState() {}

    private ImageExportState(ImageExportState $) {
        this.imageId = $.imageId;
        this.ossBucket = $.ossBucket;
        this.ossPrefix = $.ossPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageExportState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageExportState $;

        public Builder() {
            $ = new ImageExportState();
        }

        public Builder(ImageExportState defaults) {
            $ = new ImageExportState(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageId The source image ID.
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
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
        public Builder ossBucket(@Nullable Output<String> ossBucket) {
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

        public ImageExportState build() {
            return $;
        }
    }

}
