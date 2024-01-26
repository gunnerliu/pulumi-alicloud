// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Arms Prometheus of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.214.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-example";
 * const defaultNetworks = alicloud.vpc.getNetworks({
 *     nameRegex: "default-NODELETING",
 * });
 * const defaultSwitches = defaultNetworks.then(defaultNetworks => alicloud.vpc.getSwitches({
 *     vpcId: defaultNetworks.ids?.[0],
 * }));
 * const defaultResourceGroups = alicloud.resourcemanager.getResourceGroups({});
 * const defaultSecurityGroup = new alicloud.ecs.SecurityGroup("defaultSecurityGroup", {vpcId: defaultNetworks.then(defaultNetworks => defaultNetworks.ids?.[0])});
 * const defaultPrometheus = new alicloud.arms.Prometheus("defaultPrometheus", {
 *     clusterType: "ecs",
 *     grafanaInstanceId: "free",
 *     vpcId: defaultNetworks.then(defaultNetworks => defaultNetworks.ids?.[0]),
 *     vswitchId: defaultSwitches.then(defaultSwitches => defaultSwitches.ids?.[0]),
 *     securityGroupId: defaultSecurityGroup.id,
 *     clusterName: defaultNetworks.then(defaultNetworks => `${name}-${defaultNetworks.ids?.[0]}`),
 *     resourceGroupId: defaultResourceGroups.then(defaultResourceGroups => defaultResourceGroups.groups?.[1]?.id),
 *     tags: {
 *         Created: "TF",
 *         For: "Prometheus",
 *     },
 * });
 * const nameRegex = alicloud.arms.getPrometheusOutput({
 *     nameRegex: defaultPrometheus.clusterName,
 * });
 * export const armsPrometheusId = nameRegex.apply(nameRegex => nameRegex.prometheis?.[0]?.id);
 * ```
 */
export function getPrometheus(args?: GetPrometheusArgs, opts?: pulumi.InvokeOptions): Promise<GetPrometheusResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:arms/getPrometheus:getPrometheus", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrometheus.
 */
export interface GetPrometheusArgs {
    /**
     * Whether to query details about the instance.
     */
    enableDetails?: boolean;
    /**
     * A list of Prometheus IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Prometheus name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: {[key: string]: any};
}

/**
 * A collection of values returned by getPrometheus.
 */
export interface GetPrometheusResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of Prometheus names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A list of Prometheus. Each element contains the following attributes:
     */
    readonly prometheis: outputs.arms.GetPrometheusPromethei[];
    /**
     * The ID of the resource group.
     */
    readonly resourceGroupId?: string;
    /**
     * The tag of the Prometheus.
     */
    readonly tags?: {[key: string]: any};
}
/**
 * This data source provides the Arms Prometheus of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.214.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-example";
 * const defaultNetworks = alicloud.vpc.getNetworks({
 *     nameRegex: "default-NODELETING",
 * });
 * const defaultSwitches = defaultNetworks.then(defaultNetworks => alicloud.vpc.getSwitches({
 *     vpcId: defaultNetworks.ids?.[0],
 * }));
 * const defaultResourceGroups = alicloud.resourcemanager.getResourceGroups({});
 * const defaultSecurityGroup = new alicloud.ecs.SecurityGroup("defaultSecurityGroup", {vpcId: defaultNetworks.then(defaultNetworks => defaultNetworks.ids?.[0])});
 * const defaultPrometheus = new alicloud.arms.Prometheus("defaultPrometheus", {
 *     clusterType: "ecs",
 *     grafanaInstanceId: "free",
 *     vpcId: defaultNetworks.then(defaultNetworks => defaultNetworks.ids?.[0]),
 *     vswitchId: defaultSwitches.then(defaultSwitches => defaultSwitches.ids?.[0]),
 *     securityGroupId: defaultSecurityGroup.id,
 *     clusterName: defaultNetworks.then(defaultNetworks => `${name}-${defaultNetworks.ids?.[0]}`),
 *     resourceGroupId: defaultResourceGroups.then(defaultResourceGroups => defaultResourceGroups.groups?.[1]?.id),
 *     tags: {
 *         Created: "TF",
 *         For: "Prometheus",
 *     },
 * });
 * const nameRegex = alicloud.arms.getPrometheusOutput({
 *     nameRegex: defaultPrometheus.clusterName,
 * });
 * export const armsPrometheusId = nameRegex.apply(nameRegex => nameRegex.prometheis?.[0]?.id);
 * ```
 */
export function getPrometheusOutput(args?: GetPrometheusOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrometheusResult> {
    return pulumi.output(args).apply((a: any) => getPrometheus(a, opts))
}

/**
 * A collection of arguments for invoking getPrometheus.
 */
export interface GetPrometheusOutputArgs {
    /**
     * Whether to query details about the instance.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Prometheus IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Prometheus name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}