// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This data source provides a list of DNS Domains in an Alibaba Cloud account according to the specified filters.
 */
export function getDomains(args?: GetDomainsArgs, opts?: pulumi.InvokeOptions): Promise<GetDomainsResult> {
    args = args || {};
    return pulumi.runtime.invoke("alicloud:dns/getDomains:getDomains", {
        "aliDomain": args.aliDomain,
        "domainNameRegex": args.domainNameRegex,
        "groupNameRegex": args.groupNameRegex,
        "instanceId": args.instanceId,
        "outputFile": args.outputFile,
        "versionCode": args.versionCode,
    }, opts);
}

/**
 * A collection of arguments for invoking getDomains.
 */
export interface GetDomainsArgs {
    /**
     * Specifies whether the domain is from Alibaba Cloud or not.
     */
    readonly aliDomain?: boolean;
    /**
     * A regex string to filter results by the domain name. 
     */
    readonly domainNameRegex?: string;
    /**
     * A regex string to filter results by the group name.
     */
    readonly groupNameRegex?: string;
    /**
     * Cloud analysis product ID.
     */
    readonly instanceId?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Cloud analysis version code.
     */
    readonly versionCode?: string;
}

/**
 * A collection of values returned by getDomains.
 */
export interface GetDomainsResult {
    /**
     * A list of domains. Each element contains the following attributes:
     */
    readonly domains: { aliDomain: boolean, dnsServers: string[], domainId: string, domainName: string, groupId: string, groupName: string, instanceId: string, punyCode: string, versionCode: string }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}