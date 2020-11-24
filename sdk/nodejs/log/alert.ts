// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Log alert is a unit of log service, which is used to monitor and alert the user's logstore status information.
 * Log Service enables you to configure alerts based on the charts in a dashboard to monitor the service status in real time.
 *
 * > **NOTE:** Available in 1.78.0
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const exampleProject = new alicloud.log.Project("exampleProject", {description: "create by terraform"});
 * const exampleStore = new alicloud.log.Store("exampleStore", {
 *     project: exampleProject.name,
 *     retentionPeriod: 3650,
 *     shardCount: 3,
 *     autoSplit: true,
 *     maxSplitShardCount: 60,
 *     appendMeta: true,
 * });
 * const exampleAlert = new alicloud.log.Alert("exampleAlert", {
 *     projectName: exampleProject.name,
 *     alertName: "tf-test-alert",
 *     alertDisplayname: "tf-test-alert-displayname",
 *     condition: "count> 100",
 *     dashboard: "tf-test-dashboard",
 *     queryLists: [{
 *         logstore: "tf-test-logstore",
 *         chartTitle: "chart_title",
 *         start: "-60s",
 *         end: "20s",
 *         query: "* AND aliyun",
 *     }],
 *     notificationLists: [
 *         {
 *             type: "SMS",
 *             mobileLists: [
 *                 "12345678",
 *                 "87654321",
 *             ],
 *             content: "alert content",
 *         },
 *         {
 *             type: "Email",
 *             emailLists: [
 *                 "aliyun@alibaba-inc.com",
 *                 "tf-test@123.com",
 *             ],
 *             content: "alert content",
 *         },
 *         {
 *             type: "DingTalk",
 *             serviceUri: "www.aliyun.com",
 *             content: "alert content",
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Log alert can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:log/alert:Alert example tf-log:tf-log-alert
 * ```
 */
export class Alert extends pulumi.CustomResource {
    /**
     * Get an existing Alert resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertState, opts?: pulumi.CustomResourceOptions): Alert {
        return new Alert(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:log/alert:Alert';

    /**
     * Returns true if the given object is an instance of Alert.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Alert {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Alert.__pulumiType;
    }

    /**
     * Alert description.
     */
    public readonly alertDescription!: pulumi.Output<string | undefined>;
    /**
     * Alert displayname.
     */
    public readonly alertDisplayname!: pulumi.Output<string>;
    /**
     * Name of logstore for configuring alarm service.
     */
    public readonly alertName!: pulumi.Output<string>;
    /**
     * Conditional expression, such as: count> 100.
     */
    public readonly condition!: pulumi.Output<string>;
    public readonly dashboard!: pulumi.Output<string>;
    /**
     * Timestamp, notifications before closing again.
     */
    public readonly muteUntil!: pulumi.Output<number | undefined>;
    /**
     * Alarm information notification list.
     */
    public readonly notificationLists!: pulumi.Output<outputs.log.AlertNotificationList[]>;
    /**
     * Notification threshold, which is not notified until the number of triggers is reached. The default is 1.
     */
    public readonly notifyThreshold!: pulumi.Output<number | undefined>;
    /**
     * The project name.
     */
    public readonly projectName!: pulumi.Output<string>;
    /**
     * Multiple conditions for configured alarm query.
     */
    public readonly queryLists!: pulumi.Output<outputs.log.AlertQueryList[]>;
    /**
     * Execution interval. 60 seconds minimum, such as 60s, 1h.
     */
    public readonly scheduleInterval!: pulumi.Output<string | undefined>;
    /**
     * Default FixedRate. No need to configure this parameter.
     */
    public readonly scheduleType!: pulumi.Output<string | undefined>;
    /**
     * Notification interval, default is no interval. Support number + unit type, for example 60s, 1h.
     */
    public readonly throttling!: pulumi.Output<string | undefined>;

    /**
     * Create a Alert resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertArgs | AlertState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AlertState | undefined;
            inputs["alertDescription"] = state ? state.alertDescription : undefined;
            inputs["alertDisplayname"] = state ? state.alertDisplayname : undefined;
            inputs["alertName"] = state ? state.alertName : undefined;
            inputs["condition"] = state ? state.condition : undefined;
            inputs["dashboard"] = state ? state.dashboard : undefined;
            inputs["muteUntil"] = state ? state.muteUntil : undefined;
            inputs["notificationLists"] = state ? state.notificationLists : undefined;
            inputs["notifyThreshold"] = state ? state.notifyThreshold : undefined;
            inputs["projectName"] = state ? state.projectName : undefined;
            inputs["queryLists"] = state ? state.queryLists : undefined;
            inputs["scheduleInterval"] = state ? state.scheduleInterval : undefined;
            inputs["scheduleType"] = state ? state.scheduleType : undefined;
            inputs["throttling"] = state ? state.throttling : undefined;
        } else {
            const args = argsOrState as AlertArgs | undefined;
            if (!args || args.alertDisplayname === undefined) {
                throw new Error("Missing required property 'alertDisplayname'");
            }
            if (!args || args.alertName === undefined) {
                throw new Error("Missing required property 'alertName'");
            }
            if (!args || args.condition === undefined) {
                throw new Error("Missing required property 'condition'");
            }
            if (!args || args.dashboard === undefined) {
                throw new Error("Missing required property 'dashboard'");
            }
            if (!args || args.notificationLists === undefined) {
                throw new Error("Missing required property 'notificationLists'");
            }
            if (!args || args.projectName === undefined) {
                throw new Error("Missing required property 'projectName'");
            }
            if (!args || args.queryLists === undefined) {
                throw new Error("Missing required property 'queryLists'");
            }
            inputs["alertDescription"] = args ? args.alertDescription : undefined;
            inputs["alertDisplayname"] = args ? args.alertDisplayname : undefined;
            inputs["alertName"] = args ? args.alertName : undefined;
            inputs["condition"] = args ? args.condition : undefined;
            inputs["dashboard"] = args ? args.dashboard : undefined;
            inputs["muteUntil"] = args ? args.muteUntil : undefined;
            inputs["notificationLists"] = args ? args.notificationLists : undefined;
            inputs["notifyThreshold"] = args ? args.notifyThreshold : undefined;
            inputs["projectName"] = args ? args.projectName : undefined;
            inputs["queryLists"] = args ? args.queryLists : undefined;
            inputs["scheduleInterval"] = args ? args.scheduleInterval : undefined;
            inputs["scheduleType"] = args ? args.scheduleType : undefined;
            inputs["throttling"] = args ? args.throttling : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Alert.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Alert resources.
 */
export interface AlertState {
    /**
     * Alert description.
     */
    readonly alertDescription?: pulumi.Input<string>;
    /**
     * Alert displayname.
     */
    readonly alertDisplayname?: pulumi.Input<string>;
    /**
     * Name of logstore for configuring alarm service.
     */
    readonly alertName?: pulumi.Input<string>;
    /**
     * Conditional expression, such as: count> 100.
     */
    readonly condition?: pulumi.Input<string>;
    readonly dashboard?: pulumi.Input<string>;
    /**
     * Timestamp, notifications before closing again.
     */
    readonly muteUntil?: pulumi.Input<number>;
    /**
     * Alarm information notification list.
     */
    readonly notificationLists?: pulumi.Input<pulumi.Input<inputs.log.AlertNotificationList>[]>;
    /**
     * Notification threshold, which is not notified until the number of triggers is reached. The default is 1.
     */
    readonly notifyThreshold?: pulumi.Input<number>;
    /**
     * The project name.
     */
    readonly projectName?: pulumi.Input<string>;
    /**
     * Multiple conditions for configured alarm query.
     */
    readonly queryLists?: pulumi.Input<pulumi.Input<inputs.log.AlertQueryList>[]>;
    /**
     * Execution interval. 60 seconds minimum, such as 60s, 1h.
     */
    readonly scheduleInterval?: pulumi.Input<string>;
    /**
     * Default FixedRate. No need to configure this parameter.
     */
    readonly scheduleType?: pulumi.Input<string>;
    /**
     * Notification interval, default is no interval. Support number + unit type, for example 60s, 1h.
     */
    readonly throttling?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Alert resource.
 */
export interface AlertArgs {
    /**
     * Alert description.
     */
    readonly alertDescription?: pulumi.Input<string>;
    /**
     * Alert displayname.
     */
    readonly alertDisplayname: pulumi.Input<string>;
    /**
     * Name of logstore for configuring alarm service.
     */
    readonly alertName: pulumi.Input<string>;
    /**
     * Conditional expression, such as: count> 100.
     */
    readonly condition: pulumi.Input<string>;
    readonly dashboard: pulumi.Input<string>;
    /**
     * Timestamp, notifications before closing again.
     */
    readonly muteUntil?: pulumi.Input<number>;
    /**
     * Alarm information notification list.
     */
    readonly notificationLists: pulumi.Input<pulumi.Input<inputs.log.AlertNotificationList>[]>;
    /**
     * Notification threshold, which is not notified until the number of triggers is reached. The default is 1.
     */
    readonly notifyThreshold?: pulumi.Input<number>;
    /**
     * The project name.
     */
    readonly projectName: pulumi.Input<string>;
    /**
     * Multiple conditions for configured alarm query.
     */
    readonly queryLists: pulumi.Input<pulumi.Input<inputs.log.AlertQueryList>[]>;
    /**
     * Execution interval. 60 seconds minimum, such as 60s, 1h.
     */
    readonly scheduleInterval?: pulumi.Input<string>;
    /**
     * Default FixedRate. No need to configure this parameter.
     */
    readonly scheduleType?: pulumi.Input<string>;
    /**
     * Notification interval, default is no interval. Support number + unit type, for example 60s, 1h.
     */
    readonly throttling?: pulumi.Input<string>;
}
