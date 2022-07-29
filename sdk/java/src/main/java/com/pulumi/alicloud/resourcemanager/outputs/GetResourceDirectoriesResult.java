// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.alicloud.resourcemanager.outputs.GetResourceDirectoriesDirectory;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetResourceDirectoriesResult {
    /**
     * @return A list of resource directories. Each element contains the following attributes:
     * 
     */
    private final List<GetResourceDirectoriesDirectory> directories;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String outputFile;

    @CustomType.Constructor
    private GetResourceDirectoriesResult(
        @CustomType.Parameter("directories") List<GetResourceDirectoriesDirectory> directories,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("outputFile") @Nullable String outputFile) {
        this.directories = directories;
        this.id = id;
        this.outputFile = outputFile;
    }

    /**
     * @return A list of resource directories. Each element contains the following attributes:
     * 
     */
    public List<GetResourceDirectoriesDirectory> directories() {
        return this.directories;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceDirectoriesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetResourceDirectoriesDirectory> directories;
        private String id;
        private @Nullable String outputFile;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceDirectoriesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directories = defaults.directories;
    	      this.id = defaults.id;
    	      this.outputFile = defaults.outputFile;
        }

        public Builder directories(List<GetResourceDirectoriesDirectory> directories) {
            this.directories = Objects.requireNonNull(directories);
            return this;
        }
        public Builder directories(GetResourceDirectoriesDirectory... directories) {
            return directories(List.of(directories));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }        public GetResourceDirectoriesResult build() {
            return new GetResourceDirectoriesResult(directories, id, outputFile);
        }
    }
}
