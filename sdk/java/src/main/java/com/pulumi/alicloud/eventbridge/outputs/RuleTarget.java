// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.outputs;

import com.pulumi.alicloud.eventbridge.outputs.RuleTargetDeadLetterQueue;
import com.pulumi.alicloud.eventbridge.outputs.RuleTargetParamList;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleTarget {
    /**
     * @return Dead letter queue. Events that are not processed or exceed the number of retries will be written to the dead letter. Support message service MNS and message queue RocketMQ. See `dead_letter_queue` below.
     * 
     */
    private @Nullable RuleTargetDeadLetterQueue deadLetterQueue;
    /**
     * @return The endpoint of target.
     * 
     */
    private String endpoint;
    /**
     * @return A list of param. See `param_list` below.
     * 
     */
    private List<RuleTargetParamList> paramLists;
    /**
     * @return The retry policy that is used to push the event. Valid values:
     * 
     */
    private @Nullable String pushRetryStrategy;
    /**
     * @return The ID of target.
     * 
     */
    private String targetId;
    /**
     * @return The type of target. Valid values: `acs.alikafka`, `acs.api.destination`, `acs.arms.loki`, `acs.datahub`, `acs.dingtalk`, `acs.eventbridge`, `acs.eventbridge.olap`, `acs.eventbus.SLSCloudLens`, `acs.fc.function`, `acs.fnf`, `acs.k8s`, `acs.mail`, `acs.mns.queue`, `acs.mns.topic`, `acs.openapi`, `acs.rabbitmq`, `acs.rds.mysql`, `acs.rocketmq`, `acs.sae`, `acs.sls`, `acs.sms`, `http`,`https` and `mysql`.
     * **NOTE:** From version 1.208.1, `type` can be set to `acs.alikafka`, `acs.api.destination`, `acs.arms.loki`, `acs.datahub`, `acs.eventbridge.olap`, `acs.eventbus.SLSCloudLens`, `acs.fnf`, `acs.k8s`, `acs.openapi`, `acs.rds.mysql`, `acs.sae`, `acs.sls`, `mysql`.
     * 
     */
    private String type;

    private RuleTarget() {}
    /**
     * @return Dead letter queue. Events that are not processed or exceed the number of retries will be written to the dead letter. Support message service MNS and message queue RocketMQ. See `dead_letter_queue` below.
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
     * @return A list of param. See `param_list` below.
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
     * @return The type of target. Valid values: `acs.alikafka`, `acs.api.destination`, `acs.arms.loki`, `acs.datahub`, `acs.dingtalk`, `acs.eventbridge`, `acs.eventbridge.olap`, `acs.eventbus.SLSCloudLens`, `acs.fc.function`, `acs.fnf`, `acs.k8s`, `acs.mail`, `acs.mns.queue`, `acs.mns.topic`, `acs.openapi`, `acs.rabbitmq`, `acs.rds.mysql`, `acs.rocketmq`, `acs.sae`, `acs.sls`, `acs.sms`, `http`,`https` and `mysql`.
     * **NOTE:** From version 1.208.1, `type` can be set to `acs.alikafka`, `acs.api.destination`, `acs.arms.loki`, `acs.datahub`, `acs.eventbridge.olap`, `acs.eventbus.SLSCloudLens`, `acs.fnf`, `acs.k8s`, `acs.openapi`, `acs.rds.mysql`, `acs.sae`, `acs.sls`, `mysql`.
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
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleTargetDeadLetterQueue deadLetterQueue;
        private String endpoint;
        private List<RuleTargetParamList> paramLists;
        private @Nullable String pushRetryStrategy;
        private String targetId;
        private String type;
        public Builder() {}
        public Builder(RuleTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deadLetterQueue = defaults.deadLetterQueue;
    	      this.endpoint = defaults.endpoint;
    	      this.paramLists = defaults.paramLists;
    	      this.pushRetryStrategy = defaults.pushRetryStrategy;
    	      this.targetId = defaults.targetId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder deadLetterQueue(@Nullable RuleTargetDeadLetterQueue deadLetterQueue) {

            this.deadLetterQueue = deadLetterQueue;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            if (endpoint == null) {
              throw new MissingRequiredPropertyException("RuleTarget", "endpoint");
            }
            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder paramLists(List<RuleTargetParamList> paramLists) {
            if (paramLists == null) {
              throw new MissingRequiredPropertyException("RuleTarget", "paramLists");
            }
            this.paramLists = paramLists;
            return this;
        }
        public Builder paramLists(RuleTargetParamList... paramLists) {
            return paramLists(List.of(paramLists));
        }
        @CustomType.Setter
        public Builder pushRetryStrategy(@Nullable String pushRetryStrategy) {

            this.pushRetryStrategy = pushRetryStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder targetId(String targetId) {
            if (targetId == null) {
              throw new MissingRequiredPropertyException("RuleTarget", "targetId");
            }
            this.targetId = targetId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("RuleTarget", "type");
            }
            this.type = type;
            return this;
        }
        public RuleTarget build() {
            final var _resultValue = new RuleTarget();
            _resultValue.deadLetterQueue = deadLetterQueue;
            _resultValue.endpoint = endpoint;
            _resultValue.paramLists = paramLists;
            _resultValue.pushRetryStrategy = pushRetryStrategy;
            _resultValue.targetId = targetId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
