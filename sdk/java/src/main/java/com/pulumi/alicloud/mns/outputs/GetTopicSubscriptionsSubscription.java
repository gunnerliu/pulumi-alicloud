// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTopicSubscriptionsSubscription {
    /**
     * @return Describe the terminal address of the message received in this subscription.
     * 
     */
    private final String endpoint;
    /**
     * @return A string to filter resulting messages of the topic by their message tag.
     * 
     */
    private final String filterTag;
    /**
     * @return The ID of the topic subscription. The value is set to `name`.
     * 
     */
    private final String id;
    /**
     * @return The name of the subscription.
     * 
     */
    private final String name;
    /**
     * @return The NotifyContentFormat attribute of Subscription. This attribute specifies the content format of the messages pushed to users.
     * 
     */
    private final String notifyContentFormat;
    /**
     * @return The NotifyStrategy attribute of Subscription. This attribute specifies the retry strategy when message sending fails.
     * 
     */
    private final String notifyStrategy;
    /**
     * @return Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
     * 
     */
    private final String topicName;

    @CustomType.Constructor
    private GetTopicSubscriptionsSubscription(
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("filterTag") String filterTag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notifyContentFormat") String notifyContentFormat,
        @CustomType.Parameter("notifyStrategy") String notifyStrategy,
        @CustomType.Parameter("topicName") String topicName) {
        this.endpoint = endpoint;
        this.filterTag = filterTag;
        this.id = id;
        this.name = name;
        this.notifyContentFormat = notifyContentFormat;
        this.notifyStrategy = notifyStrategy;
        this.topicName = topicName;
    }

    /**
     * @return Describe the terminal address of the message received in this subscription.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return A string to filter resulting messages of the topic by their message tag.
     * 
     */
    public String filterTag() {
        return this.filterTag;
    }
    /**
     * @return The ID of the topic subscription. The value is set to `name`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the subscription.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The NotifyContentFormat attribute of Subscription. This attribute specifies the content format of the messages pushed to users.
     * 
     */
    public String notifyContentFormat() {
        return this.notifyContentFormat;
    }
    /**
     * @return The NotifyStrategy attribute of Subscription. This attribute specifies the retry strategy when message sending fails.
     * 
     */
    public String notifyStrategy() {
        return this.notifyStrategy;
    }
    /**
     * @return Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
     * 
     */
    public String topicName() {
        return this.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicSubscriptionsSubscription defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private String filterTag;
        private String id;
        private String name;
        private String notifyContentFormat;
        private String notifyStrategy;
        private String topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTopicSubscriptionsSubscription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.filterTag = defaults.filterTag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.notifyContentFormat = defaults.notifyContentFormat;
    	      this.notifyStrategy = defaults.notifyStrategy;
    	      this.topicName = defaults.topicName;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder filterTag(String filterTag) {
            this.filterTag = Objects.requireNonNull(filterTag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notifyContentFormat(String notifyContentFormat) {
            this.notifyContentFormat = Objects.requireNonNull(notifyContentFormat);
            return this;
        }
        public Builder notifyStrategy(String notifyStrategy) {
            this.notifyStrategy = Objects.requireNonNull(notifyStrategy);
            return this;
        }
        public Builder topicName(String topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }        public GetTopicSubscriptionsSubscription build() {
            return new GetTopicSubscriptionsSubscription(endpoint, filterTag, id, name, notifyContentFormat, notifyStrategy, topicName);
        }
    }
}
