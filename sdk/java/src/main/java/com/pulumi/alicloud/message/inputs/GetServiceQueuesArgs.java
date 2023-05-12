// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.message.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceQueuesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceQueuesArgs Empty = new GetServiceQueuesArgs();

    /**
     * A list of Queue IDs. Its element value is same as Queue Name.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Queue IDs. Its element value is same as Queue Name.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Queue name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Queue name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
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
     * The name of the queue.
     * 
     */
    @Import(name="queueName")
    private @Nullable Output<String> queueName;

    /**
     * @return The name of the queue.
     * 
     */
    public Optional<Output<String>> queueName() {
        return Optional.ofNullable(this.queueName);
    }

    private GetServiceQueuesArgs() {}

    private GetServiceQueuesArgs(GetServiceQueuesArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.queueName = $.queueName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceQueuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceQueuesArgs $;

        public Builder() {
            $ = new GetServiceQueuesArgs();
        }

        public Builder(GetServiceQueuesArgs defaults) {
            $ = new GetServiceQueuesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Queue IDs. Its element value is same as Queue Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Queue IDs. Its element value is same as Queue Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Queue IDs. Its element value is same as Queue Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Queue name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Queue name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
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
         * @param queueName The name of the queue.
         * 
         * @return builder
         * 
         */
        public Builder queueName(@Nullable Output<String> queueName) {
            $.queueName = queueName;
            return this;
        }

        /**
         * @param queueName The name of the queue.
         * 
         * @return builder
         * 
         */
        public Builder queueName(String queueName) {
            return queueName(Output.of(queueName));
        }

        public GetServiceQueuesArgs build() {
            return $;
        }
    }

}
