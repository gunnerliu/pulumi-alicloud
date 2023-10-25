// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Express Connect Router Interface resource.
 *
 * For information about Express Connect Router Interface and how to use it, see What is Router Interface.
 *
 * > **NOTE:** Available since v1.199.0.
 *
 * ## Import
 *
 * Express Connect Router Interface can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:expressconnect/routerInterface:RouterInterface example <id>
 * ```
 */
export class RouterInterface extends pulumi.CustomResource {
    /**
     * Get an existing RouterInterface resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouterInterfaceState, opts?: pulumi.CustomResourceOptions): RouterInterface {
        return new RouterInterface(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:expressconnect/routerInterface:RouterInterface';

    /**
     * Returns true if the given object is an instance of RouterInterface.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RouterInterface {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RouterInterface.__pulumiType;
    }

    /**
     * The access point ID to which the VBR belongs.
     */
    public readonly accessPointId!: pulumi.Output<string | undefined>;
    /**
     * Whether to pay automatically, value:-**false** (default): automatic payment is not enabled. After generating an order, you need to complete the payment at the order center.-**true**: Enable automatic payment to automatically pay for orders.> **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     */
    public readonly autoPay!: pulumi.Output<boolean | undefined>;
    /**
     * The bandwidth of the resource.
     */
    public /*out*/ readonly bandwidth!: pulumi.Output<number>;
    /**
     * The businessStatus of the resource. Valid Values: `Normal`, `FinancialLocked`, `SecurityLocked`.
     */
    public /*out*/ readonly businessStatus!: pulumi.Output<string>;
    /**
     * The connected time of the resource.
     */
    public /*out*/ readonly connectedTime!: pulumi.Output<string>;
    /**
     * The creation time of the resource.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The cross border of the resource.
     */
    public /*out*/ readonly crossBorder!: pulumi.Output<boolean>;
    /**
     * Whether to delete the health check IP address configured on the router interface. Value:-**true**: deletes the health check IP address.-**false** (default): does not delete the health check IP address.
     */
    public readonly deleteHealthCheckIp!: pulumi.Output<boolean | undefined>;
    /**
     * The description of the router interface. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The end time of the resource.
     */
    public /*out*/ readonly endTime!: pulumi.Output<string>;
    /**
     * The has reservation data of the resource.
     */
    public /*out*/ readonly hasReservationData!: pulumi.Output<string>;
    /**
     * The health check rate. Unit: seconds. The recommended value is 2. This indicates the interval between successive probe messages sent during the specified health check.
     */
    public readonly hcRate!: pulumi.Output<number | undefined>;
    /**
     * The health check thresholds. Unit: pcs. The recommended value is 8. This indicates the number of probe messages to be sent during the specified health check.
     */
    public readonly hcThreshold!: pulumi.Output<string | undefined>;
    /**
     * The health check source IP address, must be an unused IP within the local VPC.
     */
    public readonly healthCheckSourceIp!: pulumi.Output<string | undefined>;
    /**
     * The IP address for health screening purposes.
     */
    public readonly healthCheckTargetIp!: pulumi.Output<string | undefined>;
    /**
     * The Access point ID to which the other end belongs.
     */
    public readonly oppositeAccessPointId!: pulumi.Output<string | undefined>;
    /**
     * The opposite bandwidth of the router on the other side.
     */
    public /*out*/ readonly oppositeBandwidth!: pulumi.Output<number>;
    /**
     * The opposite interface business status of the router on the other side. Valid Values: `Normal`, `FinancialLocked`, `SecurityLocked`.
     */
    public /*out*/ readonly oppositeInterfaceBusinessStatus!: pulumi.Output<string>;
    /**
     * The Interface ID of the router at the other end.
     */
    public readonly oppositeInterfaceId!: pulumi.Output<string | undefined>;
    /**
     * The AliCloud account ID of the owner of the router interface on the other end.
     */
    public readonly oppositeInterfaceOwnerId!: pulumi.Output<string | undefined>;
    /**
     * The opposite interface spec of the router on the other side. Valid Values: `Mini.2`, `Mini.5`, `Mini.5`, `Small.2`, `Small.5`, `Middle.1`, `Middle.2`, `Middle.5`, `Large.1`, `Large.2`, `Large.5`, `XLarge.1`, `Negative`.
     */
    public /*out*/ readonly oppositeInterfaceSpec!: pulumi.Output<string>;
    /**
     * The opposite interface status of the router on the other side. Valid Values: `Idle`, `AcceptingConnecting`, `Connecting`, `Activating`, `Active`, `Modifying`, `Deactivating`, `Inactive`, `Deleting`.
     */
    public /*out*/ readonly oppositeInterfaceStatus!: pulumi.Output<string>;
    /**
     * The geographical ID of the location of the receiving end of the connection.
     */
    public readonly oppositeRegionId!: pulumi.Output<string>;
    /**
     * The id of the router at the other end.
     */
    public readonly oppositeRouterId!: pulumi.Output<string | undefined>;
    /**
     * The opposite router type of the router on the other side. Valid Values: `VRouter`, `VBR`.
     */
    public readonly oppositeRouterType!: pulumi.Output<string>;
    /**
     * The opposite vpc instance id of the router on the other side.
     */
    public /*out*/ readonly oppositeVpcInstanceId!: pulumi.Output<string>;
    /**
     * The payment methods for router interfaces. Valid Values: `PayAsYouGo`, `Subscription`.
     */
    public readonly paymentType!: pulumi.Output<string | undefined>;
    /**
     * Purchase duration, value:-When you choose to pay on a monthly basis, the value range is **1 to 9 * *.-When you choose to pay per year, the value range is **1 to 3 * *.> **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     */
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * The billing cycle of the prepaid fee. Valid values:-**Month** (default): monthly payment.-**Year**: Pay per Year.> **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     */
    public readonly pricingCycle!: pulumi.Output<string | undefined>;
    /**
     * The reservation active time of the resource.
     */
    public /*out*/ readonly reservationActiveTime!: pulumi.Output<string>;
    /**
     * The reservation bandwidth of the resource.
     */
    public /*out*/ readonly reservationBandwidth!: pulumi.Output<string>;
    /**
     * The reservation internet charge type of the resource.
     */
    public /*out*/ readonly reservationInternetChargeType!: pulumi.Output<string>;
    /**
     * The reservation order type of the resource.
     */
    public /*out*/ readonly reservationOrderType!: pulumi.Output<string>;
    /**
     * The role of the router interface. Valid Values: `InitiatingSide`, `AcceptingSide`.
     */
    public readonly role!: pulumi.Output<string>;
    /**
     * The router id associated with the router interface.
     */
    public readonly routerId!: pulumi.Output<string>;
    /**
     * The first ID of the resource.
     */
    public readonly routerInterfaceId!: pulumi.Output<string>;
    /**
     * The name of the resource.
     */
    public readonly routerInterfaceName!: pulumi.Output<string | undefined>;
    /**
     * The type of router associated with the router interface. Valid Values: `VRouter`, `VBR`.
     */
    public readonly routerType!: pulumi.Output<string>;
    /**
     * The specification of the router interface. Valid Values: `Mini.2`, `Mini.5`, `Mini.5`, `Small.2`, `Small.5`, `Middle.1`, `Middle.2`, `Middle.5`, `Large.1`, `Large.2`, `Large.5`, `XLarge.1`, `Negative`.
     */
    public readonly spec!: pulumi.Output<string>;
    /**
     * The status of the resource. Valid Values: `Idle`, `AcceptingConnecting`, `Connecting`, `Activating`, `Active`, `Modifying`, `Deactivating`, `Inactive`, `Deleting`.
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The vpc instance id of the resource.
     */
    public /*out*/ readonly vpcInstanceId!: pulumi.Output<string>;

    /**
     * Create a RouterInterface resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouterInterfaceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RouterInterfaceArgs | RouterInterfaceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RouterInterfaceState | undefined;
            resourceInputs["accessPointId"] = state ? state.accessPointId : undefined;
            resourceInputs["autoPay"] = state ? state.autoPay : undefined;
            resourceInputs["bandwidth"] = state ? state.bandwidth : undefined;
            resourceInputs["businessStatus"] = state ? state.businessStatus : undefined;
            resourceInputs["connectedTime"] = state ? state.connectedTime : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["crossBorder"] = state ? state.crossBorder : undefined;
            resourceInputs["deleteHealthCheckIp"] = state ? state.deleteHealthCheckIp : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["endTime"] = state ? state.endTime : undefined;
            resourceInputs["hasReservationData"] = state ? state.hasReservationData : undefined;
            resourceInputs["hcRate"] = state ? state.hcRate : undefined;
            resourceInputs["hcThreshold"] = state ? state.hcThreshold : undefined;
            resourceInputs["healthCheckSourceIp"] = state ? state.healthCheckSourceIp : undefined;
            resourceInputs["healthCheckTargetIp"] = state ? state.healthCheckTargetIp : undefined;
            resourceInputs["oppositeAccessPointId"] = state ? state.oppositeAccessPointId : undefined;
            resourceInputs["oppositeBandwidth"] = state ? state.oppositeBandwidth : undefined;
            resourceInputs["oppositeInterfaceBusinessStatus"] = state ? state.oppositeInterfaceBusinessStatus : undefined;
            resourceInputs["oppositeInterfaceId"] = state ? state.oppositeInterfaceId : undefined;
            resourceInputs["oppositeInterfaceOwnerId"] = state ? state.oppositeInterfaceOwnerId : undefined;
            resourceInputs["oppositeInterfaceSpec"] = state ? state.oppositeInterfaceSpec : undefined;
            resourceInputs["oppositeInterfaceStatus"] = state ? state.oppositeInterfaceStatus : undefined;
            resourceInputs["oppositeRegionId"] = state ? state.oppositeRegionId : undefined;
            resourceInputs["oppositeRouterId"] = state ? state.oppositeRouterId : undefined;
            resourceInputs["oppositeRouterType"] = state ? state.oppositeRouterType : undefined;
            resourceInputs["oppositeVpcInstanceId"] = state ? state.oppositeVpcInstanceId : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["pricingCycle"] = state ? state.pricingCycle : undefined;
            resourceInputs["reservationActiveTime"] = state ? state.reservationActiveTime : undefined;
            resourceInputs["reservationBandwidth"] = state ? state.reservationBandwidth : undefined;
            resourceInputs["reservationInternetChargeType"] = state ? state.reservationInternetChargeType : undefined;
            resourceInputs["reservationOrderType"] = state ? state.reservationOrderType : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["routerId"] = state ? state.routerId : undefined;
            resourceInputs["routerInterfaceId"] = state ? state.routerInterfaceId : undefined;
            resourceInputs["routerInterfaceName"] = state ? state.routerInterfaceName : undefined;
            resourceInputs["routerType"] = state ? state.routerType : undefined;
            resourceInputs["spec"] = state ? state.spec : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["vpcInstanceId"] = state ? state.vpcInstanceId : undefined;
        } else {
            const args = argsOrState as RouterInterfaceArgs | undefined;
            if ((!args || args.oppositeRegionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oppositeRegionId'");
            }
            if ((!args || args.role === undefined) && !opts.urn) {
                throw new Error("Missing required property 'role'");
            }
            if ((!args || args.routerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'routerId'");
            }
            if ((!args || args.routerType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'routerType'");
            }
            if ((!args || args.spec === undefined) && !opts.urn) {
                throw new Error("Missing required property 'spec'");
            }
            resourceInputs["accessPointId"] = args ? args.accessPointId : undefined;
            resourceInputs["autoPay"] = args ? args.autoPay : undefined;
            resourceInputs["deleteHealthCheckIp"] = args ? args.deleteHealthCheckIp : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["hcRate"] = args ? args.hcRate : undefined;
            resourceInputs["hcThreshold"] = args ? args.hcThreshold : undefined;
            resourceInputs["healthCheckSourceIp"] = args ? args.healthCheckSourceIp : undefined;
            resourceInputs["healthCheckTargetIp"] = args ? args.healthCheckTargetIp : undefined;
            resourceInputs["oppositeAccessPointId"] = args ? args.oppositeAccessPointId : undefined;
            resourceInputs["oppositeInterfaceId"] = args ? args.oppositeInterfaceId : undefined;
            resourceInputs["oppositeInterfaceOwnerId"] = args ? args.oppositeInterfaceOwnerId : undefined;
            resourceInputs["oppositeRegionId"] = args ? args.oppositeRegionId : undefined;
            resourceInputs["oppositeRouterId"] = args ? args.oppositeRouterId : undefined;
            resourceInputs["oppositeRouterType"] = args ? args.oppositeRouterType : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["pricingCycle"] = args ? args.pricingCycle : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["routerId"] = args ? args.routerId : undefined;
            resourceInputs["routerInterfaceId"] = args ? args.routerInterfaceId : undefined;
            resourceInputs["routerInterfaceName"] = args ? args.routerInterfaceName : undefined;
            resourceInputs["routerType"] = args ? args.routerType : undefined;
            resourceInputs["spec"] = args ? args.spec : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["bandwidth"] = undefined /*out*/;
            resourceInputs["businessStatus"] = undefined /*out*/;
            resourceInputs["connectedTime"] = undefined /*out*/;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["crossBorder"] = undefined /*out*/;
            resourceInputs["endTime"] = undefined /*out*/;
            resourceInputs["hasReservationData"] = undefined /*out*/;
            resourceInputs["oppositeBandwidth"] = undefined /*out*/;
            resourceInputs["oppositeInterfaceBusinessStatus"] = undefined /*out*/;
            resourceInputs["oppositeInterfaceSpec"] = undefined /*out*/;
            resourceInputs["oppositeInterfaceStatus"] = undefined /*out*/;
            resourceInputs["oppositeVpcInstanceId"] = undefined /*out*/;
            resourceInputs["reservationActiveTime"] = undefined /*out*/;
            resourceInputs["reservationBandwidth"] = undefined /*out*/;
            resourceInputs["reservationInternetChargeType"] = undefined /*out*/;
            resourceInputs["reservationOrderType"] = undefined /*out*/;
            resourceInputs["vpcInstanceId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RouterInterface.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RouterInterface resources.
 */
export interface RouterInterfaceState {
    /**
     * The access point ID to which the VBR belongs.
     */
    accessPointId?: pulumi.Input<string>;
    /**
     * Whether to pay automatically, value:-**false** (default): automatic payment is not enabled. After generating an order, you need to complete the payment at the order center.-**true**: Enable automatic payment to automatically pay for orders.> **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     */
    autoPay?: pulumi.Input<boolean>;
    /**
     * The bandwidth of the resource.
     */
    bandwidth?: pulumi.Input<number>;
    /**
     * The businessStatus of the resource. Valid Values: `Normal`, `FinancialLocked`, `SecurityLocked`.
     */
    businessStatus?: pulumi.Input<string>;
    /**
     * The connected time of the resource.
     */
    connectedTime?: pulumi.Input<string>;
    /**
     * The creation time of the resource.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The cross border of the resource.
     */
    crossBorder?: pulumi.Input<boolean>;
    /**
     * Whether to delete the health check IP address configured on the router interface. Value:-**true**: deletes the health check IP address.-**false** (default): does not delete the health check IP address.
     */
    deleteHealthCheckIp?: pulumi.Input<boolean>;
    /**
     * The description of the router interface. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     */
    description?: pulumi.Input<string>;
    /**
     * The end time of the resource.
     */
    endTime?: pulumi.Input<string>;
    /**
     * The has reservation data of the resource.
     */
    hasReservationData?: pulumi.Input<string>;
    /**
     * The health check rate. Unit: seconds. The recommended value is 2. This indicates the interval between successive probe messages sent during the specified health check.
     */
    hcRate?: pulumi.Input<number>;
    /**
     * The health check thresholds. Unit: pcs. The recommended value is 8. This indicates the number of probe messages to be sent during the specified health check.
     */
    hcThreshold?: pulumi.Input<string>;
    /**
     * The health check source IP address, must be an unused IP within the local VPC.
     */
    healthCheckSourceIp?: pulumi.Input<string>;
    /**
     * The IP address for health screening purposes.
     */
    healthCheckTargetIp?: pulumi.Input<string>;
    /**
     * The Access point ID to which the other end belongs.
     */
    oppositeAccessPointId?: pulumi.Input<string>;
    /**
     * The opposite bandwidth of the router on the other side.
     */
    oppositeBandwidth?: pulumi.Input<number>;
    /**
     * The opposite interface business status of the router on the other side. Valid Values: `Normal`, `FinancialLocked`, `SecurityLocked`.
     */
    oppositeInterfaceBusinessStatus?: pulumi.Input<string>;
    /**
     * The Interface ID of the router at the other end.
     */
    oppositeInterfaceId?: pulumi.Input<string>;
    /**
     * The AliCloud account ID of the owner of the router interface on the other end.
     */
    oppositeInterfaceOwnerId?: pulumi.Input<string>;
    /**
     * The opposite interface spec of the router on the other side. Valid Values: `Mini.2`, `Mini.5`, `Mini.5`, `Small.2`, `Small.5`, `Middle.1`, `Middle.2`, `Middle.5`, `Large.1`, `Large.2`, `Large.5`, `XLarge.1`, `Negative`.
     */
    oppositeInterfaceSpec?: pulumi.Input<string>;
    /**
     * The opposite interface status of the router on the other side. Valid Values: `Idle`, `AcceptingConnecting`, `Connecting`, `Activating`, `Active`, `Modifying`, `Deactivating`, `Inactive`, `Deleting`.
     */
    oppositeInterfaceStatus?: pulumi.Input<string>;
    /**
     * The geographical ID of the location of the receiving end of the connection.
     */
    oppositeRegionId?: pulumi.Input<string>;
    /**
     * The id of the router at the other end.
     */
    oppositeRouterId?: pulumi.Input<string>;
    /**
     * The opposite router type of the router on the other side. Valid Values: `VRouter`, `VBR`.
     */
    oppositeRouterType?: pulumi.Input<string>;
    /**
     * The opposite vpc instance id of the router on the other side.
     */
    oppositeVpcInstanceId?: pulumi.Input<string>;
    /**
     * The payment methods for router interfaces. Valid Values: `PayAsYouGo`, `Subscription`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * Purchase duration, value:-When you choose to pay on a monthly basis, the value range is **1 to 9 * *.-When you choose to pay per year, the value range is **1 to 3 * *.> **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     */
    period?: pulumi.Input<number>;
    /**
     * The billing cycle of the prepaid fee. Valid values:-**Month** (default): monthly payment.-**Year**: Pay per Year.> **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     */
    pricingCycle?: pulumi.Input<string>;
    /**
     * The reservation active time of the resource.
     */
    reservationActiveTime?: pulumi.Input<string>;
    /**
     * The reservation bandwidth of the resource.
     */
    reservationBandwidth?: pulumi.Input<string>;
    /**
     * The reservation internet charge type of the resource.
     */
    reservationInternetChargeType?: pulumi.Input<string>;
    /**
     * The reservation order type of the resource.
     */
    reservationOrderType?: pulumi.Input<string>;
    /**
     * The role of the router interface. Valid Values: `InitiatingSide`, `AcceptingSide`.
     */
    role?: pulumi.Input<string>;
    /**
     * The router id associated with the router interface.
     */
    routerId?: pulumi.Input<string>;
    /**
     * The first ID of the resource.
     */
    routerInterfaceId?: pulumi.Input<string>;
    /**
     * The name of the resource.
     */
    routerInterfaceName?: pulumi.Input<string>;
    /**
     * The type of router associated with the router interface. Valid Values: `VRouter`, `VBR`.
     */
    routerType?: pulumi.Input<string>;
    /**
     * The specification of the router interface. Valid Values: `Mini.2`, `Mini.5`, `Mini.5`, `Small.2`, `Small.5`, `Middle.1`, `Middle.2`, `Middle.5`, `Large.1`, `Large.2`, `Large.5`, `XLarge.1`, `Negative`.
     */
    spec?: pulumi.Input<string>;
    /**
     * The status of the resource. Valid Values: `Idle`, `AcceptingConnecting`, `Connecting`, `Activating`, `Active`, `Modifying`, `Deactivating`, `Inactive`, `Deleting`.
     */
    status?: pulumi.Input<string>;
    /**
     * The vpc instance id of the resource.
     */
    vpcInstanceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RouterInterface resource.
 */
export interface RouterInterfaceArgs {
    /**
     * The access point ID to which the VBR belongs.
     */
    accessPointId?: pulumi.Input<string>;
    /**
     * Whether to pay automatically, value:-**false** (default): automatic payment is not enabled. After generating an order, you need to complete the payment at the order center.-**true**: Enable automatic payment to automatically pay for orders.> **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     */
    autoPay?: pulumi.Input<boolean>;
    /**
     * Whether to delete the health check IP address configured on the router interface. Value:-**true**: deletes the health check IP address.-**false** (default): does not delete the health check IP address.
     */
    deleteHealthCheckIp?: pulumi.Input<boolean>;
    /**
     * The description of the router interface. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     */
    description?: pulumi.Input<string>;
    /**
     * The health check rate. Unit: seconds. The recommended value is 2. This indicates the interval between successive probe messages sent during the specified health check.
     */
    hcRate?: pulumi.Input<number>;
    /**
     * The health check thresholds. Unit: pcs. The recommended value is 8. This indicates the number of probe messages to be sent during the specified health check.
     */
    hcThreshold?: pulumi.Input<string>;
    /**
     * The health check source IP address, must be an unused IP within the local VPC.
     */
    healthCheckSourceIp?: pulumi.Input<string>;
    /**
     * The IP address for health screening purposes.
     */
    healthCheckTargetIp?: pulumi.Input<string>;
    /**
     * The Access point ID to which the other end belongs.
     */
    oppositeAccessPointId?: pulumi.Input<string>;
    /**
     * The Interface ID of the router at the other end.
     */
    oppositeInterfaceId?: pulumi.Input<string>;
    /**
     * The AliCloud account ID of the owner of the router interface on the other end.
     */
    oppositeInterfaceOwnerId?: pulumi.Input<string>;
    /**
     * The geographical ID of the location of the receiving end of the connection.
     */
    oppositeRegionId: pulumi.Input<string>;
    /**
     * The id of the router at the other end.
     */
    oppositeRouterId?: pulumi.Input<string>;
    /**
     * The opposite router type of the router on the other side. Valid Values: `VRouter`, `VBR`.
     */
    oppositeRouterType?: pulumi.Input<string>;
    /**
     * The payment methods for router interfaces. Valid Values: `PayAsYouGo`, `Subscription`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * Purchase duration, value:-When you choose to pay on a monthly basis, the value range is **1 to 9 * *.-When you choose to pay per year, the value range is **1 to 3 * *.> **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     */
    period?: pulumi.Input<number>;
    /**
     * The billing cycle of the prepaid fee. Valid values:-**Month** (default): monthly payment.-**Year**: Pay per Year.> **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     */
    pricingCycle?: pulumi.Input<string>;
    /**
     * The role of the router interface. Valid Values: `InitiatingSide`, `AcceptingSide`.
     */
    role: pulumi.Input<string>;
    /**
     * The router id associated with the router interface.
     */
    routerId: pulumi.Input<string>;
    /**
     * The first ID of the resource.
     */
    routerInterfaceId?: pulumi.Input<string>;
    /**
     * The name of the resource.
     */
    routerInterfaceName?: pulumi.Input<string>;
    /**
     * The type of router associated with the router interface. Valid Values: `VRouter`, `VBR`.
     */
    routerType: pulumi.Input<string>;
    /**
     * The specification of the router interface. Valid Values: `Mini.2`, `Mini.5`, `Mini.5`, `Small.2`, `Small.5`, `Middle.1`, `Middle.2`, `Middle.5`, `Large.1`, `Large.2`, `Large.5`, `XLarge.1`, `Negative`.
     */
    spec: pulumi.Input<string>;
    /**
     * The status of the resource. Valid Values: `Idle`, `AcceptingConnecting`, `Connecting`, `Activating`, `Active`, `Modifying`, `Deactivating`, `Inactive`, `Deleting`.
     */
    status?: pulumi.Input<string>;
}
