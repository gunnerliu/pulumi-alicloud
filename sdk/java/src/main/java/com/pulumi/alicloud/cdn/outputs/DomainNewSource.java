// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainNewSource {
    /**
     * @return The address of source. Valid values can be ip or doaminName. Each item&#39;s `content` can not be repeated.
     * 
     */
    private @Nullable String content;
    /**
     * @return The port of source. Valid values are `443` and `80`. Default value is `80`.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return Priority of the source. Valid values are `0` and `100`. Default value is `20`.
     * 
     */
    private @Nullable Integer priority;
    /**
     * @return The type of the source. Valid values are `ipaddr`, `domain` and `oss`.
     * 
     */
    private @Nullable String type;
    /**
     * @return Weight of the source. Valid values are from `0` to `100`. Default value is `10`, but if type is `ipaddr`, the value can only be `10`. .
     * 
     */
    private @Nullable Integer weight;

    private DomainNewSource() {}
    /**
     * @return The address of source. Valid values can be ip or doaminName. Each item&#39;s `content` can not be repeated.
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return The port of source. Valid values are `443` and `80`. Default value is `80`.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Priority of the source. Valid values are `0` and `100`. Default value is `20`.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return The type of the source. Valid values are `ipaddr`, `domain` and `oss`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Weight of the source. Valid values are from `0` to `100`. Default value is `10`, but if type is `ipaddr`, the value can only be `10`. .
     * 
     */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNewSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String content;
        private @Nullable Integer port;
        private @Nullable Integer priority;
        private @Nullable String type;
        private @Nullable Integer weight;
        public Builder() {}
        public Builder(DomainNewSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.port = defaults.port;
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public DomainNewSource build() {
            final var _resultValue = new DomainNewSource();
            _resultValue.content = content;
            _resultValue.port = port;
            _resultValue.priority = priority;
            _resultValue.type = type;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
