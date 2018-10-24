// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export class SnatEntry extends pulumi.CustomResource {
    /**
     * Get an existing SnatEntry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnatEntryState): SnatEntry {
        return new SnatEntry(name, <any>state, { id });
    }

    public readonly snatIp: pulumi.Output<string>;
    public readonly snatTableId: pulumi.Output<string>;
    public readonly sourceVswitchId: pulumi.Output<string>;

    /**
     * Create a SnatEntry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SnatEntryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SnatEntryArgs | SnatEntryState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state: SnatEntryState = argsOrState as SnatEntryState | undefined;
            inputs["snatIp"] = state ? state.snatIp : undefined;
            inputs["snatTableId"] = state ? state.snatTableId : undefined;
            inputs["sourceVswitchId"] = state ? state.sourceVswitchId : undefined;
        } else {
            const args = argsOrState as SnatEntryArgs | undefined;
            if (!args || args.snatIp === undefined) {
                throw new Error("Missing required property 'snatIp'");
            }
            if (!args || args.snatTableId === undefined) {
                throw new Error("Missing required property 'snatTableId'");
            }
            if (!args || args.sourceVswitchId === undefined) {
                throw new Error("Missing required property 'sourceVswitchId'");
            }
            inputs["snatIp"] = args ? args.snatIp : undefined;
            inputs["snatTableId"] = args ? args.snatTableId : undefined;
            inputs["sourceVswitchId"] = args ? args.sourceVswitchId : undefined;
        }
        super("alicloud:vpc/snatEntry:SnatEntry", name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SnatEntry resources.
 */
export interface SnatEntryState {
    readonly snatIp?: pulumi.Input<string>;
    readonly snatTableId?: pulumi.Input<string>;
    readonly sourceVswitchId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SnatEntry resource.
 */
export interface SnatEntryArgs {
    readonly snatIp: pulumi.Input<string>;
    readonly snatTableId: pulumi.Input<string>;
    readonly sourceVswitchId: pulumi.Input<string>;
}