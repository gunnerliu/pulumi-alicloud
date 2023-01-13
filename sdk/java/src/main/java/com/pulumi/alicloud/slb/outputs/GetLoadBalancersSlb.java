// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetLoadBalancersSlb {
    /**
     * @return Service address of the SLBs.
     * 
     */
    private String address;
    /**
     * @return SLB creation time.
     * 
     */
    private String creationTime;
    /**
     * @return ID of the SLB.
     * 
     */
    private String id;
    /**
     * @return SLB addressType: internet if `true`, intranet if `false`. Must be `false` when `network_type` is `vpc`.
     * 
     */
    private Boolean internet;
    /**
     * @return Master availability zone of the SLBs.
     * 
     */
    private String masterAvailabilityZone;
    /**
     * @return SLB name.
     * 
     */
    private String name;
    /**
     * @return Network type of the SLBs. Valid values: `vpc` and `classic`.
     * 
     */
    private String networkType;
    /**
     * @return Region ID the SLB belongs to.
     * 
     */
    private String regionId;
    /**
     * @return Slave availability zone of the SLBs.
     * 
     */
    private String slaveAvailabilityZone;
    /**
     * @return SLB current status. Possible values: `inactive`, `active` and `locked`.
     * 
     */
    private String status;
    /**
     * @return A map of tags assigned to the SLB instances. The `tags` can have a maximum of 5 tag. It must be in the format:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.slb.SlbFunctions;
     * import com.pulumi.alicloud.alb.inputs.GetLoadBalancersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var taggedInstances = SlbFunctions.getLoadBalancers(GetLoadBalancersArgs.builder()
     *             .tags(Map.ofEntries(
     *                 Map.entry(&#34;tagKey1&#34;, &#34;tagValue1&#34;),
     *                 Map.entry(&#34;tagKey2&#34;, &#34;tagValue2&#34;)
     *             ))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    private Map<String,Object> tags;
    /**
     * @return ID of the VPC linked to the SLBs.
     * 
     */
    private String vpcId;
    /**
     * @return ID of the VSwitch linked to the SLBs.
     * 
     */
    private String vswitchId;

    private GetLoadBalancersSlb() {}
    /**
     * @return Service address of the SLBs.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return SLB creation time.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return ID of the SLB.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return SLB addressType: internet if `true`, intranet if `false`. Must be `false` when `network_type` is `vpc`.
     * 
     */
    public Boolean internet() {
        return this.internet;
    }
    /**
     * @return Master availability zone of the SLBs.
     * 
     */
    public String masterAvailabilityZone() {
        return this.masterAvailabilityZone;
    }
    /**
     * @return SLB name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Network type of the SLBs. Valid values: `vpc` and `classic`.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return Region ID the SLB belongs to.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return Slave availability zone of the SLBs.
     * 
     */
    public String slaveAvailabilityZone() {
        return this.slaveAvailabilityZone;
    }
    /**
     * @return SLB current status. Possible values: `inactive`, `active` and `locked`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A map of tags assigned to the SLB instances. The `tags` can have a maximum of 5 tag. It must be in the format:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.slb.SlbFunctions;
     * import com.pulumi.alicloud.alb.inputs.GetLoadBalancersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var taggedInstances = SlbFunctions.getLoadBalancers(GetLoadBalancersArgs.builder()
     *             .tags(Map.ofEntries(
     *                 Map.entry(&#34;tagKey1&#34;, &#34;tagValue1&#34;),
     *                 Map.entry(&#34;tagKey2&#34;, &#34;tagValue2&#34;)
     *             ))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return ID of the VPC linked to the SLBs.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return ID of the VSwitch linked to the SLBs.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersSlb defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String creationTime;
        private String id;
        private Boolean internet;
        private String masterAvailabilityZone;
        private String name;
        private String networkType;
        private String regionId;
        private String slaveAvailabilityZone;
        private String status;
        private Map<String,Object> tags;
        private String vpcId;
        private String vswitchId;
        public Builder() {}
        public Builder(GetLoadBalancersSlb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.creationTime = defaults.creationTime;
    	      this.id = defaults.id;
    	      this.internet = defaults.internet;
    	      this.masterAvailabilityZone = defaults.masterAvailabilityZone;
    	      this.name = defaults.name;
    	      this.networkType = defaults.networkType;
    	      this.regionId = defaults.regionId;
    	      this.slaveAvailabilityZone = defaults.slaveAvailabilityZone;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        @CustomType.Setter
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder internet(Boolean internet) {
            this.internet = Objects.requireNonNull(internet);
            return this;
        }
        @CustomType.Setter
        public Builder masterAvailabilityZone(String masterAvailabilityZone) {
            this.masterAvailabilityZone = Objects.requireNonNull(masterAvailabilityZone);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }
        @CustomType.Setter
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        @CustomType.Setter
        public Builder slaveAvailabilityZone(String slaveAvailabilityZone) {
            this.slaveAvailabilityZone = Objects.requireNonNull(slaveAvailabilityZone);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = Objects.requireNonNull(vswitchId);
            return this;
        }
        public GetLoadBalancersSlb build() {
            final var o = new GetLoadBalancersSlb();
            o.address = address;
            o.creationTime = creationTime;
            o.id = id;
            o.internet = internet;
            o.masterAvailabilityZone = masterAvailabilityZone;
            o.name = name;
            o.networkType = networkType;
            o.regionId = regionId;
            o.slaveAvailabilityZone = slaveAvailabilityZone;
            o.status = status;
            o.tags = tags;
            o.vpcId = vpcId;
            o.vswitchId = vswitchId;
            return o;
        }
    }
}
