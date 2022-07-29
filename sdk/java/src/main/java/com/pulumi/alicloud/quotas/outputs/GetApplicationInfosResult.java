// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.quotas.outputs;

import com.pulumi.alicloud.quotas.outputs.GetApplicationInfosApplication;
import com.pulumi.alicloud.quotas.outputs.GetApplicationInfosDimension;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplicationInfosResult {
    private final List<GetApplicationInfosApplication> applications;
    private final @Nullable List<GetApplicationInfosDimension> dimensions;
    private final @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String keyWord;
    private final @Nullable String outputFile;
    private final String productCode;
    private final @Nullable String quotaActionCode;
    private final @Nullable String quotaCategory;
    private final @Nullable String status;

    @CustomType.Constructor
    private GetApplicationInfosResult(
        @CustomType.Parameter("applications") List<GetApplicationInfosApplication> applications,
        @CustomType.Parameter("dimensions") @Nullable List<GetApplicationInfosDimension> dimensions,
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("keyWord") @Nullable String keyWord,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("productCode") String productCode,
        @CustomType.Parameter("quotaActionCode") @Nullable String quotaActionCode,
        @CustomType.Parameter("quotaCategory") @Nullable String quotaCategory,
        @CustomType.Parameter("status") @Nullable String status) {
        this.applications = applications;
        this.dimensions = dimensions;
        this.enableDetails = enableDetails;
        this.id = id;
        this.ids = ids;
        this.keyWord = keyWord;
        this.outputFile = outputFile;
        this.productCode = productCode;
        this.quotaActionCode = quotaActionCode;
        this.quotaCategory = quotaCategory;
        this.status = status;
    }

    public List<GetApplicationInfosApplication> applications() {
        return this.applications;
    }
    public List<GetApplicationInfosDimension> dimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> keyWord() {
        return Optional.ofNullable(this.keyWord);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public String productCode() {
        return this.productCode;
    }
    public Optional<String> quotaActionCode() {
        return Optional.ofNullable(this.quotaActionCode);
    }
    public Optional<String> quotaCategory() {
        return Optional.ofNullable(this.quotaCategory);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationInfosResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetApplicationInfosApplication> applications;
        private @Nullable List<GetApplicationInfosDimension> dimensions;
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String keyWord;
        private @Nullable String outputFile;
        private String productCode;
        private @Nullable String quotaActionCode;
        private @Nullable String quotaCategory;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationInfosResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applications = defaults.applications;
    	      this.dimensions = defaults.dimensions;
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.keyWord = defaults.keyWord;
    	      this.outputFile = defaults.outputFile;
    	      this.productCode = defaults.productCode;
    	      this.quotaActionCode = defaults.quotaActionCode;
    	      this.quotaCategory = defaults.quotaCategory;
    	      this.status = defaults.status;
        }

        public Builder applications(List<GetApplicationInfosApplication> applications) {
            this.applications = Objects.requireNonNull(applications);
            return this;
        }
        public Builder applications(GetApplicationInfosApplication... applications) {
            return applications(List.of(applications));
        }
        public Builder dimensions(@Nullable List<GetApplicationInfosDimension> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(GetApplicationInfosDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder keyWord(@Nullable String keyWord) {
            this.keyWord = keyWord;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder productCode(String productCode) {
            this.productCode = Objects.requireNonNull(productCode);
            return this;
        }
        public Builder quotaActionCode(@Nullable String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public Builder quotaCategory(@Nullable String quotaCategory) {
            this.quotaCategory = quotaCategory;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetApplicationInfosResult build() {
            return new GetApplicationInfosResult(applications, dimensions, enableDetails, id, ids, keyWord, outputFile, productCode, quotaActionCode, quotaCategory, status);
        }
    }
}
