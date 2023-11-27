// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.alicloud.ess.outputs.EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPath;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EciScalingConfigurationVolume {
    /**
     * @return ConfigFileVolumeConfigFileToPaths.
     * See `config_file_volume_config_file_to_paths` below for details.
     * 
     */
    private @Nullable List<EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths;
    /**
     * @return The ID of DiskVolume.
     * 
     */
    private @Nullable String diskVolumeDiskId;
    /**
     * @return The disk size of DiskVolume.
     * 
     */
    private @Nullable Integer diskVolumeDiskSize;
    /**
     * @return The system type of DiskVolume.
     * 
     */
    private @Nullable String diskVolumeFsType;
    /**
     * @return The name of the FlexVolume driver.
     * 
     */
    private @Nullable String flexVolumeDriver;
    /**
     * @return The type of the mounted file system. The default value is determined by the script
     * of FlexVolume.
     * 
     */
    private @Nullable String flexVolumeFsType;
    /**
     * @return The list of FlexVolume objects. Each object is a key-value pair contained in a JSON
     * string.
     * 
     */
    private @Nullable String flexVolumeOptions;
    /**
     * @return The name of the volume.
     * 
     */
    private @Nullable String name;
    /**
     * @return The path to the NFS volume.
     * 
     */
    private @Nullable String nfsVolumePath;
    /**
     * @return The nfs volume read only. Default to `false`.
     * 
     */
    private @Nullable Boolean nfsVolumeReadOnly;
    /**
     * @return The address of the NFS server.
     * 
     * &gt; **NOTE:** Every volume mounted must have a name and type attributes.
     * 
     */
    private @Nullable String nfsVolumeServer;
    /**
     * @return The type of the volume.
     * 
     */
    private @Nullable String type;

    private EciScalingConfigurationVolume() {}
    /**
     * @return ConfigFileVolumeConfigFileToPaths.
     * See `config_file_volume_config_file_to_paths` below for details.
     * 
     */
    public List<EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths() {
        return this.configFileVolumeConfigFileToPaths == null ? List.of() : this.configFileVolumeConfigFileToPaths;
    }
    /**
     * @return The ID of DiskVolume.
     * 
     */
    public Optional<String> diskVolumeDiskId() {
        return Optional.ofNullable(this.diskVolumeDiskId);
    }
    /**
     * @return The disk size of DiskVolume.
     * 
     */
    public Optional<Integer> diskVolumeDiskSize() {
        return Optional.ofNullable(this.diskVolumeDiskSize);
    }
    /**
     * @return The system type of DiskVolume.
     * 
     */
    public Optional<String> diskVolumeFsType() {
        return Optional.ofNullable(this.diskVolumeFsType);
    }
    /**
     * @return The name of the FlexVolume driver.
     * 
     */
    public Optional<String> flexVolumeDriver() {
        return Optional.ofNullable(this.flexVolumeDriver);
    }
    /**
     * @return The type of the mounted file system. The default value is determined by the script
     * of FlexVolume.
     * 
     */
    public Optional<String> flexVolumeFsType() {
        return Optional.ofNullable(this.flexVolumeFsType);
    }
    /**
     * @return The list of FlexVolume objects. Each object is a key-value pair contained in a JSON
     * string.
     * 
     */
    public Optional<String> flexVolumeOptions() {
        return Optional.ofNullable(this.flexVolumeOptions);
    }
    /**
     * @return The name of the volume.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The path to the NFS volume.
     * 
     */
    public Optional<String> nfsVolumePath() {
        return Optional.ofNullable(this.nfsVolumePath);
    }
    /**
     * @return The nfs volume read only. Default to `false`.
     * 
     */
    public Optional<Boolean> nfsVolumeReadOnly() {
        return Optional.ofNullable(this.nfsVolumeReadOnly);
    }
    /**
     * @return The address of the NFS server.
     * 
     * &gt; **NOTE:** Every volume mounted must have a name and type attributes.
     * 
     */
    public Optional<String> nfsVolumeServer() {
        return Optional.ofNullable(this.nfsVolumeServer);
    }
    /**
     * @return The type of the volume.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EciScalingConfigurationVolume defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths;
        private @Nullable String diskVolumeDiskId;
        private @Nullable Integer diskVolumeDiskSize;
        private @Nullable String diskVolumeFsType;
        private @Nullable String flexVolumeDriver;
        private @Nullable String flexVolumeFsType;
        private @Nullable String flexVolumeOptions;
        private @Nullable String name;
        private @Nullable String nfsVolumePath;
        private @Nullable Boolean nfsVolumeReadOnly;
        private @Nullable String nfsVolumeServer;
        private @Nullable String type;
        public Builder() {}
        public Builder(EciScalingConfigurationVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configFileVolumeConfigFileToPaths = defaults.configFileVolumeConfigFileToPaths;
    	      this.diskVolumeDiskId = defaults.diskVolumeDiskId;
    	      this.diskVolumeDiskSize = defaults.diskVolumeDiskSize;
    	      this.diskVolumeFsType = defaults.diskVolumeFsType;
    	      this.flexVolumeDriver = defaults.flexVolumeDriver;
    	      this.flexVolumeFsType = defaults.flexVolumeFsType;
    	      this.flexVolumeOptions = defaults.flexVolumeOptions;
    	      this.name = defaults.name;
    	      this.nfsVolumePath = defaults.nfsVolumePath;
    	      this.nfsVolumeReadOnly = defaults.nfsVolumeReadOnly;
    	      this.nfsVolumeServer = defaults.nfsVolumeServer;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder configFileVolumeConfigFileToPaths(@Nullable List<EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths) {
            this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
            return this;
        }
        public Builder configFileVolumeConfigFileToPaths(EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPath... configFileVolumeConfigFileToPaths) {
            return configFileVolumeConfigFileToPaths(List.of(configFileVolumeConfigFileToPaths));
        }
        @CustomType.Setter
        public Builder diskVolumeDiskId(@Nullable String diskVolumeDiskId) {
            this.diskVolumeDiskId = diskVolumeDiskId;
            return this;
        }
        @CustomType.Setter
        public Builder diskVolumeDiskSize(@Nullable Integer diskVolumeDiskSize) {
            this.diskVolumeDiskSize = diskVolumeDiskSize;
            return this;
        }
        @CustomType.Setter
        public Builder diskVolumeFsType(@Nullable String diskVolumeFsType) {
            this.diskVolumeFsType = diskVolumeFsType;
            return this;
        }
        @CustomType.Setter
        public Builder flexVolumeDriver(@Nullable String flexVolumeDriver) {
            this.flexVolumeDriver = flexVolumeDriver;
            return this;
        }
        @CustomType.Setter
        public Builder flexVolumeFsType(@Nullable String flexVolumeFsType) {
            this.flexVolumeFsType = flexVolumeFsType;
            return this;
        }
        @CustomType.Setter
        public Builder flexVolumeOptions(@Nullable String flexVolumeOptions) {
            this.flexVolumeOptions = flexVolumeOptions;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nfsVolumePath(@Nullable String nfsVolumePath) {
            this.nfsVolumePath = nfsVolumePath;
            return this;
        }
        @CustomType.Setter
        public Builder nfsVolumeReadOnly(@Nullable Boolean nfsVolumeReadOnly) {
            this.nfsVolumeReadOnly = nfsVolumeReadOnly;
            return this;
        }
        @CustomType.Setter
        public Builder nfsVolumeServer(@Nullable String nfsVolumeServer) {
            this.nfsVolumeServer = nfsVolumeServer;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public EciScalingConfigurationVolume build() {
            final var _resultValue = new EciScalingConfigurationVolume();
            _resultValue.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
            _resultValue.diskVolumeDiskId = diskVolumeDiskId;
            _resultValue.diskVolumeDiskSize = diskVolumeDiskSize;
            _resultValue.diskVolumeFsType = diskVolumeFsType;
            _resultValue.flexVolumeDriver = flexVolumeDriver;
            _resultValue.flexVolumeFsType = flexVolumeFsType;
            _resultValue.flexVolumeOptions = flexVolumeOptions;
            _resultValue.name = name;
            _resultValue.nfsVolumePath = nfsVolumePath;
            _resultValue.nfsVolumeReadOnly = nfsVolumeReadOnly;
            _resultValue.nfsVolumeServer = nfsVolumeServer;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
