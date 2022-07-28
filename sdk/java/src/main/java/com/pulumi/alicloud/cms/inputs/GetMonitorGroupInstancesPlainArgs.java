// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMonitorGroupInstancesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMonitorGroupInstancesPlainArgs Empty = new GetMonitorGroupInstancesPlainArgs();

    @Import(name="ids", required=true)
    private String ids;

    public String ids() {
        return this.ids;
    }

    @Import(name="keyword")
    private @Nullable String keyword;

    public Optional<String> keyword() {
        return Optional.ofNullable(this.keyword);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetMonitorGroupInstancesPlainArgs() {}

    private GetMonitorGroupInstancesPlainArgs(GetMonitorGroupInstancesPlainArgs $) {
        this.ids = $.ids;
        this.keyword = $.keyword;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMonitorGroupInstancesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMonitorGroupInstancesPlainArgs $;

        public Builder() {
            $ = new GetMonitorGroupInstancesPlainArgs();
        }

        public Builder(GetMonitorGroupInstancesPlainArgs defaults) {
            $ = new GetMonitorGroupInstancesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder ids(String ids) {
            $.ids = ids;
            return this;
        }

        public Builder keyword(@Nullable String keyword) {
            $.keyword = keyword;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public GetMonitorGroupInstancesPlainArgs build() {
            $.ids = Objects.requireNonNull($.ids, "expected parameter 'ids' to be non-null");
            return $;
        }
    }

}
