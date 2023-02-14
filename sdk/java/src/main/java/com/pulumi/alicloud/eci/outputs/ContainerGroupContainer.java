// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.alicloud.eci.outputs.ContainerGroupContainerEnvironmentVar;
import com.pulumi.alicloud.eci.outputs.ContainerGroupContainerLivenessProbe;
import com.pulumi.alicloud.eci.outputs.ContainerGroupContainerPort;
import com.pulumi.alicloud.eci.outputs.ContainerGroupContainerReadinessProbe;
import com.pulumi.alicloud.eci.outputs.ContainerGroupContainerVolumeMount;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerGroupContainer {
    /**
     * @return The arguments passed to the commands.
     * 
     */
    private @Nullable List<String> args;
    /**
     * @return The commands run by the init container.
     * 
     */
    private @Nullable List<String> commands;
    /**
     * @return The amount of CPU resources allocated to the container group.
     * 
     */
    private @Nullable Double cpu;
    /**
     * @return The structure of environmentVars.
     * 
     */
    private @Nullable List<ContainerGroupContainerEnvironmentVar> environmentVars;
    /**
     * @return The number GPUs.
     * 
     */
    private @Nullable Integer gpu;
    /**
     * @return The image of the container.
     * 
     */
    private String image;
    /**
     * @return The restart policy of the image.
     * 
     */
    private @Nullable String imagePullPolicy;
    /**
     * @return The health check of the container.
     * 
     */
    private @Nullable List<ContainerGroupContainerLivenessProbe> livenessProbes;
    /**
     * @return The amount of memory resources allocated to the container group.
     * 
     */
    private @Nullable Double memory;
    /**
     * @return The name of the volume.
     * 
     */
    private String name;
    /**
     * @return The structure of port.
     * 
     */
    private @Nullable List<ContainerGroupContainerPort> ports;
    /**
     * @return The health check of the container.
     * 
     */
    private @Nullable List<ContainerGroupContainerReadinessProbe> readinessProbes;
    private @Nullable Boolean ready;
    private @Nullable Integer restartCount;
    /**
     * @return The structure of volumeMounts.
     * 
     */
    private @Nullable List<ContainerGroupContainerVolumeMount> volumeMounts;
    /**
     * @return The working directory of the container.
     * 
     */
    private @Nullable String workingDir;

    private ContainerGroupContainer() {}
    /**
     * @return The arguments passed to the commands.
     * 
     */
    public List<String> args() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * @return The commands run by the init container.
     * 
     */
    public List<String> commands() {
        return this.commands == null ? List.of() : this.commands;
    }
    /**
     * @return The amount of CPU resources allocated to the container group.
     * 
     */
    public Optional<Double> cpu() {
        return Optional.ofNullable(this.cpu);
    }
    /**
     * @return The structure of environmentVars.
     * 
     */
    public List<ContainerGroupContainerEnvironmentVar> environmentVars() {
        return this.environmentVars == null ? List.of() : this.environmentVars;
    }
    /**
     * @return The number GPUs.
     * 
     */
    public Optional<Integer> gpu() {
        return Optional.ofNullable(this.gpu);
    }
    /**
     * @return The image of the container.
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return The restart policy of the image.
     * 
     */
    public Optional<String> imagePullPolicy() {
        return Optional.ofNullable(this.imagePullPolicy);
    }
    /**
     * @return The health check of the container.
     * 
     */
    public List<ContainerGroupContainerLivenessProbe> livenessProbes() {
        return this.livenessProbes == null ? List.of() : this.livenessProbes;
    }
    /**
     * @return The amount of memory resources allocated to the container group.
     * 
     */
    public Optional<Double> memory() {
        return Optional.ofNullable(this.memory);
    }
    /**
     * @return The name of the volume.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The structure of port.
     * 
     */
    public List<ContainerGroupContainerPort> ports() {
        return this.ports == null ? List.of() : this.ports;
    }
    /**
     * @return The health check of the container.
     * 
     */
    public List<ContainerGroupContainerReadinessProbe> readinessProbes() {
        return this.readinessProbes == null ? List.of() : this.readinessProbes;
    }
    public Optional<Boolean> ready() {
        return Optional.ofNullable(this.ready);
    }
    public Optional<Integer> restartCount() {
        return Optional.ofNullable(this.restartCount);
    }
    /**
     * @return The structure of volumeMounts.
     * 
     */
    public List<ContainerGroupContainerVolumeMount> volumeMounts() {
        return this.volumeMounts == null ? List.of() : this.volumeMounts;
    }
    /**
     * @return The working directory of the container.
     * 
     */
    public Optional<String> workingDir() {
        return Optional.ofNullable(this.workingDir);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupContainer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> args;
        private @Nullable List<String> commands;
        private @Nullable Double cpu;
        private @Nullable List<ContainerGroupContainerEnvironmentVar> environmentVars;
        private @Nullable Integer gpu;
        private String image;
        private @Nullable String imagePullPolicy;
        private @Nullable List<ContainerGroupContainerLivenessProbe> livenessProbes;
        private @Nullable Double memory;
        private String name;
        private @Nullable List<ContainerGroupContainerPort> ports;
        private @Nullable List<ContainerGroupContainerReadinessProbe> readinessProbes;
        private @Nullable Boolean ready;
        private @Nullable Integer restartCount;
        private @Nullable List<ContainerGroupContainerVolumeMount> volumeMounts;
        private @Nullable String workingDir;
        public Builder() {}
        public Builder(ContainerGroupContainer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.commands = defaults.commands;
    	      this.cpu = defaults.cpu;
    	      this.environmentVars = defaults.environmentVars;
    	      this.gpu = defaults.gpu;
    	      this.image = defaults.image;
    	      this.imagePullPolicy = defaults.imagePullPolicy;
    	      this.livenessProbes = defaults.livenessProbes;
    	      this.memory = defaults.memory;
    	      this.name = defaults.name;
    	      this.ports = defaults.ports;
    	      this.readinessProbes = defaults.readinessProbes;
    	      this.ready = defaults.ready;
    	      this.restartCount = defaults.restartCount;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        @CustomType.Setter
        public Builder args(@Nullable List<String> args) {
            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        @CustomType.Setter
        public Builder commands(@Nullable List<String> commands) {
            this.commands = commands;
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        @CustomType.Setter
        public Builder cpu(@Nullable Double cpu) {
            this.cpu = cpu;
            return this;
        }
        @CustomType.Setter
        public Builder environmentVars(@Nullable List<ContainerGroupContainerEnvironmentVar> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public Builder environmentVars(ContainerGroupContainerEnvironmentVar... environmentVars) {
            return environmentVars(List.of(environmentVars));
        }
        @CustomType.Setter
        public Builder gpu(@Nullable Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        @CustomType.Setter
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        @CustomType.Setter
        public Builder imagePullPolicy(@Nullable String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder livenessProbes(@Nullable List<ContainerGroupContainerLivenessProbe> livenessProbes) {
            this.livenessProbes = livenessProbes;
            return this;
        }
        public Builder livenessProbes(ContainerGroupContainerLivenessProbe... livenessProbes) {
            return livenessProbes(List.of(livenessProbes));
        }
        @CustomType.Setter
        public Builder memory(@Nullable Double memory) {
            this.memory = memory;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder ports(@Nullable List<ContainerGroupContainerPort> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(ContainerGroupContainerPort... ports) {
            return ports(List.of(ports));
        }
        @CustomType.Setter
        public Builder readinessProbes(@Nullable List<ContainerGroupContainerReadinessProbe> readinessProbes) {
            this.readinessProbes = readinessProbes;
            return this;
        }
        public Builder readinessProbes(ContainerGroupContainerReadinessProbe... readinessProbes) {
            return readinessProbes(List.of(readinessProbes));
        }
        @CustomType.Setter
        public Builder ready(@Nullable Boolean ready) {
            this.ready = ready;
            return this;
        }
        @CustomType.Setter
        public Builder restartCount(@Nullable Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        @CustomType.Setter
        public Builder volumeMounts(@Nullable List<ContainerGroupContainerVolumeMount> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public Builder volumeMounts(ContainerGroupContainerVolumeMount... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }
        @CustomType.Setter
        public Builder workingDir(@Nullable String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public ContainerGroupContainer build() {
            final var o = new ContainerGroupContainer();
            o.args = args;
            o.commands = commands;
            o.cpu = cpu;
            o.environmentVars = environmentVars;
            o.gpu = gpu;
            o.image = image;
            o.imagePullPolicy = imagePullPolicy;
            o.livenessProbes = livenessProbes;
            o.memory = memory;
            o.name = name;
            o.ports = ports;
            o.readinessProbes = readinessProbes;
            o.ready = ready;
            o.restartCount = restartCount;
            o.volumeMounts = volumeMounts;
            o.workingDir = workingDir;
            return o;
        }
    }
}