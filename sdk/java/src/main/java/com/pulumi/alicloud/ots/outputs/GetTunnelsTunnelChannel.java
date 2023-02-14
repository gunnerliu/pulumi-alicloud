// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ots.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTunnelsTunnelChannel {
    /**
     * @return The id of the channel.
     * 
     */
    private String channelId;
    /**
     * @return The latest consumption time of the channel, unix time in nanosecond
     * 
     */
    private Integer channelRpo;
    /**
     * @return The status of the channel, valid values: `WAIT`, `OPEN`, `CLOSING`, `CLOSE`, `TERMINATED`.
     * 
     */
    private String channelStatus;
    /**
     * @return The type of the channel, valid values: `BaseData`, `Stream`.
     * 
     */
    private String channelType;
    /**
     * @return The client id of the channel.
     * 
     */
    private String clientId;

    private GetTunnelsTunnelChannel() {}
    /**
     * @return The id of the channel.
     * 
     */
    public String channelId() {
        return this.channelId;
    }
    /**
     * @return The latest consumption time of the channel, unix time in nanosecond
     * 
     */
    public Integer channelRpo() {
        return this.channelRpo;
    }
    /**
     * @return The status of the channel, valid values: `WAIT`, `OPEN`, `CLOSING`, `CLOSE`, `TERMINATED`.
     * 
     */
    public String channelStatus() {
        return this.channelStatus;
    }
    /**
     * @return The type of the channel, valid values: `BaseData`, `Stream`.
     * 
     */
    public String channelType() {
        return this.channelType;
    }
    /**
     * @return The client id of the channel.
     * 
     */
    public String clientId() {
        return this.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTunnelsTunnelChannel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String channelId;
        private Integer channelRpo;
        private String channelStatus;
        private String channelType;
        private String clientId;
        public Builder() {}
        public Builder(GetTunnelsTunnelChannel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelId = defaults.channelId;
    	      this.channelRpo = defaults.channelRpo;
    	      this.channelStatus = defaults.channelStatus;
    	      this.channelType = defaults.channelType;
    	      this.clientId = defaults.clientId;
        }

        @CustomType.Setter
        public Builder channelId(String channelId) {
            this.channelId = Objects.requireNonNull(channelId);
            return this;
        }
        @CustomType.Setter
        public Builder channelRpo(Integer channelRpo) {
            this.channelRpo = Objects.requireNonNull(channelRpo);
            return this;
        }
        @CustomType.Setter
        public Builder channelStatus(String channelStatus) {
            this.channelStatus = Objects.requireNonNull(channelStatus);
            return this;
        }
        @CustomType.Setter
        public Builder channelType(String channelType) {
            this.channelType = Objects.requireNonNull(channelType);
            return this;
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public GetTunnelsTunnelChannel build() {
            final var o = new GetTunnelsTunnelChannel();
            o.channelId = channelId;
            o.channelRpo = channelRpo;
            o.channelStatus = channelStatus;
            o.channelType = channelType;
            o.clientId = clientId;
            return o;
        }
    }
}