// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.maxcompute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * It has been deprecated from provider version 1.110.0 and `project_name` instead.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return It has been deprecated from provider version 1.110.0 and `project_name` instead.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of payment, only `PayAsYouGo` supported currently.
     * 
     */
    @Import(name="orderType", required=true)
    private Output<String> orderType;

    /**
     * @return The type of payment, only `PayAsYouGo` supported currently.
     * 
     */
    public Output<String> orderType() {
        return this.orderType;
    }

    /**
     * The name of the maxcompute project.
     * 
     */
    @Import(name="projectName")
    private @Nullable Output<String> projectName;

    /**
     * @return The name of the maxcompute project.
     * 
     */
    public Optional<Output<String>> projectName() {
        return Optional.ofNullable(this.projectName);
    }

    /**
     * The type of resource Specification, only `OdpsStandard` supported currently.
     * 
     */
    @Import(name="specificationType", required=true)
    private Output<String> specificationType;

    /**
     * @return The type of resource Specification, only `OdpsStandard` supported currently.
     * 
     */
    public Output<String> specificationType() {
        return this.specificationType;
    }

    private ProjectArgs() {}

    private ProjectArgs(ProjectArgs $) {
        this.name = $.name;
        this.orderType = $.orderType;
        this.projectName = $.projectName;
        this.specificationType = $.specificationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectArgs $;

        public Builder() {
            $ = new ProjectArgs();
        }

        public Builder(ProjectArgs defaults) {
            $ = new ProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name It has been deprecated from provider version 1.110.0 and `project_name` instead.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name It has been deprecated from provider version 1.110.0 and `project_name` instead.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orderType The type of payment, only `PayAsYouGo` supported currently.
         * 
         * @return builder
         * 
         */
        public Builder orderType(Output<String> orderType) {
            $.orderType = orderType;
            return this;
        }

        /**
         * @param orderType The type of payment, only `PayAsYouGo` supported currently.
         * 
         * @return builder
         * 
         */
        public Builder orderType(String orderType) {
            return orderType(Output.of(orderType));
        }

        /**
         * @param projectName The name of the maxcompute project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(@Nullable Output<String> projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param projectName The name of the maxcompute project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            return projectName(Output.of(projectName));
        }

        /**
         * @param specificationType The type of resource Specification, only `OdpsStandard` supported currently.
         * 
         * @return builder
         * 
         */
        public Builder specificationType(Output<String> specificationType) {
            $.specificationType = specificationType;
            return this;
        }

        /**
         * @param specificationType The type of resource Specification, only `OdpsStandard` supported currently.
         * 
         * @return builder
         * 
         */
        public Builder specificationType(String specificationType) {
            return specificationType(Output.of(specificationType));
        }

        public ProjectArgs build() {
            $.orderType = Objects.requireNonNull($.orderType, "expected parameter 'orderType' to be non-null");
            $.specificationType = Objects.requireNonNull($.specificationType, "expected parameter 'specificationType' to be non-null");
            return $;
        }
    }

}
