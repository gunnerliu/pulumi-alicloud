// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicecatalog.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPortfoliosPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPortfoliosPlainArgs Empty = new GetPortfoliosPlainArgs();

    /**
     * A list of Portfolio IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Portfolio IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Group Metric Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Group Metric Rule name.
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

    @Import(name="pageNumber")
    private @Nullable Integer pageNumber;

    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Integer pageSize;

    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * The ID of the product.
     * 
     */
    @Import(name="productId")
    private @Nullable String productId;

    /**
     * @return The ID of the product.
     * 
     */
    public Optional<String> productId() {
        return Optional.ofNullable(this.productId);
    }

    /**
     * The query scope. Valid values: `Local`(default), `Import`, `All`.
     * 
     */
    @Import(name="scope")
    private @Nullable String scope;

    /**
     * @return The query scope. Valid values: `Local`(default), `Import`, `All`.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * The field that is used to sort the queried data. The value is fixed as CreateTime, which specifies the creation time of product portfolios.
     * 
     */
    @Import(name="sortBy")
    private @Nullable String sortBy;

    /**
     * @return The field that is used to sort the queried data. The value is fixed as CreateTime, which specifies the creation time of product portfolios.
     * 
     */
    public Optional<String> sortBy() {
        return Optional.ofNullable(this.sortBy);
    }

    /**
     * The order in which you want to sort the queried data. Valid values: `Asc`, `Desc`.
     * 
     */
    @Import(name="sortOrder")
    private @Nullable String sortOrder;

    /**
     * @return The order in which you want to sort the queried data. Valid values: `Asc`, `Desc`.
     * 
     */
    public Optional<String> sortOrder() {
        return Optional.ofNullable(this.sortOrder);
    }

    private GetPortfoliosPlainArgs() {}

    private GetPortfoliosPlainArgs(GetPortfoliosPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.productId = $.productId;
        this.scope = $.scope;
        this.sortBy = $.sortBy;
        this.sortOrder = $.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPortfoliosPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPortfoliosPlainArgs $;

        public Builder() {
            $ = new GetPortfoliosPlainArgs();
        }

        public Builder(GetPortfoliosPlainArgs defaults) {
            $ = new GetPortfoliosPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Portfolio IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Portfolio IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Group Metric Rule name.
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

        public Builder pageNumber(@Nullable Integer pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageSize(@Nullable Integer pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        /**
         * @param productId The ID of the product.
         * 
         * @return builder
         * 
         */
        public Builder productId(@Nullable String productId) {
            $.productId = productId;
            return this;
        }

        /**
         * @param scope The query scope. Valid values: `Local`(default), `Import`, `All`.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable String scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param sortBy The field that is used to sort the queried data. The value is fixed as CreateTime, which specifies the creation time of product portfolios.
         * 
         * @return builder
         * 
         */
        public Builder sortBy(@Nullable String sortBy) {
            $.sortBy = sortBy;
            return this;
        }

        /**
         * @param sortOrder The order in which you want to sort the queried data. Valid values: `Asc`, `Desc`.
         * 
         * @return builder
         * 
         */
        public Builder sortOrder(@Nullable String sortOrder) {
            $.sortOrder = sortOrder;
            return this;
        }

        public GetPortfoliosPlainArgs build() {
            return $;
        }
    }

}
