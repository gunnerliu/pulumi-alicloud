// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudmonitor;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cloudmonitor.ServiceMonitoringAgentProcessArgs;
import com.pulumi.alicloud.cloudmonitor.inputs.ServiceMonitoringAgentProcessState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Monitor Service Monitoring Agent Process resource.
 * 
 * For information about Cloud Monitor Service Monitoring Agent Process and how to use it, see [What is Monitoring Agent Process](https://www.alibabacloud.com/help/en/cms/developer-reference/api-cms-2019-01-01-createmonitoragentprocess).
 * 
 * &gt; **NOTE:** Available since v1.212.0.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.ecs.EcsFunctions;
 * import com.pulumi.alicloud.ecs.inputs.GetInstanceTypesArgs;
 * import com.pulumi.alicloud.ecs.inputs.GetImagesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ecs.Instance;
 * import com.pulumi.alicloud.ecs.InstanceArgs;
 * import com.pulumi.alicloud.cloudmonitor.ServiceMonitoringAgentProcess;
 * import com.pulumi.alicloud.cloudmonitor.ServiceMonitoringAgentProcessArgs;
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
 *         final var config = ctx.config();
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;terraform-example&#34;);
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableDiskCategory(&#34;cloud_efficiency&#34;)
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         final var defaultInstanceTypes = EcsFunctions.getInstanceTypes(GetInstanceTypesArgs.builder()
 *             .availabilityZone(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .instanceTypeFamily(&#34;ecs.sn1ne&#34;)
 *             .build());
 * 
 *         final var defaultImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .nameRegex(&#34;^ubuntu_[0-9]+_[0-9]+_x64*&#34;)
 *             .mostRecent(true)
 *             .owners(&#34;system&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;172.16.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock(&#34;172.16.0.0/24&#34;)
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .vswitchName(name)
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup(&#34;defaultSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(defaultSwitch.vpcId())
 *             .build());
 * 
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .imageId(defaultImages.applyValue(getImagesResult -&gt; getImagesResult.images()[0].id()))
 *             .instanceType(defaultInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.instanceTypes()[0].id()))
 *             .instanceName(name)
 *             .securityGroups(defaultSecurityGroup.stream().map(element -&gt; element.id()).collect(toList()))
 *             .internetChargeType(&#34;PayByTraffic&#34;)
 *             .internetMaxBandwidthOut(&#34;10&#34;)
 *             .availabilityZone(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .instanceChargeType(&#34;PostPaid&#34;)
 *             .systemDiskCategory(&#34;cloud_efficiency&#34;)
 *             .vswitchId(defaultSwitch.id())
 *             .build());
 * 
 *         var defaultServiceMonitoringAgentProcess = new ServiceMonitoringAgentProcess(&#34;defaultServiceMonitoringAgentProcess&#34;, ServiceMonitoringAgentProcessArgs.builder()        
 *             .instanceId(defaultInstance.id())
 *             .processName(name)
 *             .processUser(&#34;root&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud Monitor Service Monitoring Agent Process can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cloudmonitor/serviceMonitoringAgentProcess:ServiceMonitoringAgentProcess example &lt;instance_id&gt;:&lt;process_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cloudmonitor/serviceMonitoringAgentProcess:ServiceMonitoringAgentProcess")
public class ServiceMonitoringAgentProcess extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The ID of the instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The ID of the process.
     * 
     */
    @Export(name="processId", refs={String.class}, tree="[0]")
    private Output<String> processId;

    /**
     * @return The ID of the process.
     * 
     */
    public Output<String> processId() {
        return this.processId;
    }
    /**
     * The name of the process.
     * 
     */
    @Export(name="processName", refs={String.class}, tree="[0]")
    private Output<String> processName;

    /**
     * @return The name of the process.
     * 
     */
    public Output<String> processName() {
        return this.processName;
    }
    /**
     * The user who launches the process.
     * 
     */
    @Export(name="processUser", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> processUser;

    /**
     * @return The user who launches the process.
     * 
     */
    public Output<Optional<String>> processUser() {
        return Codegen.optional(this.processUser);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceMonitoringAgentProcess(String name) {
        this(name, ServiceMonitoringAgentProcessArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceMonitoringAgentProcess(String name, ServiceMonitoringAgentProcessArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceMonitoringAgentProcess(String name, ServiceMonitoringAgentProcessArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudmonitor/serviceMonitoringAgentProcess:ServiceMonitoringAgentProcess", name, args == null ? ServiceMonitoringAgentProcessArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceMonitoringAgentProcess(String name, Output<String> id, @Nullable ServiceMonitoringAgentProcessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudmonitor/serviceMonitoringAgentProcess:ServiceMonitoringAgentProcess", name, state, makeResourceOptions(options, id));
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
    public static ServiceMonitoringAgentProcess get(String name, Output<String> id, @Nullable ServiceMonitoringAgentProcessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceMonitoringAgentProcess(name, id, state, options);
    }
}
