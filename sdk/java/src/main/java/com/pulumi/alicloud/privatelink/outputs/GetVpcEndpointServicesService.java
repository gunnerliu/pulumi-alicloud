// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVpcEndpointServicesService {
    /**
     * @return Whether to automatically accept terminal node connections..
     * 
     */
    private final Boolean autoAcceptConnection;
    /**
     * @return The connection bandwidth.
     * 
     */
    private final Integer connectBandwidth;
    /**
     * @return The ID of the Vpc Endpoint Service.
     * 
     */
    private final String id;
    /**
     * @return The business status of the terminal node service..
     * 
     */
    private final String serviceBusinessStatus;
    /**
     * @return The description of the terminal node service.
     * 
     */
    private final String serviceDescription;
    /**
     * @return The domain of service.
     * 
     */
    private final String serviceDomain;
    /**
     * @return The ID of the Vpc Endpoint Service.
     * 
     */
    private final String serviceId;
    /**
     * @return The Status of Vpc Endpoint Service.
     * 
     */
    private final String status;
    /**
     * @return The name of Vpc Endpoint Service.
     * 
     */
    private final String vpcEndpointServiceName;

    @CustomType.Constructor
    private GetVpcEndpointServicesService(
        @CustomType.Parameter("autoAcceptConnection") Boolean autoAcceptConnection,
        @CustomType.Parameter("connectBandwidth") Integer connectBandwidth,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("serviceBusinessStatus") String serviceBusinessStatus,
        @CustomType.Parameter("serviceDescription") String serviceDescription,
        @CustomType.Parameter("serviceDomain") String serviceDomain,
        @CustomType.Parameter("serviceId") String serviceId,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("vpcEndpointServiceName") String vpcEndpointServiceName) {
        this.autoAcceptConnection = autoAcceptConnection;
        this.connectBandwidth = connectBandwidth;
        this.id = id;
        this.serviceBusinessStatus = serviceBusinessStatus;
        this.serviceDescription = serviceDescription;
        this.serviceDomain = serviceDomain;
        this.serviceId = serviceId;
        this.status = status;
        this.vpcEndpointServiceName = vpcEndpointServiceName;
    }

    /**
     * @return Whether to automatically accept terminal node connections..
     * 
     */
    public Boolean autoAcceptConnection() {
        return this.autoAcceptConnection;
    }
    /**
     * @return The connection bandwidth.
     * 
     */
    public Integer connectBandwidth() {
        return this.connectBandwidth;
    }
    /**
     * @return The ID of the Vpc Endpoint Service.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The business status of the terminal node service..
     * 
     */
    public String serviceBusinessStatus() {
        return this.serviceBusinessStatus;
    }
    /**
     * @return The description of the terminal node service.
     * 
     */
    public String serviceDescription() {
        return this.serviceDescription;
    }
    /**
     * @return The domain of service.
     * 
     */
    public String serviceDomain() {
        return this.serviceDomain;
    }
    /**
     * @return The ID of the Vpc Endpoint Service.
     * 
     */
    public String serviceId() {
        return this.serviceId;
    }
    /**
     * @return The Status of Vpc Endpoint Service.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The name of Vpc Endpoint Service.
     * 
     */
    public String vpcEndpointServiceName() {
        return this.vpcEndpointServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcEndpointServicesService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoAcceptConnection;
        private Integer connectBandwidth;
        private String id;
        private String serviceBusinessStatus;
        private String serviceDescription;
        private String serviceDomain;
        private String serviceId;
        private String status;
        private String vpcEndpointServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcEndpointServicesService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoAcceptConnection = defaults.autoAcceptConnection;
    	      this.connectBandwidth = defaults.connectBandwidth;
    	      this.id = defaults.id;
    	      this.serviceBusinessStatus = defaults.serviceBusinessStatus;
    	      this.serviceDescription = defaults.serviceDescription;
    	      this.serviceDomain = defaults.serviceDomain;
    	      this.serviceId = defaults.serviceId;
    	      this.status = defaults.status;
    	      this.vpcEndpointServiceName = defaults.vpcEndpointServiceName;
        }

        public Builder autoAcceptConnection(Boolean autoAcceptConnection) {
            this.autoAcceptConnection = Objects.requireNonNull(autoAcceptConnection);
            return this;
        }
        public Builder connectBandwidth(Integer connectBandwidth) {
            this.connectBandwidth = Objects.requireNonNull(connectBandwidth);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder serviceBusinessStatus(String serviceBusinessStatus) {
            this.serviceBusinessStatus = Objects.requireNonNull(serviceBusinessStatus);
            return this;
        }
        public Builder serviceDescription(String serviceDescription) {
            this.serviceDescription = Objects.requireNonNull(serviceDescription);
            return this;
        }
        public Builder serviceDomain(String serviceDomain) {
            this.serviceDomain = Objects.requireNonNull(serviceDomain);
            return this;
        }
        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder vpcEndpointServiceName(String vpcEndpointServiceName) {
            this.vpcEndpointServiceName = Objects.requireNonNull(vpcEndpointServiceName);
            return this;
        }        public GetVpcEndpointServicesService build() {
            return new GetVpcEndpointServicesService(autoAcceptConnection, connectBandwidth, id, serviceBusinessStatus, serviceDescription, serviceDomain, serviceId, status, vpcEndpointServiceName);
        }
    }
}
