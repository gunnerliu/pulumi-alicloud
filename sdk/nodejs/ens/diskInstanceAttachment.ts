// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ENS Disk Instance Attachment resource. Disk instance mount.
 *
 * For information about ENS Disk Instance Attachment and how to use it, see [What is Disk Instance Attachment](https://www.alibabacloud.com/help/en/).
 *
 * > **NOTE:** Available since v1.216.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const defaultDisk = new alicloud.ens.Disk("defaultDisk", {
 *     size: 20,
 *     ensRegionId: "cn-chenzhou-telecom_unicom_cmcc",
 *     paymentType: "PayAsYouGo",
 *     category: "cloud_efficiency",
 * });
 * const defaultInstance = new alicloud.ens.Instance("defaultInstance", {
 *     systemDisk: {
 *         size: 20,
 *     },
 *     imageId: "centos_6_08_64_20G_alibase_20171208",
 *     paymentType: "Subscription",
 *     instanceType: "ens.sn1.stiny",
 *     password: "12345678ABCabc",
 *     amount: 1,
 *     internetMaxBandwidthOut: 10,
 *     uniqueSuffix: true,
 *     publicIpIdentification: true,
 *     ensRegionId: "cn-chenzhou-telecom_unicom_cmcc",
 *     scheduleAreaLevel: "Region",
 *     periodUnit: "Month",
 *     period: 1,
 * });
 * const defaultDiskInstanceAttachment = new alicloud.ens.DiskInstanceAttachment("defaultDiskInstanceAttachment", {
 *     instanceId: defaultInstance.id,
 *     deleteWithInstance: "false",
 *     diskId: defaultDisk.id,
 * });
 * ```
 *
 * ## Import
 *
 * ENS Disk Instance Attachment can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ens/diskInstanceAttachment:DiskInstanceAttachment example <disk_id>:<instance_id>
 * ```
 */
export class DiskInstanceAttachment extends pulumi.CustomResource {
    /**
     * Get an existing DiskInstanceAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DiskInstanceAttachmentState, opts?: pulumi.CustomResourceOptions): DiskInstanceAttachment {
        return new DiskInstanceAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ens/diskInstanceAttachment:DiskInstanceAttachment';

    /**
     * Returns true if the given object is an instance of DiskInstanceAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DiskInstanceAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DiskInstanceAttachment.__pulumiType;
    }

    /**
     * Whether the cloud disk to be mounted is released with the instance  Value: true: When the instance is released, the cloud disk is released together with the instance. false: When the instance is released, the cloud disk is retained and is not released together with the instance. Empty means false by default.
     */
    public readonly deleteWithInstance!: pulumi.Output<string | undefined>;
    /**
     * The ID of the cloud disk to be mounted. The Cloud Disk (DiskId) and the instance (InstanceId) must be on the same node.
     */
    public readonly diskId!: pulumi.Output<string>;
    /**
     * Instance ID.
     */
    public readonly instanceId!: pulumi.Output<string>;

    /**
     * Create a DiskInstanceAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DiskInstanceAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DiskInstanceAttachmentArgs | DiskInstanceAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DiskInstanceAttachmentState | undefined;
            resourceInputs["deleteWithInstance"] = state ? state.deleteWithInstance : undefined;
            resourceInputs["diskId"] = state ? state.diskId : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
        } else {
            const args = argsOrState as DiskInstanceAttachmentArgs | undefined;
            if ((!args || args.diskId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'diskId'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            resourceInputs["deleteWithInstance"] = args ? args.deleteWithInstance : undefined;
            resourceInputs["diskId"] = args ? args.diskId : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DiskInstanceAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DiskInstanceAttachment resources.
 */
export interface DiskInstanceAttachmentState {
    /**
     * Whether the cloud disk to be mounted is released with the instance  Value: true: When the instance is released, the cloud disk is released together with the instance. false: When the instance is released, the cloud disk is retained and is not released together with the instance. Empty means false by default.
     */
    deleteWithInstance?: pulumi.Input<string>;
    /**
     * The ID of the cloud disk to be mounted. The Cloud Disk (DiskId) and the instance (InstanceId) must be on the same node.
     */
    diskId?: pulumi.Input<string>;
    /**
     * Instance ID.
     */
    instanceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DiskInstanceAttachment resource.
 */
export interface DiskInstanceAttachmentArgs {
    /**
     * Whether the cloud disk to be mounted is released with the instance  Value: true: When the instance is released, the cloud disk is released together with the instance. false: When the instance is released, the cloud disk is retained and is not released together with the instance. Empty means false by default.
     */
    deleteWithInstance?: pulumi.Input<string>;
    /**
     * The ID of the cloud disk to be mounted. The Cloud Disk (DiskId) and the instance (InstanceId) must be on the same node.
     */
    diskId: pulumi.Input<string>;
    /**
     * Instance ID.
     */
    instanceId: pulumi.Input<string>;
}
