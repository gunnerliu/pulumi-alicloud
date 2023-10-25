// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ESS lifecycle hook resource. More about Ess lifecycle hook, see [LifecycleHook](https://www.alibabacloud.com/help/doc-detail/73839.htm).
 *
 * > **NOTE:** Available since v1.13.0.
 *
 * ## Module Support
 *
 * You can use to the existing autoscaling module
 * to create a lifecycle hook, scaling group and configuration one-click.
 *
 * ## Import
 *
 * Ess lifecycle hook can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ess/lifecycleHook:LifecycleHook example ash-l12345
 * ```
 */
export class LifecycleHook extends pulumi.CustomResource {
    /**
     * Get an existing LifecycleHook resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LifecycleHookState, opts?: pulumi.CustomResourceOptions): LifecycleHook {
        return new LifecycleHook(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ess/lifecycleHook:LifecycleHook';

    /**
     * Returns true if the given object is an instance of LifecycleHook.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LifecycleHook {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LifecycleHook.__pulumiType;
    }

    /**
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses. Applicable value: CONTINUE, ABANDON, ROLLBACK, default value: CONTINUE.
     */
    public readonly defaultResult!: pulumi.Output<string | undefined>;
    /**
     * Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the defaultResult parameter. Default value: 600.
     */
    public readonly heartbeatTimeout!: pulumi.Output<number | undefined>;
    /**
     * Type of Scaling activity attached to lifecycle hook. Supported value: SCALE_OUT, SCALE_IN.
     */
    public readonly lifecycleTransition!: pulumi.Output<string>;
    /**
     * The name of the lifecycle hook, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is lifecycle hook id.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Arn of notification target.
     */
    public readonly notificationArn!: pulumi.Output<string>;
    /**
     * Additional information that you want to include when Auto Scaling sends a message to the notification target.
     */
    public readonly notificationMetadata!: pulumi.Output<string>;
    /**
     * The ID of the Auto Scaling group to which you want to assign the lifecycle hook.
     */
    public readonly scalingGroupId!: pulumi.Output<string>;

    /**
     * Create a LifecycleHook resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LifecycleHookArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LifecycleHookArgs | LifecycleHookState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LifecycleHookState | undefined;
            resourceInputs["defaultResult"] = state ? state.defaultResult : undefined;
            resourceInputs["heartbeatTimeout"] = state ? state.heartbeatTimeout : undefined;
            resourceInputs["lifecycleTransition"] = state ? state.lifecycleTransition : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notificationArn"] = state ? state.notificationArn : undefined;
            resourceInputs["notificationMetadata"] = state ? state.notificationMetadata : undefined;
            resourceInputs["scalingGroupId"] = state ? state.scalingGroupId : undefined;
        } else {
            const args = argsOrState as LifecycleHookArgs | undefined;
            if ((!args || args.lifecycleTransition === undefined) && !opts.urn) {
                throw new Error("Missing required property 'lifecycleTransition'");
            }
            if ((!args || args.scalingGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scalingGroupId'");
            }
            resourceInputs["defaultResult"] = args ? args.defaultResult : undefined;
            resourceInputs["heartbeatTimeout"] = args ? args.heartbeatTimeout : undefined;
            resourceInputs["lifecycleTransition"] = args ? args.lifecycleTransition : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notificationArn"] = args ? args.notificationArn : undefined;
            resourceInputs["notificationMetadata"] = args ? args.notificationMetadata : undefined;
            resourceInputs["scalingGroupId"] = args ? args.scalingGroupId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LifecycleHook.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LifecycleHook resources.
 */
export interface LifecycleHookState {
    /**
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses. Applicable value: CONTINUE, ABANDON, ROLLBACK, default value: CONTINUE.
     */
    defaultResult?: pulumi.Input<string>;
    /**
     * Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the defaultResult parameter. Default value: 600.
     */
    heartbeatTimeout?: pulumi.Input<number>;
    /**
     * Type of Scaling activity attached to lifecycle hook. Supported value: SCALE_OUT, SCALE_IN.
     */
    lifecycleTransition?: pulumi.Input<string>;
    /**
     * The name of the lifecycle hook, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is lifecycle hook id.
     */
    name?: pulumi.Input<string>;
    /**
     * The Arn of notification target.
     */
    notificationArn?: pulumi.Input<string>;
    /**
     * Additional information that you want to include when Auto Scaling sends a message to the notification target.
     */
    notificationMetadata?: pulumi.Input<string>;
    /**
     * The ID of the Auto Scaling group to which you want to assign the lifecycle hook.
     */
    scalingGroupId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LifecycleHook resource.
 */
export interface LifecycleHookArgs {
    /**
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses. Applicable value: CONTINUE, ABANDON, ROLLBACK, default value: CONTINUE.
     */
    defaultResult?: pulumi.Input<string>;
    /**
     * Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the defaultResult parameter. Default value: 600.
     */
    heartbeatTimeout?: pulumi.Input<number>;
    /**
     * Type of Scaling activity attached to lifecycle hook. Supported value: SCALE_OUT, SCALE_IN.
     */
    lifecycleTransition: pulumi.Input<string>;
    /**
     * The name of the lifecycle hook, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is lifecycle hook id.
     */
    name?: pulumi.Input<string>;
    /**
     * The Arn of notification target.
     */
    notificationArn?: pulumi.Input<string>;
    /**
     * Additional information that you want to include when Auto Scaling sends a message to the notification target.
     */
    notificationMetadata?: pulumi.Input<string>;
    /**
     * The ID of the Auto Scaling group to which you want to assign the lifecycle hook.
     */
    scalingGroupId: pulumi.Input<string>;
}
