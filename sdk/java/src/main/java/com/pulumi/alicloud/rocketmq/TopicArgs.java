// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicArgs Empty = new TopicArgs();

    /**
     * ID of the ONS Instance that owns the topics.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return ID of the ONS Instance that owns the topics.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * The type of the message. Read [Ons Topic Create](https://www.alibabacloud.com/help/doc-detail/29591.html) for further details.
     * 
     */
    @Import(name="messageType", required=true)
    private Output<Integer> messageType;

    /**
     * @return The type of the message. Read [Ons Topic Create](https://www.alibabacloud.com/help/doc-detail/29591.html) for further details.
     * 
     */
    public Output<Integer> messageType() {
        return this.messageType;
    }

    /**
     * This attribute has been deprecated.
     * 
     * @deprecated
     * Attribute perm has been deprecated and suggest removing it from your template.
     * 
     */
    @Deprecated /* Attribute perm has been deprecated and suggest removing it from your template. */
    @Import(name="perm")
    private @Nullable Output<Integer> perm;

    /**
     * @return This attribute has been deprecated.
     * 
     * @deprecated
     * Attribute perm has been deprecated and suggest removing it from your template.
     * 
     */
    @Deprecated /* Attribute perm has been deprecated and suggest removing it from your template. */
    public Optional<Output<Integer>> perm() {
        return Optional.ofNullable(this.perm);
    }

    /**
     * This attribute is a concise description of topic. The length cannot exceed 128.
     * 
     */
    @Import(name="remark")
    private @Nullable Output<String> remark;

    /**
     * @return This attribute is a concise description of topic. The length cannot exceed 128.
     * 
     */
    public Optional<Output<String>> remark() {
        return Optional.ofNullable(this.remark);
    }

    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Replaced by `topic_name` after version 1.97.0.
     * 
     * @deprecated
     * Field &#39;topic&#39; has been deprecated from version 1.97.0. Use &#39;topic_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'topic' has been deprecated from version 1.97.0. Use 'topic_name' instead. */
    @Import(name="topic")
    private @Nullable Output<String> topic;

    /**
     * @return Replaced by `topic_name` after version 1.97.0.
     * 
     * @deprecated
     * Field &#39;topic&#39; has been deprecated from version 1.97.0. Use &#39;topic_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'topic' has been deprecated from version 1.97.0. Use 'topic_name' instead. */
    public Optional<Output<String>> topic() {
        return Optional.ofNullable(this.topic);
    }

    /**
     * Name of the topic. Two topics on a single instance cannot have the same name and the name cannot start with &#39;GID&#39; or &#39;CID&#39;. The length cannot exceed 64 characters.
     * 
     */
    @Import(name="topicName")
    private @Nullable Output<String> topicName;

    /**
     * @return Name of the topic. Two topics on a single instance cannot have the same name and the name cannot start with &#39;GID&#39; or &#39;CID&#39;. The length cannot exceed 64 characters.
     * 
     */
    public Optional<Output<String>> topicName() {
        return Optional.ofNullable(this.topicName);
    }

    private TopicArgs() {}

    private TopicArgs(TopicArgs $) {
        this.instanceId = $.instanceId;
        this.messageType = $.messageType;
        this.perm = $.perm;
        this.remark = $.remark;
        this.tags = $.tags;
        this.topic = $.topic;
        this.topicName = $.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicArgs $;

        public Builder() {
            $ = new TopicArgs();
        }

        public Builder(TopicArgs defaults) {
            $ = new TopicArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId ID of the ONS Instance that owns the topics.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId ID of the ONS Instance that owns the topics.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param messageType The type of the message. Read [Ons Topic Create](https://www.alibabacloud.com/help/doc-detail/29591.html) for further details.
         * 
         * @return builder
         * 
         */
        public Builder messageType(Output<Integer> messageType) {
            $.messageType = messageType;
            return this;
        }

        /**
         * @param messageType The type of the message. Read [Ons Topic Create](https://www.alibabacloud.com/help/doc-detail/29591.html) for further details.
         * 
         * @return builder
         * 
         */
        public Builder messageType(Integer messageType) {
            return messageType(Output.of(messageType));
        }

        /**
         * @param perm This attribute has been deprecated.
         * 
         * @return builder
         * 
         * @deprecated
         * Attribute perm has been deprecated and suggest removing it from your template.
         * 
         */
        @Deprecated /* Attribute perm has been deprecated and suggest removing it from your template. */
        public Builder perm(@Nullable Output<Integer> perm) {
            $.perm = perm;
            return this;
        }

        /**
         * @param perm This attribute has been deprecated.
         * 
         * @return builder
         * 
         * @deprecated
         * Attribute perm has been deprecated and suggest removing it from your template.
         * 
         */
        @Deprecated /* Attribute perm has been deprecated and suggest removing it from your template. */
        public Builder perm(Integer perm) {
            return perm(Output.of(perm));
        }

        /**
         * @param remark This attribute is a concise description of topic. The length cannot exceed 128.
         * 
         * @return builder
         * 
         */
        public Builder remark(@Nullable Output<String> remark) {
            $.remark = remark;
            return this;
        }

        /**
         * @param remark This attribute is a concise description of topic. The length cannot exceed 128.
         * 
         * @return builder
         * 
         */
        public Builder remark(String remark) {
            return remark(Output.of(remark));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
         * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
         * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param topic Replaced by `topic_name` after version 1.97.0.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;topic&#39; has been deprecated from version 1.97.0. Use &#39;topic_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'topic' has been deprecated from version 1.97.0. Use 'topic_name' instead. */
        public Builder topic(@Nullable Output<String> topic) {
            $.topic = topic;
            return this;
        }

        /**
         * @param topic Replaced by `topic_name` after version 1.97.0.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;topic&#39; has been deprecated from version 1.97.0. Use &#39;topic_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'topic' has been deprecated from version 1.97.0. Use 'topic_name' instead. */
        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        /**
         * @param topicName Name of the topic. Two topics on a single instance cannot have the same name and the name cannot start with &#39;GID&#39; or &#39;CID&#39;. The length cannot exceed 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder topicName(@Nullable Output<String> topicName) {
            $.topicName = topicName;
            return this;
        }

        /**
         * @param topicName Name of the topic. Two topics on a single instance cannot have the same name and the name cannot start with &#39;GID&#39; or &#39;CID&#39;. The length cannot exceed 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder topicName(String topicName) {
            return topicName(Output.of(topicName));
        }

        public TopicArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.messageType = Objects.requireNonNull($.messageType, "expected parameter 'messageType' to be non-null");
            return $;
        }
    }

}
