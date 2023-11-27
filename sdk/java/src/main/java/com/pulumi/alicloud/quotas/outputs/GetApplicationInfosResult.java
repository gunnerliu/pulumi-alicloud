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
    private List<GetApplicationInfosApplication> applications;
    private @Nullable List<GetApplicationInfosDimension> dimensions;
    private @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String keyWord;
    private @Nullable String outputFile;
    private String productCode;
    private @Nullable String quotaActionCode;
    private @Nullable String quotaCategory;
    private @Nullable String status;

    private GetApplicationInfosResult() {}
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
    @CustomType.Builder
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
        public Builder() {}
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

        @CustomType.Setter
        public Builder applications(List<GetApplicationInfosApplication> applications) {
            this.applications = Objects.requireNonNull(applications);
            return this;
        }
        public Builder applications(GetApplicationInfosApplication... applications) {
            return applications(List.of(applications));
        }
        @CustomType.Setter
        public Builder dimensions(@Nullable List<GetApplicationInfosDimension> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(GetApplicationInfosDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        @CustomType.Setter
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder keyWord(@Nullable String keyWord) {
            this.keyWord = keyWord;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder productCode(String productCode) {
            this.productCode = Objects.requireNonNull(productCode);
            return this;
        }
        @CustomType.Setter
        public Builder quotaActionCode(@Nullable String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        @CustomType.Setter
        public Builder quotaCategory(@Nullable String quotaCategory) {
            this.quotaCategory = quotaCategory;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public GetApplicationInfosResult build() {
            final var _resultValue = new GetApplicationInfosResult();
            _resultValue.applications = applications;
            _resultValue.dimensions = dimensions;
            _resultValue.enableDetails = enableDetails;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.keyWord = keyWord;
            _resultValue.outputFile = outputFile;
            _resultValue.productCode = productCode;
            _resultValue.quotaActionCode = quotaActionCode;
            _resultValue.quotaCategory = quotaCategory;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
