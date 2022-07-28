// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUsersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUsersPlainArgs Empty = new GetUsersPlainArgs();

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
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    /**
     * @return Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of User IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of User IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by User name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by User name.
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
     * ProvisionType.
     * 
     */
    @Import(name="provisionType")
    private @Nullable String provisionType;

    /**
     * @return ProvisionType.
     * 
     */
    public Optional<String> provisionType() {
        return Optional.ofNullable(this.provisionType);
    }

    /**
     * User status. Valid values: `Enabled` and `Disabled`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return User status. Valid values: `Enabled` and `Disabled`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetUsersPlainArgs() {}

    private GetUsersPlainArgs(GetUsersPlainArgs $) {
        this.directoryId = $.directoryId;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.provisionType = $.provisionType;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUsersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUsersPlainArgs $;

        public Builder() {
            $ = new GetUsersPlainArgs();
        }

        public Builder(GetUsersPlainArgs defaults) {
            $ = new GetUsersPlainArgs(Objects.requireNonNull(defaults));
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
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of User IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of User IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by User name.
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
         * @param provisionType ProvisionType.
         * 
         * @return builder
         * 
         */
        public Builder provisionType(@Nullable String provisionType) {
            $.provisionType = provisionType;
            return this;
        }

        /**
         * @param status User status. Valid values: `Enabled` and `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetUsersPlainArgs build() {
            $.directoryId = Objects.requireNonNull($.directoryId, "expected parameter 'directoryId' to be non-null");
            return $;
        }
    }

}
