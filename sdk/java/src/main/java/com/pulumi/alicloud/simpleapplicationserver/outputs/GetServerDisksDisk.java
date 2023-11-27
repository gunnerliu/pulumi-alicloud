// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.simpleapplicationserver.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerDisksDisk {
    /**
     * @return Disk type. Possible values: `ESSD`, `SSD`.
     * 
     */
    private String category;
    /**
     * @return The time when the disk was created. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.
     * 
     */
    private String createTime;
    /**
     * @return The device name of the disk on the simple application server.
     * 
     */
    private String device;
    /**
     * @return The first ID of the resource.
     * 
     */
    private String diskId;
    /**
     * @return The name of the resource.
     * 
     */
    private String diskName;
    /**
     * @return The type of the disk. Possible values: `System`, `Data`.
     * 
     */
    private String diskType;
    /**
     * @return The ID of the Disk.
     * 
     */
    private String id;
    /**
     * @return Alibaba Cloud simple application server instance ID.
     * 
     */
    private String instanceId;
    /**
     * @return The payment type of the resource. Valid values: `PayAsYouGo`, `Subscription`.
     * 
     */
    private String paymentType;
    /**
     * @return The size of the disk. Unit: `GB`.
     * 
     */
    private Integer size;
    /**
     * @return The status of the disk. Valid values: `ReIniting`, `Creating`, `In_Use`, `Available`, `Attaching`, `Detaching`.
     * 
     */
    private String status;

    private GetServerDisksDisk() {}
    /**
     * @return Disk type. Possible values: `ESSD`, `SSD`.
     * 
     */
    public String category() {
        return this.category;
    }
    /**
     * @return The time when the disk was created. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The device name of the disk on the simple application server.
     * 
     */
    public String device() {
        return this.device;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String diskId() {
        return this.diskId;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String diskName() {
        return this.diskName;
    }
    /**
     * @return The type of the disk. Possible values: `System`, `Data`.
     * 
     */
    public String diskType() {
        return this.diskType;
    }
    /**
     * @return The ID of the Disk.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Alibaba Cloud simple application server instance ID.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The payment type of the resource. Valid values: `PayAsYouGo`, `Subscription`.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return The size of the disk. Unit: `GB`.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return The status of the disk. Valid values: `ReIniting`, `Creating`, `In_Use`, `Available`, `Attaching`, `Detaching`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerDisksDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String category;
        private String createTime;
        private String device;
        private String diskId;
        private String diskName;
        private String diskType;
        private String id;
        private String instanceId;
        private String paymentType;
        private Integer size;
        private String status;
        public Builder() {}
        public Builder(GetServerDisksDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.createTime = defaults.createTime;
    	      this.device = defaults.device;
    	      this.diskId = defaults.diskId;
    	      this.diskName = defaults.diskName;
    	      this.diskType = defaults.diskType;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.paymentType = defaults.paymentType;
    	      this.size = defaults.size;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder device(String device) {
            this.device = Objects.requireNonNull(device);
            return this;
        }
        @CustomType.Setter
        public Builder diskId(String diskId) {
            this.diskId = Objects.requireNonNull(diskId);
            return this;
        }
        @CustomType.Setter
        public Builder diskName(String diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }
        @CustomType.Setter
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder paymentType(String paymentType) {
            this.paymentType = Objects.requireNonNull(paymentType);
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetServerDisksDisk build() {
            final var _resultValue = new GetServerDisksDisk();
            _resultValue.category = category;
            _resultValue.createTime = createTime;
            _resultValue.device = device;
            _resultValue.diskId = diskId;
            _resultValue.diskName = diskName;
            _resultValue.diskType = diskType;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.paymentType = paymentType;
            _resultValue.size = size;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
