// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketLifecycleRuleNoncurrentVersionTransition {
    /**
     * @return Specifies the number of days after object creation when the specific rule action takes effect.
     * 
     */
    private Integer days;
    /**
     * @return The [storage class](https://www.alibabacloud.com/help/doc-detail/51374.htm) to apply. Can be &#34;Standard&#34;, &#34;IA&#34; and &#34;Archive&#34;. Defaults to &#34;Standard&#34;.
     * 
     */
    private String storageClass;

    private BucketLifecycleRuleNoncurrentVersionTransition() {}
    /**
     * @return Specifies the number of days after object creation when the specific rule action takes effect.
     * 
     */
    public Integer days() {
        return this.days;
    }
    /**
     * @return The [storage class](https://www.alibabacloud.com/help/doc-detail/51374.htm) to apply. Can be &#34;Standard&#34;, &#34;IA&#34; and &#34;Archive&#34;. Defaults to &#34;Standard&#34;.
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
        private String storageClass;
        public Builder() {}
        public Builder(BucketLifecycleRuleNoncurrentVersionTransition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.storageClass = defaults.storageClass;
        }

        @CustomType.Setter
        public Builder days(Integer days) {
            this.days = Objects.requireNonNull(days);
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
            o.storageClass = storageClass;
            return o;
        }
    }
}
