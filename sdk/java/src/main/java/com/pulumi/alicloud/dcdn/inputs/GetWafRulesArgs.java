// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWafRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWafRulesArgs Empty = new GetWafRulesArgs();

    /**
     * A list of Waf Rule IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Waf Rule IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    @Import(name="pageNumber")
    private @Nullable Output<Integer> pageNumber;

    public Optional<Output<Integer>> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Output<Integer> pageSize;

    public Optional<Output<Integer>> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * The query conditions. The value is a string in the JSON format.
     * 
     */
    @Import(name="queryArgs")
    private @Nullable Output<String> queryArgs;

    /**
     * @return The query conditions. The value is a string in the JSON format.
     * 
     */
    public Optional<Output<String>> queryArgs() {
        return Optional.ofNullable(this.queryArgs);
    }

    private GetWafRulesArgs() {}

    private GetWafRulesArgs(GetWafRulesArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.queryArgs = $.queryArgs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWafRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWafRulesArgs $;

        public Builder() {
            $ = new GetWafRulesArgs();
        }

        public Builder(GetWafRulesArgs defaults) {
            $ = new GetWafRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Waf Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Waf Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Waf Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public Builder pageNumber(@Nullable Output<Integer> pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageNumber(Integer pageNumber) {
            return pageNumber(Output.of(pageNumber));
        }

        public Builder pageSize(@Nullable Output<Integer> pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            return pageSize(Output.of(pageSize));
        }

        /**
         * @param queryArgs The query conditions. The value is a string in the JSON format.
         * 
         * @return builder
         * 
         */
        public Builder queryArgs(@Nullable Output<String> queryArgs) {
            $.queryArgs = queryArgs;
            return this;
        }

        /**
         * @param queryArgs The query conditions. The value is a string in the JSON format.
         * 
         * @return builder
         * 
         */
        public Builder queryArgs(String queryArgs) {
            return queryArgs(Output.of(queryArgs));
        }

        public GetWafRulesArgs build() {
            return $;
        }
    }

}
