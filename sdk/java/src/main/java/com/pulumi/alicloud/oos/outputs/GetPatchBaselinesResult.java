// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oos.outputs;

import com.pulumi.alicloud.oos.outputs.GetPatchBaselinesBaseline;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPatchBaselinesResult {
    private final List<GetPatchBaselinesBaseline> baselines;
    private final @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final @Nullable String operationSystem;
    private final @Nullable String outputFile;
    private final @Nullable String shareType;

    @CustomType.Constructor
    private GetPatchBaselinesResult(
        @CustomType.Parameter("baselines") List<GetPatchBaselinesBaseline> baselines,
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("operationSystem") @Nullable String operationSystem,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("shareType") @Nullable String shareType) {
        this.baselines = baselines;
        this.enableDetails = enableDetails;
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.operationSystem = operationSystem;
        this.outputFile = outputFile;
        this.shareType = shareType;
    }

    public List<GetPatchBaselinesBaseline> baselines() {
        return this.baselines;
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
    public List<String> names() {
        return this.names;
    }
    public Optional<String> operationSystem() {
        return Optional.ofNullable(this.operationSystem);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> shareType() {
        return Optional.ofNullable(this.shareType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPatchBaselinesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetPatchBaselinesBaseline> baselines;
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String operationSystem;
        private @Nullable String outputFile;
        private @Nullable String shareType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPatchBaselinesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baselines = defaults.baselines;
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.operationSystem = defaults.operationSystem;
    	      this.outputFile = defaults.outputFile;
    	      this.shareType = defaults.shareType;
        }

        public Builder baselines(List<GetPatchBaselinesBaseline> baselines) {
            this.baselines = Objects.requireNonNull(baselines);
            return this;
        }
        public Builder baselines(GetPatchBaselinesBaseline... baselines) {
            return baselines(List.of(baselines));
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
        public Builder operationSystem(@Nullable String operationSystem) {
            this.operationSystem = operationSystem;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder shareType(@Nullable String shareType) {
            this.shareType = shareType;
            return this;
        }        public GetPatchBaselinesResult build() {
            return new GetPatchBaselinesResult(baselines, enableDetails, id, ids, nameRegex, names, operationSystem, outputFile, shareType);
        }
    }
}
