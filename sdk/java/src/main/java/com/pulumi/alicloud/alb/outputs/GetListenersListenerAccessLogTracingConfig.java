// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetListenersListenerAccessLogTracingConfig {
    /**
     * @return Xtrace Function. Value: True Or False. Default Value: False.
     * 
     */
    private final Boolean tracingEnabled;
    /**
     * @return Xtrace Sampling Rate. Value: **1~10000**.
     * 
     */
    private final Integer tracingSample;
    /**
     * @return Xtrace Type Value Is **Zipkin**.
     * 
     */
    private final String tracingType;

    @CustomType.Constructor
    private GetListenersListenerAccessLogTracingConfig(
        @CustomType.Parameter("tracingEnabled") Boolean tracingEnabled,
        @CustomType.Parameter("tracingSample") Integer tracingSample,
        @CustomType.Parameter("tracingType") String tracingType) {
        this.tracingEnabled = tracingEnabled;
        this.tracingSample = tracingSample;
        this.tracingType = tracingType;
    }

    /**
     * @return Xtrace Function. Value: True Or False. Default Value: False.
     * 
     */
    public Boolean tracingEnabled() {
        return this.tracingEnabled;
    }
    /**
     * @return Xtrace Sampling Rate. Value: **1~10000**.
     * 
     */
    public Integer tracingSample() {
        return this.tracingSample;
    }
    /**
     * @return Xtrace Type Value Is **Zipkin**.
     * 
     */
    public String tracingType() {
        return this.tracingType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenersListenerAccessLogTracingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean tracingEnabled;
        private Integer tracingSample;
        private String tracingType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenersListenerAccessLogTracingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tracingEnabled = defaults.tracingEnabled;
    	      this.tracingSample = defaults.tracingSample;
    	      this.tracingType = defaults.tracingType;
        }

        public Builder tracingEnabled(Boolean tracingEnabled) {
            this.tracingEnabled = Objects.requireNonNull(tracingEnabled);
            return this;
        }
        public Builder tracingSample(Integer tracingSample) {
            this.tracingSample = Objects.requireNonNull(tracingSample);
            return this;
        }
        public Builder tracingType(String tracingType) {
            this.tracingType = Objects.requireNonNull(tracingType);
            return this;
        }        public GetListenersListenerAccessLogTracingConfig build() {
            return new GetListenersListenerAccessLogTracingConfig(tracingEnabled, tracingSample, tracingType);
        }
    }
}
