// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ecs Network Interfaces of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.123.1+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ecs.getEcsNetworkInterfaces({
 *     ids: ["eni-abcd1234"],
 *     nameRegex: "tf-testAcc",
 * });
 * export const firstEcsNetworkInterfaceId = example.then(example => example.interfaces?.[0]?.id);
 * ```
 */
export function getEcsNetworkInterfaces(args?: GetEcsNetworkInterfacesArgs, opts?: pulumi.InvokeOptions): Promise<GetEcsNetworkInterfacesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ecs/getEcsNetworkInterfaces:getEcsNetworkInterfaces", {
        "ids": args.ids,
        "instanceId": args.instanceId,
        "name": args.name,
        "nameRegex": args.nameRegex,
        "networkInterfaceName": args.networkInterfaceName,
        "outputFile": args.outputFile,
        "primaryIpAddress": args.primaryIpAddress,
        "privateIp": args.privateIp,
        "resourceGroupId": args.resourceGroupId,
        "securityGroupId": args.securityGroupId,
        "serviceManaged": args.serviceManaged,
        "status": args.status,
        "tags": args.tags,
        "type": args.type,
        "vpcId": args.vpcId,
        "vswitchId": args.vswitchId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEcsNetworkInterfaces.
 */
export interface GetEcsNetworkInterfacesArgs {
    /**
     * A list of Network Interface IDs.
     */
    ids?: string[];
    /**
     * The instance id.
     */
    instanceId?: string;
    /**
     * The network interface name.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.123.1. New field 'network_interface_name' instead
     */
    name?: string;
    /**
     * A regex string to filter results by Network Interface name.
     */
    nameRegex?: string;
    /**
     * The network interface name.
     */
    networkInterfaceName?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The primary private IP address of the ENI.
     */
    primaryIpAddress?: string;
    /**
     * The primary private IP address of the ENI.
     *
     * @deprecated Field 'private_ip' has been deprecated from provider version 1.123.1. New field 'primary_ip_address' instead
     */
    privateIp?: string;
    /**
     * The resource group id.
     */
    resourceGroupId?: string;
    /**
     * The security group id.
     */
    securityGroupId?: string;
    /**
     * Whether the user of the elastic network card is a cloud product or a virtual vendor.
     */
    serviceManaged?: boolean;
    /**
     * The status of the ENI.
     */
    status?: string;
    /**
     * The tags.
     */
    tags?: {[key: string]: any};
    /**
     * The type of the ENI.
     */
    type?: string;
    /**
     * The Vpc Id.
     */
    vpcId?: string;
    /**
     * The vswitch id.
     */
    vswitchId?: string;
}

/**
 * A collection of values returned by getEcsNetworkInterfaces.
 */
export interface GetEcsNetworkInterfacesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instanceId?: string;
    readonly interfaces: outputs.ecs.GetEcsNetworkInterfacesInterface[];
    /**
     * @deprecated Field 'name' has been deprecated from provider version 1.123.1. New field 'network_interface_name' instead
     */
    readonly name?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly networkInterfaceName?: string;
    readonly outputFile?: string;
    readonly primaryIpAddress?: string;
    /**
     * @deprecated Field 'private_ip' has been deprecated from provider version 1.123.1. New field 'primary_ip_address' instead
     */
    readonly privateIp?: string;
    readonly resourceGroupId?: string;
    readonly securityGroupId?: string;
    readonly serviceManaged?: boolean;
    readonly status?: string;
    readonly tags?: {[key: string]: any};
    readonly type?: string;
    readonly vpcId?: string;
    readonly vswitchId?: string;
}
/**
 * This data source provides the Ecs Network Interfaces of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.123.1+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ecs.getEcsNetworkInterfaces({
 *     ids: ["eni-abcd1234"],
 *     nameRegex: "tf-testAcc",
 * });
 * export const firstEcsNetworkInterfaceId = example.then(example => example.interfaces?.[0]?.id);
 * ```
 */
export function getEcsNetworkInterfacesOutput(args?: GetEcsNetworkInterfacesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEcsNetworkInterfacesResult> {
    return pulumi.output(args).apply((a: any) => getEcsNetworkInterfaces(a, opts))
}

/**
 * A collection of arguments for invoking getEcsNetworkInterfaces.
 */
export interface GetEcsNetworkInterfacesOutputArgs {
    /**
     * A list of Network Interface IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The instance id.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The network interface name.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.123.1. New field 'network_interface_name' instead
     */
    name?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Network Interface name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * The network interface name.
     */
    networkInterfaceName?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The primary private IP address of the ENI.
     */
    primaryIpAddress?: pulumi.Input<string>;
    /**
     * The primary private IP address of the ENI.
     *
     * @deprecated Field 'private_ip' has been deprecated from provider version 1.123.1. New field 'primary_ip_address' instead
     */
    privateIp?: pulumi.Input<string>;
    /**
     * The resource group id.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The security group id.
     */
    securityGroupId?: pulumi.Input<string>;
    /**
     * Whether the user of the elastic network card is a cloud product or a virtual vendor.
     */
    serviceManaged?: pulumi.Input<boolean>;
    /**
     * The status of the ENI.
     */
    status?: pulumi.Input<string>;
    /**
     * The tags.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The type of the ENI.
     */
    type?: pulumi.Input<string>;
    /**
     * The Vpc Id.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * The vswitch id.
     */
    vswitchId?: pulumi.Input<string>;
}
