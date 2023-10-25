// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This data source provides the function of verifying whether an IP is a CDN node.
 *
 * > **NOTE:** Available in v1.153.0+.
 */
export function getIpInfo(args: GetIpInfoArgs, opts?: pulumi.InvokeOptions): Promise<GetIpInfoResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cdn/getIpInfo:getIpInfo", {
        "ip": args.ip,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpInfo.
 */
export interface GetIpInfoArgs {
    /**
     * Specify IP address.
     */
    ip: string;
}

/**
 * A collection of values returned by getIpInfo.
 */
export interface GetIpInfoResult {
    readonly cdnIp: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ip: string;
    readonly isp: string;
    readonly ispEname: string;
    readonly region: string;
    readonly regionEname: string;
}
/**
 * This data source provides the function of verifying whether an IP is a CDN node.
 *
 * > **NOTE:** Available in v1.153.0+.
 */
export function getIpInfoOutput(args: GetIpInfoOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetIpInfoResult> {
    return pulumi.output(args).apply((a: any) => getIpInfo(a, opts))
}

/**
 * A collection of arguments for invoking getIpInfo.
 */
export interface GetIpInfoOutputArgs {
    /**
     * Specify IP address.
     */
    ip: pulumi.Input<string>;
}
