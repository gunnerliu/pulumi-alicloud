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
    private List<String> bundleIds;
    private @Nullable String bundleType;
    private List<GetBundlesBundle> bundles;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;

    private GetBundlesResult() {}
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
    @CustomType.Builder
    public static final class Builder {
        private List<String> bundleIds;
        private @Nullable String bundleType;
        private List<GetBundlesBundle> bundles;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        public Builder() {}
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

        @CustomType.Setter
        public Builder bundleIds(List<String> bundleIds) {
            this.bundleIds = Objects.requireNonNull(bundleIds);
            return this;
        }
        public Builder bundleIds(String... bundleIds) {
            return bundleIds(List.of(bundleIds));
        }
        @CustomType.Setter
        public Builder bundleType(@Nullable String bundleType) {
            this.bundleType = bundleType;
            return this;
        }
        @CustomType.Setter
        public Builder bundles(List<GetBundlesBundle> bundles) {
            this.bundles = Objects.requireNonNull(bundles);
            return this;
        }
        public Builder bundles(GetBundlesBundle... bundles) {
            return bundles(List.of(bundles));
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
        public GetBundlesResult build() {
            final var o = new GetBundlesResult();
            o.bundleIds = bundleIds;
            o.bundleType = bundleType;
            o.bundles = bundles;
            o.id = id;
            o.ids = ids;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            return o;
        }
    }
}