// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ehpc.outputs;

import com.pulumi.alicloud.ehpc.outputs.ClusterAdditionalVolumeRole;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAdditionalVolume {
    /**
     * @return The queue of the nodes to which the additional file system is attached.
     * 
     */
    private @Nullable String jobQueue;
    /**
     * @return The local directory on which the additional file system is mounted.
     * 
     */
    private @Nullable String localDirectory;
    /**
     * @return The type of the cluster. Valid value: `PublicCloud`.
     * 
     */
    private @Nullable String location;
    /**
     * @return The remote directory to which the additional file system is mounted.
     * 
     */
    private @Nullable String remoteDirectory;
    /**
     * @return The roles. See `roles` below.
     * 
     */
    private @Nullable List<ClusterAdditionalVolumeRole> roles;
    /**
     * @return The ID of the additional file system.
     * 
     */
    private @Nullable String volumeId;
    /**
     * @return The mount options of the file system.
     * 
     */
    private @Nullable String volumeMountOption;
    /**
     * @return The mount target of the additional file system.
     * 
     */
    private @Nullable String volumeMountpoint;
    /**
     * @return The type of the protocol that is used by the additional file system. Valid values: `NFS`, `SMB`. Default value: `NFS`
     * 
     */
    private @Nullable String volumeProtocol;
    /**
     * @return The type of the additional shared storage. Only NAS file systems are supported.
     * 
     */
    private @Nullable String volumeType;

    private ClusterAdditionalVolume() {}
    /**
     * @return The queue of the nodes to which the additional file system is attached.
     * 
     */
    public Optional<String> jobQueue() {
        return Optional.ofNullable(this.jobQueue);
    }
    /**
     * @return The local directory on which the additional file system is mounted.
     * 
     */
    public Optional<String> localDirectory() {
        return Optional.ofNullable(this.localDirectory);
    }
    /**
     * @return The type of the cluster. Valid value: `PublicCloud`.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The remote directory to which the additional file system is mounted.
     * 
     */
    public Optional<String> remoteDirectory() {
        return Optional.ofNullable(this.remoteDirectory);
    }
    /**
     * @return The roles. See `roles` below.
     * 
     */
    public List<ClusterAdditionalVolumeRole> roles() {
        return this.roles == null ? List.of() : this.roles;
    }
    /**
     * @return The ID of the additional file system.
     * 
     */
    public Optional<String> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }
    /**
     * @return The mount options of the file system.
     * 
     */
    public Optional<String> volumeMountOption() {
        return Optional.ofNullable(this.volumeMountOption);
    }
    /**
     * @return The mount target of the additional file system.
     * 
     */
    public Optional<String> volumeMountpoint() {
        return Optional.ofNullable(this.volumeMountpoint);
    }
    /**
     * @return The type of the protocol that is used by the additional file system. Valid values: `NFS`, `SMB`. Default value: `NFS`
     * 
     */
    public Optional<String> volumeProtocol() {
        return Optional.ofNullable(this.volumeProtocol);
    }
    /**
     * @return The type of the additional shared storage. Only NAS file systems are supported.
     * 
     */
    public Optional<String> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAdditionalVolume defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String jobQueue;
        private @Nullable String localDirectory;
        private @Nullable String location;
        private @Nullable String remoteDirectory;
        private @Nullable List<ClusterAdditionalVolumeRole> roles;
        private @Nullable String volumeId;
        private @Nullable String volumeMountOption;
        private @Nullable String volumeMountpoint;
        private @Nullable String volumeProtocol;
        private @Nullable String volumeType;
        public Builder() {}
        public Builder(ClusterAdditionalVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobQueue = defaults.jobQueue;
    	      this.localDirectory = defaults.localDirectory;
    	      this.location = defaults.location;
    	      this.remoteDirectory = defaults.remoteDirectory;
    	      this.roles = defaults.roles;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeMountOption = defaults.volumeMountOption;
    	      this.volumeMountpoint = defaults.volumeMountpoint;
    	      this.volumeProtocol = defaults.volumeProtocol;
    	      this.volumeType = defaults.volumeType;
        }

        @CustomType.Setter
        public Builder jobQueue(@Nullable String jobQueue) {
            this.jobQueue = jobQueue;
            return this;
        }
        @CustomType.Setter
        public Builder localDirectory(@Nullable String localDirectory) {
            this.localDirectory = localDirectory;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder remoteDirectory(@Nullable String remoteDirectory) {
            this.remoteDirectory = remoteDirectory;
            return this;
        }
        @CustomType.Setter
        public Builder roles(@Nullable List<ClusterAdditionalVolumeRole> roles) {
            this.roles = roles;
            return this;
        }
        public Builder roles(ClusterAdditionalVolumeRole... roles) {
            return roles(List.of(roles));
        }
        @CustomType.Setter
        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        @CustomType.Setter
        public Builder volumeMountOption(@Nullable String volumeMountOption) {
            this.volumeMountOption = volumeMountOption;
            return this;
        }
        @CustomType.Setter
        public Builder volumeMountpoint(@Nullable String volumeMountpoint) {
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }
        @CustomType.Setter
        public Builder volumeProtocol(@Nullable String volumeProtocol) {
            this.volumeProtocol = volumeProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public ClusterAdditionalVolume build() {
            final var _resultValue = new ClusterAdditionalVolume();
            _resultValue.jobQueue = jobQueue;
            _resultValue.localDirectory = localDirectory;
            _resultValue.location = location;
            _resultValue.remoteDirectory = remoteDirectory;
            _resultValue.roles = roles;
            _resultValue.volumeId = volumeId;
            _resultValue.volumeMountOption = volumeMountOption;
            _resultValue.volumeMountpoint = volumeMountpoint;
            _resultValue.volumeProtocol = volumeProtocol;
            _resultValue.volumeType = volumeType;
            return _resultValue;
        }
    }
}
