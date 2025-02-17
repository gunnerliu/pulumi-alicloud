// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerXForwardedFor {
    /**
     * @return Whether to retrieve the client ip. It is read-only attribute.
     * 
     */
    private @Nullable Boolean retriveClientIp;
    /**
     * @return Whether to use the XForwardedFor header to obtain the ID of the SLB instance. Default to false.
     * 
     */
    private @Nullable Boolean retriveSlbId;
    /**
     * @return Whether to use the XForwardedFor_SLBIP header to obtain the public IP address of the SLB instance. Default to false.
     * 
     */
    private @Nullable Boolean retriveSlbIp;
    /**
     * @return Whether to use the XForwardedFor_proto header to obtain the protocol used by the listener. Default to false.
     * 
     */
    private @Nullable Boolean retriveSlbProto;

    private ListenerXForwardedFor() {}
    /**
     * @return Whether to retrieve the client ip. It is read-only attribute.
     * 
     */
    public Optional<Boolean> retriveClientIp() {
        return Optional.ofNullable(this.retriveClientIp);
    }
    /**
     * @return Whether to use the XForwardedFor header to obtain the ID of the SLB instance. Default to false.
     * 
     */
    public Optional<Boolean> retriveSlbId() {
        return Optional.ofNullable(this.retriveSlbId);
    }
    /**
     * @return Whether to use the XForwardedFor_SLBIP header to obtain the public IP address of the SLB instance. Default to false.
     * 
     */
    public Optional<Boolean> retriveSlbIp() {
        return Optional.ofNullable(this.retriveSlbIp);
    }
    /**
     * @return Whether to use the XForwardedFor_proto header to obtain the protocol used by the listener. Default to false.
     * 
     */
    public Optional<Boolean> retriveSlbProto() {
        return Optional.ofNullable(this.retriveSlbProto);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerXForwardedFor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean retriveClientIp;
        private @Nullable Boolean retriveSlbId;
        private @Nullable Boolean retriveSlbIp;
        private @Nullable Boolean retriveSlbProto;
        public Builder() {}
        public Builder(ListenerXForwardedFor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retriveClientIp = defaults.retriveClientIp;
    	      this.retriveSlbId = defaults.retriveSlbId;
    	      this.retriveSlbIp = defaults.retriveSlbIp;
    	      this.retriveSlbProto = defaults.retriveSlbProto;
        }

        @CustomType.Setter
        public Builder retriveClientIp(@Nullable Boolean retriveClientIp) {

            this.retriveClientIp = retriveClientIp;
            return this;
        }
        @CustomType.Setter
        public Builder retriveSlbId(@Nullable Boolean retriveSlbId) {

            this.retriveSlbId = retriveSlbId;
            return this;
        }
        @CustomType.Setter
        public Builder retriveSlbIp(@Nullable Boolean retriveSlbIp) {

            this.retriveSlbIp = retriveSlbIp;
            return this;
        }
        @CustomType.Setter
        public Builder retriveSlbProto(@Nullable Boolean retriveSlbProto) {

            this.retriveSlbProto = retriveSlbProto;
            return this;
        }
        public ListenerXForwardedFor build() {
            final var _resultValue = new ListenerXForwardedFor();
            _resultValue.retriveClientIp = retriveClientIp;
            _resultValue.retriveSlbId = retriveSlbId;
            _resultValue.retriveSlbIp = retriveSlbIp;
            _resultValue.retriveSlbProto = retriveSlbProto;
            return _resultValue;
        }
    }
}
