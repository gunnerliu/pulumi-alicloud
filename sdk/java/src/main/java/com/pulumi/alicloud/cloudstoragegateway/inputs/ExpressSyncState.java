// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudstoragegateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExpressSyncState extends com.pulumi.resources.ResourceArgs {

    public static final ExpressSyncState Empty = new ExpressSyncState();

    /**
     * The name of the OSS Bucket.
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    /**
     * @return The name of the OSS Bucket.
     * 
     */
    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * The prefix of the OSS Bucket.
     * 
     */
    @Import(name="bucketPrefix")
    private @Nullable Output<String> bucketPrefix;

    /**
     * @return The prefix of the OSS Bucket.
     * 
     */
    public Optional<Output<String>> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }

    /**
     * The region of the OSS Bucket.
     * 
     */
    @Import(name="bucketRegion")
    private @Nullable Output<String> bucketRegion;

    /**
     * @return The region of the OSS Bucket.
     * 
     */
    public Optional<Output<String>> bucketRegion() {
        return Optional.ofNullable(this.bucketRegion);
    }

    /**
     * The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
     * 
     */
    @Import(name="expressSyncName")
    private @Nullable Output<String> expressSyncName;

    /**
     * @return The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
     * 
     */
    public Optional<Output<String>> expressSyncName() {
        return Optional.ofNullable(this.expressSyncName);
    }

    private ExpressSyncState() {}

    private ExpressSyncState(ExpressSyncState $) {
        this.bucketName = $.bucketName;
        this.bucketPrefix = $.bucketPrefix;
        this.bucketRegion = $.bucketRegion;
        this.description = $.description;
        this.expressSyncName = $.expressSyncName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressSyncState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressSyncState $;

        public Builder() {
            $ = new ExpressSyncState();
        }

        public Builder(ExpressSyncState defaults) {
            $ = new ExpressSyncState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName The name of the OSS Bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName The name of the OSS Bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param bucketPrefix The prefix of the OSS Bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            $.bucketPrefix = bucketPrefix;
            return this;
        }

        /**
         * @param bucketPrefix The prefix of the OSS Bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketPrefix(String bucketPrefix) {
            return bucketPrefix(Output.of(bucketPrefix));
        }

        /**
         * @param bucketRegion The region of the OSS Bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketRegion(@Nullable Output<String> bucketRegion) {
            $.bucketRegion = bucketRegion;
            return this;
        }

        /**
         * @param bucketRegion The region of the OSS Bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketRegion(String bucketRegion) {
            return bucketRegion(Output.of(bucketRegion));
        }

        /**
         * @param description The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expressSyncName The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
         * 
         * @return builder
         * 
         */
        public Builder expressSyncName(@Nullable Output<String> expressSyncName) {
            $.expressSyncName = expressSyncName;
            return this;
        }

        /**
         * @param expressSyncName The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
         * 
         * @return builder
         * 
         */
        public Builder expressSyncName(String expressSyncName) {
            return expressSyncName(Output.of(expressSyncName));
        }

        public ExpressSyncState build() {
            return $;
        }
    }

}
