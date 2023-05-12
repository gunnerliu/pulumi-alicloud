// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource will help you configure auto scaling for the kubernetes cluster.
 *
 * > **NOTE:** Available in v1.127.0+.
 * **NOTE:** From version 1.164.0, support for specifying whether to allow the scale-in of nodes by parameter `scaleDownEnabled`.
 * **NOTE:** From version 1.164.0, support for selecting the policy for selecting which node pool to scale by parameter `expander`.
 *
 * ## Example Usage
 *
 * If you do not have an existing cluster, you need to create an ACK cluster through alicloud.cs.ManagedKubernetes first, and then configure automatic scaling.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.cs.AutoscalingConfig("default", {
 *     clusterId: alicloud_cs_managed_kubernetes["default"][0].id,
 *     coolDownDuration: "10m",
 *     unneededDuration: "10m",
 *     utilizationThreshold: "0.5",
 *     gpuUtilizationThreshold: "0.5",
 *     scanInterval: "30s",
 *     scaleDownEnabled: true,
 *     expander: "least-waste",
 * });
 * ```
 */
export class AutoscalingConfig extends pulumi.CustomResource {
    /**
     * Get an existing AutoscalingConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AutoscalingConfigState, opts?: pulumi.CustomResourceOptions): AutoscalingConfig {
        return new AutoscalingConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cs/autoscalingConfig:AutoscalingConfig';

    /**
     * Returns true if the given object is an instance of AutoscalingConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AutoscalingConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AutoscalingConfig.__pulumiType;
    }

    /**
     * The id of kubernetes cluster.
     */
    public readonly clusterId!: pulumi.Output<string | undefined>;
    /**
     * The cool down duration. Default is `10m`. If the delay (cooldown) value is set too long, there could be complaints that the Horizontal Pod Autoscaler is not responsive to workload changes. However, if the delay value is set too short, the scale of the replicas set may keep thrashing as usual.
     */
    public readonly coolDownDuration!: pulumi.Output<string | undefined>;
    /**
     * The policy for selecting which node pool to scale. Valid values: `least-waste`, `random`, `priority`. For more information on these policies, see [Configure auto scaling](https://www.alibabacloud.com/help/en/container-service-for-kubernetes/latest/auto-scaling-of-nodes#section-3bg-2ko-inl)
     */
    public readonly expander!: pulumi.Output<string | undefined>;
    /**
     * The scale-in threshold for GPU instance. Default is `0.5`.
     */
    public readonly gpuUtilizationThreshold!: pulumi.Output<string | undefined>;
    /**
     * Specify whether to allow the scale-in of nodes. Default is `true`.
     */
    public readonly scaleDownEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The interval at which the cluster is reevaluated for scaling. Default is `30s`.
     */
    public readonly scanInterval!: pulumi.Output<string | undefined>;
    /**
     * The unneeded duration. Default is `10m`.
     */
    public readonly unneededDuration!: pulumi.Output<string | undefined>;
    /**
     * The scale-in threshold. Default is `0.5`.
     */
    public readonly utilizationThreshold!: pulumi.Output<string | undefined>;

    /**
     * Create a AutoscalingConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AutoscalingConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AutoscalingConfigArgs | AutoscalingConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AutoscalingConfigState | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["coolDownDuration"] = state ? state.coolDownDuration : undefined;
            resourceInputs["expander"] = state ? state.expander : undefined;
            resourceInputs["gpuUtilizationThreshold"] = state ? state.gpuUtilizationThreshold : undefined;
            resourceInputs["scaleDownEnabled"] = state ? state.scaleDownEnabled : undefined;
            resourceInputs["scanInterval"] = state ? state.scanInterval : undefined;
            resourceInputs["unneededDuration"] = state ? state.unneededDuration : undefined;
            resourceInputs["utilizationThreshold"] = state ? state.utilizationThreshold : undefined;
        } else {
            const args = argsOrState as AutoscalingConfigArgs | undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["coolDownDuration"] = args ? args.coolDownDuration : undefined;
            resourceInputs["expander"] = args ? args.expander : undefined;
            resourceInputs["gpuUtilizationThreshold"] = args ? args.gpuUtilizationThreshold : undefined;
            resourceInputs["scaleDownEnabled"] = args ? args.scaleDownEnabled : undefined;
            resourceInputs["scanInterval"] = args ? args.scanInterval : undefined;
            resourceInputs["unneededDuration"] = args ? args.unneededDuration : undefined;
            resourceInputs["utilizationThreshold"] = args ? args.utilizationThreshold : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AutoscalingConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AutoscalingConfig resources.
 */
export interface AutoscalingConfigState {
    /**
     * The id of kubernetes cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The cool down duration. Default is `10m`. If the delay (cooldown) value is set too long, there could be complaints that the Horizontal Pod Autoscaler is not responsive to workload changes. However, if the delay value is set too short, the scale of the replicas set may keep thrashing as usual.
     */
    coolDownDuration?: pulumi.Input<string>;
    /**
     * The policy for selecting which node pool to scale. Valid values: `least-waste`, `random`, `priority`. For more information on these policies, see [Configure auto scaling](https://www.alibabacloud.com/help/en/container-service-for-kubernetes/latest/auto-scaling-of-nodes#section-3bg-2ko-inl)
     */
    expander?: pulumi.Input<string>;
    /**
     * The scale-in threshold for GPU instance. Default is `0.5`.
     */
    gpuUtilizationThreshold?: pulumi.Input<string>;
    /**
     * Specify whether to allow the scale-in of nodes. Default is `true`.
     */
    scaleDownEnabled?: pulumi.Input<boolean>;
    /**
     * The interval at which the cluster is reevaluated for scaling. Default is `30s`.
     */
    scanInterval?: pulumi.Input<string>;
    /**
     * The unneeded duration. Default is `10m`.
     */
    unneededDuration?: pulumi.Input<string>;
    /**
     * The scale-in threshold. Default is `0.5`.
     */
    utilizationThreshold?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AutoscalingConfig resource.
 */
export interface AutoscalingConfigArgs {
    /**
     * The id of kubernetes cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The cool down duration. Default is `10m`. If the delay (cooldown) value is set too long, there could be complaints that the Horizontal Pod Autoscaler is not responsive to workload changes. However, if the delay value is set too short, the scale of the replicas set may keep thrashing as usual.
     */
    coolDownDuration?: pulumi.Input<string>;
    /**
     * The policy for selecting which node pool to scale. Valid values: `least-waste`, `random`, `priority`. For more information on these policies, see [Configure auto scaling](https://www.alibabacloud.com/help/en/container-service-for-kubernetes/latest/auto-scaling-of-nodes#section-3bg-2ko-inl)
     */
    expander?: pulumi.Input<string>;
    /**
     * The scale-in threshold for GPU instance. Default is `0.5`.
     */
    gpuUtilizationThreshold?: pulumi.Input<string>;
    /**
     * Specify whether to allow the scale-in of nodes. Default is `true`.
     */
    scaleDownEnabled?: pulumi.Input<boolean>;
    /**
     * The interval at which the cluster is reevaluated for scaling. Default is `30s`.
     */
    scanInterval?: pulumi.Input<string>;
    /**
     * The unneeded duration. Default is `10m`.
     */
    unneededDuration?: pulumi.Input<string>;
    /**
     * The scale-in threshold. Default is `0.5`.
     */
    utilizationThreshold?: pulumi.Input<string>;
}
