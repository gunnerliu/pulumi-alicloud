// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMscSubSubscriptionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMscSubSubscriptionsArgs Empty = new GetMscSubSubscriptionsArgs();

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetMscSubSubscriptionsArgs() {}

    private GetMscSubSubscriptionsArgs(GetMscSubSubscriptionsArgs $) {
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMscSubSubscriptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMscSubSubscriptionsArgs $;

        public Builder() {
            $ = new GetMscSubSubscriptionsArgs();
        }

        public Builder(GetMscSubSubscriptionsArgs defaults) {
            $ = new GetMscSubSubscriptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public GetMscSubSubscriptionsArgs build() {
            return $;
        }
    }

}
