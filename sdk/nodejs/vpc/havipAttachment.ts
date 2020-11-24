// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * The havip attachemnt can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:vpc/hAVipAttachment:HAVipAttachment foo havip-abc123456:i-abc123456
 * ```
 */
export class HAVipAttachment extends pulumi.CustomResource {
    /**
     * Get an existing HAVipAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HAVipAttachmentState, opts?: pulumi.CustomResourceOptions): HAVipAttachment {
        return new HAVipAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/hAVipAttachment:HAVipAttachment';

    /**
     * Returns true if the given object is an instance of HAVipAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is HAVipAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === HAVipAttachment.__pulumiType;
    }

    /**
     * The havipId of the havip attachment, the field can't be changed.
     */
    public readonly havipId!: pulumi.Output<string>;
    /**
     * The instanceId of the havip attachment, the field can't be changed.
     */
    public readonly instanceId!: pulumi.Output<string>;

    /**
     * Create a HAVipAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HAVipAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HAVipAttachmentArgs | HAVipAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as HAVipAttachmentState | undefined;
            inputs["havipId"] = state ? state.havipId : undefined;
            inputs["instanceId"] = state ? state.instanceId : undefined;
        } else {
            const args = argsOrState as HAVipAttachmentArgs | undefined;
            if (!args || args.havipId === undefined) {
                throw new Error("Missing required property 'havipId'");
            }
            if (!args || args.instanceId === undefined) {
                throw new Error("Missing required property 'instanceId'");
            }
            inputs["havipId"] = args ? args.havipId : undefined;
            inputs["instanceId"] = args ? args.instanceId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(HAVipAttachment.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering HAVipAttachment resources.
 */
export interface HAVipAttachmentState {
    /**
     * The havipId of the havip attachment, the field can't be changed.
     */
    readonly havipId?: pulumi.Input<string>;
    /**
     * The instanceId of the havip attachment, the field can't be changed.
     */
    readonly instanceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a HAVipAttachment resource.
 */
export interface HAVipAttachmentArgs {
    /**
     * The havipId of the havip attachment, the field can't be changed.
     */
    readonly havipId: pulumi.Input<string>;
    /**
     * The instanceId of the havip attachment, the field can't be changed.
     */
    readonly instanceId: pulumi.Input<string>;
}
