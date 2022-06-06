// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Attaches/Detaches alb server group to a specified scaling group.
 *
 * For information about alb server group attachment, see [AttachAlbServerGroups](https://www.alibabacloud.com/help/en/doc-detail/266800.html).
 *
 * > **NOTE:** If scaling group's network type is `VPC`, the alb server groups must be in the same `VPC`.
 *
 * > **NOTE:** Alb server group attachment is defined uniquely by `scalingGroupId`, `albServerGroupId`, `port`.
 *
 * > **NOTE:** Resource `alicloud.ess.AlbServerGroupAttachment` don't support modification.
 *
 * > **NOTE:** Resource `alicloud.ess.AlbServerGroupAttachment` is available in 1.158.0+.
 *
 * ## Import
 *
 * ESS alb server groups can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ess/albServerGroupAttachment:AlbServerGroupAttachment example asg-xxx:sgp-xxx:5000
 * ```
 */
export class AlbServerGroupAttachment extends pulumi.CustomResource {
    /**
     * Get an existing AlbServerGroupAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlbServerGroupAttachmentState, opts?: pulumi.CustomResourceOptions): AlbServerGroupAttachment {
        return new AlbServerGroupAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ess/albServerGroupAttachment:AlbServerGroupAttachment';

    /**
     * Returns true if the given object is an instance of AlbServerGroupAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlbServerGroupAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlbServerGroupAttachment.__pulumiType;
    }

    /**
     * ID of Alb Server Group.
     */
    public readonly albServerGroupId!: pulumi.Output<string>;
    /**
     * If instances of scaling group are attached/removed from slb backend server when attach/detach alb
     * server group from scaling group. Default to false.
     */
    public readonly forceAttach!: pulumi.Output<boolean | undefined>;
    /**
     * - The port will be used for Alb Server Group backend server.
     */
    public readonly port!: pulumi.Output<number>;
    /**
     * ID of the scaling group.
     */
    public readonly scalingGroupId!: pulumi.Output<string>;
    /**
     * The weight of an ECS instance attached to the Alb Server Group.
     */
    public readonly weight!: pulumi.Output<number>;

    /**
     * Create a AlbServerGroupAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlbServerGroupAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlbServerGroupAttachmentArgs | AlbServerGroupAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlbServerGroupAttachmentState | undefined;
            resourceInputs["albServerGroupId"] = state ? state.albServerGroupId : undefined;
            resourceInputs["forceAttach"] = state ? state.forceAttach : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["scalingGroupId"] = state ? state.scalingGroupId : undefined;
            resourceInputs["weight"] = state ? state.weight : undefined;
        } else {
            const args = argsOrState as AlbServerGroupAttachmentArgs | undefined;
            if ((!args || args.albServerGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'albServerGroupId'");
            }
            if ((!args || args.port === undefined) && !opts.urn) {
                throw new Error("Missing required property 'port'");
            }
            if ((!args || args.scalingGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scalingGroupId'");
            }
            if ((!args || args.weight === undefined) && !opts.urn) {
                throw new Error("Missing required property 'weight'");
            }
            resourceInputs["albServerGroupId"] = args ? args.albServerGroupId : undefined;
            resourceInputs["forceAttach"] = args ? args.forceAttach : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["scalingGroupId"] = args ? args.scalingGroupId : undefined;
            resourceInputs["weight"] = args ? args.weight : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AlbServerGroupAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlbServerGroupAttachment resources.
 */
export interface AlbServerGroupAttachmentState {
    /**
     * ID of Alb Server Group.
     */
    albServerGroupId?: pulumi.Input<string>;
    /**
     * If instances of scaling group are attached/removed from slb backend server when attach/detach alb
     * server group from scaling group. Default to false.
     */
    forceAttach?: pulumi.Input<boolean>;
    /**
     * - The port will be used for Alb Server Group backend server.
     */
    port?: pulumi.Input<number>;
    /**
     * ID of the scaling group.
     */
    scalingGroupId?: pulumi.Input<string>;
    /**
     * The weight of an ECS instance attached to the Alb Server Group.
     */
    weight?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a AlbServerGroupAttachment resource.
 */
export interface AlbServerGroupAttachmentArgs {
    /**
     * ID of Alb Server Group.
     */
    albServerGroupId: pulumi.Input<string>;
    /**
     * If instances of scaling group are attached/removed from slb backend server when attach/detach alb
     * server group from scaling group. Default to false.
     */
    forceAttach?: pulumi.Input<boolean>;
    /**
     * - The port will be used for Alb Server Group backend server.
     */
    port: pulumi.Input<number>;
    /**
     * ID of the scaling group.
     */
    scalingGroupId: pulumi.Input<string>;
    /**
     * The weight of an ECS instance attached to the Alb Server Group.
     */
    weight: pulumi.Input<number>;
}