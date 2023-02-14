// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mongodb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ShardingInstanceConfigServerListArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShardingInstanceConfigServerListArgs Empty = new ShardingInstanceConfigServerListArgs();

    /**
     * The connection address of the Config Server node.
     * 
     */
    @Import(name="connectString")
    private @Nullable Output<String> connectString;

    /**
     * @return The connection address of the Config Server node.
     * 
     */
    public Optional<Output<String>> connectString() {
        return Optional.ofNullable(this.connectString);
    }

    /**
     * The max connections of the Config Server node.
     * 
     */
    @Import(name="maxConnections")
    private @Nullable Output<Integer> maxConnections;

    /**
     * @return The max connections of the Config Server node.
     * 
     */
    public Optional<Output<Integer>> maxConnections() {
        return Optional.ofNullable(this.maxConnections);
    }

    /**
     * The maximum IOPS of the Config Server node.
     * 
     */
    @Import(name="maxIops")
    private @Nullable Output<Integer> maxIops;

    /**
     * @return The maximum IOPS of the Config Server node.
     * 
     */
    public Optional<Output<Integer>> maxIops() {
        return Optional.ofNullable(this.maxIops);
    }

    /**
     * Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
     * 
     */
    @Import(name="nodeClass")
    private @Nullable Output<String> nodeClass;

    /**
     * @return Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
     * 
     */
    public Optional<Output<String>> nodeClass() {
        return Optional.ofNullable(this.nodeClass);
    }

    /**
     * The description of the Config Server node.
     * 
     */
    @Import(name="nodeDescription")
    private @Nullable Output<String> nodeDescription;

    /**
     * @return The description of the Config Server node.
     * 
     */
    public Optional<Output<String>> nodeDescription() {
        return Optional.ofNullable(this.nodeDescription);
    }

    /**
     * The ID of the Config Server node.
     * 
     */
    @Import(name="nodeId")
    private @Nullable Output<String> nodeId;

    /**
     * @return The ID of the Config Server node.
     * 
     */
    public Optional<Output<String>> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }

    /**
     * - Custom storage space; value range: [10, 1,000]
     * - 10-GB increments. Unit: GB.
     * 
     */
    @Import(name="nodeStorage")
    private @Nullable Output<Integer> nodeStorage;

    /**
     * @return - Custom storage space; value range: [10, 1,000]
     * - 10-GB increments. Unit: GB.
     * 
     */
    public Optional<Output<Integer>> nodeStorage() {
        return Optional.ofNullable(this.nodeStorage);
    }

    /**
     * The connection port of the Config Server node.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The connection port of the Config Server node.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    private ShardingInstanceConfigServerListArgs() {}

    private ShardingInstanceConfigServerListArgs(ShardingInstanceConfigServerListArgs $) {
        this.connectString = $.connectString;
        this.maxConnections = $.maxConnections;
        this.maxIops = $.maxIops;
        this.nodeClass = $.nodeClass;
        this.nodeDescription = $.nodeDescription;
        this.nodeId = $.nodeId;
        this.nodeStorage = $.nodeStorage;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShardingInstanceConfigServerListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShardingInstanceConfigServerListArgs $;

        public Builder() {
            $ = new ShardingInstanceConfigServerListArgs();
        }

        public Builder(ShardingInstanceConfigServerListArgs defaults) {
            $ = new ShardingInstanceConfigServerListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectString The connection address of the Config Server node.
         * 
         * @return builder
         * 
         */
        public Builder connectString(@Nullable Output<String> connectString) {
            $.connectString = connectString;
            return this;
        }

        /**
         * @param connectString The connection address of the Config Server node.
         * 
         * @return builder
         * 
         */
        public Builder connectString(String connectString) {
            return connectString(Output.of(connectString));
        }

        /**
         * @param maxConnections The max connections of the Config Server node.
         * 
         * @return builder
         * 
         */
        public Builder maxConnections(@Nullable Output<Integer> maxConnections) {
            $.maxConnections = maxConnections;
            return this;
        }

        /**
         * @param maxConnections The max connections of the Config Server node.
         * 
         * @return builder
         * 
         */
        public Builder maxConnections(Integer maxConnections) {
            return maxConnections(Output.of(maxConnections));
        }

        /**
         * @param maxIops The maximum IOPS of the Config Server node.
         * 
         * @return builder
         * 
         */
        public Builder maxIops(@Nullable Output<Integer> maxIops) {
            $.maxIops = maxIops;
            return this;
        }

        /**
         * @param maxIops The maximum IOPS of the Config Server node.
         * 
         * @return builder
         * 
         */
        public Builder maxIops(Integer maxIops) {
            return maxIops(Output.of(maxIops));
        }

        /**
         * @param nodeClass Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
         * 
         * @return builder
         * 
         */
        public Builder nodeClass(@Nullable Output<String> nodeClass) {
            $.nodeClass = nodeClass;
            return this;
        }

        /**
         * @param nodeClass Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
         * 
         * @return builder
         * 
         */
        public Builder nodeClass(String nodeClass) {
            return nodeClass(Output.of(nodeClass));
        }

        /**
         * @param nodeDescription The description of the Config Server node.
         * 
         * @return builder
         * 
         */
        public Builder nodeDescription(@Nullable Output<String> nodeDescription) {
            $.nodeDescription = nodeDescription;
            return this;
        }

        /**
         * @param nodeDescription The description of the Config Server node.
         * 
         * @return builder
         * 
         */
        public Builder nodeDescription(String nodeDescription) {
            return nodeDescription(Output.of(nodeDescription));
        }

        /**
         * @param nodeId The ID of the Config Server node.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(@Nullable Output<String> nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        /**
         * @param nodeId The ID of the Config Server node.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(String nodeId) {
            return nodeId(Output.of(nodeId));
        }

        /**
         * @param nodeStorage - Custom storage space; value range: [10, 1,000]
         * - 10-GB increments. Unit: GB.
         * 
         * @return builder
         * 
         */
        public Builder nodeStorage(@Nullable Output<Integer> nodeStorage) {
            $.nodeStorage = nodeStorage;
            return this;
        }

        /**
         * @param nodeStorage - Custom storage space; value range: [10, 1,000]
         * - 10-GB increments. Unit: GB.
         * 
         * @return builder
         * 
         */
        public Builder nodeStorage(Integer nodeStorage) {
            return nodeStorage(Output.of(nodeStorage));
        }

        /**
         * @param port The connection port of the Config Server node.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The connection port of the Config Server node.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public ShardingInstanceConfigServerListArgs build() {
            return $;
        }
    }

}