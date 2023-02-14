// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pvtz.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRulesArgs Empty = new GetRulesArgs();

    /**
     * The ID of the Endpoint.
     * 
     */
    @Import(name="endpointId")
    private @Nullable Output<String> endpointId;

    /**
     * @return The ID of the Endpoint.
     * 
     */
    public Optional<Output<String>> endpointId() {
        return Optional.ofNullable(this.endpointId);
    }

    /**
     * A list of Rule IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Rule IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Rule name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetRulesArgs() {}

    private GetRulesArgs(GetRulesArgs $) {
        this.endpointId = $.endpointId;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRulesArgs $;

        public Builder() {
            $ = new GetRulesArgs();
        }

        public Builder(GetRulesArgs defaults) {
            $ = new GetRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointId The ID of the Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(@Nullable Output<String> endpointId) {
            $.endpointId = endpointId;
            return this;
        }

        /**
         * @param endpointId The ID of the Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(String endpointId) {
            return endpointId(Output.of(endpointId));
        }

        /**
         * @param ids A list of Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Rule name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Rule name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public GetRulesArgs build() {
            return $;
        }
    }

}