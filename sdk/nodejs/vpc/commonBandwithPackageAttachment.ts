// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * The common bandwidth package attachment can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:vpc/commonBandwithPackageAttachment:CommonBandwithPackageAttachment foo cbwp-abc123456:eip-abc123456
 * ```
 */
export class CommonBandwithPackageAttachment extends pulumi.CustomResource {
    /**
     * Get an existing CommonBandwithPackageAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CommonBandwithPackageAttachmentState, opts?: pulumi.CustomResourceOptions): CommonBandwithPackageAttachment {
        return new CommonBandwithPackageAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/commonBandwithPackageAttachment:CommonBandwithPackageAttachment';

    /**
     * Returns true if the given object is an instance of CommonBandwithPackageAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CommonBandwithPackageAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CommonBandwithPackageAttachment.__pulumiType;
    }

    /**
     * The bandwidthPackageId of the common bandwidth package attachment, the field can't be changed.
     */
    public readonly bandwidthPackageId!: pulumi.Output<string>;
    /**
     * The instanceId of the common bandwidth package attachment, the field can't be changed.
     */
    public readonly instanceId!: pulumi.Output<string>;

    /**
     * Create a CommonBandwithPackageAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CommonBandwithPackageAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CommonBandwithPackageAttachmentArgs | CommonBandwithPackageAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CommonBandwithPackageAttachmentState | undefined;
            inputs["bandwidthPackageId"] = state ? state.bandwidthPackageId : undefined;
            inputs["instanceId"] = state ? state.instanceId : undefined;
        } else {
            const args = argsOrState as CommonBandwithPackageAttachmentArgs | undefined;
            if ((!args || args.bandwidthPackageId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bandwidthPackageId'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            inputs["bandwidthPackageId"] = args ? args.bandwidthPackageId : undefined;
            inputs["instanceId"] = args ? args.instanceId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(CommonBandwithPackageAttachment.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CommonBandwithPackageAttachment resources.
 */
export interface CommonBandwithPackageAttachmentState {
    /**
     * The bandwidthPackageId of the common bandwidth package attachment, the field can't be changed.
     */
    bandwidthPackageId?: pulumi.Input<string>;
    /**
     * The instanceId of the common bandwidth package attachment, the field can't be changed.
     */
    instanceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CommonBandwithPackageAttachment resource.
 */
export interface CommonBandwithPackageAttachmentArgs {
    /**
     * The bandwidthPackageId of the common bandwidth package attachment, the field can't be changed.
     */
    bandwidthPackageId: pulumi.Input<string>;
    /**
     * The instanceId of the common bandwidth package attachment, the field can't be changed.
     */
    instanceId: pulumi.Input<string>;
}
