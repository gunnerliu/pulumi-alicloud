// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMasterSlaveServerGroupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMasterSlaveServerGroupsArgs Empty = new GetMasterSlaveServerGroupsArgs();

    /**
     * A list of master slave server group IDs to filter results.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of master slave server group IDs to filter results.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * ID of the SLB.
     * 
     */
    @Import(name="loadBalancerId", required=true)
    private Output<String> loadBalancerId;

    /**
     * @return ID of the SLB.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * A regex string to filter results by master slave server group name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by master slave server group name.
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

    private GetMasterSlaveServerGroupsArgs() {}

    private GetMasterSlaveServerGroupsArgs(GetMasterSlaveServerGroupsArgs $) {
        this.ids = $.ids;
        this.loadBalancerId = $.loadBalancerId;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMasterSlaveServerGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMasterSlaveServerGroupsArgs $;

        public Builder() {
            $ = new GetMasterSlaveServerGroupsArgs();
        }

        public Builder(GetMasterSlaveServerGroupsArgs defaults) {
            $ = new GetMasterSlaveServerGroupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of master slave server group IDs to filter results.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of master slave server group IDs to filter results.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of master slave server group IDs to filter results.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param loadBalancerId ID of the SLB.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(Output<String> loadBalancerId) {
            $.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * @param loadBalancerId ID of the SLB.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(String loadBalancerId) {
            return loadBalancerId(Output.of(loadBalancerId));
        }

        /**
         * @param nameRegex A regex string to filter results by master slave server group name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by master slave server group name.
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

        public GetMasterSlaveServerGroupsArgs build() {
            $.loadBalancerId = Objects.requireNonNull($.loadBalancerId, "expected parameter 'loadBalancerId' to be non-null");
            return $;
        }
    }

}
