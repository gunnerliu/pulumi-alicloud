// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventRuleSlsParameter {
    /**
     * @return (Available since v1.211.1) The ARN of the API operation.
     * 
     */
    private @Nullable String arn;
    /**
     * @return The name of the Simple Log Service Logstore.
     * 
     */
    private @Nullable String logStore;
    /**
     * @return The name of the Simple Log Service project.
     * 
     */
    private @Nullable String project;
    /**
     * @return The region where Simple Log Service is deployed.
     * 
     */
    private @Nullable String region;
    /**
     * @return The ID of the recipient that receives alert notifications.
     * 
     */
    private @Nullable String slsParametersId;

    private EventRuleSlsParameter() {}
    /**
     * @return (Available since v1.211.1) The ARN of the API operation.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The name of the Simple Log Service Logstore.
     * 
     */
    public Optional<String> logStore() {
        return Optional.ofNullable(this.logStore);
    }
    /**
     * @return The name of the Simple Log Service project.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    /**
     * @return The region where Simple Log Service is deployed.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return The ID of the recipient that receives alert notifications.
     * 
     */
    public Optional<String> slsParametersId() {
        return Optional.ofNullable(this.slsParametersId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventRuleSlsParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String logStore;
        private @Nullable String project;
        private @Nullable String region;
        private @Nullable String slsParametersId;
        public Builder() {}
        public Builder(EventRuleSlsParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.logStore = defaults.logStore;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.slsParametersId = defaults.slsParametersId;
        }

        @CustomType.Setter
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder logStore(@Nullable String logStore) {
            this.logStore = logStore;
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder slsParametersId(@Nullable String slsParametersId) {
            this.slsParametersId = slsParametersId;
            return this;
        }
        public EventRuleSlsParameter build() {
            final var _resultValue = new EventRuleSlsParameter();
            _resultValue.arn = arn;
            _resultValue.logStore = logStore;
            _resultValue.project = project;
            _resultValue.region = region;
            _resultValue.slsParametersId = slsParametersId;
            return _resultValue;
        }
    }
}
