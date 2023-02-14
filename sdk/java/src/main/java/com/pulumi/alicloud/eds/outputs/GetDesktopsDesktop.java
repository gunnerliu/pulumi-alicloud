// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDesktopsDesktop {
    /**
     * @return The number of CPUs.
     * 
     */
    private Integer cpu;
    /**
     * @return The creation time of the Desktop.
     * 
     */
    private String createTime;
    /**
     * @return The desktop id of the Desktop.
     * 
     */
    private String desktopId;
    /**
     * @return The desktop name of the Desktop.
     * 
     */
    private String desktopName;
    /**
     * @return The desktop type of the Desktop.
     * 
     */
    private String desktopType;
    /**
     * @return The directory id of the Desktop.
     * 
     */
    private String directoryId;
    /**
     * @return The desktop end user id of the Desktop.
     * 
     */
    private List<String> endUserIds;
    /**
     * @return The expired time of the Desktop.
     * 
     */
    private String expiredTime;
    /**
     * @return The ID of the Desktop.
     * 
     */
    private String id;
    /**
     * @return The image id of the Desktop.
     * 
     */
    private String imageId;
    /**
     * @return The memory of the Desktop.
     * 
     */
    private String memory;
    /**
     * @return The network interface id of the Desktop.
     * 
     */
    private String networkInterfaceId;
    /**
     * @return The payment type of the Desktop.
     * 
     */
    private String paymentType;
    /**
     * @return The policy group id of the Desktop.
     * 
     */
    private String policyGroupId;
    /**
     * @return The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
     * 
     */
    private String status;
    /**
     * @return The system disk size of the Desktop.
     * 
     */
    private Integer systemDiskSize;

    private GetDesktopsDesktop() {}
    /**
     * @return The number of CPUs.
     * 
     */
    public Integer cpu() {
        return this.cpu;
    }
    /**
     * @return The creation time of the Desktop.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The desktop id of the Desktop.
     * 
     */
    public String desktopId() {
        return this.desktopId;
    }
    /**
     * @return The desktop name of the Desktop.
     * 
     */
    public String desktopName() {
        return this.desktopName;
    }
    /**
     * @return The desktop type of the Desktop.
     * 
     */
    public String desktopType() {
        return this.desktopType;
    }
    /**
     * @return The directory id of the Desktop.
     * 
     */
    public String directoryId() {
        return this.directoryId;
    }
    /**
     * @return The desktop end user id of the Desktop.
     * 
     */
    public List<String> endUserIds() {
        return this.endUserIds;
    }
    /**
     * @return The expired time of the Desktop.
     * 
     */
    public String expiredTime() {
        return this.expiredTime;
    }
    /**
     * @return The ID of the Desktop.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The image id of the Desktop.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return The memory of the Desktop.
     * 
     */
    public String memory() {
        return this.memory;
    }
    /**
     * @return The network interface id of the Desktop.
     * 
     */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * @return The payment type of the Desktop.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return The policy group id of the Desktop.
     * 
     */
    public String policyGroupId() {
        return this.policyGroupId;
    }
    /**
     * @return The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The system disk size of the Desktop.
     * 
     */
    public Integer systemDiskSize() {
        return this.systemDiskSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDesktopsDesktop defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer cpu;
        private String createTime;
        private String desktopId;
        private String desktopName;
        private String desktopType;
        private String directoryId;
        private List<String> endUserIds;
        private String expiredTime;
        private String id;
        private String imageId;
        private String memory;
        private String networkInterfaceId;
        private String paymentType;
        private String policyGroupId;
        private String status;
        private Integer systemDiskSize;
        public Builder() {}
        public Builder(GetDesktopsDesktop defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.createTime = defaults.createTime;
    	      this.desktopId = defaults.desktopId;
    	      this.desktopName = defaults.desktopName;
    	      this.desktopType = defaults.desktopType;
    	      this.directoryId = defaults.directoryId;
    	      this.endUserIds = defaults.endUserIds;
    	      this.expiredTime = defaults.expiredTime;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.memory = defaults.memory;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.paymentType = defaults.paymentType;
    	      this.policyGroupId = defaults.policyGroupId;
    	      this.status = defaults.status;
    	      this.systemDiskSize = defaults.systemDiskSize;
        }

        @CustomType.Setter
        public Builder cpu(Integer cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder desktopId(String desktopId) {
            this.desktopId = Objects.requireNonNull(desktopId);
            return this;
        }
        @CustomType.Setter
        public Builder desktopName(String desktopName) {
            this.desktopName = Objects.requireNonNull(desktopName);
            return this;
        }
        @CustomType.Setter
        public Builder desktopType(String desktopType) {
            this.desktopType = Objects.requireNonNull(desktopType);
            return this;
        }
        @CustomType.Setter
        public Builder directoryId(String directoryId) {
            this.directoryId = Objects.requireNonNull(directoryId);
            return this;
        }
        @CustomType.Setter
        public Builder endUserIds(List<String> endUserIds) {
            this.endUserIds = Objects.requireNonNull(endUserIds);
            return this;
        }
        public Builder endUserIds(String... endUserIds) {
            return endUserIds(List.of(endUserIds));
        }
        @CustomType.Setter
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = Objects.requireNonNull(expiredTime);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        @CustomType.Setter
        public Builder memory(String memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        @CustomType.Setter
        public Builder paymentType(String paymentType) {
            this.paymentType = Objects.requireNonNull(paymentType);
            return this;
        }
        @CustomType.Setter
        public Builder policyGroupId(String policyGroupId) {
            this.policyGroupId = Objects.requireNonNull(policyGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = Objects.requireNonNull(systemDiskSize);
            return this;
        }
        public GetDesktopsDesktop build() {
            final var o = new GetDesktopsDesktop();
            o.cpu = cpu;
            o.createTime = createTime;
            o.desktopId = desktopId;
            o.desktopName = desktopName;
            o.desktopType = desktopType;
            o.directoryId = directoryId;
            o.endUserIds = endUserIds;
            o.expiredTime = expiredTime;
            o.id = id;
            o.imageId = imageId;
            o.memory = memory;
            o.networkInterfaceId = networkInterfaceId;
            o.paymentType = paymentType;
            o.policyGroupId = policyGroupId;
            o.status = status;
            o.systemDiskSize = systemDiskSize;
            return o;
        }
    }
}