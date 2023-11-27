// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.outputs;

import com.pulumi.alicloud.rocketmq.outputs.GetTopicsTopic;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTopicsResult {
    private @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private String instanceId;
    private @Nullable String nameRegex;
    /**
     * @return A list of topic names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return A map of tags assigned to the Ons instance.
     * 
     */
    private @Nullable Map<String,Object> tags;
    /**
     * @return A list of topics. Each element contains the following attributes:
     * 
     */
    private List<GetTopicsTopic> topics;

    private GetTopicsResult() {}
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public String instanceId() {
        return this.instanceId;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of topic names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A map of tags assigned to the Ons instance.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return A list of topics. Each element contains the following attributes:
     * 
     */
    public List<GetTopicsTopic> topics() {
        return this.topics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private String instanceId;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable Map<String,Object> tags;
        private List<GetTopicsTopic> topics;
        public Builder() {}
        public Builder(GetTopicsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.tags = defaults.tags;
    	      this.topics = defaults.topics;
        }

        @CustomType.Setter
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder topics(List<GetTopicsTopic> topics) {
            this.topics = Objects.requireNonNull(topics);
            return this;
        }
        public Builder topics(GetTopicsTopic... topics) {
            return topics(List.of(topics));
        }
        public GetTopicsResult build() {
            final var _resultValue = new GetTopicsResult();
            _resultValue.enableDetails = enableDetails;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceId = instanceId;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.tags = tags;
            _resultValue.topics = topics;
            return _resultValue;
        }
    }
}
