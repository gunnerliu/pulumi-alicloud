// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCommandsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCommandsPlainArgs Empty = new GetCommandsPlainArgs();

    /**
     * The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
     * 
     */
    @Import(name="commandType")
    private @Nullable String commandType;

    /**
     * @return The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
     * 
     */
    public Optional<String> commandType() {
        return Optional.ofNullable(this.commandType);
    }

    /**
     * That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
     * 
     */
    @Import(name="contentEncoding")
    private @Nullable String contentEncoding;

    /**
     * @return That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
     * 
     */
    public Optional<String> contentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }

    /**
     * The desktop id of the Desktop.
     * 
     */
    @Import(name="desktopId")
    private @Nullable String desktopId;

    /**
     * @return The desktop id of the Desktop.
     * 
     */
    public Optional<String> desktopId() {
        return Optional.ofNullable(this.desktopId);
    }

    /**
     * A list of Command IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Command IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
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

    /**
     * Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetCommandsPlainArgs() {}

    private GetCommandsPlainArgs(GetCommandsPlainArgs $) {
        this.commandType = $.commandType;
        this.contentEncoding = $.contentEncoding;
        this.desktopId = $.desktopId;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCommandsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCommandsPlainArgs $;

        public Builder() {
            $ = new GetCommandsPlainArgs();
        }

        public Builder(GetCommandsPlainArgs defaults) {
            $ = new GetCommandsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commandType The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
         * 
         * @return builder
         * 
         */
        public Builder commandType(@Nullable String commandType) {
            $.commandType = commandType;
            return this;
        }

        /**
         * @param contentEncoding That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
         * 
         * @return builder
         * 
         */
        public Builder contentEncoding(@Nullable String contentEncoding) {
            $.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * @param desktopId The desktop id of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder desktopId(@Nullable String desktopId) {
            $.desktopId = desktopId;
            return this;
        }

        /**
         * @param ids A list of Command IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Command IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
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

        /**
         * @param status Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetCommandsPlainArgs build() {
            return $;
        }
    }

}
