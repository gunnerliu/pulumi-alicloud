// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Resource Manager Control Policy Attachment resource.
 *
 * For information about Resource Manager Control Policy Attachment and how to use it, see [What is Control Policy Attachment](https://www.alibabacloud.com/help/en/resource-management/latest/api-resourcedirectorymaster-2022-04-19-attachcontrolpolicy).
 *
 * > **NOTE:** Available since v1.120.0.
 *
 * ## Import
 *
 * Resource Manager Control Policy Attachment can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:resourcemanager/controlPolicyAttachment:ControlPolicyAttachment example <policy_id>:<target_id>
 * ```
 */
export class ControlPolicyAttachment extends pulumi.CustomResource {
    /**
     * Get an existing ControlPolicyAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ControlPolicyAttachmentState, opts?: pulumi.CustomResourceOptions): ControlPolicyAttachment {
        return new ControlPolicyAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:resourcemanager/controlPolicyAttachment:ControlPolicyAttachment';

    /**
     * Returns true if the given object is an instance of ControlPolicyAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ControlPolicyAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ControlPolicyAttachment.__pulumiType;
    }

    /**
     * The ID of control policy.
     */
    public readonly policyId!: pulumi.Output<string>;
    /**
     * The ID of target.
     */
    public readonly targetId!: pulumi.Output<string>;

    /**
     * Create a ControlPolicyAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ControlPolicyAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ControlPolicyAttachmentArgs | ControlPolicyAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ControlPolicyAttachmentState | undefined;
            resourceInputs["policyId"] = state ? state.policyId : undefined;
            resourceInputs["targetId"] = state ? state.targetId : undefined;
        } else {
            const args = argsOrState as ControlPolicyAttachmentArgs | undefined;
            if ((!args || args.policyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyId'");
            }
            if ((!args || args.targetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetId'");
            }
            resourceInputs["policyId"] = args ? args.policyId : undefined;
            resourceInputs["targetId"] = args ? args.targetId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ControlPolicyAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ControlPolicyAttachment resources.
 */
export interface ControlPolicyAttachmentState {
    /**
     * The ID of control policy.
     */
    policyId?: pulumi.Input<string>;
    /**
     * The ID of target.
     */
    targetId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ControlPolicyAttachment resource.
 */
export interface ControlPolicyAttachmentArgs {
    /**
     * The ID of control policy.
     */
    policyId: pulumi.Input<string>;
    /**
     * The ID of target.
     */
    targetId: pulumi.Input<string>;
}
