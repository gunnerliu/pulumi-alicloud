// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNasFileSystemsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNasFileSystemsPlainArgs Empty = new GetNasFileSystemsPlainArgs();

    /**
     * A list of Nas File System IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Nas File System IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Nas File System name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Nas File System name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * The ID of office site.
     * 
     */
    @Import(name="officeSiteId")
    private @Nullable String officeSiteId;

    /**
     * @return The ID of office site.
     * 
     */
    public Optional<String> officeSiteId() {
        return Optional.ofNullable(this.officeSiteId);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of nas file system. Valid values: `Pending`, `Running`, `Stopped`,`Deleting`, `Deleted`, `Invalid`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of nas file system. Valid values: `Pending`, `Running`, `Stopped`,`Deleting`, `Deleted`, `Invalid`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetNasFileSystemsPlainArgs() {}

    private GetNasFileSystemsPlainArgs(GetNasFileSystemsPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.officeSiteId = $.officeSiteId;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNasFileSystemsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNasFileSystemsPlainArgs $;

        public Builder() {
            $ = new GetNasFileSystemsPlainArgs();
        }

        public Builder(GetNasFileSystemsPlainArgs defaults) {
            $ = new GetNasFileSystemsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Nas File System IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Nas File System IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Nas File System name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param officeSiteId The ID of office site.
         * 
         * @return builder
         * 
         */
        public Builder officeSiteId(@Nullable String officeSiteId) {
            $.officeSiteId = officeSiteId;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param status The status of nas file system. Valid values: `Pending`, `Running`, `Stopped`,`Deleting`, `Deleted`, `Invalid`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetNasFileSystemsPlainArgs build() {
            return $;
        }
    }

}
