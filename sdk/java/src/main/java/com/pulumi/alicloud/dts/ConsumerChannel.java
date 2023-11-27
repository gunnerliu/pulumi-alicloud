// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dts;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dts.ConsumerChannelArgs;
import com.pulumi.alicloud.dts.inputs.ConsumerChannelState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a DTS Consumer Channel resource.
 * 
 * For information about DTS Consumer Channel and how to use it, see [What is Consumer Channel](https://www.alibabacloud.com/help/en/doc-detail/264593.htm).
 * 
 * &gt; **NOTE:** Available since v1.146.0.
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
 * import com.pulumi.alicloud.rds.RdsFunctions;
 * import com.pulumi.alicloud.rds.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.rds.inputs.GetInstanceClassesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.rds.Instance;
 * import com.pulumi.alicloud.rds.InstanceArgs;
 * import com.pulumi.alicloud.rds.RdsAccount;
 * import com.pulumi.alicloud.rds.RdsAccountArgs;
 * import com.pulumi.alicloud.rds.Database;
 * import com.pulumi.alicloud.rds.DatabaseArgs;
 * import com.pulumi.alicloud.rds.AccountPrivilege;
 * import com.pulumi.alicloud.rds.AccountPrivilegeArgs;
 * import com.pulumi.alicloud.dts.SubscriptionJob;
 * import com.pulumi.alicloud.dts.SubscriptionJobArgs;
 * import com.pulumi.alicloud.dts.ConsumerChannel;
 * import com.pulumi.alicloud.dts.ConsumerChannelArgs;
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
 *         final var exampleRegions = AlicloudFunctions.getRegions(GetRegionsArgs.builder()
 *             .current(true)
 *             .build());
 * 
 *         final var exampleZones = RdsFunctions.getZones(GetZonesArgs.builder()
 *             .engine(&#34;MySQL&#34;)
 *             .engineVersion(&#34;8.0&#34;)
 *             .instanceChargeType(&#34;PostPaid&#34;)
 *             .category(&#34;Basic&#34;)
 *             .dbInstanceStorageType(&#34;cloud_essd&#34;)
 *             .build());
 * 
 *         final var exampleInstanceClasses = RdsFunctions.getInstanceClasses(GetInstanceClassesArgs.builder()
 *             .zoneId(exampleZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .engine(&#34;MySQL&#34;)
 *             .engineVersion(&#34;8.0&#34;)
 *             .instanceChargeType(&#34;PostPaid&#34;)
 *             .category(&#34;Basic&#34;)
 *             .dbInstanceStorageType(&#34;cloud_essd&#34;)
 *             .build());
 * 
 *         var exampleNetwork = new Network(&#34;exampleNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;172.16.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleSwitch = new Switch(&#34;exampleSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(exampleNetwork.id())
 *             .cidrBlock(&#34;172.16.0.0/24&#34;)
 *             .zoneId(exampleZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .vswitchName(name)
 *             .build());
 * 
 *         var exampleSecurityGroup = new SecurityGroup(&#34;exampleSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(exampleNetwork.id())
 *             .build());
 * 
 *         var exampleInstance = new Instance(&#34;exampleInstance&#34;, InstanceArgs.builder()        
 *             .engine(&#34;MySQL&#34;)
 *             .engineVersion(&#34;8.0&#34;)
 *             .instanceType(exampleInstanceClasses.applyValue(getInstanceClassesResult -&gt; getInstanceClassesResult.instanceClasses()[0].instanceClass()))
 *             .instanceStorage(exampleInstanceClasses.applyValue(getInstanceClassesResult -&gt; getInstanceClassesResult.instanceClasses()[0].storageRange().min()))
 *             .instanceChargeType(&#34;Postpaid&#34;)
 *             .instanceName(name)
 *             .vswitchId(exampleSwitch.id())
 *             .monitoringPeriod(&#34;60&#34;)
 *             .dbInstanceStorageType(&#34;cloud_essd&#34;)
 *             .securityGroupIds(exampleSecurityGroup.id())
 *             .build());
 * 
 *         var exampleRdsAccount = new RdsAccount(&#34;exampleRdsAccount&#34;, RdsAccountArgs.builder()        
 *             .dbInstanceId(exampleInstance.id())
 *             .accountName(&#34;example_name&#34;)
 *             .accountPassword(&#34;example_1234&#34;)
 *             .build());
 * 
 *         var exampleDatabase = new Database(&#34;exampleDatabase&#34;, DatabaseArgs.builder()        
 *             .instanceId(exampleInstance.id())
 *             .build());
 * 
 *         var exampleAccountPrivilege = new AccountPrivilege(&#34;exampleAccountPrivilege&#34;, AccountPrivilegeArgs.builder()        
 *             .instanceId(exampleInstance.id())
 *             .accountName(exampleRdsAccount.name())
 *             .privilege(&#34;ReadWrite&#34;)
 *             .dbNames(exampleDatabase.name())
 *             .build());
 * 
 *         var exampleSubscriptionJob = new SubscriptionJob(&#34;exampleSubscriptionJob&#34;, SubscriptionJobArgs.builder()        
 *             .dtsJobName(name)
 *             .paymentType(&#34;PayAsYouGo&#34;)
 *             .sourceEndpointEngineName(&#34;MySQL&#34;)
 *             .sourceEndpointRegion(exampleRegions.applyValue(getRegionsResult -&gt; getRegionsResult.regions()[0].id()))
 *             .sourceEndpointInstanceType(&#34;RDS&#34;)
 *             .sourceEndpointInstanceId(exampleInstance.id())
 *             .sourceEndpointDatabaseName(exampleDatabase.name())
 *             .sourceEndpointUserName(exampleRdsAccount.accountName())
 *             .sourceEndpointPassword(exampleRdsAccount.accountPassword())
 *             .dbList(Output.tuple(exampleDatabase.name(), exampleDatabase.name()).applyValue(values -&gt; {
 *                 var exampleDatabaseName = values.t1;
 *                 var exampleDatabaseName1 = values.t2;
 *                 return String.format(&#34;{{\&#34;%s\&#34;:{{\&#34;name\&#34;:\&#34;%s\&#34;,\&#34;all\&#34;:true}}}}&#34;, exampleDatabaseName,exampleDatabaseName1);
 *             }))
 *             .subscriptionInstanceNetworkType(&#34;vpc&#34;)
 *             .subscriptionInstanceVpcId(exampleNetwork.id())
 *             .subscriptionInstanceVswitchId(exampleSwitch.id())
 *             .status(&#34;Normal&#34;)
 *             .build());
 * 
 *         var exampleConsumerChannel = new ConsumerChannel(&#34;exampleConsumerChannel&#34;, ConsumerChannelArgs.builder()        
 *             .dtsInstanceId(exampleSubscriptionJob.dtsInstanceId())
 *             .consumerGroupName(name)
 *             .consumerGroupUserName(&#34;example&#34;)
 *             .consumerGroupPassword(&#34;example1234&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * DTS Consumer Channel can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:dts/consumerChannel:ConsumerChannel example &lt;dts_instance_id&gt;:&lt;consumer_group_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:dts/consumerChannel:ConsumerChannel")
public class ConsumerChannel extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the consumer group.
     * 
     */
    @Export(name="consumerGroupId", refs={String.class}, tree="[0]")
    private Output<String> consumerGroupId;

    /**
     * @return The ID of the consumer group.
     * 
     */
    public Output<String> consumerGroupId() {
        return this.consumerGroupId;
    }
    /**
     * The name of the consumer group.
     * 
     */
    @Export(name="consumerGroupName", refs={String.class}, tree="[0]")
    private Output<String> consumerGroupName;

    /**
     * @return The name of the consumer group.
     * 
     */
    public Output<String> consumerGroupName() {
        return this.consumerGroupName;
    }
    /**
     * The password of the consumer group account. The length of the `consumer_group_password` is limited to `8` to `32` characters. It can contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.
     * 
     */
    @Export(name="consumerGroupPassword", refs={String.class}, tree="[0]")
    private Output<String> consumerGroupPassword;

    /**
     * @return The password of the consumer group account. The length of the `consumer_group_password` is limited to `8` to `32` characters. It can contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.
     * 
     */
    public Output<String> consumerGroupPassword() {
        return this.consumerGroupPassword;
    }
    /**
     * The username of the consumer group. The length of the `consumer_group_user_name` is limited to `1` to `16` characters. It can contain one or more of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).
     * 
     */
    @Export(name="consumerGroupUserName", refs={String.class}, tree="[0]")
    private Output<String> consumerGroupUserName;

    /**
     * @return The username of the consumer group. The length of the `consumer_group_user_name` is limited to `1` to `16` characters. It can contain one or more of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).
     * 
     */
    public Output<String> consumerGroupUserName() {
        return this.consumerGroupUserName;
    }
    /**
     * The ID of the subscription instance.
     * 
     */
    @Export(name="dtsInstanceId", refs={String.class}, tree="[0]")
    private Output<String> dtsInstanceId;

    /**
     * @return The ID of the subscription instance.
     * 
     */
    public Output<String> dtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConsumerChannel(String name) {
        this(name, ConsumerChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConsumerChannel(String name, ConsumerChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConsumerChannel(String name, ConsumerChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dts/consumerChannel:ConsumerChannel", name, args == null ? ConsumerChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConsumerChannel(String name, Output<String> id, @Nullable ConsumerChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dts/consumerChannel:ConsumerChannel", name, state, makeResourceOptions(options, id));
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
    public static ConsumerChannel get(String name, Output<String> id, @Nullable ConsumerChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConsumerChannel(name, id, state, options);
    }
}
