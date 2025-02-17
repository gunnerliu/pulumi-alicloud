// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.outputs;

import com.pulumi.alicloud.rds.outputs.GetZonesZone;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetZonesResult {
    private @Nullable String category;
    private @Nullable String dbInstanceClass;
    private @Nullable String dbInstanceStorageType;
    private @Nullable String engine;
    private @Nullable String engineVersion;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of zone IDs.
     * 
     */
    private List<String> ids;
    private @Nullable String instanceChargeType;
    private @Nullable Boolean multi;
    private @Nullable Boolean multiZone;
    private @Nullable String outputFile;
    /**
     * @return A list of availability zones. Each element contains the following attributes:
     * 
     */
    private List<GetZonesZone> zones;

    private GetZonesResult() {}
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    public Optional<String> dbInstanceClass() {
        return Optional.ofNullable(this.dbInstanceClass);
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
     * @return A list of zone IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> instanceChargeType() {
        return Optional.ofNullable(this.instanceChargeType);
    }
    public Optional<Boolean> multi() {
        return Optional.ofNullable(this.multi);
    }
    public Optional<Boolean> multiZone() {
        return Optional.ofNullable(this.multiZone);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of availability zones. Each element contains the following attributes:
     * 
     */
    public List<GetZonesZone> zones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZonesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String category;
        private @Nullable String dbInstanceClass;
        private @Nullable String dbInstanceStorageType;
        private @Nullable String engine;
        private @Nullable String engineVersion;
        private String id;
        private List<String> ids;
        private @Nullable String instanceChargeType;
        private @Nullable Boolean multi;
        private @Nullable Boolean multiZone;
        private @Nullable String outputFile;
        private List<GetZonesZone> zones;
        public Builder() {}
        public Builder(GetZonesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.dbInstanceClass = defaults.dbInstanceClass;
    	      this.dbInstanceStorageType = defaults.dbInstanceStorageType;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceChargeType = defaults.instanceChargeType;
    	      this.multi = defaults.multi;
    	      this.multiZone = defaults.multiZone;
    	      this.outputFile = defaults.outputFile;
    	      this.zones = defaults.zones;
        }

        @CustomType.Setter
        public Builder category(@Nullable String category) {

            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceClass(@Nullable String dbInstanceClass) {

            this.dbInstanceClass = dbInstanceClass;
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
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZonesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetZonesResult", "ids");
            }
            this.ids = ids;
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
        public Builder multi(@Nullable Boolean multi) {

            this.multi = multi;
            return this;
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
        public Builder zones(List<GetZonesZone> zones) {
            if (zones == null) {
              throw new MissingRequiredPropertyException("GetZonesResult", "zones");
            }
            this.zones = zones;
            return this;
        }
        public Builder zones(GetZonesZone... zones) {
            return zones(List.of(zones));
        }
        public GetZonesResult build() {
            final var _resultValue = new GetZonesResult();
            _resultValue.category = category;
            _resultValue.dbInstanceClass = dbInstanceClass;
            _resultValue.dbInstanceStorageType = dbInstanceStorageType;
            _resultValue.engine = engine;
            _resultValue.engineVersion = engineVersion;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceChargeType = instanceChargeType;
            _resultValue.multi = multi;
            _resultValue.multiZone = multiZone;
            _resultValue.outputFile = outputFile;
            _resultValue.zones = zones;
            return _resultValue;
        }
    }
}
