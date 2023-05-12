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
    private final String domainName;
    /**
     * @return Host record of the domain.
     * 
     */
    private final String hostRecord;
    /**
     * @return ISP line. Valid items are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm)
     * 
     */
    private final String line;
    /**
     * @return Indicates whether the record is locked.
     * 
     */
    private final Boolean locked;
    /**
     * @return Priority of the `MX` record.
     * 
     */
    private final Integer priority;
    /**
     * @return ID of the record.
     * 
     */
    private final String recordId;
    /**
     * @return Record status. Valid items are `ENABLE` and `DISABLE`.
     * 
     */
    private final String status;
    /**
     * @return TTL of the record.
     * 
     */
    private final Double ttl;
    /**
     * @return Record type. Valid items are `A`, `NS`, `MX`, `TXT`, `CNAME`, `SRV`, `AAAA`, `REDIRECT_URL`, `FORWORD_URL` .
     * 
     */
    private final String type;
    /**
     * @return Host record value of the domain.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetRecordsRecord(
        @CustomType.Parameter("domainName") String domainName,
        @CustomType.Parameter("hostRecord") String hostRecord,
        @CustomType.Parameter("line") String line,
        @CustomType.Parameter("locked") Boolean locked,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("recordId") String recordId,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("ttl") Double ttl,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.domainName = domainName;
        this.hostRecord = hostRecord;
        this.line = line;
        this.locked = locked;
        this.priority = priority;
        this.recordId = recordId;
        this.status = status;
        this.ttl = ttl;
        this.type = type;
        this.value = value;
    }

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

        public Builder() {
    	      // Empty
        }

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

        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder hostRecord(String hostRecord) {
            this.hostRecord = Objects.requireNonNull(hostRecord);
            return this;
        }
        public Builder line(String line) {
            this.line = Objects.requireNonNull(line);
            return this;
        }
        public Builder locked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder recordId(String recordId) {
            this.recordId = Objects.requireNonNull(recordId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder ttl(Double ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetRecordsRecord build() {
            return new GetRecordsRecord(domainName, hostRecord, line, locked, priority, recordId, status, ttl, type, value);
        }
    }
}
