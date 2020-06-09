// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides the generation of txt records to realize the retrieval and verification of domain names.
 *
 * > **NOTE:** Available in v1.80.0+.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const thisDomainTxtGuid = pulumi.output(alicloud.dns.getDomainTxtGuid({
 *     domainName: "test111.abc",
 *     type: "ADD_SUB_DOMAIN",
 * }, { async: true }));
 *
 * export const rr = thisDomainTxtGuid.rr;
 * export const value = thisDomainTxtGuid.value;
 * ```
 */
export function getDomainTxtGuid(args: GetDomainTxtGuidArgs, opts?: pulumi.InvokeOptions): Promise<GetDomainTxtGuidResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:dns/getDomainTxtGuid:getDomainTxtGuid", {
        "domainName": args.domainName,
        "lang": args.lang,
        "outputFile": args.outputFile,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getDomainTxtGuid.
 */
export interface GetDomainTxtGuidArgs {
    /**
     * Verified domain name.
     */
    readonly domainName: string;
    /**
     * User language.
     */
    readonly lang?: string;
    readonly outputFile?: string;
    /**
     * Txt verification function. Value:`ADD_SUB_DOMAIN`, `RETRIEVAL`.
     */
    readonly type: string;
}

/**
 * A collection of values returned by getDomainTxtGuid.
 */
export interface GetDomainTxtGuidResult {
    readonly domainName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly lang?: string;
    readonly outputFile?: string;
    /**
     * Host record.
     */
    readonly rr: string;
    readonly type: string;
    /**
     * Record the value.
     */
    readonly value: string;
}
