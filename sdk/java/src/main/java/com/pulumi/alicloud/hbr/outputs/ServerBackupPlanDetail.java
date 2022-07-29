// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerBackupPlanDetail {
    /**
     * @return Whether to turn on application consistency. The application consistency snapshot backs up memory data and ongoing database transactions at the time of snapshot creation to ensure the consistency of application system data and database transactions. By applying consistent snapshots, there is no data damage or loss, so as to avoid log rollback during database startup and ensure that the application is in a consistent startup state. Valid values: `true`, `false`.
     * 
     */
    private final Boolean appConsistent;
    /**
     * @return Only vaild when DoCopy is true. The destination region ID when replicating to another region. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
     * 
     */
    private final @Nullable String destinationRegionId;
    /**
     * @return Only vaild when DoCopy is true. The retention days of the destination backup. When not specified, the destination backup will be saved permanently. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
     * 
     */
    private final @Nullable Integer destinationRetention;
    /**
     * @return The list of cloud disks to be backed up in the ECS instance. When not specified, a snapshot is executed for all the disks on the ECS instance.
     * 
     */
    private final @Nullable List<String> diskIdLists;
    /**
     * @return Whether replicate to another region. Valid values: `true`, `false`.
     * 
     */
    private final @Nullable Boolean doCopy;
    /**
     * @return Only the Linux system is valid. Whether to use the Linux FsFreeze mechanism to ensure that the file system is read-only consistent before creating a storage snapshot. The default is True. Valid values: `true`, `false`.
     * 
     */
    private final @Nullable Boolean enableFsFreeze;
    /**
     * @return Only vaild for the linux system when AppConsistent is true. The application thaw script path (e.g. /tmp/postscript.sh). The postscript.sh script must meet the following conditions: in terms of permissions, only the root user as the owner has read, write, and execute permissions, that is, 700 permissions. In terms of content, the script content needs to be customized according to the application itself. This indicates that this parameter must be set when creating an application consistency snapshot for a Linux instance. If the script is set incorrectly (for example, permissions, save path, or file name are set incorrectly), the resulting snapshot is a file system consistency snapshot.
     * 
     */
    private final @Nullable String postScriptPath;
    /**
     * @return Only vaild for the linux system when AppConsistent is true. Apply the freeze script path (e.g. /tmp/prescript.sh). prescript.sh scripts must meet the following conditions: in terms of permissions, only root, as the owner, has read, write, and execute permissions, that is, 700 permissions. In terms of content, the script content needs to be customized according to the application itself. This indicates that this parameter must be set when creating an application consistency snapshot for a Linux instance. If the script is set incorrectly (for example, permissions, save path, or file name are set incorrectly), the resulting snapshot is a file system consistency snapshot.
     * 
     */
    private final @Nullable String preScriptPath;
    /**
     * @return Whether to turn on file system consistency. If SnapshotGroup is true, when AppConsistent is true but the relevant conditions are not met or AppConsistent is false, the resulting snapshot will be a file system consistency snapshot. The file system consistency ensures that the file system memory and disk information are synchronized at the time of snapshot creation, and the file system write operation is frozen to make the file system in a consistent state. The file system consistency snapshot can prevent the operating system from performing disk inspection and repair operations such as CHKDSK or fsck after restart. Valid values: `true`, `false`.
     * 
     */
    private final Boolean snapshotGroup;
    /**
     * @return Only the Linux system is valid, and the IO freeze timeout period. The default is 30 seconds.
     * 
     */
    private final @Nullable Integer timeoutInSeconds;

    @CustomType.Constructor
    private ServerBackupPlanDetail(
        @CustomType.Parameter("appConsistent") Boolean appConsistent,
        @CustomType.Parameter("destinationRegionId") @Nullable String destinationRegionId,
        @CustomType.Parameter("destinationRetention") @Nullable Integer destinationRetention,
        @CustomType.Parameter("diskIdLists") @Nullable List<String> diskIdLists,
        @CustomType.Parameter("doCopy") @Nullable Boolean doCopy,
        @CustomType.Parameter("enableFsFreeze") @Nullable Boolean enableFsFreeze,
        @CustomType.Parameter("postScriptPath") @Nullable String postScriptPath,
        @CustomType.Parameter("preScriptPath") @Nullable String preScriptPath,
        @CustomType.Parameter("snapshotGroup") Boolean snapshotGroup,
        @CustomType.Parameter("timeoutInSeconds") @Nullable Integer timeoutInSeconds) {
        this.appConsistent = appConsistent;
        this.destinationRegionId = destinationRegionId;
        this.destinationRetention = destinationRetention;
        this.diskIdLists = diskIdLists;
        this.doCopy = doCopy;
        this.enableFsFreeze = enableFsFreeze;
        this.postScriptPath = postScriptPath;
        this.preScriptPath = preScriptPath;
        this.snapshotGroup = snapshotGroup;
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * @return Whether to turn on application consistency. The application consistency snapshot backs up memory data and ongoing database transactions at the time of snapshot creation to ensure the consistency of application system data and database transactions. By applying consistent snapshots, there is no data damage or loss, so as to avoid log rollback during database startup and ensure that the application is in a consistent startup state. Valid values: `true`, `false`.
     * 
     */
    public Boolean appConsistent() {
        return this.appConsistent;
    }
    /**
     * @return Only vaild when DoCopy is true. The destination region ID when replicating to another region. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
     * 
     */
    public Optional<String> destinationRegionId() {
        return Optional.ofNullable(this.destinationRegionId);
    }
    /**
     * @return Only vaild when DoCopy is true. The retention days of the destination backup. When not specified, the destination backup will be saved permanently. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
     * 
     */
    public Optional<Integer> destinationRetention() {
        return Optional.ofNullable(this.destinationRetention);
    }
    /**
     * @return The list of cloud disks to be backed up in the ECS instance. When not specified, a snapshot is executed for all the disks on the ECS instance.
     * 
     */
    public List<String> diskIdLists() {
        return this.diskIdLists == null ? List.of() : this.diskIdLists;
    }
    /**
     * @return Whether replicate to another region. Valid values: `true`, `false`.
     * 
     */
    public Optional<Boolean> doCopy() {
        return Optional.ofNullable(this.doCopy);
    }
    /**
     * @return Only the Linux system is valid. Whether to use the Linux FsFreeze mechanism to ensure that the file system is read-only consistent before creating a storage snapshot. The default is True. Valid values: `true`, `false`.
     * 
     */
    public Optional<Boolean> enableFsFreeze() {
        return Optional.ofNullable(this.enableFsFreeze);
    }
    /**
     * @return Only vaild for the linux system when AppConsistent is true. The application thaw script path (e.g. /tmp/postscript.sh). The postscript.sh script must meet the following conditions: in terms of permissions, only the root user as the owner has read, write, and execute permissions, that is, 700 permissions. In terms of content, the script content needs to be customized according to the application itself. This indicates that this parameter must be set when creating an application consistency snapshot for a Linux instance. If the script is set incorrectly (for example, permissions, save path, or file name are set incorrectly), the resulting snapshot is a file system consistency snapshot.
     * 
     */
    public Optional<String> postScriptPath() {
        return Optional.ofNullable(this.postScriptPath);
    }
    /**
     * @return Only vaild for the linux system when AppConsistent is true. Apply the freeze script path (e.g. /tmp/prescript.sh). prescript.sh scripts must meet the following conditions: in terms of permissions, only root, as the owner, has read, write, and execute permissions, that is, 700 permissions. In terms of content, the script content needs to be customized according to the application itself. This indicates that this parameter must be set when creating an application consistency snapshot for a Linux instance. If the script is set incorrectly (for example, permissions, save path, or file name are set incorrectly), the resulting snapshot is a file system consistency snapshot.
     * 
     */
    public Optional<String> preScriptPath() {
        return Optional.ofNullable(this.preScriptPath);
    }
    /**
     * @return Whether to turn on file system consistency. If SnapshotGroup is true, when AppConsistent is true but the relevant conditions are not met or AppConsistent is false, the resulting snapshot will be a file system consistency snapshot. The file system consistency ensures that the file system memory and disk information are synchronized at the time of snapshot creation, and the file system write operation is frozen to make the file system in a consistent state. The file system consistency snapshot can prevent the operating system from performing disk inspection and repair operations such as CHKDSK or fsck after restart. Valid values: `true`, `false`.
     * 
     */
    public Boolean snapshotGroup() {
        return this.snapshotGroup;
    }
    /**
     * @return Only the Linux system is valid, and the IO freeze timeout period. The default is 30 seconds.
     * 
     */
    public Optional<Integer> timeoutInSeconds() {
        return Optional.ofNullable(this.timeoutInSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerBackupPlanDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean appConsistent;
        private @Nullable String destinationRegionId;
        private @Nullable Integer destinationRetention;
        private @Nullable List<String> diskIdLists;
        private @Nullable Boolean doCopy;
        private @Nullable Boolean enableFsFreeze;
        private @Nullable String postScriptPath;
        private @Nullable String preScriptPath;
        private Boolean snapshotGroup;
        private @Nullable Integer timeoutInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerBackupPlanDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appConsistent = defaults.appConsistent;
    	      this.destinationRegionId = defaults.destinationRegionId;
    	      this.destinationRetention = defaults.destinationRetention;
    	      this.diskIdLists = defaults.diskIdLists;
    	      this.doCopy = defaults.doCopy;
    	      this.enableFsFreeze = defaults.enableFsFreeze;
    	      this.postScriptPath = defaults.postScriptPath;
    	      this.preScriptPath = defaults.preScriptPath;
    	      this.snapshotGroup = defaults.snapshotGroup;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
        }

        public Builder appConsistent(Boolean appConsistent) {
            this.appConsistent = Objects.requireNonNull(appConsistent);
            return this;
        }
        public Builder destinationRegionId(@Nullable String destinationRegionId) {
            this.destinationRegionId = destinationRegionId;
            return this;
        }
        public Builder destinationRetention(@Nullable Integer destinationRetention) {
            this.destinationRetention = destinationRetention;
            return this;
        }
        public Builder diskIdLists(@Nullable List<String> diskIdLists) {
            this.diskIdLists = diskIdLists;
            return this;
        }
        public Builder diskIdLists(String... diskIdLists) {
            return diskIdLists(List.of(diskIdLists));
        }
        public Builder doCopy(@Nullable Boolean doCopy) {
            this.doCopy = doCopy;
            return this;
        }
        public Builder enableFsFreeze(@Nullable Boolean enableFsFreeze) {
            this.enableFsFreeze = enableFsFreeze;
            return this;
        }
        public Builder postScriptPath(@Nullable String postScriptPath) {
            this.postScriptPath = postScriptPath;
            return this;
        }
        public Builder preScriptPath(@Nullable String preScriptPath) {
            this.preScriptPath = preScriptPath;
            return this;
        }
        public Builder snapshotGroup(Boolean snapshotGroup) {
            this.snapshotGroup = Objects.requireNonNull(snapshotGroup);
            return this;
        }
        public Builder timeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }        public ServerBackupPlanDetail build() {
            return new ServerBackupPlanDetail(appConsistent, destinationRegionId, destinationRetention, diskIdLists, doCopy, enableFsFreeze, postScriptPath, preScriptPath, snapshotGroup, timeoutInSeconds);
        }
    }
}
