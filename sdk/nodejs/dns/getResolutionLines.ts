// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides a list of DNS Resolution Lines in an Alibaba Cloud account according to the specified filters.
 *
 * > **NOTE:** Available in 1.60.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const resolutionLinesDs = pulumi.output(alicloud.dns.getResolutionLines({
 *     lineCodes: ["cn_unicom_shanxi"],
 *     outputFile: "support_lines.txt",
 * }, { async: true }));
 *
 * export const firstLineCode = resolutionLinesDs.lines[0].lineCode;
 * ```
 */
export function getResolutionLines(args?: GetResolutionLinesArgs, opts?: pulumi.InvokeOptions): Promise<GetResolutionLinesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
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
    readonly domainName?: string;
    /**
     * language.
     */
    readonly lang?: string;
    /**
     * A list of lines codes.
     */
    readonly lineCodes?: string[];
    /**
     * A list of line display names.
     */
    readonly lineDisplayNames?: string[];
    readonly lineNames?: string[];
    readonly outputFile?: string;
    /**
     * The ip of user client.
     */
    readonly userClientIp?: string;
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
