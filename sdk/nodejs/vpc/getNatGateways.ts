// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list of Nat Gateways owned by an Alibaba Cloud account.
 *
 * > **NOTE:** Available in 1.37.0+.
 */
export function getNatGateways(args?: GetNatGatewaysArgs, opts?: pulumi.InvokeOptions): Promise<GetNatGatewaysResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:vpc/getNatGateways:getNatGateways", {
        "dryRun": args.dryRun,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "natGatewayName": args.natGatewayName,
        "natType": args.natType,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "paymentType": args.paymentType,
        "resourceGroupId": args.resourceGroupId,
        "specification": args.specification,
        "status": args.status,
        "tags": args.tags,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNatGateways.
 */
export interface GetNatGatewaysArgs {
    /**
     * Specifies whether to only precheck the request.
     */
    dryRun?: boolean;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of NAT gateways IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter nat gateways by name.
     */
    nameRegex?: string;
    /**
     * The name of NAT gateway.
     */
    natGatewayName?: string;
    /**
     * The nat type of NAT gateway. Valid values `Enhanced` and `Normal`.
     */
    natType?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The payment type of NAT gateway. Valid values `PayAsYouGo` and `Subscription`.
     */
    paymentType?: string;
    /**
     * The resource group id of NAT gateway.
     */
    resourceGroupId?: string;
    /**
     * The specification of NAT gateway. Valid values `Middle`, `Large`, `Small` and `XLarge.1`. Default value is `Small`.
     */
    specification?: string;
    /**
     * The status of NAT gateway. Valid values `Available`, `Converting`, `Creating`, `Deleting` and `Modifying`.
     */
    status?: string;
    /**
     * The tags of NAT gateway.
     */
    tags?: {[key: string]: any};
    /**
     * The ID of the VPC.
     */
    vpcId?: string;
}

/**
 * A collection of values returned by getNatGateways.
 */
export interface GetNatGatewaysResult {
    readonly dryRun?: boolean;
    readonly enableDetails?: boolean;
    /**
     * A list of Nat gateways. Each element contains the following attributes:
     */
    readonly gateways: outputs.vpc.GetNatGatewaysGateway[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Optional) A list of Nat gateways IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of Nat gateways names.
     */
    readonly names: string[];
    /**
     * The name of the NAT gateway.
     */
    readonly natGatewayName?: string;
    /**
     * The type of the NAT gateway.
     */
    readonly natType?: string;
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    /**
     * The billing method of the NAT gateway.
     */
    readonly paymentType?: string;
    /**
     * The ID of the resource group.
     */
    readonly resourceGroupId?: string;
    /**
     * The specification of the NAT gateway.
     */
    readonly specification?: string;
    /**
     * The status of the NAT gateway.
     */
    readonly status?: string;
    /**
     * The tags of NAT gateway.
     */
    readonly tags?: {[key: string]: any};
    readonly totalCount: number;
    /**
     * The ID of the VPC.
     */
    readonly vpcId?: string;
}
/**
 * This data source provides a list of Nat Gateways owned by an Alibaba Cloud account.
 *
 * > **NOTE:** Available in 1.37.0+.
 */
export function getNatGatewaysOutput(args?: GetNatGatewaysOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNatGatewaysResult> {
    return pulumi.output(args).apply((a: any) => getNatGateways(a, opts))
}

/**
 * A collection of arguments for invoking getNatGateways.
 */
export interface GetNatGatewaysOutputArgs {
    /**
     * Specifies whether to only precheck the request.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of NAT gateways IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter nat gateways by name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * The name of NAT gateway.
     */
    natGatewayName?: pulumi.Input<string>;
    /**
     * The nat type of NAT gateway. Valid values `Enhanced` and `Normal`.
     */
    natType?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The payment type of NAT gateway. Valid values `PayAsYouGo` and `Subscription`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The resource group id of NAT gateway.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The specification of NAT gateway. Valid values `Middle`, `Large`, `Small` and `XLarge.1`. Default value is `Small`.
     */
    specification?: pulumi.Input<string>;
    /**
     * The status of NAT gateway. Valid values `Available`, `Converting`, `Creating`, `Deleting` and `Modifying`.
     */
    status?: pulumi.Input<string>;
    /**
     * The tags of NAT gateway.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The ID of the VPC.
     */
    vpcId?: pulumi.Input<string>;
}
