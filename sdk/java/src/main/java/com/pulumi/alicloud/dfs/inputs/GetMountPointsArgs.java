// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dfs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMountPointsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMountPointsArgs Empty = new GetMountPointsArgs();

    /**
     * The ID of the File System.
     * 
     */
    @Import(name="fileSystemId", required=true)
    private Output<String> fileSystemId;

    /**
     * @return The ID of the File System.
     * 
     */
    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }

    /**
     * A list of Mount Point IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Mount Point IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of the Mount Point. Valid values: `Active`, `Inactive`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the Mount Point. Valid values: `Active`, `Inactive`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetMountPointsArgs() {}

    private GetMountPointsArgs(GetMountPointsArgs $) {
        this.fileSystemId = $.fileSystemId;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMountPointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMountPointsArgs $;

        public Builder() {
            $ = new GetMountPointsArgs();
        }

        public Builder(GetMountPointsArgs defaults) {
            $ = new GetMountPointsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileSystemId The ID of the File System.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(Output<String> fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * @param fileSystemId The ID of the File System.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(String fileSystemId) {
            return fileSystemId(Output.of(fileSystemId));
        }

        /**
         * @param ids A list of Mount Point IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Mount Point IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Mount Point IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param status The status of the Mount Point. Valid values: `Active`, `Inactive`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the Mount Point. Valid values: `Active`, `Inactive`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetMountPointsArgs build() {
            $.fileSystemId = Objects.requireNonNull($.fileSystemId, "expected parameter 'fileSystemId' to be non-null");
            return $;
        }
    }

}
