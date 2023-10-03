// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketLifecycleRuleNoncurrentVersionTransition {
    /**
     * @return Specifies the number of days noncurrent object versions transition.
     * 
     */
    private Integer days;
    /**
     * @return Specifies whether the lifecycle rule applies to objects based on their last access time. If set to `true`, the rule applies to objects based on their last access time; if set to `false`, the rule applies to objects based on their last modified time. If configure the rule based on the last access time, please enable `access_monitor` first.
     * 
     */
    private @Nullable Boolean isAccessTime;
    /**
     * @return Specifies whether to convert the storage class of non-Standard objects back to Standard after the objects are accessed. It takes effect only when the IsAccessTime parameter is set to true. If set to `true`, converts the storage class of the objects to Standard; if set to `false`, does not convert the storage class of the objects to Standard.
     * 
     */
    private @Nullable Boolean returnToStdWhenVisit;
    /**
     * @return The [storage class](https://www.alibabacloud.com/help/doc-detail/51374.htm) to apply. Can be &#34;Standard&#34;, &#34;IA&#34;, &#34;Archive&#34;, &#34;ColdArchive&#34; and &#34;DeepColdArchive&#34;. Defaults to &#34;Standard&#34;. &#34;ColdArchive&#34; is available since 1.203.0. &#34;DeepColdArchive&#34; is available since 1.209.0.
     * 
     */
    private String storageClass;

    private BucketLifecycleRuleNoncurrentVersionTransition() {}
    /**
     * @return Specifies the number of days noncurrent object versions transition.
     * 
     */
    public Integer days() {
        return this.days;
    }
    /**
     * @return Specifies whether the lifecycle rule applies to objects based on their last access time. If set to `true`, the rule applies to objects based on their last access time; if set to `false`, the rule applies to objects based on their last modified time. If configure the rule based on the last access time, please enable `access_monitor` first.
     * 
     */
    public Optional<Boolean> isAccessTime() {
        return Optional.ofNullable(this.isAccessTime);
    }
    /**
     * @return Specifies whether to convert the storage class of non-Standard objects back to Standard after the objects are accessed. It takes effect only when the IsAccessTime parameter is set to true. If set to `true`, converts the storage class of the objects to Standard; if set to `false`, does not convert the storage class of the objects to Standard.
     * 
     */
    public Optional<Boolean> returnToStdWhenVisit() {
        return Optional.ofNullable(this.returnToStdWhenVisit);
    }
    /**
     * @return The [storage class](https://www.alibabacloud.com/help/doc-detail/51374.htm) to apply. Can be &#34;Standard&#34;, &#34;IA&#34;, &#34;Archive&#34;, &#34;ColdArchive&#34; and &#34;DeepColdArchive&#34;. Defaults to &#34;Standard&#34;. &#34;ColdArchive&#34; is available since 1.203.0. &#34;DeepColdArchive&#34; is available since 1.209.0.
     * 
     */
    public String storageClass() {
        return this.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleNoncurrentVersionTransition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer days;
        private @Nullable Boolean isAccessTime;
        private @Nullable Boolean returnToStdWhenVisit;
        private String storageClass;
        public Builder() {}
        public Builder(BucketLifecycleRuleNoncurrentVersionTransition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.isAccessTime = defaults.isAccessTime;
    	      this.returnToStdWhenVisit = defaults.returnToStdWhenVisit;
    	      this.storageClass = defaults.storageClass;
        }

        @CustomType.Setter
        public Builder days(Integer days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        @CustomType.Setter
        public Builder isAccessTime(@Nullable Boolean isAccessTime) {
            this.isAccessTime = isAccessTime;
            return this;
        }
        @CustomType.Setter
        public Builder returnToStdWhenVisit(@Nullable Boolean returnToStdWhenVisit) {
            this.returnToStdWhenVisit = returnToStdWhenVisit;
            return this;
        }
        @CustomType.Setter
        public Builder storageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }
        public BucketLifecycleRuleNoncurrentVersionTransition build() {
            final var o = new BucketLifecycleRuleNoncurrentVersionTransition();
            o.days = days;
            o.isAccessTime = isAccessTime;
            o.returnToStdWhenVisit = returnToStdWhenVisit;
            o.storageClass = storageClass;
            return o;
        }
    }
}
