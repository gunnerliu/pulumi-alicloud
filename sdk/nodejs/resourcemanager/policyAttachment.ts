// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Resource Manager Policy Attachment resource to attaches a policy to an object. After you attach a policy to an object, the object has the operation permissions on the current resource group or the resources under the current account.
 * For information about Resource Manager Policy Attachment and how to use it, see [How to authorize and manage resource groups](https://www.alibabacloud.com/help/en/doc-detail/94490.htm).
 *
 * > **NOTE:** Available in v1.93.0+.
 */
export class PolicyAttachment extends pulumi.CustomResource {
    /**
     * Get an existing PolicyAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PolicyAttachmentState, opts?: pulumi.CustomResourceOptions): PolicyAttachment {
        return new PolicyAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:resourcemanager/policyAttachment:PolicyAttachment';

    /**
     * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PolicyAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PolicyAttachment.__pulumiType;
    }

    /**
     * The name of the policy. name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
     */
    public readonly policyName!: pulumi.Output<string>;
    /**
     * - (Required, ForceNew) The type of the policy. Valid values: `Custom`, `System`.
     */
    public readonly policyType!: pulumi.Output<string>;
    /**
     * The name of the object to which you want to attach the policy.
     */
    public readonly principalName!: pulumi.Output<string>;
    /**
     * The type of the object to which you want to attach the policy. Valid values: `IMSUser`: RAM user, `IMSGroup`: RAM user group, `ServiceRole`: RAM role.
     */
    public readonly principalType!: pulumi.Output<string>;
    /**
     * The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;

    /**
     * Create a PolicyAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PolicyAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PolicyAttachmentArgs | PolicyAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as PolicyAttachmentState | undefined;
            inputs["policyName"] = state ? state.policyName : undefined;
            inputs["policyType"] = state ? state.policyType : undefined;
            inputs["principalName"] = state ? state.principalName : undefined;
            inputs["principalType"] = state ? state.principalType : undefined;
            inputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
        } else {
            const args = argsOrState as PolicyAttachmentArgs | undefined;
            if (!args || args.policyName === undefined) {
                throw new Error("Missing required property 'policyName'");
            }
            if (!args || args.policyType === undefined) {
                throw new Error("Missing required property 'policyType'");
            }
            if (!args || args.principalName === undefined) {
                throw new Error("Missing required property 'principalName'");
            }
            if (!args || args.principalType === undefined) {
                throw new Error("Missing required property 'principalType'");
            }
            if (!args || args.resourceGroupId === undefined) {
                throw new Error("Missing required property 'resourceGroupId'");
            }
            inputs["policyName"] = args ? args.policyName : undefined;
            inputs["policyType"] = args ? args.policyType : undefined;
            inputs["principalName"] = args ? args.principalName : undefined;
            inputs["principalType"] = args ? args.principalType : undefined;
            inputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(PolicyAttachment.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PolicyAttachment resources.
 */
export interface PolicyAttachmentState {
    /**
     * The name of the policy. name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
     */
    readonly policyName?: pulumi.Input<string>;
    /**
     * - (Required, ForceNew) The type of the policy. Valid values: `Custom`, `System`.
     */
    readonly policyType?: pulumi.Input<string>;
    /**
     * The name of the object to which you want to attach the policy.
     */
    readonly principalName?: pulumi.Input<string>;
    /**
     * The type of the object to which you want to attach the policy. Valid values: `IMSUser`: RAM user, `IMSGroup`: RAM user group, `ServiceRole`: RAM role.
     */
    readonly principalType?: pulumi.Input<string>;
    /**
     * The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.
     */
    readonly resourceGroupId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PolicyAttachment resource.
 */
export interface PolicyAttachmentArgs {
    /**
     * The name of the policy. name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
     */
    readonly policyName: pulumi.Input<string>;
    /**
     * - (Required, ForceNew) The type of the policy. Valid values: `Custom`, `System`.
     */
    readonly policyType: pulumi.Input<string>;
    /**
     * The name of the object to which you want to attach the policy.
     */
    readonly principalName: pulumi.Input<string>;
    /**
     * The type of the object to which you want to attach the policy. Valid values: `IMSUser`: RAM user, `IMSGroup`: RAM user group, `ServiceRole`: RAM role.
     */
    readonly principalType: pulumi.Input<string>;
    /**
     * The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.
     */
    readonly resourceGroupId: pulumi.Input<string>;
}
