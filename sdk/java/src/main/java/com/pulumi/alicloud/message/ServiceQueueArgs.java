// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.message;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceQueueArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceQueueArgs Empty = new ServiceQueueArgs();

    /**
     * The delay period after which a message sent to the queue can be consumed. Unit: seconds. Valid values: 0-604800 seconds. Default value: 0.
     * 
     */
    @Import(name="delaySeconds")
    private @Nullable Output<Integer> delaySeconds;

    /**
     * @return The delay period after which a message sent to the queue can be consumed. Unit: seconds. Valid values: 0-604800 seconds. Default value: 0.
     * 
     */
    public Optional<Output<Integer>> delaySeconds() {
        return Optional.ofNullable(this.delaySeconds);
    }

    /**
     * Specifies whether to enable the log management feature. Default value: false. Valid values:
     * 
     */
    @Import(name="loggingEnabled")
    private @Nullable Output<Boolean> loggingEnabled;

    /**
     * @return Specifies whether to enable the log management feature. Default value: false. Valid values:
     * 
     */
    public Optional<Output<Boolean>> loggingEnabled() {
        return Optional.ofNullable(this.loggingEnabled);
    }

    /**
     * The maximum size of a message body that can be sent to the queue. Unit: bytes. Valid value range: 1024-65536. Default value: 65536.
     * 
     */
    @Import(name="maximumMessageSize")
    private @Nullable Output<Integer> maximumMessageSize;

    /**
     * @return The maximum size of a message body that can be sent to the queue. Unit: bytes. Valid value range: 1024-65536. Default value: 65536.
     * 
     */
    public Optional<Output<Integer>> maximumMessageSize() {
        return Optional.ofNullable(this.maximumMessageSize);
    }

    /**
     * The maximum period for which a message can be retained in the queue. After the specified period, the message is deleted no matter whether the message is consumed. Unit: seconds. Valid values: 60-604800. Default value: 345600.
     * 
     */
    @Import(name="messageRetentionPeriod")
    private @Nullable Output<Integer> messageRetentionPeriod;

    /**
     * @return The maximum period for which a message can be retained in the queue. After the specified period, the message is deleted no matter whether the message is consumed. Unit: seconds. Valid values: 60-604800. Default value: 345600.
     * 
     */
    public Optional<Output<Integer>> messageRetentionPeriod() {
        return Optional.ofNullable(this.messageRetentionPeriod);
    }

    /**
     * The maximum period for which a ReceiveMessage request waits if no message is available in the queue. Unit: seconds. Valid values: 0-30. Default value: 0.
     * 
     */
    @Import(name="pollingWaitSeconds")
    private @Nullable Output<Integer> pollingWaitSeconds;

    /**
     * @return The maximum period for which a ReceiveMessage request waits if no message is available in the queue. Unit: seconds. Valid values: 0-30. Default value: 0.
     * 
     */
    public Optional<Output<Integer>> pollingWaitSeconds() {
        return Optional.ofNullable(this.pollingWaitSeconds);
    }

    /**
     * Two queues on a single account in the same region cannot have the same name. A queue name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 120 characters.
     * 
     */
    @Import(name="queueName", required=true)
    private Output<String> queueName;

    /**
     * @return Two queues on a single account in the same region cannot have the same name. A queue name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 120 characters.
     * 
     */
    public Output<String> queueName() {
        return this.queueName;
    }

    /**
     * The invisibility period for which the received message remains the Inactive state. Unit: seconds. Valid values: 1-43200. Default value: 30.
     * 
     */
    @Import(name="visibilityTimeout")
    private @Nullable Output<Integer> visibilityTimeout;

    /**
     * @return The invisibility period for which the received message remains the Inactive state. Unit: seconds. Valid values: 1-43200. Default value: 30.
     * 
     */
    public Optional<Output<Integer>> visibilityTimeout() {
        return Optional.ofNullable(this.visibilityTimeout);
    }

    private ServiceQueueArgs() {}

    private ServiceQueueArgs(ServiceQueueArgs $) {
        this.delaySeconds = $.delaySeconds;
        this.loggingEnabled = $.loggingEnabled;
        this.maximumMessageSize = $.maximumMessageSize;
        this.messageRetentionPeriod = $.messageRetentionPeriod;
        this.pollingWaitSeconds = $.pollingWaitSeconds;
        this.queueName = $.queueName;
        this.visibilityTimeout = $.visibilityTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceQueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceQueueArgs $;

        public Builder() {
            $ = new ServiceQueueArgs();
        }

        public Builder(ServiceQueueArgs defaults) {
            $ = new ServiceQueueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param delaySeconds The delay period after which a message sent to the queue can be consumed. Unit: seconds. Valid values: 0-604800 seconds. Default value: 0.
         * 
         * @return builder
         * 
         */
        public Builder delaySeconds(@Nullable Output<Integer> delaySeconds) {
            $.delaySeconds = delaySeconds;
            return this;
        }

        /**
         * @param delaySeconds The delay period after which a message sent to the queue can be consumed. Unit: seconds. Valid values: 0-604800 seconds. Default value: 0.
         * 
         * @return builder
         * 
         */
        public Builder delaySeconds(Integer delaySeconds) {
            return delaySeconds(Output.of(delaySeconds));
        }

        /**
         * @param loggingEnabled Specifies whether to enable the log management feature. Default value: false. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder loggingEnabled(@Nullable Output<Boolean> loggingEnabled) {
            $.loggingEnabled = loggingEnabled;
            return this;
        }

        /**
         * @param loggingEnabled Specifies whether to enable the log management feature. Default value: false. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder loggingEnabled(Boolean loggingEnabled) {
            return loggingEnabled(Output.of(loggingEnabled));
        }

        /**
         * @param maximumMessageSize The maximum size of a message body that can be sent to the queue. Unit: bytes. Valid value range: 1024-65536. Default value: 65536.
         * 
         * @return builder
         * 
         */
        public Builder maximumMessageSize(@Nullable Output<Integer> maximumMessageSize) {
            $.maximumMessageSize = maximumMessageSize;
            return this;
        }

        /**
         * @param maximumMessageSize The maximum size of a message body that can be sent to the queue. Unit: bytes. Valid value range: 1024-65536. Default value: 65536.
         * 
         * @return builder
         * 
         */
        public Builder maximumMessageSize(Integer maximumMessageSize) {
            return maximumMessageSize(Output.of(maximumMessageSize));
        }

        /**
         * @param messageRetentionPeriod The maximum period for which a message can be retained in the queue. After the specified period, the message is deleted no matter whether the message is consumed. Unit: seconds. Valid values: 60-604800. Default value: 345600.
         * 
         * @return builder
         * 
         */
        public Builder messageRetentionPeriod(@Nullable Output<Integer> messageRetentionPeriod) {
            $.messageRetentionPeriod = messageRetentionPeriod;
            return this;
        }

        /**
         * @param messageRetentionPeriod The maximum period for which a message can be retained in the queue. After the specified period, the message is deleted no matter whether the message is consumed. Unit: seconds. Valid values: 60-604800. Default value: 345600.
         * 
         * @return builder
         * 
         */
        public Builder messageRetentionPeriod(Integer messageRetentionPeriod) {
            return messageRetentionPeriod(Output.of(messageRetentionPeriod));
        }

        /**
         * @param pollingWaitSeconds The maximum period for which a ReceiveMessage request waits if no message is available in the queue. Unit: seconds. Valid values: 0-30. Default value: 0.
         * 
         * @return builder
         * 
         */
        public Builder pollingWaitSeconds(@Nullable Output<Integer> pollingWaitSeconds) {
            $.pollingWaitSeconds = pollingWaitSeconds;
            return this;
        }

        /**
         * @param pollingWaitSeconds The maximum period for which a ReceiveMessage request waits if no message is available in the queue. Unit: seconds. Valid values: 0-30. Default value: 0.
         * 
         * @return builder
         * 
         */
        public Builder pollingWaitSeconds(Integer pollingWaitSeconds) {
            return pollingWaitSeconds(Output.of(pollingWaitSeconds));
        }

        /**
         * @param queueName Two queues on a single account in the same region cannot have the same name. A queue name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 120 characters.
         * 
         * @return builder
         * 
         */
        public Builder queueName(Output<String> queueName) {
            $.queueName = queueName;
            return this;
        }

        /**
         * @param queueName Two queues on a single account in the same region cannot have the same name. A queue name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 120 characters.
         * 
         * @return builder
         * 
         */
        public Builder queueName(String queueName) {
            return queueName(Output.of(queueName));
        }

        /**
         * @param visibilityTimeout The invisibility period for which the received message remains the Inactive state. Unit: seconds. Valid values: 1-43200. Default value: 30.
         * 
         * @return builder
         * 
         */
        public Builder visibilityTimeout(@Nullable Output<Integer> visibilityTimeout) {
            $.visibilityTimeout = visibilityTimeout;
            return this;
        }

        /**
         * @param visibilityTimeout The invisibility period for which the received message remains the Inactive state. Unit: seconds. Valid values: 1-43200. Default value: 30.
         * 
         * @return builder
         * 
         */
        public Builder visibilityTimeout(Integer visibilityTimeout) {
            return visibilityTimeout(Output.of(visibilityTimeout));
        }

        public ServiceQueueArgs build() {
            if ($.queueName == null) {
                throw new MissingRequiredPropertyException("ServiceQueueArgs", "queueName");
            }
            return $;
        }
    }

}
