// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.edas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeployGroupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeployGroupsPlainArgs Empty = new GetDeployGroupsPlainArgs();

    /**
     * ID of the EDAS application.
     * 
     */
    @Import(name="appId", required=true)
    private String appId;

    /**
     * @return ID of the EDAS application.
     * 
     */
    public String appId() {
        return this.appId;
    }

    /**
     * A regex string to filter results by the deploy group name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by the deploy group name.
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

    private GetDeployGroupsPlainArgs() {}

    private GetDeployGroupsPlainArgs(GetDeployGroupsPlainArgs $) {
        this.appId = $.appId;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeployGroupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeployGroupsPlainArgs $;

        public Builder() {
            $ = new GetDeployGroupsPlainArgs();
        }

        public Builder(GetDeployGroupsPlainArgs defaults) {
            $ = new GetDeployGroupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId ID of the EDAS application.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by the deploy group name.
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

        public GetDeployGroupsPlainArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            return $;
        }
    }

}
