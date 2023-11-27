// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocketMQTopicState extends com.pulumi.resources.ResourceArgs {

    public static final RocketMQTopicState Empty = new RocketMQTopicState();

    /**
     * The creation time of the resource.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation time of the resource.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Instance ID.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return Instance ID.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Message type.
     * 
     */
    @Import(name="messageType")
    private @Nullable Output<String> messageType;

    /**
     * @return Message type.
     * 
     */
    public Optional<Output<String>> messageType() {
        return Optional.ofNullable(this.messageType);
    }

    /**
     * Custom remarks.
     * 
     */
    @Import(name="remark")
    private @Nullable Output<String> remark;

    /**
     * @return Custom remarks.
     * 
     */
    public Optional<Output<String>> remark() {
        return Optional.ofNullable(this.remark);
    }

    /**
     * The status of the resource.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Topic name and identification.
     * 
     */
    @Import(name="topicName")
    private @Nullable Output<String> topicName;

    /**
     * @return Topic name and identification.
     * 
     */
    public Optional<Output<String>> topicName() {
        return Optional.ofNullable(this.topicName);
    }

    private RocketMQTopicState() {}

    private RocketMQTopicState(RocketMQTopicState $) {
        this.createTime = $.createTime;
        this.instanceId = $.instanceId;
        this.messageType = $.messageType;
        this.remark = $.remark;
        this.status = $.status;
        this.topicName = $.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocketMQTopicState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocketMQTopicState $;

        public Builder() {
            $ = new RocketMQTopicState();
        }

        public Builder(RocketMQTopicState defaults) {
            $ = new RocketMQTopicState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The creation time of the resource.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation time of the resource.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param instanceId Instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param messageType Message type.
         * 
         * @return builder
         * 
         */
        public Builder messageType(@Nullable Output<String> messageType) {
            $.messageType = messageType;
            return this;
        }

        /**
         * @param messageType Message type.
         * 
         * @return builder
         * 
         */
        public Builder messageType(String messageType) {
            return messageType(Output.of(messageType));
        }

        /**
         * @param remark Custom remarks.
         * 
         * @return builder
         * 
         */
        public Builder remark(@Nullable Output<String> remark) {
            $.remark = remark;
            return this;
        }

        /**
         * @param remark Custom remarks.
         * 
         * @return builder
         * 
         */
        public Builder remark(String remark) {
            return remark(Output.of(remark));
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param topicName Topic name and identification.
         * 
         * @return builder
         * 
         */
        public Builder topicName(@Nullable Output<String> topicName) {
            $.topicName = topicName;
            return this;
        }

        /**
         * @param topicName Topic name and identification.
         * 
         * @return builder
         * 
         */
        public Builder topicName(String topicName) {
            return topicName(Output.of(topicName));
        }

        public RocketMQTopicState build() {
            return $;
        }
    }

}
