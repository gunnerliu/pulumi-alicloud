// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.outputs;

import com.pulumi.alicloud.eventbridge.outputs.RuleTargetDeadLetterQueue;
import com.pulumi.alicloud.eventbridge.outputs.RuleTargetParamList;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleTarget {
    /**
     * @return Dead letter queue. Events that are not processed or exceed the number of retries will be written to the dead letter. Support message service MNS and message queue RocketMQ. See the following `Block dead_letter_queue`.
     * 
     */
    private final @Nullable RuleTargetDeadLetterQueue deadLetterQueue;
    /**
     * @return The endpoint of target.
     * 
     */
    private final String endpoint;
    /**
     * @return A list of param. See the following `Block param_list`.
     * 
     */
    private final List<RuleTargetParamList> paramLists;
    /**
     * @return The retry policy that is used to push the event. Valid values:
     * 
     */
    private final @Nullable String pushRetryStrategy;
    /**
     * @return The ID of target.
     * 
     */
    private final String targetId;
    /**
     * @return The type of target. Valid values: `acs.fc.function`, `acs.mns.topic`, `acs.mns.queue`,`http`,`acs.sms`,`acs.mail`,`acs.dingtalk`,`https`, `acs.eventbridge`,`acs.rabbitmq` and `acs.rocketmq`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private RuleTarget(
        @CustomType.Parameter("deadLetterQueue") @Nullable RuleTargetDeadLetterQueue deadLetterQueue,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("paramLists") List<RuleTargetParamList> paramLists,
        @CustomType.Parameter("pushRetryStrategy") @Nullable String pushRetryStrategy,
        @CustomType.Parameter("targetId") String targetId,
        @CustomType.Parameter("type") String type) {
        this.deadLetterQueue = deadLetterQueue;
        this.endpoint = endpoint;
        this.paramLists = paramLists;
        this.pushRetryStrategy = pushRetryStrategy;
        this.targetId = targetId;
        this.type = type;
    }

    /**
     * @return Dead letter queue. Events that are not processed or exceed the number of retries will be written to the dead letter. Support message service MNS and message queue RocketMQ. See the following `Block dead_letter_queue`.
     * 
     */
    public Optional<RuleTargetDeadLetterQueue> deadLetterQueue() {
        return Optional.ofNullable(this.deadLetterQueue);
    }
    /**
     * @return The endpoint of target.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return A list of param. See the following `Block param_list`.
     * 
     */
    public List<RuleTargetParamList> paramLists() {
        return this.paramLists;
    }
    /**
     * @return The retry policy that is used to push the event. Valid values:
     * 
     */
    public Optional<String> pushRetryStrategy() {
        return Optional.ofNullable(this.pushRetryStrategy);
    }
    /**
     * @return The ID of target.
     * 
     */
    public String targetId() {
        return this.targetId;
    }
    /**
     * @return The type of target. Valid values: `acs.fc.function`, `acs.mns.topic`, `acs.mns.queue`,`http`,`acs.sms`,`acs.mail`,`acs.dingtalk`,`https`, `acs.eventbridge`,`acs.rabbitmq` and `acs.rocketmq`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleTargetDeadLetterQueue deadLetterQueue;
        private String endpoint;
        private List<RuleTargetParamList> paramLists;
        private @Nullable String pushRetryStrategy;
        private String targetId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deadLetterQueue = defaults.deadLetterQueue;
    	      this.endpoint = defaults.endpoint;
    	      this.paramLists = defaults.paramLists;
    	      this.pushRetryStrategy = defaults.pushRetryStrategy;
    	      this.targetId = defaults.targetId;
    	      this.type = defaults.type;
        }

        public Builder deadLetterQueue(@Nullable RuleTargetDeadLetterQueue deadLetterQueue) {
            this.deadLetterQueue = deadLetterQueue;
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder paramLists(List<RuleTargetParamList> paramLists) {
            this.paramLists = Objects.requireNonNull(paramLists);
            return this;
        }
        public Builder paramLists(RuleTargetParamList... paramLists) {
            return paramLists(List.of(paramLists));
        }
        public Builder pushRetryStrategy(@Nullable String pushRetryStrategy) {
            this.pushRetryStrategy = pushRetryStrategy;
            return this;
        }
        public Builder targetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public RuleTarget build() {
            return new RuleTarget(deadLetterQueue, endpoint, paramLists, pushRetryStrategy, targetId, type);
        }
    }
}
