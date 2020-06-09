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
 * > **NOTE:** Available in 1.68.0+.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultImageExport = new alicloud.ecs.ImageExport("default", {
 *     imageId: "m-bp1gxy***",
 *     ossBucket: "ecsimageexportconfig",
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ImageExportState | undefined;
            inputs["imageId"] = state ? state.imageId : undefined;
            inputs["ossBucket"] = state ? state.ossBucket : undefined;
            inputs["ossPrefix"] = state ? state.ossPrefix : undefined;
        } else {
            const args = argsOrState as ImageExportArgs | undefined;
            if (!args || args.imageId === undefined) {
                throw new Error("Missing required property 'imageId'");
            }
            if (!args || args.ossBucket === undefined) {
                throw new Error("Missing required property 'ossBucket'");
            }
            inputs["imageId"] = args ? args.imageId : undefined;
            inputs["ossBucket"] = args ? args.ossBucket : undefined;
            inputs["ossPrefix"] = args ? args.ossPrefix : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ImageExport.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ImageExport resources.
 */
export interface ImageExportState {
    /**
     * The source image ID.
     */
    readonly imageId?: pulumi.Input<string>;
    /**
     * Save the exported OSS bucket.
     */
    readonly ossBucket?: pulumi.Input<string>;
    /**
     * The prefix of your OSS Object. It can be composed of numbers or letters, and the character length is 1 ~ 30.
     */
    readonly ossPrefix?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ImageExport resource.
 */
export interface ImageExportArgs {
    /**
     * The source image ID.
     */
    readonly imageId: pulumi.Input<string>;
    /**
     * Save the exported OSS bucket.
     */
    readonly ossBucket: pulumi.Input<string>;
    /**
     * The prefix of your OSS Object. It can be composed of numbers or letters, and the character length is 1 ~ 30.
     */
    readonly ossPrefix?: pulumi.Input<string>;
}
