// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides a list of CAS Certificates in an Alibaba Cloud account according to the specified filters.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const certs = pulumi.output(alicloud.cas.getCertificates({
 *     nameRegex: "^cas",
 *     outputFile: `./cas_certificates.json`,
 * }, { async: true }));
 *
 * export const cert = certs.certificates[0].id;
 * ```
 */
export function getCertificates(args?: GetCertificatesArgs, opts?: pulumi.InvokeOptions): Promise<GetCertificatesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:cas/getCertificates:getCertificates", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificates.
 */
export interface GetCertificatesArgs {
    /**
     * A list of cert IDs.
     */
    readonly ids?: string[];
    /**
     * A regex string to filter results by the certificate name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
}

/**
 * A collection of values returned by getCertificates.
 */
export interface GetCertificatesResult {
    /**
     * A list of apis. Each element contains the following attributes:
     */
    readonly certificates: outputs.cas.GetCertificatesCertificate[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of cert IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of cert names.
     */
    readonly names: string[];
    readonly outputFile?: string;
}
