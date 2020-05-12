// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an EDAS cluster resource.
 * 
 * > **NOTE:** Available in 1.82.0+
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * 
 * const default = new alicloud.edas.Cluster("default", {
 *     clusterName: var.cluster_name,
 *     clusterType: var.cluster_type,
 *     networkMode: var.network_mode,
 *     logicalRegionId: var.logical_region_id,
 *     vpcId: var.vpc_id,
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/edas_cluster.html.markdown.
 */
export class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterState, opts?: pulumi.CustomResourceOptions): Cluster {
        return new Cluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:edas/cluster:Cluster';

    /**
     * Returns true if the given object is an instance of Cluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cluster.__pulumiType;
    }

    /**
     * The name of the cluster that you want to create.
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * The type of the cluster that you want to create. Valid values only: 2: ECS cluster.
     */
    public readonly clusterType!: pulumi.Output<number>;
    /**
     * The ID of the namespace where you want to create the application. You can call the ListUserDefineRegion operation to query the namespace ID.
     */
    public readonly logicalRegionId!: pulumi.Output<string | undefined>;
    /**
     * The network type of the cluster that you want to create. Valid values: 1: classic network. 2: VPC.
     */
    public readonly networkMode!: pulumi.Output<number>;
    /**
     * The ID of the Virtual Private Cloud (VPC) for the cluster.
     */
    public readonly vpcId!: pulumi.Output<string | undefined>;

    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterArgs | ClusterState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ClusterState | undefined;
            inputs["clusterName"] = state ? state.clusterName : undefined;
            inputs["clusterType"] = state ? state.clusterType : undefined;
            inputs["logicalRegionId"] = state ? state.logicalRegionId : undefined;
            inputs["networkMode"] = state ? state.networkMode : undefined;
            inputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            if (!args || args.clusterName === undefined) {
                throw new Error("Missing required property 'clusterName'");
            }
            if (!args || args.clusterType === undefined) {
                throw new Error("Missing required property 'clusterType'");
            }
            if (!args || args.networkMode === undefined) {
                throw new Error("Missing required property 'networkMode'");
            }
            inputs["clusterName"] = args ? args.clusterName : undefined;
            inputs["clusterType"] = args ? args.clusterType : undefined;
            inputs["logicalRegionId"] = args ? args.logicalRegionId : undefined;
            inputs["networkMode"] = args ? args.networkMode : undefined;
            inputs["vpcId"] = args ? args.vpcId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Cluster.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    /**
     * The name of the cluster that you want to create.
     */
    readonly clusterName?: pulumi.Input<string>;
    /**
     * The type of the cluster that you want to create. Valid values only: 2: ECS cluster.
     */
    readonly clusterType?: pulumi.Input<number>;
    /**
     * The ID of the namespace where you want to create the application. You can call the ListUserDefineRegion operation to query the namespace ID.
     */
    readonly logicalRegionId?: pulumi.Input<string>;
    /**
     * The network type of the cluster that you want to create. Valid values: 1: classic network. 2: VPC.
     */
    readonly networkMode?: pulumi.Input<number>;
    /**
     * The ID of the Virtual Private Cloud (VPC) for the cluster.
     */
    readonly vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * The name of the cluster that you want to create.
     */
    readonly clusterName: pulumi.Input<string>;
    /**
     * The type of the cluster that you want to create. Valid values only: 2: ECS cluster.
     */
    readonly clusterType: pulumi.Input<number>;
    /**
     * The ID of the namespace where you want to create the application. You can call the ListUserDefineRegion operation to query the namespace ID.
     */
    readonly logicalRegionId?: pulumi.Input<string>;
    /**
     * The network type of the cluster that you want to create. Valid values: 1: classic network. 2: VPC.
     */
    readonly networkMode: pulumi.Input<number>;
    /**
     * The ID of the Virtual Private Cloud (VPC) for the cluster.
     */
    readonly vpcId?: pulumi.Input<string>;
}
