// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.outputs;

import com.pulumi.alicloud.rds.outputs.GetInstanceClassesInstanceClass;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceClassesResult {
    private @Nullable String category;
    private @Nullable String commodityCode;
    private @Nullable String dbInstanceClass;
    private @Nullable String dbInstanceId;
    private @Nullable String dbInstanceStorageType;
    private @Nullable String engine;
    private @Nullable String engineVersion;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Available in 1.60.0+) A list of Rds instance class codes.
     * 
     */
    private List<String> ids;
    private @Nullable String instanceChargeType;
    /**
     * @return A list of Rds available resource. Each element contains the following attributes:
     * 
     */
    private List<GetInstanceClassesInstanceClass> instanceClasses;
    private @Nullable Boolean multiZone;
    private @Nullable String outputFile;
    private @Nullable String sortedBy;
    private @Nullable String storageType;
    private @Nullable String zoneId;

    private GetInstanceClassesResult() {}
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    public Optional<String> commodityCode() {
        return Optional.ofNullable(this.commodityCode);
    }
    public Optional<String> dbInstanceClass() {
        return Optional.ofNullable(this.dbInstanceClass);
    }
    public Optional<String> dbInstanceId() {
        return Optional.ofNullable(this.dbInstanceId);
    }
    public Optional<String> dbInstanceStorageType() {
        return Optional.ofNullable(this.dbInstanceStorageType);
    }
    public Optional<String> engine() {
        return Optional.ofNullable(this.engine);
    }
    public Optional<String> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Available in 1.60.0+) A list of Rds instance class codes.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> instanceChargeType() {
        return Optional.ofNullable(this.instanceChargeType);
    }
    /**
     * @return A list of Rds available resource. Each element contains the following attributes:
     * 
     */
    public List<GetInstanceClassesInstanceClass> instanceClasses() {
        return this.instanceClasses;
    }
    public Optional<Boolean> multiZone() {
        return Optional.ofNullable(this.multiZone);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> sortedBy() {
        return Optional.ofNullable(this.sortedBy);
    }
    public Optional<String> storageType() {
        return Optional.ofNullable(this.storageType);
    }
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceClassesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String category;
        private @Nullable String commodityCode;
        private @Nullable String dbInstanceClass;
        private @Nullable String dbInstanceId;
        private @Nullable String dbInstanceStorageType;
        private @Nullable String engine;
        private @Nullable String engineVersion;
        private String id;
        private List<String> ids;
        private @Nullable String instanceChargeType;
        private List<GetInstanceClassesInstanceClass> instanceClasses;
        private @Nullable Boolean multiZone;
        private @Nullable String outputFile;
        private @Nullable String sortedBy;
        private @Nullable String storageType;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(GetInstanceClassesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.commodityCode = defaults.commodityCode;
    	      this.dbInstanceClass = defaults.dbInstanceClass;
    	      this.dbInstanceId = defaults.dbInstanceId;
    	      this.dbInstanceStorageType = defaults.dbInstanceStorageType;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceChargeType = defaults.instanceChargeType;
    	      this.instanceClasses = defaults.instanceClasses;
    	      this.multiZone = defaults.multiZone;
    	      this.outputFile = defaults.outputFile;
    	      this.sortedBy = defaults.sortedBy;
    	      this.storageType = defaults.storageType;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder commodityCode(@Nullable String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceClass(@Nullable String dbInstanceClass) {
            this.dbInstanceClass = dbInstanceClass;
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceId(@Nullable String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceStorageType(@Nullable String dbInstanceStorageType) {
            this.dbInstanceStorageType = dbInstanceStorageType;
            return this;
        }
        @CustomType.Setter
        public Builder engine(@Nullable String engine) {
            this.engine = engine;
            return this;
        }
        @CustomType.Setter
        public Builder engineVersion(@Nullable String engineVersion) {
            this.engineVersion = engineVersion;
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
        public Builder instanceChargeType(@Nullable String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        @CustomType.Setter
        public Builder instanceClasses(List<GetInstanceClassesInstanceClass> instanceClasses) {
            this.instanceClasses = Objects.requireNonNull(instanceClasses);
            return this;
        }
        public Builder instanceClasses(GetInstanceClassesInstanceClass... instanceClasses) {
            return instanceClasses(List.of(instanceClasses));
        }
        @CustomType.Setter
        public Builder multiZone(@Nullable Boolean multiZone) {
            this.multiZone = multiZone;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder sortedBy(@Nullable String sortedBy) {
            this.sortedBy = sortedBy;
            return this;
        }
        @CustomType.Setter
        public Builder storageType(@Nullable String storageType) {
            this.storageType = storageType;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public GetInstanceClassesResult build() {
            final var _resultValue = new GetInstanceClassesResult();
            _resultValue.category = category;
            _resultValue.commodityCode = commodityCode;
            _resultValue.dbInstanceClass = dbInstanceClass;
            _resultValue.dbInstanceId = dbInstanceId;
            _resultValue.dbInstanceStorageType = dbInstanceStorageType;
            _resultValue.engine = engine;
            _resultValue.engineVersion = engineVersion;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceChargeType = instanceChargeType;
            _resultValue.instanceClasses = instanceClasses;
            _resultValue.multiZone = multiZone;
            _resultValue.outputFile = outputFile;
            _resultValue.sortedBy = sortedBy;
            _resultValue.storageType = storageType;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
