// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRdsBackupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRdsBackupsArgs Empty = new GetRdsBackupsArgs();

    /**
     * BackupMode.
     * 
     */
    @Import(name="backupMode")
    private @Nullable Output<String> backupMode;

    /**
     * @return BackupMode.
     * 
     */
    public Optional<Output<String>> backupMode() {
        return Optional.ofNullable(this.backupMode);
    }

    /**
     * Backup task status. **NOTE:** This parameter will only be returned when a task is executed. Value:
     * * **NoStart**: Not started
     * * **Checking**: check the backup
     * * **Preparing**: Prepare a backup
     * * **Waiting**: Waiting for backup
     * * **Uploading**: Upload backup
     * * **Finished**: Complete backup
     * * **Failed**: backup Failed
     * 
     */
    @Import(name="backupStatus")
    private @Nullable Output<String> backupStatus;

    /**
     * @return Backup task status. **NOTE:** This parameter will only be returned when a task is executed. Value:
     * * **NoStart**: Not started
     * * **Checking**: check the backup
     * * **Preparing**: Prepare a backup
     * * **Waiting**: Waiting for backup
     * * **Uploading**: Upload backup
     * * **Finished**: Complete backup
     * * **Failed**: backup Failed
     * 
     */
    public Optional<Output<String>> backupStatus() {
        return Optional.ofNullable(this.backupStatus);
    }

    /**
     * The db instance id.
     * 
     */
    @Import(name="dbInstanceId", required=true)
    private Output<String> dbInstanceId;

    /**
     * @return The db instance id.
     * 
     */
    public Output<String> dbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * The end time.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return The end time.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * A list of Backup IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Backup IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The start time.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The start time.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private GetRdsBackupsArgs() {}

    private GetRdsBackupsArgs(GetRdsBackupsArgs $) {
        this.backupMode = $.backupMode;
        this.backupStatus = $.backupStatus;
        this.dbInstanceId = $.dbInstanceId;
        this.endTime = $.endTime;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRdsBackupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRdsBackupsArgs $;

        public Builder() {
            $ = new GetRdsBackupsArgs();
        }

        public Builder(GetRdsBackupsArgs defaults) {
            $ = new GetRdsBackupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupMode BackupMode.
         * 
         * @return builder
         * 
         */
        public Builder backupMode(@Nullable Output<String> backupMode) {
            $.backupMode = backupMode;
            return this;
        }

        /**
         * @param backupMode BackupMode.
         * 
         * @return builder
         * 
         */
        public Builder backupMode(String backupMode) {
            return backupMode(Output.of(backupMode));
        }

        /**
         * @param backupStatus Backup task status. **NOTE:** This parameter will only be returned when a task is executed. Value:
         * * **NoStart**: Not started
         * * **Checking**: check the backup
         * * **Preparing**: Prepare a backup
         * * **Waiting**: Waiting for backup
         * * **Uploading**: Upload backup
         * * **Finished**: Complete backup
         * * **Failed**: backup Failed
         * 
         * @return builder
         * 
         */
        public Builder backupStatus(@Nullable Output<String> backupStatus) {
            $.backupStatus = backupStatus;
            return this;
        }

        /**
         * @param backupStatus Backup task status. **NOTE:** This parameter will only be returned when a task is executed. Value:
         * * **NoStart**: Not started
         * * **Checking**: check the backup
         * * **Preparing**: Prepare a backup
         * * **Waiting**: Waiting for backup
         * * **Uploading**: Upload backup
         * * **Finished**: Complete backup
         * * **Failed**: backup Failed
         * 
         * @return builder
         * 
         */
        public Builder backupStatus(String backupStatus) {
            return backupStatus(Output.of(backupStatus));
        }

        /**
         * @param dbInstanceId The db instance id.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(Output<String> dbInstanceId) {
            $.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * @param dbInstanceId The db instance id.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(String dbInstanceId) {
            return dbInstanceId(Output.of(dbInstanceId));
        }

        /**
         * @param endTime The end time.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime The end time.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param ids A list of Backup IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Backup IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Backup IDs.
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
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param startTime The start time.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The start time.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public GetRdsBackupsArgs build() {
            if ($.dbInstanceId == null) {
                throw new MissingRequiredPropertyException("GetRdsBackupsArgs", "dbInstanceId");
            }
            return $;
        }
    }

}
