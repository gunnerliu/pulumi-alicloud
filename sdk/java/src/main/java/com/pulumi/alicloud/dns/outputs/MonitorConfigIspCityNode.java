// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MonitorConfigIspCityNode {
    /**
     * @return The code of the city node to monitor.
     * 
     */
    private String cityCode;
    /**
     * @return The code of the Internet provider service (ISP) node to monitor.
     * 
     */
    private String ispCode;

    private MonitorConfigIspCityNode() {}
    /**
     * @return The code of the city node to monitor.
     * 
     */
    public String cityCode() {
        return this.cityCode;
    }
    /**
     * @return The code of the Internet provider service (ISP) node to monitor.
     * 
     */
    public String ispCode() {
        return this.ispCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorConfigIspCityNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cityCode;
        private String ispCode;
        public Builder() {}
        public Builder(MonitorConfigIspCityNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cityCode = defaults.cityCode;
    	      this.ispCode = defaults.ispCode;
        }

        @CustomType.Setter
        public Builder cityCode(String cityCode) {
            this.cityCode = Objects.requireNonNull(cityCode);
            return this;
        }
        @CustomType.Setter
        public Builder ispCode(String ispCode) {
            this.ispCode = Objects.requireNonNull(ispCode);
            return this;
        }
        public MonitorConfigIspCityNode build() {
            final var o = new MonitorConfigIspCityNode();
            o.cityCode = cityCode;
            o.ispCode = ispCode;
            return o;
        }
    }
}
