// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRecordsRecord {
    /**
     * @return The domain name associated to the records.
     * 
     */
    private String domainName;
    /**
     * @return Host record of the domain.
     * 
     */
    private String hostRecord;
    /**
     * @return ISP line. Valid items are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm)
     * 
     */
    private String line;
    /**
     * @return Indicates whether the record is locked.
     * 
     */
    private Boolean locked;
    /**
     * @return Priority of the `MX` record.
     * 
     */
    private Integer priority;
    /**
     * @return ID of the record.
     * 
     */
    private String recordId;
    /**
     * @return Record status. Valid items are `ENABLE` and `DISABLE`.
     * 
     */
    private String status;
    /**
     * @return TTL of the record.
     * 
     */
    private Double ttl;
    /**
     * @return Record type. Valid items are `A`, `NS`, `MX`, `TXT`, `CNAME`, `SRV`, `AAAA`, `REDIRECT_URL`, `FORWORD_URL` .
     * 
     */
    private String type;
    /**
     * @return Host record value of the domain.
     * 
     */
    private String value;

    private GetRecordsRecord() {}
    /**
     * @return The domain name associated to the records.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return Host record of the domain.
     * 
     */
    public String hostRecord() {
        return this.hostRecord;
    }
    /**
     * @return ISP line. Valid items are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm)
     * 
     */
    public String line() {
        return this.line;
    }
    /**
     * @return Indicates whether the record is locked.
     * 
     */
    public Boolean locked() {
        return this.locked;
    }
    /**
     * @return Priority of the `MX` record.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return ID of the record.
     * 
     */
    public String recordId() {
        return this.recordId;
    }
    /**
     * @return Record status. Valid items are `ENABLE` and `DISABLE`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return TTL of the record.
     * 
     */
    public Double ttl() {
        return this.ttl;
    }
    /**
     * @return Record type. Valid items are `A`, `NS`, `MX`, `TXT`, `CNAME`, `SRV`, `AAAA`, `REDIRECT_URL`, `FORWORD_URL` .
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Host record value of the domain.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRecordsRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String domainName;
        private String hostRecord;
        private String line;
        private Boolean locked;
        private Integer priority;
        private String recordId;
        private String status;
        private Double ttl;
        private String type;
        private String value;
        public Builder() {}
        public Builder(GetRecordsRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.hostRecord = defaults.hostRecord;
    	      this.line = defaults.line;
    	      this.locked = defaults.locked;
    	      this.priority = defaults.priority;
    	      this.recordId = defaults.recordId;
    	      this.status = defaults.status;
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        @CustomType.Setter
        public Builder hostRecord(String hostRecord) {
            this.hostRecord = Objects.requireNonNull(hostRecord);
            return this;
        }
        @CustomType.Setter
        public Builder line(String line) {
            this.line = Objects.requireNonNull(line);
            return this;
        }
        @CustomType.Setter
        public Builder locked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder recordId(String recordId) {
            this.recordId = Objects.requireNonNull(recordId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder ttl(Double ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetRecordsRecord build() {
            final var o = new GetRecordsRecord();
            o.domainName = domainName;
            o.hostRecord = hostRecord;
            o.line = line;
            o.locked = locked;
            o.priority = priority;
            o.recordId = recordId;
            o.status = status;
            o.ttl = ttl;
            o.type = type;
            o.value = value;
            return o;
        }
    }
}