// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKubernetesClustersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKubernetesClustersArgs Empty = new GetKubernetesClustersArgs();

    @Import(name="enableDetails")
    private @Nullable Output<Boolean> enableDetails;

    public Optional<Output<Boolean>> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * Cluster IDs to filter.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return Cluster IDs to filter.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/k8s`, then it will be named with `~/.kube/k8s-clusterID-kubeconfig`. If you don&#39;t specify this field, it will be stored in the current directory and named with `clusterID-kubeconfig`.
     * 
     */
    @Import(name="kubeConfigFilePrefix")
    private @Nullable Output<String> kubeConfigFilePrefix;

    /**
     * @return The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/k8s`, then it will be named with `~/.kube/k8s-clusterID-kubeconfig`. If you don&#39;t specify this field, it will be stored in the current directory and named with `clusterID-kubeconfig`.
     * 
     */
    public Optional<Output<String>> kubeConfigFilePrefix() {
        return Optional.ofNullable(this.kubeConfigFilePrefix);
    }

    /**
     * A regex string to filter results by cluster name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by cluster name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetKubernetesClustersArgs() {}

    private GetKubernetesClustersArgs(GetKubernetesClustersArgs $) {
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.kubeConfigFilePrefix = $.kubeConfigFilePrefix;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKubernetesClustersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKubernetesClustersArgs $;

        public Builder() {
            $ = new GetKubernetesClustersArgs();
        }

        public Builder(GetKubernetesClustersArgs defaults) {
            $ = new GetKubernetesClustersArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableDetails(@Nullable Output<Boolean> enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        public Builder enableDetails(Boolean enableDetails) {
            return enableDetails(Output.of(enableDetails));
        }

        /**
         * @param ids Cluster IDs to filter.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids Cluster IDs to filter.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
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
         * @param kubeConfigFilePrefix The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/k8s`, then it will be named with `~/.kube/k8s-clusterID-kubeconfig`. If you don&#39;t specify this field, it will be stored in the current directory and named with `clusterID-kubeconfig`.
         * 
         * @return builder
         * 
         */
        public Builder kubeConfigFilePrefix(@Nullable Output<String> kubeConfigFilePrefix) {
            $.kubeConfigFilePrefix = kubeConfigFilePrefix;
            return this;
        }

        /**
         * @param kubeConfigFilePrefix The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/k8s`, then it will be named with `~/.kube/k8s-clusterID-kubeconfig`. If you don&#39;t specify this field, it will be stored in the current directory and named with `clusterID-kubeconfig`.
         * 
         * @return builder
         * 
         */
        public Builder kubeConfigFilePrefix(String kubeConfigFilePrefix) {
            return kubeConfigFilePrefix(Output.of(kubeConfigFilePrefix));
        }

        /**
         * @param nameRegex A regex string to filter results by cluster name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by cluster name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public GetKubernetesClustersArgs build() {
            return $;
        }
    }

}
