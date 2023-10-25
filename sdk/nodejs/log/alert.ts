// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Log alert is a unit of log service, which is used to monitor and alert the user's logstore status information.
 * Log Service enables you to configure alerts based on the charts in a dashboard to monitor the service status in real time.
 *
 * For information about SLS Alert and how to use it, see [SLS Alert Overview](https://www.alibabacloud.com/help/en/doc-detail/209202.html)
 *
 * > **NOTE:** Available in 1.78.0
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
     * Alert template annotations.
     */
    public readonly annotations!: pulumi.Output<outputs.log.AlertAnnotation[] | undefined>;
    /**
     * whether to add automatic annotation, default is false.
     */
    public readonly autoAnnotation!: pulumi.Output<boolean | undefined>;
    /**
     * Join condition.
     *
     * @deprecated Deprecated from 1.161.0+, use eval_condition in severity_configurations
     */
    public readonly condition!: pulumi.Output<string | undefined>;
    /**
     * @deprecated Deprecated from 1.161.0+, use dashboardId in query_list
     */
    public readonly dashboard!: pulumi.Output<string | undefined>;
    /**
     * Group configuration for new alert.
     */
    public readonly groupConfiguration!: pulumi.Output<outputs.log.AlertGroupConfiguration | undefined>;
    /**
     * Join configuration for different queries.
     */
    public readonly joinConfigurations!: pulumi.Output<outputs.log.AlertJoinConfiguration[] | undefined>;
    /**
     * Labels for new alert.
     */
    public readonly labels!: pulumi.Output<outputs.log.AlertLabel[] | undefined>;
    /**
     * Timestamp, notifications before closing again.
     */
    public readonly muteUntil!: pulumi.Output<number>;
    /**
     * Switch for whether new alert fires when no data happens, default is false.
     */
    public readonly noDataFire!: pulumi.Output<boolean | undefined>;
    /**
     * when no data happens, the severity of new alert.
     */
    public readonly noDataSeverity!: pulumi.Output<number | undefined>;
    /**
     * Alarm information notification list, Deprecated from 1.161.0+.
     *
     * @deprecated Deprecated from 1.161.0+, use policy_configuration for notification
     */
    public readonly notificationLists!: pulumi.Output<outputs.log.AlertNotificationList[] | undefined>;
    /**
     * Notification threshold, which is not notified until the number of triggers is reached. The default is 1, Deprecated from 1.161.0+.
     *
     * @deprecated Deprecated from 1.161.0+, use threshold
     */
    public readonly notifyThreshold!: pulumi.Output<number | undefined>;
    /**
     * Policy configuration for new alert.
     */
    public readonly policyConfiguration!: pulumi.Output<outputs.log.AlertPolicyConfiguration | undefined>;
    /**
     * The project name.
     */
    public readonly projectName!: pulumi.Output<string>;
    /**
     * Multiple conditions for configured alarm query.
     */
    public readonly queryLists!: pulumi.Output<outputs.log.AlertQueryList[] | undefined>;
    /**
     * schedule for alert.
     */
    public readonly schedule!: pulumi.Output<outputs.log.AlertSchedule | undefined>;
    /**
     * Execution interval. 60 seconds minimum, such as 60s, 1h. Deprecated from 1.176.0+. use interval in schedule.
     *
     * @deprecated Field 'schedule_interval' has been deprecated from provider version 1.176.0. New field 'schedule' instead.
     */
    public readonly scheduleInterval!: pulumi.Output<string>;
    /**
     * Default FixedRate. No need to configure this parameter. Deprecated from 1.176.0+. use type in schedule.
     *
     * @deprecated Field 'schedule_type' has been deprecated from provider version 1.176.0. New field 'schedule' instead.
     */
    public readonly scheduleType!: pulumi.Output<string>;
    /**
     * when new alert is resolved, whether to notify, default is false.
     */
    public readonly sendResolved!: pulumi.Output<boolean | undefined>;
    /**
     * Severity configuration for new alert.
     */
    public readonly severityConfigurations!: pulumi.Output<outputs.log.AlertSeverityConfiguration[] | undefined>;
    /**
     * Template configuration for alert, when `type` is `tpl`.
     */
    public readonly templateConfiguration!: pulumi.Output<outputs.log.AlertTemplateConfiguration | undefined>;
    /**
     * Evaluation threshold, alert will not fire until the number of triggers is reached. The default is 1.
     */
    public readonly threshold!: pulumi.Output<number>;
    /**
     * Notification interval, default is no interval. Support number + unit type, for example 60s, 1h, Deprecated from 1.161.0+.
     *
     * @deprecated Deprecated from 1.161.0+, use repeat_interval in policy_configuration
     */
    public readonly throttling!: pulumi.Output<string | undefined>;
    /**
     * including FixedRate,Hourly,Daily,Weekly,Cron.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * The version of alert, new alert is 2.0.
     */
    public readonly version!: pulumi.Output<string | undefined>;

    /**
     * Create a Alert resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertArgs | AlertState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlertState | undefined;
            resourceInputs["alertDescription"] = state ? state.alertDescription : undefined;
            resourceInputs["alertDisplayname"] = state ? state.alertDisplayname : undefined;
            resourceInputs["alertName"] = state ? state.alertName : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["autoAnnotation"] = state ? state.autoAnnotation : undefined;
            resourceInputs["condition"] = state ? state.condition : undefined;
            resourceInputs["dashboard"] = state ? state.dashboard : undefined;
            resourceInputs["groupConfiguration"] = state ? state.groupConfiguration : undefined;
            resourceInputs["joinConfigurations"] = state ? state.joinConfigurations : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["muteUntil"] = state ? state.muteUntil : undefined;
            resourceInputs["noDataFire"] = state ? state.noDataFire : undefined;
            resourceInputs["noDataSeverity"] = state ? state.noDataSeverity : undefined;
            resourceInputs["notificationLists"] = state ? state.notificationLists : undefined;
            resourceInputs["notifyThreshold"] = state ? state.notifyThreshold : undefined;
            resourceInputs["policyConfiguration"] = state ? state.policyConfiguration : undefined;
            resourceInputs["projectName"] = state ? state.projectName : undefined;
            resourceInputs["queryLists"] = state ? state.queryLists : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["scheduleInterval"] = state ? state.scheduleInterval : undefined;
            resourceInputs["scheduleType"] = state ? state.scheduleType : undefined;
            resourceInputs["sendResolved"] = state ? state.sendResolved : undefined;
            resourceInputs["severityConfigurations"] = state ? state.severityConfigurations : undefined;
            resourceInputs["templateConfiguration"] = state ? state.templateConfiguration : undefined;
            resourceInputs["threshold"] = state ? state.threshold : undefined;
            resourceInputs["throttling"] = state ? state.throttling : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as AlertArgs | undefined;
            if ((!args || args.alertDisplayname === undefined) && !opts.urn) {
                throw new Error("Missing required property 'alertDisplayname'");
            }
            if ((!args || args.alertName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'alertName'");
            }
            if ((!args || args.projectName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectName'");
            }
            resourceInputs["alertDescription"] = args ? args.alertDescription : undefined;
            resourceInputs["alertDisplayname"] = args ? args.alertDisplayname : undefined;
            resourceInputs["alertName"] = args ? args.alertName : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["autoAnnotation"] = args ? args.autoAnnotation : undefined;
            resourceInputs["condition"] = args ? args.condition : undefined;
            resourceInputs["dashboard"] = args ? args.dashboard : undefined;
            resourceInputs["groupConfiguration"] = args ? args.groupConfiguration : undefined;
            resourceInputs["joinConfigurations"] = args ? args.joinConfigurations : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["muteUntil"] = args ? args.muteUntil : undefined;
            resourceInputs["noDataFire"] = args ? args.noDataFire : undefined;
            resourceInputs["noDataSeverity"] = args ? args.noDataSeverity : undefined;
            resourceInputs["notificationLists"] = args ? args.notificationLists : undefined;
            resourceInputs["notifyThreshold"] = args ? args.notifyThreshold : undefined;
            resourceInputs["policyConfiguration"] = args ? args.policyConfiguration : undefined;
            resourceInputs["projectName"] = args ? args.projectName : undefined;
            resourceInputs["queryLists"] = args ? args.queryLists : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["scheduleInterval"] = args ? args.scheduleInterval : undefined;
            resourceInputs["scheduleType"] = args ? args.scheduleType : undefined;
            resourceInputs["sendResolved"] = args ? args.sendResolved : undefined;
            resourceInputs["severityConfigurations"] = args ? args.severityConfigurations : undefined;
            resourceInputs["templateConfiguration"] = args ? args.templateConfiguration : undefined;
            resourceInputs["threshold"] = args ? args.threshold : undefined;
            resourceInputs["throttling"] = args ? args.throttling : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Alert.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Alert resources.
 */
export interface AlertState {
    /**
     * Alert description.
     */
    alertDescription?: pulumi.Input<string>;
    /**
     * Alert displayname.
     */
    alertDisplayname?: pulumi.Input<string>;
    /**
     * Name of logstore for configuring alarm service.
     */
    alertName?: pulumi.Input<string>;
    /**
     * Alert template annotations.
     */
    annotations?: pulumi.Input<pulumi.Input<inputs.log.AlertAnnotation>[]>;
    /**
     * whether to add automatic annotation, default is false.
     */
    autoAnnotation?: pulumi.Input<boolean>;
    /**
     * Join condition.
     *
     * @deprecated Deprecated from 1.161.0+, use eval_condition in severity_configurations
     */
    condition?: pulumi.Input<string>;
    /**
     * @deprecated Deprecated from 1.161.0+, use dashboardId in query_list
     */
    dashboard?: pulumi.Input<string>;
    /**
     * Group configuration for new alert.
     */
    groupConfiguration?: pulumi.Input<inputs.log.AlertGroupConfiguration>;
    /**
     * Join configuration for different queries.
     */
    joinConfigurations?: pulumi.Input<pulumi.Input<inputs.log.AlertJoinConfiguration>[]>;
    /**
     * Labels for new alert.
     */
    labels?: pulumi.Input<pulumi.Input<inputs.log.AlertLabel>[]>;
    /**
     * Timestamp, notifications before closing again.
     */
    muteUntil?: pulumi.Input<number>;
    /**
     * Switch for whether new alert fires when no data happens, default is false.
     */
    noDataFire?: pulumi.Input<boolean>;
    /**
     * when no data happens, the severity of new alert.
     */
    noDataSeverity?: pulumi.Input<number>;
    /**
     * Alarm information notification list, Deprecated from 1.161.0+.
     *
     * @deprecated Deprecated from 1.161.0+, use policy_configuration for notification
     */
    notificationLists?: pulumi.Input<pulumi.Input<inputs.log.AlertNotificationList>[]>;
    /**
     * Notification threshold, which is not notified until the number of triggers is reached. The default is 1, Deprecated from 1.161.0+.
     *
     * @deprecated Deprecated from 1.161.0+, use threshold
     */
    notifyThreshold?: pulumi.Input<number>;
    /**
     * Policy configuration for new alert.
     */
    policyConfiguration?: pulumi.Input<inputs.log.AlertPolicyConfiguration>;
    /**
     * The project name.
     */
    projectName?: pulumi.Input<string>;
    /**
     * Multiple conditions for configured alarm query.
     */
    queryLists?: pulumi.Input<pulumi.Input<inputs.log.AlertQueryList>[]>;
    /**
     * schedule for alert.
     */
    schedule?: pulumi.Input<inputs.log.AlertSchedule>;
    /**
     * Execution interval. 60 seconds minimum, such as 60s, 1h. Deprecated from 1.176.0+. use interval in schedule.
     *
     * @deprecated Field 'schedule_interval' has been deprecated from provider version 1.176.0. New field 'schedule' instead.
     */
    scheduleInterval?: pulumi.Input<string>;
    /**
     * Default FixedRate. No need to configure this parameter. Deprecated from 1.176.0+. use type in schedule.
     *
     * @deprecated Field 'schedule_type' has been deprecated from provider version 1.176.0. New field 'schedule' instead.
     */
    scheduleType?: pulumi.Input<string>;
    /**
     * when new alert is resolved, whether to notify, default is false.
     */
    sendResolved?: pulumi.Input<boolean>;
    /**
     * Severity configuration for new alert.
     */
    severityConfigurations?: pulumi.Input<pulumi.Input<inputs.log.AlertSeverityConfiguration>[]>;
    /**
     * Template configuration for alert, when `type` is `tpl`.
     */
    templateConfiguration?: pulumi.Input<inputs.log.AlertTemplateConfiguration>;
    /**
     * Evaluation threshold, alert will not fire until the number of triggers is reached. The default is 1.
     */
    threshold?: pulumi.Input<number>;
    /**
     * Notification interval, default is no interval. Support number + unit type, for example 60s, 1h, Deprecated from 1.161.0+.
     *
     * @deprecated Deprecated from 1.161.0+, use repeat_interval in policy_configuration
     */
    throttling?: pulumi.Input<string>;
    /**
     * including FixedRate,Hourly,Daily,Weekly,Cron.
     */
    type?: pulumi.Input<string>;
    /**
     * The version of alert, new alert is 2.0.
     */
    version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Alert resource.
 */
export interface AlertArgs {
    /**
     * Alert description.
     */
    alertDescription?: pulumi.Input<string>;
    /**
     * Alert displayname.
     */
    alertDisplayname: pulumi.Input<string>;
    /**
     * Name of logstore for configuring alarm service.
     */
    alertName: pulumi.Input<string>;
    /**
     * Alert template annotations.
     */
    annotations?: pulumi.Input<pulumi.Input<inputs.log.AlertAnnotation>[]>;
    /**
     * whether to add automatic annotation, default is false.
     */
    autoAnnotation?: pulumi.Input<boolean>;
    /**
     * Join condition.
     *
     * @deprecated Deprecated from 1.161.0+, use eval_condition in severity_configurations
     */
    condition?: pulumi.Input<string>;
    /**
     * @deprecated Deprecated from 1.161.0+, use dashboardId in query_list
     */
    dashboard?: pulumi.Input<string>;
    /**
     * Group configuration for new alert.
     */
    groupConfiguration?: pulumi.Input<inputs.log.AlertGroupConfiguration>;
    /**
     * Join configuration for different queries.
     */
    joinConfigurations?: pulumi.Input<pulumi.Input<inputs.log.AlertJoinConfiguration>[]>;
    /**
     * Labels for new alert.
     */
    labels?: pulumi.Input<pulumi.Input<inputs.log.AlertLabel>[]>;
    /**
     * Timestamp, notifications before closing again.
     */
    muteUntil?: pulumi.Input<number>;
    /**
     * Switch for whether new alert fires when no data happens, default is false.
     */
    noDataFire?: pulumi.Input<boolean>;
    /**
     * when no data happens, the severity of new alert.
     */
    noDataSeverity?: pulumi.Input<number>;
    /**
     * Alarm information notification list, Deprecated from 1.161.0+.
     *
     * @deprecated Deprecated from 1.161.0+, use policy_configuration for notification
     */
    notificationLists?: pulumi.Input<pulumi.Input<inputs.log.AlertNotificationList>[]>;
    /**
     * Notification threshold, which is not notified until the number of triggers is reached. The default is 1, Deprecated from 1.161.0+.
     *
     * @deprecated Deprecated from 1.161.0+, use threshold
     */
    notifyThreshold?: pulumi.Input<number>;
    /**
     * Policy configuration for new alert.
     */
    policyConfiguration?: pulumi.Input<inputs.log.AlertPolicyConfiguration>;
    /**
     * The project name.
     */
    projectName: pulumi.Input<string>;
    /**
     * Multiple conditions for configured alarm query.
     */
    queryLists?: pulumi.Input<pulumi.Input<inputs.log.AlertQueryList>[]>;
    /**
     * schedule for alert.
     */
    schedule?: pulumi.Input<inputs.log.AlertSchedule>;
    /**
     * Execution interval. 60 seconds minimum, such as 60s, 1h. Deprecated from 1.176.0+. use interval in schedule.
     *
     * @deprecated Field 'schedule_interval' has been deprecated from provider version 1.176.0. New field 'schedule' instead.
     */
    scheduleInterval?: pulumi.Input<string>;
    /**
     * Default FixedRate. No need to configure this parameter. Deprecated from 1.176.0+. use type in schedule.
     *
     * @deprecated Field 'schedule_type' has been deprecated from provider version 1.176.0. New field 'schedule' instead.
     */
    scheduleType?: pulumi.Input<string>;
    /**
     * when new alert is resolved, whether to notify, default is false.
     */
    sendResolved?: pulumi.Input<boolean>;
    /**
     * Severity configuration for new alert.
     */
    severityConfigurations?: pulumi.Input<pulumi.Input<inputs.log.AlertSeverityConfiguration>[]>;
    /**
     * Template configuration for alert, when `type` is `tpl`.
     */
    templateConfiguration?: pulumi.Input<inputs.log.AlertTemplateConfiguration>;
    /**
     * Evaluation threshold, alert will not fire until the number of triggers is reached. The default is 1.
     */
    threshold?: pulumi.Input<number>;
    /**
     * Notification interval, default is no interval. Support number + unit type, for example 60s, 1h, Deprecated from 1.161.0+.
     *
     * @deprecated Deprecated from 1.161.0+, use repeat_interval in policy_configuration
     */
    throttling?: pulumi.Input<string>;
    /**
     * including FixedRate,Hourly,Daily,Weekly,Cron.
     */
    type?: pulumi.Input<string>;
    /**
     * The version of alert, new alert is 2.0.
     */
    version?: pulumi.Input<string>;
}
