// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mongodb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ShardingInstanceMongoList {
    /**
     * @return The connection address of the Config Server node.
     * 
     */
    private @Nullable String connectString;
    /**
     * @return -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
     * 
     */
    private String nodeClass;
    /**
     * @return The ID of the Config Server node.
     * 
     */
    private @Nullable String nodeId;
    /**
     * @return The connection port of the Config Server node.
     * 
     */
    private @Nullable Integer port;

    private ShardingInstanceMongoList() {}
    /**
     * @return The connection address of the Config Server node.
     * 
     */
    public Optional<String> connectString() {
        return Optional.ofNullable(this.connectString);
    }
    /**
     * @return -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
     * 
     */
    public String nodeClass() {
        return this.nodeClass;
    }
    /**
     * @return The ID of the Config Server node.
     * 
     */
    public Optional<String> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }
    /**
     * @return The connection port of the Config Server node.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShardingInstanceMongoList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String connectString;
        private String nodeClass;
        private @Nullable String nodeId;
        private @Nullable Integer port;
        public Builder() {}
        public Builder(ShardingInstanceMongoList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectString = defaults.connectString;
    	      this.nodeClass = defaults.nodeClass;
    	      this.nodeId = defaults.nodeId;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder connectString(@Nullable String connectString) {
            this.connectString = connectString;
            return this;
        }
        @CustomType.Setter
        public Builder nodeClass(String nodeClass) {
            this.nodeClass = Objects.requireNonNull(nodeClass);
            return this;
        }
        @CustomType.Setter
        public Builder nodeId(@Nullable String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public ShardingInstanceMongoList build() {
            final var o = new ShardingInstanceMongoList();
            o.connectString = connectString;
            o.nodeClass = nodeClass;
            o.nodeId = nodeId;
            o.port = port;
            return o;
        }
    }
}
