// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.alicloud.resourcemanager.outputs.GetSharedTargetsTarget;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSharedTargetsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String outputFile;
    private final @Nullable String resourceShareId;
    private final @Nullable String status;
    private final List<GetSharedTargetsTarget> targets;

    @CustomType.Constructor
    private GetSharedTargetsResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("resourceShareId") @Nullable String resourceShareId,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("targets") List<GetSharedTargetsTarget> targets) {
        this.id = id;
        this.ids = ids;
        this.outputFile = outputFile;
        this.resourceShareId = resourceShareId;
        this.status = status;
        this.targets = targets;
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
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> resourceShareId() {
        return Optional.ofNullable(this.resourceShareId);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public List<GetSharedTargetsTarget> targets() {
        return this.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSharedTargetsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private @Nullable String resourceShareId;
        private @Nullable String status;
        private List<GetSharedTargetsTarget> targets;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSharedTargetsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.resourceShareId = defaults.resourceShareId;
    	      this.status = defaults.status;
    	      this.targets = defaults.targets;
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
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder resourceShareId(@Nullable String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder targets(List<GetSharedTargetsTarget> targets) {
            this.targets = Objects.requireNonNull(targets);
            return this;
        }
        public Builder targets(GetSharedTargetsTarget... targets) {
            return targets(List.of(targets));
        }        public GetSharedTargetsResult build() {
            return new GetSharedTargetsResult(id, ids, outputFile, resourceShareId, status, targets);
        }
    }
}
