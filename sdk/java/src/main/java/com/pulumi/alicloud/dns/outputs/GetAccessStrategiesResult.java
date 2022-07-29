// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.alicloud.dns.outputs.GetAccessStrategiesStrategy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccessStrategiesResult {
    private final @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final String instanceId;
    private final @Nullable String lang;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final @Nullable String outputFile;
    private final List<GetAccessStrategiesStrategy> strategies;
    private final String strategyMode;

    @CustomType.Constructor
    private GetAccessStrategiesResult(
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("lang") @Nullable String lang,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("strategies") List<GetAccessStrategiesStrategy> strategies,
        @CustomType.Parameter("strategyMode") String strategyMode) {
        this.enableDetails = enableDetails;
        this.id = id;
        this.ids = ids;
        this.instanceId = instanceId;
        this.lang = lang;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.strategies = strategies;
        this.strategyMode = strategyMode;
    }

    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public String instanceId() {
        return this.instanceId;
    }
    public Optional<String> lang() {
        return Optional.ofNullable(this.lang);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetAccessStrategiesStrategy> strategies() {
        return this.strategies;
    }
    public String strategyMode() {
        return this.strategyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessStrategiesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private String instanceId;
        private @Nullable String lang;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetAccessStrategiesStrategy> strategies;
        private String strategyMode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessStrategiesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.lang = defaults.lang;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.strategies = defaults.strategies;
    	      this.strategyMode = defaults.strategyMode;
        }

        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
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
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder lang(@Nullable String lang) {
            this.lang = lang;
            return this;
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
        public Builder strategies(List<GetAccessStrategiesStrategy> strategies) {
            this.strategies = Objects.requireNonNull(strategies);
            return this;
        }
        public Builder strategies(GetAccessStrategiesStrategy... strategies) {
            return strategies(List.of(strategies));
        }
        public Builder strategyMode(String strategyMode) {
            this.strategyMode = Objects.requireNonNull(strategyMode);
            return this;
        }        public GetAccessStrategiesResult build() {
            return new GetAccessStrategiesResult(enableDetails, id, ids, instanceId, lang, nameRegex, names, outputFile, strategies, strategyMode);
        }
    }
}
