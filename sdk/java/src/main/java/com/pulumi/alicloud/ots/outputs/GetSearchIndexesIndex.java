// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ots.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSearchIndexesIndex {
    /**
     * @return The creation time of the index.
     * 
     */
    private Integer createTime;
    /**
     * @return Timestamp for sync phase.
     * 
     */
    private Integer currentSyncTimestamp;
    /**
     * @return The resource ID. The value is `&lt;instance_name&gt;:&lt;table_name&gt;:&lt;indexName&gt;:&lt;indexType&gt;`.
     * 
     */
    private String id;
    /**
     * @return The index name of the OTS Table which could not be changed.
     * 
     */
    private String indexName;
    /**
     * @return The name of OTS instance.
     * 
     */
    private String instanceName;
    /**
     * @return Last update time for metering data..
     * 
     */
    private Integer meteringLastUpdateTime;
    /**
     * @return Reserve related resources for the index.
     * 
     */
    private Integer reservedReadCu;
    /**
     * @return The number of rows of data for index.
     * 
     */
    private Integer rowCount;
    /**
     * @return JSON representation of the schema of index.
     * 
     */
    private String schema;
    /**
     * @return Storage space occupied by index.
     * 
     */
    private Integer storageSize;
    /**
     * @return The synchronization state of the index.
     * 
     */
    private String syncPhase;
    /**
     * @return The name of OTS table.
     * 
     */
    private String tableName;
    /**
     * @return TTL of index.
     * 
     */
    private Integer timeToLive;

    private GetSearchIndexesIndex() {}
    /**
     * @return The creation time of the index.
     * 
     */
    public Integer createTime() {
        return this.createTime;
    }
    /**
     * @return Timestamp for sync phase.
     * 
     */
    public Integer currentSyncTimestamp() {
        return this.currentSyncTimestamp;
    }
    /**
     * @return The resource ID. The value is `&lt;instance_name&gt;:&lt;table_name&gt;:&lt;indexName&gt;:&lt;indexType&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The index name of the OTS Table which could not be changed.
     * 
     */
    public String indexName() {
        return this.indexName;
    }
    /**
     * @return The name of OTS instance.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return Last update time for metering data..
     * 
     */
    public Integer meteringLastUpdateTime() {
        return this.meteringLastUpdateTime;
    }
    /**
     * @return Reserve related resources for the index.
     * 
     */
    public Integer reservedReadCu() {
        return this.reservedReadCu;
    }
    /**
     * @return The number of rows of data for index.
     * 
     */
    public Integer rowCount() {
        return this.rowCount;
    }
    /**
     * @return JSON representation of the schema of index.
     * 
     */
    public String schema() {
        return this.schema;
    }
    /**
     * @return Storage space occupied by index.
     * 
     */
    public Integer storageSize() {
        return this.storageSize;
    }
    /**
     * @return The synchronization state of the index.
     * 
     */
    public String syncPhase() {
        return this.syncPhase;
    }
    /**
     * @return The name of OTS table.
     * 
     */
    public String tableName() {
        return this.tableName;
    }
    /**
     * @return TTL of index.
     * 
     */
    public Integer timeToLive() {
        return this.timeToLive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSearchIndexesIndex defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer createTime;
        private Integer currentSyncTimestamp;
        private String id;
        private String indexName;
        private String instanceName;
        private Integer meteringLastUpdateTime;
        private Integer reservedReadCu;
        private Integer rowCount;
        private String schema;
        private Integer storageSize;
        private String syncPhase;
        private String tableName;
        private Integer timeToLive;
        public Builder() {}
        public Builder(GetSearchIndexesIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.currentSyncTimestamp = defaults.currentSyncTimestamp;
    	      this.id = defaults.id;
    	      this.indexName = defaults.indexName;
    	      this.instanceName = defaults.instanceName;
    	      this.meteringLastUpdateTime = defaults.meteringLastUpdateTime;
    	      this.reservedReadCu = defaults.reservedReadCu;
    	      this.rowCount = defaults.rowCount;
    	      this.schema = defaults.schema;
    	      this.storageSize = defaults.storageSize;
    	      this.syncPhase = defaults.syncPhase;
    	      this.tableName = defaults.tableName;
    	      this.timeToLive = defaults.timeToLive;
        }

        @CustomType.Setter
        public Builder createTime(Integer createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder currentSyncTimestamp(Integer currentSyncTimestamp) {
            this.currentSyncTimestamp = Objects.requireNonNull(currentSyncTimestamp);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder indexName(String indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        @CustomType.Setter
        public Builder meteringLastUpdateTime(Integer meteringLastUpdateTime) {
            this.meteringLastUpdateTime = Objects.requireNonNull(meteringLastUpdateTime);
            return this;
        }
        @CustomType.Setter
        public Builder reservedReadCu(Integer reservedReadCu) {
            this.reservedReadCu = Objects.requireNonNull(reservedReadCu);
            return this;
        }
        @CustomType.Setter
        public Builder rowCount(Integer rowCount) {
            this.rowCount = Objects.requireNonNull(rowCount);
            return this;
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        @CustomType.Setter
        public Builder storageSize(Integer storageSize) {
            this.storageSize = Objects.requireNonNull(storageSize);
            return this;
        }
        @CustomType.Setter
        public Builder syncPhase(String syncPhase) {
            this.syncPhase = Objects.requireNonNull(syncPhase);
            return this;
        }
        @CustomType.Setter
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        @CustomType.Setter
        public Builder timeToLive(Integer timeToLive) {
            this.timeToLive = Objects.requireNonNull(timeToLive);
            return this;
        }
        public GetSearchIndexesIndex build() {
            final var _resultValue = new GetSearchIndexesIndex();
            _resultValue.createTime = createTime;
            _resultValue.currentSyncTimestamp = currentSyncTimestamp;
            _resultValue.id = id;
            _resultValue.indexName = indexName;
            _resultValue.instanceName = instanceName;
            _resultValue.meteringLastUpdateTime = meteringLastUpdateTime;
            _resultValue.reservedReadCu = reservedReadCu;
            _resultValue.rowCount = rowCount;
            _resultValue.schema = schema;
            _resultValue.storageSize = storageSize;
            _resultValue.syncPhase = syncPhase;
            _resultValue.tableName = tableName;
            _resultValue.timeToLive = timeToLive;
            return _resultValue;
        }
    }
}
