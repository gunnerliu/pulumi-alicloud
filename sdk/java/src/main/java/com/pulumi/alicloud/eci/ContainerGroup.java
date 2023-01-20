// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.eci.ContainerGroupArgs;
import com.pulumi.alicloud.eci.inputs.ContainerGroupState;
import com.pulumi.alicloud.eci.outputs.ContainerGroupAcrRegistryInfo;
import com.pulumi.alicloud.eci.outputs.ContainerGroupContainer;
import com.pulumi.alicloud.eci.outputs.ContainerGroupDnsConfig;
import com.pulumi.alicloud.eci.outputs.ContainerGroupEciSecurityContext;
import com.pulumi.alicloud.eci.outputs.ContainerGroupHostAlias;
import com.pulumi.alicloud.eci.outputs.ContainerGroupImageRegistryCredential;
import com.pulumi.alicloud.eci.outputs.ContainerGroupInitContainer;
import com.pulumi.alicloud.eci.outputs.ContainerGroupVolume;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides ECI Container Group resource.
 * 
 * For information about ECI Container Group and how to use it, see [What is Container Group](https://www.alibabacloud.com/help/en/doc-detail/90341.htm).
 * 
 * &gt; **NOTE:** Available in v1.111.0+.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.eci.ContainerGroup;
 * import com.pulumi.alicloud.eci.ContainerGroupArgs;
 * import com.pulumi.alicloud.eci.inputs.ContainerGroupContainerArgs;
 * import com.pulumi.alicloud.eci.inputs.ContainerGroupInitContainerArgs;
 * import com.pulumi.alicloud.eci.inputs.ContainerGroupVolumeArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ContainerGroup(&#34;example&#34;, ContainerGroupArgs.builder()        
 *             .containerGroupName(&#34;tf-testacc-eci-gruop&#34;)
 *             .cpu(8)
 *             .memory(16)
 *             .restartPolicy(&#34;OnFailure&#34;)
 *             .securityGroupId(alicloud_security_group.group().id())
 *             .vswitchId(data.alicloud_vpcs().default().vpcs()[0].vswitch_ids()[0])
 *             .tags(Map.of(&#34;TF&#34;, &#34;create&#34;))
 *             .containers(            
 *                 ContainerGroupContainerArgs.builder()
 *                     .image(&#34;registry-vpc.cn-beijing.aliyuncs.com/eci_open/nginx:alpine&#34;)
 *                     .name(&#34;nginx&#34;)
 *                     .workingDir(&#34;/tmp/nginx&#34;)
 *                     .imagePullPolicy(&#34;IfNotPresent&#34;)
 *                     .commands(                    
 *                         &#34;/bin/sh&#34;,
 *                         &#34;-c&#34;,
 *                         &#34;sleep 9999&#34;)
 *                     .volumeMounts(ContainerGroupContainerVolumeMountArgs.builder()
 *                         .mountPath(&#34;/tmp/test&#34;)
 *                         .readOnly(false)
 *                         .name(&#34;empty1&#34;)
 *                         .build())
 *                     .ports(ContainerGroupContainerPortArgs.builder()
 *                         .port(80)
 *                         .protocol(&#34;TCP&#34;)
 *                         .build())
 *                     .environmentVars(ContainerGroupContainerEnvironmentVarArgs.builder()
 *                         .key(&#34;test&#34;)
 *                         .value(&#34;nginx&#34;)
 *                         .build())
 *                     .livenessProbes(ContainerGroupContainerLivenessProbeArgs.builder()
 *                         .periodSeconds(&#34;5&#34;)
 *                         .initialDelaySeconds(&#34;5&#34;)
 *                         .successThreshold(&#34;1&#34;)
 *                         .failureThreshold(&#34;3&#34;)
 *                         .timeoutSeconds(&#34;1&#34;)
 *                         .execs(ContainerGroupContainerLivenessProbeExecArgs.builder()
 *                             .commands(&#34;cat /tmp/healthy&#34;)
 *                             .build())
 *                         .build())
 *                     .readinessProbes(ContainerGroupContainerReadinessProbeArgs.builder()
 *                         .periodSeconds(&#34;5&#34;)
 *                         .initialDelaySeconds(&#34;5&#34;)
 *                         .successThreshold(&#34;1&#34;)
 *                         .failureThreshold(&#34;3&#34;)
 *                         .timeoutSeconds(&#34;1&#34;)
 *                         .execs(ContainerGroupContainerReadinessProbeExecArgs.builder()
 *                             .commands(&#34;cat /tmp/healthy&#34;)
 *                             .build())
 *                         .build())
 *                     .build(),
 *                 ContainerGroupContainerArgs.builder()
 *                     .image(&#34;registry-vpc.cn-beijing.aliyuncs.com/eci_open/centos:7&#34;)
 *                     .name(&#34;centos&#34;)
 *                     .commands(                    
 *                         &#34;/bin/sh&#34;,
 *                         &#34;-c&#34;,
 *                         &#34;sleep 9999&#34;)
 *                     .build())
 *             .initContainers(ContainerGroupInitContainerArgs.builder()
 *                 .name(&#34;init-busybox&#34;)
 *                 .image(&#34;registry-vpc.cn-beijing.aliyuncs.com/eci_open/busybox:1.30&#34;)
 *                 .imagePullPolicy(&#34;IfNotPresent&#34;)
 *                 .commands(&#34;echo&#34;)
 *                 .args(&#34;hello initcontainer&#34;)
 *                 .build())
 *             .volumes(            
 *                 ContainerGroupVolumeArgs.builder()
 *                     .name(&#34;empty1&#34;)
 *                     .type(&#34;EmptyDirVolume&#34;)
 *                     .build(),
 *                 ContainerGroupVolumeArgs.builder()
 *                     .name(&#34;empty2&#34;)
 *                     .type(&#34;EmptyDirVolume&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ECI Container Group can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:eci/containerGroup:ContainerGroup example &lt;container_group_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:eci/containerGroup:ContainerGroup")
public class ContainerGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ACR enterprise edition example properties.
     * 
     */
    @Export(name="acrRegistryInfos", type=List.class, parameters={ContainerGroupAcrRegistryInfo.class})
    private Output</* @Nullable */ List<ContainerGroupAcrRegistryInfo>> acrRegistryInfos;

    /**
     * @return The ACR enterprise edition example properties.
     * 
     */
    public Output<Optional<List<ContainerGroupAcrRegistryInfo>>> acrRegistryInfos() {
        return Codegen.optional(this.acrRegistryInfos);
    }
    /**
     * Specifies whether to automatically create an EIP and bind the EIP to the elastic container instance.
     * 
     */
    @Export(name="autoCreateEip", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoCreateEip;

    /**
     * @return Specifies whether to automatically create an EIP and bind the EIP to the elastic container instance.
     * 
     */
    public Output<Optional<Boolean>> autoCreateEip() {
        return Codegen.optional(this.autoCreateEip);
    }
    /**
     * Specifies whether to automatically match the image cache. Default value: false.
     * 
     */
    @Export(name="autoMatchImageCache", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoMatchImageCache;

    /**
     * @return Specifies whether to automatically match the image cache. Default value: false.
     * 
     */
    public Output<Optional<Boolean>> autoMatchImageCache() {
        return Codegen.optional(this.autoMatchImageCache);
    }
    /**
     * The name of the container group.
     * 
     */
    @Export(name="containerGroupName", type=String.class, parameters={})
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
    @Export(name="containers", type=List.class, parameters={ContainerGroupContainer.class})
    private Output<List<ContainerGroupContainer>> containers;

    /**
     * @return The list of containers.
     * 
     */
    public Output<List<ContainerGroupContainer>> containers() {
        return this.containers;
    }
    /**
     * The amount of CPU resources allocated to the container group.
     * 
     */
    @Export(name="cpu", type=Double.class, parameters={})
    private Output<Double> cpu;

    /**
     * @return The amount of CPU resources allocated to the container group.
     * 
     */
    public Output<Double> cpu() {
        return this.cpu;
    }
    /**
     * The structure of dnsConfig.
     * 
     */
    @Export(name="dnsConfig", type=ContainerGroupDnsConfig.class, parameters={})
    private Output</* @Nullable */ ContainerGroupDnsConfig> dnsConfig;

    /**
     * @return The structure of dnsConfig.
     * 
     */
    public Output<Optional<ContainerGroupDnsConfig>> dnsConfig() {
        return Codegen.optional(this.dnsConfig);
    }
    /**
     * The security context of the container group.
     * 
     */
    @Export(name="eciSecurityContext", type=ContainerGroupEciSecurityContext.class, parameters={})
    private Output</* @Nullable */ ContainerGroupEciSecurityContext> eciSecurityContext;

    /**
     * @return The security context of the container group.
     * 
     */
    public Output<Optional<ContainerGroupEciSecurityContext>> eciSecurityContext() {
        return Codegen.optional(this.eciSecurityContext);
    }
    /**
     * The bandwidth of the EIP. The default value is `5`.
     * 
     */
    @Export(name="eipBandwidth", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> eipBandwidth;

    /**
     * @return The bandwidth of the EIP. The default value is `5`.
     * 
     */
    public Output<Optional<Integer>> eipBandwidth() {
        return Codegen.optional(this.eipBandwidth);
    }
    /**
     * The ID of the elastic IP address (EIP).
     * 
     */
    @Export(name="eipInstanceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> eipInstanceId;

    /**
     * @return The ID of the elastic IP address (EIP).
     * 
     */
    public Output<Optional<String>> eipInstanceId() {
        return Codegen.optional(this.eipInstanceId);
    }
    /**
     * HostAliases.
     * 
     */
    @Export(name="hostAliases", type=List.class, parameters={ContainerGroupHostAlias.class})
    private Output</* @Nullable */ List<ContainerGroupHostAlias>> hostAliases;

    /**
     * @return HostAliases.
     * 
     */
    public Output<Optional<List<ContainerGroupHostAlias>>> hostAliases() {
        return Codegen.optional(this.hostAliases);
    }
    /**
     * The image registry credential. The details see Block `image_registry_credential`.
     * 
     */
    @Export(name="imageRegistryCredentials", type=List.class, parameters={ContainerGroupImageRegistryCredential.class})
    private Output</* @Nullable */ List<ContainerGroupImageRegistryCredential>> imageRegistryCredentials;

    /**
     * @return The image registry credential. The details see Block `image_registry_credential`.
     * 
     */
    public Output<Optional<List<ContainerGroupImageRegistryCredential>>> imageRegistryCredentials() {
        return Codegen.optional(this.imageRegistryCredentials);
    }
    /**
     * The list of initContainers.
     * 
     */
    @Export(name="initContainers", type=List.class, parameters={ContainerGroupInitContainer.class})
    private Output</* @Nullable */ List<ContainerGroupInitContainer>> initContainers;

    /**
     * @return The list of initContainers.
     * 
     */
    public Output<Optional<List<ContainerGroupInitContainer>>> initContainers() {
        return Codegen.optional(this.initContainers);
    }
    /**
     * The address of the self-built mirror warehouse. When creating an image cache using an image in a self-built image repository with a self-signed certificate, you need to configure this parameter to skip certificate authentication to avoid image pull failure due to certificate authentication failure.
     * 
     */
    @Export(name="insecureRegistry", type=String.class, parameters={})
    private Output</* @Nullable */ String> insecureRegistry;

    /**
     * @return The address of the self-built mirror warehouse. When creating an image cache using an image in a self-built image repository with a self-signed certificate, you need to configure this parameter to skip certificate authentication to avoid image pull failure due to certificate authentication failure.
     * 
     */
    public Output<Optional<String>> insecureRegistry() {
        return Codegen.optional(this.insecureRegistry);
    }
    /**
     * The type of the ECS instance.
     * 
     */
    @Export(name="instanceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceType;

    /**
     * @return The type of the ECS instance.
     * 
     */
    public Output<Optional<String>> instanceType() {
        return Codegen.optional(this.instanceType);
    }
    /**
     * (Available in v1.170.0+) The Public IP of the container group.
     * 
     */
    @Export(name="internetIp", type=String.class, parameters={})
    private Output<String> internetIp;

    /**
     * @return (Available in v1.170.0+) The Public IP of the container group.
     * 
     */
    public Output<String> internetIp() {
        return this.internetIp;
    }
    /**
     * (Available in v1.170.0+) The Private IP of the container group.
     * 
     */
    @Export(name="intranetIp", type=String.class, parameters={})
    private Output<String> intranetIp;

    /**
     * @return (Available in v1.170.0+) The Private IP of the container group.
     * 
     */
    public Output<String> intranetIp() {
        return this.intranetIp;
    }
    /**
     * The amount of memory resources allocated to the container group.
     * 
     */
    @Export(name="memory", type=Double.class, parameters={})
    private Output<Double> memory;

    /**
     * @return The amount of memory resources allocated to the container group.
     * 
     */
    public Output<Double> memory() {
        return this.memory;
    }
    /**
     * The address of the self-built mirror warehouse. When creating an image cache from an image in a self-built image repository using the HTTP protocol, you need to configure this parameter so that the ECI uses the HTTP protocol to pull the image to avoid image pull failure due to different protocols.
     * 
     */
    @Export(name="plainHttpRegistry", type=String.class, parameters={})
    private Output</* @Nullable */ String> plainHttpRegistry;

    /**
     * @return The address of the self-built mirror warehouse. When creating an image cache from an image in a self-built image repository using the HTTP protocol, you need to configure this parameter so that the ECI uses the HTTP protocol to pull the image to avoid image pull failure due to different protocols.
     * 
     */
    public Output<Optional<String>> plainHttpRegistry() {
        return Codegen.optional(this.plainHttpRegistry);
    }
    /**
     * The RAM role that the container group assumes. ECI and ECS share the same RAM role.
     * 
     */
    @Export(name="ramRoleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> ramRoleName;

    /**
     * @return The RAM role that the container group assumes. ECI and ECS share the same RAM role.
     * 
     */
    public Output<Optional<String>> ramRoleName() {
        return Codegen.optional(this.ramRoleName);
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The restart policy of the container group. Valid values: `Always`, `Never`, `OnFailure`.
     * 
     */
    @Export(name="restartPolicy", type=String.class, parameters={})
    private Output<String> restartPolicy;

    /**
     * @return The restart policy of the container group. Valid values: `Always`, `Never`, `OnFailure`.
     * 
     */
    public Output<String> restartPolicy() {
        return this.restartPolicy;
    }
    /**
     * The ID of the security group to which the container group belongs. Container groups within the same security group can access each other.
     * 
     */
    @Export(name="securityGroupId", type=String.class, parameters={})
    private Output<String> securityGroupId;

    /**
     * @return The ID of the security group to which the container group belongs. Container groups within the same security group can access each other.
     * 
     */
    public Output<String> securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * The status of container group.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of container group.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The list of volumes.
     * 
     */
    @Export(name="volumes", type=List.class, parameters={ContainerGroupVolume.class})
    private Output</* @Nullable */ List<ContainerGroupVolume>> volumes;

    /**
     * @return The list of volumes.
     * 
     */
    public Output<Optional<List<ContainerGroupVolume>>> volumes() {
        return Codegen.optional(this.volumes);
    }
    /**
     * The ID of the VSwitch. Currently, container groups can only be deployed in VPC networks. The number of IP addresses in the VSwitch CIDR block determines the maximum number of container groups that can be created in the VSwitch. Before you can create an ECI instance, plan the CIDR block of the VSwitch.
     * 
     */
    @Export(name="vswitchId", type=String.class, parameters={})
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
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The ID of the zone where you want to deploy the container group. If no value is specified, the system assigns a zone to the container group. By default, no value is specified.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContainerGroup(String name) {
        this(name, ContainerGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContainerGroup(String name, ContainerGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContainerGroup(String name, ContainerGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eci/containerGroup:ContainerGroup", name, args == null ? ContainerGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContainerGroup(String name, Output<String> id, @Nullable ContainerGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eci/containerGroup:ContainerGroup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ContainerGroup get(String name, Output<String> id, @Nullable ContainerGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContainerGroup(name, id, state, options);
    }
}
