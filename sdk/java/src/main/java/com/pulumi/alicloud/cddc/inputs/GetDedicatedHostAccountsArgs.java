// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cddc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDedicatedHostAccountsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDedicatedHostAccountsArgs Empty = new GetDedicatedHostAccountsArgs();

    /**
     * The ID of the Dedicated host.
     * 
     */
    @Import(name="dedicatedHostId")
    private @Nullable Output<String> dedicatedHostId;

    /**
     * @return The ID of the Dedicated host.
     * 
     */
    public Optional<Output<String>> dedicatedHostId() {
        return Optional.ofNullable(this.dedicatedHostId);
    }

    /**
     * A list of Dedicated Host Account IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Dedicated Host Account IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Account name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Account name.
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

    private GetDedicatedHostAccountsArgs() {}

    private GetDedicatedHostAccountsArgs(GetDedicatedHostAccountsArgs $) {
        this.dedicatedHostId = $.dedicatedHostId;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDedicatedHostAccountsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDedicatedHostAccountsArgs $;

        public Builder() {
            $ = new GetDedicatedHostAccountsArgs();
        }

        public Builder(GetDedicatedHostAccountsArgs defaults) {
            $ = new GetDedicatedHostAccountsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dedicatedHostId The ID of the Dedicated host.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedHostId(@Nullable Output<String> dedicatedHostId) {
            $.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * @param dedicatedHostId The ID of the Dedicated host.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            return dedicatedHostId(Output.of(dedicatedHostId));
        }

        /**
         * @param ids A list of Dedicated Host Account IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Dedicated Host Account IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Dedicated Host Account IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Account name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Account name.
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

        public GetDedicatedHostAccountsArgs build() {
            return $;
        }
    }

}
