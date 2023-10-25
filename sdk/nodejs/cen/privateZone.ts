// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This topic describes how to configure PrivateZone access.
 * PrivateZone is a VPC-based resolution and management service for private domain names.
 * After you set a PrivateZone access, the Cloud Connect Network (CCN) and Virtual Border Router (VBR) attached to a CEN instance can access the PrivateZone service through CEN.
 *
 * For information about CEN Private Zone and how to use it, see [Manage CEN Private Zone](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-cbn-2017-09-12-routeprivatezoneincentovpc).
 *
 * > **NOTE:** Available since v1.83.0.
 *
 * ## Import
 *
 * CEN Private Zone can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cen/privateZone:PrivateZone example cen-abc123456:cn-hangzhou
 * ```
 */
export class PrivateZone extends pulumi.CustomResource {
    /**
     * Get an existing PrivateZone resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PrivateZoneState, opts?: pulumi.CustomResourceOptions): PrivateZone {
        return new PrivateZone(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cen/privateZone:PrivateZone';

    /**
     * Returns true if the given object is an instance of PrivateZone.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PrivateZone {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PrivateZone.__pulumiType;
    }

    /**
     * The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
     */
    public readonly accessRegionId!: pulumi.Output<string>;
    /**
     * The ID of the CEN instance.
     */
    public readonly cenId!: pulumi.Output<string>;
    /**
     * The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
     */
    public readonly hostRegionId!: pulumi.Output<string>;
    /**
     * The VPC that belongs to the service region.
     *
     * ->**NOTE:** The "alicloud.cen.PrivateZone" resource depends on the related "alicloud.cen.InstanceAttachment" resource.
     */
    public readonly hostVpcId!: pulumi.Output<string>;
    /**
     * The status of the PrivateZone service. Valid values: ["Creating", "Active", "Deleting"].
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a PrivateZone resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PrivateZoneArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PrivateZoneArgs | PrivateZoneState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PrivateZoneState | undefined;
            resourceInputs["accessRegionId"] = state ? state.accessRegionId : undefined;
            resourceInputs["cenId"] = state ? state.cenId : undefined;
            resourceInputs["hostRegionId"] = state ? state.hostRegionId : undefined;
            resourceInputs["hostVpcId"] = state ? state.hostVpcId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as PrivateZoneArgs | undefined;
            if ((!args || args.accessRegionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessRegionId'");
            }
            if ((!args || args.cenId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cenId'");
            }
            if ((!args || args.hostRegionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostRegionId'");
            }
            if ((!args || args.hostVpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostVpcId'");
            }
            resourceInputs["accessRegionId"] = args ? args.accessRegionId : undefined;
            resourceInputs["cenId"] = args ? args.cenId : undefined;
            resourceInputs["hostRegionId"] = args ? args.hostRegionId : undefined;
            resourceInputs["hostVpcId"] = args ? args.hostVpcId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PrivateZone.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PrivateZone resources.
 */
export interface PrivateZoneState {
    /**
     * The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
     */
    accessRegionId?: pulumi.Input<string>;
    /**
     * The ID of the CEN instance.
     */
    cenId?: pulumi.Input<string>;
    /**
     * The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
     */
    hostRegionId?: pulumi.Input<string>;
    /**
     * The VPC that belongs to the service region.
     *
     * ->**NOTE:** The "alicloud.cen.PrivateZone" resource depends on the related "alicloud.cen.InstanceAttachment" resource.
     */
    hostVpcId?: pulumi.Input<string>;
    /**
     * The status of the PrivateZone service. Valid values: ["Creating", "Active", "Deleting"].
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PrivateZone resource.
 */
export interface PrivateZoneArgs {
    /**
     * The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
     */
    accessRegionId: pulumi.Input<string>;
    /**
     * The ID of the CEN instance.
     */
    cenId: pulumi.Input<string>;
    /**
     * The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
     */
    hostRegionId: pulumi.Input<string>;
    /**
     * The VPC that belongs to the service region.
     *
     * ->**NOTE:** The "alicloud.cen.PrivateZone" resource depends on the related "alicloud.cen.InstanceAttachment" resource.
     */
    hostVpcId: pulumi.Input<string>;
}
