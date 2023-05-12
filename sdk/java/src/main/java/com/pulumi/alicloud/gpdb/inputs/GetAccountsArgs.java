// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountsArgs Empty = new GetAccountsArgs();

    /**
     * The ID of the instance.
     * 
     */
    @Import(name="dbInstanceId", required=true)
    private Output<String> dbInstanceId;

    /**
     * @return The ID of the instance.
     * 
     */
    public Output<String> dbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * A list of Account IDs. Its element value is same as Account Name.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Account IDs. Its element value is same as Account Name.
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

    /**
     * The status of the account. Valid values: `Active`, `Creating` and `Deleting`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the account. Valid values: `Active`, `Creating` and `Deleting`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetAccountsArgs() {}

    private GetAccountsArgs(GetAccountsArgs $) {
        this.dbInstanceId = $.dbInstanceId;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountsArgs $;

        public Builder() {
            $ = new GetAccountsArgs();
        }

        public Builder(GetAccountsArgs defaults) {
            $ = new GetAccountsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbInstanceId The ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(Output<String> dbInstanceId) {
            $.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * @param dbInstanceId The ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(String dbInstanceId) {
            return dbInstanceId(Output.of(dbInstanceId));
        }

        /**
         * @param ids A list of Account IDs. Its element value is same as Account Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Account IDs. Its element value is same as Account Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Account IDs. Its element value is same as Account Name.
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

        /**
         * @param status The status of the account. Valid values: `Active`, `Creating` and `Deleting`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the account. Valid values: `Active`, `Creating` and `Deleting`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetAccountsArgs build() {
            $.dbInstanceId = Objects.requireNonNull($.dbInstanceId, "expected parameter 'dbInstanceId' to be non-null");
            return $;
        }
    }

}
