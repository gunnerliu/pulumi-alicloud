// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list of DNS Resolution Lines in an Alibaba Cloud account according to the specified filters.
 *
 * > **NOTE:** Available in 1.60.0.
 */
export function getResolutionLines(args?: GetResolutionLinesArgs, opts?: pulumi.InvokeOptions): Promise<GetResolutionLinesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:dns/getResolutionLines:getResolutionLines", {
        "domainName": args.domainName,
        "lang": args.lang,
        "lineCodes": args.lineCodes,
        "lineDisplayNames": args.lineDisplayNames,
        "lineNames": args.lineNames,
        "outputFile": args.outputFile,
        "userClientIp": args.userClientIp,
    }, opts);
}

/**
 * A collection of arguments for invoking getResolutionLines.
 */
export interface GetResolutionLinesArgs {
    /**
     * Domain Name.
     */
    domainName?: string;
    /**
     * language.
     */
    lang?: string;
    /**
     * A list of lines codes.
     */
    lineCodes?: string[];
    /**
     * A list of line display names.
     */
    lineDisplayNames?: string[];
    lineNames?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ip of user client.
     */
    userClientIp?: string;
}

/**
 * A collection of values returned by getResolutionLines.
 */
export interface GetResolutionLinesResult {
    readonly domainName?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly lang?: string;
    /**
     * Line code.
     */
    readonly lineCodes: string[];
    /**
     * A list of line display names.
     */
    readonly lineDisplayNames: string[];
    readonly lineNames?: string[];
    /**
     * A list of cloud resolution line. Each element contains the following attributes:
     */
    readonly lines: outputs.dns.GetResolutionLinesLine[];
    readonly outputFile?: string;
    readonly userClientIp?: string;
}
/**
 * This data source provides a list of DNS Resolution Lines in an Alibaba Cloud account according to the specified filters.
 *
 * > **NOTE:** Available in 1.60.0.
 */
export function getResolutionLinesOutput(args?: GetResolutionLinesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetResolutionLinesResult> {
    return pulumi.output(args).apply((a: any) => getResolutionLines(a, opts))
}

/**
 * A collection of arguments for invoking getResolutionLines.
 */
export interface GetResolutionLinesOutputArgs {
    /**
     * Domain Name.
     */
    domainName?: pulumi.Input<string>;
    /**
     * language.
     */
    lang?: pulumi.Input<string>;
    /**
     * A list of lines codes.
     */
    lineCodes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of line display names.
     */
    lineDisplayNames?: pulumi.Input<pulumi.Input<string>[]>;
    lineNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ip of user client.
     */
    userClientIp?: pulumi.Input<string>;
}
