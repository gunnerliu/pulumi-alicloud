// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScalingConfigurationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScalingConfigurationsPlainArgs Empty = new GetScalingConfigurationsPlainArgs();

    /**
     * A list of scaling configuration IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of scaling configuration IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter resulting scaling configurations by name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter resulting scaling configurations by name.
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
     * Scaling group id the scaling configurations belong to.
     * 
     */
    @Import(name="scalingGroupId")
    private @Nullable String scalingGroupId;

    /**
     * @return Scaling group id the scaling configurations belong to.
     * 
     */
    public Optional<String> scalingGroupId() {
        return Optional.ofNullable(this.scalingGroupId);
    }

    private GetScalingConfigurationsPlainArgs() {}

    private GetScalingConfigurationsPlainArgs(GetScalingConfigurationsPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.scalingGroupId = $.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScalingConfigurationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScalingConfigurationsPlainArgs $;

        public Builder() {
            $ = new GetScalingConfigurationsPlainArgs();
        }

        public Builder(GetScalingConfigurationsPlainArgs defaults) {
            $ = new GetScalingConfigurationsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of scaling configuration IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of scaling configuration IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter resulting scaling configurations by name.
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
         * @param scalingGroupId Scaling group id the scaling configurations belong to.
         * 
         * @return builder
         * 
         */
        public Builder scalingGroupId(@Nullable String scalingGroupId) {
            $.scalingGroupId = scalingGroupId;
            return this;
        }

        public GetScalingConfigurationsPlainArgs build() {
            return $;
        }
    }

}
