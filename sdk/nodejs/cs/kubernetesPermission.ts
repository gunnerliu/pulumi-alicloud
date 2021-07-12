// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

export class KubernetesPermission extends pulumi.CustomResource {
    /**
     * Get an existing KubernetesPermission resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KubernetesPermissionState, opts?: pulumi.CustomResourceOptions): KubernetesPermission {
        return new KubernetesPermission(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cs/kubernetesPermission:KubernetesPermission';

    /**
     * Returns true if the given object is an instance of KubernetesPermission.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KubernetesPermission {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KubernetesPermission.__pulumiType;
    }

    /**
     * A list of user permission.
     */
    public readonly permissions!: pulumi.Output<outputs.cs.KubernetesPermissionPermission[] | undefined>;
    /**
     * The ID of the RAM user.
     */
    public readonly uid!: pulumi.Output<string>;

    /**
     * Create a KubernetesPermission resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KubernetesPermissionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KubernetesPermissionArgs | KubernetesPermissionState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KubernetesPermissionState | undefined;
            inputs["permissions"] = state ? state.permissions : undefined;
            inputs["uid"] = state ? state.uid : undefined;
        } else {
            const args = argsOrState as KubernetesPermissionArgs | undefined;
            if ((!args || args.uid === undefined) && !opts.urn) {
                throw new Error("Missing required property 'uid'");
            }
            inputs["permissions"] = args ? args.permissions : undefined;
            inputs["uid"] = args ? args.uid : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(KubernetesPermission.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KubernetesPermission resources.
 */
export interface KubernetesPermissionState {
    /**
     * A list of user permission.
     */
    readonly permissions?: pulumi.Input<pulumi.Input<inputs.cs.KubernetesPermissionPermission>[]>;
    /**
     * The ID of the RAM user.
     */
    readonly uid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a KubernetesPermission resource.
 */
export interface KubernetesPermissionArgs {
    /**
     * A list of user permission.
     */
    readonly permissions?: pulumi.Input<pulumi.Input<inputs.cs.KubernetesPermissionPermission>[]>;
    /**
     * The ID of the RAM user.
     */
    readonly uid: pulumi.Input<string>;
}