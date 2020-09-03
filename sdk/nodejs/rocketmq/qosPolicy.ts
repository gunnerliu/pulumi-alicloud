// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Sag qos policy resource.
 * You need to create a QoS policy to set priorities, rate limits, and quintuple rules for different messages.
 *
 * For information about Sag Qos Policy and how to use it, see [What is Qos Policy](https://www.alibabacloud.com/help/doc-detail/140065.htm).
 *
 * > **NOTE:** Available in 1.60.0+
 *
 * > **NOTE:** Only the following regions support. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-2`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultQos = new alicloud.rocketmq.Qos("defaultQos", {});
 * const defaultQosPolicy = new alicloud.rocketmq.QosPolicy("defaultQosPolicy", {
 *     qosId: defaultQos.id,
 *     description: "tf-testSagQosPolicyDescription",
 *     priority: "1",
 *     ipProtocol: "ALL",
 *     sourceCidr: "192.168.0.0/24",
 *     sourcePortRange: "-1/-1",
 *     destCidr: "10.10.0.0/24",
 *     destPortRange: "-1/-1",
 *     startTime: "2019-10-25T16:41:33+0800",
 *     endTime: "2019-10-26T16:41:33+0800",
 * });
 * ```
 */
export class QosPolicy extends pulumi.CustomResource {
    /**
     * Get an existing QosPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: QosPolicyState, opts?: pulumi.CustomResourceOptions): QosPolicy {
        return new QosPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:rocketmq/qosPolicy:QosPolicy';

    /**
     * Returns true if the given object is an instance of QosPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is QosPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === QosPolicy.__pulumiType;
    }

    /**
     * The description of the QoS policy.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The destination CIDR block.
     */
    public readonly destCidr!: pulumi.Output<string>;
    /**
     * The destination port range.
     */
    public readonly destPortRange!: pulumi.Output<string>;
    /**
     * The expiration time of the quintuple rule.
     */
    public readonly endTime!: pulumi.Output<string | undefined>;
    /**
     * The transport layer protocol.
     */
    public readonly ipProtocol!: pulumi.Output<string>;
    /**
     * The name of the QoS policy.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The priority of the quintuple rule. A smaller value indicates a higher priority. If the priorities of two quintuple rules are the same, the rule created earlier is applied first.Value range: 1 to 7.
     */
    public readonly priority!: pulumi.Output<number>;
    /**
     * The instance ID of the QoS policy to which the quintuple rule is created.
     */
    public readonly qosId!: pulumi.Output<string>;
    /**
     * The source CIDR block.
     */
    public readonly sourceCidr!: pulumi.Output<string>;
    /**
     * The source port range of the transport layer.
     */
    public readonly sourcePortRange!: pulumi.Output<string>;
    /**
     * The time when the quintuple rule takes effect.
     */
    public readonly startTime!: pulumi.Output<string | undefined>;

    /**
     * Create a QosPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: QosPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: QosPolicyArgs | QosPolicyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as QosPolicyState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["destCidr"] = state ? state.destCidr : undefined;
            inputs["destPortRange"] = state ? state.destPortRange : undefined;
            inputs["endTime"] = state ? state.endTime : undefined;
            inputs["ipProtocol"] = state ? state.ipProtocol : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["priority"] = state ? state.priority : undefined;
            inputs["qosId"] = state ? state.qosId : undefined;
            inputs["sourceCidr"] = state ? state.sourceCidr : undefined;
            inputs["sourcePortRange"] = state ? state.sourcePortRange : undefined;
            inputs["startTime"] = state ? state.startTime : undefined;
        } else {
            const args = argsOrState as QosPolicyArgs | undefined;
            if (!args || args.destCidr === undefined) {
                throw new Error("Missing required property 'destCidr'");
            }
            if (!args || args.destPortRange === undefined) {
                throw new Error("Missing required property 'destPortRange'");
            }
            if (!args || args.ipProtocol === undefined) {
                throw new Error("Missing required property 'ipProtocol'");
            }
            if (!args || args.priority === undefined) {
                throw new Error("Missing required property 'priority'");
            }
            if (!args || args.qosId === undefined) {
                throw new Error("Missing required property 'qosId'");
            }
            if (!args || args.sourceCidr === undefined) {
                throw new Error("Missing required property 'sourceCidr'");
            }
            if (!args || args.sourcePortRange === undefined) {
                throw new Error("Missing required property 'sourcePortRange'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["destCidr"] = args ? args.destCidr : undefined;
            inputs["destPortRange"] = args ? args.destPortRange : undefined;
            inputs["endTime"] = args ? args.endTime : undefined;
            inputs["ipProtocol"] = args ? args.ipProtocol : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["priority"] = args ? args.priority : undefined;
            inputs["qosId"] = args ? args.qosId : undefined;
            inputs["sourceCidr"] = args ? args.sourceCidr : undefined;
            inputs["sourcePortRange"] = args ? args.sourcePortRange : undefined;
            inputs["startTime"] = args ? args.startTime : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(QosPolicy.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering QosPolicy resources.
 */
export interface QosPolicyState {
    /**
     * The description of the QoS policy.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The destination CIDR block.
     */
    readonly destCidr?: pulumi.Input<string>;
    /**
     * The destination port range.
     */
    readonly destPortRange?: pulumi.Input<string>;
    /**
     * The expiration time of the quintuple rule.
     */
    readonly endTime?: pulumi.Input<string>;
    /**
     * The transport layer protocol.
     */
    readonly ipProtocol?: pulumi.Input<string>;
    /**
     * The name of the QoS policy.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The priority of the quintuple rule. A smaller value indicates a higher priority. If the priorities of two quintuple rules are the same, the rule created earlier is applied first.Value range: 1 to 7.
     */
    readonly priority?: pulumi.Input<number>;
    /**
     * The instance ID of the QoS policy to which the quintuple rule is created.
     */
    readonly qosId?: pulumi.Input<string>;
    /**
     * The source CIDR block.
     */
    readonly sourceCidr?: pulumi.Input<string>;
    /**
     * The source port range of the transport layer.
     */
    readonly sourcePortRange?: pulumi.Input<string>;
    /**
     * The time when the quintuple rule takes effect.
     */
    readonly startTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a QosPolicy resource.
 */
export interface QosPolicyArgs {
    /**
     * The description of the QoS policy.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The destination CIDR block.
     */
    readonly destCidr: pulumi.Input<string>;
    /**
     * The destination port range.
     */
    readonly destPortRange: pulumi.Input<string>;
    /**
     * The expiration time of the quintuple rule.
     */
    readonly endTime?: pulumi.Input<string>;
    /**
     * The transport layer protocol.
     */
    readonly ipProtocol: pulumi.Input<string>;
    /**
     * The name of the QoS policy.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The priority of the quintuple rule. A smaller value indicates a higher priority. If the priorities of two quintuple rules are the same, the rule created earlier is applied first.Value range: 1 to 7.
     */
    readonly priority: pulumi.Input<number>;
    /**
     * The instance ID of the QoS policy to which the quintuple rule is created.
     */
    readonly qosId: pulumi.Input<string>;
    /**
     * The source CIDR block.
     */
    readonly sourceCidr: pulumi.Input<string>;
    /**
     * The source port range of the transport layer.
     */
    readonly sourcePortRange: pulumi.Input<string>;
    /**
     * The time when the quintuple rule takes effect.
     */
    readonly startTime?: pulumi.Input<string>;
}
