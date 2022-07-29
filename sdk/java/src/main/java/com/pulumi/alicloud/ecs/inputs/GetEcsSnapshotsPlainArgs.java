// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEcsSnapshotsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEcsSnapshotsPlainArgs Empty = new GetEcsSnapshotsPlainArgs();

    /**
     * The category of the snapshot.
     * 
     */
    @Import(name="category")
    private @Nullable String category;

    /**
     * @return The category of the snapshot.
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * Specifies whether to check the validity of the request without actually making the request.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Boolean dryRun;

    /**
     * @return Specifies whether to check the validity of the request without actually making the request.
     * 
     */
    public Optional<Boolean> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * Whether the snapshot is encrypted.
     * 
     */
    @Import(name="encrypted")
    private @Nullable Boolean encrypted;

    /**
     * @return Whether the snapshot is encrypted.
     * 
     */
    public Optional<Boolean> encrypted() {
        return Optional.ofNullable(this.encrypted);
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
     * The kms key id.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable String kmsKeyId;

    /**
     * @return The kms key id.
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
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
     * The resource group id.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable String resourceGroupId;

    /**
     * @return The resource group id.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The snapshot link id.
     * 
     */
    @Import(name="snapshotLinkId")
    private @Nullable String snapshotLinkId;

    /**
     * @return The snapshot link id.
     * 
     */
    public Optional<String> snapshotLinkId() {
        return Optional.ofNullable(this.snapshotLinkId);
    }

    /**
     * Snapshot Display Name.
     * 
     */
    @Import(name="snapshotName")
    private @Nullable String snapshotName;

    /**
     * @return Snapshot Display Name.
     * 
     */
    public Optional<String> snapshotName() {
        return Optional.ofNullable(this.snapshotName);
    }

    /**
     * Snapshot creation type.
     * 
     */
    @Import(name="snapshotType")
    private @Nullable String snapshotType;

    /**
     * @return Snapshot creation type.
     * 
     */
    public Optional<String> snapshotType() {
        return Optional.ofNullable(this.snapshotType);
    }

    /**
     * Source disk attributes.
     * 
     */
    @Import(name="sourceDiskType")
    private @Nullable String sourceDiskType;

    /**
     * @return Source disk attributes.
     * 
     */
    public Optional<String> sourceDiskType() {
        return Optional.ofNullable(this.sourceDiskType);
    }

    /**
     * The status of the snapshot.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the snapshot.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,Object> tags;

    /**
     * @return The tags.
     * 
     */
    public Optional<Map<String,Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * A resource type that has a reference relationship.
     * 
     */
    @Import(name="usage")
    private @Nullable String usage;

    /**
     * @return A resource type that has a reference relationship.
     * 
     */
    public Optional<String> usage() {
        return Optional.ofNullable(this.usage);
    }

    private GetEcsSnapshotsPlainArgs() {}

    private GetEcsSnapshotsPlainArgs(GetEcsSnapshotsPlainArgs $) {
        this.category = $.category;
        this.dryRun = $.dryRun;
        this.encrypted = $.encrypted;
        this.ids = $.ids;
        this.kmsKeyId = $.kmsKeyId;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.resourceGroupId = $.resourceGroupId;
        this.snapshotLinkId = $.snapshotLinkId;
        this.snapshotName = $.snapshotName;
        this.snapshotType = $.snapshotType;
        this.sourceDiskType = $.sourceDiskType;
        this.status = $.status;
        this.tags = $.tags;
        this.type = $.type;
        this.usage = $.usage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEcsSnapshotsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEcsSnapshotsPlainArgs $;

        public Builder() {
            $ = new GetEcsSnapshotsPlainArgs();
        }

        public Builder(GetEcsSnapshotsPlainArgs defaults) {
            $ = new GetEcsSnapshotsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category The category of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable String category) {
            $.category = category;
            return this;
        }

        /**
         * @param dryRun Specifies whether to check the validity of the request without actually making the request.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Boolean dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param encrypted Whether the snapshot is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(@Nullable Boolean encrypted) {
            $.encrypted = encrypted;
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
         * @param kmsKeyId The kms key id.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
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
         * @param resourceGroupId The resource group id.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param snapshotLinkId The snapshot link id.
         * 
         * @return builder
         * 
         */
        public Builder snapshotLinkId(@Nullable String snapshotLinkId) {
            $.snapshotLinkId = snapshotLinkId;
            return this;
        }

        /**
         * @param snapshotName Snapshot Display Name.
         * 
         * @return builder
         * 
         */
        public Builder snapshotName(@Nullable String snapshotName) {
            $.snapshotName = snapshotName;
            return this;
        }

        /**
         * @param snapshotType Snapshot creation type.
         * 
         * @return builder
         * 
         */
        public Builder snapshotType(@Nullable String snapshotType) {
            $.snapshotType = snapshotType;
            return this;
        }

        /**
         * @param sourceDiskType Source disk attributes.
         * 
         * @return builder
         * 
         */
        public Builder sourceDiskType(@Nullable String sourceDiskType) {
            $.sourceDiskType = sourceDiskType;
            return this;
        }

        /**
         * @param status The status of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param tags The tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,Object> tags) {
            $.tags = tags;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        /**
         * @param usage A resource type that has a reference relationship.
         * 
         * @return builder
         * 
         */
        public Builder usage(@Nullable String usage) {
            $.usage = usage;
            return this;
        }

        public GetEcsSnapshotsPlainArgs build() {
            return $;
        }
    }

}
