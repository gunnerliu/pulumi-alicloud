// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Attaches several ECS instances to a specified scaling group or remove them from it.
 *
 * > **NOTE:** ECS instances can be attached or remove only when the scaling group is active, and it has no scaling activity in progress.
 *
 * > **NOTE:** There are two types ECS instances in a scaling group: "AutoCreated" and "Attached". The total number of them can not larger than the scaling group "MaxSize".
 *
 * > **NOTE:** Available since v1.6.0.
 *
 * ## Import
 *
 * ESS attachment can be imported using the id or scaling group id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ess/attachment:Attachment example asg-abc123456
 * ```
 */
export class Attachment extends pulumi.CustomResource {
    /**
     * Get an existing Attachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AttachmentState, opts?: pulumi.CustomResourceOptions): Attachment {
        return new Attachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ess/attachment:Attachment';

    /**
     * Returns true if the given object is an instance of Attachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Attachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Attachment.__pulumiType;
    }

    /**
     * Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
     *
     * > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.
     *
     * > **NOTE:** Restrictions on attaching ECS instances:
     *
     * - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
     * - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
     * - The attached ECS instances must in the running state.
     * - The attached ECS instances has not been attached to other scaling groups.
     * - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
     */
    public readonly force!: pulumi.Output<boolean | undefined>;
    /**
     * ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
     */
    public readonly instanceIds!: pulumi.Output<string[]>;
    /**
     * ID of the scaling group of a scaling configuration.
     */
    public readonly scalingGroupId!: pulumi.Output<string>;

    /**
     * Create a Attachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AttachmentArgs | AttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AttachmentState | undefined;
            resourceInputs["force"] = state ? state.force : undefined;
            resourceInputs["instanceIds"] = state ? state.instanceIds : undefined;
            resourceInputs["scalingGroupId"] = state ? state.scalingGroupId : undefined;
        } else {
            const args = argsOrState as AttachmentArgs | undefined;
            if ((!args || args.instanceIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceIds'");
            }
            if ((!args || args.scalingGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scalingGroupId'");
            }
            resourceInputs["force"] = args ? args.force : undefined;
            resourceInputs["instanceIds"] = args ? args.instanceIds : undefined;
            resourceInputs["scalingGroupId"] = args ? args.scalingGroupId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Attachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Attachment resources.
 */
export interface AttachmentState {
    /**
     * Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
     *
     * > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.
     *
     * > **NOTE:** Restrictions on attaching ECS instances:
     *
     * - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
     * - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
     * - The attached ECS instances must in the running state.
     * - The attached ECS instances has not been attached to other scaling groups.
     * - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
     */
    force?: pulumi.Input<boolean>;
    /**
     * ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
     */
    instanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the scaling group of a scaling configuration.
     */
    scalingGroupId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Attachment resource.
 */
export interface AttachmentArgs {
    /**
     * Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
     *
     * > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.
     *
     * > **NOTE:** Restrictions on attaching ECS instances:
     *
     * - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
     * - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
     * - The attached ECS instances must in the running state.
     * - The attached ECS instances has not been attached to other scaling groups.
     * - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
     */
    force?: pulumi.Input<boolean>;
    /**
     * ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
     */
    instanceIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the scaling group of a scaling configuration.
     */
    scalingGroupId: pulumi.Input<string>;
}
