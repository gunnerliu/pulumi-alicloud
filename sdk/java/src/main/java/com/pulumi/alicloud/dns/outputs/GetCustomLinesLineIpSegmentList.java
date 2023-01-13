// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCustomLinesLineIpSegmentList {
    /**
     * @return The end IP address of the CIDR block.
     * 
     */
    private String endIp;
    /**
     * @return The start IP address of the CIDR block.
     * 
     */
    private String startIp;

    private GetCustomLinesLineIpSegmentList() {}
    /**
     * @return The end IP address of the CIDR block.
     * 
     */
    public String endIp() {
        return this.endIp;
    }
    /**
     * @return The start IP address of the CIDR block.
     * 
     */
    public String startIp() {
        return this.startIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomLinesLineIpSegmentList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endIp;
        private String startIp;
        public Builder() {}
        public Builder(GetCustomLinesLineIpSegmentList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIp = defaults.endIp;
    	      this.startIp = defaults.startIp;
        }

        @CustomType.Setter
        public Builder endIp(String endIp) {
            this.endIp = Objects.requireNonNull(endIp);
            return this;
        }
        @CustomType.Setter
        public Builder startIp(String startIp) {
            this.startIp = Objects.requireNonNull(startIp);
            return this;
        }
        public GetCustomLinesLineIpSegmentList build() {
            final var o = new GetCustomLinesLineIpSegmentList();
            o.endIp = endIp;
            o.startIp = startIp;
            return o;
        }
    }
}
