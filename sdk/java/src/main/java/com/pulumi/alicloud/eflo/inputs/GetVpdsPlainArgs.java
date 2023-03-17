// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eflo.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpdsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpdsPlainArgs Empty = new GetVpdsPlainArgs();

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
     * A list of Vpd IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Vpd IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Group Metric Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Group Metric Rule name.
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

    @Import(name="pageNumber")
    private @Nullable Integer pageNumber;

    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Integer pageSize;

    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * The Resource group id
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable String resourceGroupId;

    /**
     * @return The Resource group id
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The Vpd status. Valid values: `Available`, `Not Available`, `Executing`, `Deleting`,
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The Vpd status. Valid values: `Available`, `Not Available`, `Executing`, `Deleting`,
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The id of the vpd.
     * 
     */
    @Import(name="vpdId")
    private @Nullable String vpdId;

    /**
     * @return The id of the vpd.
     * 
     */
    public Optional<String> vpdId() {
        return Optional.ofNullable(this.vpdId);
    }

    /**
     * The Name of the VPD.
     * 
     */
    @Import(name="vpdName")
    private @Nullable String vpdName;

    /**
     * @return The Name of the VPD.
     * 
     */
    public Optional<String> vpdName() {
        return Optional.ofNullable(this.vpdName);
    }

    private GetVpdsPlainArgs() {}

    private GetVpdsPlainArgs(GetVpdsPlainArgs $) {
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
        this.vpdId = $.vpdId;
        this.vpdName = $.vpdName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpdsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpdsPlainArgs $;

        public Builder() {
            $ = new GetVpdsPlainArgs();
        }

        public Builder(GetVpdsPlainArgs defaults) {
            $ = new GetVpdsPlainArgs(Objects.requireNonNull(defaults));
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
         * @param ids A list of Vpd IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Vpd IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Group Metric Rule name.
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

        public Builder pageNumber(@Nullable Integer pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageSize(@Nullable Integer pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        /**
         * @param resourceGroupId The Resource group id
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param status The Vpd status. Valid values: `Available`, `Not Available`, `Executing`, `Deleting`,
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param vpdId The id of the vpd.
         * 
         * @return builder
         * 
         */
        public Builder vpdId(@Nullable String vpdId) {
            $.vpdId = vpdId;
            return this;
        }

        /**
         * @param vpdName The Name of the VPD.
         * 
         * @return builder
         * 
         */
        public Builder vpdName(@Nullable String vpdName) {
            $.vpdName = vpdName;
            return this;
        }

        public GetVpdsPlainArgs build() {
            return $;
        }
    }

}
