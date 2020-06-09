// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Copies a custom image from one region to another. You can use copied images to perform operations in the target region, such as creating instances (RunInstances) and replacing system disks (ReplaceSystemDisk).
 *
 * > **NOTE:** You can only copy the custom image when it is in the Available state.
 *
 * > **NOTE:** You can only copy the image belonging to your Alibaba Cloud account. Images cannot be copied from one account to another.
 *
 * > **NOTE:** If the copying is not completed, you cannot call DeleteImage to delete the image but you can call CancelCopyImage to cancel the copying.
 *
 * > **NOTE:** Available in 1.66.0+.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultImageCopy = new alicloud.ecs.ImageCopy("default", {
 *     description: "test-image",
 *     imageName: "test-image",
 *     sourceImageId: "m-bp1gxyhdswlsn18tu***",
 *     sourceRegionId: "cn-hangzhou",
 *     tags: {
 *         FinanceDept: "FinanceDeptJoshua",
 *     },
 * });
 * ```
 */
export class ImageCopy extends pulumi.CustomResource {
    /**
     * Get an existing ImageCopy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ImageCopyState, opts?: pulumi.CustomResourceOptions): ImageCopy {
        return new ImageCopy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/imageCopy:ImageCopy';

    /**
     * Returns true if the given object is an instance of ImageCopy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ImageCopy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ImageCopy.__pulumiType;
    }

    /**
     * The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether to encrypt the image.
     */
    public readonly encrypted!: pulumi.Output<boolean | undefined>;
    /**
     * Indicates whether to force delete the custom image, Default is `false`. 
     * - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
     * - false：Verifies that the image is not currently in use by any other instances before deleting the image.
     */
    public readonly force!: pulumi.Output<boolean | undefined>;
    /**
     * The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
     */
    public readonly imageName!: pulumi.Output<string>;
    /**
     * Key ID used to encrypt the image.
     */
    public readonly kmsKeyId!: pulumi.Output<string | undefined>;
    /**
     * @deprecated Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The source image ID.
     */
    public readonly sourceImageId!: pulumi.Output<string>;
    /**
     * The ID of the region to which the source custom image belongs. You can call [DescribeRegions](https://www.alibabacloud.com/help/doc-detail/25609.htm) to view the latest regions of Alibaba Cloud.
     */
    public readonly sourceRegionId!: pulumi.Output<string>;
    /**
     * The tag value of an image. The value of N ranges from 1 to 20.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;

    /**
     * Create a ImageCopy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ImageCopyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ImageCopyArgs | ImageCopyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ImageCopyState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["encrypted"] = state ? state.encrypted : undefined;
            inputs["force"] = state ? state.force : undefined;
            inputs["imageName"] = state ? state.imageName : undefined;
            inputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["sourceImageId"] = state ? state.sourceImageId : undefined;
            inputs["sourceRegionId"] = state ? state.sourceRegionId : undefined;
            inputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as ImageCopyArgs | undefined;
            if (!args || args.sourceImageId === undefined) {
                throw new Error("Missing required property 'sourceImageId'");
            }
            if (!args || args.sourceRegionId === undefined) {
                throw new Error("Missing required property 'sourceRegionId'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["encrypted"] = args ? args.encrypted : undefined;
            inputs["force"] = args ? args.force : undefined;
            inputs["imageName"] = args ? args.imageName : undefined;
            inputs["kmsKeyId"] = args ? args.kmsKeyId : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["sourceImageId"] = args ? args.sourceImageId : undefined;
            inputs["sourceRegionId"] = args ? args.sourceRegionId : undefined;
            inputs["tags"] = args ? args.tags : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ImageCopy.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ImageCopy resources.
 */
export interface ImageCopyState {
    /**
     * The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Indicates whether to encrypt the image.
     */
    readonly encrypted?: pulumi.Input<boolean>;
    /**
     * Indicates whether to force delete the custom image, Default is `false`. 
     * - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
     * - false：Verifies that the image is not currently in use by any other instances before deleting the image.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
     */
    readonly imageName?: pulumi.Input<string>;
    /**
     * Key ID used to encrypt the image.
     */
    readonly kmsKeyId?: pulumi.Input<string>;
    /**
     * @deprecated Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The source image ID.
     */
    readonly sourceImageId?: pulumi.Input<string>;
    /**
     * The ID of the region to which the source custom image belongs. You can call [DescribeRegions](https://www.alibabacloud.com/help/doc-detail/25609.htm) to view the latest regions of Alibaba Cloud.
     */
    readonly sourceRegionId?: pulumi.Input<string>;
    /**
     * The tag value of an image. The value of N ranges from 1 to 20.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
}

/**
 * The set of arguments for constructing a ImageCopy resource.
 */
export interface ImageCopyArgs {
    /**
     * The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Indicates whether to encrypt the image.
     */
    readonly encrypted?: pulumi.Input<boolean>;
    /**
     * Indicates whether to force delete the custom image, Default is `false`. 
     * - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
     * - false：Verifies that the image is not currently in use by any other instances before deleting the image.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
     */
    readonly imageName?: pulumi.Input<string>;
    /**
     * Key ID used to encrypt the image.
     */
    readonly kmsKeyId?: pulumi.Input<string>;
    /**
     * @deprecated Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The source image ID.
     */
    readonly sourceImageId: pulumi.Input<string>;
    /**
     * The ID of the region to which the source custom image belongs. You can call [DescribeRegions](https://www.alibabacloud.com/help/doc-detail/25609.htm) to view the latest regions of Alibaba Cloud.
     */
    readonly sourceRegionId: pulumi.Input<string>;
    /**
     * The tag value of an image. The value of N ranges from 1 to 20.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
}
