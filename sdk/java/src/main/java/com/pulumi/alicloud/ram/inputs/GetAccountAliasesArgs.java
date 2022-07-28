// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountAliasesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountAliasesArgs Empty = new GetAccountAliasesArgs();

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetAccountAliasesArgs() {}

    private GetAccountAliasesArgs(GetAccountAliasesArgs $) {
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountAliasesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountAliasesArgs $;

        public Builder() {
            $ = new GetAccountAliasesArgs();
        }

        public Builder(GetAccountAliasesArgs defaults) {
            $ = new GetAccountAliasesArgs(Objects.requireNonNull(defaults));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public GetAccountAliasesArgs build() {
            return $;
        }
    }

}
