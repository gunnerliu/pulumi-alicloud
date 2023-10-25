// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a DNS Monitor Config resource.
 *
 * For information about DNS Monitor Config and how to use it, see [What is Monitor Config](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).
 *
 * > **NOTE:** Available since v1.153.0.
 *
 * ## Import
 *
 * DNS Monitor Config can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:dns/monitorConfig:MonitorConfig example <id>
 * ```
 */
export class MonitorConfig extends pulumi.CustomResource {
    /**
     * Get an existing MonitorConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MonitorConfigState, opts?: pulumi.CustomResourceOptions): MonitorConfig {
        return new MonitorConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:dns/monitorConfig:MonitorConfig';

    /**
     * Returns true if the given object is an instance of MonitorConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MonitorConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MonitorConfig.__pulumiType;
    }

    /**
     * The ID of the address pool.
     */
    public readonly addrPoolId!: pulumi.Output<string>;
    /**
     * The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
     */
    public readonly evaluationCount!: pulumi.Output<number>;
    /**
     * The health check interval. Unit: seconds. Valid values: `60`.
     */
    public readonly interval!: pulumi.Output<number>;
    /**
     * The Monitoring node. See `ispCityNode` below for details.
     */
    public readonly ispCityNodes!: pulumi.Output<outputs.dns.MonitorConfigIspCityNode[]>;
    /**
     * The lang.
     */
    public readonly lang!: pulumi.Output<string | undefined>;
    /**
     * The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).
     */
    public readonly monitorExtendInfo!: pulumi.Output<string>;
    /**
     * The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
     */
    public readonly protocolType!: pulumi.Output<string>;
    /**
     * The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
     */
    public readonly timeout!: pulumi.Output<number>;

    /**
     * Create a MonitorConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MonitorConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MonitorConfigArgs | MonitorConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MonitorConfigState | undefined;
            resourceInputs["addrPoolId"] = state ? state.addrPoolId : undefined;
            resourceInputs["evaluationCount"] = state ? state.evaluationCount : undefined;
            resourceInputs["interval"] = state ? state.interval : undefined;
            resourceInputs["ispCityNodes"] = state ? state.ispCityNodes : undefined;
            resourceInputs["lang"] = state ? state.lang : undefined;
            resourceInputs["monitorExtendInfo"] = state ? state.monitorExtendInfo : undefined;
            resourceInputs["protocolType"] = state ? state.protocolType : undefined;
            resourceInputs["timeout"] = state ? state.timeout : undefined;
        } else {
            const args = argsOrState as MonitorConfigArgs | undefined;
            if ((!args || args.addrPoolId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'addrPoolId'");
            }
            if ((!args || args.evaluationCount === undefined) && !opts.urn) {
                throw new Error("Missing required property 'evaluationCount'");
            }
            if ((!args || args.interval === undefined) && !opts.urn) {
                throw new Error("Missing required property 'interval'");
            }
            if ((!args || args.ispCityNodes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ispCityNodes'");
            }
            if ((!args || args.monitorExtendInfo === undefined) && !opts.urn) {
                throw new Error("Missing required property 'monitorExtendInfo'");
            }
            if ((!args || args.protocolType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'protocolType'");
            }
            if ((!args || args.timeout === undefined) && !opts.urn) {
                throw new Error("Missing required property 'timeout'");
            }
            resourceInputs["addrPoolId"] = args ? args.addrPoolId : undefined;
            resourceInputs["evaluationCount"] = args ? args.evaluationCount : undefined;
            resourceInputs["interval"] = args ? args.interval : undefined;
            resourceInputs["ispCityNodes"] = args ? args.ispCityNodes : undefined;
            resourceInputs["lang"] = args ? args.lang : undefined;
            resourceInputs["monitorExtendInfo"] = args ? args.monitorExtendInfo : undefined;
            resourceInputs["protocolType"] = args ? args.protocolType : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MonitorConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MonitorConfig resources.
 */
export interface MonitorConfigState {
    /**
     * The ID of the address pool.
     */
    addrPoolId?: pulumi.Input<string>;
    /**
     * The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
     */
    evaluationCount?: pulumi.Input<number>;
    /**
     * The health check interval. Unit: seconds. Valid values: `60`.
     */
    interval?: pulumi.Input<number>;
    /**
     * The Monitoring node. See `ispCityNode` below for details.
     */
    ispCityNodes?: pulumi.Input<pulumi.Input<inputs.dns.MonitorConfigIspCityNode>[]>;
    /**
     * The lang.
     */
    lang?: pulumi.Input<string>;
    /**
     * The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).
     */
    monitorExtendInfo?: pulumi.Input<string>;
    /**
     * The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
     */
    protocolType?: pulumi.Input<string>;
    /**
     * The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
     */
    timeout?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a MonitorConfig resource.
 */
export interface MonitorConfigArgs {
    /**
     * The ID of the address pool.
     */
    addrPoolId: pulumi.Input<string>;
    /**
     * The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
     */
    evaluationCount: pulumi.Input<number>;
    /**
     * The health check interval. Unit: seconds. Valid values: `60`.
     */
    interval: pulumi.Input<number>;
    /**
     * The Monitoring node. See `ispCityNode` below for details.
     */
    ispCityNodes: pulumi.Input<pulumi.Input<inputs.dns.MonitorConfigIspCityNode>[]>;
    /**
     * The lang.
     */
    lang?: pulumi.Input<string>;
    /**
     * The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).
     */
    monitorExtendInfo: pulumi.Input<string>;
    /**
     * The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
     */
    protocolType: pulumi.Input<string>;
    /**
     * The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
     */
    timeout: pulumi.Input<number>;
}
