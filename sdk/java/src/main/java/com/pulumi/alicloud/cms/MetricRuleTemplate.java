// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cms.MetricRuleTemplateArgs;
import com.pulumi.alicloud.cms.inputs.MetricRuleTemplateState;
import com.pulumi.alicloud.cms.outputs.MetricRuleTemplateAlertTemplate;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Monitor Service Metric Rule Template resource.
 * 
 * For information about Cloud Monitor Service Metric Rule Template and how to use it, see [What is Metric Rule Template](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createmetricruletemplate).
 * 
 * &gt; **NOTE:** Available since v1.134.0.
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
 * import com.pulumi.alicloud.cms.MetricRuleTemplate;
 * import com.pulumi.alicloud.cms.MetricRuleTemplateArgs;
 * import com.pulumi.alicloud.cms.inputs.MetricRuleTemplateAlertTemplateArgs;
 * import com.pulumi.alicloud.cms.inputs.MetricRuleTemplateAlertTemplateEscalationsArgs;
 * import com.pulumi.alicloud.cms.inputs.MetricRuleTemplateAlertTemplateEscalationsCriticalArgs;
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
 *         final var config = ctx.config();
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-example&#34;);
 *         var example = new MetricRuleTemplate(&#34;example&#34;, MetricRuleTemplateArgs.builder()        
 *             .metricRuleTemplateName(name)
 *             .alertTemplates(MetricRuleTemplateAlertTemplateArgs.builder()
 *                 .category(&#34;ecs&#34;)
 *                 .metricName(&#34;cpu_total&#34;)
 *                 .namespace(&#34;acs_ecs_dashboard&#34;)
 *                 .ruleName(&#34;tf_example&#34;)
 *                 .escalations(MetricRuleTemplateAlertTemplateEscalationsArgs.builder()
 *                     .critical(MetricRuleTemplateAlertTemplateEscalationsCriticalArgs.builder()
 *                         .comparisonOperator(&#34;GreaterThanThreshold&#34;)
 *                         .statistics(&#34;Average&#34;)
 *                         .threshold(&#34;90&#34;)
 *                         .times(&#34;3&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud Monitor Service Metric Rule Template can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cms/metricRuleTemplate:MetricRuleTemplate example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cms/metricRuleTemplate:MetricRuleTemplate")
public class MetricRuleTemplate extends com.pulumi.resources.CustomResource {
    /**
     * The details of alert rules that are generated based on the alert template. See `alert_templates` below.
     * 
     */
    @Export(name="alertTemplates", refs={List.class,MetricRuleTemplateAlertTemplate.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MetricRuleTemplateAlertTemplate>> alertTemplates;

    /**
     * @return The details of alert rules that are generated based on the alert template. See `alert_templates` below.
     * 
     */
    public Output<Optional<List<MetricRuleTemplateAlertTemplate>>> alertTemplates() {
        return Codegen.optional(this.alertTemplates);
    }
    /**
     * The mode in which the alert template is applied. Valid values:`GROUP_INSTANCE_FIRST`or `ALARM_TEMPLATE_FIRST`. GROUP_INSTANCE_FIRST: The metrics in the application group take precedence. If a metric specified in the alert template does not exist in the application group, the system does not generate an alert rule for the metric based on the alert template. ALARM_TEMPLATE_FIRST: The metrics specified in the alert template take precedence. If a metric specified in the alert template does not exist in the application group, the system still generates an alert rule for the metric based on the alert template.
     * 
     */
    @Export(name="applyMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> applyMode;

    /**
     * @return The mode in which the alert template is applied. Valid values:`GROUP_INSTANCE_FIRST`or `ALARM_TEMPLATE_FIRST`. GROUP_INSTANCE_FIRST: The metrics in the application group take precedence. If a metric specified in the alert template does not exist in the application group, the system does not generate an alert rule for the metric based on the alert template. ALARM_TEMPLATE_FIRST: The metrics specified in the alert template take precedence. If a metric specified in the alert template does not exist in the application group, the system still generates an alert rule for the metric based on the alert template.
     * 
     */
    public Output<Optional<String>> applyMode() {
        return Codegen.optional(this.applyMode);
    }
    /**
     * The description of the alert template.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the alert template.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The end of the time period during which the alert rule is effective. Valid values: 00 to 23. The value 00 indicates 00:59 and the value 23 indicates 23:59.
     * 
     */
    @Export(name="enableEndTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> enableEndTime;

    /**
     * @return The end of the time period during which the alert rule is effective. Valid values: 00 to 23. The value 00 indicates 00:59 and the value 23 indicates 23:59.
     * 
     */
    public Output<Optional<String>> enableEndTime() {
        return Codegen.optional(this.enableEndTime);
    }
    /**
     * The beginning of the time period during which the alert rule is effective. Valid values: 00 to 23. The value 00 indicates 00:00 and the value 23 indicates 23:00.
     * 
     */
    @Export(name="enableStartTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> enableStartTime;

    /**
     * @return The beginning of the time period during which the alert rule is effective. Valid values: 00 to 23. The value 00 indicates 00:00 and the value 23 indicates 23:00.
     * 
     */
    public Output<Optional<String>> enableStartTime() {
        return Codegen.optional(this.enableStartTime);
    }
    /**
     * The ID of the application group.
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> groupId;

    /**
     * @return The ID of the application group.
     * 
     */
    public Output<Optional<String>> groupId() {
        return Codegen.optional(this.groupId);
    }
    /**
     * The name of the alert template.
     * 
     */
    @Export(name="metricRuleTemplateName", refs={String.class}, tree="[0]")
    private Output<String> metricRuleTemplateName;

    /**
     * @return The name of the alert template.
     * 
     */
    public Output<String> metricRuleTemplateName() {
        return this.metricRuleTemplateName;
    }
    /**
     * The alert notification method. Valid values:Set the value to 4. The value 4 indicates that alert notifications are sent by using TradeManager and DingTalk chatbots.
     * 
     */
    @Export(name="notifyLevel", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> notifyLevel;

    /**
     * @return The alert notification method. Valid values:Set the value to 4. The value 4 indicates that alert notifications are sent by using TradeManager and DingTalk chatbots.
     * 
     */
    public Output<Optional<String>> notifyLevel() {
        return Codegen.optional(this.notifyLevel);
    }
    /**
     * The version of the alert template to be modified.
     * 
     * &gt; **NOTE:** The version changes with the number of times that the alert template is modified.
     * 
     */
    @Export(name="restVersion", refs={String.class}, tree="[0]")
    private Output<String> restVersion;

    /**
     * @return The version of the alert template to be modified.
     * 
     * &gt; **NOTE:** The version changes with the number of times that the alert template is modified.
     * 
     */
    public Output<String> restVersion() {
        return this.restVersion;
    }
    /**
     * The mute period during which notifications are not repeatedly sent for an alert.Valid values: 0 to 86400. Unit: seconds. Default value: `86400`.
     * 
     * &gt; **NOTE:** Only one alert notification is sent during each mute period even if the metric value exceeds the alert threshold several times.
     * 
     */
    @Export(name="silenceTime", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> silenceTime;

    /**
     * @return The mute period during which notifications are not repeatedly sent for an alert.Valid values: 0 to 86400. Unit: seconds. Default value: `86400`.
     * 
     * &gt; **NOTE:** Only one alert notification is sent during each mute period even if the metric value exceeds the alert threshold several times.
     * 
     */
    public Output<Optional<Integer>> silenceTime() {
        return Codegen.optional(this.silenceTime);
    }
    /**
     * The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
     * 
     */
    @Export(name="webhook", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> webhook;

    /**
     * @return The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
     * 
     */
    public Output<Optional<String>> webhook() {
        return Codegen.optional(this.webhook);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MetricRuleTemplate(String name) {
        this(name, MetricRuleTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MetricRuleTemplate(String name, MetricRuleTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetricRuleTemplate(String name, MetricRuleTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/metricRuleTemplate:MetricRuleTemplate", name, args == null ? MetricRuleTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MetricRuleTemplate(String name, Output<String> id, @Nullable MetricRuleTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/metricRuleTemplate:MetricRuleTemplate", name, state, makeResourceOptions(options, id));
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
    public static MetricRuleTemplate get(String name, Output<String> id, @Nullable MetricRuleTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MetricRuleTemplate(name, id, state, options);
    }
}
