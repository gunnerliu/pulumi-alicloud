// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAdConnectorDirectoriesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAdConnectorDirectoriesPlainArgs Empty = new GetAdConnectorDirectoriesPlainArgs();

    /**
     * A list of Ad Connector Directory IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Ad Connector Directory IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Ad Connector Directory name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Ad Connector Directory name.
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

    /**
     * The status of directory.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of directory.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetAdConnectorDirectoriesPlainArgs() {}

    private GetAdConnectorDirectoriesPlainArgs(GetAdConnectorDirectoriesPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAdConnectorDirectoriesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAdConnectorDirectoriesPlainArgs $;

        public Builder() {
            $ = new GetAdConnectorDirectoriesPlainArgs();
        }

        public Builder(GetAdConnectorDirectoriesPlainArgs defaults) {
            $ = new GetAdConnectorDirectoriesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Ad Connector Directory IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Ad Connector Directory IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Ad Connector Directory name.
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

        /**
         * @param status The status of directory.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetAdConnectorDirectoriesPlainArgs build() {
            return $;
        }
    }

}
