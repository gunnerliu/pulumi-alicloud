// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Global Accelerator (GA) Listener resource.
 *
 * For information about Global Accelerator (GA) Listener and how to use it, see [What is Listener](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createlistener).
 *
 * > **NOTE:** Available since v1.111.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultAccelerator = new alicloud.ga.Accelerator("defaultAccelerator", {
 *     duration: 1,
 *     autoUseCoupon: true,
 *     spec: "1",
 * });
 * const defaultBandwidthPackage = new alicloud.ga.BandwidthPackage("defaultBandwidthPackage", {
 *     bandwidth: 100,
 *     type: "Basic",
 *     bandwidthType: "Basic",
 *     paymentType: "PayAsYouGo",
 *     billingType: "PayBy95",
 *     ratio: 30,
 * });
 * const defaultBandwidthPackageAttachment = new alicloud.ga.BandwidthPackageAttachment("defaultBandwidthPackageAttachment", {
 *     acceleratorId: defaultAccelerator.id,
 *     bandwidthPackageId: defaultBandwidthPackage.id,
 * });
 * const defaultListener = new alicloud.ga.Listener("defaultListener", {
 *     acceleratorId: defaultBandwidthPackageAttachment.acceleratorId,
 *     portRanges: [{
 *         fromPort: 80,
 *         toPort: 80,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Ga Listener can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:ga/listener:Listener example <id>
 * ```
 */
export class Listener extends pulumi.CustomResource {
    /**
     * Get an existing Listener resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ListenerState, opts?: pulumi.CustomResourceOptions): Listener {
        return new Listener(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ga/listener:Listener';

    /**
     * Returns true if the given object is an instance of Listener.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Listener {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Listener.__pulumiType;
    }

    /**
     * The accelerator id.
     */
    public readonly acceleratorId!: pulumi.Output<string>;
    /**
     * The certificates of the listener. See `certificates` below.
     * > **NOTE:** This parameter needs to be configured only for monitoring of the `HTTPS` protocol.
     */
    public readonly certificates!: pulumi.Output<outputs.ga.ListenerCertificate[] | undefined>;
    /**
     * The clientAffinity of the listener. Default value: `NONE`. Valid values:
     */
    public readonly clientAffinity!: pulumi.Output<string | undefined>;
    /**
     * The description of the listener.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The XForward headers. See `forwardedForConfig` below.
     */
    public readonly forwardedForConfig!: pulumi.Output<outputs.ga.ListenerForwardedForConfig | undefined>;
    /**
     * The routing type of the listener. Default Value: `Standard`. Valid values:
     */
    public readonly listenerType!: pulumi.Output<string>;
    /**
     * The name of the listener. The length of the name is 2-128 characters. It starts with uppercase and lowercase letters or Chinese characters. It can contain numbers and underscores and dashes.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The portRanges of the listener. See `portRanges` below.
     * > **NOTE:** For `HTTP` or `HTTPS` protocol monitoring, only one monitoring port can be configured, that is, the start monitoring port and end monitoring port should be the same.
     */
    public readonly portRanges!: pulumi.Output<outputs.ga.ListenerPortRange[]>;
    /**
     * Type of network transport protocol monitored. Default value: `TCP`. Valid values: `TCP`, `UDP`, `HTTP`, `HTTPS`.
     */
    public readonly protocol!: pulumi.Output<string | undefined>;
    /**
     * The proxy protocol of the listener. Default value: `false`. Valid values:
     */
    public readonly proxyProtocol!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the security policy. **NOTE:** Only `HTTPS` listeners support this parameter. Valid values:
     */
    public readonly securityPolicyId!: pulumi.Output<string>;
    /**
     * The status of the listener.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a Listener resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ListenerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ListenerArgs | ListenerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ListenerState | undefined;
            resourceInputs["acceleratorId"] = state ? state.acceleratorId : undefined;
            resourceInputs["certificates"] = state ? state.certificates : undefined;
            resourceInputs["clientAffinity"] = state ? state.clientAffinity : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["forwardedForConfig"] = state ? state.forwardedForConfig : undefined;
            resourceInputs["listenerType"] = state ? state.listenerType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["portRanges"] = state ? state.portRanges : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
            resourceInputs["proxyProtocol"] = state ? state.proxyProtocol : undefined;
            resourceInputs["securityPolicyId"] = state ? state.securityPolicyId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ListenerArgs | undefined;
            if ((!args || args.acceleratorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'acceleratorId'");
            }
            if ((!args || args.portRanges === undefined) && !opts.urn) {
                throw new Error("Missing required property 'portRanges'");
            }
            resourceInputs["acceleratorId"] = args ? args.acceleratorId : undefined;
            resourceInputs["certificates"] = args ? args.certificates : undefined;
            resourceInputs["clientAffinity"] = args ? args.clientAffinity : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["forwardedForConfig"] = args ? args.forwardedForConfig : undefined;
            resourceInputs["listenerType"] = args ? args.listenerType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["portRanges"] = args ? args.portRanges : undefined;
            resourceInputs["protocol"] = args ? args.protocol : undefined;
            resourceInputs["proxyProtocol"] = args ? args.proxyProtocol : undefined;
            resourceInputs["securityPolicyId"] = args ? args.securityPolicyId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Listener.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Listener resources.
 */
export interface ListenerState {
    /**
     * The accelerator id.
     */
    acceleratorId?: pulumi.Input<string>;
    /**
     * The certificates of the listener. See `certificates` below.
     * > **NOTE:** This parameter needs to be configured only for monitoring of the `HTTPS` protocol.
     */
    certificates?: pulumi.Input<pulumi.Input<inputs.ga.ListenerCertificate>[]>;
    /**
     * The clientAffinity of the listener. Default value: `NONE`. Valid values:
     */
    clientAffinity?: pulumi.Input<string>;
    /**
     * The description of the listener.
     */
    description?: pulumi.Input<string>;
    /**
     * The XForward headers. See `forwardedForConfig` below.
     */
    forwardedForConfig?: pulumi.Input<inputs.ga.ListenerForwardedForConfig>;
    /**
     * The routing type of the listener. Default Value: `Standard`. Valid values:
     */
    listenerType?: pulumi.Input<string>;
    /**
     * The name of the listener. The length of the name is 2-128 characters. It starts with uppercase and lowercase letters or Chinese characters. It can contain numbers and underscores and dashes.
     */
    name?: pulumi.Input<string>;
    /**
     * The portRanges of the listener. See `portRanges` below.
     * > **NOTE:** For `HTTP` or `HTTPS` protocol monitoring, only one monitoring port can be configured, that is, the start monitoring port and end monitoring port should be the same.
     */
    portRanges?: pulumi.Input<pulumi.Input<inputs.ga.ListenerPortRange>[]>;
    /**
     * Type of network transport protocol monitored. Default value: `TCP`. Valid values: `TCP`, `UDP`, `HTTP`, `HTTPS`.
     */
    protocol?: pulumi.Input<string>;
    /**
     * The proxy protocol of the listener. Default value: `false`. Valid values:
     */
    proxyProtocol?: pulumi.Input<boolean>;
    /**
     * The ID of the security policy. **NOTE:** Only `HTTPS` listeners support this parameter. Valid values:
     */
    securityPolicyId?: pulumi.Input<string>;
    /**
     * The status of the listener.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Listener resource.
 */
export interface ListenerArgs {
    /**
     * The accelerator id.
     */
    acceleratorId: pulumi.Input<string>;
    /**
     * The certificates of the listener. See `certificates` below.
     * > **NOTE:** This parameter needs to be configured only for monitoring of the `HTTPS` protocol.
     */
    certificates?: pulumi.Input<pulumi.Input<inputs.ga.ListenerCertificate>[]>;
    /**
     * The clientAffinity of the listener. Default value: `NONE`. Valid values:
     */
    clientAffinity?: pulumi.Input<string>;
    /**
     * The description of the listener.
     */
    description?: pulumi.Input<string>;
    /**
     * The XForward headers. See `forwardedForConfig` below.
     */
    forwardedForConfig?: pulumi.Input<inputs.ga.ListenerForwardedForConfig>;
    /**
     * The routing type of the listener. Default Value: `Standard`. Valid values:
     */
    listenerType?: pulumi.Input<string>;
    /**
     * The name of the listener. The length of the name is 2-128 characters. It starts with uppercase and lowercase letters or Chinese characters. It can contain numbers and underscores and dashes.
     */
    name?: pulumi.Input<string>;
    /**
     * The portRanges of the listener. See `portRanges` below.
     * > **NOTE:** For `HTTP` or `HTTPS` protocol monitoring, only one monitoring port can be configured, that is, the start monitoring port and end monitoring port should be the same.
     */
    portRanges: pulumi.Input<pulumi.Input<inputs.ga.ListenerPortRange>[]>;
    /**
     * Type of network transport protocol monitored. Default value: `TCP`. Valid values: `TCP`, `UDP`, `HTTP`, `HTTPS`.
     */
    protocol?: pulumi.Input<string>;
    /**
     * The proxy protocol of the listener. Default value: `false`. Valid values:
     */
    proxyProtocol?: pulumi.Input<boolean>;
    /**
     * The ID of the security policy. **NOTE:** Only `HTTPS` listeners support this parameter. Valid values:
     */
    securityPolicyId?: pulumi.Input<string>;
}
