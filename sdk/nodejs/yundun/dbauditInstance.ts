// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Cloud DBaudit instance resource ("Yundun_dbaudit" is the short term of this product).
 *
 * > **NOTE:** The endpoint of bssopenapi used only support "business.aliyuncs.com" at present.
 *
 * > **NOTE:** Available in 1.62.0+ .
 *
 * > **NOTE:** In order to destroy Cloud DBaudit instance , users are required to apply for white list first
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultDBAuditInstance = new alicloud.yundun.DBAuditInstance("default", {
 *     description: "Terraform-test",
 *     period: 1,
 *     planCode: "alpha.professional",
 *     vswitchId: "v-testVswitch",
 * });
 * ```
 *
 * ## Import
 *
 * Yundun_dbaudit instance can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:yundun/dBAuditInstance:DBAuditInstance example dbaudit-exampe123456
 * ```
 */
export class DBAuditInstance extends pulumi.CustomResource {
    /**
     * Get an existing DBAuditInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DBAuditInstanceState, opts?: pulumi.CustomResourceOptions): DBAuditInstance {
        return new DBAuditInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:yundun/dBAuditInstance:DBAuditInstance';

    /**
     * Returns true if the given object is an instance of DBAuditInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DBAuditInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DBAuditInstance.__pulumiType;
    }

    /**
     * Description of the instance. This name can have a string of 1 to 63 characters.
     */
    public readonly description!: pulumi.Output<string>;
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
     */
    public readonly planCode!: pulumi.Output<string>;
    /**
     * The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
     */
    public readonly resourceGroupId!: pulumi.Output<string | undefined>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * vSwtich ID configured to audit
     */
    public readonly vswitchId!: pulumi.Output<string>;

    /**
     * Create a DBAuditInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DBAuditInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DBAuditInstanceArgs | DBAuditInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DBAuditInstanceState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["planCode"] = state ? state.planCode : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
        } else {
            const args = argsOrState as DBAuditInstanceArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.planCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'planCode'");
            }
            if ((!args || args.vswitchId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vswitchId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["planCode"] = args ? args.planCode : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DBAuditInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DBAuditInstance resources.
 */
export interface DBAuditInstanceState {
    /**
     * Description of the instance. This name can have a string of 1 to 63 characters.
     */
    description?: pulumi.Input<string>;
    period?: pulumi.Input<number>;
    /**
     * Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
     */
    planCode?: pulumi.Input<string>;
    /**
     * The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * vSwtich ID configured to audit
     */
    vswitchId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DBAuditInstance resource.
 */
export interface DBAuditInstanceArgs {
    /**
     * Description of the instance. This name can have a string of 1 to 63 characters.
     */
    description: pulumi.Input<string>;
    period?: pulumi.Input<number>;
    /**
     * Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
     */
    planCode: pulumi.Input<string>;
    /**
     * The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * vSwtich ID configured to audit
     */
    vswitchId: pulumi.Input<string>;
}
