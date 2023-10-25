// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Global Accelerator (GA) Basic Accelerate IPs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.194.0+.
 */
export function getBasicAccelerateIps(args: GetBasicAccelerateIpsArgs, opts?: pulumi.InvokeOptions): Promise<GetBasicAccelerateIpsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ga/getBasicAccelerateIps:getBasicAccelerateIps", {
        "accelerateIpAddress": args.accelerateIpAddress,
        "accelerateIpId": args.accelerateIpId,
        "ids": args.ids,
        "ipSetId": args.ipSetId,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getBasicAccelerateIps.
 */
export interface GetBasicAccelerateIpsArgs {
    /**
     * The address of the Basic Accelerate IP.
     */
    accelerateIpAddress?: string;
    /**
     * The id of the Basic Accelerate IP.
     */
    accelerateIpId?: string;
    /**
     * A list of Global Accelerator Basic Accelerate IP IDs.
     */
    ids?: string[];
    /**
     * The ID of the Basic Ip Set.
     */
    ipSetId: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The status of the Global Accelerator Basic Accelerate IP instance. Valid Value: `active`, `binding`, `bound`, `unbinding`, `deleting`.
     */
    status?: string;
}

/**
 * A collection of values returned by getBasicAccelerateIps.
 */
export interface GetBasicAccelerateIpsResult {
    /**
     * The address of the Basic Accelerate IP.
     */
    readonly accelerateIpAddress?: string;
    /**
     * The id of the Basic Accelerate IP.
     */
    readonly accelerateIpId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    /**
     * The ID of the Basic Ip Set.
     */
    readonly ipSetId: string;
    /**
     * A list of Global Accelerator Basic Accelerate IPs. Each element contains the following attributes:
     */
    readonly ips: outputs.ga.GetBasicAccelerateIpsIp[];
    readonly outputFile?: string;
    /**
     * The status of the Basic Accelerate IP instance.
     */
    readonly status?: string;
}
/**
 * This data source provides the Global Accelerator (GA) Basic Accelerate IPs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.194.0+.
 */
export function getBasicAccelerateIpsOutput(args: GetBasicAccelerateIpsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBasicAccelerateIpsResult> {
    return pulumi.output(args).apply((a: any) => getBasicAccelerateIps(a, opts))
}

/**
 * A collection of arguments for invoking getBasicAccelerateIps.
 */
export interface GetBasicAccelerateIpsOutputArgs {
    /**
     * The address of the Basic Accelerate IP.
     */
    accelerateIpAddress?: pulumi.Input<string>;
    /**
     * The id of the Basic Accelerate IP.
     */
    accelerateIpId?: pulumi.Input<string>;
    /**
     * A list of Global Accelerator Basic Accelerate IP IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the Basic Ip Set.
     */
    ipSetId: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the Global Accelerator Basic Accelerate IP instance. Valid Value: `active`, `binding`, `bound`, `unbinding`, `deleting`.
     */
    status?: pulumi.Input<string>;
}
