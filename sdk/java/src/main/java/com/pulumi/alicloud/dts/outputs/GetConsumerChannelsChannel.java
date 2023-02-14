// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dts.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConsumerChannelsChannel {
    /**
     * @return The ID of the consumer group.
     * 
     */
    private String consumerGroupId;
    /**
     * @return The name of the consumer group.
     * 
     */
    private String consumerGroupName;
    /**
     * @return The username of the consumer group.
     * 
     */
    private String consumerGroupUserName;
    /**
     * @return The time point when the client consumed the last message in the subscription channel.
     * 
     */
    private String consumptionCheckpoint;
    /**
     * @return The ID of the Consumer Channel.
     * 
     */
    private String id;
    /**
     * @return The message delay time, for the current time data subscription channel in the earliest time of unconsumed messages of the difference, in Unix timestamp format, which is measured in seconds.
     * 
     */
    private Integer messageDelay;
    /**
     * @return The total number of unconsumed messages.
     * 
     */
    private Integer unconsumedData;

    private GetConsumerChannelsChannel() {}
    /**
     * @return The ID of the consumer group.
     * 
     */
    public String consumerGroupId() {
        return this.consumerGroupId;
    }
    /**
     * @return The name of the consumer group.
     * 
     */
    public String consumerGroupName() {
        return this.consumerGroupName;
    }
    /**
     * @return The username of the consumer group.
     * 
     */
    public String consumerGroupUserName() {
        return this.consumerGroupUserName;
    }
    /**
     * @return The time point when the client consumed the last message in the subscription channel.
     * 
     */
    public String consumptionCheckpoint() {
        return this.consumptionCheckpoint;
    }
    /**
     * @return The ID of the Consumer Channel.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The message delay time, for the current time data subscription channel in the earliest time of unconsumed messages of the difference, in Unix timestamp format, which is measured in seconds.
     * 
     */
    public Integer messageDelay() {
        return this.messageDelay;
    }
    /**
     * @return The total number of unconsumed messages.
     * 
     */
    public Integer unconsumedData() {
        return this.unconsumedData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConsumerChannelsChannel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String consumerGroupId;
        private String consumerGroupName;
        private String consumerGroupUserName;
        private String consumptionCheckpoint;
        private String id;
        private Integer messageDelay;
        private Integer unconsumedData;
        public Builder() {}
        public Builder(GetConsumerChannelsChannel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerGroupId = defaults.consumerGroupId;
    	      this.consumerGroupName = defaults.consumerGroupName;
    	      this.consumerGroupUserName = defaults.consumerGroupUserName;
    	      this.consumptionCheckpoint = defaults.consumptionCheckpoint;
    	      this.id = defaults.id;
    	      this.messageDelay = defaults.messageDelay;
    	      this.unconsumedData = defaults.unconsumedData;
        }

        @CustomType.Setter
        public Builder consumerGroupId(String consumerGroupId) {
            this.consumerGroupId = Objects.requireNonNull(consumerGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder consumerGroupName(String consumerGroupName) {
            this.consumerGroupName = Objects.requireNonNull(consumerGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder consumerGroupUserName(String consumerGroupUserName) {
            this.consumerGroupUserName = Objects.requireNonNull(consumerGroupUserName);
            return this;
        }
        @CustomType.Setter
        public Builder consumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = Objects.requireNonNull(consumptionCheckpoint);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder messageDelay(Integer messageDelay) {
            this.messageDelay = Objects.requireNonNull(messageDelay);
            return this;
        }
        @CustomType.Setter
        public Builder unconsumedData(Integer unconsumedData) {
            this.unconsumedData = Objects.requireNonNull(unconsumedData);
            return this;
        }
        public GetConsumerChannelsChannel build() {
            final var o = new GetConsumerChannelsChannel();
            o.consumerGroupId = consumerGroupId;
            o.consumerGroupName = consumerGroupName;
            o.consumerGroupUserName = consumerGroupUserName;
            o.consumptionCheckpoint = consumptionCheckpoint;
            o.id = id;
            o.messageDelay = messageDelay;
            o.unconsumedData = unconsumedData;
            return o;
        }
    }
}