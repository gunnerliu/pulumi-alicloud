// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Cloud Firewall Control Policies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.129.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = pulumi.output(alicloud.cloudfirewall.getControlPolicies({
 *     direction: "in",
 * }));
 * ```
 */
export function getControlPolicies(args: GetControlPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetControlPoliciesResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:cloudfirewall/getControlPolicies:getControlPolicies", {
        "aclAction": args.aclAction,
        "aclUuid": args.aclUuid,
        "description": args.description,
        "destination": args.destination,
        "direction": args.direction,
        "ipVersion": args.ipVersion,
        "lang": args.lang,
        "outputFile": args.outputFile,
        "proto": args.proto,
        "source": args.source,
        "sourceIp": args.sourceIp,
    }, opts);
}

/**
 * A collection of arguments for invoking getControlPolicies.
 */
export interface GetControlPoliciesArgs {
    /**
     * The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     */
    aclAction?: string;
    /**
     * The unique ID of the access control policy.
     */
    aclUuid?: string;
    /**
     * The description of the access control policy.
     */
    description?: string;
    /**
     * The destination address defined in the access control policy.
     */
    destination?: string;
    /**
     * The direction of traffic to which the access control policy applies. Valid values: `in`, `out`.
     */
    direction: string;
    /**
     * The ip version.
     */
    ipVersion?: string;
    /**
     * DestPortGroupPorts. Valid values: `en`, `zh`.
     */
    lang?: string;
    outputFile?: string;
    /**
     * The protocol type of traffic to which the access control policy applies. Valid values: If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `TCP`, `UDP`, `ICMP`.
     */
    proto?: string;
    /**
     * The source address defined in the access control policy.
     */
    source?: string;
    /**
     * The source IP address of the request.
     */
    sourceIp?: string;
}

/**
 * A collection of values returned by getControlPolicies.
 */
export interface GetControlPoliciesResult {
    readonly aclAction?: string;
    readonly aclUuid?: string;
    readonly description?: string;
    readonly destination?: string;
    readonly direction: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly ipVersion?: string;
    readonly lang?: string;
    readonly outputFile?: string;
    readonly policies: outputs.cloudfirewall.GetControlPoliciesPolicy[];
    readonly proto?: string;
    readonly source?: string;
    readonly sourceIp?: string;
}

export function getControlPoliciesOutput(args: GetControlPoliciesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetControlPoliciesResult> {
    return pulumi.output(args).apply(a => getControlPolicies(a, opts))
}

/**
 * A collection of arguments for invoking getControlPolicies.
 */
export interface GetControlPoliciesOutputArgs {
    /**
     * The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     */
    aclAction?: pulumi.Input<string>;
    /**
     * The unique ID of the access control policy.
     */
    aclUuid?: pulumi.Input<string>;
    /**
     * The description of the access control policy.
     */
    description?: pulumi.Input<string>;
    /**
     * The destination address defined in the access control policy.
     */
    destination?: pulumi.Input<string>;
    /**
     * The direction of traffic to which the access control policy applies. Valid values: `in`, `out`.
     */
    direction: pulumi.Input<string>;
    /**
     * The ip version.
     */
    ipVersion?: pulumi.Input<string>;
    /**
     * DestPortGroupPorts. Valid values: `en`, `zh`.
     */
    lang?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The protocol type of traffic to which the access control policy applies. Valid values: If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `TCP`, `UDP`, `ICMP`.
     */
    proto?: pulumi.Input<string>;
    /**
     * The source address defined in the access control policy.
     */
    source?: pulumi.Input<string>;
    /**
     * The source IP address of the request.
     */
    sourceIp?: pulumi.Input<string>;
}