// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export class ForwardEntry extends pulumi.CustomResource {
    /**
     * Get an existing ForwardEntry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ForwardEntryState): ForwardEntry {
        return new ForwardEntry(name, <any>state, { id });
    }

    public readonly externalIp: pulumi.Output<string>;
    public readonly externalPort: pulumi.Output<string>;
    public readonly forwardTableId: pulumi.Output<string>;
    public readonly internalIp: pulumi.Output<string>;
    public readonly internalPort: pulumi.Output<string>;
    public readonly ipProtocol: pulumi.Output<string>;

    /**
     * Create a ForwardEntry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ForwardEntryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ForwardEntryArgs | ForwardEntryState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state: ForwardEntryState = argsOrState as ForwardEntryState | undefined;
            inputs["externalIp"] = state ? state.externalIp : undefined;
            inputs["externalPort"] = state ? state.externalPort : undefined;
            inputs["forwardTableId"] = state ? state.forwardTableId : undefined;
            inputs["internalIp"] = state ? state.internalIp : undefined;
            inputs["internalPort"] = state ? state.internalPort : undefined;
            inputs["ipProtocol"] = state ? state.ipProtocol : undefined;
        } else {
            const args = argsOrState as ForwardEntryArgs | undefined;
            if (!args || args.externalIp === undefined) {
                throw new Error("Missing required property 'externalIp'");
            }
            if (!args || args.externalPort === undefined) {
                throw new Error("Missing required property 'externalPort'");
            }
            if (!args || args.forwardTableId === undefined) {
                throw new Error("Missing required property 'forwardTableId'");
            }
            if (!args || args.internalIp === undefined) {
                throw new Error("Missing required property 'internalIp'");
            }
            if (!args || args.internalPort === undefined) {
                throw new Error("Missing required property 'internalPort'");
            }
            if (!args || args.ipProtocol === undefined) {
                throw new Error("Missing required property 'ipProtocol'");
            }
            inputs["externalIp"] = args ? args.externalIp : undefined;
            inputs["externalPort"] = args ? args.externalPort : undefined;
            inputs["forwardTableId"] = args ? args.forwardTableId : undefined;
            inputs["internalIp"] = args ? args.internalIp : undefined;
            inputs["internalPort"] = args ? args.internalPort : undefined;
            inputs["ipProtocol"] = args ? args.ipProtocol : undefined;
        }
        super("alicloud:vpc/forwardEntry:ForwardEntry", name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ForwardEntry resources.
 */
export interface ForwardEntryState {
    readonly externalIp?: pulumi.Input<string>;
    readonly externalPort?: pulumi.Input<string>;
    readonly forwardTableId?: pulumi.Input<string>;
    readonly internalIp?: pulumi.Input<string>;
    readonly internalPort?: pulumi.Input<string>;
    readonly ipProtocol?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ForwardEntry resource.
 */
export interface ForwardEntryArgs {
    readonly externalIp: pulumi.Input<string>;
    readonly externalPort: pulumi.Input<string>;
    readonly forwardTableId: pulumi.Input<string>;
    readonly internalIp: pulumi.Input<string>;
    readonly internalPort: pulumi.Input<string>;
    readonly ipProtocol: pulumi.Input<string>;
}