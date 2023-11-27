// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ess.NotificationArgs;
import com.pulumi.alicloud.ess.inputs.NotificationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a ESS notification resource. More about Ess notification, see [Autoscaling Notification](https://www.alibabacloud.com/help/doc-detail/71114.htm).
 * 
 * &gt; **NOTE:** Available since v1.55.0.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetRegionsArgs;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ess.ScalingGroup;
 * import com.pulumi.alicloud.ess.ScalingGroupArgs;
 * import com.pulumi.alicloud.mns.Queue;
 * import com.pulumi.alicloud.ess.Notification;
 * import com.pulumi.alicloud.ess.NotificationArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;terraform-example&#34;);
 *         final var defaultRegions = AlicloudFunctions.getRegions(GetRegionsArgs.builder()
 *             .current(true)
 *             .build());
 * 
 *         final var defaultAccount = AlicloudFunctions.getAccount();
 * 
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableDiskCategory(&#34;cloud_efficiency&#34;)
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;172.16.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock(&#34;172.16.0.0/24&#34;)
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .vswitchName(name)
 *             .build());
 * 
 *         var defaultScalingGroup = new ScalingGroup(&#34;defaultScalingGroup&#34;, ScalingGroupArgs.builder()        
 *             .minSize(1)
 *             .maxSize(1)
 *             .scalingGroupName(name)
 *             .removalPolicies(            
 *                 &#34;OldestInstance&#34;,
 *                 &#34;NewestInstance&#34;)
 *             .vswitchIds(defaultSwitch.id())
 *             .build());
 * 
 *         var defaultQueue = new Queue(&#34;defaultQueue&#34;);
 * 
 *         var defaultNotification = new Notification(&#34;defaultNotification&#34;, NotificationArgs.builder()        
 *             .scalingGroupId(defaultScalingGroup.id())
 *             .notificationTypes(            
 *                 &#34;AUTOSCALING:SCALE_OUT_SUCCESS&#34;,
 *                 &#34;AUTOSCALING:SCALE_OUT_ERROR&#34;)
 *             .notificationArn(defaultQueue.name().applyValue(name -&gt; String.format(&#34;acs:ess:%s:%s:queue/%s&#34;, defaultRegions.applyValue(getRegionsResult -&gt; getRegionsResult.regions()[0].id()),defaultAccount.applyValue(getAccountResult -&gt; getAccountResult.id()),name)))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Ess notification can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ess/notification:Notification example &#39;scaling_group_id:notification_arn&#39;
 * ```
 * 
 */
@ResourceType(type="alicloud:ess/notification:Notification")
public class Notification extends com.pulumi.resources.CustomResource {
    /**
     * The Alibaba Cloud Resource Name (ARN) of the notification object, The value must be in `acs:ess:{region}:{account-id}:{resource-relative-id}` format.
     * * region: the region ID of the scaling group. For more information, see `Regions and zones`
     * * account-id: the ID of your account.
     * * resource-relative-id: the notification method. Valid values : `cloudmonitor`, MNS queue: `queue/{queuename}`, Replace the queuename with the specific MNS queue name, MNS topic: `topic/{topicname}`, Replace the topicname with the specific MNS topic name.
     * 
     */
    @Export(name="notificationArn", refs={String.class}, tree="[0]")
    private Output<String> notificationArn;

    /**
     * @return The Alibaba Cloud Resource Name (ARN) of the notification object, The value must be in `acs:ess:{region}:{account-id}:{resource-relative-id}` format.
     * * region: the region ID of the scaling group. For more information, see `Regions and zones`
     * * account-id: the ID of your account.
     * * resource-relative-id: the notification method. Valid values : `cloudmonitor`, MNS queue: `queue/{queuename}`, Replace the queuename with the specific MNS queue name, MNS topic: `topic/{topicname}`, Replace the topicname with the specific MNS topic name.
     * 
     */
    public Output<String> notificationArn() {
        return this.notificationArn;
    }
    /**
     * The notification types of Auto Scaling events and resource changes. Supported notification types: &#39;AUTOSCALING:SCALE_OUT_SUCCESS&#39;, &#39;AUTOSCALING:SCALE_IN_SUCCESS&#39;, &#39;AUTOSCALING:SCALE_OUT_ERROR&#39;, &#39;AUTOSCALING:SCALE_IN_ERROR&#39;, &#39;AUTOSCALING:SCALE_REJECT&#39;, &#39;AUTOSCALING:SCALE_OUT_START&#39;, &#39;AUTOSCALING:SCALE_IN_START&#39;, &#39;AUTOSCALING:SCHEDULE_TASK_EXPIRING&#39;.
     * 
     */
    @Export(name="notificationTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> notificationTypes;

    /**
     * @return The notification types of Auto Scaling events and resource changes. Supported notification types: &#39;AUTOSCALING:SCALE_OUT_SUCCESS&#39;, &#39;AUTOSCALING:SCALE_IN_SUCCESS&#39;, &#39;AUTOSCALING:SCALE_OUT_ERROR&#39;, &#39;AUTOSCALING:SCALE_IN_ERROR&#39;, &#39;AUTOSCALING:SCALE_REJECT&#39;, &#39;AUTOSCALING:SCALE_OUT_START&#39;, &#39;AUTOSCALING:SCALE_IN_START&#39;, &#39;AUTOSCALING:SCHEDULE_TASK_EXPIRING&#39;.
     * 
     */
    public Output<List<String>> notificationTypes() {
        return this.notificationTypes;
    }
    /**
     * The ID of the Auto Scaling group.
     * 
     */
    @Export(name="scalingGroupId", refs={String.class}, tree="[0]")
    private Output<String> scalingGroupId;

    /**
     * @return The ID of the Auto Scaling group.
     * 
     */
    public Output<String> scalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Notification(String name) {
        this(name, NotificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Notification(String name, NotificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Notification(String name, NotificationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/notification:Notification", name, args == null ? NotificationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Notification(String name, Output<String> id, @Nullable NotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/notification:Notification", name, state, makeResourceOptions(options, id));
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
    public static Notification get(String name, Output<String> id, @Nullable NotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Notification(name, id, state, options);
    }
}
