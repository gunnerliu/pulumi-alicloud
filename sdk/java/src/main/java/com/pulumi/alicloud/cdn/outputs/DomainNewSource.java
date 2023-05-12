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
    private final String content;
    /**
     * @return The port of source. Valid values are `443` and `80`. Default value is `80`.
     * 
     */
    private final @Nullable Integer port;
    /**
     * @return Priority of the source. Valid values are `0` and `100`. Default value is `20`.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * @return The type of the source. Valid values are `ipaddr`, `domain` and `oss`.
     * 
     */
    private final String type;
    /**
     * @return Weight of the source. Valid values are from `0` to `100`. Default value is `10`, but if type is `ipaddr`, the value can only be `10`.
     * 
     */
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private DomainNewSource(
        @CustomType.Parameter("content") String content,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("priority") @Nullable Integer priority,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.content = content;
        this.port = port;
        this.priority = priority;
        this.type = type;
        this.weight = weight;
    }

    /**
     * @return The address of source. Valid values can be ip or doaminName. Each item&#39;s `content` can not be repeated.
     * 
     */
    public String content() {
        return this.content;
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
    public String type() {
        return this.type;
    }
    /**
     * @return Weight of the source. Valid values are from `0` to `100`. Default value is `10`, but if type is `ipaddr`, the value can only be `10`.
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

    public static final class Builder {
        private String content;
        private @Nullable Integer port;
        private @Nullable Integer priority;
        private String type;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNewSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.port = defaults.port;
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
    	      this.weight = defaults.weight;
        }

        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public DomainNewSource build() {
            return new DomainNewSource(content, port, priority, type, weight);
        }
    }
}
