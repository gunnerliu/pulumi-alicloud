// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an ALIKAFKA consumer group resource.
 *
 * > **NOTE:** Available in 1.56.0+
 *
 * > **NOTE:**  Only the following regions support create alikafka consumer group.
 * [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`cn-chengdu`,`cn-heyuan`,`ap-southeast-1`,`ap-southeast-3`,`ap-southeast-5`,`ap-south-1`,`ap-northeast-1`,`eu-central-1`,`eu-west-1`,`us-west-1`,`us-east-1`]
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
 * const consumerId = config.get("consumerId") || "CID-alikafkaGroupDatasourceName";
 * const defaultZones = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {cidrBlock: "172.16.0.0/12"});
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: defaultZones.then(defaultZones => defaultZones.zones?[0]?.id),
 * });
 * const defaultInstance = new alicloud.alikafka.Instance("defaultInstance", {
 *     topicQuota: "50",
 *     diskType: "1",
 *     diskSize: "500",
 *     deployType: "5",
 *     ioMax: "20",
 *     vswitchId: defaultSwitch.id,
 * });
 * const defaultConsumerGroup = new alicloud.alikafka.ConsumerGroup("defaultConsumerGroup", {
 *     consumerId: consumerId,
 *     instanceId: defaultInstance.id,
 * });
 * ```
 *
 * ## Import
 *
 * ALIKAFKA GROUP can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:alikafka/consumerGroup:ConsumerGroup group alikafka_post-cn-123455abc:consumerId
 * ```
 */
export class ConsumerGroup extends pulumi.CustomResource {
    /**
     * Get an existing ConsumerGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConsumerGroupState, opts?: pulumi.CustomResourceOptions): ConsumerGroup {
        return new ConsumerGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:alikafka/consumerGroup:ConsumerGroup';

    /**
     * Returns true if the given object is an instance of ConsumerGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConsumerGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConsumerGroup.__pulumiType;
    }

    /**
     * ID of the consumer group. The length cannot exceed 64 characters.
     */
    public readonly consumerId!: pulumi.Output<string>;
    /**
     * ID of the ALIKAFKA Instance that owns the groups.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;

    /**
     * Create a ConsumerGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConsumerGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConsumerGroupArgs | ConsumerGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConsumerGroupState | undefined;
            resourceInputs["consumerId"] = state ? state.consumerId : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as ConsumerGroupArgs | undefined;
            if ((!args || args.consumerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'consumerId'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            resourceInputs["consumerId"] = args ? args.consumerId : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ConsumerGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConsumerGroup resources.
 */
export interface ConsumerGroupState {
    /**
     * ID of the consumer group. The length cannot exceed 64 characters.
     */
    consumerId?: pulumi.Input<string>;
    /**
     * ID of the ALIKAFKA Instance that owns the groups.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}

/**
 * The set of arguments for constructing a ConsumerGroup resource.
 */
export interface ConsumerGroupArgs {
    /**
     * ID of the consumer group. The length cannot exceed 64 characters.
     */
    consumerId: pulumi.Input<string>;
    /**
     * ID of the ALIKAFKA Instance that owns the groups.
     */
    instanceId: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
