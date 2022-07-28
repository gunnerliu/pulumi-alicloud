// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.inputs;

import com.pulumi.alicloud.eci.inputs.ContainerGroupEciSecurityContextSysctlArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerGroupEciSecurityContextArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerGroupEciSecurityContextArgs Empty = new ContainerGroupEciSecurityContextArgs();

    /**
     * system.
     * 
     */
    @Import(name="sysctls")
    private @Nullable Output<List<ContainerGroupEciSecurityContextSysctlArgs>> sysctls;

    /**
     * @return system.
     * 
     */
    public Optional<Output<List<ContainerGroupEciSecurityContextSysctlArgs>>> sysctls() {
        return Optional.ofNullable(this.sysctls);
    }

    private ContainerGroupEciSecurityContextArgs() {}

    private ContainerGroupEciSecurityContextArgs(ContainerGroupEciSecurityContextArgs $) {
        this.sysctls = $.sysctls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerGroupEciSecurityContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerGroupEciSecurityContextArgs $;

        public Builder() {
            $ = new ContainerGroupEciSecurityContextArgs();
        }

        public Builder(ContainerGroupEciSecurityContextArgs defaults) {
            $ = new ContainerGroupEciSecurityContextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sysctls system.
         * 
         * @return builder
         * 
         */
        public Builder sysctls(@Nullable Output<List<ContainerGroupEciSecurityContextSysctlArgs>> sysctls) {
            $.sysctls = sysctls;
            return this;
        }

        /**
         * @param sysctls system.
         * 
         * @return builder
         * 
         */
        public Builder sysctls(List<ContainerGroupEciSecurityContextSysctlArgs> sysctls) {
            return sysctls(Output.of(sysctls));
        }

        /**
         * @param sysctls system.
         * 
         * @return builder
         * 
         */
        public Builder sysctls(ContainerGroupEciSecurityContextSysctlArgs... sysctls) {
            return sysctls(List.of(sysctls));
        }

        public ContainerGroupEciSecurityContextArgs build() {
            return $;
        }
    }

}
