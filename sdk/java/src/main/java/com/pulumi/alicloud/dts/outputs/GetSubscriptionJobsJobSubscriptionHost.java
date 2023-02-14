// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dts.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSubscriptionJobsJobSubscriptionHost {
    /**
     * @return Classic network address.
     * 
     */
    private String privateHost;
    /**
     * @return Public network address.
     * 
     */
    private String publicHost;
    /**
     * @return VPC network address.
     * 
     */
    private String vpcHost;

    private GetSubscriptionJobsJobSubscriptionHost() {}
    /**
     * @return Classic network address.
     * 
     */
    public String privateHost() {
        return this.privateHost;
    }
    /**
     * @return Public network address.
     * 
     */
    public String publicHost() {
        return this.publicHost;
    }
    /**
     * @return VPC network address.
     * 
     */
    public String vpcHost() {
        return this.vpcHost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionJobsJobSubscriptionHost defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String privateHost;
        private String publicHost;
        private String vpcHost;
        public Builder() {}
        public Builder(GetSubscriptionJobsJobSubscriptionHost defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateHost = defaults.privateHost;
    	      this.publicHost = defaults.publicHost;
    	      this.vpcHost = defaults.vpcHost;
        }

        @CustomType.Setter
        public Builder privateHost(String privateHost) {
            this.privateHost = Objects.requireNonNull(privateHost);
            return this;
        }
        @CustomType.Setter
        public Builder publicHost(String publicHost) {
            this.publicHost = Objects.requireNonNull(publicHost);
            return this;
        }
        @CustomType.Setter
        public Builder vpcHost(String vpcHost) {
            this.vpcHost = Objects.requireNonNull(vpcHost);
            return this;
        }
        public GetSubscriptionJobsJobSubscriptionHost build() {
            final var o = new GetSubscriptionJobsJobSubscriptionHost();
            o.privateHost = privateHost;
            o.publicHost = publicHost;
            o.vpcHost = vpcHost;
            return o;
        }
    }
}