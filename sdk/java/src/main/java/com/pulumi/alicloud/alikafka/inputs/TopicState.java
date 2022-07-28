// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alikafka.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicState extends com.pulumi.resources.ResourceArgs {

    public static final TopicState Empty = new TopicState();

    /**
     * Whether the topic is compactTopic or not. Compact topic must be a localTopic.
     * 
     */
    @Import(name="compactTopic")
    private @Nullable Output<Boolean> compactTopic;

    /**
     * @return Whether the topic is compactTopic or not. Compact topic must be a localTopic.
     * 
     */
    public Optional<Output<Boolean>> compactTopic() {
        return Optional.ofNullable(this.compactTopic);
    }

    /**
     * InstanceId of your Kafka resource, the topic will create in this instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return InstanceId of your Kafka resource, the topic will create in this instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Whether the topic is localTopic or not.
     * 
     */
    @Import(name="localTopic")
    private @Nullable Output<Boolean> localTopic;

    /**
     * @return Whether the topic is localTopic or not.
     * 
     */
    public Optional<Output<Boolean>> localTopic() {
        return Optional.ofNullable(this.localTopic);
    }

    /**
     * The number of partitions of the topic. The number should between 1 and 48.
     * 
     */
    @Import(name="partitionNum")
    private @Nullable Output<Integer> partitionNum;

    /**
     * @return The number of partitions of the topic. The number should between 1 and 48.
     * 
     */
    public Optional<Output<Integer>> partitionNum() {
        return Optional.ofNullable(this.partitionNum);
    }

    /**
     * This attribute is a concise description of topic. The length cannot exceed 64.
     * 
     */
    @Import(name="remark")
    private @Nullable Output<String> remark;

    /**
     * @return This attribute is a concise description of topic. The length cannot exceed 64.
     * 
     */
    public Optional<Output<String>> remark() {
        return Optional.ofNullable(this.remark);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 64 characters.
     * 
     */
    @Import(name="topic")
    private @Nullable Output<String> topic;

    /**
     * @return Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 64 characters.
     * 
     */
    public Optional<Output<String>> topic() {
        return Optional.ofNullable(this.topic);
    }

    private TopicState() {}

    private TopicState(TopicState $) {
        this.compactTopic = $.compactTopic;
        this.instanceId = $.instanceId;
        this.localTopic = $.localTopic;
        this.partitionNum = $.partitionNum;
        this.remark = $.remark;
        this.tags = $.tags;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicState $;

        public Builder() {
            $ = new TopicState();
        }

        public Builder(TopicState defaults) {
            $ = new TopicState(Objects.requireNonNull(defaults));
        }

        /**
         * @param compactTopic Whether the topic is compactTopic or not. Compact topic must be a localTopic.
         * 
         * @return builder
         * 
         */
        public Builder compactTopic(@Nullable Output<Boolean> compactTopic) {
            $.compactTopic = compactTopic;
            return this;
        }

        /**
         * @param compactTopic Whether the topic is compactTopic or not. Compact topic must be a localTopic.
         * 
         * @return builder
         * 
         */
        public Builder compactTopic(Boolean compactTopic) {
            return compactTopic(Output.of(compactTopic));
        }

        /**
         * @param instanceId InstanceId of your Kafka resource, the topic will create in this instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId InstanceId of your Kafka resource, the topic will create in this instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param localTopic Whether the topic is localTopic or not.
         * 
         * @return builder
         * 
         */
        public Builder localTopic(@Nullable Output<Boolean> localTopic) {
            $.localTopic = localTopic;
            return this;
        }

        /**
         * @param localTopic Whether the topic is localTopic or not.
         * 
         * @return builder
         * 
         */
        public Builder localTopic(Boolean localTopic) {
            return localTopic(Output.of(localTopic));
        }

        /**
         * @param partitionNum The number of partitions of the topic. The number should between 1 and 48.
         * 
         * @return builder
         * 
         */
        public Builder partitionNum(@Nullable Output<Integer> partitionNum) {
            $.partitionNum = partitionNum;
            return this;
        }

        /**
         * @param partitionNum The number of partitions of the topic. The number should between 1 and 48.
         * 
         * @return builder
         * 
         */
        public Builder partitionNum(Integer partitionNum) {
            return partitionNum(Output.of(partitionNum));
        }

        /**
         * @param remark This attribute is a concise description of topic. The length cannot exceed 64.
         * 
         * @return builder
         * 
         */
        public Builder remark(@Nullable Output<String> remark) {
            $.remark = remark;
            return this;
        }

        /**
         * @param remark This attribute is a concise description of topic. The length cannot exceed 64.
         * 
         * @return builder
         * 
         */
        public Builder remark(String remark) {
            return remark(Output.of(remark));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
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
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param topic Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder topic(@Nullable Output<String> topic) {
            $.topic = topic;
            return this;
        }

        /**
         * @param topic Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public TopicState build() {
            return $;
        }
    }

}
