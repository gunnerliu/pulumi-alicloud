// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Vpc Public Ip Address Pool Cidr Blocks of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.189.0+.
 *
 * > **NOTE:** Only users who have the required permissions can use the IP address pool feature of Elastic IP Address (EIP). To apply for the required permissions, [submit a ticket](https://smartservice.console.aliyun.com/service/create-ticket).
 */
export function getPublicIpAddressPoolCidrBlocks(args: GetPublicIpAddressPoolCidrBlocksArgs, opts?: pulumi.InvokeOptions): Promise<GetPublicIpAddressPoolCidrBlocksResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:vpc/getPublicIpAddressPoolCidrBlocks:getPublicIpAddressPoolCidrBlocks", {
        "cidrBlock": args.cidrBlock,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "publicIpAddressPoolId": args.publicIpAddressPoolId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getPublicIpAddressPoolCidrBlocks.
 */
export interface GetPublicIpAddressPoolCidrBlocksArgs {
    /**
     * The CIDR block.
     */
    cidrBlock?: string;
    /**
     * A list of Vpc Public Ip Address Pool Cidr Block IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the Vpc Public IP address pool.
     */
    publicIpAddressPoolId: string;
    /**
     * The status of the CIDR block in the Vpc Public IP address pool. Valid values: `Created`, `Modifying`, `Deleting`.
     */
    status?: string;
}

/**
 * A collection of values returned by getPublicIpAddressPoolCidrBlocks.
 */
export interface GetPublicIpAddressPoolCidrBlocksResult {
    /**
     * A list of Vpc Public Ip Address Pool Cidr Blocks. Each element contains the following attributes:
     */
    readonly blocks: outputs.vpc.GetPublicIpAddressPoolCidrBlocksBlock[];
    /**
     * The CIDR block.
     */
    readonly cidrBlock?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * The ID of the Vpc Public IP address pool.
     */
    readonly publicIpAddressPoolId: string;
    /**
     * The status of the CIDR block in the Vpc Public IP address pool.
     */
    readonly status?: string;
}
/**
 * This data source provides the Vpc Public Ip Address Pool Cidr Blocks of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.189.0+.
 *
 * > **NOTE:** Only users who have the required permissions can use the IP address pool feature of Elastic IP Address (EIP). To apply for the required permissions, [submit a ticket](https://smartservice.console.aliyun.com/service/create-ticket).
 */
export function getPublicIpAddressPoolCidrBlocksOutput(args: GetPublicIpAddressPoolCidrBlocksOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPublicIpAddressPoolCidrBlocksResult> {
    return pulumi.output(args).apply((a: any) => getPublicIpAddressPoolCidrBlocks(a, opts))
}

/**
 * A collection of arguments for invoking getPublicIpAddressPoolCidrBlocks.
 */
export interface GetPublicIpAddressPoolCidrBlocksOutputArgs {
    /**
     * The CIDR block.
     */
    cidrBlock?: pulumi.Input<string>;
    /**
     * A list of Vpc Public Ip Address Pool Cidr Block IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the Vpc Public IP address pool.
     */
    publicIpAddressPoolId: pulumi.Input<string>;
    /**
     * The status of the CIDR block in the Vpc Public IP address pool. Valid values: `Created`, `Modifying`, `Deleting`.
     */
    status?: pulumi.Input<string>;
}
