// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocketMQTopicArgs extends com.pulumi.resources.ResourceArgs {

    public static final RocketMQTopicArgs Empty = new RocketMQTopicArgs();

    /**
     * Instance ID.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return Instance ID.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
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
     * Topic name and identification.
     * 
     */
    @Import(name="topicName", required=true)
    private Output<String> topicName;

    /**
     * @return Topic name and identification.
     * 
     */
    public Output<String> topicName() {
        return this.topicName;
    }

    private RocketMQTopicArgs() {}

    private RocketMQTopicArgs(RocketMQTopicArgs $) {
        this.instanceId = $.instanceId;
        this.messageType = $.messageType;
        this.remark = $.remark;
        this.topicName = $.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocketMQTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocketMQTopicArgs $;

        public Builder() {
            $ = new RocketMQTopicArgs();
        }

        public Builder(RocketMQTopicArgs defaults) {
            $ = new RocketMQTopicArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId Instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
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
         * @param topicName Topic name and identification.
         * 
         * @return builder
         * 
         */
        public Builder topicName(Output<String> topicName) {
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

        public RocketMQTopicArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.topicName = Objects.requireNonNull($.topicName, "expected parameter 'topicName' to be non-null");
            return $;
        }
    }

}
