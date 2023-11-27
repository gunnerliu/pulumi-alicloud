// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emr.outputs;

import com.pulumi.alicloud.emr.outputs.GetDiskTypesType;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDiskTypesResult {
    private String clusterType;
    private String destinationResource;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of data disk and system disk type IDs.
     * 
     */
    private List<String> ids;
    private String instanceChargeType;
    private String instanceType;
    private @Nullable String outputFile;
    /**
     * @return A list of emr instance types. Each element contains the following attributes:
     * 
     */
    private List<GetDiskTypesType> types;
    private @Nullable String zoneId;

    private GetDiskTypesResult() {}
    public String clusterType() {
        return this.clusterType;
    }
    public String destinationResource() {
        return this.destinationResource;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of data disk and system disk type IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public String instanceChargeType() {
        return this.instanceChargeType;
    }
    public String instanceType() {
        return this.instanceType;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of emr instance types. Each element contains the following attributes:
     * 
     */
    public List<GetDiskTypesType> types() {
        return this.types;
    }
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskTypesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterType;
        private String destinationResource;
        private String id;
        private List<String> ids;
        private String instanceChargeType;
        private String instanceType;
        private @Nullable String outputFile;
        private List<GetDiskTypesType> types;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(GetDiskTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterType = defaults.clusterType;
    	      this.destinationResource = defaults.destinationResource;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceChargeType = defaults.instanceChargeType;
    	      this.instanceType = defaults.instanceType;
    	      this.outputFile = defaults.outputFile;
    	      this.types = defaults.types;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder clusterType(String clusterType) {
            this.clusterType = Objects.requireNonNull(clusterType);
            return this;
        }
        @CustomType.Setter
        public Builder destinationResource(String destinationResource) {
            this.destinationResource = Objects.requireNonNull(destinationResource);
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
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = Objects.requireNonNull(instanceChargeType);
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder types(List<GetDiskTypesType> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }
        public Builder types(GetDiskTypesType... types) {
            return types(List.of(types));
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public GetDiskTypesResult build() {
            final var _resultValue = new GetDiskTypesResult();
            _resultValue.clusterType = clusterType;
            _resultValue.destinationResource = destinationResource;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceChargeType = instanceChargeType;
            _resultValue.instanceType = instanceType;
            _resultValue.outputFile = outputFile;
            _resultValue.types = types;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
