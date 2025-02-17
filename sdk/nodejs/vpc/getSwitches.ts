// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list of VSwitches owned by an Alibaba Cloud account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "vswitchDatasourceName";
 * const defaultZones = alicloud.getZones({});
 * const vpc = new alicloud.vpc.Network("vpc", {
 *     cidrBlock: "172.16.0.0/16",
 *     vpcName: name,
 * });
 * const vswitch = new alicloud.vpc.Switch("vswitch", {
 *     availabilityZone: defaultZones.then(defaultZones => defaultZones.zones?.[0]?.id),
 *     cidrBlock: "172.16.0.0/24",
 *     vpcId: vpc.id,
 *     vswitchName: name,
 * });
 * const defaultSwitches = alicloud.vpc.getSwitchesOutput({
 *     nameRegex: vswitch.vswitchName,
 * });
 * ```
 */
export function getSwitches(args?: GetSwitchesArgs, opts?: pulumi.InvokeOptions): Promise<GetSwitchesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:vpc/getSwitches:getSwitches", {
        "cidrBlock": args.cidrBlock,
        "dryRun": args.dryRun,
        "ids": args.ids,
        "isDefault": args.isDefault,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "routeTableId": args.routeTableId,
        "status": args.status,
        "tags": args.tags,
        "vpcId": args.vpcId,
        "vswitchName": args.vswitchName,
        "vswitchOwnerId": args.vswitchOwnerId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSwitches.
 */
export interface GetSwitchesArgs {
    /**
     * Filter results by a specific CIDR block. For example: "172.16.0.0/12".
     */
    cidrBlock?: string;
    /**
     * Specifies whether to precheck this request only. Valid values: `true` and `false`.
     */
    dryRun?: boolean;
    /**
     * A list of VSwitch IDs.
     */
    ids?: string[];
    /**
     * Indicate whether the VSwitch is created by the system.
     */
    isDefault?: boolean;
    /**
     * A regex string to filter results by name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The Id of resource group which VSWitch belongs.
     */
    resourceGroupId?: string;
    /**
     * The route table ID of the VSwitch.
     */
    routeTableId?: string;
    /**
     * The status of the VSwitch. Valid values: `Available` and `Pending`.
     */
    status?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: {[key: string]: any};
    /**
     * ID of the VPC that owns the VSwitch.
     */
    vpcId?: string;
    /**
     * The name of the VSwitch.
     */
    vswitchName?: string;
    /**
     * The VSwitch owner id.
     */
    vswitchOwnerId?: number;
    /**
     * The availability zone of the VSwitch.
     */
    zoneId?: string;
}

/**
 * A collection of values returned by getSwitches.
 */
export interface GetSwitchesResult {
    /**
     * CIDR block of the VSwitch.
     */
    readonly cidrBlock?: string;
    readonly dryRun?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of VSwitch IDs.
     */
    readonly ids: string[];
    /**
     * Whether the VSwitch is the default one in the region.
     */
    readonly isDefault?: boolean;
    readonly nameRegex?: string;
    /**
     * A list of VSwitch names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The resource group ID of the VSwitch.
     */
    readonly resourceGroupId?: string;
    /**
     * The route table ID of the VSwitch.
     */
    readonly routeTableId?: string;
    /**
     * The status of the VSwitch.
     */
    readonly status?: string;
    /**
     * The Tags of the VSwitch.
     */
    readonly tags?: {[key: string]: any};
    /**
     * ID of the VPC that owns the VSwitch.
     */
    readonly vpcId?: string;
    /**
     * Name of the VSwitch.
     */
    readonly vswitchName?: string;
    readonly vswitchOwnerId?: number;
    /**
     * A list of VSwitches. Each element contains the following attributes:
     */
    readonly vswitches: outputs.vpc.GetSwitchesVswitch[];
    /**
     * ID of the availability zone where the VSwitch is located.
     */
    readonly zoneId?: string;
}
/**
 * This data source provides a list of VSwitches owned by an Alibaba Cloud account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "vswitchDatasourceName";
 * const defaultZones = alicloud.getZones({});
 * const vpc = new alicloud.vpc.Network("vpc", {
 *     cidrBlock: "172.16.0.0/16",
 *     vpcName: name,
 * });
 * const vswitch = new alicloud.vpc.Switch("vswitch", {
 *     availabilityZone: defaultZones.then(defaultZones => defaultZones.zones?.[0]?.id),
 *     cidrBlock: "172.16.0.0/24",
 *     vpcId: vpc.id,
 *     vswitchName: name,
 * });
 * const defaultSwitches = alicloud.vpc.getSwitchesOutput({
 *     nameRegex: vswitch.vswitchName,
 * });
 * ```
 */
export function getSwitchesOutput(args?: GetSwitchesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSwitchesResult> {
    return pulumi.output(args).apply((a: any) => getSwitches(a, opts))
}

/**
 * A collection of arguments for invoking getSwitches.
 */
export interface GetSwitchesOutputArgs {
    /**
     * Filter results by a specific CIDR block. For example: "172.16.0.0/12".
     */
    cidrBlock?: pulumi.Input<string>;
    /**
     * Specifies whether to precheck this request only. Valid values: `true` and `false`.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * A list of VSwitch IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicate whether the VSwitch is created by the system.
     */
    isDefault?: pulumi.Input<boolean>;
    /**
     * A regex string to filter results by name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The Id of resource group which VSWitch belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The route table ID of the VSwitch.
     */
    routeTableId?: pulumi.Input<string>;
    /**
     * The status of the VSwitch. Valid values: `Available` and `Pending`.
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * ID of the VPC that owns the VSwitch.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * The name of the VSwitch.
     */
    vswitchName?: pulumi.Input<string>;
    /**
     * The VSwitch owner id.
     */
    vswitchOwnerId?: pulumi.Input<number>;
    /**
     * The availability zone of the VSwitch.
     */
    zoneId?: pulumi.Input<string>;
}
