// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.marketplace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProductsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProductsArgs Empty = new GetProductsArgs();

    /**
     * The Category ID of products. For more information, see [DescribeProducts](https://help.aliyun.com/document_detail/89834.htm).
     * 
     */
    @Import(name="categoryId")
    private @Nullable Output<String> categoryId;

    /**
     * @return The Category ID of products. For more information, see [DescribeProducts](https://help.aliyun.com/document_detail/89834.htm).
     * 
     */
    public Optional<Output<String>> categoryId() {
        return Optional.ofNullable(this.categoryId);
    }

    /**
     * A list of product code.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of product code.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to apply to the product name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to apply to the product name.
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
     * The type of products, Valid values: `APP`, `SERVICE`, `MIRROR`, `DOWNLOAD` and `API_SERVICE`.
     * 
     */
    @Import(name="productType")
    private @Nullable Output<String> productType;

    /**
     * @return The type of products, Valid values: `APP`, `SERVICE`, `MIRROR`, `DOWNLOAD` and `API_SERVICE`.
     * 
     */
    public Optional<Output<String>> productType() {
        return Optional.ofNullable(this.productType);
    }

    /**
     * Search term in this query.
     * 
     */
    @Import(name="searchTerm")
    private @Nullable Output<String> searchTerm;

    /**
     * @return Search term in this query.
     * 
     */
    public Optional<Output<String>> searchTerm() {
        return Optional.ofNullable(this.searchTerm);
    }

    /**
     * This field determines how to sort the filtered results, Valid values: `user_count-desc`, `created_on-desc`, `price-desc` and `score-desc`.
     * 
     */
    @Import(name="sort")
    private @Nullable Output<String> sort;

    /**
     * @return This field determines how to sort the filtered results, Valid values: `user_count-desc`, `created_on-desc`, `price-desc` and `score-desc`.
     * 
     */
    public Optional<Output<String>> sort() {
        return Optional.ofNullable(this.sort);
    }

    /**
     * The suggested price of the product.
     * 
     */
    @Import(name="suggestedPrice")
    private @Nullable Output<Double> suggestedPrice;

    /**
     * @return The suggested price of the product.
     * 
     */
    public Optional<Output<Double>> suggestedPrice() {
        return Optional.ofNullable(this.suggestedPrice);
    }

    /**
     * The supplier id of the product.
     * 
     */
    @Import(name="supplierId")
    private @Nullable Output<String> supplierId;

    /**
     * @return The supplier id of the product.
     * 
     */
    public Optional<Output<String>> supplierId() {
        return Optional.ofNullable(this.supplierId);
    }

    /**
     * The supplier name keyword of the product.
     * 
     */
    @Import(name="supplierNameKeyword")
    private @Nullable Output<String> supplierNameKeyword;

    /**
     * @return The supplier name keyword of the product.
     * 
     */
    public Optional<Output<String>> supplierNameKeyword() {
        return Optional.ofNullable(this.supplierNameKeyword);
    }

    private GetProductsArgs() {}

    private GetProductsArgs(GetProductsArgs $) {
        this.categoryId = $.categoryId;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.productType = $.productType;
        this.searchTerm = $.searchTerm;
        this.sort = $.sort;
        this.suggestedPrice = $.suggestedPrice;
        this.supplierId = $.supplierId;
        this.supplierNameKeyword = $.supplierNameKeyword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProductsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProductsArgs $;

        public Builder() {
            $ = new GetProductsArgs();
        }

        public Builder(GetProductsArgs defaults) {
            $ = new GetProductsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param categoryId The Category ID of products. For more information, see [DescribeProducts](https://help.aliyun.com/document_detail/89834.htm).
         * 
         * @return builder
         * 
         */
        public Builder categoryId(@Nullable Output<String> categoryId) {
            $.categoryId = categoryId;
            return this;
        }

        /**
         * @param categoryId The Category ID of products. For more information, see [DescribeProducts](https://help.aliyun.com/document_detail/89834.htm).
         * 
         * @return builder
         * 
         */
        public Builder categoryId(String categoryId) {
            return categoryId(Output.of(categoryId));
        }

        /**
         * @param ids A list of product code.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of product code.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of product code.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to apply to the product name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to apply to the product name.
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
         * @param productType The type of products, Valid values: `APP`, `SERVICE`, `MIRROR`, `DOWNLOAD` and `API_SERVICE`.
         * 
         * @return builder
         * 
         */
        public Builder productType(@Nullable Output<String> productType) {
            $.productType = productType;
            return this;
        }

        /**
         * @param productType The type of products, Valid values: `APP`, `SERVICE`, `MIRROR`, `DOWNLOAD` and `API_SERVICE`.
         * 
         * @return builder
         * 
         */
        public Builder productType(String productType) {
            return productType(Output.of(productType));
        }

        /**
         * @param searchTerm Search term in this query.
         * 
         * @return builder
         * 
         */
        public Builder searchTerm(@Nullable Output<String> searchTerm) {
            $.searchTerm = searchTerm;
            return this;
        }

        /**
         * @param searchTerm Search term in this query.
         * 
         * @return builder
         * 
         */
        public Builder searchTerm(String searchTerm) {
            return searchTerm(Output.of(searchTerm));
        }

        /**
         * @param sort This field determines how to sort the filtered results, Valid values: `user_count-desc`, `created_on-desc`, `price-desc` and `score-desc`.
         * 
         * @return builder
         * 
         */
        public Builder sort(@Nullable Output<String> sort) {
            $.sort = sort;
            return this;
        }

        /**
         * @param sort This field determines how to sort the filtered results, Valid values: `user_count-desc`, `created_on-desc`, `price-desc` and `score-desc`.
         * 
         * @return builder
         * 
         */
        public Builder sort(String sort) {
            return sort(Output.of(sort));
        }

        /**
         * @param suggestedPrice The suggested price of the product.
         * 
         * @return builder
         * 
         */
        public Builder suggestedPrice(@Nullable Output<Double> suggestedPrice) {
            $.suggestedPrice = suggestedPrice;
            return this;
        }

        /**
         * @param suggestedPrice The suggested price of the product.
         * 
         * @return builder
         * 
         */
        public Builder suggestedPrice(Double suggestedPrice) {
            return suggestedPrice(Output.of(suggestedPrice));
        }

        /**
         * @param supplierId The supplier id of the product.
         * 
         * @return builder
         * 
         */
        public Builder supplierId(@Nullable Output<String> supplierId) {
            $.supplierId = supplierId;
            return this;
        }

        /**
         * @param supplierId The supplier id of the product.
         * 
         * @return builder
         * 
         */
        public Builder supplierId(String supplierId) {
            return supplierId(Output.of(supplierId));
        }

        /**
         * @param supplierNameKeyword The supplier name keyword of the product.
         * 
         * @return builder
         * 
         */
        public Builder supplierNameKeyword(@Nullable Output<String> supplierNameKeyword) {
            $.supplierNameKeyword = supplierNameKeyword;
            return this;
        }

        /**
         * @param supplierNameKeyword The supplier name keyword of the product.
         * 
         * @return builder
         * 
         */
        public Builder supplierNameKeyword(String supplierNameKeyword) {
            return supplierNameKeyword(Output.of(supplierNameKeyword));
        }

        public GetProductsArgs build() {
            return $;
        }
    }

}
