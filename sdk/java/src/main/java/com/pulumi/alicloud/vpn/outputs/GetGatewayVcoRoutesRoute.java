// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayVcoRoutesRoute {
    /**
     * @return List of autonomous system numbers through which BGP routing entries pass.
     * 
     */
    private final String asPath;
    /**
     * @return The creation time of the VPN destination route.
     * 
     */
    private final String createTime;
    /**
     * @return The ID of the Vpn Gateway Vco Routes.
     * 
     */
    private final String id;
    /**
     * @return The next hop of the destination route.
     * 
     */
    private final String nextHop;
    /**
     * @return The destination network segment of the destination route.
     * 
     */
    private final String routeDest;
    /**
     * @return The source CIDR block of the destination route.
     * 
     */
    private final String source;
    /**
     * @return The status of the vpn route entry.
     * 
     */
    private final String status;
    /**
     * @return The id of the vpn connection.
     * 
     */
    private final String vpnConnectionId;
    /**
     * @return The weight value of the destination route.
     * 
     */
    private final Integer weight;

    @CustomType.Constructor
    private GetGatewayVcoRoutesRoute(
        @CustomType.Parameter("asPath") String asPath,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("nextHop") String nextHop,
        @CustomType.Parameter("routeDest") String routeDest,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("vpnConnectionId") String vpnConnectionId,
        @CustomType.Parameter("weight") Integer weight) {
        this.asPath = asPath;
        this.createTime = createTime;
        this.id = id;
        this.nextHop = nextHop;
        this.routeDest = routeDest;
        this.source = source;
        this.status = status;
        this.vpnConnectionId = vpnConnectionId;
        this.weight = weight;
    }

    /**
     * @return List of autonomous system numbers through which BGP routing entries pass.
     * 
     */
    public String asPath() {
        return this.asPath;
    }
    /**
     * @return The creation time of the VPN destination route.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The ID of the Vpn Gateway Vco Routes.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The next hop of the destination route.
     * 
     */
    public String nextHop() {
        return this.nextHop;
    }
    /**
     * @return The destination network segment of the destination route.
     * 
     */
    public String routeDest() {
        return this.routeDest;
    }
    /**
     * @return The source CIDR block of the destination route.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return The status of the vpn route entry.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The id of the vpn connection.
     * 
     */
    public String vpnConnectionId() {
        return this.vpnConnectionId;
    }
    /**
     * @return The weight value of the destination route.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayVcoRoutesRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String asPath;
        private String createTime;
        private String id;
        private String nextHop;
        private String routeDest;
        private String source;
        private String status;
        private String vpnConnectionId;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayVcoRoutesRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asPath = defaults.asPath;
    	      this.createTime = defaults.createTime;
    	      this.id = defaults.id;
    	      this.nextHop = defaults.nextHop;
    	      this.routeDest = defaults.routeDest;
    	      this.source = defaults.source;
    	      this.status = defaults.status;
    	      this.vpnConnectionId = defaults.vpnConnectionId;
    	      this.weight = defaults.weight;
        }

        public Builder asPath(String asPath) {
            this.asPath = Objects.requireNonNull(asPath);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder nextHop(String nextHop) {
            this.nextHop = Objects.requireNonNull(nextHop);
            return this;
        }
        public Builder routeDest(String routeDest) {
            this.routeDest = Objects.requireNonNull(routeDest);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = Objects.requireNonNull(vpnConnectionId);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public GetGatewayVcoRoutesRoute build() {
            return new GetGatewayVcoRoutesRoute(asPath, createTime, id, nextHop, routeDest, source, status, vpnConnectionId, weight);
        }
    }
}
