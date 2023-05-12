// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAscriptsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAscriptsPlainArgs Empty = new GetAscriptsPlainArgs();

    /**
     * Script name.
     * 
     */
    @Import(name="ascriptName")
    private @Nullable String ascriptName;

    /**
     * @return Script name.
     * 
     */
    public Optional<String> ascriptName() {
        return Optional.ofNullable(this.ascriptName);
    }

    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of AScript IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of AScript IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Listener ID of script attribution
     * 
     */
    @Import(name="listenerId")
    private @Nullable String listenerId;

    /**
     * @return Listener ID of script attribution
     * 
     */
    public Optional<String> listenerId() {
        return Optional.ofNullable(this.listenerId);
    }

    /**
     * A regex string to filter results by Group Metric Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Group Metric Rule name.
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

    private GetAscriptsPlainArgs() {}

    private GetAscriptsPlainArgs(GetAscriptsPlainArgs $) {
        this.ascriptName = $.ascriptName;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.listenerId = $.listenerId;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAscriptsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAscriptsPlainArgs $;

        public Builder() {
            $ = new GetAscriptsPlainArgs();
        }

        public Builder(GetAscriptsPlainArgs defaults) {
            $ = new GetAscriptsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ascriptName Script name.
         * 
         * @return builder
         * 
         */
        public Builder ascriptName(@Nullable String ascriptName) {
            $.ascriptName = ascriptName;
            return this;
        }

        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of AScript IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of AScript IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param listenerId Listener ID of script attribution
         * 
         * @return builder
         * 
         */
        public Builder listenerId(@Nullable String listenerId) {
            $.listenerId = listenerId;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Group Metric Rule name.
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

        public GetAscriptsPlainArgs build() {
            return $;
        }
    }

}
