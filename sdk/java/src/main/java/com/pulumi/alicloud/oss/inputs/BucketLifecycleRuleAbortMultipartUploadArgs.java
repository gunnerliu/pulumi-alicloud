// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketLifecycleRuleAbortMultipartUploadArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleAbortMultipartUploadArgs Empty = new BucketLifecycleRuleAbortMultipartUploadArgs();

    /**
     * Specifies the time before which the rules take effect. The date must conform to the ISO8601 format and always be UTC 00:00. For example: 2002-10-11T00:00:00.000Z indicates that parts created before 2002-10-11T00:00:00.000Z are deleted, and parts created after this time (including this time) are not deleted.
     * 
     */
    @Import(name="createdBeforeDate")
    private @Nullable Output<String> createdBeforeDate;

    /**
     * @return Specifies the time before which the rules take effect. The date must conform to the ISO8601 format and always be UTC 00:00. For example: 2002-10-11T00:00:00.000Z indicates that parts created before 2002-10-11T00:00:00.000Z are deleted, and parts created after this time (including this time) are not deleted.
     * 
     */
    public Optional<Output<String>> createdBeforeDate() {
        return Optional.ofNullable(this.createdBeforeDate);
    }

    /**
     * Specifies the number of days noncurrent object versions transition.
     * 
     */
    @Import(name="days")
    private @Nullable Output<Integer> days;

    /**
     * @return Specifies the number of days noncurrent object versions transition.
     * 
     */
    public Optional<Output<Integer>> days() {
        return Optional.ofNullable(this.days);
    }

    private BucketLifecycleRuleAbortMultipartUploadArgs() {}

    private BucketLifecycleRuleAbortMultipartUploadArgs(BucketLifecycleRuleAbortMultipartUploadArgs $) {
        this.createdBeforeDate = $.createdBeforeDate;
        this.days = $.days;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketLifecycleRuleAbortMultipartUploadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLifecycleRuleAbortMultipartUploadArgs $;

        public Builder() {
            $ = new BucketLifecycleRuleAbortMultipartUploadArgs();
        }

        public Builder(BucketLifecycleRuleAbortMultipartUploadArgs defaults) {
            $ = new BucketLifecycleRuleAbortMultipartUploadArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdBeforeDate Specifies the time before which the rules take effect. The date must conform to the ISO8601 format and always be UTC 00:00. For example: 2002-10-11T00:00:00.000Z indicates that parts created before 2002-10-11T00:00:00.000Z are deleted, and parts created after this time (including this time) are not deleted.
         * 
         * @return builder
         * 
         */
        public Builder createdBeforeDate(@Nullable Output<String> createdBeforeDate) {
            $.createdBeforeDate = createdBeforeDate;
            return this;
        }

        /**
         * @param createdBeforeDate Specifies the time before which the rules take effect. The date must conform to the ISO8601 format and always be UTC 00:00. For example: 2002-10-11T00:00:00.000Z indicates that parts created before 2002-10-11T00:00:00.000Z are deleted, and parts created after this time (including this time) are not deleted.
         * 
         * @return builder
         * 
         */
        public Builder createdBeforeDate(String createdBeforeDate) {
            return createdBeforeDate(Output.of(createdBeforeDate));
        }

        /**
         * @param days Specifies the number of days noncurrent object versions transition.
         * 
         * @return builder
         * 
         */
        public Builder days(@Nullable Output<Integer> days) {
            $.days = days;
            return this;
        }

        /**
         * @param days Specifies the number of days noncurrent object versions transition.
         * 
         * @return builder
         * 
         */
        public Builder days(Integer days) {
            return days(Output.of(days));
        }

        public BucketLifecycleRuleAbortMultipartUploadArgs build() {
            return $;
        }
    }

}
