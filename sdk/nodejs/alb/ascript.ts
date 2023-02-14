// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Alb Ascript resource.
 *
 * For information about Alb Ascript and how to use it, see [What is AScript](https://www.alibabacloud.com/help/en/server-load-balancer/latest/what-is-application-load-balancer).
 *
 * > **NOTE:** Available in v1.195.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.alb.AScript("default", {
 *     scriptContent: "time()",
 *     position: "RequestHead",
 *     ascriptName: "test",
 *     enabled: true,
 *     listenerId: _var.listenerId,
 * });
 * ```
 *
 * ## Import
 *
 * Alb AScript can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:alb/aScript:AScript example <id>
 * ```
 */
export class AScript extends pulumi.CustomResource {
    /**
     * Get an existing AScript resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AScriptState, opts?: pulumi.CustomResourceOptions): AScript {
        return new AScript(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:alb/aScript:AScript';

    /**
     * Returns true if the given object is an instance of AScript.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AScript {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AScript.__pulumiType;
    }

    /**
     * The name of AScript.
     */
    public readonly ascriptName!: pulumi.Output<string>;
    /**
     * Whether scripts are enabled.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Whether extension parameters are enabled.
     */
    public readonly extAttributeEnabled!: pulumi.Output<boolean>;
    /**
     * Extended attribute list. See the following `Block ExtAttributes`.
     */
    public readonly extAttributes!: pulumi.Output<outputs.alb.AScriptExtAttribute[]>;
    /**
     * Listener ID of script attribution
     */
    public readonly listenerId!: pulumi.Output<string>;
    /**
     * The ID of load balancer instance.
     */
    public /*out*/ readonly loadBalancerId!: pulumi.Output<string>;
    /**
     * Execution location of AScript.
     */
    public readonly position!: pulumi.Output<string>;
    /**
     * The content of AScript.
     */
    public readonly scriptContent!: pulumi.Output<string>;
    /**
     * The status of AScript.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a AScript resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AScriptArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AScriptArgs | AScriptState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AScriptState | undefined;
            resourceInputs["ascriptName"] = state ? state.ascriptName : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["extAttributeEnabled"] = state ? state.extAttributeEnabled : undefined;
            resourceInputs["extAttributes"] = state ? state.extAttributes : undefined;
            resourceInputs["listenerId"] = state ? state.listenerId : undefined;
            resourceInputs["loadBalancerId"] = state ? state.loadBalancerId : undefined;
            resourceInputs["position"] = state ? state.position : undefined;
            resourceInputs["scriptContent"] = state ? state.scriptContent : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as AScriptArgs | undefined;
            if ((!args || args.ascriptName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ascriptName'");
            }
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.listenerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'listenerId'");
            }
            if ((!args || args.position === undefined) && !opts.urn) {
                throw new Error("Missing required property 'position'");
            }
            if ((!args || args.scriptContent === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scriptContent'");
            }
            resourceInputs["ascriptName"] = args ? args.ascriptName : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["extAttributeEnabled"] = args ? args.extAttributeEnabled : undefined;
            resourceInputs["extAttributes"] = args ? args.extAttributes : undefined;
            resourceInputs["listenerId"] = args ? args.listenerId : undefined;
            resourceInputs["position"] = args ? args.position : undefined;
            resourceInputs["scriptContent"] = args ? args.scriptContent : undefined;
            resourceInputs["loadBalancerId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AScript.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AScript resources.
 */
export interface AScriptState {
    /**
     * The name of AScript.
     */
    ascriptName?: pulumi.Input<string>;
    /**
     * Whether scripts are enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Whether extension parameters are enabled.
     */
    extAttributeEnabled?: pulumi.Input<boolean>;
    /**
     * Extended attribute list. See the following `Block ExtAttributes`.
     */
    extAttributes?: pulumi.Input<pulumi.Input<inputs.alb.AScriptExtAttribute>[]>;
    /**
     * Listener ID of script attribution
     */
    listenerId?: pulumi.Input<string>;
    /**
     * The ID of load balancer instance.
     */
    loadBalancerId?: pulumi.Input<string>;
    /**
     * Execution location of AScript.
     */
    position?: pulumi.Input<string>;
    /**
     * The content of AScript.
     */
    scriptContent?: pulumi.Input<string>;
    /**
     * The status of AScript.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AScript resource.
 */
export interface AScriptArgs {
    /**
     * The name of AScript.
     */
    ascriptName: pulumi.Input<string>;
    /**
     * Whether scripts are enabled.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * Whether extension parameters are enabled.
     */
    extAttributeEnabled?: pulumi.Input<boolean>;
    /**
     * Extended attribute list. See the following `Block ExtAttributes`.
     */
    extAttributes?: pulumi.Input<pulumi.Input<inputs.alb.AScriptExtAttribute>[]>;
    /**
     * Listener ID of script attribution
     */
    listenerId: pulumi.Input<string>;
    /**
     * Execution location of AScript.
     */
    position: pulumi.Input<string>;
    /**
     * The content of AScript.
     */
    scriptContent: pulumi.Input<string>;
}