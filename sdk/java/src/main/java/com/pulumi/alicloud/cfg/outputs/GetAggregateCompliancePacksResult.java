// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.outputs;

import com.pulumi.alicloud.cfg.outputs.GetAggregateCompliancePacksPack;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAggregateCompliancePacksResult {
    private String aggregatorId;
    private @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    /**
     * @return A list of Config Aggregate Compliance Pack names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return A list of Config Aggregate Compliance Packs. Each element contains the following attributes:
     * 
     */
    private List<GetAggregateCompliancePacksPack> packs;
    /**
     * @return The status of the resource.
     * 
     */
    private @Nullable String status;

    private GetAggregateCompliancePacksResult() {}
    public String aggregatorId() {
        return this.aggregatorId;
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
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of Config Aggregate Compliance Pack names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of Config Aggregate Compliance Packs. Each element contains the following attributes:
     * 
     */
    public List<GetAggregateCompliancePacksPack> packs() {
        return this.packs;
    }
    /**
     * @return The status of the resource.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAggregateCompliancePacksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String aggregatorId;
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetAggregateCompliancePacksPack> packs;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetAggregateCompliancePacksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregatorId = defaults.aggregatorId;
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.packs = defaults.packs;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder aggregatorId(String aggregatorId) {
            this.aggregatorId = Objects.requireNonNull(aggregatorId);
            return this;
        }
        @CustomType.Setter
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
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
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder packs(List<GetAggregateCompliancePacksPack> packs) {
            this.packs = Objects.requireNonNull(packs);
            return this;
        }
        public Builder packs(GetAggregateCompliancePacksPack... packs) {
            return packs(List.of(packs));
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public GetAggregateCompliancePacksResult build() {
            final var _resultValue = new GetAggregateCompliancePacksResult();
            _resultValue.aggregatorId = aggregatorId;
            _resultValue.enableDetails = enableDetails;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.packs = packs;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
