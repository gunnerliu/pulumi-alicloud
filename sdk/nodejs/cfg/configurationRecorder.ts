// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Alicloud Config Configuration Recorder resource. Cloud Config is a specialized service for evaluating resources. Cloud Config tracks configuration changes of your resources and evaluates configuration compliance. Cloud Config can help you evaluate numerous resources and maintain the continuous compliance of your cloud infrastructure.
 * For information about Alicloud Config Configuration Recorder and how to use it, see [What is Configuration Recorder.](https://www.alibabacloud.com/help/en/doc-detail/153156.html)
 *
 * > **NOTE:** Available in v1.99.0+.
 *
 * > **NOTE:** The Cloud Config region only support `cn-shanghai` and `ap-southeast-1`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.cfg.ConfigurationRecorder("example", {
 *     resourceTypes: [
 *         "ACS::ECS::Instance",
 *         "ACS::ECS::Disk",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Alicloud Config Configuration Recorder can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cfg/configurationRecorder:ConfigurationRecorder example 122378463********
 * ```
 */
export class ConfigurationRecorder extends pulumi.CustomResource {
    /**
     * Get an existing ConfigurationRecorder resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConfigurationRecorderState, opts?: pulumi.CustomResourceOptions): ConfigurationRecorder {
        return new ConfigurationRecorder(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cfg/configurationRecorder:ConfigurationRecorder';

    /**
     * Returns true if the given object is an instance of ConfigurationRecorder.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConfigurationRecorder {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConfigurationRecorder.__pulumiType;
    }

    public readonly enterpriseEdition!: pulumi.Output<boolean>;
    /**
     * Enterprise version configuration audit enabled status. Values: `REGISTRABLE`: Not enabled, `BUILDING`: Building and `REGISTERED`: Enabled.
     */
    public /*out*/ readonly organizationEnableStatus!: pulumi.Output<string>;
    /**
     * The ID of the Enterprise management account.
     */
    public /*out*/ readonly organizationMasterId!: pulumi.Output<number>;
    /**
     * A list of resource types to be monitored. [Resource types that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
     * * If you use an ordinary account, the `resourceTypes` supports the update operation after the process of creation is completed.
     * * If you use an enterprise account, the `resourceTypes` does not support updating.
     */
    public readonly resourceTypes!: pulumi.Output<string[]>;
    /**
     * Status of resource monitoring. Values: `REGISTRABLE`: Not registered, `BUILDING`: Under construction, `REGISTERED`: Registered and `REBUILDING`: Rebuilding.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a ConfigurationRecorder resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ConfigurationRecorderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConfigurationRecorderArgs | ConfigurationRecorderState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConfigurationRecorderState | undefined;
            inputs["enterpriseEdition"] = state ? state.enterpriseEdition : undefined;
            inputs["organizationEnableStatus"] = state ? state.organizationEnableStatus : undefined;
            inputs["organizationMasterId"] = state ? state.organizationMasterId : undefined;
            inputs["resourceTypes"] = state ? state.resourceTypes : undefined;
            inputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ConfigurationRecorderArgs | undefined;
            inputs["enterpriseEdition"] = args ? args.enterpriseEdition : undefined;
            inputs["resourceTypes"] = args ? args.resourceTypes : undefined;
            inputs["organizationEnableStatus"] = undefined /*out*/;
            inputs["organizationMasterId"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ConfigurationRecorder.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConfigurationRecorder resources.
 */
export interface ConfigurationRecorderState {
    enterpriseEdition?: pulumi.Input<boolean>;
    /**
     * Enterprise version configuration audit enabled status. Values: `REGISTRABLE`: Not enabled, `BUILDING`: Building and `REGISTERED`: Enabled.
     */
    organizationEnableStatus?: pulumi.Input<string>;
    /**
     * The ID of the Enterprise management account.
     */
    organizationMasterId?: pulumi.Input<number>;
    /**
     * A list of resource types to be monitored. [Resource types that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
     * * If you use an ordinary account, the `resourceTypes` supports the update operation after the process of creation is completed.
     * * If you use an enterprise account, the `resourceTypes` does not support updating.
     */
    resourceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Status of resource monitoring. Values: `REGISTRABLE`: Not registered, `BUILDING`: Under construction, `REGISTERED`: Registered and `REBUILDING`: Rebuilding.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ConfigurationRecorder resource.
 */
export interface ConfigurationRecorderArgs {
    enterpriseEdition?: pulumi.Input<boolean>;
    /**
     * A list of resource types to be monitored. [Resource types that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
     * * If you use an ordinary account, the `resourceTypes` supports the update operation after the process of creation is completed.
     * * If you use an enterprise account, the `resourceTypes` does not support updating.
     */
    resourceTypes?: pulumi.Input<pulumi.Input<string>[]>;
}
