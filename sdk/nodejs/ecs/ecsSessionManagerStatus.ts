// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ECS Session Manager Status resource.
 *
 * For information about ECS Session Manager Status and how to use it, see [What is Session Manager Status](https://www.alibabacloud.com/help/zh/doc-detail/337915.html).
 *
 * > **NOTE:** Available in v1.148.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultEcsSessionManagerStatus = new alicloud.ecs.EcsSessionManagerStatus("default", {
 *     sessionManagerStatusName: "sessionManagerStatus",
 *     status: "Disabled",
 * });
 * ```
 *
 * ## Import
 *
 * ECS Session Manager Status can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ecs/ecsSessionManagerStatus:EcsSessionManagerStatus example <session_manager_status_name>
 * ```
 */
export class EcsSessionManagerStatus extends pulumi.CustomResource {
    /**
     * Get an existing EcsSessionManagerStatus resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EcsSessionManagerStatusState, opts?: pulumi.CustomResourceOptions): EcsSessionManagerStatus {
        return new EcsSessionManagerStatus(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/ecsSessionManagerStatus:EcsSessionManagerStatus';

    /**
     * Returns true if the given object is an instance of EcsSessionManagerStatus.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EcsSessionManagerStatus {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EcsSessionManagerStatus.__pulumiType;
    }

    /**
     * The name of the resource. Valid values: `sessionManagerStatus`.
     */
    public readonly sessionManagerStatusName!: pulumi.Output<string>;
    /**
     * The status of the resource. Valid values: `Disabled`, `Enabled`.
     */
    public readonly status!: pulumi.Output<string>;

    /**
     * Create a EcsSessionManagerStatus resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EcsSessionManagerStatusArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EcsSessionManagerStatusArgs | EcsSessionManagerStatusState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EcsSessionManagerStatusState | undefined;
            resourceInputs["sessionManagerStatusName"] = state ? state.sessionManagerStatusName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as EcsSessionManagerStatusArgs | undefined;
            if ((!args || args.sessionManagerStatusName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sessionManagerStatusName'");
            }
            if ((!args || args.status === undefined) && !opts.urn) {
                throw new Error("Missing required property 'status'");
            }
            resourceInputs["sessionManagerStatusName"] = args ? args.sessionManagerStatusName : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EcsSessionManagerStatus.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EcsSessionManagerStatus resources.
 */
export interface EcsSessionManagerStatusState {
    /**
     * The name of the resource. Valid values: `sessionManagerStatus`.
     */
    sessionManagerStatusName?: pulumi.Input<string>;
    /**
     * The status of the resource. Valid values: `Disabled`, `Enabled`.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EcsSessionManagerStatus resource.
 */
export interface EcsSessionManagerStatusArgs {
    /**
     * The name of the resource. Valid values: `sessionManagerStatus`.
     */
    sessionManagerStatusName: pulumi.Input<string>;
    /**
     * The status of the resource. Valid values: `Disabled`, `Enabled`.
     */
    status: pulumi.Input<string>;
}
