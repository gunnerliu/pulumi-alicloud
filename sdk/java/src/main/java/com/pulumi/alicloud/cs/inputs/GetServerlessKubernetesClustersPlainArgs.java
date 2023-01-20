// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerlessKubernetesClustersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerlessKubernetesClustersPlainArgs Empty = new GetServerlessKubernetesClustersPlainArgs();

    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * Cluster IDs to filter.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return Cluster IDs to filter.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/serverless`, then it will be named with `~/.kube/serverless-clusterID-kubeconfig`. From version 1.187.0+, kube_config will not export kube_config if this field is not set.
     * 
     */
    @Import(name="kubeConfigFilePrefix")
    private @Nullable String kubeConfigFilePrefix;

    /**
     * @return The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/serverless`, then it will be named with `~/.kube/serverless-clusterID-kubeconfig`. From version 1.187.0+, kube_config will not export kube_config if this field is not set.
     * 
     */
    public Optional<String> kubeConfigFilePrefix() {
        return Optional.ofNullable(this.kubeConfigFilePrefix);
    }

    /**
     * A regex string to filter results by cluster name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by cluster name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetServerlessKubernetesClustersPlainArgs() {}

    private GetServerlessKubernetesClustersPlainArgs(GetServerlessKubernetesClustersPlainArgs $) {
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.kubeConfigFilePrefix = $.kubeConfigFilePrefix;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerlessKubernetesClustersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerlessKubernetesClustersPlainArgs $;

        public Builder() {
            $ = new GetServerlessKubernetesClustersPlainArgs();
        }

        public Builder(GetServerlessKubernetesClustersPlainArgs defaults) {
            $ = new GetServerlessKubernetesClustersPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids Cluster IDs to filter.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids Cluster IDs to filter.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param kubeConfigFilePrefix The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/serverless`, then it will be named with `~/.kube/serverless-clusterID-kubeconfig`. From version 1.187.0+, kube_config will not export kube_config if this field is not set.
         * 
         * @return builder
         * 
         */
        public Builder kubeConfigFilePrefix(@Nullable String kubeConfigFilePrefix) {
            $.kubeConfigFilePrefix = kubeConfigFilePrefix;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by cluster name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public GetServerlessKubernetesClustersPlainArgs build() {
            return $;
        }
    }

}
