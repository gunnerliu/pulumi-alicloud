// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrefixListsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrefixListsArgs Empty = new GetPrefixListsArgs();

    /**
     * Default to `true`. Set it to `false` can hide the `entrys` to output.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Output<Boolean> enableDetails;

    /**
     * @return Default to `true`. Set it to `false` can hide the `entrys` to output.
     * 
     */
    public Optional<Output<Boolean>> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Prefix List IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Prefix List IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Prefix List name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Prefix List name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The name of the prefix list.
     * 
     */
    @Import(name="prefixListName")
    private @Nullable Output<String> prefixListName;

    /**
     * @return The name of the prefix list.
     * 
     */
    public Optional<Output<String>> prefixListName() {
        return Optional.ofNullable(this.prefixListName);
    }

    private GetPrefixListsArgs() {}

    private GetPrefixListsArgs(GetPrefixListsArgs $) {
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.prefixListName = $.prefixListName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrefixListsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrefixListsArgs $;

        public Builder() {
            $ = new GetPrefixListsArgs();
        }

        public Builder(GetPrefixListsArgs defaults) {
            $ = new GetPrefixListsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableDetails Default to `true`. Set it to `false` can hide the `entrys` to output.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Output<Boolean> enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param enableDetails Default to `true`. Set it to `false` can hide the `entrys` to output.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(Boolean enableDetails) {
            return enableDetails(Output.of(enableDetails));
        }

        /**
         * @param ids A list of Prefix List IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Prefix List IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Prefix List IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Prefix List name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Prefix List name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param prefixListName The name of the prefix list.
         * 
         * @return builder
         * 
         */
        public Builder prefixListName(@Nullable Output<String> prefixListName) {
            $.prefixListName = prefixListName;
            return this;
        }

        /**
         * @param prefixListName The name of the prefix list.
         * 
         * @return builder
         * 
         */
        public Builder prefixListName(String prefixListName) {
            return prefixListName(Output.of(prefixListName));
        }

        public GetPrefixListsArgs build() {
            return $;
        }
    }

}