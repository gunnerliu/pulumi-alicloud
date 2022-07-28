// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.quotas.inputs;

import com.pulumi.alicloud.quotas.inputs.GetQuotaApplicationsDimension;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetQuotaApplicationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQuotaApplicationsPlainArgs Empty = new GetQuotaApplicationsPlainArgs();

    /**
     * The quota dimensions.
     * 
     */
    @Import(name="dimensions")
    private @Nullable List<GetQuotaApplicationsDimension> dimensions;

    /**
     * @return The quota dimensions.
     * 
     */
    public Optional<List<GetQuotaApplicationsDimension>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    /**
     * @return Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Application Info IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Application Info IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="keyWord")
    private @Nullable String keyWord;

    public Optional<String> keyWord() {
        return Optional.ofNullable(this.keyWord);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The product code.
     * 
     */
    @Import(name="productCode", required=true)
    private String productCode;

    /**
     * @return The product code.
     * 
     */
    public String productCode() {
        return this.productCode;
    }

    /**
     * The ID of quota action..
     * 
     */
    @Import(name="quotaActionCode")
    private @Nullable String quotaActionCode;

    /**
     * @return The ID of quota action..
     * 
     */
    public Optional<String> quotaActionCode() {
        return Optional.ofNullable(this.quotaActionCode);
    }

    /**
     * The quota category. Valid values: `CommonQuota`, `FlowControl`.
     * 
     */
    @Import(name="quotaCategory")
    private @Nullable String quotaCategory;

    /**
     * @return The quota category. Valid values: `CommonQuota`, `FlowControl`.
     * 
     */
    public Optional<String> quotaCategory() {
        return Optional.ofNullable(this.quotaCategory);
    }

    /**
     * The status of the quota application.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the quota application.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetQuotaApplicationsPlainArgs() {}

    private GetQuotaApplicationsPlainArgs(GetQuotaApplicationsPlainArgs $) {
        this.dimensions = $.dimensions;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.keyWord = $.keyWord;
        this.outputFile = $.outputFile;
        this.productCode = $.productCode;
        this.quotaActionCode = $.quotaActionCode;
        this.quotaCategory = $.quotaCategory;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQuotaApplicationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQuotaApplicationsPlainArgs $;

        public Builder() {
            $ = new GetQuotaApplicationsPlainArgs();
        }

        public Builder(GetQuotaApplicationsPlainArgs defaults) {
            $ = new GetQuotaApplicationsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dimensions The quota dimensions.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(@Nullable List<GetQuotaApplicationsDimension> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions The quota dimensions.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(GetQuotaApplicationsDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of Application Info IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Application Info IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder keyWord(@Nullable String keyWord) {
            $.keyWord = keyWord;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param productCode The product code.
         * 
         * @return builder
         * 
         */
        public Builder productCode(String productCode) {
            $.productCode = productCode;
            return this;
        }

        /**
         * @param quotaActionCode The ID of quota action..
         * 
         * @return builder
         * 
         */
        public Builder quotaActionCode(@Nullable String quotaActionCode) {
            $.quotaActionCode = quotaActionCode;
            return this;
        }

        /**
         * @param quotaCategory The quota category. Valid values: `CommonQuota`, `FlowControl`.
         * 
         * @return builder
         * 
         */
        public Builder quotaCategory(@Nullable String quotaCategory) {
            $.quotaCategory = quotaCategory;
            return this;
        }

        /**
         * @param status The status of the quota application.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetQuotaApplicationsPlainArgs build() {
            $.productCode = Objects.requireNonNull($.productCode, "expected parameter 'productCode' to be non-null");
            return $;
        }
    }

}
