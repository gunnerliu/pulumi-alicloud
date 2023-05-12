// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list of Route Entries owned by an Alibaba Cloud account.
 *
 * > **NOTE:** Available in 1.37.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultZones = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultInstanceTypes = defaultZones.then(defaultZones => alicloud.ecs.getInstanceTypes({
 *     availabilityZone: defaultZones.zones?.[0]?.id,
 *     cpuCoreCount: 1,
 *     memorySize: 2,
 * }));
 * const defaultImages = alicloud.ecs.getImages({
 *     mostRecent: true,
 *     nameRegex: "^ubuntu_18.*64",
 *     owners: "system",
 * });
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-testAccRouteEntryConfig";
 * const fooNetwork = new alicloud.vpc.Network("fooNetwork", {cidrBlock: "10.1.0.0/21"});
 * const fooSwitch = new alicloud.vpc.Switch("fooSwitch", {
 *     availabilityZone: defaultZones.then(defaultZones => defaultZones.zones?.[0]?.id),
 *     cidrBlock: "10.1.1.0/24",
 *     vpcId: fooNetwork.id,
 *     vswitchName: name,
 * });
 * const tfTestFoo = new alicloud.ecs.SecurityGroup("tfTestFoo", {
 *     description: "foo",
 *     vpcId: fooNetwork.id,
 * });
 * const fooInstance = new alicloud.ecs.Instance("fooInstance", {
 *     allocatePublicIp: true,
 *     imageId: defaultImages.then(defaultImages => defaultImages.images?.[0]?.id),
 *     instanceChargeType: "PostPaid",
 *     instanceName: name,
 *     instanceType: defaultInstanceTypes.then(defaultInstanceTypes => defaultInstanceTypes.instanceTypes?.[0]?.id),
 *     internetChargeType: "PayByTraffic",
 *     internetMaxBandwidthOut: 5,
 *     securityGroups: [tfTestFoo.id],
 *     systemDiskCategory: "cloud_efficiency",
 *     vswitchId: fooSwitch.id,
 * });
 * const fooRouteEntry = new alicloud.vpc.RouteEntry("fooRouteEntry", {
 *     destinationCidrblock: "172.11.1.1/32",
 *     nexthopId: fooInstance.id,
 *     nexthopType: "Instance",
 *     routeTableId: fooNetwork.routeTableId,
 * });
 * const ingress = new alicloud.ecs.SecurityGroupRule("ingress", {
 *     cidrIp: "0.0.0.0/0",
 *     ipProtocol: "tcp",
 *     nicType: "intranet",
 *     policy: "accept",
 *     portRange: "22/22",
 *     priority: 1,
 *     securityGroupId: tfTestFoo.id,
 *     type: "ingress",
 * });
 * const fooRouteEntries = alicloud.vpc.getRouteEntriesOutput({
 *     routeTableId: fooRouteEntry.routeTableId,
 * });
 * ```
 */
export function getRouteEntries(args: GetRouteEntriesArgs, opts?: pulumi.InvokeOptions): Promise<GetRouteEntriesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:vpc/getRouteEntries:getRouteEntries", {
        "cidrBlock": args.cidrBlock,
        "instanceId": args.instanceId,
        "outputFile": args.outputFile,
        "routeTableId": args.routeTableId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouteEntries.
 */
export interface GetRouteEntriesArgs {
    /**
     * The destination CIDR block of the route entry.
     */
    cidrBlock?: string;
    /**
     * The instance ID of the next hop.
     */
    instanceId?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the router table to which the route entry belongs.
     */
    routeTableId: string;
    /**
     * The type of the route entry.
     */
    type?: string;
}

/**
 * A collection of values returned by getRouteEntries.
 */
export interface GetRouteEntriesResult {
    /**
     * The destination CIDR block of the route entry.
     */
    readonly cidrBlock?: string;
    /**
     * A list of Route Entries. Each element contains the following attributes:
     */
    readonly entries: outputs.vpc.GetRouteEntriesEntry[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The instance ID of the next hop.
     */
    readonly instanceId?: string;
    readonly outputFile?: string;
    /**
     * The ID of the router table to which the route entry belongs.
     */
    readonly routeTableId: string;
    /**
     * The type of the route entry.
     */
    readonly type?: string;
}
/**
 * This data source provides a list of Route Entries owned by an Alibaba Cloud account.
 *
 * > **NOTE:** Available in 1.37.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultZones = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultInstanceTypes = defaultZones.then(defaultZones => alicloud.ecs.getInstanceTypes({
 *     availabilityZone: defaultZones.zones?.[0]?.id,
 *     cpuCoreCount: 1,
 *     memorySize: 2,
 * }));
 * const defaultImages = alicloud.ecs.getImages({
 *     mostRecent: true,
 *     nameRegex: "^ubuntu_18.*64",
 *     owners: "system",
 * });
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-testAccRouteEntryConfig";
 * const fooNetwork = new alicloud.vpc.Network("fooNetwork", {cidrBlock: "10.1.0.0/21"});
 * const fooSwitch = new alicloud.vpc.Switch("fooSwitch", {
 *     availabilityZone: defaultZones.then(defaultZones => defaultZones.zones?.[0]?.id),
 *     cidrBlock: "10.1.1.0/24",
 *     vpcId: fooNetwork.id,
 *     vswitchName: name,
 * });
 * const tfTestFoo = new alicloud.ecs.SecurityGroup("tfTestFoo", {
 *     description: "foo",
 *     vpcId: fooNetwork.id,
 * });
 * const fooInstance = new alicloud.ecs.Instance("fooInstance", {
 *     allocatePublicIp: true,
 *     imageId: defaultImages.then(defaultImages => defaultImages.images?.[0]?.id),
 *     instanceChargeType: "PostPaid",
 *     instanceName: name,
 *     instanceType: defaultInstanceTypes.then(defaultInstanceTypes => defaultInstanceTypes.instanceTypes?.[0]?.id),
 *     internetChargeType: "PayByTraffic",
 *     internetMaxBandwidthOut: 5,
 *     securityGroups: [tfTestFoo.id],
 *     systemDiskCategory: "cloud_efficiency",
 *     vswitchId: fooSwitch.id,
 * });
 * const fooRouteEntry = new alicloud.vpc.RouteEntry("fooRouteEntry", {
 *     destinationCidrblock: "172.11.1.1/32",
 *     nexthopId: fooInstance.id,
 *     nexthopType: "Instance",
 *     routeTableId: fooNetwork.routeTableId,
 * });
 * const ingress = new alicloud.ecs.SecurityGroupRule("ingress", {
 *     cidrIp: "0.0.0.0/0",
 *     ipProtocol: "tcp",
 *     nicType: "intranet",
 *     policy: "accept",
 *     portRange: "22/22",
 *     priority: 1,
 *     securityGroupId: tfTestFoo.id,
 *     type: "ingress",
 * });
 * const fooRouteEntries = alicloud.vpc.getRouteEntriesOutput({
 *     routeTableId: fooRouteEntry.routeTableId,
 * });
 * ```
 */
export function getRouteEntriesOutput(args: GetRouteEntriesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRouteEntriesResult> {
    return pulumi.output(args).apply((a: any) => getRouteEntries(a, opts))
}

/**
 * A collection of arguments for invoking getRouteEntries.
 */
export interface GetRouteEntriesOutputArgs {
    /**
     * The destination CIDR block of the route entry.
     */
    cidrBlock?: pulumi.Input<string>;
    /**
     * The instance ID of the next hop.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the router table to which the route entry belongs.
     */
    routeTableId: pulumi.Input<string>;
    /**
     * The type of the route entry.
     */
    type?: pulumi.Input<string>;
}
