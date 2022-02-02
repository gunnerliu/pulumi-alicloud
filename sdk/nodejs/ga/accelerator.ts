// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Global Accelerator (GA) Accelerator resource.
 *
 * For information about Global Accelerator (GA) Accelerator and how to use it, see [What is Accelerator](https://help.aliyun.com/document_detail/153235.html).
 *
 * > **NOTE:** At present, The `alicloud.ga.Accelerator` cannot be deleted. you need to wait until the resource is outdated and released automatically.
 *
 * > **NOTE:** Available in v1.111.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.ga.Accelerator("example", {
 *     autoUseCoupon: true,
 *     duration: 1,
 *     spec: "1",
 * });
 * ```
 *
 * ## Import
 *
 * Ga Accelerator can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ga/accelerator:Accelerator example <accelerator_id>
 * ```
 */
export class Accelerator extends pulumi.CustomResource {
    /**
     * Get an existing Accelerator resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AcceleratorState, opts?: pulumi.CustomResourceOptions): Accelerator {
        return new Accelerator(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ga/accelerator:Accelerator';

    /**
     * Returns true if the given object is an instance of Accelerator.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Accelerator {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Accelerator.__pulumiType;
    }

    /**
     * The Name of the GA instance.
     */
    public readonly acceleratorName!: pulumi.Output<string | undefined>;
    /**
     * Auto renewal period of an instance, in the unit of month. The value range is 1-12.
     */
    public readonly autoRenewDuration!: pulumi.Output<number | undefined>;
    /**
     * Use coupons to pay bills automatically. Default value is `false`. Valid value: `true`: Use, `false`: Not used.
     */
    public readonly autoUseCoupon!: pulumi.Output<boolean | undefined>;
    /**
     * Descriptive information of the global acceleration instance.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The subscription duration. **NOTE:** Starting from v1.150.0+, the `duration` and  `pricingCycle` are both required.
     * * If the `pricingCycle` parameter is set to `Month`, the valid values for the `duration` parameter are 1 to 9.
     * * If the `pricingCycle` parameter is set to `Year`, the valid values for the `duration` parameter are 1 to 3.
     */
    public readonly duration!: pulumi.Output<number>;
    /**
     * The billing cycle of the GA instance. Valid values: `Month`,`Year`. The default value: `Month`.
     * * `Month`: billed on a monthly basis.
     * * `Year`: billed on an annual basis.
     */
    public readonly pricingCycle!: pulumi.Output<string>;
    /**
     * Whether to renew an accelerator automatically or not. Default to "Normal". Valid values:
     * - `AutoRenewal`: Enable auto renewal.
     * - `Normal`: Disable auto renewal.
     * - `NotRenewal`: No renewal any longer. After you specify this value, Alibaba Cloud stop sending notification of instance expiry, and only gives a brief reminder on the third day before the instance expiry.
     */
    public readonly renewalStatus!: pulumi.Output<string>;
    /**
     * The instance type of the GA instance. Specification of global acceleration instance, value:
     * `1`: Small 1.
     * `2`: Small 2.
     * `3`: Small 3.
     * `5`: Medium 1.
     * `8`: Medium 2.
     * `10`: Medium 3.
     */
    public readonly spec!: pulumi.Output<string>;
    /**
     * The status of the GA instance.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a Accelerator resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AcceleratorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AcceleratorArgs | AcceleratorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AcceleratorState | undefined;
            resourceInputs["acceleratorName"] = state ? state.acceleratorName : undefined;
            resourceInputs["autoRenewDuration"] = state ? state.autoRenewDuration : undefined;
            resourceInputs["autoUseCoupon"] = state ? state.autoUseCoupon : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["duration"] = state ? state.duration : undefined;
            resourceInputs["pricingCycle"] = state ? state.pricingCycle : undefined;
            resourceInputs["renewalStatus"] = state ? state.renewalStatus : undefined;
            resourceInputs["spec"] = state ? state.spec : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as AcceleratorArgs | undefined;
            if ((!args || args.duration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'duration'");
            }
            if ((!args || args.spec === undefined) && !opts.urn) {
                throw new Error("Missing required property 'spec'");
            }
            resourceInputs["acceleratorName"] = args ? args.acceleratorName : undefined;
            resourceInputs["autoRenewDuration"] = args ? args.autoRenewDuration : undefined;
            resourceInputs["autoUseCoupon"] = args ? args.autoUseCoupon : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["duration"] = args ? args.duration : undefined;
            resourceInputs["pricingCycle"] = args ? args.pricingCycle : undefined;
            resourceInputs["renewalStatus"] = args ? args.renewalStatus : undefined;
            resourceInputs["spec"] = args ? args.spec : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Accelerator.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Accelerator resources.
 */
export interface AcceleratorState {
    /**
     * The Name of the GA instance.
     */
    acceleratorName?: pulumi.Input<string>;
    /**
     * Auto renewal period of an instance, in the unit of month. The value range is 1-12.
     */
    autoRenewDuration?: pulumi.Input<number>;
    /**
     * Use coupons to pay bills automatically. Default value is `false`. Valid value: `true`: Use, `false`: Not used.
     */
    autoUseCoupon?: pulumi.Input<boolean>;
    /**
     * Descriptive information of the global acceleration instance.
     */
    description?: pulumi.Input<string>;
    /**
     * The subscription duration. **NOTE:** Starting from v1.150.0+, the `duration` and  `pricingCycle` are both required.
     * * If the `pricingCycle` parameter is set to `Month`, the valid values for the `duration` parameter are 1 to 9.
     * * If the `pricingCycle` parameter is set to `Year`, the valid values for the `duration` parameter are 1 to 3.
     */
    duration?: pulumi.Input<number>;
    /**
     * The billing cycle of the GA instance. Valid values: `Month`,`Year`. The default value: `Month`.
     * * `Month`: billed on a monthly basis.
     * * `Year`: billed on an annual basis.
     */
    pricingCycle?: pulumi.Input<string>;
    /**
     * Whether to renew an accelerator automatically or not. Default to "Normal". Valid values:
     * - `AutoRenewal`: Enable auto renewal.
     * - `Normal`: Disable auto renewal.
     * - `NotRenewal`: No renewal any longer. After you specify this value, Alibaba Cloud stop sending notification of instance expiry, and only gives a brief reminder on the third day before the instance expiry.
     */
    renewalStatus?: pulumi.Input<string>;
    /**
     * The instance type of the GA instance. Specification of global acceleration instance, value:
     * `1`: Small 1.
     * `2`: Small 2.
     * `3`: Small 3.
     * `5`: Medium 1.
     * `8`: Medium 2.
     * `10`: Medium 3.
     */
    spec?: pulumi.Input<string>;
    /**
     * The status of the GA instance.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Accelerator resource.
 */
export interface AcceleratorArgs {
    /**
     * The Name of the GA instance.
     */
    acceleratorName?: pulumi.Input<string>;
    /**
     * Auto renewal period of an instance, in the unit of month. The value range is 1-12.
     */
    autoRenewDuration?: pulumi.Input<number>;
    /**
     * Use coupons to pay bills automatically. Default value is `false`. Valid value: `true`: Use, `false`: Not used.
     */
    autoUseCoupon?: pulumi.Input<boolean>;
    /**
     * Descriptive information of the global acceleration instance.
     */
    description?: pulumi.Input<string>;
    /**
     * The subscription duration. **NOTE:** Starting from v1.150.0+, the `duration` and  `pricingCycle` are both required.
     * * If the `pricingCycle` parameter is set to `Month`, the valid values for the `duration` parameter are 1 to 9.
     * * If the `pricingCycle` parameter is set to `Year`, the valid values for the `duration` parameter are 1 to 3.
     */
    duration: pulumi.Input<number>;
    /**
     * The billing cycle of the GA instance. Valid values: `Month`,`Year`. The default value: `Month`.
     * * `Month`: billed on a monthly basis.
     * * `Year`: billed on an annual basis.
     */
    pricingCycle?: pulumi.Input<string>;
    /**
     * Whether to renew an accelerator automatically or not. Default to "Normal". Valid values:
     * - `AutoRenewal`: Enable auto renewal.
     * - `Normal`: Disable auto renewal.
     * - `NotRenewal`: No renewal any longer. After you specify this value, Alibaba Cloud stop sending notification of instance expiry, and only gives a brief reminder on the third day before the instance expiry.
     */
    renewalStatus?: pulumi.Input<string>;
    /**
     * The instance type of the GA instance. Specification of global acceleration instance, value:
     * `1`: Small 1.
     * `2`: Small 2.
     * `3`: Small 3.
     * `5`: Medium 1.
     * `8`: Medium 2.
     * `10`: Medium 3.
     */
    spec: pulumi.Input<string>;
}
