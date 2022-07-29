// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnapshotsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSnapshotsPlainArgs Empty = new GetSnapshotsPlainArgs();

    /**
     * The ID of the cloud desktop to which the snapshot belongs.
     * 
     */
    @Import(name="desktopId")
    private @Nullable String desktopId;

    /**
     * @return The ID of the cloud desktop to which the snapshot belongs.
     * 
     */
    public Optional<String> desktopId() {
        return Optional.ofNullable(this.desktopId);
    }

    /**
     * A list of Snapshot IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Snapshot IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Snapshot name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Snapshot name.
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
     * The ID of the snapshot.
     * 
     */
    @Import(name="snapshotId")
    private @Nullable String snapshotId;

    /**
     * @return The ID of the snapshot.
     * 
     */
    public Optional<String> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    private GetSnapshotsPlainArgs() {}

    private GetSnapshotsPlainArgs(GetSnapshotsPlainArgs $) {
        this.desktopId = $.desktopId;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.snapshotId = $.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSnapshotsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSnapshotsPlainArgs $;

        public Builder() {
            $ = new GetSnapshotsPlainArgs();
        }

        public Builder(GetSnapshotsPlainArgs defaults) {
            $ = new GetSnapshotsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param desktopId The ID of the cloud desktop to which the snapshot belongs.
         * 
         * @return builder
         * 
         */
        public Builder desktopId(@Nullable String desktopId) {
            $.desktopId = desktopId;
            return this;
        }

        /**
         * @param ids A list of Snapshot IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Snapshot IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Snapshot name.
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
         * @param snapshotId The ID of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(@Nullable String snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        public GetSnapshotsPlainArgs build() {
            return $;
        }
    }

}
