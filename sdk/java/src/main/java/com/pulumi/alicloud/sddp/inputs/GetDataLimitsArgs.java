// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sddp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDataLimitsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataLimitsArgs Empty = new GetDataLimitsArgs();

    /**
     * A list of Data Limit IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Data Limit IDs.
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
     * The ID of the data asset.
     * 
     */
    @Import(name="parentId")
    private @Nullable Output<String> parentId;

    /**
     * @return The ID of the data asset.
     * 
     */
    public Optional<Output<String>> parentId() {
        return Optional.ofNullable(this.parentId);
    }

    /**
     * The type of the service to which the data asset belongs.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The type of the service to which the data asset belongs.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    private GetDataLimitsArgs() {}

    private GetDataLimitsArgs(GetDataLimitsArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.parentId = $.parentId;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataLimitsArgs $;

        public Builder() {
            $ = new GetDataLimitsArgs();
        }

        public Builder(GetDataLimitsArgs defaults) {
            $ = new GetDataLimitsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Data Limit IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Data Limit IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Data Limit IDs.
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
         * @param parentId The ID of the data asset.
         * 
         * @return builder
         * 
         */
        public Builder parentId(@Nullable Output<String> parentId) {
            $.parentId = parentId;
            return this;
        }

        /**
         * @param parentId The ID of the data asset.
         * 
         * @return builder
         * 
         */
        public Builder parentId(String parentId) {
            return parentId(Output.of(parentId));
        }

        /**
         * @param resourceType The type of the service to which the data asset belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The type of the service to which the data asset belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public GetDataLimitsArgs build() {
            return $;
        }
    }

}
