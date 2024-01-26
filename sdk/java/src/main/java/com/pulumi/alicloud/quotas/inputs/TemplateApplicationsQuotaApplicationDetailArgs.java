// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.quotas.inputs;

import com.pulumi.alicloud.quotas.inputs.TemplateApplicationsQuotaApplicationDetailPeriodArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemplateApplicationsQuotaApplicationDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final TemplateApplicationsQuotaApplicationDetailArgs Empty = new TemplateApplicationsQuotaApplicationDetailArgs();

    /**
     * Alibaba Cloud account (primary account).
     * 
     */
    @Import(name="aliyunUid")
    private @Nullable Output<String> aliyunUid;

    /**
     * @return Alibaba Cloud account (primary account).
     * 
     */
    public Optional<Output<String>> aliyunUid() {
        return Optional.ofNullable(this.aliyunUid);
    }

    /**
     * The ID of the quota promotion request.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return The ID of the quota promotion request.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * The approved quota value of the quota increase request.
     * 
     */
    @Import(name="approveValue")
    private @Nullable Output<Double> approveValue;

    /**
     * @return The approved quota value of the quota increase request.
     * 
     */
    public Optional<Output<Double>> approveValue() {
        return Optional.ofNullable(this.approveValue);
    }

    /**
     * Approval comments on quota increase applications.
     * 
     */
    @Import(name="auditReason")
    private @Nullable Output<String> auditReason;

    /**
     * @return Approval comments on quota increase applications.
     * 
     */
    public Optional<Output<String>> auditReason() {
        return Optional.ofNullable(this.auditReason);
    }

    /**
     * Quota dimension. See `dimensions` below.
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<Map<String,Object>> dimensions;

    /**
     * @return Quota dimension. See `dimensions` below.
     * 
     */
    public Optional<Output<Map<String,Object>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * The language of the quota application result notification. Value:
     * - zh (default): Chinese.
     * - en: English.
     * 
     */
    @Import(name="envLanguage")
    private @Nullable Output<String> envLanguage;

    /**
     * @return The language of the quota application result notification. Value:
     * - zh (default): Chinese.
     * - en: English.
     * 
     */
    public Optional<Output<String>> envLanguage() {
        return Optional.ofNullable(this.envLanguage);
    }

    /**
     * Whether to send notification of quota application result. Value:
     * - 0 (default): No.
     * - 3: Yes.
     * 
     */
    @Import(name="noticeType")
    private @Nullable Output<Integer> noticeType;

    /**
     * @return Whether to send notification of quota application result. Value:
     * - 0 (default): No.
     * - 3: Yes.
     * 
     */
    public Optional<Output<Integer>> noticeType() {
        return Optional.ofNullable(this.noticeType);
    }

    /**
     * Quota calculation period.
     * 
     */
    @Import(name="period")
    private @Nullable Output<TemplateApplicationsQuotaApplicationDetailPeriodArgs> period;

    /**
     * @return Quota calculation period.
     * 
     */
    public Optional<Output<TemplateApplicationsQuotaApplicationDetailPeriodArgs>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * Quota ARN.
     * 
     */
    @Import(name="quotaArn")
    private @Nullable Output<String> quotaArn;

    /**
     * @return Quota ARN.
     * 
     */
    public Optional<Output<String>> quotaArn() {
        return Optional.ofNullable(this.quotaArn);
    }

    /**
     * The quota description.
     * 
     */
    @Import(name="quotaDescription")
    private @Nullable Output<String> quotaDescription;

    /**
     * @return The quota description.
     * 
     */
    public Optional<Output<String>> quotaDescription() {
        return Optional.ofNullable(this.quotaDescription);
    }

    /**
     * The quota name.
     * 
     */
    @Import(name="quotaName")
    private @Nullable Output<String> quotaName;

    /**
     * @return The quota name.
     * 
     */
    public Optional<Output<String>> quotaName() {
        return Optional.ofNullable(this.quotaName);
    }

    /**
     * Quota unit.
     * 
     */
    @Import(name="quotaUnit")
    private @Nullable Output<String> quotaUnit;

    /**
     * @return Quota unit.
     * 
     */
    public Optional<Output<String>> quotaUnit() {
        return Optional.ofNullable(this.quotaUnit);
    }

    /**
     * Reason for quota application.
     * &gt; **NOTE:**  The quota request is approved by the technical support of each cloud service. If you want to increase the chance of passing, please fill in a reasonable application value and detailed application reasons when applying for quota.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return Reason for quota application.
     * &gt; **NOTE:**  The quota request is approved by the technical support of each cloud service. If you want to increase the chance of passing, please fill in a reasonable application value and detailed application reasons when applying for quota.
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    /**
     * The approval status of the quota promotion application. Value:
     * - Disagree: reject.
     * - Approve: approved.
     * - Process: under review.
     * - Cancel: Closed.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The approval status of the quota promotion application. Value:
     * - Disagree: reject.
     * - Approve: approved.
     * - Process: under review.
     * - Cancel: Closed.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private TemplateApplicationsQuotaApplicationDetailArgs() {}

    private TemplateApplicationsQuotaApplicationDetailArgs(TemplateApplicationsQuotaApplicationDetailArgs $) {
        this.aliyunUid = $.aliyunUid;
        this.applicationId = $.applicationId;
        this.approveValue = $.approveValue;
        this.auditReason = $.auditReason;
        this.dimensions = $.dimensions;
        this.envLanguage = $.envLanguage;
        this.noticeType = $.noticeType;
        this.period = $.period;
        this.quotaArn = $.quotaArn;
        this.quotaDescription = $.quotaDescription;
        this.quotaName = $.quotaName;
        this.quotaUnit = $.quotaUnit;
        this.reason = $.reason;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateApplicationsQuotaApplicationDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateApplicationsQuotaApplicationDetailArgs $;

        public Builder() {
            $ = new TemplateApplicationsQuotaApplicationDetailArgs();
        }

        public Builder(TemplateApplicationsQuotaApplicationDetailArgs defaults) {
            $ = new TemplateApplicationsQuotaApplicationDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliyunUid Alibaba Cloud account (primary account).
         * 
         * @return builder
         * 
         */
        public Builder aliyunUid(@Nullable Output<String> aliyunUid) {
            $.aliyunUid = aliyunUid;
            return this;
        }

        /**
         * @param aliyunUid Alibaba Cloud account (primary account).
         * 
         * @return builder
         * 
         */
        public Builder aliyunUid(String aliyunUid) {
            return aliyunUid(Output.of(aliyunUid));
        }

        /**
         * @param applicationId The ID of the quota promotion request.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The ID of the quota promotion request.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param approveValue The approved quota value of the quota increase request.
         * 
         * @return builder
         * 
         */
        public Builder approveValue(@Nullable Output<Double> approveValue) {
            $.approveValue = approveValue;
            return this;
        }

        /**
         * @param approveValue The approved quota value of the quota increase request.
         * 
         * @return builder
         * 
         */
        public Builder approveValue(Double approveValue) {
            return approveValue(Output.of(approveValue));
        }

        /**
         * @param auditReason Approval comments on quota increase applications.
         * 
         * @return builder
         * 
         */
        public Builder auditReason(@Nullable Output<String> auditReason) {
            $.auditReason = auditReason;
            return this;
        }

        /**
         * @param auditReason Approval comments on quota increase applications.
         * 
         * @return builder
         * 
         */
        public Builder auditReason(String auditReason) {
            return auditReason(Output.of(auditReason));
        }

        /**
         * @param dimensions Quota dimension. See `dimensions` below.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(@Nullable Output<Map<String,Object>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions Quota dimension. See `dimensions` below.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(Map<String,Object> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        /**
         * @param envLanguage The language of the quota application result notification. Value:
         * - zh (default): Chinese.
         * - en: English.
         * 
         * @return builder
         * 
         */
        public Builder envLanguage(@Nullable Output<String> envLanguage) {
            $.envLanguage = envLanguage;
            return this;
        }

        /**
         * @param envLanguage The language of the quota application result notification. Value:
         * - zh (default): Chinese.
         * - en: English.
         * 
         * @return builder
         * 
         */
        public Builder envLanguage(String envLanguage) {
            return envLanguage(Output.of(envLanguage));
        }

        /**
         * @param noticeType Whether to send notification of quota application result. Value:
         * - 0 (default): No.
         * - 3: Yes.
         * 
         * @return builder
         * 
         */
        public Builder noticeType(@Nullable Output<Integer> noticeType) {
            $.noticeType = noticeType;
            return this;
        }

        /**
         * @param noticeType Whether to send notification of quota application result. Value:
         * - 0 (default): No.
         * - 3: Yes.
         * 
         * @return builder
         * 
         */
        public Builder noticeType(Integer noticeType) {
            return noticeType(Output.of(noticeType));
        }

        /**
         * @param period Quota calculation period.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<TemplateApplicationsQuotaApplicationDetailPeriodArgs> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period Quota calculation period.
         * 
         * @return builder
         * 
         */
        public Builder period(TemplateApplicationsQuotaApplicationDetailPeriodArgs period) {
            return period(Output.of(period));
        }

        /**
         * @param quotaArn Quota ARN.
         * 
         * @return builder
         * 
         */
        public Builder quotaArn(@Nullable Output<String> quotaArn) {
            $.quotaArn = quotaArn;
            return this;
        }

        /**
         * @param quotaArn Quota ARN.
         * 
         * @return builder
         * 
         */
        public Builder quotaArn(String quotaArn) {
            return quotaArn(Output.of(quotaArn));
        }

        /**
         * @param quotaDescription The quota description.
         * 
         * @return builder
         * 
         */
        public Builder quotaDescription(@Nullable Output<String> quotaDescription) {
            $.quotaDescription = quotaDescription;
            return this;
        }

        /**
         * @param quotaDescription The quota description.
         * 
         * @return builder
         * 
         */
        public Builder quotaDescription(String quotaDescription) {
            return quotaDescription(Output.of(quotaDescription));
        }

        /**
         * @param quotaName The quota name.
         * 
         * @return builder
         * 
         */
        public Builder quotaName(@Nullable Output<String> quotaName) {
            $.quotaName = quotaName;
            return this;
        }

        /**
         * @param quotaName The quota name.
         * 
         * @return builder
         * 
         */
        public Builder quotaName(String quotaName) {
            return quotaName(Output.of(quotaName));
        }

        /**
         * @param quotaUnit Quota unit.
         * 
         * @return builder
         * 
         */
        public Builder quotaUnit(@Nullable Output<String> quotaUnit) {
            $.quotaUnit = quotaUnit;
            return this;
        }

        /**
         * @param quotaUnit Quota unit.
         * 
         * @return builder
         * 
         */
        public Builder quotaUnit(String quotaUnit) {
            return quotaUnit(Output.of(quotaUnit));
        }

        /**
         * @param reason Reason for quota application.
         * &gt; **NOTE:**  The quota request is approved by the technical support of each cloud service. If you want to increase the chance of passing, please fill in a reasonable application value and detailed application reasons when applying for quota.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason Reason for quota application.
         * &gt; **NOTE:**  The quota request is approved by the technical support of each cloud service. If you want to increase the chance of passing, please fill in a reasonable application value and detailed application reasons when applying for quota.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        /**
         * @param status The approval status of the quota promotion application. Value:
         * - Disagree: reject.
         * - Approve: approved.
         * - Process: under review.
         * - Cancel: Closed.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The approval status of the quota promotion application. Value:
         * - Disagree: reject.
         * - Approve: approved.
         * - Process: under review.
         * - Cancel: Closed.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public TemplateApplicationsQuotaApplicationDetailArgs build() {
            return $;
        }
    }

}