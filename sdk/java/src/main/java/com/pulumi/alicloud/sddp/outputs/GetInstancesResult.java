// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sddp.outputs;

import com.pulumi.alicloud.sddp.outputs.GetInstancesInstance;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstancesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<GetInstancesInstance> instances;
    private final @Nullable String outputFile;

    @CustomType.Constructor
    private GetInstancesResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instances") List<GetInstancesInstance> instances,
        @CustomType.Parameter("outputFile") @Nullable String outputFile) {
        this.id = id;
        this.instances = instances;
        this.outputFile = outputFile;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetInstancesInstance> instances() {
        return this.instances;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<GetInstancesInstance> instances;
        private @Nullable String outputFile;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instances = defaults.instances;
    	      this.outputFile = defaults.outputFile;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instances(List<GetInstancesInstance> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(GetInstancesInstance... instances) {
            return instances(List.of(instances));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }        public GetInstancesResult build() {
            return new GetInstancesResult(id, instances, outputFile);
        }
    }
}
