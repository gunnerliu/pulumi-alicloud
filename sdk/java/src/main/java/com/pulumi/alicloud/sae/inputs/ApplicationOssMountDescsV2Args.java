// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationOssMountDescsV2Args extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationOssMountDescsV2Args Empty = new ApplicationOssMountDescsV2Args();

    /**
     * The name of the OSS bucket.
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    /**
     * @return The name of the OSS bucket.
     * 
     */
    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * The directory or object in OSS.
     * 
     */
    @Import(name="bucketPath")
    private @Nullable Output<String> bucketPath;

    /**
     * @return The directory or object in OSS.
     * 
     */
    public Optional<Output<String>> bucketPath() {
        return Optional.ofNullable(this.bucketPath);
    }

    /**
     * The path of the container in SAE.
     * 
     */
    @Import(name="mountPath")
    private @Nullable Output<String> mountPath;

    /**
     * @return The path of the container in SAE.
     * 
     */
    public Optional<Output<String>> mountPath() {
        return Optional.ofNullable(this.mountPath);
    }

    /**
     * Specifies whether the application can use the container path to read data from or write data to resources in the directory of the OSS bucket. Valid values:
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return Specifies whether the application can use the container path to read data from or write data to resources in the directory of the OSS bucket. Valid values:
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    private ApplicationOssMountDescsV2Args() {}

    private ApplicationOssMountDescsV2Args(ApplicationOssMountDescsV2Args $) {
        this.bucketName = $.bucketName;
        this.bucketPath = $.bucketPath;
        this.mountPath = $.mountPath;
        this.readOnly = $.readOnly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationOssMountDescsV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationOssMountDescsV2Args $;

        public Builder() {
            $ = new ApplicationOssMountDescsV2Args();
        }

        public Builder(ApplicationOssMountDescsV2Args defaults) {
            $ = new ApplicationOssMountDescsV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName The name of the OSS bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName The name of the OSS bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param bucketPath The directory or object in OSS.
         * 
         * @return builder
         * 
         */
        public Builder bucketPath(@Nullable Output<String> bucketPath) {
            $.bucketPath = bucketPath;
            return this;
        }

        /**
         * @param bucketPath The directory or object in OSS.
         * 
         * @return builder
         * 
         */
        public Builder bucketPath(String bucketPath) {
            return bucketPath(Output.of(bucketPath));
        }

        /**
         * @param mountPath The path of the container in SAE.
         * 
         * @return builder
         * 
         */
        public Builder mountPath(@Nullable Output<String> mountPath) {
            $.mountPath = mountPath;
            return this;
        }

        /**
         * @param mountPath The path of the container in SAE.
         * 
         * @return builder
         * 
         */
        public Builder mountPath(String mountPath) {
            return mountPath(Output.of(mountPath));
        }

        /**
         * @param readOnly Specifies whether the application can use the container path to read data from or write data to resources in the directory of the OSS bucket. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly Specifies whether the application can use the container path to read data from or write data to resources in the directory of the OSS bucket. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public ApplicationOssMountDescsV2Args build() {
            return $;
        }
    }

}