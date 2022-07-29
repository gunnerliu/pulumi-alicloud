// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.alicloud.ess.outputs.GetLifecycleHooksHook;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLifecycleHooksResult {
    /**
     * @return A list of lifecycle hooks. Each element contains the following attributes:
     * 
     */
    private final List<GetLifecycleHooksHook> hooks;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of lifecycle hook ids.
     * 
     */
    private final List<String> ids;
    private final @Nullable String nameRegex;
    /**
     * @return A list of lifecycle hook names.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;
    /**
     * @return ID of the scaling group.
     * 
     */
    private final @Nullable String scalingGroupId;

    @CustomType.Constructor
    private GetLifecycleHooksResult(
        @CustomType.Parameter("hooks") List<GetLifecycleHooksHook> hooks,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("scalingGroupId") @Nullable String scalingGroupId) {
        this.hooks = hooks;
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.scalingGroupId = scalingGroupId;
    }

    /**
     * @return A list of lifecycle hooks. Each element contains the following attributes:
     * 
     */
    public List<GetLifecycleHooksHook> hooks() {
        return this.hooks;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of lifecycle hook ids.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of lifecycle hook names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return ID of the scaling group.
     * 
     */
    public Optional<String> scalingGroupId() {
        return Optional.ofNullable(this.scalingGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLifecycleHooksResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetLifecycleHooksHook> hooks;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String scalingGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLifecycleHooksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hooks = defaults.hooks;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.scalingGroupId = defaults.scalingGroupId;
        }

        public Builder hooks(List<GetLifecycleHooksHook> hooks) {
            this.hooks = Objects.requireNonNull(hooks);
            return this;
        }
        public Builder hooks(GetLifecycleHooksHook... hooks) {
            return hooks(List.of(hooks));
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
        public Builder scalingGroupId(@Nullable String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }        public GetLifecycleHooksResult build() {
            return new GetLifecycleHooksResult(hooks, id, ids, nameRegex, names, outputFile, scalingGroupId);
        }
    }
}
