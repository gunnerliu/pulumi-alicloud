// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterModifyClusterServiceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterModifyClusterServiceConfigArgs Empty = new ClusterModifyClusterServiceConfigArgs();

    /**
     * Cluster service configuration modification comment, e.g. &#34;Modify tez configuration&#34;.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Cluster service configuration modification comment, e.g. &#34;Modify tez configuration&#34;.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Cluster service configuration modification params, e.g. ’{&#34;hdfs-site&#34;:{&#34;dfs.replication&#34;:&#34;3&#34;}}’.
     * 
     */
    @Import(name="configParams", required=true)
    private Output<String> configParams;

    /**
     * @return Cluster service configuration modification params, e.g. ’{&#34;hdfs-site&#34;:{&#34;dfs.replication&#34;:&#34;3&#34;}}’.
     * 
     */
    public Output<String> configParams() {
        return this.configParams;
    }

    /**
     * Cluster service configuration modification type.
     * 
     */
    @Import(name="configType")
    private @Nullable Output<String> configType;

    /**
     * @return Cluster service configuration modification type.
     * 
     */
    public Optional<Output<String>> configType() {
        return Optional.ofNullable(this.configType);
    }

    /**
     * Cluster service configuration modification custom params, e.g. ’{&#34;tez-site&#34;:{&#34;key&#34;:{&#34;Value&#34;:&#34;value&#34;}}}’.
     * 
     */
    @Import(name="customConfigParams")
    private @Nullable Output<String> customConfigParams;

    /**
     * @return Cluster service configuration modification custom params, e.g. ’{&#34;tez-site&#34;:{&#34;key&#34;:{&#34;Value&#34;:&#34;value&#34;}}}’.
     * 
     */
    public Optional<Output<String>> customConfigParams() {
        return Optional.ofNullable(this.customConfigParams);
    }

    /**
     * Cluster service configuration modification related gateway cluster id list.
     * 
     */
    @Import(name="gatewayClusterIdLists")
    private @Nullable Output<List<String>> gatewayClusterIdLists;

    /**
     * @return Cluster service configuration modification related gateway cluster id list.
     * 
     */
    public Optional<Output<List<String>>> gatewayClusterIdLists() {
        return Optional.ofNullable(this.gatewayClusterIdLists);
    }

    /**
     * Cluster service configuration modification node group id, e.g. ’G-XXX’.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return Cluster service configuration modification node group id, e.g. ’G-XXX’.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * Cluster service configuration modification host instance id, e.g. ’i-bp146tnrkq4tcxxxxx’.
     * 
     */
    @Import(name="hostInstanceId")
    private @Nullable Output<String> hostInstanceId;

    /**
     * @return Cluster service configuration modification host instance id, e.g. ’i-bp146tnrkq4tcxxxxx’.
     * 
     */
    public Optional<Output<String>> hostInstanceId() {
        return Optional.ofNullable(this.hostInstanceId);
    }

    /**
     * Cluster service configuration modification refresh host config, ’true’ or ’false’.
     * 
     */
    @Import(name="refreshHostConfig")
    private @Nullable Output<Boolean> refreshHostConfig;

    /**
     * @return Cluster service configuration modification refresh host config, ’true’ or ’false’.
     * 
     */
    public Optional<Output<Boolean>> refreshHostConfig() {
        return Optional.ofNullable(this.refreshHostConfig);
    }

    /**
     * Custom configuration service name, e.g. ’HDFS’.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return Custom configuration service name, e.g. ’HDFS’.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private ClusterModifyClusterServiceConfigArgs() {}

    private ClusterModifyClusterServiceConfigArgs(ClusterModifyClusterServiceConfigArgs $) {
        this.comment = $.comment;
        this.configParams = $.configParams;
        this.configType = $.configType;
        this.customConfigParams = $.customConfigParams;
        this.gatewayClusterIdLists = $.gatewayClusterIdLists;
        this.groupId = $.groupId;
        this.hostInstanceId = $.hostInstanceId;
        this.refreshHostConfig = $.refreshHostConfig;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterModifyClusterServiceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterModifyClusterServiceConfigArgs $;

        public Builder() {
            $ = new ClusterModifyClusterServiceConfigArgs();
        }

        public Builder(ClusterModifyClusterServiceConfigArgs defaults) {
            $ = new ClusterModifyClusterServiceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Cluster service configuration modification comment, e.g. &#34;Modify tez configuration&#34;.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Cluster service configuration modification comment, e.g. &#34;Modify tez configuration&#34;.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param configParams Cluster service configuration modification params, e.g. ’{&#34;hdfs-site&#34;:{&#34;dfs.replication&#34;:&#34;3&#34;}}’.
         * 
         * @return builder
         * 
         */
        public Builder configParams(Output<String> configParams) {
            $.configParams = configParams;
            return this;
        }

        /**
         * @param configParams Cluster service configuration modification params, e.g. ’{&#34;hdfs-site&#34;:{&#34;dfs.replication&#34;:&#34;3&#34;}}’.
         * 
         * @return builder
         * 
         */
        public Builder configParams(String configParams) {
            return configParams(Output.of(configParams));
        }

        /**
         * @param configType Cluster service configuration modification type.
         * 
         * @return builder
         * 
         */
        public Builder configType(@Nullable Output<String> configType) {
            $.configType = configType;
            return this;
        }

        /**
         * @param configType Cluster service configuration modification type.
         * 
         * @return builder
         * 
         */
        public Builder configType(String configType) {
            return configType(Output.of(configType));
        }

        /**
         * @param customConfigParams Cluster service configuration modification custom params, e.g. ’{&#34;tez-site&#34;:{&#34;key&#34;:{&#34;Value&#34;:&#34;value&#34;}}}’.
         * 
         * @return builder
         * 
         */
        public Builder customConfigParams(@Nullable Output<String> customConfigParams) {
            $.customConfigParams = customConfigParams;
            return this;
        }

        /**
         * @param customConfigParams Cluster service configuration modification custom params, e.g. ’{&#34;tez-site&#34;:{&#34;key&#34;:{&#34;Value&#34;:&#34;value&#34;}}}’.
         * 
         * @return builder
         * 
         */
        public Builder customConfigParams(String customConfigParams) {
            return customConfigParams(Output.of(customConfigParams));
        }

        /**
         * @param gatewayClusterIdLists Cluster service configuration modification related gateway cluster id list.
         * 
         * @return builder
         * 
         */
        public Builder gatewayClusterIdLists(@Nullable Output<List<String>> gatewayClusterIdLists) {
            $.gatewayClusterIdLists = gatewayClusterIdLists;
            return this;
        }

        /**
         * @param gatewayClusterIdLists Cluster service configuration modification related gateway cluster id list.
         * 
         * @return builder
         * 
         */
        public Builder gatewayClusterIdLists(List<String> gatewayClusterIdLists) {
            return gatewayClusterIdLists(Output.of(gatewayClusterIdLists));
        }

        /**
         * @param gatewayClusterIdLists Cluster service configuration modification related gateway cluster id list.
         * 
         * @return builder
         * 
         */
        public Builder gatewayClusterIdLists(String... gatewayClusterIdLists) {
            return gatewayClusterIdLists(List.of(gatewayClusterIdLists));
        }

        /**
         * @param groupId Cluster service configuration modification node group id, e.g. ’G-XXX’.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Cluster service configuration modification node group id, e.g. ’G-XXX’.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param hostInstanceId Cluster service configuration modification host instance id, e.g. ’i-bp146tnrkq4tcxxxxx’.
         * 
         * @return builder
         * 
         */
        public Builder hostInstanceId(@Nullable Output<String> hostInstanceId) {
            $.hostInstanceId = hostInstanceId;
            return this;
        }

        /**
         * @param hostInstanceId Cluster service configuration modification host instance id, e.g. ’i-bp146tnrkq4tcxxxxx’.
         * 
         * @return builder
         * 
         */
        public Builder hostInstanceId(String hostInstanceId) {
            return hostInstanceId(Output.of(hostInstanceId));
        }

        /**
         * @param refreshHostConfig Cluster service configuration modification refresh host config, ’true’ or ’false’.
         * 
         * @return builder
         * 
         */
        public Builder refreshHostConfig(@Nullable Output<Boolean> refreshHostConfig) {
            $.refreshHostConfig = refreshHostConfig;
            return this;
        }

        /**
         * @param refreshHostConfig Cluster service configuration modification refresh host config, ’true’ or ’false’.
         * 
         * @return builder
         * 
         */
        public Builder refreshHostConfig(Boolean refreshHostConfig) {
            return refreshHostConfig(Output.of(refreshHostConfig));
        }

        /**
         * @param serviceName Custom configuration service name, e.g. ’HDFS’.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Custom configuration service name, e.g. ’HDFS’.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ClusterModifyClusterServiceConfigArgs build() {
            $.configParams = Objects.requireNonNull($.configParams, "expected parameter 'configParams' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}