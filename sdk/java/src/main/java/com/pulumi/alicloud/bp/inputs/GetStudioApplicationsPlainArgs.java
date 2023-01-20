// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStudioApplicationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStudioApplicationsPlainArgs Empty = new GetStudioApplicationsPlainArgs();

    /**
     * A list of Application IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Application IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The keyword of the Application.
     * 
     */
    @Import(name="keyword")
    private @Nullable String keyword;

    /**
     * @return The keyword of the Application.
     * 
     */
    public Optional<String> keyword() {
        return Optional.ofNullable(this.keyword);
    }

    @Import(name="maxResults")
    private @Nullable Integer maxResults;

    public Optional<Integer> maxResults() {
        return Optional.ofNullable(this.maxResults);
    }

    /**
     * A regex string to filter results by Application name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Application name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * The order type of the Application. Valid values:
     * 
     */
    @Import(name="orderType")
    private @Nullable Integer orderType;

    /**
     * @return The order type of the Application. Valid values:
     * 
     */
    public Optional<Integer> orderType() {
        return Optional.ofNullable(this.orderType);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable String resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The status of the Application. Valid values: `success`, `release`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the Application. Valid values: `success`, `release`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetStudioApplicationsPlainArgs() {}

    private GetStudioApplicationsPlainArgs(GetStudioApplicationsPlainArgs $) {
        this.ids = $.ids;
        this.keyword = $.keyword;
        this.maxResults = $.maxResults;
        this.nameRegex = $.nameRegex;
        this.orderType = $.orderType;
        this.outputFile = $.outputFile;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStudioApplicationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStudioApplicationsPlainArgs $;

        public Builder() {
            $ = new GetStudioApplicationsPlainArgs();
        }

        public Builder(GetStudioApplicationsPlainArgs defaults) {
            $ = new GetStudioApplicationsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Application IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Application IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param keyword The keyword of the Application.
         * 
         * @return builder
         * 
         */
        public Builder keyword(@Nullable String keyword) {
            $.keyword = keyword;
            return this;
        }

        public Builder maxResults(@Nullable Integer maxResults) {
            $.maxResults = maxResults;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Application name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param orderType The order type of the Application. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder orderType(@Nullable Integer orderType) {
            $.orderType = orderType;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param status The status of the Application. Valid values: `success`, `release`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetStudioApplicationsPlainArgs build() {
            return $;
        }
    }

}
