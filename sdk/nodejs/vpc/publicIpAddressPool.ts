// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Vpc Public Ip Address Pool resource.
 *
 * For information about Vpc Public Ip Address Pool and how to use it, see [What is Public Ip Address Pool](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/createpublicipaddresspool).
 *
 * > **NOTE:** Available since v1.186.0.
 *
 * ## Import
 *
 * Vpc Public Ip Address Pool can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:vpc/publicIpAddressPool:PublicIpAddressPool example <id>
 * ```
 */
export class PublicIpAddressPool extends pulumi.CustomResource {
    /**
     * Get an existing PublicIpAddressPool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PublicIpAddressPoolState, opts?: pulumi.CustomResourceOptions): PublicIpAddressPool {
        return new PublicIpAddressPool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/publicIpAddressPool:PublicIpAddressPool';

    /**
     * Returns true if the given object is an instance of PublicIpAddressPool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PublicIpAddressPool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PublicIpAddressPool.__pulumiType;
    }

    /**
     * The creation time of the resource.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether there is a free IP address.
     */
    public /*out*/ readonly ipAddressRemaining!: pulumi.Output<boolean>;
    /**
     * The Internet service provider. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`, `BGP_FinanceCloud`. Default Value: `BGP`.
     */
    public readonly isp!: pulumi.Output<string>;
    public /*out*/ readonly publicIpAddressPoolId!: pulumi.Output<string>;
    /**
     * The name of the VPC Public IP address pool.
     */
    public readonly publicIpAddressPoolName!: pulumi.Output<string | undefined>;
    /**
     * The resource group ID of the VPC Public IP address pool.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * The status of the VPC Public IP address pool.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The tags of PrefixList.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The total number of public IP address pools.
     */
    public /*out*/ readonly totalIpNum!: pulumi.Output<number>;
    /**
     * The number of used IP addresses in the public IP address pool.
     */
    public /*out*/ readonly usedIpNum!: pulumi.Output<number>;

    /**
     * Create a PublicIpAddressPool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PublicIpAddressPoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PublicIpAddressPoolArgs | PublicIpAddressPoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PublicIpAddressPoolState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["ipAddressRemaining"] = state ? state.ipAddressRemaining : undefined;
            resourceInputs["isp"] = state ? state.isp : undefined;
            resourceInputs["publicIpAddressPoolId"] = state ? state.publicIpAddressPoolId : undefined;
            resourceInputs["publicIpAddressPoolName"] = state ? state.publicIpAddressPoolName : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["totalIpNum"] = state ? state.totalIpNum : undefined;
            resourceInputs["usedIpNum"] = state ? state.usedIpNum : undefined;
        } else {
            const args = argsOrState as PublicIpAddressPoolArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["isp"] = args ? args.isp : undefined;
            resourceInputs["publicIpAddressPoolName"] = args ? args.publicIpAddressPoolName : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["ipAddressRemaining"] = undefined /*out*/;
            resourceInputs["publicIpAddressPoolId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["totalIpNum"] = undefined /*out*/;
            resourceInputs["usedIpNum"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PublicIpAddressPool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PublicIpAddressPool resources.
 */
export interface PublicIpAddressPoolState {
    /**
     * The creation time of the resource.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Description.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether there is a free IP address.
     */
    ipAddressRemaining?: pulumi.Input<boolean>;
    /**
     * The Internet service provider. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`, `BGP_FinanceCloud`. Default Value: `BGP`.
     */
    isp?: pulumi.Input<string>;
    publicIpAddressPoolId?: pulumi.Input<string>;
    /**
     * The name of the VPC Public IP address pool.
     */
    publicIpAddressPoolName?: pulumi.Input<string>;
    /**
     * The resource group ID of the VPC Public IP address pool.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The status of the VPC Public IP address pool.
     */
    status?: pulumi.Input<string>;
    /**
     * The tags of PrefixList.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The total number of public IP address pools.
     */
    totalIpNum?: pulumi.Input<number>;
    /**
     * The number of used IP addresses in the public IP address pool.
     */
    usedIpNum?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a PublicIpAddressPool resource.
 */
export interface PublicIpAddressPoolArgs {
    /**
     * Description.
     */
    description?: pulumi.Input<string>;
    /**
     * The Internet service provider. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`, `BGP_FinanceCloud`. Default Value: `BGP`.
     */
    isp?: pulumi.Input<string>;
    /**
     * The name of the VPC Public IP address pool.
     */
    publicIpAddressPoolName?: pulumi.Input<string>;
    /**
     * The resource group ID of the VPC Public IP address pool.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The tags of PrefixList.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
