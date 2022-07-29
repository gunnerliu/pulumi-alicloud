// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.edas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InstanceClusterAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceClusterAttachmentArgs Empty = new InstanceClusterAttachmentArgs();

    /**
     * The ID of the cluster that you want to create the application.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The ID of the cluster that you want to create the application.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * The ID of instance. Type: list.
     * 
     */
    @Import(name="instanceIds", required=true)
    private Output<List<String>> instanceIds;

    /**
     * @return The ID of instance. Type: list.
     * 
     */
    public Output<List<String>> instanceIds() {
        return this.instanceIds;
    }

    private InstanceClusterAttachmentArgs() {}

    private InstanceClusterAttachmentArgs(InstanceClusterAttachmentArgs $) {
        this.clusterId = $.clusterId;
        this.instanceIds = $.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceClusterAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceClusterAttachmentArgs $;

        public Builder() {
            $ = new InstanceClusterAttachmentArgs();
        }

        public Builder(InstanceClusterAttachmentArgs defaults) {
            $ = new InstanceClusterAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The ID of the cluster that you want to create the application.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The ID of the cluster that you want to create the application.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param instanceIds The ID of instance. Type: list.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(Output<List<String>> instanceIds) {
            $.instanceIds = instanceIds;
            return this;
        }

        /**
         * @param instanceIds The ID of instance. Type: list.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(List<String> instanceIds) {
            return instanceIds(Output.of(instanceIds));
        }

        /**
         * @param instanceIds The ID of instance. Type: list.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(String... instanceIds) {
            return instanceIds(List.of(instanceIds));
        }

        public InstanceClusterAttachmentArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.instanceIds = Objects.requireNonNull($.instanceIds, "expected parameter 'instanceIds' to be non-null");
            return $;
        }
    }

}
