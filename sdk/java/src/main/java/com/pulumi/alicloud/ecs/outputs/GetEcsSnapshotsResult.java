// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetEcsSnapshotsSnapshot;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEcsSnapshotsResult {
    private @Nullable String category;
    private @Nullable Boolean dryRun;
    private @Nullable Boolean encrypted;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String kmsKeyId;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String resourceGroupId;
    private @Nullable String snapshotLinkId;
    private @Nullable String snapshotName;
    private @Nullable String snapshotType;
    private List<GetEcsSnapshotsSnapshot> snapshots;
    private @Nullable String sourceDiskType;
    private @Nullable String status;
    private @Nullable Map<String,Object> tags;
    private @Nullable String type;
    private @Nullable String usage;

    private GetEcsSnapshotsResult() {}
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    public Optional<Boolean> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }
    public Optional<Boolean> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }
    public Optional<String> snapshotLinkId() {
        return Optional.ofNullable(this.snapshotLinkId);
    }
    public Optional<String> snapshotName() {
        return Optional.ofNullable(this.snapshotName);
    }
    public Optional<String> snapshotType() {
        return Optional.ofNullable(this.snapshotType);
    }
    public List<GetEcsSnapshotsSnapshot> snapshots() {
        return this.snapshots;
    }
    public Optional<String> sourceDiskType() {
        return Optional.ofNullable(this.sourceDiskType);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public Optional<String> usage() {
        return Optional.ofNullable(this.usage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsSnapshotsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String category;
        private @Nullable Boolean dryRun;
        private @Nullable Boolean encrypted;
        private String id;
        private List<String> ids;
        private @Nullable String kmsKeyId;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String resourceGroupId;
        private @Nullable String snapshotLinkId;
        private @Nullable String snapshotName;
        private @Nullable String snapshotType;
        private List<GetEcsSnapshotsSnapshot> snapshots;
        private @Nullable String sourceDiskType;
        private @Nullable String status;
        private @Nullable Map<String,Object> tags;
        private @Nullable String type;
        private @Nullable String usage;
        public Builder() {}
        public Builder(GetEcsSnapshotsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.dryRun = defaults.dryRun;
    	      this.encrypted = defaults.encrypted;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.snapshotLinkId = defaults.snapshotLinkId;
    	      this.snapshotName = defaults.snapshotName;
    	      this.snapshotType = defaults.snapshotType;
    	      this.snapshots = defaults.snapshots;
    	      this.sourceDiskType = defaults.sourceDiskType;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.usage = defaults.usage;
        }

        @CustomType.Setter
        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder dryRun(@Nullable Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        @CustomType.Setter
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotLinkId(@Nullable String snapshotLinkId) {
            this.snapshotLinkId = snapshotLinkId;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotName(@Nullable String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotType(@Nullable String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        @CustomType.Setter
        public Builder snapshots(List<GetEcsSnapshotsSnapshot> snapshots) {
            this.snapshots = Objects.requireNonNull(snapshots);
            return this;
        }
        public Builder snapshots(GetEcsSnapshotsSnapshot... snapshots) {
            return snapshots(List.of(snapshots));
        }
        @CustomType.Setter
        public Builder sourceDiskType(@Nullable String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder usage(@Nullable String usage) {
            this.usage = usage;
            return this;
        }
        public GetEcsSnapshotsResult build() {
            final var o = new GetEcsSnapshotsResult();
            o.category = category;
            o.dryRun = dryRun;
            o.encrypted = encrypted;
            o.id = id;
            o.ids = ids;
            o.kmsKeyId = kmsKeyId;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            o.resourceGroupId = resourceGroupId;
            o.snapshotLinkId = snapshotLinkId;
            o.snapshotName = snapshotName;
            o.snapshotType = snapshotType;
            o.snapshots = snapshots;
            o.sourceDiskType = sourceDiskType;
            o.status = status;
            o.tags = tags;
            o.type = type;
            o.usage = usage;
            return o;
        }
    }
}
