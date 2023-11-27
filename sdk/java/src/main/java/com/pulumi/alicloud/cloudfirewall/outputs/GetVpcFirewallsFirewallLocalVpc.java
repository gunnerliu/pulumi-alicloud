// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.outputs;

import com.pulumi.alicloud.cloudfirewall.outputs.GetVpcFirewallsFirewallLocalVpcLocalVpcCidrTableList;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVpcFirewallsFirewallLocalVpc {
    private String eniId;
    private String eniPrivateIpAddress;
    /**
     * @return The network segment list of the local VPC.
     * 
     */
    private List<GetVpcFirewallsFirewallLocalVpcLocalVpcCidrTableList> localVpcCidrTableLists;
    /**
     * @return The region ID of the peer VPC.
     * 
     */
    private String regionNo;
    private String routerInterfaceId;
    /**
     * @return The ID of the peer VPC instance.
     * 
     */
    private String vpcId;
    /**
     * @return The instance name of the peer VPC.
     * 
     */
    private String vpcName;

    private GetVpcFirewallsFirewallLocalVpc() {}
    public String eniId() {
        return this.eniId;
    }
    public String eniPrivateIpAddress() {
        return this.eniPrivateIpAddress;
    }
    /**
     * @return The network segment list of the local VPC.
     * 
     */
    public List<GetVpcFirewallsFirewallLocalVpcLocalVpcCidrTableList> localVpcCidrTableLists() {
        return this.localVpcCidrTableLists;
    }
    /**
     * @return The region ID of the peer VPC.
     * 
     */
    public String regionNo() {
        return this.regionNo;
    }
    public String routerInterfaceId() {
        return this.routerInterfaceId;
    }
    /**
     * @return The ID of the peer VPC instance.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The instance name of the peer VPC.
     * 
     */
    public String vpcName() {
        return this.vpcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcFirewallsFirewallLocalVpc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String eniId;
        private String eniPrivateIpAddress;
        private List<GetVpcFirewallsFirewallLocalVpcLocalVpcCidrTableList> localVpcCidrTableLists;
        private String regionNo;
        private String routerInterfaceId;
        private String vpcId;
        private String vpcName;
        public Builder() {}
        public Builder(GetVpcFirewallsFirewallLocalVpc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eniId = defaults.eniId;
    	      this.eniPrivateIpAddress = defaults.eniPrivateIpAddress;
    	      this.localVpcCidrTableLists = defaults.localVpcCidrTableLists;
    	      this.regionNo = defaults.regionNo;
    	      this.routerInterfaceId = defaults.routerInterfaceId;
    	      this.vpcId = defaults.vpcId;
    	      this.vpcName = defaults.vpcName;
        }

        @CustomType.Setter
        public Builder eniId(String eniId) {
            this.eniId = Objects.requireNonNull(eniId);
            return this;
        }
        @CustomType.Setter
        public Builder eniPrivateIpAddress(String eniPrivateIpAddress) {
            this.eniPrivateIpAddress = Objects.requireNonNull(eniPrivateIpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder localVpcCidrTableLists(List<GetVpcFirewallsFirewallLocalVpcLocalVpcCidrTableList> localVpcCidrTableLists) {
            this.localVpcCidrTableLists = Objects.requireNonNull(localVpcCidrTableLists);
            return this;
        }
        public Builder localVpcCidrTableLists(GetVpcFirewallsFirewallLocalVpcLocalVpcCidrTableList... localVpcCidrTableLists) {
            return localVpcCidrTableLists(List.of(localVpcCidrTableLists));
        }
        @CustomType.Setter
        public Builder regionNo(String regionNo) {
            this.regionNo = Objects.requireNonNull(regionNo);
            return this;
        }
        @CustomType.Setter
        public Builder routerInterfaceId(String routerInterfaceId) {
            this.routerInterfaceId = Objects.requireNonNull(routerInterfaceId);
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        @CustomType.Setter
        public Builder vpcName(String vpcName) {
            this.vpcName = Objects.requireNonNull(vpcName);
            return this;
        }
        public GetVpcFirewallsFirewallLocalVpc build() {
            final var _resultValue = new GetVpcFirewallsFirewallLocalVpc();
            _resultValue.eniId = eniId;
            _resultValue.eniPrivateIpAddress = eniPrivateIpAddress;
            _resultValue.localVpcCidrTableLists = localVpcCidrTableLists;
            _resultValue.regionNo = regionNo;
            _resultValue.routerInterfaceId = routerInterfaceId;
            _resultValue.vpcId = vpcId;
            _resultValue.vpcName = vpcName;
            return _resultValue;
        }
    }
}
