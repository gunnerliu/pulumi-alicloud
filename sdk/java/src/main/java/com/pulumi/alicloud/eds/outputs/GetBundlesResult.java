// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.alicloud.eds.outputs.GetBundlesBundle;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBundlesResult {
    private final List<String> bundleIds;
    private final @Nullable String bundleType;
    private final List<GetBundlesBundle> bundles;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final @Nullable String outputFile;

    @CustomType.Constructor
    private GetBundlesResult(
        @CustomType.Parameter("bundleIds") List<String> bundleIds,
        @CustomType.Parameter("bundleType") @Nullable String bundleType,
        @CustomType.Parameter("bundles") List<GetBundlesBundle> bundles,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile) {
        this.bundleIds = bundleIds;
        this.bundleType = bundleType;
        this.bundles = bundles;
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
    }

    public List<String> bundleIds() {
        return this.bundleIds;
    }
    public Optional<String> bundleType() {
        return Optional.ofNullable(this.bundleType);
    }
    public List<GetBundlesBundle> bundles() {
        return this.bundles;
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
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBundlesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> bundleIds;
        private @Nullable String bundleType;
        private List<GetBundlesBundle> bundles;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBundlesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleIds = defaults.bundleIds;
    	      this.bundleType = defaults.bundleType;
    	      this.bundles = defaults.bundles;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
        }

        public Builder bundleIds(List<String> bundleIds) {
            this.bundleIds = Objects.requireNonNull(bundleIds);
            return this;
        }
        public Builder bundleIds(String... bundleIds) {
            return bundleIds(List.of(bundleIds));
        }
        public Builder bundleType(@Nullable String bundleType) {
            this.bundleType = bundleType;
            return this;
        }
        public Builder bundles(List<GetBundlesBundle> bundles) {
            this.bundles = Objects.requireNonNull(bundles);
            return this;
        }
        public Builder bundles(GetBundlesBundle... bundles) {
            return bundles(List.of(bundles));
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
        }        public GetBundlesResult build() {
            return new GetBundlesResult(bundleIds, bundleType, bundles, id, ids, nameRegex, names, outputFile);
        }
    }
}
