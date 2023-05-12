// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Direct Mail Domains of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.134.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.directmail.getDomains({
 *     ids: ["example_id"],
 * });
 * export const directMailDomainId1 = ids.then(ids => ids.domains?.[0]?.id);
 * const nameRegex = alicloud.directmail.getDomains({
 *     nameRegex: "^my-Domain",
 * });
 * export const directMailDomainId2 = nameRegex.then(nameRegex => nameRegex.domains?.[0]?.id);
 * const example = alicloud.directmail.getDomains({
 *     status: "1",
 *     keyWord: "^my-Domain",
 *     ids: ["example_id"],
 * });
 * export const directMailDomainId3 = example.then(example => example.domains?.[0]?.id);
 * ```
 */
export function getDomains(args?: GetDomainsArgs, opts?: pulumi.InvokeOptions): Promise<GetDomainsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:directmail/getDomains:getDomains", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "keyWord": args.keyWord,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getDomains.
 */
export interface GetDomainsArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Domain IDs.
     */
    ids?: string[];
    /**
     * domain, length `1` to `50`, including numbers or capitals or lowercase letters or `.` or `-`
     */
    keyWord?: string;
    /**
     * A regex string to filter results by Domain name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The status of the domain name. Valid values:`0` to `4`. `0`:Available, Passed. `1`: Unavailable, No passed. `2`: Available, cname no passed, icp no passed. `3`: Available, icp no passed. `4`: Available, cname no passed.
     */
    status?: string;
}

/**
 * A collection of values returned by getDomains.
 */
export interface GetDomainsResult {
    readonly domains: outputs.directmail.GetDomainsDomain[];
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly keyWord?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly status?: string;
}
/**
 * This data source provides the Direct Mail Domains of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.134.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.directmail.getDomains({
 *     ids: ["example_id"],
 * });
 * export const directMailDomainId1 = ids.then(ids => ids.domains?.[0]?.id);
 * const nameRegex = alicloud.directmail.getDomains({
 *     nameRegex: "^my-Domain",
 * });
 * export const directMailDomainId2 = nameRegex.then(nameRegex => nameRegex.domains?.[0]?.id);
 * const example = alicloud.directmail.getDomains({
 *     status: "1",
 *     keyWord: "^my-Domain",
 *     ids: ["example_id"],
 * });
 * export const directMailDomainId3 = example.then(example => example.domains?.[0]?.id);
 * ```
 */
export function getDomainsOutput(args?: GetDomainsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDomainsResult> {
    return pulumi.output(args).apply((a: any) => getDomains(a, opts))
}

/**
 * A collection of arguments for invoking getDomains.
 */
export interface GetDomainsOutputArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Domain IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * domain, length `1` to `50`, including numbers or capitals or lowercase letters or `.` or `-`
     */
    keyWord?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Domain name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the domain name. Valid values:`0` to `4`. `0`:Available, Passed. `1`: Unavailable, No passed. `2`: Available, cname no passed, icp no passed. `3`: Available, icp no passed. `4`: Available, cname no passed.
     */
    status?: pulumi.Input<string>;
}
