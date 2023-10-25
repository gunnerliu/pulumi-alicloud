// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Msc Sub Subscription resource.
 *
 * > **NOTE:** Available since v1.135.0.
 *
 * ## Import
 *
 * Msc Sub Subscription can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:index/mscSubSubscription:MscSubSubscription example <id>
 * ```
 */
export class MscSubSubscription extends pulumi.CustomResource {
    /**
     * Get an existing MscSubSubscription resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MscSubSubscriptionState, opts?: pulumi.CustomResourceOptions): MscSubSubscription {
        return new MscSubSubscription(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:index/mscSubSubscription:MscSubSubscription';

    /**
     * Returns true if the given object is an instance of MscSubSubscription.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MscSubSubscription {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MscSubSubscription.__pulumiType;
    }

    /**
     * The channel the Subscription.
     */
    public /*out*/ readonly channel!: pulumi.Output<string>;
    /**
     * The ids of subscribed contacts.
     * **NOTE:** There is a potential diff error because of the order of `contactIds` values indefinite.
     * So, from version 1.161.0, `contactIds` type has been updated as `set` from `list`,
     * and you can use tolist to convert it to a list.
     */
    public readonly contactIds!: pulumi.Output<string[]>;
    /**
     * The description of the Subscription.
     */
    public /*out*/ readonly description!: pulumi.Output<string>;
    /**
     * The status of email subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    public readonly emailStatus!: pulumi.Output<number | undefined>;
    /**
     * The name of the Subscription. **NOTE:**  You should use the `alicloud.getMscSubSubscriptions` to query the available subscription item name.
     */
    public readonly itemName!: pulumi.Output<string>;
    /**
     * The status of pmsg subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    public readonly pmsgStatus!: pulumi.Output<number | undefined>;
    /**
     * The status of sms subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    public readonly smsStatus!: pulumi.Output<number | undefined>;
    /**
     * The status of tts subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    public readonly ttsStatus!: pulumi.Output<number | undefined>;
    /**
     * The ids of subscribed webhooks.
     */
    public readonly webhookIds!: pulumi.Output<string[] | undefined>;
    /**
     * The status of webhook subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    public readonly webhookStatus!: pulumi.Output<number | undefined>;

    /**
     * Create a MscSubSubscription resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MscSubSubscriptionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MscSubSubscriptionArgs | MscSubSubscriptionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MscSubSubscriptionState | undefined;
            resourceInputs["channel"] = state ? state.channel : undefined;
            resourceInputs["contactIds"] = state ? state.contactIds : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["emailStatus"] = state ? state.emailStatus : undefined;
            resourceInputs["itemName"] = state ? state.itemName : undefined;
            resourceInputs["pmsgStatus"] = state ? state.pmsgStatus : undefined;
            resourceInputs["smsStatus"] = state ? state.smsStatus : undefined;
            resourceInputs["ttsStatus"] = state ? state.ttsStatus : undefined;
            resourceInputs["webhookIds"] = state ? state.webhookIds : undefined;
            resourceInputs["webhookStatus"] = state ? state.webhookStatus : undefined;
        } else {
            const args = argsOrState as MscSubSubscriptionArgs | undefined;
            if ((!args || args.itemName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'itemName'");
            }
            resourceInputs["contactIds"] = args ? args.contactIds : undefined;
            resourceInputs["emailStatus"] = args ? args.emailStatus : undefined;
            resourceInputs["itemName"] = args ? args.itemName : undefined;
            resourceInputs["pmsgStatus"] = args ? args.pmsgStatus : undefined;
            resourceInputs["smsStatus"] = args ? args.smsStatus : undefined;
            resourceInputs["ttsStatus"] = args ? args.ttsStatus : undefined;
            resourceInputs["webhookIds"] = args ? args.webhookIds : undefined;
            resourceInputs["webhookStatus"] = args ? args.webhookStatus : undefined;
            resourceInputs["channel"] = undefined /*out*/;
            resourceInputs["description"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MscSubSubscription.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MscSubSubscription resources.
 */
export interface MscSubSubscriptionState {
    /**
     * The channel the Subscription.
     */
    channel?: pulumi.Input<string>;
    /**
     * The ids of subscribed contacts.
     * **NOTE:** There is a potential diff error because of the order of `contactIds` values indefinite.
     * So, from version 1.161.0, `contactIds` type has been updated as `set` from `list`,
     * and you can use tolist to convert it to a list.
     */
    contactIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The description of the Subscription.
     */
    description?: pulumi.Input<string>;
    /**
     * The status of email subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    emailStatus?: pulumi.Input<number>;
    /**
     * The name of the Subscription. **NOTE:**  You should use the `alicloud.getMscSubSubscriptions` to query the available subscription item name.
     */
    itemName?: pulumi.Input<string>;
    /**
     * The status of pmsg subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    pmsgStatus?: pulumi.Input<number>;
    /**
     * The status of sms subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    smsStatus?: pulumi.Input<number>;
    /**
     * The status of tts subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    ttsStatus?: pulumi.Input<number>;
    /**
     * The ids of subscribed webhooks.
     */
    webhookIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The status of webhook subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    webhookStatus?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a MscSubSubscription resource.
 */
export interface MscSubSubscriptionArgs {
    /**
     * The ids of subscribed contacts.
     * **NOTE:** There is a potential diff error because of the order of `contactIds` values indefinite.
     * So, from version 1.161.0, `contactIds` type has been updated as `set` from `list`,
     * and you can use tolist to convert it to a list.
     */
    contactIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The status of email subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    emailStatus?: pulumi.Input<number>;
    /**
     * The name of the Subscription. **NOTE:**  You should use the `alicloud.getMscSubSubscriptions` to query the available subscription item name.
     */
    itemName: pulumi.Input<string>;
    /**
     * The status of pmsg subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    pmsgStatus?: pulumi.Input<number>;
    /**
     * The status of sms subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    smsStatus?: pulumi.Input<number>;
    /**
     * The status of tts subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    ttsStatus?: pulumi.Input<number>;
    /**
     * The ids of subscribed webhooks.
     */
    webhookIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The status of webhook subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
     */
    webhookStatus?: pulumi.Input<number>;
}
