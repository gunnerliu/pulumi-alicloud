// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cms.EventRuleArgs;
import com.pulumi.alicloud.cms.inputs.EventRuleState;
import com.pulumi.alicloud.cms.outputs.EventRuleContactParameter;
import com.pulumi.alicloud.cms.outputs.EventRuleEventPattern;
import com.pulumi.alicloud.cms.outputs.EventRuleFcParameter;
import com.pulumi.alicloud.cms.outputs.EventRuleMnsParameter;
import com.pulumi.alicloud.cms.outputs.EventRuleOpenApiParameter;
import com.pulumi.alicloud.cms.outputs.EventRuleSlsParameter;
import com.pulumi.alicloud.cms.outputs.EventRuleWebhookParameter;
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
 * Provides a Cloud Monitor Service Event Rule resource.
 * 
 * For information about Cloud Monitor Service Event Rule and how to use it, see [What is Event Rule](https://www.alibabacloud.com/help/en/cloudmonitor/latest/puteventrule).
 * 
 * &gt; **NOTE:** Available since v1.182.0.
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
 * import com.pulumi.alicloud.cms.MonitorGroup;
 * import com.pulumi.alicloud.cms.MonitorGroupArgs;
 * import com.pulumi.alicloud.cms.EventRule;
 * import com.pulumi.alicloud.cms.EventRuleArgs;
 * import com.pulumi.alicloud.cms.inputs.EventRuleEventPatternArgs;
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
 *         var default_ = new MonitorGroup(&#34;default&#34;, MonitorGroupArgs.builder()        
 *             .monitorGroupName(name)
 *             .build());
 * 
 *         var example = new EventRule(&#34;example&#34;, EventRuleArgs.builder()        
 *             .ruleName(name)
 *             .groupId(default_.id())
 *             .silenceTime(100)
 *             .description(name)
 *             .status(&#34;ENABLED&#34;)
 *             .eventPattern(EventRuleEventPatternArgs.builder()
 *                 .product(&#34;ecs&#34;)
 *                 .sqlFilter(&#34;example_value&#34;)
 *                 .nameLists(&#34;example_value&#34;)
 *                 .levelLists(&#34;CRITICAL&#34;)
 *                 .eventTypeLists(&#34;StatusNotification&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud Monitor Service Event Rule can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cms/eventRule:EventRule example &lt;rule_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cms/eventRule:EventRule")
public class EventRule extends com.pulumi.resources.CustomResource {
    /**
     * The information about the alert contact groups that receive alert notifications. See `contact_parameters` below.
     * 
     */
    @Export(name="contactParameters", refs={List.class,EventRuleContactParameter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<EventRuleContactParameter>> contactParameters;

    /**
     * @return The information about the alert contact groups that receive alert notifications. See `contact_parameters` below.
     * 
     */
    public Output<Optional<List<EventRuleContactParameter>>> contactParameters() {
        return Codegen.optional(this.contactParameters);
    }
    /**
     * The description of the event-triggered alert rule.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the event-triggered alert rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Event mode, used to describe the trigger conditions for this event. See `event_pattern` below.
     * 
     */
    @Export(name="eventPattern", refs={EventRuleEventPattern.class}, tree="[0]")
    private Output<EventRuleEventPattern> eventPattern;

    /**
     * @return Event mode, used to describe the trigger conditions for this event. See `event_pattern` below.
     * 
     */
    public Output<EventRuleEventPattern> eventPattern() {
        return this.eventPattern;
    }
    /**
     * The information about the recipients in Function Compute. See `fc_parameters` below.
     * 
     */
    @Export(name="fcParameters", refs={List.class,EventRuleFcParameter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<EventRuleFcParameter>> fcParameters;

    /**
     * @return The information about the recipients in Function Compute. See `fc_parameters` below.
     * 
     */
    public Output<Optional<List<EventRuleFcParameter>>> fcParameters() {
        return Codegen.optional(this.fcParameters);
    }
    /**
     * The ID of the application group to which the event-triggered alert rule belongs.
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> groupId;

    /**
     * @return The ID of the application group to which the event-triggered alert rule belongs.
     * 
     */
    public Output<Optional<String>> groupId() {
        return Codegen.optional(this.groupId);
    }
    /**
     * The information about the recipients in Message Service (MNS). See `mns_parameters` below.
     * 
     */
    @Export(name="mnsParameters", refs={List.class,EventRuleMnsParameter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<EventRuleMnsParameter>> mnsParameters;

    /**
     * @return The information about the recipients in Message Service (MNS). See `mns_parameters` below.
     * 
     */
    public Output<Optional<List<EventRuleMnsParameter>>> mnsParameters() {
        return Codegen.optional(this.mnsParameters);
    }
    /**
     * The parameters of API callback notification. See `open_api_parameters` below.
     * 
     */
    @Export(name="openApiParameters", refs={List.class,EventRuleOpenApiParameter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<EventRuleOpenApiParameter>> openApiParameters;

    /**
     * @return The parameters of API callback notification. See `open_api_parameters` below.
     * 
     */
    public Output<Optional<List<EventRuleOpenApiParameter>>> openApiParameters() {
        return Codegen.optional(this.openApiParameters);
    }
    /**
     * The name of the event-triggered alert rule.
     * 
     */
    @Export(name="ruleName", refs={String.class}, tree="[0]")
    private Output<String> ruleName;

    /**
     * @return The name of the event-triggered alert rule.
     * 
     */
    public Output<String> ruleName() {
        return this.ruleName;
    }
    /**
     * The silence time.
     * 
     */
    @Export(name="silenceTime", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> silenceTime;

    /**
     * @return The silence time.
     * 
     */
    public Output<Optional<Integer>> silenceTime() {
        return Codegen.optional(this.silenceTime);
    }
    /**
     * The information about the recipients in Simple Log Service. See `sls_parameters` below.
     * 
     */
    @Export(name="slsParameters", refs={List.class,EventRuleSlsParameter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<EventRuleSlsParameter>> slsParameters;

    /**
     * @return The information about the recipients in Simple Log Service. See `sls_parameters` below.
     * 
     */
    public Output<Optional<List<EventRuleSlsParameter>>> slsParameters() {
        return Codegen.optional(this.slsParameters);
    }
    /**
     * The status of the resource. Valid values: `ENABLED`, `DISABLED`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource. Valid values: `ENABLED`, `DISABLED`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The information about the callback URLs that are used to receive alert notifications. See `webhook_parameters` below.
     * 
     */
    @Export(name="webhookParameters", refs={List.class,EventRuleWebhookParameter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<EventRuleWebhookParameter>> webhookParameters;

    /**
     * @return The information about the callback URLs that are used to receive alert notifications. See `webhook_parameters` below.
     * 
     */
    public Output<Optional<List<EventRuleWebhookParameter>>> webhookParameters() {
        return Codegen.optional(this.webhookParameters);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventRule(String name) {
        this(name, EventRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventRule(String name, EventRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventRule(String name, EventRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/eventRule:EventRule", name, args == null ? EventRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventRule(String name, Output<String> id, @Nullable EventRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/eventRule:EventRule", name, state, makeResourceOptions(options, id));
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
    public static EventRule get(String name, Output<String> id, @Nullable EventRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventRule(name, id, state, options);
    }
}
