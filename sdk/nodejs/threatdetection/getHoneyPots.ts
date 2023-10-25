// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Threat Detection Honey Pot available to the user.[What is Honey Pot](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypot)
 *
 * > **NOTE:** Available since v1.195.0.
 */
export function getHoneyPots(args?: GetHoneyPotsArgs, opts?: pulumi.InvokeOptions): Promise<GetHoneyPotsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:threatdetection/getHoneyPots:getHoneyPots", {
        "honeypotId": args.honeypotId,
        "honeypotName": args.honeypotName,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "nodeId": args.nodeId,
        "nodeName": args.nodeName,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getHoneyPots.
 */
export interface GetHoneyPotsArgs {
    /**
     * Honeypot ID.
     */
    honeypotId?: string;
    /**
     * Honeypot custom name.
     */
    honeypotName?: string;
    /**
     * A list of Honey Pot IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by honey pot name.
     */
    nameRegex?: string;
    /**
     * The ID of the honeypot management node.
     */
    nodeId?: string;
    /**
     * The name of the honeypot management node.
     */
    nodeName?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getHoneyPots.
 */
export interface GetHoneyPotsResult {
    /**
     * Honeypot ID.
     */
    readonly honeypotId?: string;
    /**
     * Honeypot custom name.
     */
    readonly honeypotName?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Honey Pot IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * The ID of the honeypot management node.
     */
    readonly nodeId?: string;
    readonly nodeName?: string;
    readonly outputFile?: string;
    /**
     * A list of Honey Pot Entries. Each element contains the following attributes:
     */
    readonly pots: outputs.threatdetection.GetHoneyPotsPot[];
}
/**
 * This data source provides Threat Detection Honey Pot available to the user.[What is Honey Pot](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypot)
 *
 * > **NOTE:** Available since v1.195.0.
 */
export function getHoneyPotsOutput(args?: GetHoneyPotsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetHoneyPotsResult> {
    return pulumi.output(args).apply((a: any) => getHoneyPots(a, opts))
}

/**
 * A collection of arguments for invoking getHoneyPots.
 */
export interface GetHoneyPotsOutputArgs {
    /**
     * Honeypot ID.
     */
    honeypotId?: pulumi.Input<string>;
    /**
     * Honeypot custom name.
     */
    honeypotName?: pulumi.Input<string>;
    /**
     * A list of Honey Pot IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by honey pot name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * The ID of the honeypot management node.
     */
    nodeId?: pulumi.Input<string>;
    /**
     * The name of the honeypot management node.
     */
    nodeName?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
