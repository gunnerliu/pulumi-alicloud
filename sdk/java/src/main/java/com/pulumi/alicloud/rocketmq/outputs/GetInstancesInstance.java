// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstancesInstance {
    /**
     * @return The internal HTTP endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    private String httpInternalEndpoint;
    /**
     * @return The public HTTP endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    private String httpInternetEndpoint;
    /**
     * @return The public HTTPS endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    private String httpInternetSecureEndpoint;
    /**
     * @return ID of the instance.
     * 
     */
    private String id;
    /**
     * @return Indicates whether any namespace is configured for the Message Queue for Apache RocketMQ instance.
     * 
     */
    private Boolean independentNaming;
    /**
     * @return ID of the instance.
     * 
     */
    private String instanceId;
    /**
     * @return Name of the instance.
     * 
     */
    private String instanceName;
    /**
     * @return The status of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
     * 
     */
    private Integer instanceStatus;
    /**
     * @return The type of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
     * 
     */
    private Integer instanceType;
    /**
     * @return The automatic release time of an Enterprise Platinum Edition instance.
     * 
     */
    private String releaseTime;
    /**
     * @return This attribute is a concise description of instance.
     * 
     */
    private String remark;
    /**
     * @return The status of Ons instance. Valid values: `0` deploying, `2` arrears, `5` running, `7` upgrading.
     * 
     */
    private Integer status;
    /**
     * @return A map of tags assigned to the Ons instance.
     * 
     */
    private Map<String,Object> tags;
    /**
     * @return The TCP endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    private String tcpEndpoint;

    private GetInstancesInstance() {}
    /**
     * @return The internal HTTP endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    public String httpInternalEndpoint() {
        return this.httpInternalEndpoint;
    }
    /**
     * @return The public HTTP endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    public String httpInternetEndpoint() {
        return this.httpInternetEndpoint;
    }
    /**
     * @return The public HTTPS endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    public String httpInternetSecureEndpoint() {
        return this.httpInternetSecureEndpoint;
    }
    /**
     * @return ID of the instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates whether any namespace is configured for the Message Queue for Apache RocketMQ instance.
     * 
     */
    public Boolean independentNaming() {
        return this.independentNaming;
    }
    /**
     * @return ID of the instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return Name of the instance.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return The status of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
     * 
     */
    public Integer instanceStatus() {
        return this.instanceStatus;
    }
    /**
     * @return The type of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
     * 
     */
    public Integer instanceType() {
        return this.instanceType;
    }
    /**
     * @return The automatic release time of an Enterprise Platinum Edition instance.
     * 
     */
    public String releaseTime() {
        return this.releaseTime;
    }
    /**
     * @return This attribute is a concise description of instance.
     * 
     */
    public String remark() {
        return this.remark;
    }
    /**
     * @return The status of Ons instance. Valid values: `0` deploying, `2` arrears, `5` running, `7` upgrading.
     * 
     */
    public Integer status() {
        return this.status;
    }
    /**
     * @return A map of tags assigned to the Ons instance.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return The TCP endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    public String tcpEndpoint() {
        return this.tcpEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String httpInternalEndpoint;
        private String httpInternetEndpoint;
        private String httpInternetSecureEndpoint;
        private String id;
        private Boolean independentNaming;
        private String instanceId;
        private String instanceName;
        private Integer instanceStatus;
        private Integer instanceType;
        private String releaseTime;
        private String remark;
        private Integer status;
        private Map<String,Object> tags;
        private String tcpEndpoint;
        public Builder() {}
        public Builder(GetInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpInternalEndpoint = defaults.httpInternalEndpoint;
    	      this.httpInternetEndpoint = defaults.httpInternetEndpoint;
    	      this.httpInternetSecureEndpoint = defaults.httpInternetSecureEndpoint;
    	      this.id = defaults.id;
    	      this.independentNaming = defaults.independentNaming;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceName = defaults.instanceName;
    	      this.instanceStatus = defaults.instanceStatus;
    	      this.instanceType = defaults.instanceType;
    	      this.releaseTime = defaults.releaseTime;
    	      this.remark = defaults.remark;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tcpEndpoint = defaults.tcpEndpoint;
        }

        @CustomType.Setter
        public Builder httpInternalEndpoint(String httpInternalEndpoint) {
            this.httpInternalEndpoint = Objects.requireNonNull(httpInternalEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder httpInternetEndpoint(String httpInternetEndpoint) {
            this.httpInternetEndpoint = Objects.requireNonNull(httpInternetEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder httpInternetSecureEndpoint(String httpInternetSecureEndpoint) {
            this.httpInternetSecureEndpoint = Objects.requireNonNull(httpInternetSecureEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder independentNaming(Boolean independentNaming) {
            this.independentNaming = Objects.requireNonNull(independentNaming);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        @CustomType.Setter
        public Builder instanceStatus(Integer instanceStatus) {
            this.instanceStatus = Objects.requireNonNull(instanceStatus);
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(Integer instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        @CustomType.Setter
        public Builder releaseTime(String releaseTime) {
            this.releaseTime = Objects.requireNonNull(releaseTime);
            return this;
        }
        @CustomType.Setter
        public Builder remark(String remark) {
            this.remark = Objects.requireNonNull(remark);
            return this;
        }
        @CustomType.Setter
        public Builder status(Integer status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder tcpEndpoint(String tcpEndpoint) {
            this.tcpEndpoint = Objects.requireNonNull(tcpEndpoint);
            return this;
        }
        public GetInstancesInstance build() {
            final var o = new GetInstancesInstance();
            o.httpInternalEndpoint = httpInternalEndpoint;
            o.httpInternetEndpoint = httpInternetEndpoint;
            o.httpInternetSecureEndpoint = httpInternetSecureEndpoint;
            o.id = id;
            o.independentNaming = independentNaming;
            o.instanceId = instanceId;
            o.instanceName = instanceName;
            o.instanceStatus = instanceStatus;
            o.instanceType = instanceType;
            o.releaseTime = releaseTime;
            o.remark = remark;
            o.status = status;
            o.tags = tags;
            o.tcpEndpoint = tcpEndpoint;
            return o;
        }
    }
}
