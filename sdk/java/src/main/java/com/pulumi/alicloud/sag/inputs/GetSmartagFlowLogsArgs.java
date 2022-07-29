// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sag.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSmartagFlowLogsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSmartagFlowLogsArgs Empty = new GetSmartagFlowLogsArgs();

    /**
     * The description of the flow log.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the flow log.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A list of Flow Log IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Flow Log IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Flow Log name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Flow Log name.
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
     * The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetSmartagFlowLogsArgs() {}

    private GetSmartagFlowLogsArgs(GetSmartagFlowLogsArgs $) {
        this.description = $.description;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSmartagFlowLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSmartagFlowLogsArgs $;

        public Builder() {
            $ = new GetSmartagFlowLogsArgs();
        }

        public Builder(GetSmartagFlowLogsArgs defaults) {
            $ = new GetSmartagFlowLogsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the flow log.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the flow log.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ids A list of Flow Log IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Flow Log IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Flow Log IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Flow Log name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Flow Log name.
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
         * @param status The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetSmartagFlowLogsArgs build() {
            return $;
        }
    }

}
