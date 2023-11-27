// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.quotas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetQuotasQuota {
    /**
     * @return Is the quota adjustable.
     * 
     */
    private Boolean adjustable;
    /**
     * @return The range of quota adjustment.
     * 
     */
    private List<String> applicableRanges;
    /**
     * @return The type of quota.
     * 
     */
    private String applicableType;
    /**
     * @return Show used quota.
     * 
     */
    private Boolean consumable;
    /**
     * @return The ID of the Quota.
     * 
     */
    private String id;
    /**
     * @return The quota action code.
     * 
     */
    private String quotaActionCode;
    /**
     * @return The quota description.
     * 
     */
    private String quotaDescription;
    /**
     * @return The quota name.
     * 
     */
    private String quotaName;
    /**
     * @return The quota type.
     * 
     */
    private String quotaType;
    /**
     * @return The quota unit.
     * 
     */
    private String quotaUnit;
    /**
     * @return TotalQuota.
     * 
     */
    private Double totalQuota;
    /**
     * @return The total of usage.
     * 
     */
    private Double totalUsage;
    /**
     * @return The unadjustable detail.
     * 
     */
    private String unadjustableDetail;

    private GetQuotasQuota() {}
    /**
     * @return Is the quota adjustable.
     * 
     */
    public Boolean adjustable() {
        return this.adjustable;
    }
    /**
     * @return The range of quota adjustment.
     * 
     */
    public List<String> applicableRanges() {
        return this.applicableRanges;
    }
    /**
     * @return The type of quota.
     * 
     */
    public String applicableType() {
        return this.applicableType;
    }
    /**
     * @return Show used quota.
     * 
     */
    public Boolean consumable() {
        return this.consumable;
    }
    /**
     * @return The ID of the Quota.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The quota action code.
     * 
     */
    public String quotaActionCode() {
        return this.quotaActionCode;
    }
    /**
     * @return The quota description.
     * 
     */
    public String quotaDescription() {
        return this.quotaDescription;
    }
    /**
     * @return The quota name.
     * 
     */
    public String quotaName() {
        return this.quotaName;
    }
    /**
     * @return The quota type.
     * 
     */
    public String quotaType() {
        return this.quotaType;
    }
    /**
     * @return The quota unit.
     * 
     */
    public String quotaUnit() {
        return this.quotaUnit;
    }
    /**
     * @return TotalQuota.
     * 
     */
    public Double totalQuota() {
        return this.totalQuota;
    }
    /**
     * @return The total of usage.
     * 
     */
    public Double totalUsage() {
        return this.totalUsage;
    }
    /**
     * @return The unadjustable detail.
     * 
     */
    public String unadjustableDetail() {
        return this.unadjustableDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuotasQuota defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean adjustable;
        private List<String> applicableRanges;
        private String applicableType;
        private Boolean consumable;
        private String id;
        private String quotaActionCode;
        private String quotaDescription;
        private String quotaName;
        private String quotaType;
        private String quotaUnit;
        private Double totalQuota;
        private Double totalUsage;
        private String unadjustableDetail;
        public Builder() {}
        public Builder(GetQuotasQuota defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adjustable = defaults.adjustable;
    	      this.applicableRanges = defaults.applicableRanges;
    	      this.applicableType = defaults.applicableType;
    	      this.consumable = defaults.consumable;
    	      this.id = defaults.id;
    	      this.quotaActionCode = defaults.quotaActionCode;
    	      this.quotaDescription = defaults.quotaDescription;
    	      this.quotaName = defaults.quotaName;
    	      this.quotaType = defaults.quotaType;
    	      this.quotaUnit = defaults.quotaUnit;
    	      this.totalQuota = defaults.totalQuota;
    	      this.totalUsage = defaults.totalUsage;
    	      this.unadjustableDetail = defaults.unadjustableDetail;
        }

        @CustomType.Setter
        public Builder adjustable(Boolean adjustable) {
            this.adjustable = Objects.requireNonNull(adjustable);
            return this;
        }
        @CustomType.Setter
        public Builder applicableRanges(List<String> applicableRanges) {
            this.applicableRanges = Objects.requireNonNull(applicableRanges);
            return this;
        }
        public Builder applicableRanges(String... applicableRanges) {
            return applicableRanges(List.of(applicableRanges));
        }
        @CustomType.Setter
        public Builder applicableType(String applicableType) {
            this.applicableType = Objects.requireNonNull(applicableType);
            return this;
        }
        @CustomType.Setter
        public Builder consumable(Boolean consumable) {
            this.consumable = Objects.requireNonNull(consumable);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder quotaActionCode(String quotaActionCode) {
            this.quotaActionCode = Objects.requireNonNull(quotaActionCode);
            return this;
        }
        @CustomType.Setter
        public Builder quotaDescription(String quotaDescription) {
            this.quotaDescription = Objects.requireNonNull(quotaDescription);
            return this;
        }
        @CustomType.Setter
        public Builder quotaName(String quotaName) {
            this.quotaName = Objects.requireNonNull(quotaName);
            return this;
        }
        @CustomType.Setter
        public Builder quotaType(String quotaType) {
            this.quotaType = Objects.requireNonNull(quotaType);
            return this;
        }
        @CustomType.Setter
        public Builder quotaUnit(String quotaUnit) {
            this.quotaUnit = Objects.requireNonNull(quotaUnit);
            return this;
        }
        @CustomType.Setter
        public Builder totalQuota(Double totalQuota) {
            this.totalQuota = Objects.requireNonNull(totalQuota);
            return this;
        }
        @CustomType.Setter
        public Builder totalUsage(Double totalUsage) {
            this.totalUsage = Objects.requireNonNull(totalUsage);
            return this;
        }
        @CustomType.Setter
        public Builder unadjustableDetail(String unadjustableDetail) {
            this.unadjustableDetail = Objects.requireNonNull(unadjustableDetail);
            return this;
        }
        public GetQuotasQuota build() {
            final var _resultValue = new GetQuotasQuota();
            _resultValue.adjustable = adjustable;
            _resultValue.applicableRanges = applicableRanges;
            _resultValue.applicableType = applicableType;
            _resultValue.consumable = consumable;
            _resultValue.id = id;
            _resultValue.quotaActionCode = quotaActionCode;
            _resultValue.quotaDescription = quotaDescription;
            _resultValue.quotaName = quotaName;
            _resultValue.quotaType = quotaType;
            _resultValue.quotaUnit = quotaUnit;
            _resultValue.totalQuota = totalQuota;
            _resultValue.totalUsage = totalUsage;
            _resultValue.unadjustableDetail = unadjustableDetail;
            return _resultValue;
        }
    }
}
