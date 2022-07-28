// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QueueState extends com.pulumi.resources.ResourceArgs {

    public static final QueueState Empty = new QueueState();

    /**
     * This attribute defines the length of time, in seconds, after which every message sent to the queue is dequeued. Valid value range: 0-604800 seconds, i.e., 0 to 7 days. Default value to 0.
     * 
     */
    @Import(name="delaySeconds")
    private @Nullable Output<Integer> delaySeconds;

    /**
     * @return This attribute defines the length of time, in seconds, after which every message sent to the queue is dequeued. Valid value range: 0-604800 seconds, i.e., 0 to 7 days. Default value to 0.
     * 
     */
    public Optional<Output<Integer>> delaySeconds() {
        return Optional.ofNullable(this.delaySeconds);
    }

    /**
     * This indicates the maximum length, in bytes, of any message body sent to the queue. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
     * 
     */
    @Import(name="maximumMessageSize")
    private @Nullable Output<Integer> maximumMessageSize;

    /**
     * @return This indicates the maximum length, in bytes, of any message body sent to the queue. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
     * 
     */
    public Optional<Output<Integer>> maximumMessageSize() {
        return Optional.ofNullable(this.maximumMessageSize);
    }

    /**
     * Messages are deleted from the queue after a specified length of time, whether they have been activated or not. This attribute defines the viability period, in seconds, for every message in the queue. Valid value range: 60-604800 seconds, i.e., 1 minutes to 7 days. Default value to 345600.
     * 
     */
    @Import(name="messageRetentionPeriod")
    private @Nullable Output<Integer> messageRetentionPeriod;

    /**
     * @return Messages are deleted from the queue after a specified length of time, whether they have been activated or not. This attribute defines the viability period, in seconds, for every message in the queue. Valid value range: 60-604800 seconds, i.e., 1 minutes to 7 days. Default value to 345600.
     * 
     */
    public Optional<Output<Integer>> messageRetentionPeriod() {
        return Optional.ofNullable(this.messageRetentionPeriod);
    }

    /**
     * Two queues on a single account in the same region cannot have the same name. A queue name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters .
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Two queues on a single account in the same region cannot have the same name. A queue name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters .
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Long polling is measured in seconds. When this attribute is set to 0, long polling is disabled. When it is not set to 0, long polling is enabled and message dequeue requests will be processed only when valid messages are received or when long polling times out. Valid value range: 0-30 seconds. Default value to 0.
     * 
     */
    @Import(name="pollingWaitSeconds")
    private @Nullable Output<Integer> pollingWaitSeconds;

    /**
     * @return Long polling is measured in seconds. When this attribute is set to 0, long polling is disabled. When it is not set to 0, long polling is enabled and message dequeue requests will be processed only when valid messages are received or when long polling times out. Valid value range: 0-30 seconds. Default value to 0.
     * 
     */
    public Optional<Output<Integer>> pollingWaitSeconds() {
        return Optional.ofNullable(this.pollingWaitSeconds);
    }

    /**
     * The VisibilityTimeout attribute of the queue. A dequeued messages will change from active (visible) status to inactive (invisible) status, and this attribute defines the length of time, in seconds, that messages remain invisible. Messages return to active status after the set period. Valid value range: 1-43200 seconds, i.e., 1 seconds to 12 hours. Default value to 30.
     * 
     */
    @Import(name="visibilityTimeout")
    private @Nullable Output<Integer> visibilityTimeout;

    /**
     * @return The VisibilityTimeout attribute of the queue. A dequeued messages will change from active (visible) status to inactive (invisible) status, and this attribute defines the length of time, in seconds, that messages remain invisible. Messages return to active status after the set period. Valid value range: 1-43200 seconds, i.e., 1 seconds to 12 hours. Default value to 30.
     * 
     */
    public Optional<Output<Integer>> visibilityTimeout() {
        return Optional.ofNullable(this.visibilityTimeout);
    }

    private QueueState() {}

    private QueueState(QueueState $) {
        this.delaySeconds = $.delaySeconds;
        this.maximumMessageSize = $.maximumMessageSize;
        this.messageRetentionPeriod = $.messageRetentionPeriod;
        this.name = $.name;
        this.pollingWaitSeconds = $.pollingWaitSeconds;
        this.visibilityTimeout = $.visibilityTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueueState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueueState $;

        public Builder() {
            $ = new QueueState();
        }

        public Builder(QueueState defaults) {
            $ = new QueueState(Objects.requireNonNull(defaults));
        }

        /**
         * @param delaySeconds This attribute defines the length of time, in seconds, after which every message sent to the queue is dequeued. Valid value range: 0-604800 seconds, i.e., 0 to 7 days. Default value to 0.
         * 
         * @return builder
         * 
         */
        public Builder delaySeconds(@Nullable Output<Integer> delaySeconds) {
            $.delaySeconds = delaySeconds;
            return this;
        }

        /**
         * @param delaySeconds This attribute defines the length of time, in seconds, after which every message sent to the queue is dequeued. Valid value range: 0-604800 seconds, i.e., 0 to 7 days. Default value to 0.
         * 
         * @return builder
         * 
         */
        public Builder delaySeconds(Integer delaySeconds) {
            return delaySeconds(Output.of(delaySeconds));
        }

        /**
         * @param maximumMessageSize This indicates the maximum length, in bytes, of any message body sent to the queue. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
         * 
         * @return builder
         * 
         */
        public Builder maximumMessageSize(@Nullable Output<Integer> maximumMessageSize) {
            $.maximumMessageSize = maximumMessageSize;
            return this;
        }

        /**
         * @param maximumMessageSize This indicates the maximum length, in bytes, of any message body sent to the queue. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
         * 
         * @return builder
         * 
         */
        public Builder maximumMessageSize(Integer maximumMessageSize) {
            return maximumMessageSize(Output.of(maximumMessageSize));
        }

        /**
         * @param messageRetentionPeriod Messages are deleted from the queue after a specified length of time, whether they have been activated or not. This attribute defines the viability period, in seconds, for every message in the queue. Valid value range: 60-604800 seconds, i.e., 1 minutes to 7 days. Default value to 345600.
         * 
         * @return builder
         * 
         */
        public Builder messageRetentionPeriod(@Nullable Output<Integer> messageRetentionPeriod) {
            $.messageRetentionPeriod = messageRetentionPeriod;
            return this;
        }

        /**
         * @param messageRetentionPeriod Messages are deleted from the queue after a specified length of time, whether they have been activated or not. This attribute defines the viability period, in seconds, for every message in the queue. Valid value range: 60-604800 seconds, i.e., 1 minutes to 7 days. Default value to 345600.
         * 
         * @return builder
         * 
         */
        public Builder messageRetentionPeriod(Integer messageRetentionPeriod) {
            return messageRetentionPeriod(Output.of(messageRetentionPeriod));
        }

        /**
         * @param name Two queues on a single account in the same region cannot have the same name. A queue name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters .
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Two queues on a single account in the same region cannot have the same name. A queue name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters .
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pollingWaitSeconds Long polling is measured in seconds. When this attribute is set to 0, long polling is disabled. When it is not set to 0, long polling is enabled and message dequeue requests will be processed only when valid messages are received or when long polling times out. Valid value range: 0-30 seconds. Default value to 0.
         * 
         * @return builder
         * 
         */
        public Builder pollingWaitSeconds(@Nullable Output<Integer> pollingWaitSeconds) {
            $.pollingWaitSeconds = pollingWaitSeconds;
            return this;
        }

        /**
         * @param pollingWaitSeconds Long polling is measured in seconds. When this attribute is set to 0, long polling is disabled. When it is not set to 0, long polling is enabled and message dequeue requests will be processed only when valid messages are received or when long polling times out. Valid value range: 0-30 seconds. Default value to 0.
         * 
         * @return builder
         * 
         */
        public Builder pollingWaitSeconds(Integer pollingWaitSeconds) {
            return pollingWaitSeconds(Output.of(pollingWaitSeconds));
        }

        /**
         * @param visibilityTimeout The VisibilityTimeout attribute of the queue. A dequeued messages will change from active (visible) status to inactive (invisible) status, and this attribute defines the length of time, in seconds, that messages remain invisible. Messages return to active status after the set period. Valid value range: 1-43200 seconds, i.e., 1 seconds to 12 hours. Default value to 30.
         * 
         * @return builder
         * 
         */
        public Builder visibilityTimeout(@Nullable Output<Integer> visibilityTimeout) {
            $.visibilityTimeout = visibilityTimeout;
            return this;
        }

        /**
         * @param visibilityTimeout The VisibilityTimeout attribute of the queue. A dequeued messages will change from active (visible) status to inactive (invisible) status, and this attribute defines the length of time, in seconds, that messages remain invisible. Messages return to active status after the set period. Valid value range: 1-43200 seconds, i.e., 1 seconds to 12 hours. Default value to 30.
         * 
         * @return builder
         * 
         */
        public Builder visibilityTimeout(Integer visibilityTimeout) {
            return visibilityTimeout(Output.of(visibilityTimeout));
        }

        public QueueState build() {
            return $;
        }
    }

}
