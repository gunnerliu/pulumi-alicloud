// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a CDN Real Time Log Delivery resource.
 *
 * For information about CDN Real Time Log Delivery and how to use it, see [What is Real Time Log Delivery](https://www.alibabacloud.com/help/en/cdn/developer-reference/api-cdn-2018-05-10-createrealtimelogdelivery).
 *
 * > **NOTE:** Available since v1.134.0.
 *
 * ## Import
 *
 * CDN Real Time Log Delivery can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cdn/realTimeLogDelivery:RealTimeLogDelivery example <domain>
 * ```
 */
export class RealTimeLogDelivery extends pulumi.CustomResource {
    /**
     * Get an existing RealTimeLogDelivery resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RealTimeLogDeliveryState, opts?: pulumi.CustomResourceOptions): RealTimeLogDelivery {
        return new RealTimeLogDelivery(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cdn/realTimeLogDelivery:RealTimeLogDelivery';

    /**
     * Returns true if the given object is an instance of RealTimeLogDelivery.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RealTimeLogDelivery {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RealTimeLogDelivery.__pulumiType;
    }

    /**
     * The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
     */
    public readonly logstore!: pulumi.Output<string>;
    /**
     * The name of the Log Service project that is used for real-time log delivery.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The region where the Log Service project is deployed.
     *
     * > **NOTE:** If your Project and Logstore services already exist, if you continue to create existing content, the created content will overwrite your existing indexes and custom reports. Please be careful to create your existing services to avoid affecting your online services after coverage.
     */
    public readonly slsRegion!: pulumi.Output<string>;
    /**
     * The status of the real-time log delivery feature. Valid Values: `online` and `offline`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a RealTimeLogDelivery resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RealTimeLogDeliveryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RealTimeLogDeliveryArgs | RealTimeLogDeliveryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RealTimeLogDeliveryState | undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["logstore"] = state ? state.logstore : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["slsRegion"] = state ? state.slsRegion : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as RealTimeLogDeliveryArgs | undefined;
            if ((!args || args.domain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domain'");
            }
            if ((!args || args.logstore === undefined) && !opts.urn) {
                throw new Error("Missing required property 'logstore'");
            }
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            if ((!args || args.slsRegion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'slsRegion'");
            }
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["logstore"] = args ? args.logstore : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["slsRegion"] = args ? args.slsRegion : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RealTimeLogDelivery.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RealTimeLogDelivery resources.
 */
export interface RealTimeLogDeliveryState {
    /**
     * The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).
     */
    domain?: pulumi.Input<string>;
    /**
     * The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
     */
    logstore?: pulumi.Input<string>;
    /**
     * The name of the Log Service project that is used for real-time log delivery.
     */
    project?: pulumi.Input<string>;
    /**
     * The region where the Log Service project is deployed.
     *
     * > **NOTE:** If your Project and Logstore services already exist, if you continue to create existing content, the created content will overwrite your existing indexes and custom reports. Please be careful to create your existing services to avoid affecting your online services after coverage.
     */
    slsRegion?: pulumi.Input<string>;
    /**
     * The status of the real-time log delivery feature. Valid Values: `online` and `offline`.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RealTimeLogDelivery resource.
 */
export interface RealTimeLogDeliveryArgs {
    /**
     * The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).
     */
    domain: pulumi.Input<string>;
    /**
     * The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
     */
    logstore: pulumi.Input<string>;
    /**
     * The name of the Log Service project that is used for real-time log delivery.
     */
    project: pulumi.Input<string>;
    /**
     * The region where the Log Service project is deployed.
     *
     * > **NOTE:** If your Project and Logstore services already exist, if you continue to create existing content, the created content will overwrite your existing indexes and custom reports. Please be careful to create your existing services to avoid affecting your online services after coverage.
     */
    slsRegion: pulumi.Input<string>;
}
