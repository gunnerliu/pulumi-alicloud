// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Threat Detection Honeypot Probe resource.
 *
 * For information about Threat Detection Honeypot Probe and how to use it, see [What is Honeypot Probe](https://www.alibabacloud.com/help/en/security-center/latest/api-doc-sas-2018-12-03-api-doc-createhoneypotprobe).
 *
 * > **NOTE:** Available in v1.195.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.threatdetection.HoneypotProbe("default", {
 *     arp: true,
 *     controlNodeId: "a44e1ab3-6945-444c-889d-5bacee7056e8",
 *     displayName: "apispec",
 *     honeypotBindLists: [{
 *         bindPortLists: [{
 *             endPort: 80,
 *             startPort: 80,
 *         }],
 *         honeypotId: "ede59ccdb1b7a2e21735d4593a6eb5ed31883af320c5ab63ab33818e94307be9",
 *     }],
 *     ping: true,
 *     probeType: "host_probe",
 *     uuid: "032b618f-b220-4a0d-bd37-fbdc6ef58b6a",
 * });
 * ```
 *
 * ## Import
 *
 * Threat Detection Honeypot Probe can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:threatdetection/honeypotProbe:HoneypotProbe example <id>
 * ```
 */
export class HoneypotProbe extends pulumi.CustomResource {
    /**
     * Get an existing HoneypotProbe resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HoneypotProbeState, opts?: pulumi.CustomResourceOptions): HoneypotProbe {
        return new HoneypotProbe(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:threatdetection/honeypotProbe:HoneypotProbe';

    /**
     * Returns true if the given object is an instance of HoneypotProbe.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is HoneypotProbe {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === HoneypotProbe.__pulumiType;
    }

    /**
     * ARP spoofing detection.**true**: Enable **false**: Disabled
     */
    public readonly arp!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the management node.
     */
    public readonly controlNodeId!: pulumi.Output<string>;
    /**
     * Probe display name.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Configure the service.See the following `Block HoneypotBindList`.
     */
    public readonly honeypotBindLists!: pulumi.Output<outputs.threatdetection.HoneypotProbeHoneypotBindList[] | undefined>;
    /**
     * The first ID of the resource
     */
    public /*out*/ readonly honeypotProbeId!: pulumi.Output<string>;
    /**
     * Ping scan detection. Value: **true**: Enable **false**: Disabled
     */
    public readonly ping!: pulumi.Output<boolean | undefined>;
    /**
     * Probe type, support `hostProbe` and `vpcBlackHoleProbe`.
     */
    public readonly probeType!: pulumi.Output<string>;
    /**
     * The version of the probe.
     */
    public readonly probeVersion!: pulumi.Output<string>;
    /**
     * The IP address of the proxy.
     */
    public readonly proxyIp!: pulumi.Output<string | undefined>;
    /**
     * Listen to the IP address list.
     */
    public readonly serviceIpLists!: pulumi.Output<string[]>;
    /**
     * The status of the resource
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Machine uuid, **probe_type** is `hostProbe`. This value cannot be empty.
     */
    public readonly uuid!: pulumi.Output<string | undefined>;
    /**
     * The ID of the VPC. **probe_type** is `vpcBlackHoleProbe`. This value cannot be empty.
     */
    public readonly vpcId!: pulumi.Output<string | undefined>;

    /**
     * Create a HoneypotProbe resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HoneypotProbeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HoneypotProbeArgs | HoneypotProbeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HoneypotProbeState | undefined;
            resourceInputs["arp"] = state ? state.arp : undefined;
            resourceInputs["controlNodeId"] = state ? state.controlNodeId : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["honeypotBindLists"] = state ? state.honeypotBindLists : undefined;
            resourceInputs["honeypotProbeId"] = state ? state.honeypotProbeId : undefined;
            resourceInputs["ping"] = state ? state.ping : undefined;
            resourceInputs["probeType"] = state ? state.probeType : undefined;
            resourceInputs["probeVersion"] = state ? state.probeVersion : undefined;
            resourceInputs["proxyIp"] = state ? state.proxyIp : undefined;
            resourceInputs["serviceIpLists"] = state ? state.serviceIpLists : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as HoneypotProbeArgs | undefined;
            if ((!args || args.controlNodeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'controlNodeId'");
            }
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.probeType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'probeType'");
            }
            resourceInputs["arp"] = args ? args.arp : undefined;
            resourceInputs["controlNodeId"] = args ? args.controlNodeId : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["honeypotBindLists"] = args ? args.honeypotBindLists : undefined;
            resourceInputs["ping"] = args ? args.ping : undefined;
            resourceInputs["probeType"] = args ? args.probeType : undefined;
            resourceInputs["probeVersion"] = args ? args.probeVersion : undefined;
            resourceInputs["proxyIp"] = args ? args.proxyIp : undefined;
            resourceInputs["serviceIpLists"] = args ? args.serviceIpLists : undefined;
            resourceInputs["uuid"] = args ? args.uuid : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["honeypotProbeId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(HoneypotProbe.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering HoneypotProbe resources.
 */
export interface HoneypotProbeState {
    /**
     * ARP spoofing detection.**true**: Enable **false**: Disabled
     */
    arp?: pulumi.Input<boolean>;
    /**
     * The ID of the management node.
     */
    controlNodeId?: pulumi.Input<string>;
    /**
     * Probe display name.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Configure the service.See the following `Block HoneypotBindList`.
     */
    honeypotBindLists?: pulumi.Input<pulumi.Input<inputs.threatdetection.HoneypotProbeHoneypotBindList>[]>;
    /**
     * The first ID of the resource
     */
    honeypotProbeId?: pulumi.Input<string>;
    /**
     * Ping scan detection. Value: **true**: Enable **false**: Disabled
     */
    ping?: pulumi.Input<boolean>;
    /**
     * Probe type, support `hostProbe` and `vpcBlackHoleProbe`.
     */
    probeType?: pulumi.Input<string>;
    /**
     * The version of the probe.
     */
    probeVersion?: pulumi.Input<string>;
    /**
     * The IP address of the proxy.
     */
    proxyIp?: pulumi.Input<string>;
    /**
     * Listen to the IP address list.
     */
    serviceIpLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The status of the resource
     */
    status?: pulumi.Input<string>;
    /**
     * Machine uuid, **probe_type** is `hostProbe`. This value cannot be empty.
     */
    uuid?: pulumi.Input<string>;
    /**
     * The ID of the VPC. **probe_type** is `vpcBlackHoleProbe`. This value cannot be empty.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a HoneypotProbe resource.
 */
export interface HoneypotProbeArgs {
    /**
     * ARP spoofing detection.**true**: Enable **false**: Disabled
     */
    arp?: pulumi.Input<boolean>;
    /**
     * The ID of the management node.
     */
    controlNodeId: pulumi.Input<string>;
    /**
     * Probe display name.
     */
    displayName: pulumi.Input<string>;
    /**
     * Configure the service.See the following `Block HoneypotBindList`.
     */
    honeypotBindLists?: pulumi.Input<pulumi.Input<inputs.threatdetection.HoneypotProbeHoneypotBindList>[]>;
    /**
     * Ping scan detection. Value: **true**: Enable **false**: Disabled
     */
    ping?: pulumi.Input<boolean>;
    /**
     * Probe type, support `hostProbe` and `vpcBlackHoleProbe`.
     */
    probeType: pulumi.Input<string>;
    /**
     * The version of the probe.
     */
    probeVersion?: pulumi.Input<string>;
    /**
     * The IP address of the proxy.
     */
    proxyIp?: pulumi.Input<string>;
    /**
     * Listen to the IP address list.
     */
    serviceIpLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Machine uuid, **probe_type** is `hostProbe`. This value cannot be empty.
     */
    uuid?: pulumi.Input<string>;
    /**
     * The ID of the VPC. **probe_type** is `vpcBlackHoleProbe`. This value cannot be empty.
     */
    vpcId?: pulumi.Input<string>;
}