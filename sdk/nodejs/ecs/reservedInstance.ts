// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an Reserved Instance resource.
 *
 * > **NOTE:** Available in 1.65.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.ecs.ReservedInstance("default", {
 *     instanceType: "ecs.g6.large",
 *     instanceAmount: "1",
 *     periodUnit: "Year",
 *     offeringType: "All Upfront",
 *     description: "ReservedInstance",
 *     zoneId: "cn-hangzhou-h",
 *     scope: "Zone",
 *     period: "1",
 * });
 * ```
 *
 * ## Import
 *
 * reservedInstance can be imported using id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ecs/reservedInstance:ReservedInstance default ecsri-uf6df4xm0h3licit****
 * ```
 */
export class ReservedInstance extends pulumi.CustomResource {
    /**
     * Get an existing ReservedInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ReservedInstanceState, opts?: pulumi.CustomResourceOptions): ReservedInstance {
        return new ReservedInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/reservedInstance:ReservedInstance';

    /**
     * Returns true if the given object is an instance of ReservedInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ReservedInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ReservedInstance.__pulumiType;
    }

    /**
     * Description of the RI. 2 to 256 English or Chinese characters. It cannot start with http:// or https://.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Number of instances allocated to an RI (An RI is a coupon that includes one or more allocated instances.).
     */
    public readonly instanceAmount!: pulumi.Output<number>;
    /**
     * Instance type of the RI. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.html).
     */
    public readonly instanceType!: pulumi.Output<string>;
    /**
     * Name of the RI. The name must be a string of 2 to 128 characters in length and can contain letters, numbers, colons (:), underscores (_), and hyphens. It must start with a letter. It cannot start with http:// or https://.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Payment type of the RI. Optional values: `No Upfront`: No upfront payment is required., `Partial Upfront`: A portion of upfront payment is required.`All Upfront`: Full upfront payment is required.
     */
    public readonly offeringType!: pulumi.Output<string | undefined>;
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * Term unit. Optional value: Year.
     */
    public readonly periodUnit!: pulumi.Output<string | undefined>;
    /**
     * The operating system type of the image used by the instance. Optional values: `Windows`, `Linux`. Default is `Linux`.
     */
    public readonly platform!: pulumi.Output<string>;
    /**
     * Resource group ID.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * Scope of the RI. Optional values: `Region`: region-level, `Zone`: zone-level. Default is `Region`.
     */
    public readonly scope!: pulumi.Output<string | undefined>;
    /**
     * ID of the zone to which the RI belongs. When Scope is set to Zone, this parameter is required. For information about the zone list, see [DescribeZones](https://www.alibabacloud.com/help/doc-detail/25610.html).
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a ReservedInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ReservedInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ReservedInstanceArgs | ReservedInstanceState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ReservedInstanceState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["instanceAmount"] = state ? state.instanceAmount : undefined;
            inputs["instanceType"] = state ? state.instanceType : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["offeringType"] = state ? state.offeringType : undefined;
            inputs["period"] = state ? state.period : undefined;
            inputs["periodUnit"] = state ? state.periodUnit : undefined;
            inputs["platform"] = state ? state.platform : undefined;
            inputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            inputs["scope"] = state ? state.scope : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ReservedInstanceArgs | undefined;
            if (!args || args.instanceType === undefined) {
                throw new Error("Missing required property 'instanceType'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["instanceAmount"] = args ? args.instanceAmount : undefined;
            inputs["instanceType"] = args ? args.instanceType : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["offeringType"] = args ? args.offeringType : undefined;
            inputs["period"] = args ? args.period : undefined;
            inputs["periodUnit"] = args ? args.periodUnit : undefined;
            inputs["platform"] = args ? args.platform : undefined;
            inputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            inputs["scope"] = args ? args.scope : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ReservedInstance.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ReservedInstance resources.
 */
export interface ReservedInstanceState {
    /**
     * Description of the RI. 2 to 256 English or Chinese characters. It cannot start with http:// or https://.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Number of instances allocated to an RI (An RI is a coupon that includes one or more allocated instances.).
     */
    readonly instanceAmount?: pulumi.Input<number>;
    /**
     * Instance type of the RI. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.html).
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * Name of the RI. The name must be a string of 2 to 128 characters in length and can contain letters, numbers, colons (:), underscores (_), and hyphens. It must start with a letter. It cannot start with http:// or https://.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Payment type of the RI. Optional values: `No Upfront`: No upfront payment is required., `Partial Upfront`: A portion of upfront payment is required.`All Upfront`: Full upfront payment is required.
     */
    readonly offeringType?: pulumi.Input<string>;
    readonly period?: pulumi.Input<number>;
    /**
     * Term unit. Optional value: Year.
     */
    readonly periodUnit?: pulumi.Input<string>;
    /**
     * The operating system type of the image used by the instance. Optional values: `Windows`, `Linux`. Default is `Linux`.
     */
    readonly platform?: pulumi.Input<string>;
    /**
     * Resource group ID.
     */
    readonly resourceGroupId?: pulumi.Input<string>;
    /**
     * Scope of the RI. Optional values: `Region`: region-level, `Zone`: zone-level. Default is `Region`.
     */
    readonly scope?: pulumi.Input<string>;
    /**
     * ID of the zone to which the RI belongs. When Scope is set to Zone, this parameter is required. For information about the zone list, see [DescribeZones](https://www.alibabacloud.com/help/doc-detail/25610.html).
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ReservedInstance resource.
 */
export interface ReservedInstanceArgs {
    /**
     * Description of the RI. 2 to 256 English or Chinese characters. It cannot start with http:// or https://.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Number of instances allocated to an RI (An RI is a coupon that includes one or more allocated instances.).
     */
    readonly instanceAmount?: pulumi.Input<number>;
    /**
     * Instance type of the RI. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.html).
     */
    readonly instanceType: pulumi.Input<string>;
    /**
     * Name of the RI. The name must be a string of 2 to 128 characters in length and can contain letters, numbers, colons (:), underscores (_), and hyphens. It must start with a letter. It cannot start with http:// or https://.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Payment type of the RI. Optional values: `No Upfront`: No upfront payment is required., `Partial Upfront`: A portion of upfront payment is required.`All Upfront`: Full upfront payment is required.
     */
    readonly offeringType?: pulumi.Input<string>;
    readonly period?: pulumi.Input<number>;
    /**
     * Term unit. Optional value: Year.
     */
    readonly periodUnit?: pulumi.Input<string>;
    /**
     * The operating system type of the image used by the instance. Optional values: `Windows`, `Linux`. Default is `Linux`.
     */
    readonly platform?: pulumi.Input<string>;
    /**
     * Resource group ID.
     */
    readonly resourceGroupId?: pulumi.Input<string>;
    /**
     * Scope of the RI. Optional values: `Region`: region-level, `Zone`: zone-level. Default is `Region`.
     */
    readonly scope?: pulumi.Input<string>;
    /**
     * ID of the zone to which the RI belongs. When Scope is set to Zone, this parameter is required. For information about the zone list, see [DescribeZones](https://www.alibabacloud.com/help/doc-detail/25610.html).
     */
    readonly zoneId?: pulumi.Input<string>;
}
