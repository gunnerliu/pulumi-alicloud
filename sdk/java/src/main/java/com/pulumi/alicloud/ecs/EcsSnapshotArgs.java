// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EcsSnapshotArgs extends com.pulumi.resources.ResourceArgs {

    public static final EcsSnapshotArgs Empty = new EcsSnapshotArgs();

    /**
     * The category of the snapshot. Valid Values: `standard` and `flash`.
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return The category of the snapshot. Valid Values: `standard` and `flash`.
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * The description of the snapshot.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the snapshot.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the disk.
     * 
     */
    @Import(name="diskId", required=true)
    private Output<String> diskId;

    /**
     * @return The ID of the disk.
     * 
     */
    public Output<String> diskId() {
        return this.diskId;
    }

    /**
     * Specifies whether to forcibly delete the snapshot that has been used to create disks.
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return Specifies whether to forcibly delete the snapshot that has been used to create disks.
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * Specifies whether to enable the instant access feature.
     * 
     */
    @Import(name="instantAccess")
    private @Nullable Output<Boolean> instantAccess;

    /**
     * @return Specifies whether to enable the instant access feature.
     * 
     */
    public Optional<Output<Boolean>> instantAccess() {
        return Optional.ofNullable(this.instantAccess);
    }

    /**
     * Specifies the retention period of the instant access feature. After the retention period ends, the snapshot is automatically released.
     * 
     */
    @Import(name="instantAccessRetentionDays")
    private @Nullable Output<Integer> instantAccessRetentionDays;

    /**
     * @return Specifies the retention period of the instant access feature. After the retention period ends, the snapshot is automatically released.
     * 
     */
    public Optional<Output<Integer>> instantAccessRetentionDays() {
        return Optional.ofNullable(this.instantAccessRetentionDays);
    }

    /**
     * Field `name` has been deprecated from provider version 1.120.0. New field `snapshot_name` instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.120.0. New field &#39;snapshot_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead. */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Field `name` has been deprecated from provider version 1.120.0. New field `snapshot_name` instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.120.0. New field &#39;snapshot_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead. */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource group id.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The resource group id.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The retention period of the snapshot.
     * 
     */
    @Import(name="retentionDays")
    private @Nullable Output<Integer> retentionDays;

    /**
     * @return The retention period of the snapshot.
     * 
     */
    public Optional<Output<Integer>> retentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }

    /**
     * The name of the snapshot.
     * 
     */
    @Import(name="snapshotName")
    private @Nullable Output<String> snapshotName;

    /**
     * @return The name of the snapshot.
     * 
     */
    public Optional<Output<String>> snapshotName() {
        return Optional.ofNullable(this.snapshotName);
    }

    /**
     * A mapping of tags to assign to the snapshot.
     * 
     * &gt; **NOTE:** If `force` is true, After an snapshot is deleted, the disks created from this snapshot cannot be re-initialized.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the snapshot.
     * 
     * &gt; **NOTE:** If `force` is true, After an snapshot is deleted, the disks created from this snapshot cannot be re-initialized.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private EcsSnapshotArgs() {}

    private EcsSnapshotArgs(EcsSnapshotArgs $) {
        this.category = $.category;
        this.description = $.description;
        this.diskId = $.diskId;
        this.force = $.force;
        this.instantAccess = $.instantAccess;
        this.instantAccessRetentionDays = $.instantAccessRetentionDays;
        this.name = $.name;
        this.resourceGroupId = $.resourceGroupId;
        this.retentionDays = $.retentionDays;
        this.snapshotName = $.snapshotName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EcsSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EcsSnapshotArgs $;

        public Builder() {
            $ = new EcsSnapshotArgs();
        }

        public Builder(EcsSnapshotArgs defaults) {
            $ = new EcsSnapshotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category The category of the snapshot. Valid Values: `standard` and `flash`.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category The category of the snapshot. Valid Values: `standard` and `flash`.
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param description The description of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param diskId The ID of the disk.
         * 
         * @return builder
         * 
         */
        public Builder diskId(Output<String> diskId) {
            $.diskId = diskId;
            return this;
        }

        /**
         * @param diskId The ID of the disk.
         * 
         * @return builder
         * 
         */
        public Builder diskId(String diskId) {
            return diskId(Output.of(diskId));
        }

        /**
         * @param force Specifies whether to forcibly delete the snapshot that has been used to create disks.
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force Specifies whether to forcibly delete the snapshot that has been used to create disks.
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param instantAccess Specifies whether to enable the instant access feature.
         * 
         * @return builder
         * 
         */
        public Builder instantAccess(@Nullable Output<Boolean> instantAccess) {
            $.instantAccess = instantAccess;
            return this;
        }

        /**
         * @param instantAccess Specifies whether to enable the instant access feature.
         * 
         * @return builder
         * 
         */
        public Builder instantAccess(Boolean instantAccess) {
            return instantAccess(Output.of(instantAccess));
        }

        /**
         * @param instantAccessRetentionDays Specifies the retention period of the instant access feature. After the retention period ends, the snapshot is automatically released.
         * 
         * @return builder
         * 
         */
        public Builder instantAccessRetentionDays(@Nullable Output<Integer> instantAccessRetentionDays) {
            $.instantAccessRetentionDays = instantAccessRetentionDays;
            return this;
        }

        /**
         * @param instantAccessRetentionDays Specifies the retention period of the instant access feature. After the retention period ends, the snapshot is automatically released.
         * 
         * @return builder
         * 
         */
        public Builder instantAccessRetentionDays(Integer instantAccessRetentionDays) {
            return instantAccessRetentionDays(Output.of(instantAccessRetentionDays));
        }

        /**
         * @param name Field `name` has been deprecated from provider version 1.120.0. New field `snapshot_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated from provider version 1.120.0. New field &#39;snapshot_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead. */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Field `name` has been deprecated from provider version 1.120.0. New field `snapshot_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated from provider version 1.120.0. New field &#39;snapshot_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead. */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupId The resource group id.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The resource group id.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param retentionDays The retention period of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            $.retentionDays = retentionDays;
            return this;
        }

        /**
         * @param retentionDays The retention period of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder retentionDays(Integer retentionDays) {
            return retentionDays(Output.of(retentionDays));
        }

        /**
         * @param snapshotName The name of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotName(@Nullable Output<String> snapshotName) {
            $.snapshotName = snapshotName;
            return this;
        }

        /**
         * @param snapshotName The name of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotName(String snapshotName) {
            return snapshotName(Output.of(snapshotName));
        }

        /**
         * @param tags A mapping of tags to assign to the snapshot.
         * 
         * &gt; **NOTE:** If `force` is true, After an snapshot is deleted, the disks created from this snapshot cannot be re-initialized.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the snapshot.
         * 
         * &gt; **NOTE:** If `force` is true, After an snapshot is deleted, the disks created from this snapshot cannot be re-initialized.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        public EcsSnapshotArgs build() {
            if ($.diskId == null) {
                throw new MissingRequiredPropertyException("EcsSnapshotArgs", "diskId");
            }
            return $;
        }
    }

}
