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


public final class ShardingInstanceShardListArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShardingInstanceShardListArgs Empty = new ShardingInstanceShardListArgs();

    /**
     * Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
     * 
     */
    @Import(name="nodeClass", required=true)
    private Output<String> nodeClass;

    /**
     * @return Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
     * 
     */
    public Output<String> nodeClass() {
        return this.nodeClass;
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
    @Import(name="nodeStorage", required=true)
    private Output<Integer> nodeStorage;

    /**
     * @return - Custom storage space; value range: [10, 1,000]
     * - 10-GB increments. Unit: GB.
     * 
     */
    public Output<Integer> nodeStorage() {
        return this.nodeStorage;
    }

    /**
     * The number of read-only nodes in shard node. Valid values: 0 to 5. Default value: 0.
     * 
     */
    @Import(name="readonlyReplicas")
    private @Nullable Output<Integer> readonlyReplicas;

    /**
     * @return The number of read-only nodes in shard node. Valid values: 0 to 5. Default value: 0.
     * 
     */
    public Optional<Output<Integer>> readonlyReplicas() {
        return Optional.ofNullable(this.readonlyReplicas);
    }

    private ShardingInstanceShardListArgs() {}

    private ShardingInstanceShardListArgs(ShardingInstanceShardListArgs $) {
        this.nodeClass = $.nodeClass;
        this.nodeId = $.nodeId;
        this.nodeStorage = $.nodeStorage;
        this.readonlyReplicas = $.readonlyReplicas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShardingInstanceShardListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShardingInstanceShardListArgs $;

        public Builder() {
            $ = new ShardingInstanceShardListArgs();
        }

        public Builder(ShardingInstanceShardListArgs defaults) {
            $ = new ShardingInstanceShardListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeClass Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
         * 
         * @return builder
         * 
         */
        public Builder nodeClass(Output<String> nodeClass) {
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
        public Builder nodeStorage(Output<Integer> nodeStorage) {
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
         * @param readonlyReplicas The number of read-only nodes in shard node. Valid values: 0 to 5. Default value: 0.
         * 
         * @return builder
         * 
         */
        public Builder readonlyReplicas(@Nullable Output<Integer> readonlyReplicas) {
            $.readonlyReplicas = readonlyReplicas;
            return this;
        }

        /**
         * @param readonlyReplicas The number of read-only nodes in shard node. Valid values: 0 to 5. Default value: 0.
         * 
         * @return builder
         * 
         */
        public Builder readonlyReplicas(Integer readonlyReplicas) {
            return readonlyReplicas(Output.of(readonlyReplicas));
        }

        public ShardingInstanceShardListArgs build() {
            $.nodeClass = Objects.requireNonNull($.nodeClass, "expected parameter 'nodeClass' to be non-null");
            $.nodeStorage = Objects.requireNonNull($.nodeStorage, "expected parameter 'nodeStorage' to be non-null");
            return $;
        }
    }

}
