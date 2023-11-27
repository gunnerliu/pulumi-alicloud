// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterBootstrapAction {
    /**
     * @return bootstrap action args, e.g. &#34;--a=b&#34;.
     * 
     */
    private @Nullable String arg;
    /**
     * @return bootstrap action execution fail strategy, ’FAILED_BLOCKED’ or ‘FAILED_CONTINUE’ . Default value: &#34;FAILED_BLOCKED
     * 
     */
    private @Nullable String executionFailStrategy;
    /**
     * @return bootstrap action execution moment, ’BEFORE_INSTALL’ or ‘AFTER_STARTED’ . Default value: &#34;BEFORE_INSTALL&#34;.
     * 
     */
    private @Nullable String executionMoment;
    /**
     * @return bootstrap action execution target, you can specify the host group name, e.g. &#34;core_group&#34;. If this is not specified, the bootstrap action execution target is whole cluster.
     * 
     */
    private @Nullable String executionTarget;
    /**
     * @return The name of emr cluster. The name length must be less than 64. Supported characters: chinese character, english character, number, &#34;-&#34;, &#34;_&#34;.
     * 
     */
    private @Nullable String name;
    /**
     * @return bootstrap action path, e.g. &#34;oss://bucket/path&#34;.
     * 
     */
    private @Nullable String path;

    private ClusterBootstrapAction() {}
    /**
     * @return bootstrap action args, e.g. &#34;--a=b&#34;.
     * 
     */
    public Optional<String> arg() {
        return Optional.ofNullable(this.arg);
    }
    /**
     * @return bootstrap action execution fail strategy, ’FAILED_BLOCKED’ or ‘FAILED_CONTINUE’ . Default value: &#34;FAILED_BLOCKED
     * 
     */
    public Optional<String> executionFailStrategy() {
        return Optional.ofNullable(this.executionFailStrategy);
    }
    /**
     * @return bootstrap action execution moment, ’BEFORE_INSTALL’ or ‘AFTER_STARTED’ . Default value: &#34;BEFORE_INSTALL&#34;.
     * 
     */
    public Optional<String> executionMoment() {
        return Optional.ofNullable(this.executionMoment);
    }
    /**
     * @return bootstrap action execution target, you can specify the host group name, e.g. &#34;core_group&#34;. If this is not specified, the bootstrap action execution target is whole cluster.
     * 
     */
    public Optional<String> executionTarget() {
        return Optional.ofNullable(this.executionTarget);
    }
    /**
     * @return The name of emr cluster. The name length must be less than 64. Supported characters: chinese character, english character, number, &#34;-&#34;, &#34;_&#34;.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return bootstrap action path, e.g. &#34;oss://bucket/path&#34;.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterBootstrapAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arg;
        private @Nullable String executionFailStrategy;
        private @Nullable String executionMoment;
        private @Nullable String executionTarget;
        private @Nullable String name;
        private @Nullable String path;
        public Builder() {}
        public Builder(ClusterBootstrapAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arg = defaults.arg;
    	      this.executionFailStrategy = defaults.executionFailStrategy;
    	      this.executionMoment = defaults.executionMoment;
    	      this.executionTarget = defaults.executionTarget;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder arg(@Nullable String arg) {
            this.arg = arg;
            return this;
        }
        @CustomType.Setter
        public Builder executionFailStrategy(@Nullable String executionFailStrategy) {
            this.executionFailStrategy = executionFailStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder executionMoment(@Nullable String executionMoment) {
            this.executionMoment = executionMoment;
            return this;
        }
        @CustomType.Setter
        public Builder executionTarget(@Nullable String executionTarget) {
            this.executionTarget = executionTarget;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public ClusterBootstrapAction build() {
            final var _resultValue = new ClusterBootstrapAction();
            _resultValue.arg = arg;
            _resultValue.executionFailStrategy = executionFailStrategy;
            _resultValue.executionMoment = executionMoment;
            _resultValue.executionTarget = executionTarget;
            _resultValue.name = name;
            _resultValue.path = path;
            return _resultValue;
        }
    }
}
