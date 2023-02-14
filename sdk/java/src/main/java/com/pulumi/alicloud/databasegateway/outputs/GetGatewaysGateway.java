// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.databasegateway.outputs;

import com.pulumi.alicloud.databasegateway.outputs.GetGatewaysGatewayGatewayInstance;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGatewaysGateway {
    /**
     * @return The creation time of Gateway.
     * 
     */
    private String createTime;
    /**
     * @return The description of Gateway.
     * 
     */
    private String gatewayDesc;
    private List<GetGatewaysGatewayGatewayInstance> gatewayInstances;
    /**
     * @return The name of the Gateway.
     * 
     */
    private String gatewayName;
    /**
     * @return A host of information.
     * 
     */
    private String hosts;
    /**
     * @return The ID of Gateway.
     * 
     */
    private String id;
    /**
     * @return The Modify time of Gateway.
     * 
     */
    private String modifiedTime;
    /**
     * @return The parent node Id of Gateway.
     * 
     */
    private String parentId;
    /**
     * @return The status of gateway. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
     * 
     */
    private String status;
    /**
     * @return The user&#39;s id.
     * 
     */
    private String userId;

    private GetGatewaysGateway() {}
    /**
     * @return The creation time of Gateway.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of Gateway.
     * 
     */
    public String gatewayDesc() {
        return this.gatewayDesc;
    }
    public List<GetGatewaysGatewayGatewayInstance> gatewayInstances() {
        return this.gatewayInstances;
    }
    /**
     * @return The name of the Gateway.
     * 
     */
    public String gatewayName() {
        return this.gatewayName;
    }
    /**
     * @return A host of information.
     * 
     */
    public String hosts() {
        return this.hosts;
    }
    /**
     * @return The ID of Gateway.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Modify time of Gateway.
     * 
     */
    public String modifiedTime() {
        return this.modifiedTime;
    }
    /**
     * @return The parent node Id of Gateway.
     * 
     */
    public String parentId() {
        return this.parentId;
    }
    /**
     * @return The status of gateway. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The user&#39;s id.
     * 
     */
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewaysGateway defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String gatewayDesc;
        private List<GetGatewaysGatewayGatewayInstance> gatewayInstances;
        private String gatewayName;
        private String hosts;
        private String id;
        private String modifiedTime;
        private String parentId;
        private String status;
        private String userId;
        public Builder() {}
        public Builder(GetGatewaysGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.gatewayDesc = defaults.gatewayDesc;
    	      this.gatewayInstances = defaults.gatewayInstances;
    	      this.gatewayName = defaults.gatewayName;
    	      this.hosts = defaults.hosts;
    	      this.id = defaults.id;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.parentId = defaults.parentId;
    	      this.status = defaults.status;
    	      this.userId = defaults.userId;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder gatewayDesc(String gatewayDesc) {
            this.gatewayDesc = Objects.requireNonNull(gatewayDesc);
            return this;
        }
        @CustomType.Setter
        public Builder gatewayInstances(List<GetGatewaysGatewayGatewayInstance> gatewayInstances) {
            this.gatewayInstances = Objects.requireNonNull(gatewayInstances);
            return this;
        }
        public Builder gatewayInstances(GetGatewaysGatewayGatewayInstance... gatewayInstances) {
            return gatewayInstances(List.of(gatewayInstances));
        }
        @CustomType.Setter
        public Builder gatewayName(String gatewayName) {
            this.gatewayName = Objects.requireNonNull(gatewayName);
            return this;
        }
        @CustomType.Setter
        public Builder hosts(String hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = Objects.requireNonNull(modifiedTime);
            return this;
        }
        @CustomType.Setter
        public Builder parentId(String parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public GetGatewaysGateway build() {
            final var o = new GetGatewaysGateway();
            o.createTime = createTime;
            o.gatewayDesc = gatewayDesc;
            o.gatewayInstances = gatewayInstances;
            o.gatewayName = gatewayName;
            o.hosts = hosts;
            o.id = id;
            o.modifiedTime = modifiedTime;
            o.parentId = parentId;
            o.status = status;
            o.userId = userId;
            return o;
        }
    }
}