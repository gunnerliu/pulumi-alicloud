// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EngineNamespaceState extends com.pulumi.resources.ResourceArgs {

    public static final EngineNamespaceState Empty = new EngineNamespaceState();

    /**
     * The language type of the returned information. Valid values: `zh`, `en`.
     * 
     */
    @Import(name="acceptLanguage")
    private @Nullable Output<String> acceptLanguage;

    /**
     * @return The language type of the returned information. Valid values: `zh`, `en`.
     * 
     */
    public Optional<Output<String>> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * The id of the cluster.
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The id of the cluster.
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * The id of Namespace.
     * 
     */
    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    /**
     * @return The id of Namespace.
     * 
     */
    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    /**
     * The name of the Engine Namespace.
     * 
     */
    @Import(name="namespaceShowName")
    private @Nullable Output<String> namespaceShowName;

    /**
     * @return The name of the Engine Namespace.
     * 
     */
    public Optional<Output<String>> namespaceShowName() {
        return Optional.ofNullable(this.namespaceShowName);
    }

    private EngineNamespaceState() {}

    private EngineNamespaceState(EngineNamespaceState $) {
        this.acceptLanguage = $.acceptLanguage;
        this.clusterId = $.clusterId;
        this.namespaceId = $.namespaceId;
        this.namespaceShowName = $.namespaceShowName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EngineNamespaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EngineNamespaceState $;

        public Builder() {
            $ = new EngineNamespaceState();
        }

        public Builder(EngineNamespaceState defaults) {
            $ = new EngineNamespaceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptLanguage The language type of the returned information. Valid values: `zh`, `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            $.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * @param acceptLanguage The language type of the returned information. Valid values: `zh`, `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(String acceptLanguage) {
            return acceptLanguage(Output.of(acceptLanguage));
        }

        /**
         * @param clusterId The id of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The id of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param namespaceId The id of Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId The id of Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param namespaceShowName The name of the Engine Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceShowName(@Nullable Output<String> namespaceShowName) {
            $.namespaceShowName = namespaceShowName;
            return this;
        }

        /**
         * @param namespaceShowName The name of the Engine Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceShowName(String namespaceShowName) {
            return namespaceShowName(Output.of(namespaceShowName));
        }

        public EngineNamespaceState build() {
            return $;
        }
    }

}
