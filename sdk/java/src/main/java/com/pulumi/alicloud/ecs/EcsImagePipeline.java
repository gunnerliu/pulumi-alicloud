// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.EcsImagePipelineArgs;
import com.pulumi.alicloud.ecs.inputs.EcsImagePipelineState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ECS Image Pipeline resource.
 * 
 * For information about ECS Image Pipeline and how to use it, see [What is Image Pipeline](https://www.alibabacloud.com/help/en/doc-detail/200427.html).
 * 
 * &gt; **NOTE:** Available in v1.163.0+.
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
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetResourceGroupsArgs;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.ecs.EcsFunctions;
 * import com.pulumi.alicloud.ecs.inputs.GetImagesArgs;
 * import com.pulumi.alicloud.ecs.inputs.GetInstanceTypesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.EcsImagePipeline;
 * import com.pulumi.alicloud.ecs.EcsImagePipelineArgs;
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
 *         final var defaultResourceGroups = ResourcemanagerFunctions.getResourceGroups(GetResourceGroupsArgs.builder()
 *             .nameRegex(&#34;default&#34;)
 *             .build());
 * 
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         final var defaultImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .nameRegex(&#34;^ubuntu_[0-9]+_[0-9]+_x64*&#34;)
 *             .mostRecent(true)
 *             .owners(&#34;system&#34;)
 *             .build());
 * 
 *         final var defaultInstanceTypes = EcsFunctions.getInstanceTypes(GetInstanceTypesArgs.builder()
 *             .imageId(defaultImages.applyValue(getImagesResult -&gt; getImagesResult.ids()[0]))
 *             .build());
 * 
 *         final var defaultAccount = AlicloudFunctions.getAccount();
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(&#34;terraform-example&#34;)
 *             .cidrBlock(&#34;172.17.3.0/24&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vswitchName(&#34;terraform-example&#34;)
 *             .cidrBlock(&#34;172.17.3.0/24&#34;)
 *             .vpcId(defaultNetwork.id())
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var defaultEcsImagePipeline = new EcsImagePipeline(&#34;defaultEcsImagePipeline&#34;, EcsImagePipelineArgs.builder()        
 *             .addAccounts(defaultAccount.applyValue(getAccountResult -&gt; getAccountResult.id()))
 *             .baseImage(defaultImages.applyValue(getImagesResult -&gt; getImagesResult.ids()[0]))
 *             .baseImageType(&#34;IMAGE&#34;)
 *             .buildContent(&#34;RUN yum update -y&#34;)
 *             .deleteInstanceOnFailure(false)
 *             .imageName(&#34;terraform-example&#34;)
 *             .description(&#34;terraform-example&#34;)
 *             .instanceType(defaultInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.ids()[0]))
 *             .resourceGroupId(defaultResourceGroups.applyValue(getResourceGroupsResult -&gt; getResourceGroupsResult.groups()[0].id()))
 *             .internetMaxBandwidthOut(20)
 *             .systemDiskSize(40)
 *             .toRegionIds(            
 *                 &#34;cn-qingdao&#34;,
 *                 &#34;cn-zhangjiakou&#34;)
 *             .vswitchId(defaultSwitch.id())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Created&#34;, &#34;TF&#34;),
 *                 Map.entry(&#34;For&#34;, &#34;Acceptance-test&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ECS Image Pipeline can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecs/ecsImagePipeline:EcsImagePipeline example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/ecsImagePipeline:EcsImagePipeline")
public class EcsImagePipeline extends com.pulumi.resources.CustomResource {
    /**
     * The ID of Alibaba Cloud account to which to share the created image.
     * 
     */
    @Export(name="addAccounts", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> addAccounts;

    /**
     * @return The ID of Alibaba Cloud account to which to share the created image.
     * 
     */
    public Output<Optional<List<String>>> addAccounts() {
        return Codegen.optional(this.addAccounts);
    }
    /**
     * The source image. When you set `base_image_type` to `IMAGE`, set `base_image` to the ID of a custom image. When you set `base_image_type` to `IMAGE_FAMILY`, set `base_image` to the name of an image family.
     * 
     */
    @Export(name="baseImage", refs={String.class}, tree="[0]")
    private Output<String> baseImage;

    /**
     * @return The source image. When you set `base_image_type` to `IMAGE`, set `base_image` to the ID of a custom image. When you set `base_image_type` to `IMAGE_FAMILY`, set `base_image` to the name of an image family.
     * 
     */
    public Output<String> baseImage() {
        return this.baseImage;
    }
    /**
     * The type of the source image. Valid values: `IMAGE`, `IMAGE_FAMILY`.
     * - IMAGE: custom image.
     * - IMAGE_FAMILY: image family.
     * 
     */
    @Export(name="baseImageType", refs={String.class}, tree="[0]")
    private Output<String> baseImageType;

    /**
     * @return The type of the source image. Valid values: `IMAGE`, `IMAGE_FAMILY`.
     * - IMAGE: custom image.
     * - IMAGE_FAMILY: image family.
     * 
     */
    public Output<String> baseImageType() {
        return this.baseImageType;
    }
    /**
     * The content of the image template. The content cannot be greater than 16 KB in size, and can contain up to 127 commands.
     * 
     */
    @Export(name="buildContent", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> buildContent;

    /**
     * @return The content of the image template. The content cannot be greater than 16 KB in size, and can contain up to 127 commands.
     * 
     */
    public Output<Optional<String>> buildContent() {
        return Codegen.optional(this.buildContent);
    }
    /**
     * Specifies whether to release the intermediate instance if the image cannot be created.
     * 
     */
    @Export(name="deleteInstanceOnFailure", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> deleteInstanceOnFailure;

    /**
     * @return Specifies whether to release the intermediate instance if the image cannot be created.
     * 
     */
    public Output<Boolean> deleteInstanceOnFailure() {
        return this.deleteInstanceOnFailure;
    }
    /**
     * The description of the image template. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`. **Note:** If the intermediate instance cannot be started, the instance is released by default.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the image template. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`. **Note:** If the intermediate instance cannot be started, the instance is released by default.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name prefix of the image to be created. The prefix must be `2` to `64` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
     * 
     */
    @Export(name="imageName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> imageName;

    /**
     * @return The name prefix of the image to be created. The prefix must be `2` to `64` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
     * 
     */
    public Output<Optional<String>> imageName() {
        return Codegen.optional(this.imageName);
    }
    /**
     * The instance type of the instance. You can call the DescribeInstanceTypes operation to query instance types. If you do not specify this parameter, an instance type that provides the fewest vCPUs and memory resources is automatically selected. This configuration is subject to resource availability of instance types. For example, the `ecs.g6.large` instance type is selected by default. If available `ecs.g6.large` resources are insufficient, the `ecs.g6.xlarge` instance type is selected.
     * 
     */
    @Export(name="instanceType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceType;

    /**
     * @return The instance type of the instance. You can call the DescribeInstanceTypes operation to query instance types. If you do not specify this parameter, an instance type that provides the fewest vCPUs and memory resources is automatically selected. This configuration is subject to resource availability of instance types. For example, the `ecs.g6.large` instance type is selected by default. If available `ecs.g6.large` resources are insufficient, the `ecs.g6.xlarge` instance type is selected.
     * 
     */
    public Output<Optional<String>> instanceType() {
        return Codegen.optional(this.instanceType);
    }
    /**
     * The size of the outbound public bandwidth for the intermediate instance. Unit: `Mbit/s`. Valid values: `0` to `100`. Default value: `0`.
     * 
     */
    @Export(name="internetMaxBandwidthOut", refs={Integer.class}, tree="[0]")
    private Output<Integer> internetMaxBandwidthOut;

    /**
     * @return The size of the outbound public bandwidth for the intermediate instance. Unit: `Mbit/s`. Valid values: `0` to `100`. Default value: `0`.
     * 
     */
    public Output<Integer> internetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }
    /**
     * The name of the image template. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the image template. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The size of the system disk of the intermediate instance. Unit: GiB. Valid values: `20` to `500`. Default value: `40`.
     * 
     */
    @Export(name="systemDiskSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> systemDiskSize;

    /**
     * @return The size of the system disk of the intermediate instance. Unit: GiB. Valid values: `20` to `500`. Default value: `40`.
     * 
     */
    public Output<Integer> systemDiskSize() {
        return this.systemDiskSize;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of region to which to distribute the created image.
     * 
     */
    @Export(name="toRegionIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> toRegionIds;

    /**
     * @return The ID of region to which to distribute the created image.
     * 
     */
    public Output<Optional<List<String>>> toRegionIds() {
        return Codegen.optional(this.toRegionIds);
    }
    /**
     * The ID of the vSwitch. If you do not specify this parameter, a virtual private cloud (VPC) and a vSwitch are created by default.
     * 
     */
    @Export(name="vswitchId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vswitchId;

    /**
     * @return The ID of the vSwitch. If you do not specify this parameter, a virtual private cloud (VPC) and a vSwitch are created by default.
     * 
     */
    public Output<Optional<String>> vswitchId() {
        return Codegen.optional(this.vswitchId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EcsImagePipeline(String name) {
        this(name, EcsImagePipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EcsImagePipeline(String name, EcsImagePipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EcsImagePipeline(String name, EcsImagePipelineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsImagePipeline:EcsImagePipeline", name, args == null ? EcsImagePipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EcsImagePipeline(String name, Output<String> id, @Nullable EcsImagePipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsImagePipeline:EcsImagePipeline", name, state, makeResourceOptions(options, id));
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
    public static EcsImagePipeline get(String name, Output<String> id, @Nullable EcsImagePipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EcsImagePipeline(name, id, state, options);
    }
}
