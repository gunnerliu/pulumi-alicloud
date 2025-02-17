// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNatGatewaysGateway {
    /**
     * @return The state of the NAT gateway.
     * 
     */
    private String businessStatus;
    /**
     * @return Indicates whether deletion protection is enabled.
     * 
     */
    private Boolean deletionProtection;
    /**
     * @return The description of the NAT gateway.
     * 
     */
    private String description;
    /**
     * @return Indicates whether the traffic monitoring feature is enabled.
     * 
     */
    private Boolean ecsMetricEnabled;
    /**
     * @return The time when the NAT gateway expires.
     * 
     */
    private String expiredTime;
    /**
     * @return The ID of the DNAT table.
     * 
     */
    private List<String> forwardTableIds;
    /**
     * @return The ID of the NAT gateway.
     * 
     */
    private String id;
    /**
     * @return The metering method of the NAT gateway.
     * 
     */
    private String internetChargeType;
    /**
     * @return The ip address of the bind eip.
     * 
     */
    private List<String> ipLists;
    /**
     * @return Name of the NAT gateway.
     * 
     */
    private String name;
    /**
     * @return The ID of the NAT gateway.
     * 
     */
    private String natGatewayId;
    /**
     * @return The name of NAT gateway.
     * 
     */
    private String natGatewayName;
    /**
     * @return The nat type of NAT gateway. Valid values `Enhanced` and `Normal`.
     * 
     */
    private String natType;
    /**
     * @return (Available in 1.137.0+) Indicates the type of the created NAT gateway. Valid values `internet` and `intranet`.
     * 
     */
    private String networkType;
    /**
     * @return The payment type of NAT gateway. Valid values `PayAsYouGo` and `Subscription`.
     * 
     */
    private String paymentType;
    /**
     * @return The resource group id of NAT gateway.
     * 
     */
    private String resourceGroupId;
    /**
     * @return The ID of the SNAT table that is associated with the NAT gateway.
     * 
     */
    private List<String> snatTableIds;
    /**
     * @return The specification of the NAT gateway.
     * 
     */
    private String spec;
    /**
     * @return The specification of NAT gateway. Valid values `Middle`, `Large`, `Small` and `XLarge.1`. Default value is `Small`.
     * 
     */
    private String specification;
    /**
     * @return The status of NAT gateway. Valid values `Available`, `Converting`, `Creating`, `Deleting` and `Modifying`.
     * 
     */
    private String status;
    /**
     * @return The tags of NAT gateway.
     * 
     */
    private Map<String,Object> tags;
    /**
     * @return The ID of the VPC.
     * 
     */
    private String vpcId;
    /**
     * @return The ID of the vSwitch to which the NAT gateway belongs.
     * 
     */
    private String vswitchId;

    private GetNatGatewaysGateway() {}
    /**
     * @return The state of the NAT gateway.
     * 
     */
    public String businessStatus() {
        return this.businessStatus;
    }
    /**
     * @return Indicates whether deletion protection is enabled.
     * 
     */
    public Boolean deletionProtection() {
        return this.deletionProtection;
    }
    /**
     * @return The description of the NAT gateway.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Indicates whether the traffic monitoring feature is enabled.
     * 
     */
    public Boolean ecsMetricEnabled() {
        return this.ecsMetricEnabled;
    }
    /**
     * @return The time when the NAT gateway expires.
     * 
     */
    public String expiredTime() {
        return this.expiredTime;
    }
    /**
     * @return The ID of the DNAT table.
     * 
     */
    public List<String> forwardTableIds() {
        return this.forwardTableIds;
    }
    /**
     * @return The ID of the NAT gateway.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The metering method of the NAT gateway.
     * 
     */
    public String internetChargeType() {
        return this.internetChargeType;
    }
    /**
     * @return The ip address of the bind eip.
     * 
     */
    public List<String> ipLists() {
        return this.ipLists;
    }
    /**
     * @return Name of the NAT gateway.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the NAT gateway.
     * 
     */
    public String natGatewayId() {
        return this.natGatewayId;
    }
    /**
     * @return The name of NAT gateway.
     * 
     */
    public String natGatewayName() {
        return this.natGatewayName;
    }
    /**
     * @return The nat type of NAT gateway. Valid values `Enhanced` and `Normal`.
     * 
     */
    public String natType() {
        return this.natType;
    }
    /**
     * @return (Available in 1.137.0+) Indicates the type of the created NAT gateway. Valid values `internet` and `intranet`.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return The payment type of NAT gateway. Valid values `PayAsYouGo` and `Subscription`.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return The resource group id of NAT gateway.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The ID of the SNAT table that is associated with the NAT gateway.
     * 
     */
    public List<String> snatTableIds() {
        return this.snatTableIds;
    }
    /**
     * @return The specification of the NAT gateway.
     * 
     */
    public String spec() {
        return this.spec;
    }
    /**
     * @return The specification of NAT gateway. Valid values `Middle`, `Large`, `Small` and `XLarge.1`. Default value is `Small`.
     * 
     */
    public String specification() {
        return this.specification;
    }
    /**
     * @return The status of NAT gateway. Valid values `Available`, `Converting`, `Creating`, `Deleting` and `Modifying`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The tags of NAT gateway.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return The ID of the VPC.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The ID of the vSwitch to which the NAT gateway belongs.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatGatewaysGateway defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String businessStatus;
        private Boolean deletionProtection;
        private String description;
        private Boolean ecsMetricEnabled;
        private String expiredTime;
        private List<String> forwardTableIds;
        private String id;
        private String internetChargeType;
        private List<String> ipLists;
        private String name;
        private String natGatewayId;
        private String natGatewayName;
        private String natType;
        private String networkType;
        private String paymentType;
        private String resourceGroupId;
        private List<String> snatTableIds;
        private String spec;
        private String specification;
        private String status;
        private Map<String,Object> tags;
        private String vpcId;
        private String vswitchId;
        public Builder() {}
        public Builder(GetNatGatewaysGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.businessStatus = defaults.businessStatus;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.description = defaults.description;
    	      this.ecsMetricEnabled = defaults.ecsMetricEnabled;
    	      this.expiredTime = defaults.expiredTime;
    	      this.forwardTableIds = defaults.forwardTableIds;
    	      this.id = defaults.id;
    	      this.internetChargeType = defaults.internetChargeType;
    	      this.ipLists = defaults.ipLists;
    	      this.name = defaults.name;
    	      this.natGatewayId = defaults.natGatewayId;
    	      this.natGatewayName = defaults.natGatewayName;
    	      this.natType = defaults.natType;
    	      this.networkType = defaults.networkType;
    	      this.paymentType = defaults.paymentType;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.snatTableIds = defaults.snatTableIds;
    	      this.spec = defaults.spec;
    	      this.specification = defaults.specification;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder businessStatus(String businessStatus) {
            if (businessStatus == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "businessStatus");
            }
            this.businessStatus = businessStatus;
            return this;
        }
        @CustomType.Setter
        public Builder deletionProtection(Boolean deletionProtection) {
            if (deletionProtection == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "deletionProtection");
            }
            this.deletionProtection = deletionProtection;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder ecsMetricEnabled(Boolean ecsMetricEnabled) {
            if (ecsMetricEnabled == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "ecsMetricEnabled");
            }
            this.ecsMetricEnabled = ecsMetricEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder expiredTime(String expiredTime) {
            if (expiredTime == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "expiredTime");
            }
            this.expiredTime = expiredTime;
            return this;
        }
        @CustomType.Setter
        public Builder forwardTableIds(List<String> forwardTableIds) {
            if (forwardTableIds == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "forwardTableIds");
            }
            this.forwardTableIds = forwardTableIds;
            return this;
        }
        public Builder forwardTableIds(String... forwardTableIds) {
            return forwardTableIds(List.of(forwardTableIds));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder internetChargeType(String internetChargeType) {
            if (internetChargeType == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "internetChargeType");
            }
            this.internetChargeType = internetChargeType;
            return this;
        }
        @CustomType.Setter
        public Builder ipLists(List<String> ipLists) {
            if (ipLists == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "ipLists");
            }
            this.ipLists = ipLists;
            return this;
        }
        public Builder ipLists(String... ipLists) {
            return ipLists(List.of(ipLists));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder natGatewayId(String natGatewayId) {
            if (natGatewayId == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "natGatewayId");
            }
            this.natGatewayId = natGatewayId;
            return this;
        }
        @CustomType.Setter
        public Builder natGatewayName(String natGatewayName) {
            if (natGatewayName == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "natGatewayName");
            }
            this.natGatewayName = natGatewayName;
            return this;
        }
        @CustomType.Setter
        public Builder natType(String natType) {
            if (natType == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "natType");
            }
            this.natType = natType;
            return this;
        }
        @CustomType.Setter
        public Builder networkType(String networkType) {
            if (networkType == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "networkType");
            }
            this.networkType = networkType;
            return this;
        }
        @CustomType.Setter
        public Builder paymentType(String paymentType) {
            if (paymentType == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "paymentType");
            }
            this.paymentType = paymentType;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            if (resourceGroupId == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "resourceGroupId");
            }
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder snatTableIds(List<String> snatTableIds) {
            if (snatTableIds == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "snatTableIds");
            }
            this.snatTableIds = snatTableIds;
            return this;
        }
        public Builder snatTableIds(String... snatTableIds) {
            return snatTableIds(List.of(snatTableIds));
        }
        @CustomType.Setter
        public Builder spec(String spec) {
            if (spec == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "spec");
            }
            this.spec = spec;
            return this;
        }
        @CustomType.Setter
        public Builder specification(String specification) {
            if (specification == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "specification");
            }
            this.specification = specification;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            if (vswitchId == null) {
              throw new MissingRequiredPropertyException("GetNatGatewaysGateway", "vswitchId");
            }
            this.vswitchId = vswitchId;
            return this;
        }
        public GetNatGatewaysGateway build() {
            final var _resultValue = new GetNatGatewaysGateway();
            _resultValue.businessStatus = businessStatus;
            _resultValue.deletionProtection = deletionProtection;
            _resultValue.description = description;
            _resultValue.ecsMetricEnabled = ecsMetricEnabled;
            _resultValue.expiredTime = expiredTime;
            _resultValue.forwardTableIds = forwardTableIds;
            _resultValue.id = id;
            _resultValue.internetChargeType = internetChargeType;
            _resultValue.ipLists = ipLists;
            _resultValue.name = name;
            _resultValue.natGatewayId = natGatewayId;
            _resultValue.natGatewayName = natGatewayName;
            _resultValue.natType = natType;
            _resultValue.networkType = networkType;
            _resultValue.paymentType = paymentType;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.snatTableIds = snatTableIds;
            _resultValue.spec = spec;
            _resultValue.specification = specification;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchId = vswitchId;
            return _resultValue;
        }
    }
}
