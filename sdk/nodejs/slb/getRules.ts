// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the rules associated with a server load balancer listener.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "slbrulebasicconfig";
 * const defaultZones = alicloud.getZones({
 *     availableDiskCategory: "cloud_efficiency",
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {cidrBlock: "172.16.0.0/16"});
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/16",
 *     availabilityZone: defaultZones.then(defaultZones => defaultZones.zones[0].id),
 *     vswitchName: name,
 * });
 * const defaultLoadBalancer = new alicloud.slb.LoadBalancer("defaultLoadBalancer", {vswitchId: defaultSwitch.id});
 * const defaultListener = new alicloud.slb.Listener("defaultListener", {
 *     loadBalancerId: defaultLoadBalancer.id,
 *     backendPort: 22,
 *     frontendPort: 22,
 *     protocol: "http",
 *     bandwidth: 5,
 *     healthCheckConnectPort: "20",
 * });
 * const defaultServerGroup = new alicloud.slb.ServerGroup("defaultServerGroup", {loadBalancerId: defaultLoadBalancer.id});
 * const defaultRule = new alicloud.slb.Rule("defaultRule", {
 *     loadBalancerId: defaultLoadBalancer.id,
 *     frontendPort: defaultListener.frontendPort,
 *     domain: "*.aliyun.com",
 *     url: "/image",
 *     serverGroupId: defaultServerGroup.id,
 * });
 * const sampleDs = defaultLoadBalancer.id.apply(id => alicloud.slb.getRules({
 *     loadBalancerId: id,
 *     frontendPort: 22,
 * }));
 * export const firstSlbRuleId = sampleDs.slbRules[0].id;
 * ```
 */
export function getRules(args: GetRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetRulesResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:slb/getRules:getRules", {
        "frontendPort": args.frontendPort,
        "ids": args.ids,
        "loadBalancerId": args.loadBalancerId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getRules.
 */
export interface GetRulesArgs {
    /**
     * SLB listener port.
     */
    readonly frontendPort: number;
    /**
     * A list of rules IDs to filter results.
     */
    readonly ids?: string[];
    /**
     * ID of the SLB with listener rules.
     */
    readonly loadBalancerId: string;
    /**
     * A regex string to filter results by rule name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
}

/**
 * A collection of values returned by getRules.
 */
export interface GetRulesResult {
    readonly frontendPort: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of SLB listener rules IDs.
     */
    readonly ids: string[];
    readonly loadBalancerId: string;
    readonly nameRegex?: string;
    /**
     * A list of SLB listener rules names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A list of SLB listener rules. Each element contains the following attributes:
     */
    readonly slbRules: outputs.slb.GetRulesSlbRule[];
}
