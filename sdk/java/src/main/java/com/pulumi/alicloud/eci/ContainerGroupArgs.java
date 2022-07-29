// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci;

import com.pulumi.alicloud.eci.inputs.ContainerGroupContainerArgs;
import com.pulumi.alicloud.eci.inputs.ContainerGroupDnsConfigArgs;
import com.pulumi.alicloud.eci.inputs.ContainerGroupEciSecurityContextArgs;
import com.pulumi.alicloud.eci.inputs.ContainerGroupHostAliasArgs;
import com.pulumi.alicloud.eci.inputs.ContainerGroupImageRegistryCredentialArgs;
import com.pulumi.alicloud.eci.inputs.ContainerGroupInitContainerArgs;
import com.pulumi.alicloud.eci.inputs.ContainerGroupVolumeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerGroupArgs Empty = new ContainerGroupArgs();

    /**
     * Specifies whether to automatically create an EIP and bind the EIP to the elastic container instance.
     * 
     */
    @Import(name="autoCreateEip")
    private @Nullable Output<Boolean> autoCreateEip;

    /**
     * @return Specifies whether to automatically create an EIP and bind the EIP to the elastic container instance.
     * 
     */
    public Optional<Output<Boolean>> autoCreateEip() {
        return Optional.ofNullable(this.autoCreateEip);
    }

    /**
     * Specifies whether to automatically match the image cache. Default value: false.
     * 
     */
    @Import(name="autoMatchImageCache")
    private @Nullable Output<Boolean> autoMatchImageCache;

    /**
     * @return Specifies whether to automatically match the image cache. Default value: false.
     * 
     */
    public Optional<Output<Boolean>> autoMatchImageCache() {
        return Optional.ofNullable(this.autoMatchImageCache);
    }

    /**
     * The name of the container group.
     * 
     */
    @Import(name="containerGroupName", required=true)
    private Output<String> containerGroupName;

    /**
     * @return The name of the container group.
     * 
     */
    public Output<String> containerGroupName() {
        return this.containerGroupName;
    }

    /**
     * The list of containers.
     * 
     */
    @Import(name="containers", required=true)
    private Output<List<ContainerGroupContainerArgs>> containers;

    /**
     * @return The list of containers.
     * 
     */
    public Output<List<ContainerGroupContainerArgs>> containers() {
        return this.containers;
    }

    /**
     * The amount of CPU resources allocated to the container.
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<Double> cpu;

    /**
     * @return The amount of CPU resources allocated to the container.
     * 
     */
    public Optional<Output<Double>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * The structure of dnsConfig.
     * 
     */
    @Import(name="dnsConfig")
    private @Nullable Output<ContainerGroupDnsConfigArgs> dnsConfig;

    /**
     * @return The structure of dnsConfig.
     * 
     */
    public Optional<Output<ContainerGroupDnsConfigArgs>> dnsConfig() {
        return Optional.ofNullable(this.dnsConfig);
    }

    /**
     * The security context of the container group.
     * 
     */
    @Import(name="eciSecurityContext")
    private @Nullable Output<ContainerGroupEciSecurityContextArgs> eciSecurityContext;

    /**
     * @return The security context of the container group.
     * 
     */
    public Optional<Output<ContainerGroupEciSecurityContextArgs>> eciSecurityContext() {
        return Optional.ofNullable(this.eciSecurityContext);
    }

    /**
     * The bandwidth of the EIP. The default value is `5`.
     * 
     */
    @Import(name="eipBandwidth")
    private @Nullable Output<Integer> eipBandwidth;

    /**
     * @return The bandwidth of the EIP. The default value is `5`.
     * 
     */
    public Optional<Output<Integer>> eipBandwidth() {
        return Optional.ofNullable(this.eipBandwidth);
    }

    /**
     * The ID of the elastic IP address (EIP).
     * 
     */
    @Import(name="eipInstanceId")
    private @Nullable Output<String> eipInstanceId;

    /**
     * @return The ID of the elastic IP address (EIP).
     * 
     */
    public Optional<Output<String>> eipInstanceId() {
        return Optional.ofNullable(this.eipInstanceId);
    }

    /**
     * HostAliases.
     * 
     */
    @Import(name="hostAliases")
    private @Nullable Output<List<ContainerGroupHostAliasArgs>> hostAliases;

    /**
     * @return HostAliases.
     * 
     */
    public Optional<Output<List<ContainerGroupHostAliasArgs>>> hostAliases() {
        return Optional.ofNullable(this.hostAliases);
    }

    /**
     * The image registry credential. The details see Block `image_registry_credential`.
     * 
     */
    @Import(name="imageRegistryCredentials")
    private @Nullable Output<List<ContainerGroupImageRegistryCredentialArgs>> imageRegistryCredentials;

    /**
     * @return The image registry credential. The details see Block `image_registry_credential`.
     * 
     */
    public Optional<Output<List<ContainerGroupImageRegistryCredentialArgs>>> imageRegistryCredentials() {
        return Optional.ofNullable(this.imageRegistryCredentials);
    }

    /**
     * The list of initContainers.
     * 
     */
    @Import(name="initContainers")
    private @Nullable Output<List<ContainerGroupInitContainerArgs>> initContainers;

    /**
     * @return The list of initContainers.
     * 
     */
    public Optional<Output<List<ContainerGroupInitContainerArgs>>> initContainers() {
        return Optional.ofNullable(this.initContainers);
    }

    /**
     * The address of the self-built mirror warehouse. When creating an image cache using an image in a self-built image repository with a self-signed certificate, you need to configure this parameter to skip certificate authentication to avoid image pull failure due to certificate authentication failure.
     * 
     */
    @Import(name="insecureRegistry")
    private @Nullable Output<String> insecureRegistry;

    /**
     * @return The address of the self-built mirror warehouse. When creating an image cache using an image in a self-built image repository with a self-signed certificate, you need to configure this parameter to skip certificate authentication to avoid image pull failure due to certificate authentication failure.
     * 
     */
    public Optional<Output<String>> insecureRegistry() {
        return Optional.ofNullable(this.insecureRegistry);
    }

    /**
     * The type of the ECS instance.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The type of the ECS instance.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * The amount of memory resources allocated to the container.
     * 
     */
    @Import(name="memory")
    private @Nullable Output<Double> memory;

    /**
     * @return The amount of memory resources allocated to the container.
     * 
     */
    public Optional<Output<Double>> memory() {
        return Optional.ofNullable(this.memory);
    }

    /**
     * The address of the self-built mirror warehouse. When creating an image cache from an image in a self-built image repository using the HTTP protocol, you need to configure this parameter so that the ECI uses the HTTP protocol to pull the image to avoid image pull failure due to different protocols.
     * 
     */
    @Import(name="plainHttpRegistry")
    private @Nullable Output<String> plainHttpRegistry;

    /**
     * @return The address of the self-built mirror warehouse. When creating an image cache from an image in a self-built image repository using the HTTP protocol, you need to configure this parameter so that the ECI uses the HTTP protocol to pull the image to avoid image pull failure due to different protocols.
     * 
     */
    public Optional<Output<String>> plainHttpRegistry() {
        return Optional.ofNullable(this.plainHttpRegistry);
    }

    /**
     * The RAM role that the container group assumes. ECI and ECS share the same RAM role.
     * 
     */
    @Import(name="ramRoleName")
    private @Nullable Output<String> ramRoleName;

    /**
     * @return The RAM role that the container group assumes. ECI and ECS share the same RAM role.
     * 
     */
    public Optional<Output<String>> ramRoleName() {
        return Optional.ofNullable(this.ramRoleName);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The restart policy of the container group. Valid values: `Always`, `Never`, `OnFailure`.
     * 
     */
    @Import(name="restartPolicy")
    private @Nullable Output<String> restartPolicy;

    /**
     * @return The restart policy of the container group. Valid values: `Always`, `Never`, `OnFailure`.
     * 
     */
    public Optional<Output<String>> restartPolicy() {
        return Optional.ofNullable(this.restartPolicy);
    }

    /**
     * The ID of the security group to which the container group belongs. Container groups within the same security group can access each other.
     * 
     */
    @Import(name="securityGroupId", required=true)
    private Output<String> securityGroupId;

    /**
     * @return The ID of the security group to which the container group belongs. Container groups within the same security group can access each other.
     * 
     */
    public Output<String> securityGroupId() {
        return this.securityGroupId;
    }

    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The list of volumes.
     * 
     */
    @Import(name="volumes")
    private @Nullable Output<List<ContainerGroupVolumeArgs>> volumes;

    /**
     * @return The list of volumes.
     * 
     */
    public Optional<Output<List<ContainerGroupVolumeArgs>>> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    /**
     * The ID of the VSwitch. Currently, container groups can only be deployed in VPC networks. The number of IP addresses in the VSwitch CIDR block determines the maximum number of container groups that can be created in the VSwitch. Before you can create an ECI instance, plan the CIDR block of the VSwitch.
     * 
     */
    @Import(name="vswitchId", required=true)
    private Output<String> vswitchId;

    /**
     * @return The ID of the VSwitch. Currently, container groups can only be deployed in VPC networks. The number of IP addresses in the VSwitch CIDR block determines the maximum number of container groups that can be created in the VSwitch. Before you can create an ECI instance, plan the CIDR block of the VSwitch.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     * The ID of the zone where you want to deploy the container group. If no value is specified, the system assigns a zone to the container group. By default, no value is specified.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The ID of the zone where you want to deploy the container group. If no value is specified, the system assigns a zone to the container group. By default, no value is specified.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private ContainerGroupArgs() {}

    private ContainerGroupArgs(ContainerGroupArgs $) {
        this.autoCreateEip = $.autoCreateEip;
        this.autoMatchImageCache = $.autoMatchImageCache;
        this.containerGroupName = $.containerGroupName;
        this.containers = $.containers;
        this.cpu = $.cpu;
        this.dnsConfig = $.dnsConfig;
        this.eciSecurityContext = $.eciSecurityContext;
        this.eipBandwidth = $.eipBandwidth;
        this.eipInstanceId = $.eipInstanceId;
        this.hostAliases = $.hostAliases;
        this.imageRegistryCredentials = $.imageRegistryCredentials;
        this.initContainers = $.initContainers;
        this.insecureRegistry = $.insecureRegistry;
        this.instanceType = $.instanceType;
        this.memory = $.memory;
        this.plainHttpRegistry = $.plainHttpRegistry;
        this.ramRoleName = $.ramRoleName;
        this.resourceGroupId = $.resourceGroupId;
        this.restartPolicy = $.restartPolicy;
        this.securityGroupId = $.securityGroupId;
        this.tags = $.tags;
        this.volumes = $.volumes;
        this.vswitchId = $.vswitchId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerGroupArgs $;

        public Builder() {
            $ = new ContainerGroupArgs();
        }

        public Builder(ContainerGroupArgs defaults) {
            $ = new ContainerGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoCreateEip Specifies whether to automatically create an EIP and bind the EIP to the elastic container instance.
         * 
         * @return builder
         * 
         */
        public Builder autoCreateEip(@Nullable Output<Boolean> autoCreateEip) {
            $.autoCreateEip = autoCreateEip;
            return this;
        }

        /**
         * @param autoCreateEip Specifies whether to automatically create an EIP and bind the EIP to the elastic container instance.
         * 
         * @return builder
         * 
         */
        public Builder autoCreateEip(Boolean autoCreateEip) {
            return autoCreateEip(Output.of(autoCreateEip));
        }

        /**
         * @param autoMatchImageCache Specifies whether to automatically match the image cache. Default value: false.
         * 
         * @return builder
         * 
         */
        public Builder autoMatchImageCache(@Nullable Output<Boolean> autoMatchImageCache) {
            $.autoMatchImageCache = autoMatchImageCache;
            return this;
        }

        /**
         * @param autoMatchImageCache Specifies whether to automatically match the image cache. Default value: false.
         * 
         * @return builder
         * 
         */
        public Builder autoMatchImageCache(Boolean autoMatchImageCache) {
            return autoMatchImageCache(Output.of(autoMatchImageCache));
        }

        /**
         * @param containerGroupName The name of the container group.
         * 
         * @return builder
         * 
         */
        public Builder containerGroupName(Output<String> containerGroupName) {
            $.containerGroupName = containerGroupName;
            return this;
        }

        /**
         * @param containerGroupName The name of the container group.
         * 
         * @return builder
         * 
         */
        public Builder containerGroupName(String containerGroupName) {
            return containerGroupName(Output.of(containerGroupName));
        }

        /**
         * @param containers The list of containers.
         * 
         * @return builder
         * 
         */
        public Builder containers(Output<List<ContainerGroupContainerArgs>> containers) {
            $.containers = containers;
            return this;
        }

        /**
         * @param containers The list of containers.
         * 
         * @return builder
         * 
         */
        public Builder containers(List<ContainerGroupContainerArgs> containers) {
            return containers(Output.of(containers));
        }

        /**
         * @param containers The list of containers.
         * 
         * @return builder
         * 
         */
        public Builder containers(ContainerGroupContainerArgs... containers) {
            return containers(List.of(containers));
        }

        /**
         * @param cpu The amount of CPU resources allocated to the container.
         * 
         * @return builder
         * 
         */
        public Builder cpu(@Nullable Output<Double> cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param cpu The amount of CPU resources allocated to the container.
         * 
         * @return builder
         * 
         */
        public Builder cpu(Double cpu) {
            return cpu(Output.of(cpu));
        }

        /**
         * @param dnsConfig The structure of dnsConfig.
         * 
         * @return builder
         * 
         */
        public Builder dnsConfig(@Nullable Output<ContainerGroupDnsConfigArgs> dnsConfig) {
            $.dnsConfig = dnsConfig;
            return this;
        }

        /**
         * @param dnsConfig The structure of dnsConfig.
         * 
         * @return builder
         * 
         */
        public Builder dnsConfig(ContainerGroupDnsConfigArgs dnsConfig) {
            return dnsConfig(Output.of(dnsConfig));
        }

        /**
         * @param eciSecurityContext The security context of the container group.
         * 
         * @return builder
         * 
         */
        public Builder eciSecurityContext(@Nullable Output<ContainerGroupEciSecurityContextArgs> eciSecurityContext) {
            $.eciSecurityContext = eciSecurityContext;
            return this;
        }

        /**
         * @param eciSecurityContext The security context of the container group.
         * 
         * @return builder
         * 
         */
        public Builder eciSecurityContext(ContainerGroupEciSecurityContextArgs eciSecurityContext) {
            return eciSecurityContext(Output.of(eciSecurityContext));
        }

        /**
         * @param eipBandwidth The bandwidth of the EIP. The default value is `5`.
         * 
         * @return builder
         * 
         */
        public Builder eipBandwidth(@Nullable Output<Integer> eipBandwidth) {
            $.eipBandwidth = eipBandwidth;
            return this;
        }

        /**
         * @param eipBandwidth The bandwidth of the EIP. The default value is `5`.
         * 
         * @return builder
         * 
         */
        public Builder eipBandwidth(Integer eipBandwidth) {
            return eipBandwidth(Output.of(eipBandwidth));
        }

        /**
         * @param eipInstanceId The ID of the elastic IP address (EIP).
         * 
         * @return builder
         * 
         */
        public Builder eipInstanceId(@Nullable Output<String> eipInstanceId) {
            $.eipInstanceId = eipInstanceId;
            return this;
        }

        /**
         * @param eipInstanceId The ID of the elastic IP address (EIP).
         * 
         * @return builder
         * 
         */
        public Builder eipInstanceId(String eipInstanceId) {
            return eipInstanceId(Output.of(eipInstanceId));
        }

        /**
         * @param hostAliases HostAliases.
         * 
         * @return builder
         * 
         */
        public Builder hostAliases(@Nullable Output<List<ContainerGroupHostAliasArgs>> hostAliases) {
            $.hostAliases = hostAliases;
            return this;
        }

        /**
         * @param hostAliases HostAliases.
         * 
         * @return builder
         * 
         */
        public Builder hostAliases(List<ContainerGroupHostAliasArgs> hostAliases) {
            return hostAliases(Output.of(hostAliases));
        }

        /**
         * @param hostAliases HostAliases.
         * 
         * @return builder
         * 
         */
        public Builder hostAliases(ContainerGroupHostAliasArgs... hostAliases) {
            return hostAliases(List.of(hostAliases));
        }

        /**
         * @param imageRegistryCredentials The image registry credential. The details see Block `image_registry_credential`.
         * 
         * @return builder
         * 
         */
        public Builder imageRegistryCredentials(@Nullable Output<List<ContainerGroupImageRegistryCredentialArgs>> imageRegistryCredentials) {
            $.imageRegistryCredentials = imageRegistryCredentials;
            return this;
        }

        /**
         * @param imageRegistryCredentials The image registry credential. The details see Block `image_registry_credential`.
         * 
         * @return builder
         * 
         */
        public Builder imageRegistryCredentials(List<ContainerGroupImageRegistryCredentialArgs> imageRegistryCredentials) {
            return imageRegistryCredentials(Output.of(imageRegistryCredentials));
        }

        /**
         * @param imageRegistryCredentials The image registry credential. The details see Block `image_registry_credential`.
         * 
         * @return builder
         * 
         */
        public Builder imageRegistryCredentials(ContainerGroupImageRegistryCredentialArgs... imageRegistryCredentials) {
            return imageRegistryCredentials(List.of(imageRegistryCredentials));
        }

        /**
         * @param initContainers The list of initContainers.
         * 
         * @return builder
         * 
         */
        public Builder initContainers(@Nullable Output<List<ContainerGroupInitContainerArgs>> initContainers) {
            $.initContainers = initContainers;
            return this;
        }

        /**
         * @param initContainers The list of initContainers.
         * 
         * @return builder
         * 
         */
        public Builder initContainers(List<ContainerGroupInitContainerArgs> initContainers) {
            return initContainers(Output.of(initContainers));
        }

        /**
         * @param initContainers The list of initContainers.
         * 
         * @return builder
         * 
         */
        public Builder initContainers(ContainerGroupInitContainerArgs... initContainers) {
            return initContainers(List.of(initContainers));
        }

        /**
         * @param insecureRegistry The address of the self-built mirror warehouse. When creating an image cache using an image in a self-built image repository with a self-signed certificate, you need to configure this parameter to skip certificate authentication to avoid image pull failure due to certificate authentication failure.
         * 
         * @return builder
         * 
         */
        public Builder insecureRegistry(@Nullable Output<String> insecureRegistry) {
            $.insecureRegistry = insecureRegistry;
            return this;
        }

        /**
         * @param insecureRegistry The address of the self-built mirror warehouse. When creating an image cache using an image in a self-built image repository with a self-signed certificate, you need to configure this parameter to skip certificate authentication to avoid image pull failure due to certificate authentication failure.
         * 
         * @return builder
         * 
         */
        public Builder insecureRegistry(String insecureRegistry) {
            return insecureRegistry(Output.of(insecureRegistry));
        }

        /**
         * @param instanceType The type of the ECS instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The type of the ECS instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param memory The amount of memory resources allocated to the container.
         * 
         * @return builder
         * 
         */
        public Builder memory(@Nullable Output<Double> memory) {
            $.memory = memory;
            return this;
        }

        /**
         * @param memory The amount of memory resources allocated to the container.
         * 
         * @return builder
         * 
         */
        public Builder memory(Double memory) {
            return memory(Output.of(memory));
        }

        /**
         * @param plainHttpRegistry The address of the self-built mirror warehouse. When creating an image cache from an image in a self-built image repository using the HTTP protocol, you need to configure this parameter so that the ECI uses the HTTP protocol to pull the image to avoid image pull failure due to different protocols.
         * 
         * @return builder
         * 
         */
        public Builder plainHttpRegistry(@Nullable Output<String> plainHttpRegistry) {
            $.plainHttpRegistry = plainHttpRegistry;
            return this;
        }

        /**
         * @param plainHttpRegistry The address of the self-built mirror warehouse. When creating an image cache from an image in a self-built image repository using the HTTP protocol, you need to configure this parameter so that the ECI uses the HTTP protocol to pull the image to avoid image pull failure due to different protocols.
         * 
         * @return builder
         * 
         */
        public Builder plainHttpRegistry(String plainHttpRegistry) {
            return plainHttpRegistry(Output.of(plainHttpRegistry));
        }

        /**
         * @param ramRoleName The RAM role that the container group assumes. ECI and ECS share the same RAM role.
         * 
         * @return builder
         * 
         */
        public Builder ramRoleName(@Nullable Output<String> ramRoleName) {
            $.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * @param ramRoleName The RAM role that the container group assumes. ECI and ECS share the same RAM role.
         * 
         * @return builder
         * 
         */
        public Builder ramRoleName(String ramRoleName) {
            return ramRoleName(Output.of(ramRoleName));
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param restartPolicy The restart policy of the container group. Valid values: `Always`, `Never`, `OnFailure`.
         * 
         * @return builder
         * 
         */
        public Builder restartPolicy(@Nullable Output<String> restartPolicy) {
            $.restartPolicy = restartPolicy;
            return this;
        }

        /**
         * @param restartPolicy The restart policy of the container group. Valid values: `Always`, `Never`, `OnFailure`.
         * 
         * @return builder
         * 
         */
        public Builder restartPolicy(String restartPolicy) {
            return restartPolicy(Output.of(restartPolicy));
        }

        /**
         * @param securityGroupId The ID of the security group to which the container group belongs. Container groups within the same security group can access each other.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * @param securityGroupId The ID of the security group to which the container group belongs. Container groups within the same security group can access each other.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
         * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
         * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param volumes The list of volumes.
         * 
         * @return builder
         * 
         */
        public Builder volumes(@Nullable Output<List<ContainerGroupVolumeArgs>> volumes) {
            $.volumes = volumes;
            return this;
        }

        /**
         * @param volumes The list of volumes.
         * 
         * @return builder
         * 
         */
        public Builder volumes(List<ContainerGroupVolumeArgs> volumes) {
            return volumes(Output.of(volumes));
        }

        /**
         * @param volumes The list of volumes.
         * 
         * @return builder
         * 
         */
        public Builder volumes(ContainerGroupVolumeArgs... volumes) {
            return volumes(List.of(volumes));
        }

        /**
         * @param vswitchId The ID of the VSwitch. Currently, container groups can only be deployed in VPC networks. The number of IP addresses in the VSwitch CIDR block determines the maximum number of container groups that can be created in the VSwitch. Before you can create an ECI instance, plan the CIDR block of the VSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The ID of the VSwitch. Currently, container groups can only be deployed in VPC networks. The number of IP addresses in the VSwitch CIDR block determines the maximum number of container groups that can be created in the VSwitch. Before you can create an ECI instance, plan the CIDR block of the VSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        /**
         * @param zoneId The ID of the zone where you want to deploy the container group. If no value is specified, the system assigns a zone to the container group. By default, no value is specified.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The ID of the zone where you want to deploy the container group. If no value is specified, the system assigns a zone to the container group. By default, no value is specified.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ContainerGroupArgs build() {
            $.containerGroupName = Objects.requireNonNull($.containerGroupName, "expected parameter 'containerGroupName' to be non-null");
            $.containers = Objects.requireNonNull($.containers, "expected parameter 'containers' to be non-null");
            $.securityGroupId = Objects.requireNonNull($.securityGroupId, "expected parameter 'securityGroupId' to be non-null");
            $.vswitchId = Objects.requireNonNull($.vswitchId, "expected parameter 'vswitchId' to be non-null");
            return $;
        }
    }

}
