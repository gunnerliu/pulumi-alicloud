// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConfigurationRecordersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigurationRecordersPlainArgs Empty = new GetConfigurationRecordersPlainArgs();

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetConfigurationRecordersPlainArgs() {}

    private GetConfigurationRecordersPlainArgs(GetConfigurationRecordersPlainArgs $) {
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigurationRecordersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigurationRecordersPlainArgs $;

        public Builder() {
            $ = new GetConfigurationRecordersPlainArgs();
        }

        public Builder(GetConfigurationRecordersPlainArgs defaults) {
            $ = new GetConfigurationRecordersPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public GetConfigurationRecordersPlainArgs build() {
            return $;
        }
    }

}
