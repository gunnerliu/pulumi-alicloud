// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BucketReplicationPrefixSet {
    /**
     * @return The list of object key name prefix identifying one or more objects to which the rule applies.
     * 
     * `NOTE`: The prefix must be less than or equal to 1024 characters in length.
     * 
     */
    private final List<String> prefixes;

    @CustomType.Constructor
    private BucketReplicationPrefixSet(@CustomType.Parameter("prefixes") List<String> prefixes) {
        this.prefixes = prefixes;
    }

    /**
     * @return The list of object key name prefix identifying one or more objects to which the rule applies.
     * 
     * `NOTE`: The prefix must be less than or equal to 1024 characters in length.
     * 
     */
    public List<String> prefixes() {
        return this.prefixes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationPrefixSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> prefixes;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationPrefixSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefixes = defaults.prefixes;
        }

        public Builder prefixes(List<String> prefixes) {
            this.prefixes = Objects.requireNonNull(prefixes);
            return this;
        }
        public Builder prefixes(String... prefixes) {
            return prefixes(List.of(prefixes));
        }        public BucketReplicationPrefixSet build() {
            return new BucketReplicationPrefixSet(prefixes);
        }
    }
}
