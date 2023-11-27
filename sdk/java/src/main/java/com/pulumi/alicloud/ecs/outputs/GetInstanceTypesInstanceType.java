// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetInstanceTypesInstanceTypeBurstableInstance;
import com.pulumi.alicloud.ecs.outputs.GetInstanceTypesInstanceTypeGpu;
import com.pulumi.alicloud.ecs.outputs.GetInstanceTypesInstanceTypeLocalStorage;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceTypesInstanceType {
    /**
     * @return List of availability zones that support the instance type.
     * 
     */
    private List<String> availabilityZones;
    /**
     * @return The burstable instance attribution:
     * - initial_credit: The initial CPU credit of a burstable instance.
     * - baseline_credit:  The compute performance benchmark CPU credit of a burstable instance.
     * 
     */
    private GetInstanceTypesInstanceTypeBurstableInstance burstableInstance;
    /**
     * @return Filter the results to a specific number of cpu cores.
     * 
     */
    private Integer cpuCoreCount;
    /**
     * @return Filter the result whose network interface number is no more than `eni_amount`.
     * 
     */
    private Integer eniAmount;
    /**
     * @return The instance type family.
     * 
     */
    private String family;
    /**
     * @return The GPU attribution of an instance type:
     * - amount: The amount of GPU of an instance type.
     * - category: The category of GPU of an instance type.
     * 
     */
    private GetInstanceTypesInstanceTypeGpu gpu;
    /**
     * @return ID of the instance type.
     * 
     */
    private String id;
    /**
     * @return Local storage of an instance type:
     * - capacity: The capacity of a local storage in GB.
     * - amount:  The number of local storage devices that an instance has been attached to.
     * - category: The category of local storage that an instance has been attached to.
     * 
     */
    private GetInstanceTypesInstanceTypeLocalStorage localStorage;
    /**
     * @return Filter the results to a specific memory size in GB.
     * 
     */
    private Double memorySize;
    /**
     * @return Indicates whether the cloud disk can be attached by using the nonvolatile memory express (NVMe) protocol. Valid values:
     * - required: The cloud disk can be attached by using the NVMe protocol.
     * - unsupported: The cloud disk cannot be attached by using the NVMe protocol.
     * 
     */
    private String nvmeSupport;
    private String price;

    private GetInstanceTypesInstanceType() {}
    /**
     * @return List of availability zones that support the instance type.
     * 
     */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * @return The burstable instance attribution:
     * - initial_credit: The initial CPU credit of a burstable instance.
     * - baseline_credit:  The compute performance benchmark CPU credit of a burstable instance.
     * 
     */
    public GetInstanceTypesInstanceTypeBurstableInstance burstableInstance() {
        return this.burstableInstance;
    }
    /**
     * @return Filter the results to a specific number of cpu cores.
     * 
     */
    public Integer cpuCoreCount() {
        return this.cpuCoreCount;
    }
    /**
     * @return Filter the result whose network interface number is no more than `eni_amount`.
     * 
     */
    public Integer eniAmount() {
        return this.eniAmount;
    }
    /**
     * @return The instance type family.
     * 
     */
    public String family() {
        return this.family;
    }
    /**
     * @return The GPU attribution of an instance type:
     * - amount: The amount of GPU of an instance type.
     * - category: The category of GPU of an instance type.
     * 
     */
    public GetInstanceTypesInstanceTypeGpu gpu() {
        return this.gpu;
    }
    /**
     * @return ID of the instance type.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Local storage of an instance type:
     * - capacity: The capacity of a local storage in GB.
     * - amount:  The number of local storage devices that an instance has been attached to.
     * - category: The category of local storage that an instance has been attached to.
     * 
     */
    public GetInstanceTypesInstanceTypeLocalStorage localStorage() {
        return this.localStorage;
    }
    /**
     * @return Filter the results to a specific memory size in GB.
     * 
     */
    public Double memorySize() {
        return this.memorySize;
    }
    /**
     * @return Indicates whether the cloud disk can be attached by using the nonvolatile memory express (NVMe) protocol. Valid values:
     * - required: The cloud disk can be attached by using the NVMe protocol.
     * - unsupported: The cloud disk cannot be attached by using the NVMe protocol.
     * 
     */
    public String nvmeSupport() {
        return this.nvmeSupport;
    }
    public String price() {
        return this.price;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypesInstanceType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> availabilityZones;
        private GetInstanceTypesInstanceTypeBurstableInstance burstableInstance;
        private Integer cpuCoreCount;
        private Integer eniAmount;
        private String family;
        private GetInstanceTypesInstanceTypeGpu gpu;
        private String id;
        private GetInstanceTypesInstanceTypeLocalStorage localStorage;
        private Double memorySize;
        private String nvmeSupport;
        private String price;
        public Builder() {}
        public Builder(GetInstanceTypesInstanceType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.burstableInstance = defaults.burstableInstance;
    	      this.cpuCoreCount = defaults.cpuCoreCount;
    	      this.eniAmount = defaults.eniAmount;
    	      this.family = defaults.family;
    	      this.gpu = defaults.gpu;
    	      this.id = defaults.id;
    	      this.localStorage = defaults.localStorage;
    	      this.memorySize = defaults.memorySize;
    	      this.nvmeSupport = defaults.nvmeSupport;
    	      this.price = defaults.price;
        }

        @CustomType.Setter
        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        @CustomType.Setter
        public Builder burstableInstance(GetInstanceTypesInstanceTypeBurstableInstance burstableInstance) {
            this.burstableInstance = Objects.requireNonNull(burstableInstance);
            return this;
        }
        @CustomType.Setter
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = Objects.requireNonNull(cpuCoreCount);
            return this;
        }
        @CustomType.Setter
        public Builder eniAmount(Integer eniAmount) {
            this.eniAmount = Objects.requireNonNull(eniAmount);
            return this;
        }
        @CustomType.Setter
        public Builder family(String family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }
        @CustomType.Setter
        public Builder gpu(GetInstanceTypesInstanceTypeGpu gpu) {
            this.gpu = Objects.requireNonNull(gpu);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder localStorage(GetInstanceTypesInstanceTypeLocalStorage localStorage) {
            this.localStorage = Objects.requireNonNull(localStorage);
            return this;
        }
        @CustomType.Setter
        public Builder memorySize(Double memorySize) {
            this.memorySize = Objects.requireNonNull(memorySize);
            return this;
        }
        @CustomType.Setter
        public Builder nvmeSupport(String nvmeSupport) {
            this.nvmeSupport = Objects.requireNonNull(nvmeSupport);
            return this;
        }
        @CustomType.Setter
        public Builder price(String price) {
            this.price = Objects.requireNonNull(price);
            return this;
        }
        public GetInstanceTypesInstanceType build() {
            final var _resultValue = new GetInstanceTypesInstanceType();
            _resultValue.availabilityZones = availabilityZones;
            _resultValue.burstableInstance = burstableInstance;
            _resultValue.cpuCoreCount = cpuCoreCount;
            _resultValue.eniAmount = eniAmount;
            _resultValue.family = family;
            _resultValue.gpu = gpu;
            _resultValue.id = id;
            _resultValue.localStorage = localStorage;
            _resultValue.memorySize = memorySize;
            _resultValue.nvmeSupport = nvmeSupport;
            _resultValue.price = price;
            return _resultValue;
        }
    }
}
