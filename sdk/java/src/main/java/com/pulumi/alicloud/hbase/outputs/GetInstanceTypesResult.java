// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbase.outputs;

import com.pulumi.alicloud.hbase.outputs.GetInstanceTypesCoreInstanceType;
import com.pulumi.alicloud.hbase.outputs.GetInstanceTypesMasterInstanceType;
import com.pulumi.alicloud.hbase.outputs.GetInstanceTypesType;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceTypesResult {
    private final @Nullable String chargeType;
    /**
     * @return (Available in 1.115.0+) A list of core instance types. Each element contains the following attributes:
     * 
     */
    private final List<GetInstanceTypesCoreInstanceType> coreInstanceTypes;
    private final @Nullable String diskType;
    /**
     * @return Name of the engine.
     * 
     */
    private final @Nullable String engine;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of instance types type IDs.
     * 
     */
    private final List<String> ids;
    /**
     * @return Name of the instance type.
     * 
     */
    private final @Nullable String instanceType;
    /**
     * @return (Available in 1.115.0+) A list of master instance types. Each element contains the following attributes:
     * 
     */
    private final List<GetInstanceTypesMasterInstanceType> masterInstanceTypes;
    private final @Nullable String outputFile;
    private final @Nullable String regionId;
    /**
     * @return (Deprecated) A list of instance types. Each element contains the following attributes:
     * 
     */
    private final List<GetInstanceTypesType> types;
    /**
     * @return The version of the engine.
     * 
     */
    private final @Nullable String version;
    private final @Nullable String zoneId;

    @CustomType.Constructor
    private GetInstanceTypesResult(
        @CustomType.Parameter("chargeType") @Nullable String chargeType,
        @CustomType.Parameter("coreInstanceTypes") List<GetInstanceTypesCoreInstanceType> coreInstanceTypes,
        @CustomType.Parameter("diskType") @Nullable String diskType,
        @CustomType.Parameter("engine") @Nullable String engine,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("instanceType") @Nullable String instanceType,
        @CustomType.Parameter("masterInstanceTypes") List<GetInstanceTypesMasterInstanceType> masterInstanceTypes,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("regionId") @Nullable String regionId,
        @CustomType.Parameter("types") List<GetInstanceTypesType> types,
        @CustomType.Parameter("version") @Nullable String version,
        @CustomType.Parameter("zoneId") @Nullable String zoneId) {
        this.chargeType = chargeType;
        this.coreInstanceTypes = coreInstanceTypes;
        this.diskType = diskType;
        this.engine = engine;
        this.id = id;
        this.ids = ids;
        this.instanceType = instanceType;
        this.masterInstanceTypes = masterInstanceTypes;
        this.outputFile = outputFile;
        this.regionId = regionId;
        this.types = types;
        this.version = version;
        this.zoneId = zoneId;
    }

    public Optional<String> chargeType() {
        return Optional.ofNullable(this.chargeType);
    }
    /**
     * @return (Available in 1.115.0+) A list of core instance types. Each element contains the following attributes:
     * 
     */
    public List<GetInstanceTypesCoreInstanceType> coreInstanceTypes() {
        return this.coreInstanceTypes;
    }
    public Optional<String> diskType() {
        return Optional.ofNullable(this.diskType);
    }
    /**
     * @return Name of the engine.
     * 
     */
    public Optional<String> engine() {
        return Optional.ofNullable(this.engine);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of instance types type IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return Name of the instance type.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return (Available in 1.115.0+) A list of master instance types. Each element contains the following attributes:
     * 
     */
    public List<GetInstanceTypesMasterInstanceType> masterInstanceTypes() {
        return this.masterInstanceTypes;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> regionId() {
        return Optional.ofNullable(this.regionId);
    }
    /**
     * @return (Deprecated) A list of instance types. Each element contains the following attributes:
     * 
     */
    public List<GetInstanceTypesType> types() {
        return this.types;
    }
    /**
     * @return The version of the engine.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String chargeType;
        private List<GetInstanceTypesCoreInstanceType> coreInstanceTypes;
        private @Nullable String diskType;
        private @Nullable String engine;
        private String id;
        private List<String> ids;
        private @Nullable String instanceType;
        private List<GetInstanceTypesMasterInstanceType> masterInstanceTypes;
        private @Nullable String outputFile;
        private @Nullable String regionId;
        private List<GetInstanceTypesType> types;
        private @Nullable String version;
        private @Nullable String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chargeType = defaults.chargeType;
    	      this.coreInstanceTypes = defaults.coreInstanceTypes;
    	      this.diskType = defaults.diskType;
    	      this.engine = defaults.engine;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceType = defaults.instanceType;
    	      this.masterInstanceTypes = defaults.masterInstanceTypes;
    	      this.outputFile = defaults.outputFile;
    	      this.regionId = defaults.regionId;
    	      this.types = defaults.types;
    	      this.version = defaults.version;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder chargeType(@Nullable String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public Builder coreInstanceTypes(List<GetInstanceTypesCoreInstanceType> coreInstanceTypes) {
            this.coreInstanceTypes = Objects.requireNonNull(coreInstanceTypes);
            return this;
        }
        public Builder coreInstanceTypes(GetInstanceTypesCoreInstanceType... coreInstanceTypes) {
            return coreInstanceTypes(List.of(coreInstanceTypes));
        }
        public Builder diskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }
        public Builder engine(@Nullable String engine) {
            this.engine = engine;
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
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder masterInstanceTypes(List<GetInstanceTypesMasterInstanceType> masterInstanceTypes) {
            this.masterInstanceTypes = Objects.requireNonNull(masterInstanceTypes);
            return this;
        }
        public Builder masterInstanceTypes(GetInstanceTypesMasterInstanceType... masterInstanceTypes) {
            return masterInstanceTypes(List.of(masterInstanceTypes));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder regionId(@Nullable String regionId) {
            this.regionId = regionId;
            return this;
        }
        public Builder types(List<GetInstanceTypesType> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }
        public Builder types(GetInstanceTypesType... types) {
            return types(List.of(types));
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = zoneId;
            return this;
        }        public GetInstanceTypesResult build() {
            return new GetInstanceTypesResult(chargeType, coreInstanceTypes, diskType, engine, id, ids, instanceType, masterInstanceTypes, outputFile, regionId, types, version, zoneId);
        }
    }
}
