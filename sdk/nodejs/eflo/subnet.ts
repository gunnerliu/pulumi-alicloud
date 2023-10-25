// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Eflo Subnet resource.
 *
 * For information about Eflo Subnet and how to use it, see [What is Subnet](https://www.alibabacloud.com/help/en/pai/user-guide/overview-of-intelligent-computing-lingjun).
 *
 * > **NOTE:** Available since v1.204.0.
 *
 * ## Import
 *
 * Eflo Subnet can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:eflo/subnet:Subnet example <vpd_id>:<subnet_id>
 * ```
 */
export class Subnet extends pulumi.CustomResource {
    /**
     * Get an existing Subnet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SubnetState, opts?: pulumi.CustomResourceOptions): Subnet {
        return new Subnet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:eflo/subnet:Subnet';

    /**
     * Returns true if the given object is an instance of Subnet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Subnet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Subnet.__pulumiType;
    }

    /**
     * CIDR network segment.
     */
    public readonly cidr!: pulumi.Output<string>;
    /**
     * The creation time of the resource.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Modification time.
     */
    public /*out*/ readonly gmtModified!: pulumi.Output<string>;
    /**
     * Error message.
     */
    public /*out*/ readonly message!: pulumi.Output<string>;
    /**
     * Resource Group ID.
     */
    public /*out*/ readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The id of the subnet.
     */
    public /*out*/ readonly subnetId!: pulumi.Output<string>;
    /**
     * The Subnet name.
     */
    public readonly subnetName!: pulumi.Output<string>;
    /**
     * Eflo subnet usage type. optional value:
     * - General type is not filled in
     * - OOB:OOB type
     * - LB: LB type
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * The Eflo VPD ID.
     */
    public readonly vpdId!: pulumi.Output<string>;
    /**
     * The zone ID  of the resource.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a Subnet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SubnetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SubnetArgs | SubnetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SubnetState | undefined;
            resourceInputs["cidr"] = state ? state.cidr : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["gmtModified"] = state ? state.gmtModified : undefined;
            resourceInputs["message"] = state ? state.message : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["subnetId"] = state ? state.subnetId : undefined;
            resourceInputs["subnetName"] = state ? state.subnetName : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["vpdId"] = state ? state.vpdId : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as SubnetArgs | undefined;
            if ((!args || args.cidr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cidr'");
            }
            if ((!args || args.subnetName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetName'");
            }
            if ((!args || args.vpdId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpdId'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["cidr"] = args ? args.cidr : undefined;
            resourceInputs["subnetName"] = args ? args.subnetName : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["vpdId"] = args ? args.vpdId : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["gmtModified"] = undefined /*out*/;
            resourceInputs["message"] = undefined /*out*/;
            resourceInputs["resourceGroupId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["subnetId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Subnet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Subnet resources.
 */
export interface SubnetState {
    /**
     * CIDR network segment.
     */
    cidr?: pulumi.Input<string>;
    /**
     * The creation time of the resource.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Modification time.
     */
    gmtModified?: pulumi.Input<string>;
    /**
     * Error message.
     */
    message?: pulumi.Input<string>;
    /**
     * Resource Group ID.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * The id of the subnet.
     */
    subnetId?: pulumi.Input<string>;
    /**
     * The Subnet name.
     */
    subnetName?: pulumi.Input<string>;
    /**
     * Eflo subnet usage type. optional value:
     * - General type is not filled in
     * - OOB:OOB type
     * - LB: LB type
     */
    type?: pulumi.Input<string>;
    /**
     * The Eflo VPD ID.
     */
    vpdId?: pulumi.Input<string>;
    /**
     * The zone ID  of the resource.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Subnet resource.
 */
export interface SubnetArgs {
    /**
     * CIDR network segment.
     */
    cidr: pulumi.Input<string>;
    /**
     * The Subnet name.
     */
    subnetName: pulumi.Input<string>;
    /**
     * Eflo subnet usage type. optional value:
     * - General type is not filled in
     * - OOB:OOB type
     * - LB: LB type
     */
    type?: pulumi.Input<string>;
    /**
     * The Eflo VPD ID.
     */
    vpdId: pulumi.Input<string>;
    /**
     * The zone ID  of the resource.
     */
    zoneId: pulumi.Input<string>;
}
