// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.tag.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMetaTagsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMetaTagsArgs Empty = new GetMetaTagsArgs();

    /**
     * The name of the key.
     * 
     */
    @Import(name="keyName")
    private @Nullable Output<String> keyName;

    /**
     * @return The name of the key.
     * 
     */
    public Optional<Output<String>> keyName() {
        return Optional.ofNullable(this.keyName);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetMetaTagsArgs() {}

    private GetMetaTagsArgs(GetMetaTagsArgs $) {
        this.keyName = $.keyName;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetaTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetaTagsArgs $;

        public Builder() {
            $ = new GetMetaTagsArgs();
        }

        public Builder(GetMetaTagsArgs defaults) {
            $ = new GetMetaTagsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyName The name of the key.
         * 
         * @return builder
         * 
         */
        public Builder keyName(@Nullable Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param keyName The name of the key.
         * 
         * @return builder
         * 
         */
        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public GetMetaTagsArgs build() {
            return $;
        }
    }

}