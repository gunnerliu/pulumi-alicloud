// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides a list of available addons that the cluster can install.
 *
 * > **NOTE:** Available in 1.150.0+.
 * **NOTE:** From version 1.166.0, support for returning custom configuration of kubernetes cluster addon.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.cs.getKubernetesAddons({
 *     clusterId: alicloud_cs_managed_kubernetes["default"][0].id,
 * });
 * export const addons = _default.then(_default => _default.addons);
 * ```
 */
export function getKubernetesAddons(args: GetKubernetesAddonsArgs, opts?: pulumi.InvokeOptions): Promise<GetKubernetesAddonsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:cs/getKubernetesAddons:getKubernetesAddons", {
        "addons": args.addons,
        "clusterId": args.clusterId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
    }, opts);
}

/**
 * A collection of arguments for invoking getKubernetesAddons.
 */
export interface GetKubernetesAddonsArgs {
    /**
     * A list of addons.
     */
    addons?: inputs.cs.GetKubernetesAddonsAddon[];
    /**
     * The id of kubernetes cluster.
     */
    clusterId: string;
    /**
     * A list of addon IDs. The id of addon consists of the cluster id and the addon name, with the structure <cluster_ud>:<addon_name>.
     */
    ids?: string[];
    /**
     * A regex string to filter results by addon name.
     */
    nameRegex?: string;
}

/**
 * A collection of values returned by getKubernetesAddons.
 */
export interface GetKubernetesAddonsResult {
    /**
     * A list of addons.
     */
    readonly addons?: outputs.cs.GetKubernetesAddonsAddon[];
    /**
     * The id of kubernetes cluster.
     */
    readonly clusterId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of addon names.
     */
    readonly names: string[];
}

export function getKubernetesAddonsOutput(args: GetKubernetesAddonsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKubernetesAddonsResult> {
    return pulumi.output(args).apply(a => getKubernetesAddons(a, opts))
}

/**
 * A collection of arguments for invoking getKubernetesAddons.
 */
export interface GetKubernetesAddonsOutputArgs {
    /**
     * A list of addons.
     */
    addons?: pulumi.Input<pulumi.Input<inputs.cs.GetKubernetesAddonsAddonArgs>[]>;
    /**
     * The id of kubernetes cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * A list of addon IDs. The id of addon consists of the cluster id and the addon name, with the structure <cluster_ud>:<addon_name>.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by addon name.
     */
    nameRegex?: pulumi.Input<string>;
}
