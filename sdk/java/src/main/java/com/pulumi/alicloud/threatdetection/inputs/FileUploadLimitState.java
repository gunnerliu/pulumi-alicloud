// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileUploadLimitState extends com.pulumi.resources.ResourceArgs {

    public static final FileUploadLimitState Empty = new FileUploadLimitState();

    /**
     * File Upload Threshold.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    /**
     * @return File Upload Threshold.
     * 
     */
    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    private FileUploadLimitState() {}

    private FileUploadLimitState(FileUploadLimitState $) {
        this.limit = $.limit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileUploadLimitState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileUploadLimitState $;

        public Builder() {
            $ = new FileUploadLimitState();
        }

        public Builder(FileUploadLimitState defaults) {
            $ = new FileUploadLimitState(Objects.requireNonNull(defaults));
        }

        /**
         * @param limit File Upload Threshold.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit File Upload Threshold.
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        public FileUploadLimitState build() {
            return $;
        }
    }

}
