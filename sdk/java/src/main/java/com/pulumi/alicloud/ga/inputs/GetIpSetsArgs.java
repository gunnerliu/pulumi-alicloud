// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpSetsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpSetsArgs Empty = new GetIpSetsArgs();

    /**
     * The ID of the Global Accelerator (GA) instance.
     * 
     */
    @Import(name="acceleratorId", required=true)
    private Output<String> acceleratorId;

    /**
     * @return The ID of the Global Accelerator (GA) instance.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }

    /**
     * A list of Ip Set IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Ip Set IDs.
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
     * The status of the acceleration region.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the acceleration region.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetIpSetsArgs() {}

    private GetIpSetsArgs(GetIpSetsArgs $) {
        this.acceleratorId = $.acceleratorId;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpSetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpSetsArgs $;

        public Builder() {
            $ = new GetIpSetsArgs();
        }

        public Builder(GetIpSetsArgs defaults) {
            $ = new GetIpSetsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorId The ID of the Global Accelerator (GA) instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(Output<String> acceleratorId) {
            $.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * @param acceleratorId The ID of the Global Accelerator (GA) instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(String acceleratorId) {
            return acceleratorId(Output.of(acceleratorId));
        }

        /**
         * @param ids A list of Ip Set IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Ip Set IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Ip Set IDs.
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
         * @param status The status of the acceleration region.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the acceleration region.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetIpSetsArgs build() {
            $.acceleratorId = Objects.requireNonNull($.acceleratorId, "expected parameter 'acceleratorId' to be non-null");
            return $;
        }
    }

}
