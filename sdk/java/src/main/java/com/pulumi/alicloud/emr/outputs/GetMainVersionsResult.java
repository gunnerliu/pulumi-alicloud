// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emr.outputs;

import com.pulumi.alicloud.emr.outputs.GetMainVersionsMainVersion;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMainVersionsResult {
    private @Nullable List<String> clusterTypes;
    /**
     * @return The version of the emr cluster instance.
     * 
     */
    private @Nullable String emrVersion;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of emr instance types IDs.
     * 
     */
    private List<String> ids;
    /**
     * @return A list of versions of the emr cluster instance. Each element contains the following attributes:
     * 
     */
    private List<GetMainVersionsMainVersion> mainVersions;
    private @Nullable String outputFile;

    private GetMainVersionsResult() {}
    public List<String> clusterTypes() {
        return this.clusterTypes == null ? List.of() : this.clusterTypes;
    }
    /**
     * @return The version of the emr cluster instance.
     * 
     */
    public Optional<String> emrVersion() {
        return Optional.ofNullable(this.emrVersion);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of emr instance types IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return A list of versions of the emr cluster instance. Each element contains the following attributes:
     * 
     */
    public List<GetMainVersionsMainVersion> mainVersions() {
        return this.mainVersions;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMainVersionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> clusterTypes;
        private @Nullable String emrVersion;
        private String id;
        private List<String> ids;
        private List<GetMainVersionsMainVersion> mainVersions;
        private @Nullable String outputFile;
        public Builder() {}
        public Builder(GetMainVersionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterTypes = defaults.clusterTypes;
    	      this.emrVersion = defaults.emrVersion;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.mainVersions = defaults.mainVersions;
    	      this.outputFile = defaults.outputFile;
        }

        @CustomType.Setter
        public Builder clusterTypes(@Nullable List<String> clusterTypes) {
            this.clusterTypes = clusterTypes;
            return this;
        }
        public Builder clusterTypes(String... clusterTypes) {
            return clusterTypes(List.of(clusterTypes));
        }
        @CustomType.Setter
        public Builder emrVersion(@Nullable String emrVersion) {
            this.emrVersion = emrVersion;
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
        public Builder mainVersions(List<GetMainVersionsMainVersion> mainVersions) {
            this.mainVersions = Objects.requireNonNull(mainVersions);
            return this;
        }
        public Builder mainVersions(GetMainVersionsMainVersion... mainVersions) {
            return mainVersions(List.of(mainVersions));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public GetMainVersionsResult build() {
            final var _resultValue = new GetMainVersionsResult();
            _resultValue.clusterTypes = clusterTypes;
            _resultValue.emrVersion = emrVersion;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.mainVersions = mainVersions;
            _resultValue.outputFile = outputFile;
            return _resultValue;
        }
    }
}
