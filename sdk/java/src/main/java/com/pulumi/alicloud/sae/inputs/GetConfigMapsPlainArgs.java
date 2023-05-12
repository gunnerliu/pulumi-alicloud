// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConfigMapsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigMapsPlainArgs Empty = new GetConfigMapsPlainArgs();

    /**
     * A list of Config Map IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Config Map IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Config Map name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Config Map name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * The NamespaceId of Config Maps.
     * 
     */
    @Import(name="namespaceId", required=true)
    private String namespaceId;

    /**
     * @return The NamespaceId of Config Maps.
     * 
     */
    public String namespaceId() {
        return this.namespaceId;
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

    private GetConfigMapsPlainArgs() {}

    private GetConfigMapsPlainArgs(GetConfigMapsPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.namespaceId = $.namespaceId;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigMapsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigMapsPlainArgs $;

        public Builder() {
            $ = new GetConfigMapsPlainArgs();
        }

        public Builder(GetConfigMapsPlainArgs defaults) {
            $ = new GetConfigMapsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Config Map IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Config Map IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Config Map name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param namespaceId The NamespaceId of Config Maps.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            $.namespaceId = namespaceId;
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

        public GetConfigMapsPlainArgs build() {
            $.namespaceId = Objects.requireNonNull($.namespaceId, "expected parameter 'namespaceId' to be non-null");
            return $;
        }
    }

}
