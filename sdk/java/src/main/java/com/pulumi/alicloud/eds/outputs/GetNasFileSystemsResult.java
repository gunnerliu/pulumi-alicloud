// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.alicloud.eds.outputs.GetNasFileSystemsSystem;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNasFileSystemsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String officeSiteId;
    private @Nullable String outputFile;
    private @Nullable String status;
    private List<GetNasFileSystemsSystem> systems;

    private GetNasFileSystemsResult() {}
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
    public Optional<String> officeSiteId() {
        return Optional.ofNullable(this.officeSiteId);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public List<GetNasFileSystemsSystem> systems() {
        return this.systems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNasFileSystemsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String officeSiteId;
        private @Nullable String outputFile;
        private @Nullable String status;
        private List<GetNasFileSystemsSystem> systems;
        public Builder() {}
        public Builder(GetNasFileSystemsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.officeSiteId = defaults.officeSiteId;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
    	      this.systems = defaults.systems;
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
        public Builder officeSiteId(@Nullable String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
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
        @CustomType.Setter
        public Builder systems(List<GetNasFileSystemsSystem> systems) {
            this.systems = Objects.requireNonNull(systems);
            return this;
        }
        public Builder systems(GetNasFileSystemsSystem... systems) {
            return systems(List.of(systems));
        }
        public GetNasFileSystemsResult build() {
            final var _resultValue = new GetNasFileSystemsResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.officeSiteId = officeSiteId;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            _resultValue.systems = systems;
            return _resultValue;
        }
    }
}
