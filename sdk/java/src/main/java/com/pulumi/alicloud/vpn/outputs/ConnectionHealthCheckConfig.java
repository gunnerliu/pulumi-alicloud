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
public final class ConnectionHealthCheckConfig {
    /**
     * @return The destination IP address.
     * 
     */
    private final @Nullable String dip;
    /**
     * @return Whether to enable BGP.
     * 
     */
    private final @Nullable Boolean enable;
    /**
     * @return The interval between two consecutive health checks. Unit: seconds.
     * 
     */
    private final @Nullable Integer interval;
    /**
     * @return The maximum number of health check retries.
     * 
     */
    private final @Nullable Integer retry;
    /**
     * @return The source IP address.
     * 
     */
    private final @Nullable String sip;

    @CustomType.Constructor
    private ConnectionHealthCheckConfig(
        @CustomType.Parameter("dip") @Nullable String dip,
        @CustomType.Parameter("enable") @Nullable Boolean enable,
        @CustomType.Parameter("interval") @Nullable Integer interval,
        @CustomType.Parameter("retry") @Nullable Integer retry,
        @CustomType.Parameter("sip") @Nullable String sip) {
        this.dip = dip;
        this.enable = enable;
        this.interval = interval;
        this.retry = retry;
        this.sip = sip;
    }

    /**
     * @return The destination IP address.
     * 
     */
    public Optional<String> dip() {
        return Optional.ofNullable(this.dip);
    }
    /**
     * @return Whether to enable BGP.
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
     * @return The maximum number of health check retries.
     * 
     */
    public Optional<Integer> retry() {
        return Optional.ofNullable(this.retry);
    }
    /**
     * @return The source IP address.
     * 
     */
    public Optional<String> sip() {
        return Optional.ofNullable(this.sip);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionHealthCheckConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dip;
        private @Nullable Boolean enable;
        private @Nullable Integer interval;
        private @Nullable Integer retry;
        private @Nullable String sip;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionHealthCheckConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dip = defaults.dip;
    	      this.enable = defaults.enable;
    	      this.interval = defaults.interval;
    	      this.retry = defaults.retry;
    	      this.sip = defaults.sip;
        }

        public Builder dip(@Nullable String dip) {
            this.dip = dip;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }
        public Builder retry(@Nullable Integer retry) {
            this.retry = retry;
            return this;
        }
        public Builder sip(@Nullable String sip) {
            this.sip = sip;
            return this;
        }        public ConnectionHealthCheckConfig build() {
            return new ConnectionHealthCheckConfig(dip, enable, interval, retry, sip);
        }
    }
}
