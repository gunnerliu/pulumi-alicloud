// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBaselineStrategiesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBaselineStrategiesArgs Empty = new GetBaselineStrategiesArgs();

    /**
     * The type of policy. Value:-**common**: standard policy-**custom**: custom policy
     * 
     */
    @Import(name="customType")
    private @Nullable Output<String> customType;

    /**
     * @return The type of policy. Value:-**common**: standard policy-**custom**: custom policy
     * 
     */
    public Optional<Output<String>> customType() {
        return Optional.ofNullable(this.customType);
    }

    /**
     * A list of Baseline Strategy IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Baseline Strategy IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Group Metric Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Group Metric Rule name.
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

    @Import(name="strategyIds")
    private @Nullable Output<String> strategyIds;

    public Optional<Output<String>> strategyIds() {
        return Optional.ofNullable(this.strategyIds);
    }

    private GetBaselineStrategiesArgs() {}

    private GetBaselineStrategiesArgs(GetBaselineStrategiesArgs $) {
        this.customType = $.customType;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.strategyIds = $.strategyIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBaselineStrategiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBaselineStrategiesArgs $;

        public Builder() {
            $ = new GetBaselineStrategiesArgs();
        }

        public Builder(GetBaselineStrategiesArgs defaults) {
            $ = new GetBaselineStrategiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customType The type of policy. Value:-**common**: standard policy-**custom**: custom policy
         * 
         * @return builder
         * 
         */
        public Builder customType(@Nullable Output<String> customType) {
            $.customType = customType;
            return this;
        }

        /**
         * @param customType The type of policy. Value:-**common**: standard policy-**custom**: custom policy
         * 
         * @return builder
         * 
         */
        public Builder customType(String customType) {
            return customType(Output.of(customType));
        }

        /**
         * @param ids A list of Baseline Strategy IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Baseline Strategy IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Baseline Strategy IDs.
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
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Group Metric Rule name.
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

        public Builder strategyIds(@Nullable Output<String> strategyIds) {
            $.strategyIds = strategyIds;
            return this;
        }

        public Builder strategyIds(String strategyIds) {
            return strategyIds(Output.of(strategyIds));
        }

        public GetBaselineStrategiesArgs build() {
            return $;
        }
    }

}
