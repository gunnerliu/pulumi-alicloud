// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Microservice Engine (MSE) Engine Namespace resource.
 *
 * For information about Microservice Engine (MSE) Engine Namespace and how to use it, see [What is Engine Namespace](https://www.alibabacloud.com/help/zh/microservices-engine/latest/api-doc-mse-2019-05-31-api-doc-createenginenamespace).
 *
 * > **NOTE:** Available in v1.166.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultNetworks = alicloud.vpc.getNetworks({
 *     nameRegex: "default-NODELETING",
 * });
 * const defaultSwitches = defaultNetworks.then(defaultNetworks => alicloud.vpc.getSwitches({
 *     vpcId: defaultNetworks.ids?.[0],
 * }));
 * const defaultCluster = new alicloud.mse.Cluster("defaultCluster", {
 *     clusterSpecification: "MSE_SC_1_2_200_c",
 *     clusterType: "Nacos-Ans",
 *     clusterVersion: "NACOS_ANS_1_2_1",
 *     instanceCount: 1,
 *     netType: "privatenet",
 *     vswitchId: defaultSwitches.then(defaultSwitches => defaultSwitches.ids?.[0]),
 *     pubNetworkFlow: "1",
 *     aclEntryLists: ["127.0.0.1/32"],
 *     clusterAliasName: "example_value",
 * });
 * const example = new alicloud.mse.EngineNamespace("example", {
 *     clusterId: defaultCluster.clusterId,
 *     namespaceShowName: "example_value",
 *     namespaceId: "example_value",
 * });
 * ```
 *
 * ## Import
 *
 * Microservice Engine (MSE) Engine Namespace can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:mse/engineNamespace:EngineNamespace example <cluster_id>:<namespace_id>
 * ```
 */
export class EngineNamespace extends pulumi.CustomResource {
    /**
     * Get an existing EngineNamespace resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EngineNamespaceState, opts?: pulumi.CustomResourceOptions): EngineNamespace {
        return new EngineNamespace(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:mse/engineNamespace:EngineNamespace';

    /**
     * Returns true if the given object is an instance of EngineNamespace.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EngineNamespace {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EngineNamespace.__pulumiType;
    }

    /**
     * The language type of the returned information. Valid values: `zh`, `en`.
     */
    public readonly acceptLanguage!: pulumi.Output<string | undefined>;
    /**
     * The id of the cluster.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The id of Namespace.
     */
    public readonly namespaceId!: pulumi.Output<string>;
    /**
     * The name of the Engine Namespace.
     */
    public readonly namespaceShowName!: pulumi.Output<string>;

    /**
     * Create a EngineNamespace resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EngineNamespaceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EngineNamespaceArgs | EngineNamespaceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EngineNamespaceState | undefined;
            resourceInputs["acceptLanguage"] = state ? state.acceptLanguage : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["namespaceId"] = state ? state.namespaceId : undefined;
            resourceInputs["namespaceShowName"] = state ? state.namespaceShowName : undefined;
        } else {
            const args = argsOrState as EngineNamespaceArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.namespaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'namespaceId'");
            }
            if ((!args || args.namespaceShowName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'namespaceShowName'");
            }
            resourceInputs["acceptLanguage"] = args ? args.acceptLanguage : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["namespaceId"] = args ? args.namespaceId : undefined;
            resourceInputs["namespaceShowName"] = args ? args.namespaceShowName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EngineNamespace.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EngineNamespace resources.
 */
export interface EngineNamespaceState {
    /**
     * The language type of the returned information. Valid values: `zh`, `en`.
     */
    acceptLanguage?: pulumi.Input<string>;
    /**
     * The id of the cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The id of Namespace.
     */
    namespaceId?: pulumi.Input<string>;
    /**
     * The name of the Engine Namespace.
     */
    namespaceShowName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EngineNamespace resource.
 */
export interface EngineNamespaceArgs {
    /**
     * The language type of the returned information. Valid values: `zh`, `en`.
     */
    acceptLanguage?: pulumi.Input<string>;
    /**
     * The id of the cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * The id of Namespace.
     */
    namespaceId: pulumi.Input<string>;
    /**
     * The name of the Engine Namespace.
     */
    namespaceShowName: pulumi.Input<string>;
}
