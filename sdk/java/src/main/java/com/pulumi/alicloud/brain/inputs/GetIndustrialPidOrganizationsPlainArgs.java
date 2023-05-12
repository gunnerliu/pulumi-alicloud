// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.brain.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIndustrialPidOrganizationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIndustrialPidOrganizationsPlainArgs Empty = new GetIndustrialPidOrganizationsPlainArgs();

    /**
     * A list of Pid Organization IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Pid Organization IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Pid Organization name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Pid Organization name.
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
     * The parent organization id.
     * 
     */
    @Import(name="parentOrganizationId")
    private @Nullable String parentOrganizationId;

    /**
     * @return The parent organization id.
     * 
     */
    public Optional<String> parentOrganizationId() {
        return Optional.ofNullable(this.parentOrganizationId);
    }

    private GetIndustrialPidOrganizationsPlainArgs() {}

    private GetIndustrialPidOrganizationsPlainArgs(GetIndustrialPidOrganizationsPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.parentOrganizationId = $.parentOrganizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIndustrialPidOrganizationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIndustrialPidOrganizationsPlainArgs $;

        public Builder() {
            $ = new GetIndustrialPidOrganizationsPlainArgs();
        }

        public Builder(GetIndustrialPidOrganizationsPlainArgs defaults) {
            $ = new GetIndustrialPidOrganizationsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Pid Organization IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Pid Organization IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Pid Organization name.
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
         * @param parentOrganizationId The parent organization id.
         * 
         * @return builder
         * 
         */
        public Builder parentOrganizationId(@Nullable String parentOrganizationId) {
            $.parentOrganizationId = parentOrganizationId;
            return this;
        }

        public GetIndustrialPidOrganizationsPlainArgs build() {
            return $;
        }
    }

}
