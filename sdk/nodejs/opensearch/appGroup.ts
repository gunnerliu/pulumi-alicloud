// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a Open Search App Group resource.
 *
 * For information about Open Search App Group and how to use it, see [What is App Group](https://www.aliyun.com/product/opensearch).
 *
 * > **NOTE:** Available in v1.136.0+.
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
 * const name = config.get("name") || "name";
 * const _default = new alicloud.opensearch.AppGroup("default", {
 *     appGroupName: name,
 *     paymentType: "PayAsYouGo",
 *     type: "standard",
 *     quota: {
 *         docSize: 1,
 *         computeResource: 20,
 *         spec: "opensearch.share.common",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Open Search App Group can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:opensearch/appGroup:AppGroup example <id>
 * ```
 */
export class AppGroup extends pulumi.CustomResource {
    /**
     * Get an existing AppGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppGroupState, opts?: pulumi.CustomResourceOptions): AppGroup {
        return new AppGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:opensearch/appGroup:AppGroup';

    /**
     * Returns true if the given object is an instance of AppGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppGroup.__pulumiType;
    }

    /**
     * Application Group Name.
     */
    public readonly appGroupName!: pulumi.Output<string>;
    /**
     * Billing model. Valid values:`computeResource` and `qps`.
     */
    public readonly chargeWay!: pulumi.Output<string>;
    /**
     * The version of Application Group Name.
     */
    public readonly currentVersion!: pulumi.Output<string | undefined>;
    /**
     * The description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Order change type. Valid values: `UPGRADE` and `DOWNGRADE`.
     */
    public readonly orderType!: pulumi.Output<string>;
    /**
     * Order cycle information. The details see Block order.
     */
    public readonly orders!: pulumi.Output<outputs.opensearch.AppGroupOrder[] | undefined>;
    /**
     * The billing method of the resource. Valid values: `Subscription` and `PayAsYouGo`.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * Quota information.  The details see Block quota.
     */
    public readonly quota!: pulumi.Output<outputs.opensearch.AppGroupQuota>;
    /**
     * The status of the resource. Valid values: `producing`,`reviewPending`,`configPending`,`normal`,`frozen`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Application type. Valid Values: `standard`, `enhanced`.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a AppGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppGroupArgs | AppGroupState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppGroupState | undefined;
            inputs["appGroupName"] = state ? state.appGroupName : undefined;
            inputs["chargeWay"] = state ? state.chargeWay : undefined;
            inputs["currentVersion"] = state ? state.currentVersion : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["orderType"] = state ? state.orderType : undefined;
            inputs["orders"] = state ? state.orders : undefined;
            inputs["paymentType"] = state ? state.paymentType : undefined;
            inputs["quota"] = state ? state.quota : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as AppGroupArgs | undefined;
            if ((!args || args.appGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appGroupName'");
            }
            if ((!args || args.paymentType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'paymentType'");
            }
            if ((!args || args.quota === undefined) && !opts.urn) {
                throw new Error("Missing required property 'quota'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            inputs["appGroupName"] = args ? args.appGroupName : undefined;
            inputs["chargeWay"] = args ? args.chargeWay : undefined;
            inputs["currentVersion"] = args ? args.currentVersion : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["orderType"] = args ? args.orderType : undefined;
            inputs["orders"] = args ? args.orders : undefined;
            inputs["paymentType"] = args ? args.paymentType : undefined;
            inputs["quota"] = args ? args.quota : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AppGroup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppGroup resources.
 */
export interface AppGroupState {
    /**
     * Application Group Name.
     */
    appGroupName?: pulumi.Input<string>;
    /**
     * Billing model. Valid values:`computeResource` and `qps`.
     */
    chargeWay?: pulumi.Input<string>;
    /**
     * The version of Application Group Name.
     */
    currentVersion?: pulumi.Input<string>;
    /**
     * The description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Order change type. Valid values: `UPGRADE` and `DOWNGRADE`.
     */
    orderType?: pulumi.Input<string>;
    /**
     * Order cycle information. The details see Block order.
     */
    orders?: pulumi.Input<pulumi.Input<inputs.opensearch.AppGroupOrder>[]>;
    /**
     * The billing method of the resource. Valid values: `Subscription` and `PayAsYouGo`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * Quota information.  The details see Block quota.
     */
    quota?: pulumi.Input<inputs.opensearch.AppGroupQuota>;
    /**
     * The status of the resource. Valid values: `producing`,`reviewPending`,`configPending`,`normal`,`frozen`.
     */
    status?: pulumi.Input<string>;
    /**
     * Application type. Valid Values: `standard`, `enhanced`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AppGroup resource.
 */
export interface AppGroupArgs {
    /**
     * Application Group Name.
     */
    appGroupName: pulumi.Input<string>;
    /**
     * Billing model. Valid values:`computeResource` and `qps`.
     */
    chargeWay?: pulumi.Input<string>;
    /**
     * The version of Application Group Name.
     */
    currentVersion?: pulumi.Input<string>;
    /**
     * The description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Order change type. Valid values: `UPGRADE` and `DOWNGRADE`.
     */
    orderType?: pulumi.Input<string>;
    /**
     * Order cycle information. The details see Block order.
     */
    orders?: pulumi.Input<pulumi.Input<inputs.opensearch.AppGroupOrder>[]>;
    /**
     * The billing method of the resource. Valid values: `Subscription` and `PayAsYouGo`.
     */
    paymentType: pulumi.Input<string>;
    /**
     * Quota information.  The details see Block quota.
     */
    quota: pulumi.Input<inputs.opensearch.AppGroupQuota>;
    /**
     * Application type. Valid Values: `standard`, `enhanced`.
     */
    type: pulumi.Input<string>;
}