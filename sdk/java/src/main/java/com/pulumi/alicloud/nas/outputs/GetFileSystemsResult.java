// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.outputs;

import com.pulumi.alicloud.nas.outputs.GetFileSystemsSystem;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFileSystemsResult {
    private @Nullable String descriptionRegex;
    /**
     * @return A list of FileSystem descriptions.
     * 
     */
    private List<String> descriptions;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of FileSystem Id.
     * 
     */
    private List<String> ids;
    private @Nullable String outputFile;
    /**
     * @return ProtocolType block of the FileSystem
     * 
     */
    private @Nullable String protocolType;
    /**
     * @return StorageType block of the FileSystem.
     * 
     */
    private @Nullable String storageType;
    /**
     * @return A list of VPCs. Each element contains the following attributes:
     * 
     */
    private List<GetFileSystemsSystem> systems;

    private GetFileSystemsResult() {}
    public Optional<String> descriptionRegex() {
        return Optional.ofNullable(this.descriptionRegex);
    }
    /**
     * @return A list of FileSystem descriptions.
     * 
     */
    public List<String> descriptions() {
        return this.descriptions;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of FileSystem Id.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return ProtocolType block of the FileSystem
     * 
     */
    public Optional<String> protocolType() {
        return Optional.ofNullable(this.protocolType);
    }
    /**
     * @return StorageType block of the FileSystem.
     * 
     */
    public Optional<String> storageType() {
        return Optional.ofNullable(this.storageType);
    }
    /**
     * @return A list of VPCs. Each element contains the following attributes:
     * 
     */
    public List<GetFileSystemsSystem> systems() {
        return this.systems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFileSystemsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String descriptionRegex;
        private List<String> descriptions;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private @Nullable String protocolType;
        private @Nullable String storageType;
        private List<GetFileSystemsSystem> systems;
        public Builder() {}
        public Builder(GetFileSystemsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.descriptionRegex = defaults.descriptionRegex;
    	      this.descriptions = defaults.descriptions;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.protocolType = defaults.protocolType;
    	      this.storageType = defaults.storageType;
    	      this.systems = defaults.systems;
        }

        @CustomType.Setter
        public Builder descriptionRegex(@Nullable String descriptionRegex) {
            this.descriptionRegex = descriptionRegex;
            return this;
        }
        @CustomType.Setter
        public Builder descriptions(List<String> descriptions) {
            this.descriptions = Objects.requireNonNull(descriptions);
            return this;
        }
        public Builder descriptions(String... descriptions) {
            return descriptions(List.of(descriptions));
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
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder protocolType(@Nullable String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        @CustomType.Setter
        public Builder storageType(@Nullable String storageType) {
            this.storageType = storageType;
            return this;
        }
        @CustomType.Setter
        public Builder systems(List<GetFileSystemsSystem> systems) {
            this.systems = Objects.requireNonNull(systems);
            return this;
        }
        public Builder systems(GetFileSystemsSystem... systems) {
            return systems(List.of(systems));
        }
        public GetFileSystemsResult build() {
            final var _resultValue = new GetFileSystemsResult();
            _resultValue.descriptionRegex = descriptionRegex;
            _resultValue.descriptions = descriptions;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.outputFile = outputFile;
            _resultValue.protocolType = protocolType;
            _resultValue.storageType = storageType;
            _resultValue.systems = systems;
            return _resultValue;
        }
    }
}
