// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.log.AlertArgs;
import com.pulumi.alicloud.log.inputs.AlertState;
import com.pulumi.alicloud.log.outputs.AlertAnnotation;
import com.pulumi.alicloud.log.outputs.AlertGroupConfiguration;
import com.pulumi.alicloud.log.outputs.AlertJoinConfiguration;
import com.pulumi.alicloud.log.outputs.AlertLabel;
import com.pulumi.alicloud.log.outputs.AlertNotificationList;
import com.pulumi.alicloud.log.outputs.AlertPolicyConfiguration;
import com.pulumi.alicloud.log.outputs.AlertQueryList;
import com.pulumi.alicloud.log.outputs.AlertSchedule;
import com.pulumi.alicloud.log.outputs.AlertSeverityConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Log alert is a unit of log service, which is used to monitor and alert the user&#39;s logstore status information.
 * Log Service enables you to configure alerts based on the charts in a dashboard to monitor the service status in real time.
 * 
 * For information about SLS Alert and how to use it, see [SLS Alert Overview](https://www.alibabacloud.com/help/en/doc-detail/209202.html)
 * 
 * &gt; **NOTE:** Available in 1.78.0
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.log.Project;
 * import com.pulumi.alicloud.log.ProjectArgs;
 * import com.pulumi.alicloud.log.Store;
 * import com.pulumi.alicloud.log.StoreArgs;
 * import com.pulumi.alicloud.log.Alert;
 * import com.pulumi.alicloud.log.AlertArgs;
 * import com.pulumi.alicloud.log.inputs.AlertScheduleArgs;
 * import com.pulumi.alicloud.log.inputs.AlertQueryListArgs;
 * import com.pulumi.alicloud.log.inputs.AlertNotificationListArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleProject = new Project(&#34;exampleProject&#34;, ProjectArgs.builder()        
 *             .description(&#34;create by terraform&#34;)
 *             .build());
 * 
 *         var exampleStore = new Store(&#34;exampleStore&#34;, StoreArgs.builder()        
 *             .project(exampleProject.name())
 *             .retentionPeriod(3650)
 *             .shardCount(3)
 *             .autoSplit(true)
 *             .maxSplitShardCount(60)
 *             .appendMeta(true)
 *             .build());
 * 
 *         var exampleAlert = new Alert(&#34;exampleAlert&#34;, AlertArgs.builder()        
 *             .projectName(exampleProject.name())
 *             .alertName(&#34;tf-test-alert&#34;)
 *             .alertDisplayname(&#34;tf-test-alert-displayname&#34;)
 *             .condition(&#34;count&gt; 100&#34;)
 *             .dashboard(&#34;tf-test-dashboard&#34;)
 *             .schedule(AlertScheduleArgs.builder()
 *                 .type(&#34;FixedRate&#34;)
 *                 .interval(&#34;5m&#34;)
 *                 .hour(0)
 *                 .dayOfWeek(0)
 *                 .delay(0)
 *                 .runImmediately(false)
 *                 .build())
 *             .queryLists(AlertQueryListArgs.builder()
 *                 .logstore(&#34;tf-test-logstore&#34;)
 *                 .chartTitle(&#34;chart_title&#34;)
 *                 .start(&#34;-60s&#34;)
 *                 .end(&#34;20s&#34;)
 *                 .query(&#34;* AND aliyun&#34;)
 *                 .build())
 *             .notificationLists(            
 *                 AlertNotificationListArgs.builder()
 *                     .type(&#34;SMS&#34;)
 *                     .mobileLists(                    
 *                         &#34;12345678&#34;,
 *                         &#34;87654321&#34;)
 *                     .content(&#34;alert content&#34;)
 *                     .build(),
 *                 AlertNotificationListArgs.builder()
 *                     .type(&#34;Email&#34;)
 *                     .emailLists(                    
 *                         &#34;aliyun@alibaba-inc.com&#34;,
 *                         &#34;tf-test@123.com&#34;)
 *                     .content(&#34;alert content&#34;)
 *                     .build(),
 *                 AlertNotificationListArgs.builder()
 *                     .type(&#34;DingTalk&#34;)
 *                     .serviceUri(&#34;www.aliyun.com&#34;)
 *                     .content(&#34;alert content&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Basic Usage for new alert
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.log.Project;
 * import com.pulumi.alicloud.log.ProjectArgs;
 * import com.pulumi.alicloud.log.Store;
 * import com.pulumi.alicloud.log.StoreArgs;
 * import com.pulumi.alicloud.log.Alert;
 * import com.pulumi.alicloud.log.AlertArgs;
 * import com.pulumi.alicloud.log.inputs.AlertScheduleArgs;
 * import com.pulumi.alicloud.log.inputs.AlertQueryListArgs;
 * import com.pulumi.alicloud.log.inputs.AlertLabelArgs;
 * import com.pulumi.alicloud.log.inputs.AlertAnnotationArgs;
 * import com.pulumi.alicloud.log.inputs.AlertGroupConfigurationArgs;
 * import com.pulumi.alicloud.log.inputs.AlertPolicyConfigurationArgs;
 * import com.pulumi.alicloud.log.inputs.AlertSeverityConfigurationArgs;
 * import com.pulumi.alicloud.log.inputs.AlertJoinConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleProject = new Project(&#34;exampleProject&#34;, ProjectArgs.builder()        
 *             .description(&#34;create by terraform&#34;)
 *             .build());
 * 
 *         var exampleStore = new Store(&#34;exampleStore&#34;, StoreArgs.builder()        
 *             .project(exampleProject.name())
 *             .retentionPeriod(3650)
 *             .shardCount(3)
 *             .autoSplit(true)
 *             .maxSplitShardCount(60)
 *             .appendMeta(true)
 *             .build());
 * 
 *         var example_2 = new Alert(&#34;example-2&#34;, AlertArgs.builder()        
 *             .version(&#34;2.0&#34;)
 *             .type(&#34;default&#34;)
 *             .projectName(exampleProject.name())
 *             .alertName(&#34;tf-test-alert-2&#34;)
 *             .alertDisplayname(&#34;tf-test-alert-displayname-2&#34;)
 *             .dashboard(&#34;tf-test-dashboard&#34;)
 *             .muteUntil(&#34;1632486684&#34;)
 *             .noDataFire(&#34;false&#34;)
 *             .noDataSeverity(8)
 *             .sendResolved(true)
 *             .autoAnnotation(true)
 *             .schedule(AlertScheduleArgs.builder()
 *                 .type(&#34;FixedRate&#34;)
 *                 .interval(&#34;5m&#34;)
 *                 .hour(0)
 *                 .dayOfWeek(0)
 *                 .delay(0)
 *                 .runImmediately(false)
 *                 .build())
 *             .queryLists(            
 *                 AlertQueryListArgs.builder()
 *                     .store(&#34;tf-test-logstore&#34;)
 *                     .storeType(&#34;log&#34;)
 *                     .project(exampleProject.name())
 *                     .region(&#34;cn-heyuan&#34;)
 *                     .chartTitle(&#34;chart_title&#34;)
 *                     .start(&#34;-60s&#34;)
 *                     .end(&#34;20s&#34;)
 *                     .query(&#34;* AND aliyun | select count(1) as cnt&#34;)
 *                     .powerSqlMode(&#34;auto&#34;)
 *                     .build(),
 *                 AlertQueryListArgs.builder()
 *                     .store(&#34;tf-test-logstore&#34;)
 *                     .storeType(&#34;log&#34;)
 *                     .project(exampleProject.name())
 *                     .region(&#34;cn-heyuan&#34;)
 *                     .chartTitle(&#34;chart_title&#34;)
 *                     .start(&#34;-60s&#34;)
 *                     .end(&#34;20s&#34;)
 *                     .query(&#34;error | select count(1) as error_cnt&#34;)
 *                     .powerSqlMode(&#34;enable&#34;)
 *                     .build())
 *             .labels(AlertLabelArgs.builder()
 *                 .key(&#34;env&#34;)
 *                 .value(&#34;test&#34;)
 *                 .build())
 *             .annotations(            
 *                 AlertAnnotationArgs.builder()
 *                     .key(&#34;title&#34;)
 *                     .value(&#34;alert title&#34;)
 *                     .build(),
 *                 AlertAnnotationArgs.builder()
 *                     .key(&#34;desc&#34;)
 *                     .value(&#34;alert desc&#34;)
 *                     .build(),
 *                 AlertAnnotationArgs.builder()
 *                     .key(&#34;test_key&#34;)
 *                     .value(&#34;test value&#34;)
 *                     .build())
 *             .groupConfiguration(AlertGroupConfigurationArgs.builder()
 *                 .type(&#34;custom&#34;)
 *                 .fields(&#34;cnt&#34;)
 *                 .build())
 *             .policyConfiguration(AlertPolicyConfigurationArgs.builder()
 *                 .alertPolicyId(&#34;sls.bultin&#34;)
 *                 .actionPolicyId(&#34;sls_test_action&#34;)
 *                 .repeatInterval(&#34;4h&#34;)
 *                 .build())
 *             .severityConfigurations(            
 *                 AlertSeverityConfigurationArgs.builder()
 *                     .severity(8)
 *                     .evalCondition(Map.ofEntries(
 *                         Map.entry(&#34;condition&#34;, &#34;cnt &gt; 3&#34;),
 *                         Map.entry(&#34;count_condition&#34;, &#34;__count__ &gt; 3&#34;)
 *                     ))
 *                     .build(),
 *                 AlertSeverityConfigurationArgs.builder()
 *                     .severity(6)
 *                     .evalCondition(Map.ofEntries(
 *                         Map.entry(&#34;condition&#34;, &#34;&#34;),
 *                         Map.entry(&#34;count_condition&#34;, &#34;__count__ &gt; 0&#34;)
 *                     ))
 *                     .build(),
 *                 AlertSeverityConfigurationArgs.builder()
 *                     .severity(2)
 *                     .evalCondition(Map.ofEntries(
 *                         Map.entry(&#34;condition&#34;, &#34;&#34;),
 *                         Map.entry(&#34;count_condition&#34;, &#34;&#34;)
 *                     ))
 *                     .build())
 *             .joinConfigurations(AlertJoinConfigurationArgs.builder()
 *                 .type(&#34;cross_join&#34;)
 *                 .condition(&#34;&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Log alert can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:log/alert:Alert example tf-log:tf-log-alert
 * ```
 * 
 */
@ResourceType(type="alicloud:log/alert:Alert")
public class Alert extends com.pulumi.resources.CustomResource {
    /**
     * Alert description.
     * 
     */
    @Export(name="alertDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> alertDescription;

    /**
     * @return Alert description.
     * 
     */
    public Output<Optional<String>> alertDescription() {
        return Codegen.optional(this.alertDescription);
    }
    /**
     * Alert displayname.
     * 
     */
    @Export(name="alertDisplayname", type=String.class, parameters={})
    private Output<String> alertDisplayname;

    /**
     * @return Alert displayname.
     * 
     */
    public Output<String> alertDisplayname() {
        return this.alertDisplayname;
    }
    /**
     * Name of logstore for configuring alarm service.
     * 
     */
    @Export(name="alertName", type=String.class, parameters={})
    private Output<String> alertName;

    /**
     * @return Name of logstore for configuring alarm service.
     * 
     */
    public Output<String> alertName() {
        return this.alertName;
    }
    /**
     * Annotations for new alert.
     * 
     */
    @Export(name="annotations", type=List.class, parameters={AlertAnnotation.class})
    private Output</* @Nullable */ List<AlertAnnotation>> annotations;

    /**
     * @return Annotations for new alert.
     * 
     */
    public Output<Optional<List<AlertAnnotation>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * whether to add automatic annotation, default is false.
     * 
     */
    @Export(name="autoAnnotation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoAnnotation;

    /**
     * @return whether to add automatic annotation, default is false.
     * 
     */
    public Output<Optional<Boolean>> autoAnnotation() {
        return Codegen.optional(this.autoAnnotation);
    }
    /**
     * Join condition.
     * 
     * @deprecated
     * Deprecated from 1.161.0+, use eval_condition in severity_configurations
     * 
     */
    @Deprecated /* Deprecated from 1.161.0+, use eval_condition in severity_configurations */
    @Export(name="condition", type=String.class, parameters={})
    private Output</* @Nullable */ String> condition;

    /**
     * @return Join condition.
     * 
     */
    public Output<Optional<String>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * @deprecated
     * Deprecated from 1.161.0+, use dashboardId in query_list
     * 
     */
    @Deprecated /* Deprecated from 1.161.0+, use dashboardId in query_list */
    @Export(name="dashboard", type=String.class, parameters={})
    private Output</* @Nullable */ String> dashboard;

    public Output<Optional<String>> dashboard() {
        return Codegen.optional(this.dashboard);
    }
    /**
     * Group configuration for new alert.
     * 
     */
    @Export(name="groupConfiguration", type=AlertGroupConfiguration.class, parameters={})
    private Output</* @Nullable */ AlertGroupConfiguration> groupConfiguration;

    /**
     * @return Group configuration for new alert.
     * 
     */
    public Output<Optional<AlertGroupConfiguration>> groupConfiguration() {
        return Codegen.optional(this.groupConfiguration);
    }
    /**
     * Join configuration for different queries.
     * 
     */
    @Export(name="joinConfigurations", type=List.class, parameters={AlertJoinConfiguration.class})
    private Output</* @Nullable */ List<AlertJoinConfiguration>> joinConfigurations;

    /**
     * @return Join configuration for different queries.
     * 
     */
    public Output<Optional<List<AlertJoinConfiguration>>> joinConfigurations() {
        return Codegen.optional(this.joinConfigurations);
    }
    /**
     * Labels for new alert.
     * 
     */
    @Export(name="labels", type=List.class, parameters={AlertLabel.class})
    private Output</* @Nullable */ List<AlertLabel>> labels;

    /**
     * @return Labels for new alert.
     * 
     */
    public Output<Optional<List<AlertLabel>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Timestamp, notifications before closing again.
     * 
     */
    @Export(name="muteUntil", type=Integer.class, parameters={})
    private Output<Integer> muteUntil;

    /**
     * @return Timestamp, notifications before closing again.
     * 
     */
    public Output<Integer> muteUntil() {
        return this.muteUntil;
    }
    /**
     * Switch for whether new alert fires when no data happens, default is false.
     * 
     */
    @Export(name="noDataFire", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> noDataFire;

    /**
     * @return Switch for whether new alert fires when no data happens, default is false.
     * 
     */
    public Output<Optional<Boolean>> noDataFire() {
        return Codegen.optional(this.noDataFire);
    }
    /**
     * when no data happens, the severity of new alert.
     * 
     */
    @Export(name="noDataSeverity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> noDataSeverity;

    /**
     * @return when no data happens, the severity of new alert.
     * 
     */
    public Output<Optional<Integer>> noDataSeverity() {
        return Codegen.optional(this.noDataSeverity);
    }
    /**
     * Alarm information notification list, Deprecated from 1.161.0+.
     * 
     * @deprecated
     * Deprecated from 1.161.0+, use policy_configuration for notification
     * 
     */
    @Deprecated /* Deprecated from 1.161.0+, use policy_configuration for notification */
    @Export(name="notificationLists", type=List.class, parameters={AlertNotificationList.class})
    private Output</* @Nullable */ List<AlertNotificationList>> notificationLists;

    /**
     * @return Alarm information notification list, Deprecated from 1.161.0+.
     * 
     */
    public Output<Optional<List<AlertNotificationList>>> notificationLists() {
        return Codegen.optional(this.notificationLists);
    }
    /**
     * Notification threshold, which is not notified until the number of triggers is reached. The default is 1, Deprecated from 1.161.0+.
     * 
     * @deprecated
     * Deprecated from 1.161.0+, use threshold
     * 
     */
    @Deprecated /* Deprecated from 1.161.0+, use threshold */
    @Export(name="notifyThreshold", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> notifyThreshold;

    /**
     * @return Notification threshold, which is not notified until the number of triggers is reached. The default is 1, Deprecated from 1.161.0+.
     * 
     */
    public Output<Optional<Integer>> notifyThreshold() {
        return Codegen.optional(this.notifyThreshold);
    }
    /**
     * Policy configuration for new alert.
     * 
     */
    @Export(name="policyConfiguration", type=AlertPolicyConfiguration.class, parameters={})
    private Output</* @Nullable */ AlertPolicyConfiguration> policyConfiguration;

    /**
     * @return Policy configuration for new alert.
     * 
     */
    public Output<Optional<AlertPolicyConfiguration>> policyConfiguration() {
        return Codegen.optional(this.policyConfiguration);
    }
    /**
     * The project name.
     * 
     */
    @Export(name="projectName", type=String.class, parameters={})
    private Output<String> projectName;

    /**
     * @return The project name.
     * 
     */
    public Output<String> projectName() {
        return this.projectName;
    }
    /**
     * Multiple conditions for configured alarm query.
     * 
     */
    @Export(name="queryLists", type=List.class, parameters={AlertQueryList.class})
    private Output<List<AlertQueryList>> queryLists;

    /**
     * @return Multiple conditions for configured alarm query.
     * 
     */
    public Output<List<AlertQueryList>> queryLists() {
        return this.queryLists;
    }
    /**
     * schedule for alert.
     * 
     */
    @Export(name="schedule", type=AlertSchedule.class, parameters={})
    private Output</* @Nullable */ AlertSchedule> schedule;

    /**
     * @return schedule for alert.
     * 
     */
    public Output<Optional<AlertSchedule>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * Execution interval. 60 seconds minimum, such as 60s, 1h. Deprecated from 1.176.0+. use interval in schedule.
     * 
     * @deprecated
     * Field &#39;schedule_interval&#39; has been deprecated from provider version 1.176.0. New field &#39;schedule&#39; instead.
     * 
     */
    @Deprecated /* Field 'schedule_interval' has been deprecated from provider version 1.176.0. New field 'schedule' instead. */
    @Export(name="scheduleInterval", type=String.class, parameters={})
    private Output<String> scheduleInterval;

    /**
     * @return Execution interval. 60 seconds minimum, such as 60s, 1h. Deprecated from 1.176.0+. use interval in schedule.
     * 
     */
    public Output<String> scheduleInterval() {
        return this.scheduleInterval;
    }
    /**
     * Default FixedRate. No need to configure this parameter. Deprecated from 1.176.0+. use type in schedule.
     * 
     * @deprecated
     * Field &#39;schedule_type&#39; has been deprecated from provider version 1.176.0. New field &#39;schedule&#39; instead.
     * 
     */
    @Deprecated /* Field 'schedule_type' has been deprecated from provider version 1.176.0. New field 'schedule' instead. */
    @Export(name="scheduleType", type=String.class, parameters={})
    private Output<String> scheduleType;

    /**
     * @return Default FixedRate. No need to configure this parameter. Deprecated from 1.176.0+. use type in schedule.
     * 
     */
    public Output<String> scheduleType() {
        return this.scheduleType;
    }
    /**
     * when new alert is resolved, whether to notify, default is false.
     * 
     */
    @Export(name="sendResolved", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sendResolved;

    /**
     * @return when new alert is resolved, whether to notify, default is false.
     * 
     */
    public Output<Optional<Boolean>> sendResolved() {
        return Codegen.optional(this.sendResolved);
    }
    /**
     * Severity configuration for new alert.
     * 
     */
    @Export(name="severityConfigurations", type=List.class, parameters={AlertSeverityConfiguration.class})
    private Output</* @Nullable */ List<AlertSeverityConfiguration>> severityConfigurations;

    /**
     * @return Severity configuration for new alert.
     * 
     */
    public Output<Optional<List<AlertSeverityConfiguration>>> severityConfigurations() {
        return Codegen.optional(this.severityConfigurations);
    }
    /**
     * Evaluation threshold, alert will not fire until the number of triggers is reached. The default is 1.
     * 
     */
    @Export(name="threshold", type=Integer.class, parameters={})
    private Output<Integer> threshold;

    /**
     * @return Evaluation threshold, alert will not fire until the number of triggers is reached. The default is 1.
     * 
     */
    public Output<Integer> threshold() {
        return this.threshold;
    }
    /**
     * Notification interval, default is no interval. Support number + unit type, for example 60s, 1h, Deprecated from 1.161.0+.
     * 
     * @deprecated
     * Deprecated from 1.161.0+, use repeat_interval in policy_configuration
     * 
     */
    @Deprecated /* Deprecated from 1.161.0+, use repeat_interval in policy_configuration */
    @Export(name="throttling", type=String.class, parameters={})
    private Output</* @Nullable */ String> throttling;

    /**
     * @return Notification interval, default is no interval. Support number + unit type, for example 60s, 1h, Deprecated from 1.161.0+.
     * 
     */
    public Output<Optional<String>> throttling() {
        return Codegen.optional(this.throttling);
    }
    /**
     * including FixedRate,Hourly,Daily,Weekly,Cron.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return including FixedRate,Hourly,Daily,Weekly,Cron.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * The version of alert, new alert is 2.0.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return The version of alert, new alert is 2.0.
     * 
     */
    public Output<Optional<String>> version() {
        return Codegen.optional(this.version);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Alert(String name) {
        this(name, AlertArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Alert(String name, AlertArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alert(String name, AlertArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:log/alert:Alert", name, args == null ? AlertArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Alert(String name, Output<String> id, @Nullable AlertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:log/alert:Alert", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Alert get(String name, Output<String> id, @Nullable AlertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Alert(name, id, state, options);
    }
}
