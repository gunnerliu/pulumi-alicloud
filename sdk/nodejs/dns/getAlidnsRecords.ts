// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides a list of Alidns Domain Records in an Alibaba Cloud account according to the specified filters.
 *
 * > **NOTE:**  Available in 1.86.0+.
 */
export function getAlidnsRecords(args: GetAlidnsRecordsArgs, opts?: pulumi.InvokeOptions): Promise<GetAlidnsRecordsResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:dns/getAlidnsRecords:getAlidnsRecords", {
        "direction": args.direction,
        "domainName": args.domainName,
        "groupId": args.groupId,
        "ids": args.ids,
        "keyWord": args.keyWord,
        "lang": args.lang,
        "line": args.line,
        "orderBy": args.orderBy,
        "outputFile": args.outputFile,
        "rrKeyWord": args.rrKeyWord,
        "rrRegex": args.rrRegex,
        "searchMode": args.searchMode,
        "status": args.status,
        "type": args.type,
        "typeKeyWord": args.typeKeyWord,
        "valueKeyWord": args.valueKeyWord,
        "valueRegex": args.valueRegex,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlidnsRecords.
 */
export interface GetAlidnsRecordsArgs {
    /**
     * Sorting direction. Valid values: `DESC`,`ASC`. Default to `AESC`.
     */
    readonly direction?: string;
    /**
     * The domain name associated to the records.
     */
    readonly domainName: string;
    /**
     * Domain name group ID.
     */
    readonly groupId?: number;
    /**
     * A list of record IDs.
     */
    readonly ids?: string[];
    /**
     * Keywords.
     */
    readonly keyWord?: string;
    /**
     * User language.
     */
    readonly lang?: string;
    /**
     * ISP line. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm)
     */
    readonly line?: string;
    /**
     * Sort by. Sort from newest to oldest according to the time added by resolution.
     */
    readonly orderBy?: string;
    readonly outputFile?: string;
    /**
     * The keywords recorded by the host are searched according to the `%RRKeyWord%` mode, and are not case sensitive.
     */
    readonly rrKeyWord?: string;
    /**
     * Host record regex.
     */
    readonly rrRegex?: string;
    /**
     * Search mode, Valid values: `LIKE`, `EXACT`, `ADVANCED`, `LIKE` (fuzzy), `EXACT` (accurate) search supports KeyWord field, `ADVANCED` (advanced) mode supports other fields.
     */
    readonly searchMode?: string;
    /**
     * Record status. Valid values: `ENABLE` and `DISABLE`.
     */
    readonly status?: string;
    /**
     * Record type. Valid values: `A`, `NS`, `MX`, `TXT`, `CNAME`, `SRV`, `AAAA`, `REDIRECT_URL`, `FORWORD_URL` .
     */
    readonly type?: string;
    /**
     * Analyze type keywords, search by full match, not case sensitive.
     */
    readonly typeKeyWord?: string;
    /**
     * The keywords of the recorded value are searched according to the `%ValueKeyWord%` mode, and are not case sensitive.
     */
    readonly valueKeyWord?: string;
    /**
     * Host record value regex.
     */
    readonly valueRegex?: string;
}

/**
 * A collection of values returned by getAlidnsRecords.
 */
export interface GetAlidnsRecordsResult {
    readonly direction?: string;
    /**
     * Name of the domain record belongs to.
     */
    readonly domainName: string;
    readonly groupId?: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of record IDs.
     */
    readonly ids: string[];
    readonly keyWord?: string;
    readonly lang?: string;
    /**
     * ISP line of the record.
     */
    readonly line?: string;
    readonly orderBy?: string;
    readonly outputFile?: string;
    /**
     * A list of records. Each element contains the following attributes:
     */
    readonly records: outputs.dns.GetAlidnsRecordsRecord[];
    readonly rrKeyWord?: string;
    readonly rrRegex?: string;
    readonly searchMode?: string;
    /**
     * Status of the record.
     */
    readonly status?: string;
    /**
     * Type of the record.
     */
    readonly type?: string;
    readonly typeKeyWord?: string;
    readonly valueKeyWord?: string;
    readonly valueRegex?: string;
}
