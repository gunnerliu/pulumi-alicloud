// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Serverless App Engine (SAE) Config Map resource.
 *
 * For information about Serverless App Engine (SAE) Config Map and how to use it, see [What is Config Map](https://www.alibabacloud.com/help/en/sae/latest/create-configmap).
 *
 * > **NOTE:** Available since v1.130.0.
 *
 * ## Import
 *
 * Serverless App Engine (SAE) Config Map can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:sae/configMap:ConfigMap example <id>
 * ```
 */
export class ConfigMap extends pulumi.CustomResource {
    /**
     * Get an existing ConfigMap resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConfigMapState, opts?: pulumi.CustomResourceOptions): ConfigMap {
        return new ConfigMap(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:sae/configMap:ConfigMap';

    /**
     * Returns true if the given object is an instance of ConfigMap.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConfigMap {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConfigMap.__pulumiType;
    }

    /**
     * ConfigMap instance data.
     */
    public readonly data!: pulumi.Output<string>;
    /**
     * The Description of ConfigMap.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * ConfigMap instance name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The NamespaceId of ConfigMap.It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`
     */
    public readonly namespaceId!: pulumi.Output<string>;

    /**
     * Create a ConfigMap resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConfigMapArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConfigMapArgs | ConfigMapState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConfigMapState | undefined;
            resourceInputs["data"] = state ? state.data : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namespaceId"] = state ? state.namespaceId : undefined;
        } else {
            const args = argsOrState as ConfigMapArgs | undefined;
            if ((!args || args.data === undefined) && !opts.urn) {
                throw new Error("Missing required property 'data'");
            }
            if ((!args || args.namespaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'namespaceId'");
            }
            resourceInputs["data"] = args ? args.data : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namespaceId"] = args ? args.namespaceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ConfigMap.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConfigMap resources.
 */
export interface ConfigMapState {
    /**
     * ConfigMap instance data.
     */
    data?: pulumi.Input<string>;
    /**
     * The Description of ConfigMap.
     */
    description?: pulumi.Input<string>;
    /**
     * ConfigMap instance name.
     */
    name?: pulumi.Input<string>;
    /**
     * The NamespaceId of ConfigMap.It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`
     */
    namespaceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ConfigMap resource.
 */
export interface ConfigMapArgs {
    /**
     * ConfigMap instance data.
     */
    data: pulumi.Input<string>;
    /**
     * The Description of ConfigMap.
     */
    description?: pulumi.Input<string>;
    /**
     * ConfigMap instance name.
     */
    name?: pulumi.Input<string>;
    /**
     * The NamespaceId of ConfigMap.It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`
     */
    namespaceId: pulumi.Input<string>;
}
