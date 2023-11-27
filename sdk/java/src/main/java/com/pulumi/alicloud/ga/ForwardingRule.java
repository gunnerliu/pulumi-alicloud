// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ga.ForwardingRuleArgs;
import com.pulumi.alicloud.ga.inputs.ForwardingRuleState;
import com.pulumi.alicloud.ga.outputs.ForwardingRuleRuleAction;
import com.pulumi.alicloud.ga.outputs.ForwardingRuleRuleCondition;
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
 * Provides a Global Accelerator (GA) Forwarding Rule resource.
 * 
 * For information about Global Accelerator (GA) Forwarding Rule and how to use it, see [What is Forwarding Rule](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createforwardingrules).
 * 
 * &gt; **NOTE:** Available since v1.120.0.
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
 * import com.pulumi.alicloud.inputs.GetRegionsArgs;
 * import com.pulumi.alicloud.ga.Accelerator;
 * import com.pulumi.alicloud.ga.AcceleratorArgs;
 * import com.pulumi.alicloud.ga.BandwidthPackage;
 * import com.pulumi.alicloud.ga.BandwidthPackageArgs;
 * import com.pulumi.alicloud.ga.BandwidthPackageAttachment;
 * import com.pulumi.alicloud.ga.BandwidthPackageAttachmentArgs;
 * import com.pulumi.alicloud.ga.Listener;
 * import com.pulumi.alicloud.ga.ListenerArgs;
 * import com.pulumi.alicloud.ga.inputs.ListenerPortRangeArgs;
 * import com.pulumi.alicloud.ecs.EipAddress;
 * import com.pulumi.alicloud.ecs.EipAddressArgs;
 * import com.pulumi.alicloud.ga.EndpointGroup;
 * import com.pulumi.alicloud.ga.EndpointGroupArgs;
 * import com.pulumi.alicloud.ga.inputs.EndpointGroupEndpointConfigurationArgs;
 * import com.pulumi.alicloud.ga.inputs.EndpointGroupPortOverridesArgs;
 * import com.pulumi.alicloud.ga.ForwardingRule;
 * import com.pulumi.alicloud.ga.ForwardingRuleArgs;
 * import com.pulumi.alicloud.ga.inputs.ForwardingRuleRuleConditionArgs;
 * import com.pulumi.alicloud.ga.inputs.ForwardingRuleRuleConditionPathConfigArgs;
 * import com.pulumi.alicloud.ga.inputs.ForwardingRuleRuleActionArgs;
 * import com.pulumi.alicloud.ga.inputs.ForwardingRuleRuleActionForwardGroupConfigArgs;
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
 *         final var region = config.get(&#34;region&#34;).orElse(&#34;cn-hangzhou&#34;);
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-example&#34;);
 *         final var default = AlicloudFunctions.getRegions(GetRegionsArgs.builder()
 *             .current(true)
 *             .build());
 * 
 *         var exampleAccelerator = new Accelerator(&#34;exampleAccelerator&#34;, AcceleratorArgs.builder()        
 *             .duration(3)
 *             .spec(&#34;2&#34;)
 *             .acceleratorName(name)
 *             .autoUseCoupon(false)
 *             .description(name)
 *             .autoRenewDuration(&#34;2&#34;)
 *             .renewalStatus(&#34;AutoRenewal&#34;)
 *             .build());
 * 
 *         var exampleBandwidthPackage = new BandwidthPackage(&#34;exampleBandwidthPackage&#34;, BandwidthPackageArgs.builder()        
 *             .type(&#34;Basic&#34;)
 *             .bandwidth(20)
 *             .bandwidthType(&#34;Basic&#34;)
 *             .duration(1)
 *             .autoPay(true)
 *             .paymentType(&#34;Subscription&#34;)
 *             .autoUseCoupon(false)
 *             .bandwidthPackageName(name)
 *             .description(name)
 *             .build());
 * 
 *         var exampleBandwidthPackageAttachment = new BandwidthPackageAttachment(&#34;exampleBandwidthPackageAttachment&#34;, BandwidthPackageAttachmentArgs.builder()        
 *             .acceleratorId(exampleAccelerator.id())
 *             .bandwidthPackageId(exampleBandwidthPackage.id())
 *             .build());
 * 
 *         var exampleListener = new Listener(&#34;exampleListener&#34;, ListenerArgs.builder()        
 *             .acceleratorId(exampleBandwidthPackageAttachment.acceleratorId())
 *             .clientAffinity(&#34;SOURCE_IP&#34;)
 *             .description(name)
 *             .protocol(&#34;HTTP&#34;)
 *             .proxyProtocol(true)
 *             .portRanges(ListenerPortRangeArgs.builder()
 *                 .fromPort(60)
 *                 .toPort(60)
 *                 .build())
 *             .build());
 * 
 *         var exampleEipAddress = new EipAddress(&#34;exampleEipAddress&#34;, EipAddressArgs.builder()        
 *             .bandwidth(&#34;10&#34;)
 *             .internetChargeType(&#34;PayByBandwidth&#34;)
 *             .build());
 * 
 *         var virtual = new EndpointGroup(&#34;virtual&#34;, EndpointGroupArgs.builder()        
 *             .acceleratorId(exampleAccelerator.id())
 *             .endpointConfigurations(EndpointGroupEndpointConfigurationArgs.builder()
 *                 .endpoint(exampleEipAddress.ipAddress())
 *                 .type(&#34;PublicIp&#34;)
 *                 .weight(&#34;20&#34;)
 *                 .enableClientipPreservation(true)
 *                 .build())
 *             .endpointGroupRegion(default_.regions()[0].id())
 *             .listenerId(exampleListener.id())
 *             .description(name)
 *             .endpointGroupType(&#34;virtual&#34;)
 *             .endpointRequestProtocol(&#34;HTTPS&#34;)
 *             .healthCheckIntervalSeconds(4)
 *             .healthCheckPath(&#34;/path&#34;)
 *             .thresholdCount(4)
 *             .trafficPercentage(20)
 *             .portOverrides(EndpointGroupPortOverridesArgs.builder()
 *                 .endpointPort(80)
 *                 .listenerPort(60)
 *                 .build())
 *             .build());
 * 
 *         var exampleForwardingRule = new ForwardingRule(&#34;exampleForwardingRule&#34;, ForwardingRuleArgs.builder()        
 *             .acceleratorId(exampleAccelerator.id())
 *             .listenerId(exampleListener.id())
 *             .ruleConditions(            
 *                 ForwardingRuleRuleConditionArgs.builder()
 *                     .ruleConditionType(&#34;Path&#34;)
 *                     .pathConfig(ForwardingRuleRuleConditionPathConfigArgs.builder()
 *                         .values(&#34;/testpathconfig&#34;)
 *                         .build())
 *                     .build(),
 *                 ForwardingRuleRuleConditionArgs.builder()
 *                     .ruleConditionType(&#34;Host&#34;)
 *                     .hostConfigs(ForwardingRuleRuleConditionHostConfigArgs.builder()
 *                         .values(&#34;www.test.com&#34;)
 *                         .build())
 *                     .build())
 *             .ruleActions(ForwardingRuleRuleActionArgs.builder()
 *                 .order(&#34;40&#34;)
 *                 .ruleActionType(&#34;ForwardGroup&#34;)
 *                 .forwardGroupConfig(ForwardingRuleRuleActionForwardGroupConfigArgs.builder()
 *                     .serverGroupTuples(ForwardingRuleRuleActionForwardGroupConfigServerGroupTupleArgs.builder()
 *                         .endpointGroupId(virtual.id())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .priority(2)
 *             .forwardingRuleName(name)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Ga Forwarding Rule can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ga/forwardingRule:ForwardingRule example &lt;accelerator_id&gt;:&lt;listener_id&gt;:&lt;forwarding_rule_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ga/forwardingRule:ForwardingRule")
public class ForwardingRule extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Global Accelerator instance.
     * 
     */
    @Export(name="acceleratorId", refs={String.class}, tree="[0]")
    private Output<String> acceleratorId;

    /**
     * @return The ID of the Global Accelerator instance.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }
    /**
     * Forwarding Policy ID.
     * 
     */
    @Export(name="forwardingRuleId", refs={String.class}, tree="[0]")
    private Output<String> forwardingRuleId;

    /**
     * @return Forwarding Policy ID.
     * 
     */
    public Output<String> forwardingRuleId() {
        return this.forwardingRuleId;
    }
    /**
     * Forwarding policy name. The length of the name is 2-128 English or Chinese characters. It must start with uppercase and lowercase letters or Chinese characters. It can contain numbers, half width period (.), underscores (_) And dash (-).
     * 
     */
    @Export(name="forwardingRuleName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> forwardingRuleName;

    /**
     * @return Forwarding policy name. The length of the name is 2-128 English or Chinese characters. It must start with uppercase and lowercase letters or Chinese characters. It can contain numbers, half width period (.), underscores (_) And dash (-).
     * 
     */
    public Output<Optional<String>> forwardingRuleName() {
        return Codegen.optional(this.forwardingRuleName);
    }
    /**
     * Forwarding Policy Status.
     * 
     */
    @Export(name="forwardingRuleStatus", refs={String.class}, tree="[0]")
    private Output<String> forwardingRuleStatus;

    /**
     * @return Forwarding Policy Status.
     * 
     */
    public Output<String> forwardingRuleStatus() {
        return this.forwardingRuleStatus;
    }
    /**
     * The ID of the listener.
     * 
     */
    @Export(name="listenerId", refs={String.class}, tree="[0]")
    private Output<String> listenerId;

    /**
     * @return The ID of the listener.
     * 
     */
    public Output<String> listenerId() {
        return this.listenerId;
    }
    /**
     * Forwarding policy priority.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output<Integer> priority;

    /**
     * @return Forwarding policy priority.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * Forward action. See `rule_actions` below.
     * 
     */
    @Export(name="ruleActions", refs={List.class,ForwardingRuleRuleAction.class}, tree="[0,1]")
    private Output<List<ForwardingRuleRuleAction>> ruleActions;

    /**
     * @return Forward action. See `rule_actions` below.
     * 
     */
    public Output<List<ForwardingRuleRuleAction>> ruleActions() {
        return this.ruleActions;
    }
    /**
     * Forwarding condition list. See `rule_conditions` below.
     * 
     */
    @Export(name="ruleConditions", refs={List.class,ForwardingRuleRuleCondition.class}, tree="[0,1]")
    private Output<List<ForwardingRuleRuleCondition>> ruleConditions;

    /**
     * @return Forwarding condition list. See `rule_conditions` below.
     * 
     */
    public Output<List<ForwardingRuleRuleCondition>> ruleConditions() {
        return this.ruleConditions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ForwardingRule(String name) {
        this(name, ForwardingRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ForwardingRule(String name, ForwardingRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ForwardingRule(String name, ForwardingRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/forwardingRule:ForwardingRule", name, args == null ? ForwardingRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ForwardingRule(String name, Output<String> id, @Nullable ForwardingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/forwardingRule:ForwardingRule", name, state, makeResourceOptions(options, id));
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
    public static ForwardingRule get(String name, Output<String> id, @Nullable ForwardingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ForwardingRule(name, id, state, options);
    }
}
