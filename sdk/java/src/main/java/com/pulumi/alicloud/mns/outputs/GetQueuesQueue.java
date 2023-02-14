// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetQueuesQueue {
    /**
     * @return This attribute defines the length of time, in seconds, after which every message sent to the queue is dequeued.
     * 
     */
    private Integer delaySeconds;
    /**
     * @return The id of the queue, The value is set to `name`.
     * 
     */
    private String id;
    /**
     * @return This indicates the maximum length, in bytes, of any message body sent to the queue.
     * 
     */
    private Integer maximumMessageSize;
    /**
     * @return Messages are deleted from the queue after a specified length of time, whether they have been activated or not. This attribute defines the viability period, in seconds, for every message in the queue.
     * 
     */
    private Integer messageRetentionPeriod;
    /**
     * @return The name of the queue
     * 
     */
    private String name;
    /**
     * @return Long polling is measured in seconds. When this attribute is set to 0, long polling is disabled. When it is not set to 0, long polling is enabled and message dequeue requests will be processed only when valid messages are received or when long polling times out.
     * 
     */
    private Integer pollingWaitSeconds;
    /**
     * @return Dequeued messages change from active (visible) status to inactive (invisible) status. This attribute defines the length of time, in seconds, that messages remain invisible. Messages return to active status after the set period.
     * 
     */
    private Integer visibilityTimeouts;

    private GetQueuesQueue() {}
    /**
     * @return This attribute defines the length of time, in seconds, after which every message sent to the queue is dequeued.
     * 
     */
    public Integer delaySeconds() {
        return this.delaySeconds;
    }
    /**
     * @return The id of the queue, The value is set to `name`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return This indicates the maximum length, in bytes, of any message body sent to the queue.
     * 
     */
    public Integer maximumMessageSize() {
        return this.maximumMessageSize;
    }
    /**
     * @return Messages are deleted from the queue after a specified length of time, whether they have been activated or not. This attribute defines the viability period, in seconds, for every message in the queue.
     * 
     */
    public Integer messageRetentionPeriod() {
        return this.messageRetentionPeriod;
    }
    /**
     * @return The name of the queue
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Long polling is measured in seconds. When this attribute is set to 0, long polling is disabled. When it is not set to 0, long polling is enabled and message dequeue requests will be processed only when valid messages are received or when long polling times out.
     * 
     */
    public Integer pollingWaitSeconds() {
        return this.pollingWaitSeconds;
    }
    /**
     * @return Dequeued messages change from active (visible) status to inactive (invisible) status. This attribute defines the length of time, in seconds, that messages remain invisible. Messages return to active status after the set period.
     * 
     */
    public Integer visibilityTimeouts() {
        return this.visibilityTimeouts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueuesQueue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer delaySeconds;
        private String id;
        private Integer maximumMessageSize;
        private Integer messageRetentionPeriod;
        private String name;
        private Integer pollingWaitSeconds;
        private Integer visibilityTimeouts;
        public Builder() {}
        public Builder(GetQueuesQueue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delaySeconds = defaults.delaySeconds;
    	      this.id = defaults.id;
    	      this.maximumMessageSize = defaults.maximumMessageSize;
    	      this.messageRetentionPeriod = defaults.messageRetentionPeriod;
    	      this.name = defaults.name;
    	      this.pollingWaitSeconds = defaults.pollingWaitSeconds;
    	      this.visibilityTimeouts = defaults.visibilityTimeouts;
        }

        @CustomType.Setter
        public Builder delaySeconds(Integer delaySeconds) {
            this.delaySeconds = Objects.requireNonNull(delaySeconds);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder maximumMessageSize(Integer maximumMessageSize) {
            this.maximumMessageSize = Objects.requireNonNull(maximumMessageSize);
            return this;
        }
        @CustomType.Setter
        public Builder messageRetentionPeriod(Integer messageRetentionPeriod) {
            this.messageRetentionPeriod = Objects.requireNonNull(messageRetentionPeriod);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder pollingWaitSeconds(Integer pollingWaitSeconds) {
            this.pollingWaitSeconds = Objects.requireNonNull(pollingWaitSeconds);
            return this;
        }
        @CustomType.Setter
        public Builder visibilityTimeouts(Integer visibilityTimeouts) {
            this.visibilityTimeouts = Objects.requireNonNull(visibilityTimeouts);
            return this;
        }
        public GetQueuesQueue build() {
            final var o = new GetQueuesQueue();
            o.delaySeconds = delaySeconds;
            o.id = id;
            o.maximumMessageSize = maximumMessageSize;
            o.messageRetentionPeriod = messageRetentionPeriod;
            o.name = name;
            o.pollingWaitSeconds = pollingWaitSeconds;
            o.visibilityTimeouts = visibilityTimeouts;
            return o;
        }
    }
}