// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.clickhouse.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountsPlainArgs Empty = new GetAccountsPlainArgs();

    /**
     * The DBCluster id.
     * 
     */
    @Import(name="dbClusterId", required=true)
    private String dbClusterId;

    /**
     * @return The DBCluster id.
     * 
     */
    public String dbClusterId() {
        return this.dbClusterId;
    }

    /**
     * A list of Account IDs. Its element value is same as Account Name.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Account IDs. Its element value is same as Account Name.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Account name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Account name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of the resource.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the resource.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetAccountsPlainArgs() {}

    private GetAccountsPlainArgs(GetAccountsPlainArgs $) {
        this.dbClusterId = $.dbClusterId;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountsPlainArgs $;

        public Builder() {
            $ = new GetAccountsPlainArgs();
        }

        public Builder(GetAccountsPlainArgs defaults) {
            $ = new GetAccountsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbClusterId The DBCluster id.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterId(String dbClusterId) {
            $.dbClusterId = dbClusterId;
            return this;
        }

        /**
         * @param ids A list of Account IDs. Its element value is same as Account Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
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
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetAccountsPlainArgs build() {
            $.dbClusterId = Objects.requireNonNull($.dbClusterId, "expected parameter 'dbClusterId' to be non-null");
            return $;
        }
    }

}
