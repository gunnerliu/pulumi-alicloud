// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Sae Config Maps of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.130.0+.
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
 * const configMapName = config.get("configMapName") || "examplename";
 * const exampleNamespace = new alicloud.sae.Namespace("exampleNamespace", {
 *     namespaceId: "cn-hangzhou:yourname",
 *     namespaceName: "example_value",
 *     namespaceDescription: "your_description",
 * });
 * const exampleConfigMap = new alicloud.sae.ConfigMap("exampleConfigMap", {
 *     data: JSON.stringify({
 *         "env.home": "/root",
 *         "env.shell": "/bin/sh",
 *     }),
 *     namespaceId: exampleNamespace.namespaceId,
 * });
 * const nameRegex = alicloud.sae.getConfigMapsOutput({
 *     namespaceId: exampleNamespace.namespaceId,
 *     nameRegex: "^example",
 * });
 * export const saeConfigMapId = nameRegex.apply(nameRegex => nameRegex.maps?.[0]?.id);
 * ```
 */
export function getConfigMaps(args: GetConfigMapsArgs, opts?: pulumi.InvokeOptions): Promise<GetConfigMapsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:sae/getConfigMaps:getConfigMaps", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "namespaceId": args.namespaceId,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getConfigMaps.
 */
export interface GetConfigMapsArgs {
    /**
     * A list of Config Map IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Config Map name.
     */
    nameRegex?: string;
    /**
     * The NamespaceId of Config Maps.
     */
    namespaceId: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getConfigMaps.
 */
export interface GetConfigMapsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly maps: outputs.sae.GetConfigMapsMap[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly namespaceId: string;
    readonly outputFile?: string;
}
/**
 * This data source provides the Sae Config Maps of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.130.0+.
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
 * const configMapName = config.get("configMapName") || "examplename";
 * const exampleNamespace = new alicloud.sae.Namespace("exampleNamespace", {
 *     namespaceId: "cn-hangzhou:yourname",
 *     namespaceName: "example_value",
 *     namespaceDescription: "your_description",
 * });
 * const exampleConfigMap = new alicloud.sae.ConfigMap("exampleConfigMap", {
 *     data: JSON.stringify({
 *         "env.home": "/root",
 *         "env.shell": "/bin/sh",
 *     }),
 *     namespaceId: exampleNamespace.namespaceId,
 * });
 * const nameRegex = alicloud.sae.getConfigMapsOutput({
 *     namespaceId: exampleNamespace.namespaceId,
 *     nameRegex: "^example",
 * });
 * export const saeConfigMapId = nameRegex.apply(nameRegex => nameRegex.maps?.[0]?.id);
 * ```
 */
export function getConfigMapsOutput(args: GetConfigMapsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetConfigMapsResult> {
    return pulumi.output(args).apply((a: any) => getConfigMaps(a, opts))
}

/**
 * A collection of arguments for invoking getConfigMaps.
 */
export interface GetConfigMapsOutputArgs {
    /**
     * A list of Config Map IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Config Map name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * The NamespaceId of Config Maps.
     */
    namespaceId: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
