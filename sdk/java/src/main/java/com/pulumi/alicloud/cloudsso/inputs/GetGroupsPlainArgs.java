// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGroupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupsPlainArgs Empty = new GetGroupsPlainArgs();

    /**
     * The ID of the Directory.
     * 
     */
    @Import(name="directoryId", required=true)
    private String directoryId;

    /**
     * @return The ID of the Directory.
     * 
     */
    public String directoryId() {
        return this.directoryId;
    }

    /**
     * A list of Group IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Group IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Group name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Group name.
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
     * The Provision Type of the Group. Valid values: `Manual`, `Synchronized`.
     * 
     */
    @Import(name="provisionType")
    private @Nullable String provisionType;

    /**
     * @return The Provision Type of the Group. Valid values: `Manual`, `Synchronized`.
     * 
     */
    public Optional<String> provisionType() {
        return Optional.ofNullable(this.provisionType);
    }

    private GetGroupsPlainArgs() {}

    private GetGroupsPlainArgs(GetGroupsPlainArgs $) {
        this.directoryId = $.directoryId;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.provisionType = $.provisionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupsPlainArgs $;

        public Builder() {
            $ = new GetGroupsPlainArgs();
        }

        public Builder(GetGroupsPlainArgs defaults) {
            $ = new GetGroupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param directoryId The ID of the Directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        /**
         * @param ids A list of Group IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Group IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Group name.
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
         * @param provisionType The Provision Type of the Group. Valid values: `Manual`, `Synchronized`.
         * 
         * @return builder
         * 
         */
        public Builder provisionType(@Nullable String provisionType) {
            $.provisionType = provisionType;
            return this;
        }

        public GetGroupsPlainArgs build() {
            $.directoryId = Objects.requireNonNull($.directoryId, "expected parameter 'directoryId' to be non-null");
            return $;
        }
    }

}
