// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Export a custom image to the OSS bucket in the same region as the custom image.
 *
 * > **NOTE:** If you create an ECS instance using a mirror image and create a system disk snapshot again, exporting a custom image created from the system disk snapshot is not supported.
 *
 * > **NOTE:** Support for exporting custom images that include data disk snapshot information in the image. The number of data disks cannot exceed 4 and the maximum capacity of a single data disk cannot exceed 500 GiB.
 *
 * > **NOTE:** Before exporting the image, you must authorize the cloud server ECS official service account to write OSS permissions through RAM.
 *
 * > **NOTE:** Available since v1.68.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 *
 * const defaultZones = alicloud.getZones({
 *     availableResourceCreation: "Instance",
 * });
 * const defaultInstanceTypes = alicloud.ecs.getInstanceTypes({
 *     instanceTypeFamily: "ecs.sn1ne",
 * });
 * const defaultImages = alicloud.ecs.getImages({
 *     nameRegex: "^ubuntu_[0-9]+_[0-9]+_x64*",
 *     owners: "system",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {
 *     vpcName: "terraform-example",
 *     cidrBlock: "172.17.3.0/24",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     vswitchName: "terraform-example",
 *     cidrBlock: "172.17.3.0/24",
 *     vpcId: defaultNetwork.id,
 *     zoneId: defaultZones.then(defaultZones => defaultZones.zones?.[0]?.id),
 * });
 * const defaultSecurityGroup = new alicloud.ecs.SecurityGroup("defaultSecurityGroup", {vpcId: defaultNetwork.id});
 * const defaultInstance = new alicloud.ecs.Instance("defaultInstance", {
 *     availabilityZone: defaultZones.then(defaultZones => defaultZones.zones?.[0]?.id),
 *     instanceName: "terraform-example",
 *     securityGroups: [defaultSecurityGroup.id],
 *     vswitchId: defaultSwitch.id,
 *     instanceType: defaultInstanceTypes.then(defaultInstanceTypes => defaultInstanceTypes.ids?.[0]),
 *     imageId: defaultImages.then(defaultImages => defaultImages.ids?.[0]),
 *     internetMaxBandwidthOut: 10,
 * });
 * const defaultRandomInteger = new random.RandomInteger("defaultRandomInteger", {
 *     max: 99999,
 *     min: 10000,
 * });
 * const defaultImage = new alicloud.ecs.Image("defaultImage", {
 *     instanceId: defaultInstance.id,
 *     imageName: pulumi.interpolate`terraform-example-${defaultRandomInteger.result}`,
 *     description: "terraform-example",
 * });
 * const defaultBucket = new alicloud.oss.Bucket("defaultBucket", {bucket: pulumi.interpolate`example-value-${defaultRandomInteger.result}`});
 * const defaultImageExport = new alicloud.ecs.ImageExport("defaultImageExport", {
 *     imageId: defaultImage.id,
 *     ossBucket: defaultBucket.id,
 *     ossPrefix: "ecsExport",
 * });
 * ```
 */
export class ImageExport extends pulumi.CustomResource {
    /**
     * Get an existing ImageExport resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ImageExportState, opts?: pulumi.CustomResourceOptions): ImageExport {
        return new ImageExport(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/imageExport:ImageExport';

    /**
     * Returns true if the given object is an instance of ImageExport.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ImageExport {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ImageExport.__pulumiType;
    }

    /**
     * The source image ID.
     */
    public readonly imageId!: pulumi.Output<string>;
    /**
     * Save the exported OSS bucket.
     */
    public readonly ossBucket!: pulumi.Output<string>;
    /**
     * The prefix of your OSS Object. It can be composed of numbers or letters, and the character length is 1 ~ 30.
     */
    public readonly ossPrefix!: pulumi.Output<string | undefined>;

    /**
     * Create a ImageExport resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ImageExportArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ImageExportArgs | ImageExportState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ImageExportState | undefined;
            resourceInputs["imageId"] = state ? state.imageId : undefined;
            resourceInputs["ossBucket"] = state ? state.ossBucket : undefined;
            resourceInputs["ossPrefix"] = state ? state.ossPrefix : undefined;
        } else {
            const args = argsOrState as ImageExportArgs | undefined;
            if ((!args || args.imageId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'imageId'");
            }
            if ((!args || args.ossBucket === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ossBucket'");
            }
            resourceInputs["imageId"] = args ? args.imageId : undefined;
            resourceInputs["ossBucket"] = args ? args.ossBucket : undefined;
            resourceInputs["ossPrefix"] = args ? args.ossPrefix : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ImageExport.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ImageExport resources.
 */
export interface ImageExportState {
    /**
     * The source image ID.
     */
    imageId?: pulumi.Input<string>;
    /**
     * Save the exported OSS bucket.
     */
    ossBucket?: pulumi.Input<string>;
    /**
     * The prefix of your OSS Object. It can be composed of numbers or letters, and the character length is 1 ~ 30.
     */
    ossPrefix?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ImageExport resource.
 */
export interface ImageExportArgs {
    /**
     * The source image ID.
     */
    imageId: pulumi.Input<string>;
    /**
     * Save the exported OSS bucket.
     */
    ossBucket: pulumi.Input<string>;
    /**
     * The prefix of your OSS Object. It can be composed of numbers or letters, and the character length is 1 ~ 30.
     */
    ossPrefix?: pulumi.Input<string>;
}
