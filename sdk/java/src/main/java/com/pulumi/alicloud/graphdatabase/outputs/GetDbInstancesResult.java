// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.graphdatabase.outputs;

import com.pulumi.alicloud.graphdatabase.outputs.GetDbInstancesInstance;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDbInstancesResult {
    private @Nullable String dbInstanceDescription;
    private @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private List<GetDbInstancesInstance> instances;
    private @Nullable String outputFile;
    private @Nullable String status;

    private GetDbInstancesResult() {}
    public Optional<String> dbInstanceDescription() {
        return Optional.ofNullable(this.dbInstanceDescription);
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
    public List<GetDbInstancesInstance> instances() {
        return this.instances;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDbInstancesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String dbInstanceDescription;
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private List<GetDbInstancesInstance> instances;
        private @Nullable String outputFile;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetDbInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbInstanceDescription = defaults.dbInstanceDescription;
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instances = defaults.instances;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder dbInstanceDescription(@Nullable String dbInstanceDescription) {
            this.dbInstanceDescription = dbInstanceDescription;
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
        public Builder instances(List<GetDbInstancesInstance> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(GetDbInstancesInstance... instances) {
            return instances(List.of(instances));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public GetDbInstancesResult build() {
            final var _resultValue = new GetDbInstancesResult();
            _resultValue.dbInstanceDescription = dbInstanceDescription;
            _resultValue.enableDetails = enableDetails;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instances = instances;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
