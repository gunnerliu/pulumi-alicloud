// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketLifecycleRuleAbortMultipartUpload {
    /**
     * @return Specifies the time before which the rules take effect. The date must conform to the ISO8601 format and always be UTC 00:00. For example: 2002-10-11T00:00:00.000Z indicates that parts created before 2002-10-11T00:00:00.000Z are deleted, and parts created after this time (including this time) are not deleted.
     * 
     */
    private @Nullable String createdBeforeDate;
    /**
     * @return Specifies the number of days noncurrent object versions transition.
     * 
     */
    private @Nullable Integer days;

    private BucketLifecycleRuleAbortMultipartUpload() {}
    /**
     * @return Specifies the time before which the rules take effect. The date must conform to the ISO8601 format and always be UTC 00:00. For example: 2002-10-11T00:00:00.000Z indicates that parts created before 2002-10-11T00:00:00.000Z are deleted, and parts created after this time (including this time) are not deleted.
     * 
     */
    public Optional<String> createdBeforeDate() {
        return Optional.ofNullable(this.createdBeforeDate);
    }
    /**
     * @return Specifies the number of days noncurrent object versions transition.
     * 
     */
    public Optional<Integer> days() {
        return Optional.ofNullable(this.days);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleAbortMultipartUpload defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String createdBeforeDate;
        private @Nullable Integer days;
        public Builder() {}
        public Builder(BucketLifecycleRuleAbortMultipartUpload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdBeforeDate = defaults.createdBeforeDate;
    	      this.days = defaults.days;
        }

        @CustomType.Setter
        public Builder createdBeforeDate(@Nullable String createdBeforeDate) {
            this.createdBeforeDate = createdBeforeDate;
            return this;
        }
        @CustomType.Setter
        public Builder days(@Nullable Integer days) {
            this.days = days;
            return this;
        }
        public BucketLifecycleRuleAbortMultipartUpload build() {
            final var _resultValue = new BucketLifecycleRuleAbortMultipartUpload();
            _resultValue.createdBeforeDate = createdBeforeDate;
            _resultValue.days = days;
            return _resultValue;
        }
    }
}
