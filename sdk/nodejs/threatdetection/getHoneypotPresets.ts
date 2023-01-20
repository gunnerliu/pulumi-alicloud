// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Threat Detection Honeypot Preset available to the user.
 *
 * > **NOTE:** Available in 1.195.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.threatdetection.getHoneypotPresets({
 *     ids: [alicloud_threat_detection_honeypot_preset["default"].id],
 *     honeypotImageName: "shiro",
 *     nodeId: "example_value",
 *     presetName: "apiapec_test",
 * });
 * export const alicloudThreatDetectionHoneypotPresetExampleId = _default.then(_default => _default.presets?.[0]?.id);
 * ```
 */
export function getHoneypotPresets(args?: GetHoneypotPresetsArgs, opts?: pulumi.InvokeOptions): Promise<GetHoneypotPresetsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:threatdetection/getHoneypotPresets:getHoneypotPresets", {
        "currentPage": args.currentPage,
        "enableDetails": args.enableDetails,
        "honeypotImageName": args.honeypotImageName,
        "ids": args.ids,
        "lang": args.lang,
        "nodeId": args.nodeId,
        "nodeName": args.nodeName,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "presetName": args.presetName,
    }, opts);
}

/**
 * A collection of arguments for invoking getHoneypotPresets.
 */
export interface GetHoneypotPresetsArgs {
    currentPage?: number;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * Honeypot mirror name
     */
    honeypotImageName?: string;
    /**
     * A list of Honeypot Preset IDs.
     */
    ids?: string[];
    lang?: string;
    /**
     * Unique id of management node
     */
    nodeId?: string;
    nodeName?: string;
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * Honeypot template custom name
     */
    presetName?: string;
}

/**
 * A collection of values returned by getHoneypotPresets.
 */
export interface GetHoneypotPresetsResult {
    readonly currentPage?: number;
    readonly enableDetails?: boolean;
    /**
     * Honeypot mirror name.
     */
    readonly honeypotImageName?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Honeypot Preset IDs.
     */
    readonly ids: string[];
    readonly lang?: string;
    /**
     * Unique id of management node.
     */
    readonly nodeId?: string;
    readonly nodeName?: string;
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    /**
     * Honeypot template custom name.
     */
    readonly presetName?: string;
    /**
     * A list of Honeypot Preset Entries. Each element contains the following attributes:
     */
    readonly presets: outputs.threatdetection.GetHoneypotPresetsPreset[];
}
/**
 * This data source provides Threat Detection Honeypot Preset available to the user.
 *
 * > **NOTE:** Available in 1.195.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.threatdetection.getHoneypotPresets({
 *     ids: [alicloud_threat_detection_honeypot_preset["default"].id],
 *     honeypotImageName: "shiro",
 *     nodeId: "example_value",
 *     presetName: "apiapec_test",
 * });
 * export const alicloudThreatDetectionHoneypotPresetExampleId = _default.then(_default => _default.presets?.[0]?.id);
 * ```
 */
export function getHoneypotPresetsOutput(args?: GetHoneypotPresetsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetHoneypotPresetsResult> {
    return pulumi.output(args).apply((a: any) => getHoneypotPresets(a, opts))
}

/**
 * A collection of arguments for invoking getHoneypotPresets.
 */
export interface GetHoneypotPresetsOutputArgs {
    currentPage?: pulumi.Input<number>;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * Honeypot mirror name
     */
    honeypotImageName?: pulumi.Input<string>;
    /**
     * A list of Honeypot Preset IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    lang?: pulumi.Input<string>;
    /**
     * Unique id of management node
     */
    nodeId?: pulumi.Input<string>;
    nodeName?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * Honeypot template custom name
     */
    presetName?: pulumi.Input<string>;
}
