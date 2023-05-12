// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.brain.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIndustrialPidProjectsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIndustrialPidProjectsPlainArgs Empty = new GetIndustrialPidProjectsPlainArgs();

    /**
     * A list of Pid Project IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Pid Project IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Pid Project name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Pid Project name.
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
     * The ID of Pid Organization.
     * 
     */
    @Import(name="pidOrganizationId")
    private @Nullable String pidOrganizationId;

    /**
     * @return The ID of Pid Organization.
     * 
     */
    public Optional<String> pidOrganizationId() {
        return Optional.ofNullable(this.pidOrganizationId);
    }

    /**
     * The name of Pid Project.
     * 
     */
    @Import(name="pidProjectName")
    private @Nullable String pidProjectName;

    /**
     * @return The name of Pid Project.
     * 
     */
    public Optional<String> pidProjectName() {
        return Optional.ofNullable(this.pidProjectName);
    }

    private GetIndustrialPidProjectsPlainArgs() {}

    private GetIndustrialPidProjectsPlainArgs(GetIndustrialPidProjectsPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.pidOrganizationId = $.pidOrganizationId;
        this.pidProjectName = $.pidProjectName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIndustrialPidProjectsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIndustrialPidProjectsPlainArgs $;

        public Builder() {
            $ = new GetIndustrialPidProjectsPlainArgs();
        }

        public Builder(GetIndustrialPidProjectsPlainArgs defaults) {
            $ = new GetIndustrialPidProjectsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Pid Project IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Pid Project IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Pid Project name.
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
         * @param pidOrganizationId The ID of Pid Organization.
         * 
         * @return builder
         * 
         */
        public Builder pidOrganizationId(@Nullable String pidOrganizationId) {
            $.pidOrganizationId = pidOrganizationId;
            return this;
        }

        /**
         * @param pidProjectName The name of Pid Project.
         * 
         * @return builder
         * 
         */
        public Builder pidProjectName(@Nullable String pidProjectName) {
            $.pidProjectName = pidProjectName;
            return this;
        }

        public GetIndustrialPidProjectsPlainArgs build() {
            return $;
        }
    }

}
