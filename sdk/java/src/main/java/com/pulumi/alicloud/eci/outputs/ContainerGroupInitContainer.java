// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.alicloud.eci.outputs.ContainerGroupInitContainerEnvironmentVar;
import com.pulumi.alicloud.eci.outputs.ContainerGroupInitContainerPort;
import com.pulumi.alicloud.eci.outputs.ContainerGroupInitContainerVolumeMount;
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
public final class ContainerGroupInitContainer {
    /**
     * @return The arguments passed to the commands.
     * 
     */
    private final @Nullable List<String> args;
    /**
     * @return The commands run by the init container.
     * 
     */
    private final @Nullable List<String> commands;
    /**
     * @return The amount of CPU resources allocated to the container group.
     * 
     */
    private final @Nullable Double cpu;
    /**
     * @return The structure of environmentVars.
     * 
     */
    private final @Nullable List<ContainerGroupInitContainerEnvironmentVar> environmentVars;
    /**
     * @return The number GPUs.
     * 
     */
    private final @Nullable Integer gpu;
    /**
     * @return The image of the container.
     * 
     */
    private final @Nullable String image;
    /**
     * @return The restart policy of the image.
     * 
     */
    private final @Nullable String imagePullPolicy;
    /**
     * @return The amount of memory resources allocated to the container group.
     * 
     */
    private final @Nullable Double memory;
    /**
     * @return The name of the volume.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The structure of port.
     * 
     */
    private final @Nullable List<ContainerGroupInitContainerPort> ports;
    private final @Nullable Boolean ready;
    private final @Nullable Integer restartCount;
    /**
     * @return The structure of volumeMounts.
     * 
     */
    private final @Nullable List<ContainerGroupInitContainerVolumeMount> volumeMounts;
    /**
     * @return The working directory of the container.
     * 
     */
    private final @Nullable String workingDir;

    @CustomType.Constructor
    private ContainerGroupInitContainer(
        @CustomType.Parameter("args") @Nullable List<String> args,
        @CustomType.Parameter("commands") @Nullable List<String> commands,
        @CustomType.Parameter("cpu") @Nullable Double cpu,
        @CustomType.Parameter("environmentVars") @Nullable List<ContainerGroupInitContainerEnvironmentVar> environmentVars,
        @CustomType.Parameter("gpu") @Nullable Integer gpu,
        @CustomType.Parameter("image") @Nullable String image,
        @CustomType.Parameter("imagePullPolicy") @Nullable String imagePullPolicy,
        @CustomType.Parameter("memory") @Nullable Double memory,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("ports") @Nullable List<ContainerGroupInitContainerPort> ports,
        @CustomType.Parameter("ready") @Nullable Boolean ready,
        @CustomType.Parameter("restartCount") @Nullable Integer restartCount,
        @CustomType.Parameter("volumeMounts") @Nullable List<ContainerGroupInitContainerVolumeMount> volumeMounts,
        @CustomType.Parameter("workingDir") @Nullable String workingDir) {
        this.args = args;
        this.commands = commands;
        this.cpu = cpu;
        this.environmentVars = environmentVars;
        this.gpu = gpu;
        this.image = image;
        this.imagePullPolicy = imagePullPolicy;
        this.memory = memory;
        this.name = name;
        this.ports = ports;
        this.ready = ready;
        this.restartCount = restartCount;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

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
    public List<ContainerGroupInitContainerEnvironmentVar> environmentVars() {
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
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return The restart policy of the image.
     * 
     */
    public Optional<String> imagePullPolicy() {
        return Optional.ofNullable(this.imagePullPolicy);
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
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The structure of port.
     * 
     */
    public List<ContainerGroupInitContainerPort> ports() {
        return this.ports == null ? List.of() : this.ports;
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
    public List<ContainerGroupInitContainerVolumeMount> volumeMounts() {
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

    public static Builder builder(ContainerGroupInitContainer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> args;
        private @Nullable List<String> commands;
        private @Nullable Double cpu;
        private @Nullable List<ContainerGroupInitContainerEnvironmentVar> environmentVars;
        private @Nullable Integer gpu;
        private @Nullable String image;
        private @Nullable String imagePullPolicy;
        private @Nullable Double memory;
        private @Nullable String name;
        private @Nullable List<ContainerGroupInitContainerPort> ports;
        private @Nullable Boolean ready;
        private @Nullable Integer restartCount;
        private @Nullable List<ContainerGroupInitContainerVolumeMount> volumeMounts;
        private @Nullable String workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerGroupInitContainer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.commands = defaults.commands;
    	      this.cpu = defaults.cpu;
    	      this.environmentVars = defaults.environmentVars;
    	      this.gpu = defaults.gpu;
    	      this.image = defaults.image;
    	      this.imagePullPolicy = defaults.imagePullPolicy;
    	      this.memory = defaults.memory;
    	      this.name = defaults.name;
    	      this.ports = defaults.ports;
    	      this.ready = defaults.ready;
    	      this.restartCount = defaults.restartCount;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder commands(@Nullable List<String> commands) {
            this.commands = commands;
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        public Builder cpu(@Nullable Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder environmentVars(@Nullable List<ContainerGroupInitContainerEnvironmentVar> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public Builder environmentVars(ContainerGroupInitContainerEnvironmentVar... environmentVars) {
            return environmentVars(List.of(environmentVars));
        }
        public Builder gpu(@Nullable Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }
        public Builder imagePullPolicy(@Nullable String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public Builder memory(@Nullable Double memory) {
            this.memory = memory;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder ports(@Nullable List<ContainerGroupInitContainerPort> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(ContainerGroupInitContainerPort... ports) {
            return ports(List.of(ports));
        }
        public Builder ready(@Nullable Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Builder restartCount(@Nullable Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Builder volumeMounts(@Nullable List<ContainerGroupInitContainerVolumeMount> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public Builder volumeMounts(ContainerGroupInitContainerVolumeMount... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }
        public Builder workingDir(@Nullable String workingDir) {
            this.workingDir = workingDir;
            return this;
        }        public ContainerGroupInitContainer build() {
            return new ContainerGroupInitContainer(args, commands, cpu, environmentVars, gpu, image, imagePullPolicy, memory, name, ports, ready, restartCount, volumeMounts, workingDir);
        }
    }
}
