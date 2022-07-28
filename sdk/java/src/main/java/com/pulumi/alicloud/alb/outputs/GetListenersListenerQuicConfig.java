// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetListenersListenerQuicConfig {
    /**
     * @return The ID of the QUIC listener to be associated. If QuicUpgradeEnabled is set to true, this parameter is required. Only HTTPS listeners support this parameter.
     * 
     */
    private final String quicListenerId;
    /**
     * @return Indicates whether quic upgrade is enabled. Valid values: true and false. Default value: false.
     * 
     */
    private final Boolean quicUpgradeEnabled;

    @CustomType.Constructor
    private GetListenersListenerQuicConfig(
        @CustomType.Parameter("quicListenerId") String quicListenerId,
        @CustomType.Parameter("quicUpgradeEnabled") Boolean quicUpgradeEnabled) {
        this.quicListenerId = quicListenerId;
        this.quicUpgradeEnabled = quicUpgradeEnabled;
    }

    /**
     * @return The ID of the QUIC listener to be associated. If QuicUpgradeEnabled is set to true, this parameter is required. Only HTTPS listeners support this parameter.
     * 
     */
    public String quicListenerId() {
        return this.quicListenerId;
    }
    /**
     * @return Indicates whether quic upgrade is enabled. Valid values: true and false. Default value: false.
     * 
     */
    public Boolean quicUpgradeEnabled() {
        return this.quicUpgradeEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenersListenerQuicConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String quicListenerId;
        private Boolean quicUpgradeEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenersListenerQuicConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quicListenerId = defaults.quicListenerId;
    	      this.quicUpgradeEnabled = defaults.quicUpgradeEnabled;
        }

        public Builder quicListenerId(String quicListenerId) {
            this.quicListenerId = Objects.requireNonNull(quicListenerId);
            return this;
        }
        public Builder quicUpgradeEnabled(Boolean quicUpgradeEnabled) {
            this.quicUpgradeEnabled = Objects.requireNonNull(quicUpgradeEnabled);
            return this;
        }        public GetListenersListenerQuicConfig build() {
            return new GetListenersListenerQuicConfig(quicListenerId, quicUpgradeEnabled);
        }
    }
}
