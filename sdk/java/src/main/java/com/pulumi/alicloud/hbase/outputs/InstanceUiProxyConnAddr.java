// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbase.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceUiProxyConnAddr {
    /**
     * @return The Phoenix address.
     * 
     */
    private @Nullable String connAddr;
    /**
     * @return The number of the port over which Phoenix connects to the instance.
     * 
     */
    private @Nullable String connAddrPort;
    /**
     * @return The type of the network. Valid values:
     * 
     */
    private @Nullable String netType;

    private InstanceUiProxyConnAddr() {}
    /**
     * @return The Phoenix address.
     * 
     */
    public Optional<String> connAddr() {
        return Optional.ofNullable(this.connAddr);
    }
    /**
     * @return The number of the port over which Phoenix connects to the instance.
     * 
     */
    public Optional<String> connAddrPort() {
        return Optional.ofNullable(this.connAddrPort);
    }
    /**
     * @return The type of the network. Valid values:
     * 
     */
    public Optional<String> netType() {
        return Optional.ofNullable(this.netType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceUiProxyConnAddr defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String connAddr;
        private @Nullable String connAddrPort;
        private @Nullable String netType;
        public Builder() {}
        public Builder(InstanceUiProxyConnAddr defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connAddr = defaults.connAddr;
    	      this.connAddrPort = defaults.connAddrPort;
    	      this.netType = defaults.netType;
        }

        @CustomType.Setter
        public Builder connAddr(@Nullable String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        @CustomType.Setter
        public Builder connAddrPort(@Nullable String connAddrPort) {
            this.connAddrPort = connAddrPort;
            return this;
        }
        @CustomType.Setter
        public Builder netType(@Nullable String netType) {
            this.netType = netType;
            return this;
        }
        public InstanceUiProxyConnAddr build() {
            final var _resultValue = new InstanceUiProxyConnAddr();
            _resultValue.connAddr = connAddr;
            _resultValue.connAddrPort = connAddrPort;
            _resultValue.netType = netType;
            return _resultValue;
        }
    }
}
