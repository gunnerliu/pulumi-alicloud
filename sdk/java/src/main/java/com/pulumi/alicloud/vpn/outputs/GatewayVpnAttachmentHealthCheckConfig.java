// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayVpnAttachmentHealthCheckConfig {
    /**
     * @return The destination IP address that is used for health checks.
     * 
     */
    private @Nullable String dip;
    /**
     * @return Specifies whether to enable health checks.
     * 
     */
    private @Nullable Boolean enable;
    /**
     * @return The interval between two consecutive health checks. Unit: seconds.
     * 
     */
    private @Nullable Integer interval;
    /**
     * @return Whether to revoke the published route when the health check fails. Valid values: `revoke_route` or `reserve_route`.
     * 
     */
    private @Nullable String policy;
    /**
     * @return The maximum number of health check retries.
     * 
     */
    private @Nullable Integer retry;
    /**
     * @return The source IP address that is used for health checks.
     * 
     */
    private @Nullable String sip;

    private GatewayVpnAttachmentHealthCheckConfig() {}
    /**
     * @return The destination IP address that is used for health checks.
     * 
     */
    public Optional<String> dip() {
        return Optional.ofNullable(this.dip);
    }
    /**
     * @return Specifies whether to enable health checks.
     * 
     */
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }
    /**
     * @return The interval between two consecutive health checks. Unit: seconds.
     * 
     */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * @return Whether to revoke the published route when the health check fails. Valid values: `revoke_route` or `reserve_route`.
     * 
     */
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * @return The maximum number of health check retries.
     * 
     */
    public Optional<Integer> retry() {
        return Optional.ofNullable(this.retry);
    }
    /**
     * @return The source IP address that is used for health checks.
     * 
     */
    public Optional<String> sip() {
        return Optional.ofNullable(this.sip);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayVpnAttachmentHealthCheckConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String dip;
        private @Nullable Boolean enable;
        private @Nullable Integer interval;
        private @Nullable String policy;
        private @Nullable Integer retry;
        private @Nullable String sip;
        public Builder() {}
        public Builder(GatewayVpnAttachmentHealthCheckConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dip = defaults.dip;
    	      this.enable = defaults.enable;
    	      this.interval = defaults.interval;
    	      this.policy = defaults.policy;
    	      this.retry = defaults.retry;
    	      this.sip = defaults.sip;
        }

        @CustomType.Setter
        public Builder dip(@Nullable String dip) {
            this.dip = dip;
            return this;
        }
        @CustomType.Setter
        public Builder enable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }
        @CustomType.Setter
        public Builder policy(@Nullable String policy) {
            this.policy = policy;
            return this;
        }
        @CustomType.Setter
        public Builder retry(@Nullable Integer retry) {
            this.retry = retry;
            return this;
        }
        @CustomType.Setter
        public Builder sip(@Nullable String sip) {
            this.sip = sip;
            return this;
        }
        public GatewayVpnAttachmentHealthCheckConfig build() {
            final var _resultValue = new GatewayVpnAttachmentHealthCheckConfig();
            _resultValue.dip = dip;
            _resultValue.enable = enable;
            _resultValue.interval = interval;
            _resultValue.policy = policy;
            _resultValue.retry = retry;
            _resultValue.sip = sip;
            return _resultValue;
        }
    }
}
