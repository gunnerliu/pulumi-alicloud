// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a key pair attachment resource to bind key pair for several ECS instances.
 * 
 * -> **NOTE:** After the key pair is attached with sone instances, there instances must be rebooted to make the key pair affect.
 */
export class KeyPairAttachment extends pulumi.CustomResource {
    /**
     * Get an existing KeyPairAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KeyPairAttachmentState): KeyPairAttachment {
        return new KeyPairAttachment(name, <any>state, { id });
    }

    /**
     * Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
     */
    public readonly force: pulumi.Output<boolean | undefined>;
    /**
     * The list of ECS instance's IDs.
     */
    public readonly instanceIds: pulumi.Output<string[]>;
    /**
     * The name of key pair used to bind.
     */
    public readonly keyName: pulumi.Output<string>;

    /**
     * Create a KeyPairAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KeyPairAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KeyPairAttachmentArgs | KeyPairAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state: KeyPairAttachmentState = argsOrState as KeyPairAttachmentState | undefined;
            inputs["force"] = state ? state.force : undefined;
            inputs["instanceIds"] = state ? state.instanceIds : undefined;
            inputs["keyName"] = state ? state.keyName : undefined;
        } else {
            const args = argsOrState as KeyPairAttachmentArgs | undefined;
            if (!args || args.instanceIds === undefined) {
                throw new Error("Missing required property 'instanceIds'");
            }
            if (!args || args.keyName === undefined) {
                throw new Error("Missing required property 'keyName'");
            }
            inputs["force"] = args ? args.force : undefined;
            inputs["instanceIds"] = args ? args.instanceIds : undefined;
            inputs["keyName"] = args ? args.keyName : undefined;
        }
        super("alicloud:ecs/keyPairAttachment:KeyPairAttachment", name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KeyPairAttachment resources.
 */
export interface KeyPairAttachmentState {
    /**
     * Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * The list of ECS instance's IDs.
     */
    readonly instanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of key pair used to bind.
     */
    readonly keyName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a KeyPairAttachment resource.
 */
export interface KeyPairAttachmentArgs {
    /**
     * Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * The list of ECS instance's IDs.
     */
    readonly instanceIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of key pair used to bind.
     */
    readonly keyName: pulumi.Input<string>;
}