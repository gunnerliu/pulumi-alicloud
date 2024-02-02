// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cms.AlarmArgs;
import com.pulumi.alicloud.cms.inputs.AlarmState;
import com.pulumi.alicloud.cms.outputs.AlarmEscalationsCritical;
import com.pulumi.alicloud.cms.outputs.AlarmEscalationsInfo;
import com.pulumi.alicloud.cms.outputs.AlarmEscalationsWarn;
import com.pulumi.alicloud.cms.outputs.AlarmPrometheus;
import com.pulumi.alicloud.cms.outputs.AlarmTarget;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Monitor Service Alarm resource.
 * 
 * For information about Cloud Monitor Service Alarm and how to use it, see [What is Alarm](https://www.alibabacloud.com/help/en/cloudmonitor/latest/putresourcemetricrule).
 * 
 * &gt; **NOTE:** Available since v1.9.1.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.ecs.EcsFunctions;
 * import com.pulumi.alicloud.ecs.inputs.GetInstanceTypesArgs;
 * import com.pulumi.alicloud.ecs.inputs.GetImagesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ecs.Instance;
 * import com.pulumi.alicloud.ecs.InstanceArgs;
 * import com.pulumi.alicloud.cms.AlarmContactGroup;
 * import com.pulumi.alicloud.cms.AlarmContactGroupArgs;
 * import com.pulumi.alicloud.cms.Alarm;
 * import com.pulumi.alicloud.cms.AlarmArgs;
 * import com.pulumi.alicloud.cms.inputs.AlarmEscalationsCriticalArgs;
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
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;Instance&#34;)
 *             .build());
 * 
 *         final var defaultInstanceTypes = EcsFunctions.getInstanceTypes(GetInstanceTypesArgs.builder()
 *             .availabilityZone(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .cpuCoreCount(1)
 *             .memorySize(2)
 *             .build());
 * 
 *         final var defaultImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .nameRegex(&#34;^ubuntu_[0-9]+_[0-9]+_x64*&#34;)
 *             .owners(&#34;system&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;10.4.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vswitchName(name)
 *             .cidrBlock(&#34;10.4.0.0/24&#34;)
 *             .vpcId(defaultNetwork.id())
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup(&#34;defaultSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .availabilityZone(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .instanceName(name)
 *             .imageId(defaultImages.applyValue(getImagesResult -&gt; getImagesResult.images()[0].id()))
 *             .instanceType(defaultInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.instanceTypes()[0].id()))
 *             .securityGroups(defaultSecurityGroup.id())
 *             .vswitchId(defaultSwitch.id())
 *             .build());
 * 
 *         var defaultAlarmContactGroup = new AlarmContactGroup(&#34;defaultAlarmContactGroup&#34;, AlarmContactGroupArgs.builder()        
 *             .alarmContactGroupName(name)
 *             .build());
 * 
 *         var defaultAlarm = new Alarm(&#34;defaultAlarm&#34;, AlarmArgs.builder()        
 *             .project(&#34;acs_ecs_dashboard&#34;)
 *             .metric(&#34;disk_writebytes&#34;)
 *             .period(900)
 *             .contactGroups(defaultAlarmContactGroup.alarmContactGroupName())
 *             .effectiveInterval(&#34;06:00-20:00&#34;)
 *             .metricDimensions(defaultInstance.id().applyValue(id -&gt; &#34;&#34;&#34;
 *   [
 *     {
 *       &#34;instanceId&#34;: &#34;%s&#34;,
 *       &#34;device&#34;: &#34;/dev/vda1&#34;
 *     }
 *   ]
 * &#34;, id)))
 *             .escalationsCritical(AlarmEscalationsCriticalArgs.builder()
 *                 .statistics(&#34;Average&#34;)
 *                 .comparisonOperator(&#34;&lt;=&#34;)
 *                 .threshold(35)
 *                 .times(2)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud Monitor Service Alarm can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cms/alarm:Alarm example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cms/alarm:Alarm")
public class Alarm extends com.pulumi.resources.CustomResource {
    /**
     * List contact groups of the alarm rule, which must have been created on the console.
     * 
     */
    @Export(name="contactGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> contactGroups;

    /**
     * @return List contact groups of the alarm rule, which must have been created on the console.
     * 
     */
    public Output<List<String>> contactGroups() {
        return this.contactGroups;
    }
    /**
     * Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead.
     * 
     * @deprecated
     * Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead.
     * 
     */
    @Deprecated /* Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead. */
    @Export(name="dimensions", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> dimensions;

    /**
     * @return Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead.
     * 
     */
    public Output<Map<String,Object>> dimensions() {
        return this.dimensions;
    }
    /**
     * The interval of effecting alarm rule. It format as &#34;hh:mm-hh:mm&#34;, like &#34;0:00-4:00&#34;. Default to &#34;00:00-23:59&#34;.
     * 
     */
    @Export(name="effectiveInterval", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> effectiveInterval;

    /**
     * @return The interval of effecting alarm rule. It format as &#34;hh:mm-hh:mm&#34;, like &#34;0:00-4:00&#34;. Default to &#34;00:00-23:59&#34;.
     * 
     */
    public Output<Optional<String>> effectiveInterval() {
        return Codegen.optional(this.effectiveInterval);
    }
    /**
     * Whether to enable alarm rule. Default value: `true`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether to enable alarm rule. Default value: `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
     * 
     * @deprecated
     * Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
     * 
     */
    @Deprecated /* Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead. */
    @Export(name="endTime", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> endTime;

    /**
     * @return Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
     * 
     */
    public Output<Optional<Integer>> endTime() {
        return Codegen.optional(this.endTime);
    }
    /**
     * A configuration of critical alarm. See `escalations_critical` below.
     * 
     */
    @Export(name="escalationsCritical", refs={AlarmEscalationsCritical.class}, tree="[0]")
    private Output<AlarmEscalationsCritical> escalationsCritical;

    /**
     * @return A configuration of critical alarm. See `escalations_critical` below.
     * 
     */
    public Output<AlarmEscalationsCritical> escalationsCritical() {
        return this.escalationsCritical;
    }
    /**
     * A configuration of critical info. See `escalations_info` below.
     * 
     */
    @Export(name="escalationsInfo", refs={AlarmEscalationsInfo.class}, tree="[0]")
    private Output<AlarmEscalationsInfo> escalationsInfo;

    /**
     * @return A configuration of critical info. See `escalations_info` below.
     * 
     */
    public Output<AlarmEscalationsInfo> escalationsInfo() {
        return this.escalationsInfo;
    }
    /**
     * A configuration of critical warn. See `escalations_warn` below.
     * 
     */
    @Export(name="escalationsWarn", refs={AlarmEscalationsWarn.class}, tree="[0]")
    private Output<AlarmEscalationsWarn> escalationsWarn;

    /**
     * @return A configuration of critical warn. See `escalations_warn` below.
     * 
     */
    public Output<AlarmEscalationsWarn> escalationsWarn() {
        return this.escalationsWarn;
    }
    /**
     * The name of the metric, such as `CPUUtilization` and `networkin_rate`. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     * 
     */
    @Export(name="metric", refs={String.class}, tree="[0]")
    private Output<String> metric;

    /**
     * @return The name of the metric, such as `CPUUtilization` and `networkin_rate`. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     * 
     */
    public Output<String> metric() {
        return this.metric;
    }
    /**
     * Map of the resources associated with the alarm rule, such as &#34;instanceId&#34;, &#34;device&#34; and &#34;port&#34;. Each key&#39;s value is a string, and it uses comma to split multiple items. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     * 
     */
    @Export(name="metricDimensions", refs={String.class}, tree="[0]")
    private Output<String> metricDimensions;

    /**
     * @return Map of the resources associated with the alarm rule, such as &#34;instanceId&#34;, &#34;device&#34; and &#34;port&#34;. Each key&#39;s value is a string, and it uses comma to split multiple items. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     * 
     */
    public Output<String> metricDimensions() {
        return this.metricDimensions;
    }
    /**
     * The name of the alert rule.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the alert rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Index query cycle, which must be consistent with that defined for metrics. Default to 300, in seconds.
     * 
     */
    @Export(name="period", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> period;

    /**
     * @return Index query cycle, which must be consistent with that defined for metrics. Default to 300, in seconds.
     * 
     */
    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * The namespace of the cloud service, such as `acs_ecs_dashboard` and `acs_rds_dashboard`. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     * **NOTE:** The `dimensions` and `metric_dimensions` must be empty when `project` is `acs_prometheus`, otherwise, one of them must be set.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The namespace of the cloud service, such as `acs_ecs_dashboard` and `acs_rds_dashboard`. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     * **NOTE:** The `dimensions` and `metric_dimensions` must be empty when `project` is `acs_prometheus`, otherwise, one of them must be set.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The Prometheus alert rule. See `prometheus` below. **Note:** This parameter is required only when you create a Prometheus alert rule for Hybrid Cloud Monitoring.
     * 
     */
    @Export(name="prometheuses", refs={List.class,AlarmPrometheus.class}, tree="[0,1]")
    private Output<List<AlarmPrometheus>> prometheuses;

    /**
     * @return The Prometheus alert rule. See `prometheus` below. **Note:** This parameter is required only when you create a Prometheus alert rule for Hybrid Cloud Monitoring.
     * 
     */
    public Output<List<AlarmPrometheus>> prometheuses() {
        return this.prometheuses;
    }
    /**
     * Notification silence period in the alarm state, in seconds. Default value: `86400`. Valid value range: [300, 86400].
     * 
     */
    @Export(name="silenceTime", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> silenceTime;

    /**
     * @return Notification silence period in the alarm state, in seconds. Default value: `86400`. Valid value range: [300, 86400].
     * 
     */
    public Output<Optional<Integer>> silenceTime() {
        return Codegen.optional(this.silenceTime);
    }
    /**
     * Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
     * 
     * @deprecated
     * Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
     * 
     */
    @Deprecated /* Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead. */
    @Export(name="startTime", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> startTime;

    /**
     * @return Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
     * 
     */
    public Output<Optional<Integer>> startTime() {
        return Codegen.optional(this.startTime);
    }
    /**
     * The status of the Alarm.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the Alarm.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The information about the resource for which alerts are triggered. See `targets` below.
     * 
     */
    @Export(name="targets", refs={List.class,AlarmTarget.class}, tree="[0,1]")
    private Output<List<AlarmTarget>> targets;

    /**
     * @return The information about the resource for which alerts are triggered. See `targets` below.
     * 
     */
    public Output<List<AlarmTarget>> targets() {
        return this.targets;
    }
    /**
     * The webhook that should be called when the alarm is triggered. Currently, only http protocol is supported. Default is empty string.
     * 
     */
    @Export(name="webhook", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> webhook;

    /**
     * @return The webhook that should be called when the alarm is triggered. Currently, only http protocol is supported. Default is empty string.
     * 
     */
    public Output<Optional<String>> webhook() {
        return Codegen.optional(this.webhook);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Alarm(String name) {
        this(name, AlarmArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Alarm(String name, AlarmArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alarm(String name, AlarmArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/alarm:Alarm", name, args == null ? AlarmArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Alarm(String name, Output<String> id, @Nullable AlarmState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/alarm:Alarm", name, state, makeResourceOptions(options, id));
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
    public static Alarm get(String name, Output<String> id, @Nullable AlarmState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Alarm(name, id, state, options);
    }
}
