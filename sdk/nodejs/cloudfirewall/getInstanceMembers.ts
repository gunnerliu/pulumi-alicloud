// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Cloud Firewall Instance Member available to the user.[What is Instance Member](https://help.aliyun.com/document_detail/261237.html)
 *
 * > **NOTE:** Available in 1.194.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.cloudfirewall.getInstanceMembers({
 *     ids: [alicloud_cloud_firewall_instance_member["default"].id],
 * });
 * export const alicloudCloudFirewallInstanceMemberExampleId = _default.then(_default => _default.members?.[0]?.id);
 * ```
 */
export function getInstanceMembers(args?: GetInstanceMembersArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceMembersResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cloudfirewall/getInstanceMembers:getInstanceMembers", {
        "currentPage": args.currentPage,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceMembers.
 */
export interface GetInstanceMembersArgs {
    currentPage?: string;
    /**
     * A list of Instance Member IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
}

/**
 * A collection of values returned by getInstanceMembers.
 */
export interface GetInstanceMembersResult {
    readonly currentPage?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Instance Member IDs.
     */
    readonly ids: string[];
    /**
     * A list of Instance Member Entries. Each element contains the following attributes:
     */
    readonly members: outputs.cloudfirewall.GetInstanceMembersMember[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
}
/**
 * This data source provides Cloud Firewall Instance Member available to the user.[What is Instance Member](https://help.aliyun.com/document_detail/261237.html)
 *
 * > **NOTE:** Available in 1.194.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.cloudfirewall.getInstanceMembers({
 *     ids: [alicloud_cloud_firewall_instance_member["default"].id],
 * });
 * export const alicloudCloudFirewallInstanceMemberExampleId = _default.then(_default => _default.members?.[0]?.id);
 * ```
 */
export function getInstanceMembersOutput(args?: GetInstanceMembersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInstanceMembersResult> {
    return pulumi.output(args).apply((a: any) => getInstanceMembers(a, opts))
}

/**
 * A collection of arguments for invoking getInstanceMembers.
 */
export interface GetInstanceMembersOutputArgs {
    currentPage?: pulumi.Input<string>;
    /**
     * A list of Instance Member IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
}
