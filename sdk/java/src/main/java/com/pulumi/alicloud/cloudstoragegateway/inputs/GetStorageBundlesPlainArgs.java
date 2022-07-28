// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudstoragegateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStorageBundlesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStorageBundlesPlainArgs Empty = new GetStorageBundlesPlainArgs();

    @Import(name="backendBucketRegionId", required=true)
    private String backendBucketRegionId;

    public String backendBucketRegionId() {
        return this.backendBucketRegionId;
    }

    @Import(name="ids")
    private @Nullable List<String> ids;

    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    @Import(name="pageNumber")
    private @Nullable Integer pageNumber;

    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Integer pageSize;

    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    private GetStorageBundlesPlainArgs() {}

    private GetStorageBundlesPlainArgs(GetStorageBundlesPlainArgs $) {
        this.backendBucketRegionId = $.backendBucketRegionId;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStorageBundlesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStorageBundlesPlainArgs $;

        public Builder() {
            $ = new GetStorageBundlesPlainArgs();
        }

        public Builder(GetStorageBundlesPlainArgs defaults) {
            $ = new GetStorageBundlesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder backendBucketRegionId(String backendBucketRegionId) {
            $.backendBucketRegionId = backendBucketRegionId;
            return this;
        }

        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder pageNumber(@Nullable Integer pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageSize(@Nullable Integer pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        public GetStorageBundlesPlainArgs build() {
            $.backendBucketRegionId = Objects.requireNonNull($.backendBucketRegionId, "expected parameter 'backendBucketRegionId' to be non-null");
            return $;
        }
    }

}
