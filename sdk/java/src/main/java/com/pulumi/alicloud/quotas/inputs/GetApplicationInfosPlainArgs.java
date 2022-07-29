// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.quotas.inputs;

import com.pulumi.alicloud.quotas.inputs.GetApplicationInfosDimension;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationInfosPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationInfosPlainArgs Empty = new GetApplicationInfosPlainArgs();

    @Import(name="dimensions")
    private @Nullable List<GetApplicationInfosDimension> dimensions;

    public Optional<List<GetApplicationInfosDimension>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    @Import(name="ids")
    private @Nullable List<String> ids;

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

    @Import(name="productCode", required=true)
    private String productCode;

    public String productCode() {
        return this.productCode;
    }

    @Import(name="quotaActionCode")
    private @Nullable String quotaActionCode;

    public Optional<String> quotaActionCode() {
        return Optional.ofNullable(this.quotaActionCode);
    }

    @Import(name="quotaCategory")
    private @Nullable String quotaCategory;

    public Optional<String> quotaCategory() {
        return Optional.ofNullable(this.quotaCategory);
    }

    @Import(name="status")
    private @Nullable String status;

    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetApplicationInfosPlainArgs() {}

    private GetApplicationInfosPlainArgs(GetApplicationInfosPlainArgs $) {
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
    public static Builder builder(GetApplicationInfosPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationInfosPlainArgs $;

        public Builder() {
            $ = new GetApplicationInfosPlainArgs();
        }

        public Builder(GetApplicationInfosPlainArgs defaults) {
            $ = new GetApplicationInfosPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder dimensions(@Nullable List<GetApplicationInfosDimension> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(GetApplicationInfosDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }

        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

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

        public Builder productCode(String productCode) {
            $.productCode = productCode;
            return this;
        }

        public Builder quotaActionCode(@Nullable String quotaActionCode) {
            $.quotaActionCode = quotaActionCode;
            return this;
        }

        public Builder quotaCategory(@Nullable String quotaCategory) {
            $.quotaCategory = quotaCategory;
            return this;
        }

        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetApplicationInfosPlainArgs build() {
            $.productCode = Objects.requireNonNull($.productCode, "expected parameter 'productCode' to be non-null");
            return $;
        }
    }

}
