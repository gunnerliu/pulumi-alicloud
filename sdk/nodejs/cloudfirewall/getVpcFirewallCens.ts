// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Cloud Firewall Vpc Firewall Cen available to the user.[What is Vpc Firewall Cen](https://www.alibabacloud.com/help/en/cloud-firewall/latest/describevpcfirewallcenlist)
 *
 * > **NOTE:** Available in 1.194.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.cloudfirewall.getVpcFirewallCens({
 *     ids: [alicloud_cloud_firewall_vpc_firewall_cen["default"].id],
 *     cenId: "cen-cjok7uyb5w2b27573v",
 *     memberUid: "1415189284827022",
 *     status: "closed",
 *     vpcFirewallName: "tf-test",
 * });
 * export const alicloudCloudFirewallVpcFirewallCenExampleId = _default.then(_default => _default.cens?.[0]?.id);
 * ```
 */
export function getVpcFirewallCens(args?: GetVpcFirewallCensArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcFirewallCensResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cloudfirewall/getVpcFirewallCens:getVpcFirewallCens", {
        "cenId": args.cenId,
        "ids": args.ids,
        "lang": args.lang,
        "memberUid": args.memberUid,
        "networkInstanceId": args.networkInstanceId,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
        "vpcFirewallId": args.vpcFirewallId,
        "vpcFirewallName": args.vpcFirewallName,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcFirewallCens.
 */
export interface GetVpcFirewallCensArgs {
    /**
     * The ID of the CEN instance.
     */
    cenId?: string;
    /**
     * A list of Vpc Firewall Cen IDs.
     */
    ids?: string[];
    /**
     * The language type of the requested and received messages. Value:-**zh** (default): Chinese.-**en**: English.
     */
    lang?: string;
    /**
     * The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
     */
    memberUid?: string;
    /**
     * The ID of the VPC instance that created the VPC firewall.
     */
    networkInstanceId?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * Firewall switch status
     */
    status?: string;
    /**
     * VPC firewall ID
     */
    vpcFirewallId?: string;
    /**
     * The name of the VPC firewall instance.
     */
    vpcFirewallName?: string;
}

/**
 * A collection of values returned by getVpcFirewallCens.
 */
export interface GetVpcFirewallCensResult {
    /**
     * The ID of the CEN instance.
     */
    readonly cenId?: string;
    /**
     * A list of Vpc Firewall Cen Entries. Each element contains the following attributes:
     */
    readonly cens: outputs.cloudfirewall.GetVpcFirewallCensCen[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Vpc Firewall Cen IDs.
     */
    readonly ids: string[];
    readonly lang?: string;
    /**
     * The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
     */
    readonly memberUid?: string;
    /**
     * The ID of the VPC instance that created the VPC firewall.
     */
    readonly networkInstanceId?: string;
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    /**
     * Firewall switch status
     */
    readonly status?: string;
    /**
     * VPC firewall ID
     */
    readonly vpcFirewallId?: string;
    /**
     * The name of the VPC firewall instance.
     */
    readonly vpcFirewallName?: string;
}
/**
 * This data source provides Cloud Firewall Vpc Firewall Cen available to the user.[What is Vpc Firewall Cen](https://www.alibabacloud.com/help/en/cloud-firewall/latest/describevpcfirewallcenlist)
 *
 * > **NOTE:** Available in 1.194.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.cloudfirewall.getVpcFirewallCens({
 *     ids: [alicloud_cloud_firewall_vpc_firewall_cen["default"].id],
 *     cenId: "cen-cjok7uyb5w2b27573v",
 *     memberUid: "1415189284827022",
 *     status: "closed",
 *     vpcFirewallName: "tf-test",
 * });
 * export const alicloudCloudFirewallVpcFirewallCenExampleId = _default.then(_default => _default.cens?.[0]?.id);
 * ```
 */
export function getVpcFirewallCensOutput(args?: GetVpcFirewallCensOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVpcFirewallCensResult> {
    return pulumi.output(args).apply((a: any) => getVpcFirewallCens(a, opts))
}

/**
 * A collection of arguments for invoking getVpcFirewallCens.
 */
export interface GetVpcFirewallCensOutputArgs {
    /**
     * The ID of the CEN instance.
     */
    cenId?: pulumi.Input<string>;
    /**
     * A list of Vpc Firewall Cen IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The language type of the requested and received messages. Value:-**zh** (default): Chinese.-**en**: English.
     */
    lang?: pulumi.Input<string>;
    /**
     * The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
     */
    memberUid?: pulumi.Input<string>;
    /**
     * The ID of the VPC instance that created the VPC firewall.
     */
    networkInstanceId?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * Firewall switch status
     */
    status?: pulumi.Input<string>;
    /**
     * VPC firewall ID
     */
    vpcFirewallId?: pulumi.Input<string>;
    /**
     * The name of the VPC firewall instance.
     */
    vpcFirewallName?: pulumi.Input<string>;
}
