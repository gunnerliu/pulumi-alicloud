// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oos.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationGroupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationGroupsArgs Empty = new GetApplicationGroupsArgs();

    /**
     * The name of the Application.
     * 
     */
    @Import(name="applicationName", required=true)
    private Output<String> applicationName;

    /**
     * @return The name of the Application.
     * 
     */
    public Output<String> applicationName() {
        return this.applicationName;
    }

    /**
     * The region ID of the deployment.
     * 
     */
    @Import(name="deployRegionId")
    private @Nullable Output<String> deployRegionId;

    /**
     * @return The region ID of the deployment.
     * 
     */
    public Optional<Output<String>> deployRegionId() {
        return Optional.ofNullable(this.deployRegionId);
    }

    /**
     * A list of Application Group IDs. Its element value is same as Application Group Name.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Application Group IDs. Its element value is same as Application Group Name.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Application Group name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Application Group name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
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

    private GetApplicationGroupsArgs() {}

    private GetApplicationGroupsArgs(GetApplicationGroupsArgs $) {
        this.applicationName = $.applicationName;
        this.deployRegionId = $.deployRegionId;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationGroupsArgs $;

        public Builder() {
            $ = new GetApplicationGroupsArgs();
        }

        public Builder(GetApplicationGroupsArgs defaults) {
            $ = new GetApplicationGroupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationName The name of the Application.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(Output<String> applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        /**
         * @param applicationName The name of the Application.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(String applicationName) {
            return applicationName(Output.of(applicationName));
        }

        /**
         * @param deployRegionId The region ID of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder deployRegionId(@Nullable Output<String> deployRegionId) {
            $.deployRegionId = deployRegionId;
            return this;
        }

        /**
         * @param deployRegionId The region ID of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder deployRegionId(String deployRegionId) {
            return deployRegionId(Output.of(deployRegionId));
        }

        /**
         * @param ids A list of Application Group IDs. Its element value is same as Application Group Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Application Group IDs. Its element value is same as Application Group Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Application Group IDs. Its element value is same as Application Group Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Application Group name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Application Group name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
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

        public GetApplicationGroupsArgs build() {
            $.applicationName = Objects.requireNonNull($.applicationName, "expected parameter 'applicationName' to be non-null");
            return $;
        }
    }

}
