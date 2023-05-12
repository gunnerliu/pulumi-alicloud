// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dts.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSynchronizationJobsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSynchronizationJobsPlainArgs Empty = new GetSynchronizationJobsPlainArgs();

    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Synchronization Job IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Synchronization Job IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by synchronization job name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by synchronization job name.
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

    /**
     * The status of the resource. Valid values: `Synchronizing`, `Suspending`. You can stop the task by specifying `Suspending` and start the task by specifying `Synchronizing`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the resource. Valid values: `Synchronizing`, `Suspending`. You can stop the task by specifying `Suspending` and start the task by specifying `Synchronizing`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetSynchronizationJobsPlainArgs() {}

    private GetSynchronizationJobsPlainArgs(GetSynchronizationJobsPlainArgs $) {
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSynchronizationJobsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSynchronizationJobsPlainArgs $;

        public Builder() {
            $ = new GetSynchronizationJobsPlainArgs();
        }

        public Builder(GetSynchronizationJobsPlainArgs defaults) {
            $ = new GetSynchronizationJobsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of Synchronization Job IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Synchronization Job IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by synchronization job name.
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

        /**
         * @param status The status of the resource. Valid values: `Synchronizing`, `Suspending`. You can stop the task by specifying `Suspending` and start the task by specifying `Synchronizing`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetSynchronizationJobsPlainArgs build() {
            return $;
        }
    }

}
