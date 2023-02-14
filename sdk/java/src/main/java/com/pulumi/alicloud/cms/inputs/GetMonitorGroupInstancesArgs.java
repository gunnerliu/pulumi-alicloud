// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMonitorGroupInstancesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMonitorGroupInstancesArgs Empty = new GetMonitorGroupInstancesArgs();

    @Import(name="ids", required=true)
    private Output<String> ids;

    public Output<String> ids() {
        return this.ids;
    }

    @Import(name="keyword")
    private @Nullable Output<String> keyword;

    public Optional<Output<String>> keyword() {
        return Optional.ofNullable(this.keyword);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetMonitorGroupInstancesArgs() {}

    private GetMonitorGroupInstancesArgs(GetMonitorGroupInstancesArgs $) {
        this.ids = $.ids;
        this.keyword = $.keyword;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMonitorGroupInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMonitorGroupInstancesArgs $;

        public Builder() {
            $ = new GetMonitorGroupInstancesArgs();
        }

        public Builder(GetMonitorGroupInstancesArgs defaults) {
            $ = new GetMonitorGroupInstancesArgs(Objects.requireNonNull(defaults));
        }

        public Builder ids(Output<String> ids) {
            $.ids = ids;
            return this;
        }

        public Builder ids(String ids) {
            return ids(Output.of(ids));
        }

        public Builder keyword(@Nullable Output<String> keyword) {
            $.keyword = keyword;
            return this;
        }

        public Builder keyword(String keyword) {
            return keyword(Output.of(keyword));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public GetMonitorGroupInstancesArgs build() {
            $.ids = Objects.requireNonNull($.ids, "expected parameter 'ids' to be non-null");
            return $;
        }
    }

}