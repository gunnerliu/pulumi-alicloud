// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Cloud Firewall Vpc Firewall Control Policies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.194.0+.
 */
export function getVpcFirewallControlPolicies(args: GetVpcFirewallControlPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcFirewallControlPoliciesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cloudfirewall/getVpcFirewallControlPolicies:getVpcFirewallControlPolicies", {
        "aclAction": args.aclAction,
        "aclUuid": args.aclUuid,
        "description": args.description,
        "destination": args.destination,
        "ids": args.ids,
        "lang": args.lang,
        "memberUid": args.memberUid,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "proto": args.proto,
        "release": args.release,
        "source": args.source,
        "vpcFirewallId": args.vpcFirewallId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcFirewallControlPolicies.
 */
export interface GetVpcFirewallControlPoliciesArgs {
    /**
     * Access control over VPC firewalls are set in the access traffic via Alibaba cloud firewall way (ACT).
     */
    aclAction?: string;
    /**
     * Access control over VPC firewalls strategy unique identifier.
     */
    aclUuid?: string;
    /**
     * Access control over VPC firewalls description of the strategy information.
     */
    description?: string;
    /**
     * Access control over VPC firewalls strategy the destination address in.
     */
    destination?: string;
    /**
     * A list of Vpc Firewall Control Policy IDs.
     */
    ids?: string[];
    /**
     * The language of the content within the request and response. Valid values: `zh`, `en`.
     */
    lang?: string;
    /**
     * The UID of the member account of the current Alibaba cloud account.
     */
    memberUid?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * Access control over VPC firewalls strategy access traffic of the protocol type.
     */
    proto?: string;
    /**
     * The enabled status of the access control policy. The policy is enabled by default after it is created. Value:
     */
    release?: boolean;
    /**
     * Access control over VPC firewalls strategy in the source address.
     */
    source?: string;
    /**
     * The ID of the VPC firewall instance.
     */
    vpcFirewallId: string;
}

/**
 * A collection of values returned by getVpcFirewallControlPolicies.
 */
export interface GetVpcFirewallControlPoliciesResult {
    readonly aclAction?: string;
    readonly aclUuid?: string;
    readonly description?: string;
    readonly destination?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly lang?: string;
    readonly memberUid?: string;
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    readonly policies: outputs.cloudfirewall.GetVpcFirewallControlPoliciesPolicy[];
    readonly proto?: string;
    readonly release?: boolean;
    readonly source?: string;
    readonly vpcFirewallId: string;
}
/**
 * This data source provides the Cloud Firewall Vpc Firewall Control Policies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.194.0+.
 */
export function getVpcFirewallControlPoliciesOutput(args: GetVpcFirewallControlPoliciesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVpcFirewallControlPoliciesResult> {
    return pulumi.output(args).apply((a: any) => getVpcFirewallControlPolicies(a, opts))
}

/**
 * A collection of arguments for invoking getVpcFirewallControlPolicies.
 */
export interface GetVpcFirewallControlPoliciesOutputArgs {
    /**
     * Access control over VPC firewalls are set in the access traffic via Alibaba cloud firewall way (ACT).
     */
    aclAction?: pulumi.Input<string>;
    /**
     * Access control over VPC firewalls strategy unique identifier.
     */
    aclUuid?: pulumi.Input<string>;
    /**
     * Access control over VPC firewalls description of the strategy information.
     */
    description?: pulumi.Input<string>;
    /**
     * Access control over VPC firewalls strategy the destination address in.
     */
    destination?: pulumi.Input<string>;
    /**
     * A list of Vpc Firewall Control Policy IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The language of the content within the request and response. Valid values: `zh`, `en`.
     */
    lang?: pulumi.Input<string>;
    /**
     * The UID of the member account of the current Alibaba cloud account.
     */
    memberUid?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * Access control over VPC firewalls strategy access traffic of the protocol type.
     */
    proto?: pulumi.Input<string>;
    /**
     * The enabled status of the access control policy. The policy is enabled by default after it is created. Value:
     */
    release?: pulumi.Input<boolean>;
    /**
     * Access control over VPC firewalls strategy in the source address.
     */
    source?: pulumi.Input<string>;
    /**
     * The ID of the VPC firewall instance.
     */
    vpcFirewallId: pulumi.Input<string>;
}
