// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a RabbitMQ (AMQP) Binding resource to bind tha exchange with another exchange or queue.
 *
 * > **NOTE:** Available in v1.135.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const exampleVirtualHost = new alicloud.amqp.VirtualHost("exampleVirtualHost", {
 *     instanceId: "amqp-abc12345",
 *     virtualHostName: "my-VirtualHost",
 * });
 * const exampleExchange = new alicloud.amqp.Exchange("exampleExchange", {
 *     autoDeleteState: false,
 *     exchangeName: "my-Exchange",
 *     exchangeType: "HEADERS",
 *     instanceId: exampleVirtualHost.instanceId,
 *     internal: false,
 *     virtualHostName: exampleVirtualHost.virtualHostName,
 * });
 * const exampleQueue = new alicloud.amqp.Queue("exampleQueue", {
 *     instanceId: exampleVirtualHost.instanceId,
 *     queueName: "my-Queue",
 *     virtualHostName: exampleVirtualHost.virtualHostName,
 * });
 * const exampleBinding = new alicloud.amqp.Binding("exampleBinding", {
 *     argument: "x-match:all",
 *     bindingKey: exampleQueue.queueName,
 *     bindingType: "QUEUE",
 *     destinationName: "binding-queue",
 *     instanceId: exampleExchange.instanceId,
 *     sourceExchange: exampleExchange.exchangeName,
 *     virtualHostName: exampleExchange.virtualHostName,
 * });
 * ```
 *
 * ## Import
 *
 * RabbitMQ (AMQP) Binding can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:amqp/binding:Binding example <instance_id>:<virtual_host_name>:<source_exchange>:<destination_name>
 * ```
 */
export class Binding extends pulumi.CustomResource {
    /**
     * Get an existing Binding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BindingState, opts?: pulumi.CustomResourceOptions): Binding {
        return new Binding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:amqp/binding:Binding';

    /**
     * Returns true if the given object is an instance of Binding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Binding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Binding.__pulumiType;
    }

    /**
     * X-match Attributes. Valid Values: 
     * * "x-match:all": Default Value, All the Message Header of Key-Value Pairs Stored in the Must Match.
     * * "x-match:any": at Least One Pair of the Message Header of Key-Value Pairs Stored in the Must Match.
     */
    public readonly argument!: pulumi.Output<string>;
    /**
     * The Binding Key.
     * * For a non-topic source exchange: The binding key can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
     * The binding key must be 1 to 255 characters in length.
     * * For a topic source exchange: The binding key can contain letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
     * If the binding key contains a number sign (#), the binding key must start with a number sign (#) followed by a period (.) or end with a number sign (#) that follows a period (.).
     * The binding key must be 1 to 255 characters in length.
     */
    public readonly bindingKey!: pulumi.Output<string>;
    /**
     * The Target Binding Types. Valid values: `EXCHANGE`, `QUEUE`.
     */
    public readonly bindingType!: pulumi.Output<string>;
    /**
     * The Target Queue Or Exchange of the Name.
     */
    public readonly destinationName!: pulumi.Output<string>;
    /**
     * Instance Id.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The Source Exchange Name.
     */
    public readonly sourceExchange!: pulumi.Output<string>;
    /**
     * Virtualhost Name.
     */
    public readonly virtualHostName!: pulumi.Output<string>;

    /**
     * Create a Binding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BindingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BindingArgs | BindingState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BindingState | undefined;
            inputs["argument"] = state ? state.argument : undefined;
            inputs["bindingKey"] = state ? state.bindingKey : undefined;
            inputs["bindingType"] = state ? state.bindingType : undefined;
            inputs["destinationName"] = state ? state.destinationName : undefined;
            inputs["instanceId"] = state ? state.instanceId : undefined;
            inputs["sourceExchange"] = state ? state.sourceExchange : undefined;
            inputs["virtualHostName"] = state ? state.virtualHostName : undefined;
        } else {
            const args = argsOrState as BindingArgs | undefined;
            if ((!args || args.bindingKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bindingKey'");
            }
            if ((!args || args.bindingType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bindingType'");
            }
            if ((!args || args.destinationName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinationName'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.sourceExchange === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceExchange'");
            }
            if ((!args || args.virtualHostName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'virtualHostName'");
            }
            inputs["argument"] = args ? args.argument : undefined;
            inputs["bindingKey"] = args ? args.bindingKey : undefined;
            inputs["bindingType"] = args ? args.bindingType : undefined;
            inputs["destinationName"] = args ? args.destinationName : undefined;
            inputs["instanceId"] = args ? args.instanceId : undefined;
            inputs["sourceExchange"] = args ? args.sourceExchange : undefined;
            inputs["virtualHostName"] = args ? args.virtualHostName : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Binding.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Binding resources.
 */
export interface BindingState {
    /**
     * X-match Attributes. Valid Values: 
     * * "x-match:all": Default Value, All the Message Header of Key-Value Pairs Stored in the Must Match.
     * * "x-match:any": at Least One Pair of the Message Header of Key-Value Pairs Stored in the Must Match.
     */
    argument?: pulumi.Input<string>;
    /**
     * The Binding Key.
     * * For a non-topic source exchange: The binding key can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
     * The binding key must be 1 to 255 characters in length.
     * * For a topic source exchange: The binding key can contain letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
     * If the binding key contains a number sign (#), the binding key must start with a number sign (#) followed by a period (.) or end with a number sign (#) that follows a period (.).
     * The binding key must be 1 to 255 characters in length.
     */
    bindingKey?: pulumi.Input<string>;
    /**
     * The Target Binding Types. Valid values: `EXCHANGE`, `QUEUE`.
     */
    bindingType?: pulumi.Input<string>;
    /**
     * The Target Queue Or Exchange of the Name.
     */
    destinationName?: pulumi.Input<string>;
    /**
     * Instance Id.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The Source Exchange Name.
     */
    sourceExchange?: pulumi.Input<string>;
    /**
     * Virtualhost Name.
     */
    virtualHostName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Binding resource.
 */
export interface BindingArgs {
    /**
     * X-match Attributes. Valid Values: 
     * * "x-match:all": Default Value, All the Message Header of Key-Value Pairs Stored in the Must Match.
     * * "x-match:any": at Least One Pair of the Message Header of Key-Value Pairs Stored in the Must Match.
     */
    argument?: pulumi.Input<string>;
    /**
     * The Binding Key.
     * * For a non-topic source exchange: The binding key can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
     * The binding key must be 1 to 255 characters in length.
     * * For a topic source exchange: The binding key can contain letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
     * If the binding key contains a number sign (#), the binding key must start with a number sign (#) followed by a period (.) or end with a number sign (#) that follows a period (.).
     * The binding key must be 1 to 255 characters in length.
     */
    bindingKey: pulumi.Input<string>;
    /**
     * The Target Binding Types. Valid values: `EXCHANGE`, `QUEUE`.
     */
    bindingType: pulumi.Input<string>;
    /**
     * The Target Queue Or Exchange of the Name.
     */
    destinationName: pulumi.Input<string>;
    /**
     * Instance Id.
     */
    instanceId: pulumi.Input<string>;
    /**
     * The Source Exchange Name.
     */
    sourceExchange: pulumi.Input<string>;
    /**
     * Virtualhost Name.
     */
    virtualHostName: pulumi.Input<string>;
}