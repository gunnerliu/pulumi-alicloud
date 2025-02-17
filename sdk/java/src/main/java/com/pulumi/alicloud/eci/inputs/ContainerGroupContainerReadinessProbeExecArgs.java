// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerGroupContainerReadinessProbeExecArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerGroupContainerReadinessProbeExecArgs Empty = new ContainerGroupContainerReadinessProbeExecArgs();

    /**
     * Commands to be executed inside the container when performing health checks using the command line method.
     * 
     */
    @Import(name="commands")
    private @Nullable Output<List<String>> commands;

    /**
     * @return Commands to be executed inside the container when performing health checks using the command line method.
     * 
     */
    public Optional<Output<List<String>>> commands() {
        return Optional.ofNullable(this.commands);
    }

    private ContainerGroupContainerReadinessProbeExecArgs() {}

    private ContainerGroupContainerReadinessProbeExecArgs(ContainerGroupContainerReadinessProbeExecArgs $) {
        this.commands = $.commands;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerGroupContainerReadinessProbeExecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerGroupContainerReadinessProbeExecArgs $;

        public Builder() {
            $ = new ContainerGroupContainerReadinessProbeExecArgs();
        }

        public Builder(ContainerGroupContainerReadinessProbeExecArgs defaults) {
            $ = new ContainerGroupContainerReadinessProbeExecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commands Commands to be executed inside the container when performing health checks using the command line method.
         * 
         * @return builder
         * 
         */
        public Builder commands(@Nullable Output<List<String>> commands) {
            $.commands = commands;
            return this;
        }

        /**
         * @param commands Commands to be executed inside the container when performing health checks using the command line method.
         * 
         * @return builder
         * 
         */
        public Builder commands(List<String> commands) {
            return commands(Output.of(commands));
        }

        /**
         * @param commands Commands to be executed inside the container when performing health checks using the command line method.
         * 
         * @return builder
         * 
         */
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }

        public ContainerGroupContainerReadinessProbeExecArgs build() {
            return $;
        }
    }

}
