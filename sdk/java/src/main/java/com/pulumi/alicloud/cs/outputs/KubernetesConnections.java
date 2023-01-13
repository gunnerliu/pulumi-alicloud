// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesConnections {
    /**
     * @return API Server Internet endpoint.
     * 
     */
    private @Nullable String apiServerInternet;
    /**
     * @return API Server Intranet endpoint.
     * 
     */
    private @Nullable String apiServerIntranet;
    /**
     * @return Master node SSH IP address.
     * 
     */
    private @Nullable String masterPublicIp;
    /**
     * @return Service Access Domain.
     * 
     */
    private @Nullable String serviceDomain;

    private KubernetesConnections() {}
    /**
     * @return API Server Internet endpoint.
     * 
     */
    public Optional<String> apiServerInternet() {
        return Optional.ofNullable(this.apiServerInternet);
    }
    /**
     * @return API Server Intranet endpoint.
     * 
     */
    public Optional<String> apiServerIntranet() {
        return Optional.ofNullable(this.apiServerIntranet);
    }
    /**
     * @return Master node SSH IP address.
     * 
     */
    public Optional<String> masterPublicIp() {
        return Optional.ofNullable(this.masterPublicIp);
    }
    /**
     * @return Service Access Domain.
     * 
     */
    public Optional<String> serviceDomain() {
        return Optional.ofNullable(this.serviceDomain);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesConnections defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiServerInternet;
        private @Nullable String apiServerIntranet;
        private @Nullable String masterPublicIp;
        private @Nullable String serviceDomain;
        public Builder() {}
        public Builder(KubernetesConnections defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiServerInternet = defaults.apiServerInternet;
    	      this.apiServerIntranet = defaults.apiServerIntranet;
    	      this.masterPublicIp = defaults.masterPublicIp;
    	      this.serviceDomain = defaults.serviceDomain;
        }

        @CustomType.Setter
        public Builder apiServerInternet(@Nullable String apiServerInternet) {
            this.apiServerInternet = apiServerInternet;
            return this;
        }
        @CustomType.Setter
        public Builder apiServerIntranet(@Nullable String apiServerIntranet) {
            this.apiServerIntranet = apiServerIntranet;
            return this;
        }
        @CustomType.Setter
        public Builder masterPublicIp(@Nullable String masterPublicIp) {
            this.masterPublicIp = masterPublicIp;
            return this;
        }
        @CustomType.Setter
        public Builder serviceDomain(@Nullable String serviceDomain) {
            this.serviceDomain = serviceDomain;
            return this;
        }
        public KubernetesConnections build() {
            final var o = new KubernetesConnections();
            o.apiServerInternet = apiServerInternet;
            o.apiServerIntranet = apiServerIntranet;
            o.masterPublicIp = masterPublicIp;
            o.serviceDomain = serviceDomain;
            return o;
        }
    }
}
