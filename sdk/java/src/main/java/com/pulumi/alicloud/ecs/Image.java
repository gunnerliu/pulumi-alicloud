// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.ImageArgs;
import com.pulumi.alicloud.ecs.inputs.ImageState;
import com.pulumi.alicloud.ecs.outputs.ImageDiskDeviceMapping;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a custom image. You can then use a custom image to create ECS instances (RunInstances) or change the system disk for an existing instance (ReplaceSystemDisk).
 * 
 * &gt; **NOTE:**  If you want to create a template from an ECS instance, you can specify the instance ID (InstanceId) to create a custom image. You must make sure that the status of the specified instance is Running or Stopped. After a successful invocation, each disk of the specified instance has a new snapshot created.
 * 
 * &gt; **NOTE:**  If you want to create a custom image based on the system disk of your ECS instance, you can specify one of the system disk snapshots (SnapshotId) to create a custom image. However, the specified snapshot cannot be created on or before July 15, 2013.
 * 
 * &gt; **NOTE:**  If you want to combine snapshots of multiple disks into an image template, you can specify DiskDeviceMapping to create a custom image.
 * 
 * &gt; **NOTE:**  Available in 1.64.0+
 * 
 * ## Example Usage
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
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetResourceGroupsArgs;
 * import com.pulumi.alicloud.ecs.Image;
 * import com.pulumi.alicloud.ecs.ImageArgs;
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
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;Instance&#34;)
 *             .build());
 * 
 *         final var defaultInstanceTypes = EcsFunctions.getInstanceTypes(GetInstanceTypesArgs.builder()
 *             .instanceTypeFamily(&#34;ecs.sn1ne&#34;)
 *             .build());
 * 
 *         final var defaultImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .nameRegex(&#34;^ubuntu_[0-9]+_[0-9]+_x64*&#34;)
 *             .owners(&#34;system&#34;)
 *             .build());
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
 *         var defaultSecurityGroup = new SecurityGroup(&#34;defaultSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .availabilityZone(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .instanceName(&#34;terraform-example&#34;)
 *             .securityGroups(defaultSecurityGroup.id())
 *             .vswitchId(defaultSwitch.id())
 *             .instanceType(defaultInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.ids()[0]))
 *             .imageId(defaultImages.applyValue(getImagesResult -&gt; getImagesResult.ids()[0]))
 *             .internetMaxBandwidthOut(10)
 *             .build());
 * 
 *         final var defaultResourceGroups = ResourcemanagerFunctions.getResourceGroups();
 * 
 *         var defaultImage = new Image(&#34;defaultImage&#34;, ImageArgs.builder()        
 *             .instanceId(defaultInstance.id())
 *             .imageName(&#34;terraform-example&#34;)
 *             .description(&#34;terraform-example&#34;)
 *             .architecture(&#34;x86_64&#34;)
 *             .platform(&#34;CentOS&#34;)
 *             .resourceGroupId(defaultResourceGroups.applyValue(getResourceGroupsResult -&gt; getResourceGroupsResult.ids()[0]))
 *             .tags(Map.of(&#34;FinanceDept&#34;, &#34;FinanceDeptJoshua&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 *  image can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecs/image:Image default m-uf66871ape***yg1q***
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/image:Image")
public class Image extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the architecture of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `i386` , Default is `x86_64`.
     * 
     */
    @Export(name="architecture", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> architecture;

    /**
     * @return Specifies the architecture of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `i386` , Default is `x86_64`.
     * 
     */
    public Output<Optional<String>> architecture() {
        return Codegen.optional(this.architecture);
    }
    @Export(name="deleteAutoSnapshot", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deleteAutoSnapshot;

    public Output<Optional<Boolean>> deleteAutoSnapshot() {
        return Codegen.optional(this.deleteAutoSnapshot);
    }
    /**
     * The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Description of the system with disks and snapshots under the image.
     * 
     */
    @Export(name="diskDeviceMappings", refs={List.class,ImageDiskDeviceMapping.class}, tree="[0,1]")
    private Output<List<ImageDiskDeviceMapping>> diskDeviceMappings;

    /**
     * @return Description of the system with disks and snapshots under the image.
     * 
     */
    public Output<List<ImageDiskDeviceMapping>> diskDeviceMappings() {
        return this.diskDeviceMappings;
    }
    /**
     * Indicates whether to force delete the custom image, Default is `false`.
     * - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
     * - false：Verifies that the image is not currently in use by any other instances before deleting the image.
     * 
     */
    @Export(name="force", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> force;

    /**
     * @return Indicates whether to force delete the custom image, Default is `false`.
     * - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
     * - false：Verifies that the image is not currently in use by any other instances before deleting the image.
     * 
     */
    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
     * 
     */
    @Export(name="imageName", refs={String.class}, tree="[0]")
    private Output<String> imageName;

    /**
     * @return The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
     * 
     */
    public Output<String> imageName() {
        return this.imageName;
    }
    /**
     * The instance ID.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceId;

    /**
     * @return The instance ID.
     * 
     */
    public Output<Optional<String>> instanceId() {
        return Codegen.optional(this.instanceId);
    }
    /**
     * @deprecated
     * Attribute &#39;name&#39; has been deprecated from version 1.69.0. Use `image_name` instead.
     * 
     */
    @Deprecated /* Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead. */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * The distribution of the operating system for the system disk in the custom image.
     * If you specify a data disk snapshot to create the system disk of the custom image, you must use the Platform parameter
     * to specify the distribution of the operating system for the system disk. Default value: Others Linux.
     * More valid values refer to [CreateImage OpenAPI](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/createimage)
     * **NOTE**: It&#39;s default value is Ubuntu before version 1.197.0.
     * 
     */
    @Export(name="platform", refs={String.class}, tree="[0]")
    private Output<String> platform;

    /**
     * @return The distribution of the operating system for the system disk in the custom image.
     * If you specify a data disk snapshot to create the system disk of the custom image, you must use the Platform parameter
     * to specify the distribution of the operating system for the system disk. Default value: Others Linux.
     * More valid values refer to [CreateImage OpenAPI](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/createimage)
     * **NOTE**: It&#39;s default value is Ubuntu before version 1.197.0.
     * 
     */
    public Output<String> platform() {
        return this.platform;
    }
    /**
     * The ID of the enterprise resource group to which a custom image belongs
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resourceGroupId;

    /**
     * @return The ID of the enterprise resource group to which a custom image belongs
     * 
     */
    public Output<Optional<String>> resourceGroupId() {
        return Codegen.optional(this.resourceGroupId);
    }
    /**
     * Specifies a snapshot that is used to create a combined custom image.
     * 
     */
    @Export(name="snapshotId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> snapshotId;

    /**
     * @return Specifies a snapshot that is used to create a combined custom image.
     * 
     */
    public Output<Optional<String>> snapshotId() {
        return Codegen.optional(this.snapshotId);
    }
    /**
     * The tag value of an image. The value of N ranges from 1 to 20.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return The tag value of an image. The value of N ranges from 1 to 20.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Image(String name) {
        this(name, ImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Image(String name, @Nullable ImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Image(String name, @Nullable ImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/image:Image", name, args == null ? ImageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Image(String name, Output<String> id, @Nullable ImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/image:Image", name, state, makeResourceOptions(options, id));
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
    public static Image get(String name, Output<String> id, @Nullable ImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Image(name, id, state, options);
    }
}
