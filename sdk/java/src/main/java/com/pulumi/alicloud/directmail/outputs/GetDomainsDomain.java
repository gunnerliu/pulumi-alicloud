// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.directmail.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainsDomain {
    /**
     * @return Track verification.
     * 
     */
    private String cnameAuthStatus;
    /**
     * @return Indicates whether the CNAME record is successfully verified. Valid values: `0` and `1`. `0`: indicates the verification is successful. `1`: indicates that the verification fails.
     * 
     */
    private String cnameConfirmStatus;
    /**
     * @return The value of the CNAME record.
     * 
     */
    private String cnameRecord;
    /**
     * @return The time when the DNS record was created.
     * 
     */
    private String createTime;
    /**
     * @return The default domain name.
     * 
     */
    private String defaultDomain;
    /**
     * @return The value of the MX record.
     * 
     */
    private String dnsMx;
    /**
     * @return The value of the SPF record.
     * 
     */
    private String dnsSpf;
    /**
     * @return The value of the TXT ownership record.
     * 
     */
    private String dnsTxt;
    /**
     * @return The ID of the domain name.
     * 
     */
    private String domainId;
    /**
     * @return The domain name.
     * 
     */
    private String domainName;
    /**
     * @return The type of the domain.
     * 
     */
    private String domainType;
    /**
     * @return The status of ICP filing. Valid values: `0` and `1`. `0`: indicates that the domain name is not filed. `1`: indicates that the domain name is filed.
     * 
     */
    private String icpStatus;
    /**
     * @return The ID of the Domain.
     * 
     */
    private String id;
    /**
     * @return Indicates whether the MX record is successfully verified. Valid values: `0` and `1`. `0`: indicates the verification is successful. `1`: indicates that the verification fails.
     * 
     */
    private String mxAuthStatus;
    /**
     * @return The MX verification record provided by Alibaba Cloud DNS.
     * 
     */
    private String mxRecord;
    /**
     * @return Indicates whether the SPF record is successfully verified. Valid values: `0` and `1`. `0`: indicates the verification is successful. `1`: indicates that the verification fails.
     * 
     */
    private String spfAuthStatus;
    /**
     * @return The SPF verification record provided by Alibaba Cloud DNS.
     * 
     */
    private String spfRecord;
    /**
     * @return The status of the domain name. Valid values:`0` to `4`. `0`:Available, Passed. `1`: Unavailable, No passed. `2`: Available, cname no passed, icp no passed. `3`: Available, icp no passed. `4`: Available, cname no passed.
     * 
     */
    private String status;
    /**
     * @return The primary domain name.
     * 
     */
    private String tlDomainName;
    /**
     * @return The CNAME verification record provided by Alibaba Cloud DNS.
     * 
     */
    private String tracefRecord;

    private GetDomainsDomain() {}
    /**
     * @return Track verification.
     * 
     */
    public String cnameAuthStatus() {
        return this.cnameAuthStatus;
    }
    /**
     * @return Indicates whether the CNAME record is successfully verified. Valid values: `0` and `1`. `0`: indicates the verification is successful. `1`: indicates that the verification fails.
     * 
     */
    public String cnameConfirmStatus() {
        return this.cnameConfirmStatus;
    }
    /**
     * @return The value of the CNAME record.
     * 
     */
    public String cnameRecord() {
        return this.cnameRecord;
    }
    /**
     * @return The time when the DNS record was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The default domain name.
     * 
     */
    public String defaultDomain() {
        return this.defaultDomain;
    }
    /**
     * @return The value of the MX record.
     * 
     */
    public String dnsMx() {
        return this.dnsMx;
    }
    /**
     * @return The value of the SPF record.
     * 
     */
    public String dnsSpf() {
        return this.dnsSpf;
    }
    /**
     * @return The value of the TXT ownership record.
     * 
     */
    public String dnsTxt() {
        return this.dnsTxt;
    }
    /**
     * @return The ID of the domain name.
     * 
     */
    public String domainId() {
        return this.domainId;
    }
    /**
     * @return The domain name.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return The type of the domain.
     * 
     */
    public String domainType() {
        return this.domainType;
    }
    /**
     * @return The status of ICP filing. Valid values: `0` and `1`. `0`: indicates that the domain name is not filed. `1`: indicates that the domain name is filed.
     * 
     */
    public String icpStatus() {
        return this.icpStatus;
    }
    /**
     * @return The ID of the Domain.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates whether the MX record is successfully verified. Valid values: `0` and `1`. `0`: indicates the verification is successful. `1`: indicates that the verification fails.
     * 
     */
    public String mxAuthStatus() {
        return this.mxAuthStatus;
    }
    /**
     * @return The MX verification record provided by Alibaba Cloud DNS.
     * 
     */
    public String mxRecord() {
        return this.mxRecord;
    }
    /**
     * @return Indicates whether the SPF record is successfully verified. Valid values: `0` and `1`. `0`: indicates the verification is successful. `1`: indicates that the verification fails.
     * 
     */
    public String spfAuthStatus() {
        return this.spfAuthStatus;
    }
    /**
     * @return The SPF verification record provided by Alibaba Cloud DNS.
     * 
     */
    public String spfRecord() {
        return this.spfRecord;
    }
    /**
     * @return The status of the domain name. Valid values:`0` to `4`. `0`:Available, Passed. `1`: Unavailable, No passed. `2`: Available, cname no passed, icp no passed. `3`: Available, icp no passed. `4`: Available, cname no passed.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The primary domain name.
     * 
     */
    public String tlDomainName() {
        return this.tlDomainName;
    }
    /**
     * @return The CNAME verification record provided by Alibaba Cloud DNS.
     * 
     */
    public String tracefRecord() {
        return this.tracefRecord;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainsDomain defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cnameAuthStatus;
        private String cnameConfirmStatus;
        private String cnameRecord;
        private String createTime;
        private String defaultDomain;
        private String dnsMx;
        private String dnsSpf;
        private String dnsTxt;
        private String domainId;
        private String domainName;
        private String domainType;
        private String icpStatus;
        private String id;
        private String mxAuthStatus;
        private String mxRecord;
        private String spfAuthStatus;
        private String spfRecord;
        private String status;
        private String tlDomainName;
        private String tracefRecord;
        public Builder() {}
        public Builder(GetDomainsDomain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cnameAuthStatus = defaults.cnameAuthStatus;
    	      this.cnameConfirmStatus = defaults.cnameConfirmStatus;
    	      this.cnameRecord = defaults.cnameRecord;
    	      this.createTime = defaults.createTime;
    	      this.defaultDomain = defaults.defaultDomain;
    	      this.dnsMx = defaults.dnsMx;
    	      this.dnsSpf = defaults.dnsSpf;
    	      this.dnsTxt = defaults.dnsTxt;
    	      this.domainId = defaults.domainId;
    	      this.domainName = defaults.domainName;
    	      this.domainType = defaults.domainType;
    	      this.icpStatus = defaults.icpStatus;
    	      this.id = defaults.id;
    	      this.mxAuthStatus = defaults.mxAuthStatus;
    	      this.mxRecord = defaults.mxRecord;
    	      this.spfAuthStatus = defaults.spfAuthStatus;
    	      this.spfRecord = defaults.spfRecord;
    	      this.status = defaults.status;
    	      this.tlDomainName = defaults.tlDomainName;
    	      this.tracefRecord = defaults.tracefRecord;
        }

        @CustomType.Setter
        public Builder cnameAuthStatus(String cnameAuthStatus) {
            this.cnameAuthStatus = Objects.requireNonNull(cnameAuthStatus);
            return this;
        }
        @CustomType.Setter
        public Builder cnameConfirmStatus(String cnameConfirmStatus) {
            this.cnameConfirmStatus = Objects.requireNonNull(cnameConfirmStatus);
            return this;
        }
        @CustomType.Setter
        public Builder cnameRecord(String cnameRecord) {
            this.cnameRecord = Objects.requireNonNull(cnameRecord);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder defaultDomain(String defaultDomain) {
            this.defaultDomain = Objects.requireNonNull(defaultDomain);
            return this;
        }
        @CustomType.Setter
        public Builder dnsMx(String dnsMx) {
            this.dnsMx = Objects.requireNonNull(dnsMx);
            return this;
        }
        @CustomType.Setter
        public Builder dnsSpf(String dnsSpf) {
            this.dnsSpf = Objects.requireNonNull(dnsSpf);
            return this;
        }
        @CustomType.Setter
        public Builder dnsTxt(String dnsTxt) {
            this.dnsTxt = Objects.requireNonNull(dnsTxt);
            return this;
        }
        @CustomType.Setter
        public Builder domainId(String domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }
        @CustomType.Setter
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        @CustomType.Setter
        public Builder domainType(String domainType) {
            this.domainType = Objects.requireNonNull(domainType);
            return this;
        }
        @CustomType.Setter
        public Builder icpStatus(String icpStatus) {
            this.icpStatus = Objects.requireNonNull(icpStatus);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder mxAuthStatus(String mxAuthStatus) {
            this.mxAuthStatus = Objects.requireNonNull(mxAuthStatus);
            return this;
        }
        @CustomType.Setter
        public Builder mxRecord(String mxRecord) {
            this.mxRecord = Objects.requireNonNull(mxRecord);
            return this;
        }
        @CustomType.Setter
        public Builder spfAuthStatus(String spfAuthStatus) {
            this.spfAuthStatus = Objects.requireNonNull(spfAuthStatus);
            return this;
        }
        @CustomType.Setter
        public Builder spfRecord(String spfRecord) {
            this.spfRecord = Objects.requireNonNull(spfRecord);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tlDomainName(String tlDomainName) {
            this.tlDomainName = Objects.requireNonNull(tlDomainName);
            return this;
        }
        @CustomType.Setter
        public Builder tracefRecord(String tracefRecord) {
            this.tracefRecord = Objects.requireNonNull(tracefRecord);
            return this;
        }
        public GetDomainsDomain build() {
            final var _resultValue = new GetDomainsDomain();
            _resultValue.cnameAuthStatus = cnameAuthStatus;
            _resultValue.cnameConfirmStatus = cnameConfirmStatus;
            _resultValue.cnameRecord = cnameRecord;
            _resultValue.createTime = createTime;
            _resultValue.defaultDomain = defaultDomain;
            _resultValue.dnsMx = dnsMx;
            _resultValue.dnsSpf = dnsSpf;
            _resultValue.dnsTxt = dnsTxt;
            _resultValue.domainId = domainId;
            _resultValue.domainName = domainName;
            _resultValue.domainType = domainType;
            _resultValue.icpStatus = icpStatus;
            _resultValue.id = id;
            _resultValue.mxAuthStatus = mxAuthStatus;
            _resultValue.mxRecord = mxRecord;
            _resultValue.spfAuthStatus = spfAuthStatus;
            _resultValue.spfRecord = spfRecord;
            _resultValue.status = status;
            _resultValue.tlDomainName = tlDomainName;
            _resultValue.tracefRecord = tracefRecord;
            return _resultValue;
        }
    }
}
