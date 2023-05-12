// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.actiontrail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConsumerGroupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConsumerGroupsArgs Empty = new GetConsumerGroupsArgs();

    /**
     * A regex string to filter results by the consumer group id.
     * 
     */
    @Import(name="consumerIdRegex")
    private @Nullable Output<String> consumerIdRegex;

    /**
     * @return A regex string to filter results by the consumer group id.
     * 
     */
    public Optional<Output<String>> consumerIdRegex() {
        return Optional.ofNullable(this.consumerIdRegex);
    }

    /**
     * A list of ALIKAFKA Consumer Groups IDs, It is formatted to `&lt;instance_id&gt;:&lt;consumer_id&gt;`.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of ALIKAFKA Consumer Groups IDs, It is formatted to `&lt;instance_id&gt;:&lt;consumer_id&gt;`.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * ID of the ALIKAFKA Instance that owns the consumer groups.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return ID of the ALIKAFKA Instance that owns the consumer groups.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetConsumerGroupsArgs() {}

    private GetConsumerGroupsArgs(GetConsumerGroupsArgs $) {
        this.consumerIdRegex = $.consumerIdRegex;
        this.ids = $.ids;
        this.instanceId = $.instanceId;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConsumerGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConsumerGroupsArgs $;

        public Builder() {
            $ = new GetConsumerGroupsArgs();
        }

        public Builder(GetConsumerGroupsArgs defaults) {
            $ = new GetConsumerGroupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consumerIdRegex A regex string to filter results by the consumer group id.
         * 
         * @return builder
         * 
         */
        public Builder consumerIdRegex(@Nullable Output<String> consumerIdRegex) {
            $.consumerIdRegex = consumerIdRegex;
            return this;
        }

        /**
         * @param consumerIdRegex A regex string to filter results by the consumer group id.
         * 
         * @return builder
         * 
         */
        public Builder consumerIdRegex(String consumerIdRegex) {
            return consumerIdRegex(Output.of(consumerIdRegex));
        }

        /**
         * @param ids A list of ALIKAFKA Consumer Groups IDs, It is formatted to `&lt;instance_id&gt;:&lt;consumer_id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of ALIKAFKA Consumer Groups IDs, It is formatted to `&lt;instance_id&gt;:&lt;consumer_id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of ALIKAFKA Consumer Groups IDs, It is formatted to `&lt;instance_id&gt;:&lt;consumer_id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param instanceId ID of the ALIKAFKA Instance that owns the consumer groups.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId ID of the ALIKAFKA Instance that owns the consumer groups.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public GetConsumerGroupsArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
