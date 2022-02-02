// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Import a copy of your local on-premise file to ECS, and appear as a custom replacement in the corresponding domain.
 *
 * > **NOTE:** You must upload the image file to the object storage OSS in advance.
 *
 * > **NOTE:** The region where the image is imported must be the same region as the OSS bucket where the image file is uploaded.
 *
 * > **NOTE:** Available in 1.69.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const thisImageImport = new alicloud.ecs.ImageImport("this", {
 *     architecture: "x86_64",
 *     description: "test import image",
 *     diskDeviceMappings: [{
 *         diskImageSize: 5,
 *         ossBucket: "testimportimage",
 *         ossObject: "root.img",
 *     }],
 *     imageName: "test-import-image",
 *     licenseType: "Auto",
 *     osType: "linux",
 *     platform: "Ubuntu",
 * });
 * ```
 * ## Attributes Reference0
 *
 *  The following attributes are exported:
 *
 * * `id` - ID of the image.
 *
 * ## Import
 *
 * image can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ecs/imageImport:ImageImport default m-uf66871ape***yg1q***
 * ```
 */
export class ImageImport extends pulumi.CustomResource {
    /**
     * Get an existing ImageImport resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ImageImportState, opts?: pulumi.CustomResourceOptions): ImageImport {
        return new ImageImport(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/imageImport:ImageImport';

    /**
     * Returns true if the given object is an instance of ImageImport.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ImageImport {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ImageImport.__pulumiType;
    }

    /**
     * Specifies the architecture of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `i386` , Default is `x8664`.
     */
    public readonly architecture!: pulumi.Output<string | undefined>;
    /**
     * Description of the image. The length is 2 to 256 English or Chinese characters, and cannot begin with http: // and https: //.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Description of the system with disks and snapshots under the image.
     */
    public readonly diskDeviceMappings!: pulumi.Output<outputs.ecs.ImageImportDiskDeviceMapping[]>;
    /**
     * The image name. The length is 2 ~ 128 English or Chinese characters. Must start with a english letter or Chinese, and cannot start with http: // and https: //. Can contain numbers, colons (:), underscores (_), or hyphens (-).
     */
    public readonly imageName!: pulumi.Output<string | undefined>;
    /**
     * The type of the license used to activate the operating system after the image is imported. Default value: `Auto`. Valid values: `Auto`,`Aliyun`,`BYOL`.
     */
    public readonly licenseType!: pulumi.Output<string | undefined>;
    /**
     * Operating system platform type. Valid values: `windows`, Default is `linux`.
     */
    public readonly osType!: pulumi.Output<string | undefined>;
    /**
     * Specifies the operating system platform of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `CentOS`, `Ubuntu`, `SUSE`, `OpenSUSE`, `Debian`, `CoreOS`, `Windows Server 2003`, `Windows Server 2008`, `Windows Server 2012`, `Windows 7`, Default is `Others Linux`, `Customized Linux`.
     */
    public readonly platform!: pulumi.Output<string | undefined>;

    /**
     * Create a ImageImport resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ImageImportArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ImageImportArgs | ImageImportState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ImageImportState | undefined;
            resourceInputs["architecture"] = state ? state.architecture : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["diskDeviceMappings"] = state ? state.diskDeviceMappings : undefined;
            resourceInputs["imageName"] = state ? state.imageName : undefined;
            resourceInputs["licenseType"] = state ? state.licenseType : undefined;
            resourceInputs["osType"] = state ? state.osType : undefined;
            resourceInputs["platform"] = state ? state.platform : undefined;
        } else {
            const args = argsOrState as ImageImportArgs | undefined;
            if ((!args || args.diskDeviceMappings === undefined) && !opts.urn) {
                throw new Error("Missing required property 'diskDeviceMappings'");
            }
            resourceInputs["architecture"] = args ? args.architecture : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["diskDeviceMappings"] = args ? args.diskDeviceMappings : undefined;
            resourceInputs["imageName"] = args ? args.imageName : undefined;
            resourceInputs["licenseType"] = args ? args.licenseType : undefined;
            resourceInputs["osType"] = args ? args.osType : undefined;
            resourceInputs["platform"] = args ? args.platform : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ImageImport.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ImageImport resources.
 */
export interface ImageImportState {
    /**
     * Specifies the architecture of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `i386` , Default is `x8664`.
     */
    architecture?: pulumi.Input<string>;
    /**
     * Description of the image. The length is 2 to 256 English or Chinese characters, and cannot begin with http: // and https: //.
     */
    description?: pulumi.Input<string>;
    /**
     * Description of the system with disks and snapshots under the image.
     */
    diskDeviceMappings?: pulumi.Input<pulumi.Input<inputs.ecs.ImageImportDiskDeviceMapping>[]>;
    /**
     * The image name. The length is 2 ~ 128 English or Chinese characters. Must start with a english letter or Chinese, and cannot start with http: // and https: //. Can contain numbers, colons (:), underscores (_), or hyphens (-).
     */
    imageName?: pulumi.Input<string>;
    /**
     * The type of the license used to activate the operating system after the image is imported. Default value: `Auto`. Valid values: `Auto`,`Aliyun`,`BYOL`.
     */
    licenseType?: pulumi.Input<string>;
    /**
     * Operating system platform type. Valid values: `windows`, Default is `linux`.
     */
    osType?: pulumi.Input<string>;
    /**
     * Specifies the operating system platform of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `CentOS`, `Ubuntu`, `SUSE`, `OpenSUSE`, `Debian`, `CoreOS`, `Windows Server 2003`, `Windows Server 2008`, `Windows Server 2012`, `Windows 7`, Default is `Others Linux`, `Customized Linux`.
     */
    platform?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ImageImport resource.
 */
export interface ImageImportArgs {
    /**
     * Specifies the architecture of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `i386` , Default is `x8664`.
     */
    architecture?: pulumi.Input<string>;
    /**
     * Description of the image. The length is 2 to 256 English or Chinese characters, and cannot begin with http: // and https: //.
     */
    description?: pulumi.Input<string>;
    /**
     * Description of the system with disks and snapshots under the image.
     */
    diskDeviceMappings: pulumi.Input<pulumi.Input<inputs.ecs.ImageImportDiskDeviceMapping>[]>;
    /**
     * The image name. The length is 2 ~ 128 English or Chinese characters. Must start with a english letter or Chinese, and cannot start with http: // and https: //. Can contain numbers, colons (:), underscores (_), or hyphens (-).
     */
    imageName?: pulumi.Input<string>;
    /**
     * The type of the license used to activate the operating system after the image is imported. Default value: `Auto`. Valid values: `Auto`,`Aliyun`,`BYOL`.
     */
    licenseType?: pulumi.Input<string>;
    /**
     * Operating system platform type. Valid values: `windows`, Default is `linux`.
     */
    osType?: pulumi.Input<string>;
    /**
     * Specifies the operating system platform of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `CentOS`, `Ubuntu`, `SUSE`, `OpenSUSE`, `Debian`, `CoreOS`, `Windows Server 2003`, `Windows Server 2008`, `Windows Server 2012`, `Windows 7`, Default is `Others Linux`, `Customized Linux`.
     */
    platform?: pulumi.Input<string>;
}
