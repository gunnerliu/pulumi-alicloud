// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ECS Dedicated Host Cluster resource.
 *
 * For information about ECS Dedicated Host Cluster and how to use it, see [What is Dedicated Host Cluster](https://www.alibabacloud.com/help/en/doc-detail/184667.html).
 *
 * > **NOTE:** Available in v1.146.0+.
 *
 * ## Import
 *
 * ECS Dedicated Host Cluster can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ecs/ecsDedicatedHostCluster:EcsDedicatedHostCluster example <id>
 * ```
 */
export class EcsDedicatedHostCluster extends pulumi.CustomResource {
    /**
     * Get an existing EcsDedicatedHostCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EcsDedicatedHostClusterState, opts?: pulumi.CustomResourceOptions): EcsDedicatedHostCluster {
        return new EcsDedicatedHostCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/ecsDedicatedHostCluster:EcsDedicatedHostCluster';

    /**
     * Returns true if the given object is an instance of EcsDedicatedHostCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EcsDedicatedHostCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EcsDedicatedHostCluster.__pulumiType;
    }

    /**
     * The name of the dedicated host cluster. The name must be `2` to `128` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It cannot contain `http://` or `https://`.
     */
    public readonly dedicatedHostClusterName!: pulumi.Output<string | undefined>;
    /**
     * The description of the dedicated host cluster. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The dry run.
     */
    public readonly dryRun!: pulumi.Output<boolean | undefined>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The ID of the zone in which to create the dedicated host cluster.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a EcsDedicatedHostCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EcsDedicatedHostClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EcsDedicatedHostClusterArgs | EcsDedicatedHostClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EcsDedicatedHostClusterState | undefined;
            resourceInputs["dedicatedHostClusterName"] = state ? state.dedicatedHostClusterName : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["dryRun"] = state ? state.dryRun : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as EcsDedicatedHostClusterArgs | undefined;
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["dedicatedHostClusterName"] = args ? args.dedicatedHostClusterName : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["dryRun"] = args ? args.dryRun : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EcsDedicatedHostCluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EcsDedicatedHostCluster resources.
 */
export interface EcsDedicatedHostClusterState {
    /**
     * The name of the dedicated host cluster. The name must be `2` to `128` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It cannot contain `http://` or `https://`.
     */
    dedicatedHostClusterName?: pulumi.Input<string>;
    /**
     * The description of the dedicated host cluster. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
     */
    description?: pulumi.Input<string>;
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The ID of the zone in which to create the dedicated host cluster.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EcsDedicatedHostCluster resource.
 */
export interface EcsDedicatedHostClusterArgs {
    /**
     * The name of the dedicated host cluster. The name must be `2` to `128` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It cannot contain `http://` or `https://`.
     */
    dedicatedHostClusterName?: pulumi.Input<string>;
    /**
     * The description of the dedicated host cluster. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
     */
    description?: pulumi.Input<string>;
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The ID of the zone in which to create the dedicated host cluster.
     */
    zoneId: pulumi.Input<string>;
}
