// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Api Gateway Plugin resource.
 *
 * For information about Api Gateway Plugin and how to use it, see [What is Plugin](https://www.alibabacloud.com/help/en/api-gateway/developer-reference/api-cloudapi-2016-07-14-createplugin).
 *
 * > **NOTE:** Available since v1.187.0.
 *
 * ## Import
 *
 * Api Gateway Plugin can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:apigateway/plugin:Plugin example <id>
 * ```
 */
export class Plugin extends pulumi.CustomResource {
    /**
     * Get an existing Plugin resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PluginState, opts?: pulumi.CustomResourceOptions): Plugin {
        return new Plugin(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:apigateway/plugin:Plugin';

    /**
     * Returns true if the given object is an instance of Plugin.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Plugin {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Plugin.__pulumiType;
    }

    /**
     * The description of the plug-in, which cannot exceed 200 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
     */
    public readonly pluginData!: pulumi.Output<string>;
    /**
     * The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
     */
    public readonly pluginName!: pulumi.Output<string>;
    /**
     * The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
     * - ipControl: indicates IP address-based access control.
     * - trafficControl: indicates throttling.
     * - backendSignature: indicates backend signature.
     * - jwtAuth: indicates JWT (OpenId Connect).
     * - cors: indicates cross-origin resource access (CORS).
     * - caching: indicates caching.
     */
    public readonly pluginType!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;

    /**
     * Create a Plugin resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PluginArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PluginArgs | PluginState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PluginState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["pluginData"] = state ? state.pluginData : undefined;
            resourceInputs["pluginName"] = state ? state.pluginName : undefined;
            resourceInputs["pluginType"] = state ? state.pluginType : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as PluginArgs | undefined;
            if ((!args || args.pluginData === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pluginData'");
            }
            if ((!args || args.pluginName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pluginName'");
            }
            if ((!args || args.pluginType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pluginType'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["pluginData"] = args ? args.pluginData : undefined;
            resourceInputs["pluginName"] = args ? args.pluginName : undefined;
            resourceInputs["pluginType"] = args ? args.pluginType : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Plugin.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Plugin resources.
 */
export interface PluginState {
    /**
     * The description of the plug-in, which cannot exceed 200 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
     */
    pluginData?: pulumi.Input<string>;
    /**
     * The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
     */
    pluginName?: pulumi.Input<string>;
    /**
     * The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
     * - ipControl: indicates IP address-based access control.
     * - trafficControl: indicates throttling.
     * - backendSignature: indicates backend signature.
     * - jwtAuth: indicates JWT (OpenId Connect).
     * - cors: indicates cross-origin resource access (CORS).
     * - caching: indicates caching.
     */
    pluginType?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}

/**
 * The set of arguments for constructing a Plugin resource.
 */
export interface PluginArgs {
    /**
     * The description of the plug-in, which cannot exceed 200 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
     */
    pluginData: pulumi.Input<string>;
    /**
     * The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
     */
    pluginName: pulumi.Input<string>;
    /**
     * The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
     * - ipControl: indicates IP address-based access control.
     * - trafficControl: indicates throttling.
     * - backendSignature: indicates backend signature.
     * - jwtAuth: indicates JWT (OpenId Connect).
     * - cors: indicates cross-origin resource access (CORS).
     * - caching: indicates caching.
     */
    pluginType: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
