// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.alicloud.slb.outputs.GetLoadBalancersBalancer;
import com.pulumi.alicloud.slb.outputs.GetLoadBalancersSlb;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLoadBalancersResult {
    /**
     * @return Service address of the SLB.
     * 
     */
    private final @Nullable String address;
    private final @Nullable String addressIpVersion;
    private final @Nullable String addressType;
    private final List<GetLoadBalancersBalancer> balancers;
    private final @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of slb IDs.
     * 
     */
    private final List<String> ids;
    private final @Nullable String internetChargeType;
    private final @Nullable String loadBalancerName;
    private final @Nullable String masterZoneId;
    private final @Nullable String nameRegex;
    /**
     * @return A list of slb names.
     * 
     */
    private final List<String> names;
    /**
     * @return Network type of the SLB. Possible values: `vpc` and `classic`.
     * 
     */
    private final @Nullable String networkType;
    private final @Nullable String outputFile;
    private final @Nullable Integer pageNumber;
    private final @Nullable Integer pageSize;
    private final @Nullable String paymentType;
    private final @Nullable String resourceGroupId;
    private final @Nullable String serverId;
    private final @Nullable String serverIntranetAddress;
    private final @Nullable String slaveZoneId;
    /**
     * @return A list of SLBs. Each element contains the following attributes:
     * 
     * @deprecated
     * Field &#39;slbs&#39; has deprecated from v1.123.1 and replace by &#39;balancers&#39;.
     * 
     */
    @Deprecated /* Field 'slbs' has deprecated from v1.123.1 and replace by 'balancers'. */
    private final List<GetLoadBalancersSlb> slbs;
    /**
     * @return SLB current status. Possible values: `inactive`, `active` and `locked`.
     * 
     */
    private final @Nullable String status;
    /**
     * @return A map of tags assigned to the SLB instance.
     * 
     */
    private final @Nullable Map<String,Object> tags;
    private final Integer totalCount;
    /**
     * @return ID of the VPC the SLB belongs to.
     * 
     */
    private final @Nullable String vpcId;
    /**
     * @return ID of the VSwitch the SLB belongs to.
     * 
     */
    private final @Nullable String vswitchId;

    @CustomType.Constructor
    private GetLoadBalancersResult(
        @CustomType.Parameter("address") @Nullable String address,
        @CustomType.Parameter("addressIpVersion") @Nullable String addressIpVersion,
        @CustomType.Parameter("addressType") @Nullable String addressType,
        @CustomType.Parameter("balancers") List<GetLoadBalancersBalancer> balancers,
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("internetChargeType") @Nullable String internetChargeType,
        @CustomType.Parameter("loadBalancerName") @Nullable String loadBalancerName,
        @CustomType.Parameter("masterZoneId") @Nullable String masterZoneId,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("networkType") @Nullable String networkType,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("pageNumber") @Nullable Integer pageNumber,
        @CustomType.Parameter("pageSize") @Nullable Integer pageSize,
        @CustomType.Parameter("paymentType") @Nullable String paymentType,
        @CustomType.Parameter("resourceGroupId") @Nullable String resourceGroupId,
        @CustomType.Parameter("serverId") @Nullable String serverId,
        @CustomType.Parameter("serverIntranetAddress") @Nullable String serverIntranetAddress,
        @CustomType.Parameter("slaveZoneId") @Nullable String slaveZoneId,
        @CustomType.Parameter("slbs") List<GetLoadBalancersSlb> slbs,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("tags") @Nullable Map<String,Object> tags,
        @CustomType.Parameter("totalCount") Integer totalCount,
        @CustomType.Parameter("vpcId") @Nullable String vpcId,
        @CustomType.Parameter("vswitchId") @Nullable String vswitchId) {
        this.address = address;
        this.addressIpVersion = addressIpVersion;
        this.addressType = addressType;
        this.balancers = balancers;
        this.enableDetails = enableDetails;
        this.id = id;
        this.ids = ids;
        this.internetChargeType = internetChargeType;
        this.loadBalancerName = loadBalancerName;
        this.masterZoneId = masterZoneId;
        this.nameRegex = nameRegex;
        this.names = names;
        this.networkType = networkType;
        this.outputFile = outputFile;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.paymentType = paymentType;
        this.resourceGroupId = resourceGroupId;
        this.serverId = serverId;
        this.serverIntranetAddress = serverIntranetAddress;
        this.slaveZoneId = slaveZoneId;
        this.slbs = slbs;
        this.status = status;
        this.tags = tags;
        this.totalCount = totalCount;
        this.vpcId = vpcId;
        this.vswitchId = vswitchId;
    }

    /**
     * @return Service address of the SLB.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    public Optional<String> addressIpVersion() {
        return Optional.ofNullable(this.addressIpVersion);
    }
    public Optional<String> addressType() {
        return Optional.ofNullable(this.addressType);
    }
    public List<GetLoadBalancersBalancer> balancers() {
        return this.balancers;
    }
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of slb IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> internetChargeType() {
        return Optional.ofNullable(this.internetChargeType);
    }
    public Optional<String> loadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
    }
    public Optional<String> masterZoneId() {
        return Optional.ofNullable(this.masterZoneId);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of slb names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    /**
     * @return Network type of the SLB. Possible values: `vpc` and `classic`.
     * 
     */
    public Optional<String> networkType() {
        return Optional.ofNullable(this.networkType);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }
    public Optional<String> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }
    public Optional<String> serverId() {
        return Optional.ofNullable(this.serverId);
    }
    public Optional<String> serverIntranetAddress() {
        return Optional.ofNullable(this.serverIntranetAddress);
    }
    public Optional<String> slaveZoneId() {
        return Optional.ofNullable(this.slaveZoneId);
    }
    /**
     * @return A list of SLBs. Each element contains the following attributes:
     * 
     * @deprecated
     * Field &#39;slbs&#39; has deprecated from v1.123.1 and replace by &#39;balancers&#39;.
     * 
     */
    @Deprecated /* Field 'slbs' has deprecated from v1.123.1 and replace by 'balancers'. */
    public List<GetLoadBalancersSlb> slbs() {
        return this.slbs;
    }
    /**
     * @return SLB current status. Possible values: `inactive`, `active` and `locked`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return A map of tags assigned to the SLB instance.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Integer totalCount() {
        return this.totalCount;
    }
    /**
     * @return ID of the VPC the SLB belongs to.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }
    /**
     * @return ID of the VSwitch the SLB belongs to.
     * 
     */
    public Optional<String> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String addressIpVersion;
        private @Nullable String addressType;
        private List<GetLoadBalancersBalancer> balancers;
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String internetChargeType;
        private @Nullable String loadBalancerName;
        private @Nullable String masterZoneId;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String networkType;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        private @Nullable String paymentType;
        private @Nullable String resourceGroupId;
        private @Nullable String serverId;
        private @Nullable String serverIntranetAddress;
        private @Nullable String slaveZoneId;
        private List<GetLoadBalancersSlb> slbs;
        private @Nullable String status;
        private @Nullable Map<String,Object> tags;
        private Integer totalCount;
        private @Nullable String vpcId;
        private @Nullable String vswitchId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressIpVersion = defaults.addressIpVersion;
    	      this.addressType = defaults.addressType;
    	      this.balancers = defaults.balancers;
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.internetChargeType = defaults.internetChargeType;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.masterZoneId = defaults.masterZoneId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.networkType = defaults.networkType;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
    	      this.paymentType = defaults.paymentType;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.serverId = defaults.serverId;
    	      this.serverIntranetAddress = defaults.serverIntranetAddress;
    	      this.slaveZoneId = defaults.slaveZoneId;
    	      this.slbs = defaults.slbs;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.totalCount = defaults.totalCount;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        public Builder addressIpVersion(@Nullable String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }
        public Builder addressType(@Nullable String addressType) {
            this.addressType = addressType;
            return this;
        }
        public Builder balancers(List<GetLoadBalancersBalancer> balancers) {
            this.balancers = Objects.requireNonNull(balancers);
            return this;
        }
        public Builder balancers(GetLoadBalancersBalancer... balancers) {
            return balancers(List.of(balancers));
        }
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder internetChargeType(@Nullable String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public Builder loadBalancerName(@Nullable String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public Builder masterZoneId(@Nullable String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder networkType(@Nullable String networkType) {
            this.networkType = networkType;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder pageNumber(@Nullable Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Builder pageSize(@Nullable Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Builder paymentType(@Nullable String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Builder serverId(@Nullable String serverId) {
            this.serverId = serverId;
            return this;
        }
        public Builder serverIntranetAddress(@Nullable String serverIntranetAddress) {
            this.serverIntranetAddress = serverIntranetAddress;
            return this;
        }
        public Builder slaveZoneId(@Nullable String slaveZoneId) {
            this.slaveZoneId = slaveZoneId;
            return this;
        }
        public Builder slbs(List<GetLoadBalancersSlb> slbs) {
            this.slbs = Objects.requireNonNull(slbs);
            return this;
        }
        public Builder slbs(GetLoadBalancersSlb... slbs) {
            return slbs(List.of(slbs));
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }
        public Builder totalCount(Integer totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vswitchId(@Nullable String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }        public GetLoadBalancersResult build() {
            return new GetLoadBalancersResult(address, addressIpVersion, addressType, balancers, enableDetails, id, ids, internetChargeType, loadBalancerName, masterZoneId, nameRegex, names, networkType, outputFile, pageNumber, pageSize, paymentType, resourceGroupId, serverId, serverIntranetAddress, slaveZoneId, slbs, status, tags, totalCount, vpcId, vswitchId);
        }
    }
}
