// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection.outputs;

import com.pulumi.alicloud.threatdetection.outputs.GetBaselineStrategiesStrategy;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBaselineStrategiesResult {
    /**
     * @return The type of policy. Value:
     * * **common**: standard policy
     * * **custom**: custom policy
     * 
     */
    private final @Nullable String customType;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of Baseline Strategy IDs.
     * 
     */
    private final List<String> ids;
    private final @Nullable String nameRegex;
    /**
     * @return A list of name of Baseline Strategys.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;
    private final List<GetBaselineStrategiesStrategy> strategies;
    private final @Nullable String strategyIds;

    @CustomType.Constructor
    private GetBaselineStrategiesResult(
        @CustomType.Parameter("customType") @Nullable String customType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("strategies") List<GetBaselineStrategiesStrategy> strategies,
        @CustomType.Parameter("strategyIds") @Nullable String strategyIds) {
        this.customType = customType;
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.strategies = strategies;
        this.strategyIds = strategyIds;
    }

    /**
     * @return The type of policy. Value:
     * * **common**: standard policy
     * * **custom**: custom policy
     * 
     */
    public Optional<String> customType() {
        return Optional.ofNullable(this.customType);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of Baseline Strategy IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of name of Baseline Strategys.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetBaselineStrategiesStrategy> strategies() {
        return this.strategies;
    }
    public Optional<String> strategyIds() {
        return Optional.ofNullable(this.strategyIds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBaselineStrategiesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customType;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetBaselineStrategiesStrategy> strategies;
        private @Nullable String strategyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBaselineStrategiesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customType = defaults.customType;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.strategies = defaults.strategies;
    	      this.strategyIds = defaults.strategyIds;
        }

        public Builder customType(@Nullable String customType) {
            this.customType = customType;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder strategies(List<GetBaselineStrategiesStrategy> strategies) {
            this.strategies = Objects.requireNonNull(strategies);
            return this;
        }
        public Builder strategies(GetBaselineStrategiesStrategy... strategies) {
            return strategies(List.of(strategies));
        }
        public Builder strategyIds(@Nullable String strategyIds) {
            this.strategyIds = strategyIds;
            return this;
        }        public GetBaselineStrategiesResult build() {
            return new GetBaselineStrategiesResult(customType, id, ids, nameRegex, names, outputFile, strategies, strategyIds);
        }
    }
}
