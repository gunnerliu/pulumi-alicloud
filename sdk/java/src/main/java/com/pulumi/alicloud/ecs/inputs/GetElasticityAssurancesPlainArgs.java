// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetElasticityAssurancesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetElasticityAssurancesPlainArgs Empty = new GetElasticityAssurancesPlainArgs();

    /**
     * A list of Elasticity Assurance IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Elasticity Assurance IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
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
     * The ID of the elastic protection service.
     * 
     */
    @Import(name="privatePoolOptionsIds")
    private @Nullable List<String> privatePoolOptionsIds;

    /**
     * @return The ID of the elastic protection service.
     * 
     */
    public Optional<List<String>> privatePoolOptionsIds() {
        return Optional.ofNullable(this.privatePoolOptionsIds);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable String resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The status of flexible guarantee services. Possible values: `All`, `Preparing`, `Prepared`, `Active`, `Released`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of flexible guarantee services. Possible values: `All`, `Preparing`, `Prepared`, `Active`, `Released`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The tag key-value pair information bound by the elastic guarantee service.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,Object> tags;

    /**
     * @return The tag key-value pair information bound by the elastic guarantee service.
     * 
     */
    public Optional<Map<String,Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetElasticityAssurancesPlainArgs() {}

    private GetElasticityAssurancesPlainArgs(GetElasticityAssurancesPlainArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.privatePoolOptionsIds = $.privatePoolOptionsIds;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetElasticityAssurancesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetElasticityAssurancesPlainArgs $;

        public Builder() {
            $ = new GetElasticityAssurancesPlainArgs();
        }

        public Builder(GetElasticityAssurancesPlainArgs defaults) {
            $ = new GetElasticityAssurancesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Elasticity Assurance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Elasticity Assurance IDs.
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
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param privatePoolOptionsIds The ID of the elastic protection service.
         * 
         * @return builder
         * 
         */
        public Builder privatePoolOptionsIds(@Nullable List<String> privatePoolOptionsIds) {
            $.privatePoolOptionsIds = privatePoolOptionsIds;
            return this;
        }

        /**
         * @param privatePoolOptionsIds The ID of the elastic protection service.
         * 
         * @return builder
         * 
         */
        public Builder privatePoolOptionsIds(String... privatePoolOptionsIds) {
            return privatePoolOptionsIds(List.of(privatePoolOptionsIds));
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param status The status of flexible guarantee services. Possible values: `All`, `Preparing`, `Prepared`, `Active`, `Released`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param tags The tag key-value pair information bound by the elastic guarantee service.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,Object> tags) {
            $.tags = tags;
            return this;
        }

        public GetElasticityAssurancesPlainArgs build() {
            return $;
        }
    }

}
