// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.simpleapplicationserver.outputs;

import com.pulumi.alicloud.simpleapplicationserver.outputs.GetServerPlansPlan;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServerPlansResult {
    private @Nullable Integer bandwidth;
    private @Nullable Integer core;
    private @Nullable Integer diskSize;
    private @Nullable Integer flow;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable Integer memory;
    private @Nullable String outputFile;
    private List<GetServerPlansPlan> plans;
    private @Nullable String platform;

    private GetServerPlansResult() {}
    public Optional<Integer> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }
    public Optional<Integer> core() {
        return Optional.ofNullable(this.core);
    }
    public Optional<Integer> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }
    public Optional<Integer> flow() {
        return Optional.ofNullable(this.flow);
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
    public Optional<Integer> memory() {
        return Optional.ofNullable(this.memory);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetServerPlansPlan> plans() {
        return this.plans;
    }
    public Optional<String> platform() {
        return Optional.ofNullable(this.platform);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerPlansResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer bandwidth;
        private @Nullable Integer core;
        private @Nullable Integer diskSize;
        private @Nullable Integer flow;
        private String id;
        private List<String> ids;
        private @Nullable Integer memory;
        private @Nullable String outputFile;
        private List<GetServerPlansPlan> plans;
        private @Nullable String platform;
        public Builder() {}
        public Builder(GetServerPlansResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.core = defaults.core;
    	      this.diskSize = defaults.diskSize;
    	      this.flow = defaults.flow;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.memory = defaults.memory;
    	      this.outputFile = defaults.outputFile;
    	      this.plans = defaults.plans;
    	      this.platform = defaults.platform;
        }

        @CustomType.Setter
        public Builder bandwidth(@Nullable Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder core(@Nullable Integer core) {
            this.core = core;
            return this;
        }
        @CustomType.Setter
        public Builder diskSize(@Nullable Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        @CustomType.Setter
        public Builder flow(@Nullable Integer flow) {
            this.flow = flow;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder memory(@Nullable Integer memory) {
            this.memory = memory;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder plans(List<GetServerPlansPlan> plans) {
            this.plans = Objects.requireNonNull(plans);
            return this;
        }
        public Builder plans(GetServerPlansPlan... plans) {
            return plans(List.of(plans));
        }
        @CustomType.Setter
        public Builder platform(@Nullable String platform) {
            this.platform = platform;
            return this;
        }
        public GetServerPlansResult build() {
            final var _resultValue = new GetServerPlansResult();
            _resultValue.bandwidth = bandwidth;
            _resultValue.core = core;
            _resultValue.diskSize = diskSize;
            _resultValue.flow = flow;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.memory = memory;
            _resultValue.outputFile = outputFile;
            _resultValue.plans = plans;
            _resultValue.platform = platform;
            return _resultValue;
        }
    }
}
