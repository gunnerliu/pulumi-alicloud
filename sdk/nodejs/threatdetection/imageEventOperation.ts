// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Threat Detection Image Event Operation resource. Image Event Operation.
 *
 * For information about Threat Detection Image Event Operation and how to use it, see [What is Image Event Operation](https://www.alibabacloud.com/help/zh/security-center/developer-reference/api-sas-2018-12-03-addimageeventoperation).
 *
 * > **NOTE:** Available since v1.212.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const _default = new alicloud.threatdetection.ImageEventOperation("default", {
 *     conditions: `[
 *   {
 *       "condition":"MD5",
 *       "type":"equals",
 *       "value":"0083a31cc0083a31ccf7c10367a6e783e"
 *   }
 * ]
 *
 * `,
 *     eventKey: "alibabacloud_ak",
 *     eventName: "阿里云AK",
 *     eventType: "maliciousFile",
 *     operationCode: "whitelist",
 *     scenarios: `{
 *   "type":"default",
 *   "value":""
 * }
 *
 * `,
 * });
 * ```
 *
 * ## Import
 *
 * Threat Detection Image Event Operation can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:threatdetection/imageEventOperation:ImageEventOperation example <id>
 * ```
 */
export class ImageEventOperation extends pulumi.CustomResource {
    /**
     * Get an existing ImageEventOperation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ImageEventOperationState, opts?: pulumi.CustomResourceOptions): ImageEventOperation {
        return new ImageEventOperation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:threatdetection/imageEventOperation:ImageEventOperation';

    /**
     * Returns true if the given object is an instance of ImageEventOperation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ImageEventOperation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ImageEventOperation.__pulumiType;
    }

    /**
     * Event Conditions.
     */
    public readonly conditions!: pulumi.Output<string | undefined>;
    /**
     * Image Event Key.
     */
    public readonly eventKey!: pulumi.Output<string | undefined>;
    /**
     * Image Event Name.
     */
    public readonly eventName!: pulumi.Output<string | undefined>;
    /**
     * Image Event Type.
     */
    public readonly eventType!: pulumi.Output<string>;
    /**
     * Event Operation Code.
     */
    public readonly operationCode!: pulumi.Output<string | undefined>;
    /**
     * Event Scenarios.
     */
    public readonly scenarios!: pulumi.Output<string | undefined>;

    /**
     * Create a ImageEventOperation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ImageEventOperationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ImageEventOperationArgs | ImageEventOperationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ImageEventOperationState | undefined;
            resourceInputs["conditions"] = state ? state.conditions : undefined;
            resourceInputs["eventKey"] = state ? state.eventKey : undefined;
            resourceInputs["eventName"] = state ? state.eventName : undefined;
            resourceInputs["eventType"] = state ? state.eventType : undefined;
            resourceInputs["operationCode"] = state ? state.operationCode : undefined;
            resourceInputs["scenarios"] = state ? state.scenarios : undefined;
        } else {
            const args = argsOrState as ImageEventOperationArgs | undefined;
            resourceInputs["conditions"] = args ? args.conditions : undefined;
            resourceInputs["eventKey"] = args ? args.eventKey : undefined;
            resourceInputs["eventName"] = args ? args.eventName : undefined;
            resourceInputs["eventType"] = args ? args.eventType : undefined;
            resourceInputs["operationCode"] = args ? args.operationCode : undefined;
            resourceInputs["scenarios"] = args ? args.scenarios : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ImageEventOperation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ImageEventOperation resources.
 */
export interface ImageEventOperationState {
    /**
     * Event Conditions.
     */
    conditions?: pulumi.Input<string>;
    /**
     * Image Event Key.
     */
    eventKey?: pulumi.Input<string>;
    /**
     * Image Event Name.
     */
    eventName?: pulumi.Input<string>;
    /**
     * Image Event Type.
     */
    eventType?: pulumi.Input<string>;
    /**
     * Event Operation Code.
     */
    operationCode?: pulumi.Input<string>;
    /**
     * Event Scenarios.
     */
    scenarios?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ImageEventOperation resource.
 */
export interface ImageEventOperationArgs {
    /**
     * Event Conditions.
     */
    conditions?: pulumi.Input<string>;
    /**
     * Image Event Key.
     */
    eventKey?: pulumi.Input<string>;
    /**
     * Image Event Name.
     */
    eventName?: pulumi.Input<string>;
    /**
     * Image Event Type.
     */
    eventType?: pulumi.Input<string>;
    /**
     * Event Operation Code.
     */
    operationCode?: pulumi.Input<string>;
    /**
     * Event Scenarios.
     */
    scenarios?: pulumi.Input<string>;
}
