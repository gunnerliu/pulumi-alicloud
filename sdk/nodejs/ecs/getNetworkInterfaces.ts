// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

export function getNetworkInterfaces(args?: GetNetworkInterfacesArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkInterfacesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:ecs/getNetworkInterfaces:getNetworkInterfaces", {
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
 * A collection of arguments for invoking getNetworkInterfaces.
 */
export interface GetNetworkInterfacesArgs {
    ids?: string[];
    /**
     * ID of the instance that the ENI is attached to.
     */
    instanceId?: string;
    /**
     * Name of the ENI.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.123.1. New field 'network_interface_name' instead
     */
    name?: string;
    nameRegex?: string;
    networkInterfaceName?: string;
    outputFile?: string;
    primaryIpAddress?: string;
    /**
     * Primary private IP of the ENI.
     *
     * @deprecated Field 'private_ip' has been deprecated from provider version 1.123.1. New field 'primary_ip_address' instead
     */
    privateIp?: string;
    /**
     * The Id of resource group.
     */
    resourceGroupId?: string;
    securityGroupId?: string;
    serviceManaged?: boolean;
    /**
     * Current status of the ENI.
     */
    status?: string;
    /**
     * A map of tags assigned to the ENI.
     */
    tags?: {[key: string]: any};
    type?: string;
    /**
     * ID of the VPC that the ENI belongs to.
     */
    vpcId?: string;
    /**
     * ID of the VSwitch that the ENI is linked to.
     */
    vswitchId?: string;
}

/**
 * A collection of values returned by getNetworkInterfaces.
 */
export interface GetNetworkInterfacesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    /**
     * ID of the instance that the ENI is attached to.
     */
    readonly instanceId?: string;
    /**
     * A list of ENIs. Each element contains the following attributes:
     */
    readonly interfaces: outputs.ecs.GetNetworkInterfacesInterface[];
    /**
     * Name of the ENI.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.123.1. New field 'network_interface_name' instead
     */
    readonly name?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly networkInterfaceName?: string;
    readonly outputFile?: string;
    readonly primaryIpAddress?: string;
    /**
     * Primary private IP of the ENI.
     *
     * @deprecated Field 'private_ip' has been deprecated from provider version 1.123.1. New field 'primary_ip_address' instead
     */
    readonly privateIp?: string;
    /**
     * The Id of resource group.
     */
    readonly resourceGroupId?: string;
    readonly securityGroupId?: string;
    readonly serviceManaged?: boolean;
    /**
     * Current status of the ENI.
     */
    readonly status?: string;
    /**
     * A map of tags assigned to the ENI.
     */
    readonly tags?: {[key: string]: any};
    readonly type?: string;
    /**
     * ID of the VPC that the ENI belongs to.
     */
    readonly vpcId?: string;
    /**
     * ID of the VSwitch that the ENI is linked to.
     */
    readonly vswitchId?: string;
}

export function getNetworkInterfacesOutput(args?: GetNetworkInterfacesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworkInterfacesResult> {
    return pulumi.output(args).apply(a => getNetworkInterfaces(a, opts))
}

/**
 * A collection of arguments for invoking getNetworkInterfaces.
 */
export interface GetNetworkInterfacesOutputArgs {
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the instance that the ENI is attached to.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * Name of the ENI.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.123.1. New field 'network_interface_name' instead
     */
    name?: pulumi.Input<string>;
    nameRegex?: pulumi.Input<string>;
    networkInterfaceName?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    primaryIpAddress?: pulumi.Input<string>;
    /**
     * Primary private IP of the ENI.
     *
     * @deprecated Field 'private_ip' has been deprecated from provider version 1.123.1. New field 'primary_ip_address' instead
     */
    privateIp?: pulumi.Input<string>;
    /**
     * The Id of resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    securityGroupId?: pulumi.Input<string>;
    serviceManaged?: pulumi.Input<boolean>;
    /**
     * Current status of the ENI.
     */
    status?: pulumi.Input<string>;
    /**
     * A map of tags assigned to the ENI.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    type?: pulumi.Input<string>;
    /**
     * ID of the VPC that the ENI belongs to.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * ID of the VSwitch that the ENI is linked to.
     */
    vswitchId?: pulumi.Input<string>;
}
