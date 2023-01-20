// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Threat Detection Honeypot Probe available to the user.[What is Honeypot Probe](https://www.alibabacloud.com/help/en/security-center/latest/api-doc-sas-2018-12-03-api-doc-createhoneypotprobe)
 *
 * > **NOTE:** Available in 1.195.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-testAccThreatDetectionHoneypotProbe";
 * const defaultHoneypotProbe = new alicloud.threatdetection.HoneypotProbe("defaultHoneypotProbe", {
 *     uuid: "e52c7872-29d1-4aa1-9908-0299abd53606",
 *     probeType: "host_probe",
 *     controlNodeId: "e1397077-4941-4b14-b533-ca2bdebd00a3",
 *     ping: true,
 *     honeypotBindLists: [{
 *         bindPortLists: [{
 *             startPort: 80,
 *             endPort: 80,
 *         }],
 *         honeypotId: "4925bf9784de992ecd017ad051528a03b3927ef814eeff76c2ebb3ab9a84bf05",
 *     }],
 *     displayName: name,
 *     arp: true,
 * });
 * const defaultHoneypotProbes = alicloud.threatdetection.getHoneypotProbesOutput({
 *     ids: [defaultHoneypotProbe.id],
 *     displayName: name,
 *     probeType: "host_probe",
 *     enableDetails: true,
 * });
 * export const alicloudThreatDetectionHoneypotProbeExampleId = defaultHoneypotProbes.apply(defaultHoneypotProbes => defaultHoneypotProbes.probes?.[0]?.id);
 * ```
 */
export function getHoneypotProbes(args?: GetHoneypotProbesArgs, opts?: pulumi.InvokeOptions): Promise<GetHoneypotProbesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:threatdetection/getHoneypotProbes:getHoneypotProbes", {
        "displayName": args.displayName,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "probeStatus": args.probeStatus,
        "probeType": args.probeType,
    }, opts);
}

/**
 * A collection of arguments for invoking getHoneypotProbes.
 */
export interface GetHoneypotProbesArgs {
    /**
     * Probe name
     */
    displayName?: string;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Honeypot Probe IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by display name.
     */
    nameRegex?: string;
    outputFile?: string;
    probeStatus?: string;
    /**
     * Probe type
     */
    probeType?: string;
}

/**
 * A collection of values returned by getHoneypotProbes.
 */
export interface GetHoneypotProbesResult {
    /**
     * Probe name.
     */
    readonly displayName?: string;
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Honeypot Probe IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly outputFile?: string;
    readonly probeStatus?: string;
    /**
     * Probe type, support `hostProbe` and `vpcBlackHoleProbe`.
     */
    readonly probeType?: string;
    /**
     * A list of Honeypot Probe Entries. Each element contains the following attributes:
     */
    readonly probes: outputs.threatdetection.GetHoneypotProbesProbe[];
}
/**
 * This data source provides Threat Detection Honeypot Probe available to the user.[What is Honeypot Probe](https://www.alibabacloud.com/help/en/security-center/latest/api-doc-sas-2018-12-03-api-doc-createhoneypotprobe)
 *
 * > **NOTE:** Available in 1.195.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-testAccThreatDetectionHoneypotProbe";
 * const defaultHoneypotProbe = new alicloud.threatdetection.HoneypotProbe("defaultHoneypotProbe", {
 *     uuid: "e52c7872-29d1-4aa1-9908-0299abd53606",
 *     probeType: "host_probe",
 *     controlNodeId: "e1397077-4941-4b14-b533-ca2bdebd00a3",
 *     ping: true,
 *     honeypotBindLists: [{
 *         bindPortLists: [{
 *             startPort: 80,
 *             endPort: 80,
 *         }],
 *         honeypotId: "4925bf9784de992ecd017ad051528a03b3927ef814eeff76c2ebb3ab9a84bf05",
 *     }],
 *     displayName: name,
 *     arp: true,
 * });
 * const defaultHoneypotProbes = alicloud.threatdetection.getHoneypotProbesOutput({
 *     ids: [defaultHoneypotProbe.id],
 *     displayName: name,
 *     probeType: "host_probe",
 *     enableDetails: true,
 * });
 * export const alicloudThreatDetectionHoneypotProbeExampleId = defaultHoneypotProbes.apply(defaultHoneypotProbes => defaultHoneypotProbes.probes?.[0]?.id);
 * ```
 */
export function getHoneypotProbesOutput(args?: GetHoneypotProbesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetHoneypotProbesResult> {
    return pulumi.output(args).apply((a: any) => getHoneypotProbes(a, opts))
}

/**
 * A collection of arguments for invoking getHoneypotProbes.
 */
export interface GetHoneypotProbesOutputArgs {
    /**
     * Probe name
     */
    displayName?: pulumi.Input<string>;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Honeypot Probe IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by display name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    probeStatus?: pulumi.Input<string>;
    /**
     * Probe type
     */
    probeType?: pulumi.Input<string>;
}
