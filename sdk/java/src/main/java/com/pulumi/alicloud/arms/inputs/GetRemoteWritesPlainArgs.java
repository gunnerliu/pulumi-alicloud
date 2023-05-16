// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRemoteWritesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRemoteWritesPlainArgs Empty = new GetRemoteWritesPlainArgs();

    /**
     * The ID of the Prometheus instance.
     * 
     */
    @Import(name="clusterId", required=true)
    private String clusterId;

    /**
     * @return The ID of the Prometheus instance.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * A list of Remote Write IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Remote Write IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Remote Write name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Remote Write name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetRemoteWritesPlainArgs() {}

    private GetRemoteWritesPlainArgs(GetRemoteWritesPlainArgs $) {
        this.clusterId = $.clusterId;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRemoteWritesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRemoteWritesPlainArgs $;

        public Builder() {
            $ = new GetRemoteWritesPlainArgs();
        }

        public Builder(GetRemoteWritesPlainArgs defaults) {
            $ = new GetRemoteWritesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The ID of the Prometheus instance.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param ids A list of Remote Write IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Remote Write IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Remote Write name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public GetRemoteWritesPlainArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            return $;
        }
    }

}