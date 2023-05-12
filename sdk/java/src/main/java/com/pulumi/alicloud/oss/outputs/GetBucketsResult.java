// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.outputs;

import com.pulumi.alicloud.oss.outputs.GetBucketsBucket;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBucketsResult {
    /**
     * @return A list of buckets. Each element contains the following attributes:
     * 
     */
    private final List<GetBucketsBucket> buckets;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String nameRegex;
    /**
     * @return A list of bucket names.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;

    @CustomType.Constructor
    private GetBucketsResult(
        @CustomType.Parameter("buckets") List<GetBucketsBucket> buckets,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile) {
        this.buckets = buckets;
        this.id = id;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
    }

    /**
     * @return A list of buckets. Each element contains the following attributes:
     * 
     */
    public List<GetBucketsBucket> buckets() {
        return this.buckets;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of bucket names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetBucketsBucket> buckets;
        private String id;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buckets = defaults.buckets;
    	      this.id = defaults.id;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
        }

        public Builder buckets(List<GetBucketsBucket> buckets) {
            this.buckets = Objects.requireNonNull(buckets);
            return this;
        }
        public Builder buckets(GetBucketsBucket... buckets) {
            return buckets(List.of(buckets));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }        public GetBucketsResult build() {
            return new GetBucketsResult(buckets, id, nameRegex, names, outputFile);
        }
    }
}
