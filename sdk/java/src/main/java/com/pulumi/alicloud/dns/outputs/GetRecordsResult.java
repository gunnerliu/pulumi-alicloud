// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.alicloud.dns.outputs.GetRecordsRecord;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRecordsResult {
    /**
     * @return Name of the domain the record belongs to.
     * 
     */
    private final String domainName;
    private final @Nullable String hostRecordRegex;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of record IDs.
     * 
     */
    private final List<String> ids;
    private final @Nullable Boolean isLocked;
    /**
     * @return ISP line of the record.
     * 
     */
    private final @Nullable String line;
    private final @Nullable String outputFile;
    /**
     * @return A list of records. Each element contains the following attributes:
     * 
     */
    private final List<GetRecordsRecord> records;
    /**
     * @return Status of the record.
     * 
     */
    private final @Nullable String status;
    /**
     * @return Type of the record.
     * 
     */
    private final @Nullable String type;
    /**
     * @return A list of entire URLs. Each item format as `&lt;host_record&gt;.&lt;domain_name&gt;`.
     * 
     */
    private final List<String> urls;
    private final @Nullable String valueRegex;

    @CustomType.Constructor
    private GetRecordsResult(
        @CustomType.Parameter("domainName") String domainName,
        @CustomType.Parameter("hostRecordRegex") @Nullable String hostRecordRegex,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("isLocked") @Nullable Boolean isLocked,
        @CustomType.Parameter("line") @Nullable String line,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("records") List<GetRecordsRecord> records,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("urls") List<String> urls,
        @CustomType.Parameter("valueRegex") @Nullable String valueRegex) {
        this.domainName = domainName;
        this.hostRecordRegex = hostRecordRegex;
        this.id = id;
        this.ids = ids;
        this.isLocked = isLocked;
        this.line = line;
        this.outputFile = outputFile;
        this.records = records;
        this.status = status;
        this.type = type;
        this.urls = urls;
        this.valueRegex = valueRegex;
    }

    /**
     * @return Name of the domain the record belongs to.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    public Optional<String> hostRecordRegex() {
        return Optional.ofNullable(this.hostRecordRegex);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of record IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<Boolean> isLocked() {
        return Optional.ofNullable(this.isLocked);
    }
    /**
     * @return ISP line of the record.
     * 
     */
    public Optional<String> line() {
        return Optional.ofNullable(this.line);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of records. Each element contains the following attributes:
     * 
     */
    public List<GetRecordsRecord> records() {
        return this.records;
    }
    /**
     * @return Status of the record.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Type of the record.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return A list of entire URLs. Each item format as `&lt;host_record&gt;.&lt;domain_name&gt;`.
     * 
     */
    public List<String> urls() {
        return this.urls;
    }
    public Optional<String> valueRegex() {
        return Optional.ofNullable(this.valueRegex);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRecordsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainName;
        private @Nullable String hostRecordRegex;
        private String id;
        private List<String> ids;
        private @Nullable Boolean isLocked;
        private @Nullable String line;
        private @Nullable String outputFile;
        private List<GetRecordsRecord> records;
        private @Nullable String status;
        private @Nullable String type;
        private List<String> urls;
        private @Nullable String valueRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRecordsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.hostRecordRegex = defaults.hostRecordRegex;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.isLocked = defaults.isLocked;
    	      this.line = defaults.line;
    	      this.outputFile = defaults.outputFile;
    	      this.records = defaults.records;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.urls = defaults.urls;
    	      this.valueRegex = defaults.valueRegex;
        }

        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder hostRecordRegex(@Nullable String hostRecordRegex) {
            this.hostRecordRegex = hostRecordRegex;
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
        public Builder isLocked(@Nullable Boolean isLocked) {
            this.isLocked = isLocked;
            return this;
        }
        public Builder line(@Nullable String line) {
            this.line = line;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder records(List<GetRecordsRecord> records) {
            this.records = Objects.requireNonNull(records);
            return this;
        }
        public Builder records(GetRecordsRecord... records) {
            return records(List.of(records));
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder urls(List<String> urls) {
            this.urls = Objects.requireNonNull(urls);
            return this;
        }
        public Builder urls(String... urls) {
            return urls(List.of(urls));
        }
        public Builder valueRegex(@Nullable String valueRegex) {
            this.valueRegex = valueRegex;
            return this;
        }        public GetRecordsResult build() {
            return new GetRecordsResult(domainName, hostRecordRegex, id, ids, isLocked, line, outputFile, records, status, type, urls, valueRegex);
        }
    }
}
