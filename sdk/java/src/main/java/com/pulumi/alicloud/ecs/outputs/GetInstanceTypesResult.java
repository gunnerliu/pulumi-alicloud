// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetInstanceTypesInstanceType;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceTypesResult {
    private @Nullable String availabilityZone;
    /**
     * @return Number of CPU cores.
     * 
     */
    private @Nullable Integer cpuCoreCount;
    /**
     * @return The maximum number of network interfaces that an instance type can be attached to.
     * 
     */
    private @Nullable Integer eniAmount;
    private @Nullable Integer gpuAmount;
    private @Nullable String gpuSpec;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of instance type IDs.
     * 
     */
    private List<String> ids;
    private @Nullable String imageId;
    private @Nullable String instanceChargeType;
    private @Nullable String instanceTypeFamily;
    /**
     * @return A list of image types. Each element contains the following attributes:
     * 
     */
    private List<GetInstanceTypesInstanceType> instanceTypes;
    private @Nullable Boolean isOutdated;
    private @Nullable String kubernetesNodeRole;
    /**
     * @return Size of memory, measured in GB.
     * 
     */
    private @Nullable Double memorySize;
    private @Nullable Integer minimumEniIpv6AddressQuantity;
    private @Nullable String networkType;
    private @Nullable String outputFile;
    private @Nullable String sortedBy;
    private @Nullable String spotStrategy;
    private @Nullable String systemDiskCategory;

    private GetInstanceTypesResult() {}
    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    /**
     * @return Number of CPU cores.
     * 
     */
    public Optional<Integer> cpuCoreCount() {
        return Optional.ofNullable(this.cpuCoreCount);
    }
    /**
     * @return The maximum number of network interfaces that an instance type can be attached to.
     * 
     */
    public Optional<Integer> eniAmount() {
        return Optional.ofNullable(this.eniAmount);
    }
    public Optional<Integer> gpuAmount() {
        return Optional.ofNullable(this.gpuAmount);
    }
    public Optional<String> gpuSpec() {
        return Optional.ofNullable(this.gpuSpec);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of instance type IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> imageId() {
        return Optional.ofNullable(this.imageId);
    }
    public Optional<String> instanceChargeType() {
        return Optional.ofNullable(this.instanceChargeType);
    }
    public Optional<String> instanceTypeFamily() {
        return Optional.ofNullable(this.instanceTypeFamily);
    }
    /**
     * @return A list of image types. Each element contains the following attributes:
     * 
     */
    public List<GetInstanceTypesInstanceType> instanceTypes() {
        return this.instanceTypes;
    }
    public Optional<Boolean> isOutdated() {
        return Optional.ofNullable(this.isOutdated);
    }
    public Optional<String> kubernetesNodeRole() {
        return Optional.ofNullable(this.kubernetesNodeRole);
    }
    /**
     * @return Size of memory, measured in GB.
     * 
     */
    public Optional<Double> memorySize() {
        return Optional.ofNullable(this.memorySize);
    }
    public Optional<Integer> minimumEniIpv6AddressQuantity() {
        return Optional.ofNullable(this.minimumEniIpv6AddressQuantity);
    }
    public Optional<String> networkType() {
        return Optional.ofNullable(this.networkType);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> sortedBy() {
        return Optional.ofNullable(this.sortedBy);
    }
    public Optional<String> spotStrategy() {
        return Optional.ofNullable(this.spotStrategy);
    }
    public Optional<String> systemDiskCategory() {
        return Optional.ofNullable(this.systemDiskCategory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable Integer cpuCoreCount;
        private @Nullable Integer eniAmount;
        private @Nullable Integer gpuAmount;
        private @Nullable String gpuSpec;
        private String id;
        private List<String> ids;
        private @Nullable String imageId;
        private @Nullable String instanceChargeType;
        private @Nullable String instanceTypeFamily;
        private List<GetInstanceTypesInstanceType> instanceTypes;
        private @Nullable Boolean isOutdated;
        private @Nullable String kubernetesNodeRole;
        private @Nullable Double memorySize;
        private @Nullable Integer minimumEniIpv6AddressQuantity;
        private @Nullable String networkType;
        private @Nullable String outputFile;
        private @Nullable String sortedBy;
        private @Nullable String spotStrategy;
        private @Nullable String systemDiskCategory;
        public Builder() {}
        public Builder(GetInstanceTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.cpuCoreCount = defaults.cpuCoreCount;
    	      this.eniAmount = defaults.eniAmount;
    	      this.gpuAmount = defaults.gpuAmount;
    	      this.gpuSpec = defaults.gpuSpec;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.imageId = defaults.imageId;
    	      this.instanceChargeType = defaults.instanceChargeType;
    	      this.instanceTypeFamily = defaults.instanceTypeFamily;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.isOutdated = defaults.isOutdated;
    	      this.kubernetesNodeRole = defaults.kubernetesNodeRole;
    	      this.memorySize = defaults.memorySize;
    	      this.minimumEniIpv6AddressQuantity = defaults.minimumEniIpv6AddressQuantity;
    	      this.networkType = defaults.networkType;
    	      this.outputFile = defaults.outputFile;
    	      this.sortedBy = defaults.sortedBy;
    	      this.spotStrategy = defaults.spotStrategy;
    	      this.systemDiskCategory = defaults.systemDiskCategory;
        }

        @CustomType.Setter
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        @CustomType.Setter
        public Builder cpuCoreCount(@Nullable Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        @CustomType.Setter
        public Builder eniAmount(@Nullable Integer eniAmount) {
            this.eniAmount = eniAmount;
            return this;
        }
        @CustomType.Setter
        public Builder gpuAmount(@Nullable Integer gpuAmount) {
            this.gpuAmount = gpuAmount;
            return this;
        }
        @CustomType.Setter
        public Builder gpuSpec(@Nullable String gpuSpec) {
            this.gpuSpec = gpuSpec;
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
        public Builder imageId(@Nullable String imageId) {
            this.imageId = imageId;
            return this;
        }
        @CustomType.Setter
        public Builder instanceChargeType(@Nullable String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        @CustomType.Setter
        public Builder instanceTypeFamily(@Nullable String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        @CustomType.Setter
        public Builder instanceTypes(List<GetInstanceTypesInstanceType> instanceTypes) {
            this.instanceTypes = Objects.requireNonNull(instanceTypes);
            return this;
        }
        public Builder instanceTypes(GetInstanceTypesInstanceType... instanceTypes) {
            return instanceTypes(List.of(instanceTypes));
        }
        @CustomType.Setter
        public Builder isOutdated(@Nullable Boolean isOutdated) {
            this.isOutdated = isOutdated;
            return this;
        }
        @CustomType.Setter
        public Builder kubernetesNodeRole(@Nullable String kubernetesNodeRole) {
            this.kubernetesNodeRole = kubernetesNodeRole;
            return this;
        }
        @CustomType.Setter
        public Builder memorySize(@Nullable Double memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        @CustomType.Setter
        public Builder minimumEniIpv6AddressQuantity(@Nullable Integer minimumEniIpv6AddressQuantity) {
            this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
            return this;
        }
        @CustomType.Setter
        public Builder networkType(@Nullable String networkType) {
            this.networkType = networkType;
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
        public Builder spotStrategy(@Nullable String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder systemDiskCategory(@Nullable String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public GetInstanceTypesResult build() {
            final var _resultValue = new GetInstanceTypesResult();
            _resultValue.availabilityZone = availabilityZone;
            _resultValue.cpuCoreCount = cpuCoreCount;
            _resultValue.eniAmount = eniAmount;
            _resultValue.gpuAmount = gpuAmount;
            _resultValue.gpuSpec = gpuSpec;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.imageId = imageId;
            _resultValue.instanceChargeType = instanceChargeType;
            _resultValue.instanceTypeFamily = instanceTypeFamily;
            _resultValue.instanceTypes = instanceTypes;
            _resultValue.isOutdated = isOutdated;
            _resultValue.kubernetesNodeRole = kubernetesNodeRole;
            _resultValue.memorySize = memorySize;
            _resultValue.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
            _resultValue.networkType = networkType;
            _resultValue.outputFile = outputFile;
            _resultValue.sortedBy = sortedBy;
            _resultValue.spotStrategy = spotStrategy;
            _resultValue.systemDiskCategory = systemDiskCategory;
            return _resultValue;
        }
    }
}
