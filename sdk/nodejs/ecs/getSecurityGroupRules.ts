// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * The `alicloud.ecs.getSecurityGroupRules` data source provides a collection of security permissions of a specific security group.
 * Each collection item represents a single `ingress` or `egress` permission rule.
 * The ID of the security group can be provided via a variable or the result from the other data source `alicloud.ecs.getSecurityGroups`.
 */
export function getSecurityGroupRules(args: GetSecurityGroupRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetSecurityGroupRulesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ecs/getSecurityGroupRules:getSecurityGroupRules", {
        "direction": args.direction,
        "groupId": args.groupId,
        "ipProtocol": args.ipProtocol,
        "nicType": args.nicType,
        "outputFile": args.outputFile,
        "policy": args.policy,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecurityGroupRules.
 */
export interface GetSecurityGroupRulesArgs {
    /**
     * Authorization direction. Valid values are: `ingress` or `egress`.
     */
    direction?: string;
    /**
     * The ID of the security group that owns the rules.
     */
    groupId: string;
    /**
     * The IP protocol. Valid values are: `tcp`, `udp`, `icmp`, `gre` and `all`.
     */
    ipProtocol?: string;
    /**
     * Refers to the network type. Can be either `internet` or `intranet`. The default value is `internet`.
     */
    nicType?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * Authorization policy. Can be either `accept` or `drop`. The default value is `accept`.
     */
    policy?: string;
}

/**
 * A collection of values returned by getSecurityGroupRules.
 */
export interface GetSecurityGroupRulesResult {
    /**
     * Authorization direction, `ingress` or `egress`.
     */
    readonly direction?: string;
    /**
     * The description of the security group that owns the rules.
     */
    readonly groupDesc: string;
    readonly groupId: string;
    /**
     * The name of the security group that owns the rules.
     */
    readonly groupName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
     */
    readonly ipProtocol?: string;
    /**
     * Network type, `internet` or `intranet`.
     */
    readonly nicType?: string;
    readonly outputFile?: string;
    /**
     * Authorization policy. Can be either `accept` or `drop`.
     */
    readonly policy?: string;
    /**
     * A list of security group rules. Each element contains the following attributes:
     */
    readonly rules: outputs.ecs.GetSecurityGroupRulesRule[];
}
/**
 * The `alicloud.ecs.getSecurityGroupRules` data source provides a collection of security permissions of a specific security group.
 * Each collection item represents a single `ingress` or `egress` permission rule.
 * The ID of the security group can be provided via a variable or the result from the other data source `alicloud.ecs.getSecurityGroups`.
 */
export function getSecurityGroupRulesOutput(args: GetSecurityGroupRulesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSecurityGroupRulesResult> {
    return pulumi.output(args).apply((a: any) => getSecurityGroupRules(a, opts))
}

/**
 * A collection of arguments for invoking getSecurityGroupRules.
 */
export interface GetSecurityGroupRulesOutputArgs {
    /**
     * Authorization direction. Valid values are: `ingress` or `egress`.
     */
    direction?: pulumi.Input<string>;
    /**
     * The ID of the security group that owns the rules.
     */
    groupId: pulumi.Input<string>;
    /**
     * The IP protocol. Valid values are: `tcp`, `udp`, `icmp`, `gre` and `all`.
     */
    ipProtocol?: pulumi.Input<string>;
    /**
     * Refers to the network type. Can be either `internet` or `intranet`. The default value is `internet`.
     */
    nicType?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * Authorization policy. Can be either `accept` or `drop`. The default value is `accept`.
     */
    policy?: pulumi.Input<string>;
}
