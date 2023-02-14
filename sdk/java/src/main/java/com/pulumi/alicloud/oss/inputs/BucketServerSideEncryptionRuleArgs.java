// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketServerSideEncryptionRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketServerSideEncryptionRuleArgs Empty = new BucketServerSideEncryptionRuleArgs();

    /**
     * The alibaba cloud KMS master key ID used for the SSE-KMS encryption.
     * 
     */
    @Import(name="kmsMasterKeyId")
    private @Nullable Output<String> kmsMasterKeyId;

    /**
     * @return The alibaba cloud KMS master key ID used for the SSE-KMS encryption.
     * 
     */
    public Optional<Output<String>> kmsMasterKeyId() {
        return Optional.ofNullable(this.kmsMasterKeyId);
    }

    /**
     * The server-side encryption algorithm to use. Possible values: `AES256` and `KMS`.
     * 
     */
    @Import(name="sseAlgorithm", required=true)
    private Output<String> sseAlgorithm;

    /**
     * @return The server-side encryption algorithm to use. Possible values: `AES256` and `KMS`.
     * 
     */
    public Output<String> sseAlgorithm() {
        return this.sseAlgorithm;
    }

    private BucketServerSideEncryptionRuleArgs() {}

    private BucketServerSideEncryptionRuleArgs(BucketServerSideEncryptionRuleArgs $) {
        this.kmsMasterKeyId = $.kmsMasterKeyId;
        this.sseAlgorithm = $.sseAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketServerSideEncryptionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketServerSideEncryptionRuleArgs $;

        public Builder() {
            $ = new BucketServerSideEncryptionRuleArgs();
        }

        public Builder(BucketServerSideEncryptionRuleArgs defaults) {
            $ = new BucketServerSideEncryptionRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsMasterKeyId The alibaba cloud KMS master key ID used for the SSE-KMS encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsMasterKeyId(@Nullable Output<String> kmsMasterKeyId) {
            $.kmsMasterKeyId = kmsMasterKeyId;
            return this;
        }

        /**
         * @param kmsMasterKeyId The alibaba cloud KMS master key ID used for the SSE-KMS encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsMasterKeyId(String kmsMasterKeyId) {
            return kmsMasterKeyId(Output.of(kmsMasterKeyId));
        }

        /**
         * @param sseAlgorithm The server-side encryption algorithm to use. Possible values: `AES256` and `KMS`.
         * 
         * @return builder
         * 
         */
        public Builder sseAlgorithm(Output<String> sseAlgorithm) {
            $.sseAlgorithm = sseAlgorithm;
            return this;
        }

        /**
         * @param sseAlgorithm The server-side encryption algorithm to use. Possible values: `AES256` and `KMS`.
         * 
         * @return builder
         * 
         */
        public Builder sseAlgorithm(String sseAlgorithm) {
            return sseAlgorithm(Output.of(sseAlgorithm));
        }

        public BucketServerSideEncryptionRuleArgs build() {
            $.sseAlgorithm = Objects.requireNonNull($.sseAlgorithm, "expected parameter 'sseAlgorithm' to be non-null");
            return $;
        }
    }

}