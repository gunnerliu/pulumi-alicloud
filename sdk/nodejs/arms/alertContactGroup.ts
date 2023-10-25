// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Application Real-Time Monitoring Service (ARMS) Alert Contact Group resource.
 *
 * For information about Application Real-Time Monitoring Service (ARMS) Alert Contact Group and how to use it, see [What is Alert Contact Group](https://www.alibabacloud.com/help/en/doc-detail/130677.htm).
 *
 * > **NOTE:** Available since v1.131.0.
 *
 * ## Import
 *
 * Application Real-Time Monitoring Service (ARMS) Alert Contact Group can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:arms/alertContactGroup:AlertContactGroup example <id>
 * ```
 */
export class AlertContactGroup extends pulumi.CustomResource {
    /**
     * Get an existing AlertContactGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertContactGroupState, opts?: pulumi.CustomResourceOptions): AlertContactGroup {
        return new AlertContactGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:arms/alertContactGroup:AlertContactGroup';

    /**
     * Returns true if the given object is an instance of AlertContactGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlertContactGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlertContactGroup.__pulumiType;
    }

    /**
     * The name of the resource.
     */
    public readonly alertContactGroupName!: pulumi.Output<string>;
    /**
     * The list id of alert contact.
     */
    public readonly contactIds!: pulumi.Output<string[] | undefined>;

    /**
     * Create a AlertContactGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertContactGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertContactGroupArgs | AlertContactGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlertContactGroupState | undefined;
            resourceInputs["alertContactGroupName"] = state ? state.alertContactGroupName : undefined;
            resourceInputs["contactIds"] = state ? state.contactIds : undefined;
        } else {
            const args = argsOrState as AlertContactGroupArgs | undefined;
            if ((!args || args.alertContactGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'alertContactGroupName'");
            }
            resourceInputs["alertContactGroupName"] = args ? args.alertContactGroupName : undefined;
            resourceInputs["contactIds"] = args ? args.contactIds : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AlertContactGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlertContactGroup resources.
 */
export interface AlertContactGroupState {
    /**
     * The name of the resource.
     */
    alertContactGroupName?: pulumi.Input<string>;
    /**
     * The list id of alert contact.
     */
    contactIds?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a AlertContactGroup resource.
 */
export interface AlertContactGroupArgs {
    /**
     * The name of the resource.
     */
    alertContactGroupName: pulumi.Input<string>;
    /**
     * The list id of alert contact.
     */
    contactIds?: pulumi.Input<pulumi.Input<string>[]>;
}
