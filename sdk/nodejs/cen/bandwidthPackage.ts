// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * CEN bandwidth package can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cen/bandwidthPackage:BandwidthPackage example cenbwp-abc123456
 * ```
 */
export class BandwidthPackage extends pulumi.CustomResource {
    /**
     * Get an existing BandwidthPackage resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BandwidthPackageState, opts?: pulumi.CustomResourceOptions): BandwidthPackage {
        return new BandwidthPackage(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cen/bandwidthPackage:BandwidthPackage';

    /**
     * Returns true if the given object is an instance of BandwidthPackage.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BandwidthPackage {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BandwidthPackage.__pulumiType;
    }

    /**
     * The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
     */
    public readonly bandwidth!: pulumi.Output<number>;
    /**
     * The name of the bandwidth package. Defaults to null.
     *
     * ->**NOTE:** PrePaid mode will deduct fees from the account directly and the bandwidth package can't be deleted before expired time.
     *
     * ->**NOTE:** The PostPaid mode is only for test. Please open a ticket if you need.
     */
    public readonly cenBandwidthPackageName!: pulumi.Output<string>;
    /**
     * Field `chargeType` has been deprecated from version 1.97.0. Use `paymentType` and instead.
     *
     * @deprecated Field 'charge_type' has been deprecated from version 1.98.0. Use 'payment_type' and instead.
     */
    public readonly chargeType!: pulumi.Output<string>;
    /**
     * The description of the bandwidth package. Default to null.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The time of the bandwidth package to expire.
     */
    public /*out*/ readonly expiredTime!: pulumi.Output<string>;
    /**
     * The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
     */
    public readonly geographicRegionAId!: pulumi.Output<string>;
    /**
     * The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
     */
    public readonly geographicRegionBId!: pulumi.Output<string>;
    /**
     * Field `geographicRegionIds` has been deprecated from version 1.97.0. Use `geographicRegionAId` and `geographicRegionBId` instead.
     *
     * @deprecated Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead.
     */
    public readonly geographicRegionIds!: pulumi.Output<string[]>;
    /**
     * Field `name` has been deprecated from version 1.97.0. Use `cenBandwidthPackageName` and instead.
     *
     * @deprecated Field 'name' has been deprecated from version 1.98.0. Use 'cen_bandwidth_package_name' and instead.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PrePaid`. If set to PrePaid, the bandwidth package can't be deleted before expired time.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * The purchase period in month. Valid value: `1`, `2`, `3`, `6`, `12`.
     * > **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
     */
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * The association status of the bandwidth package.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a BandwidthPackage resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BandwidthPackageArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BandwidthPackageArgs | BandwidthPackageState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BandwidthPackageState | undefined;
            resourceInputs["bandwidth"] = state ? state.bandwidth : undefined;
            resourceInputs["cenBandwidthPackageName"] = state ? state.cenBandwidthPackageName : undefined;
            resourceInputs["chargeType"] = state ? state.chargeType : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["expiredTime"] = state ? state.expiredTime : undefined;
            resourceInputs["geographicRegionAId"] = state ? state.geographicRegionAId : undefined;
            resourceInputs["geographicRegionBId"] = state ? state.geographicRegionBId : undefined;
            resourceInputs["geographicRegionIds"] = state ? state.geographicRegionIds : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as BandwidthPackageArgs | undefined;
            if ((!args || args.bandwidth === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bandwidth'");
            }
            resourceInputs["bandwidth"] = args ? args.bandwidth : undefined;
            resourceInputs["cenBandwidthPackageName"] = args ? args.cenBandwidthPackageName : undefined;
            resourceInputs["chargeType"] = args ? args.chargeType : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["geographicRegionAId"] = args ? args.geographicRegionAId : undefined;
            resourceInputs["geographicRegionBId"] = args ? args.geographicRegionBId : undefined;
            resourceInputs["geographicRegionIds"] = args ? args.geographicRegionIds : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["expiredTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BandwidthPackage.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BandwidthPackage resources.
 */
export interface BandwidthPackageState {
    /**
     * The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
     */
    bandwidth?: pulumi.Input<number>;
    /**
     * The name of the bandwidth package. Defaults to null.
     *
     * ->**NOTE:** PrePaid mode will deduct fees from the account directly and the bandwidth package can't be deleted before expired time.
     *
     * ->**NOTE:** The PostPaid mode is only for test. Please open a ticket if you need.
     */
    cenBandwidthPackageName?: pulumi.Input<string>;
    /**
     * Field `chargeType` has been deprecated from version 1.97.0. Use `paymentType` and instead.
     *
     * @deprecated Field 'charge_type' has been deprecated from version 1.98.0. Use 'payment_type' and instead.
     */
    chargeType?: pulumi.Input<string>;
    /**
     * The description of the bandwidth package. Default to null.
     */
    description?: pulumi.Input<string>;
    /**
     * The time of the bandwidth package to expire.
     */
    expiredTime?: pulumi.Input<string>;
    /**
     * The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
     */
    geographicRegionAId?: pulumi.Input<string>;
    /**
     * The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
     */
    geographicRegionBId?: pulumi.Input<string>;
    /**
     * Field `geographicRegionIds` has been deprecated from version 1.97.0. Use `geographicRegionAId` and `geographicRegionBId` instead.
     *
     * @deprecated Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead.
     */
    geographicRegionIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Field `name` has been deprecated from version 1.97.0. Use `cenBandwidthPackageName` and instead.
     *
     * @deprecated Field 'name' has been deprecated from version 1.98.0. Use 'cen_bandwidth_package_name' and instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PrePaid`. If set to PrePaid, the bandwidth package can't be deleted before expired time.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The purchase period in month. Valid value: `1`, `2`, `3`, `6`, `12`.
     * > **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
     */
    period?: pulumi.Input<number>;
    /**
     * The association status of the bandwidth package.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BandwidthPackage resource.
 */
export interface BandwidthPackageArgs {
    /**
     * The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
     */
    bandwidth: pulumi.Input<number>;
    /**
     * The name of the bandwidth package. Defaults to null.
     *
     * ->**NOTE:** PrePaid mode will deduct fees from the account directly and the bandwidth package can't be deleted before expired time.
     *
     * ->**NOTE:** The PostPaid mode is only for test. Please open a ticket if you need.
     */
    cenBandwidthPackageName?: pulumi.Input<string>;
    /**
     * Field `chargeType` has been deprecated from version 1.97.0. Use `paymentType` and instead.
     *
     * @deprecated Field 'charge_type' has been deprecated from version 1.98.0. Use 'payment_type' and instead.
     */
    chargeType?: pulumi.Input<string>;
    /**
     * The description of the bandwidth package. Default to null.
     */
    description?: pulumi.Input<string>;
    /**
     * The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
     */
    geographicRegionAId?: pulumi.Input<string>;
    /**
     * The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
     */
    geographicRegionBId?: pulumi.Input<string>;
    /**
     * Field `geographicRegionIds` has been deprecated from version 1.97.0. Use `geographicRegionAId` and `geographicRegionBId` instead.
     *
     * @deprecated Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead.
     */
    geographicRegionIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Field `name` has been deprecated from version 1.97.0. Use `cenBandwidthPackageName` and instead.
     *
     * @deprecated Field 'name' has been deprecated from version 1.98.0. Use 'cen_bandwidth_package_name' and instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PrePaid`. If set to PrePaid, the bandwidth package can't be deleted before expired time.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The purchase period in month. Valid value: `1`, `2`, `3`, `6`, `12`.
     * > **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
     */
    period?: pulumi.Input<number>;
}
