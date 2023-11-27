// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dns.MonitorConfigArgs;
import com.pulumi.alicloud.dns.inputs.MonitorConfigState;
import com.pulumi.alicloud.dns.outputs.MonitorConfigIspCityNode;
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
 * Provides a DNS Monitor Config resource.
 * 
 * For information about DNS Monitor Config and how to use it, see [What is Monitor Config](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).
 * 
 * &gt; **NOTE:** Available since v1.153.0.
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
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetResourceGroupsArgs;
 * import com.pulumi.alicloud.cms.AlarmContactGroup;
 * import com.pulumi.alicloud.cms.AlarmContactGroupArgs;
 * import com.pulumi.alicloud.dns.GtmInstance;
 * import com.pulumi.alicloud.dns.GtmInstanceArgs;
 * import com.pulumi.alicloud.dns.inputs.GtmInstanceAlertConfigArgs;
 * import com.pulumi.alicloud.dns.AddressPool;
 * import com.pulumi.alicloud.dns.AddressPoolArgs;
 * import com.pulumi.alicloud.dns.inputs.AddressPoolAddressArgs;
 * import com.pulumi.alicloud.dns.MonitorConfig;
 * import com.pulumi.alicloud.dns.MonitorConfigArgs;
 * import com.pulumi.alicloud.dns.inputs.MonitorConfigIspCityNodeArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf_example&#34;);
 *         final var domainName = config.get(&#34;domainName&#34;).orElse(&#34;alicloud-provider.com&#34;);
 *         final var defaultResourceGroups = ResourcemanagerFunctions.getResourceGroups();
 * 
 *         var defaultAlarmContactGroup = new AlarmContactGroup(&#34;defaultAlarmContactGroup&#34;, AlarmContactGroupArgs.builder()        
 *             .alarmContactGroupName(name)
 *             .build());
 * 
 *         var defaultGtmInstance = new GtmInstance(&#34;defaultGtmInstance&#34;, GtmInstanceArgs.builder()        
 *             .instanceName(name)
 *             .paymentType(&#34;Subscription&#34;)
 *             .period(1)
 *             .renewalStatus(&#34;ManualRenewal&#34;)
 *             .packageEdition(&#34;standard&#34;)
 *             .healthCheckTaskCount(100)
 *             .smsNotificationCount(1000)
 *             .publicCnameMode(&#34;SYSTEM_ASSIGN&#34;)
 *             .ttl(60)
 *             .cnameType(&#34;PUBLIC&#34;)
 *             .resourceGroupId(defaultResourceGroups.applyValue(getResourceGroupsResult -&gt; getResourceGroupsResult.groups()[0].id()))
 *             .alertGroups(defaultAlarmContactGroup.alarmContactGroupName())
 *             .publicUserDomainName(domainName)
 *             .alertConfigs(GtmInstanceAlertConfigArgs.builder()
 *                 .smsNotice(true)
 *                 .noticeType(&#34;ADDR_ALERT&#34;)
 *                 .emailNotice(true)
 *                 .dingtalkNotice(true)
 *                 .build())
 *             .build());
 * 
 *         var defaultAddressPool = new AddressPool(&#34;defaultAddressPool&#34;, AddressPoolArgs.builder()        
 *             .addressPoolName(name)
 *             .instanceId(defaultGtmInstance.id())
 *             .lbaStrategy(&#34;RATIO&#34;)
 *             .type(&#34;IPV4&#34;)
 *             .addresses(AddressPoolAddressArgs.builder()
 *                 .attributeInfo(&#34;{\&#34;lineCodeRectifyType\&#34;:\&#34;RECTIFIED\&#34;,\&#34;lineCodes\&#34;:[\&#34;os_namerica_us\&#34;]}&#34;)
 *                 .remark(&#34;address_remark&#34;)
 *                 .address(&#34;1.1.1.1&#34;)
 *                 .mode(&#34;SMART&#34;)
 *                 .lbaWeight(1)
 *                 .build())
 *             .build());
 * 
 *         var defaultMonitorConfig = new MonitorConfig(&#34;defaultMonitorConfig&#34;, MonitorConfigArgs.builder()        
 *             .addrPoolId(defaultAddressPool.id())
 *             .evaluationCount(&#34;1&#34;)
 *             .interval(&#34;60&#34;)
 *             .timeout(&#34;5000&#34;)
 *             .protocolType(&#34;TCP&#34;)
 *             .monitorExtendInfo(&#34;{\&#34;failureRate\&#34;:50,\&#34;port\&#34;:80}&#34;)
 *             .ispCityNodes(MonitorConfigIspCityNodeArgs.builder()
 *                 .cityCode(&#34;503&#34;)
 *                 .ispCode(&#34;465&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * DNS Monitor Config can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:dns/monitorConfig:MonitorConfig example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:dns/monitorConfig:MonitorConfig")
public class MonitorConfig extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the address pool.
     * 
     */
    @Export(name="addrPoolId", refs={String.class}, tree="[0]")
    private Output<String> addrPoolId;

    /**
     * @return The ID of the address pool.
     * 
     */
    public Output<String> addrPoolId() {
        return this.addrPoolId;
    }
    /**
     * The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
     * 
     */
    @Export(name="evaluationCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> evaluationCount;

    /**
     * @return The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
     * 
     */
    public Output<Integer> evaluationCount() {
        return this.evaluationCount;
    }
    /**
     * The health check interval. Unit: seconds. Valid values: `60`.
     * 
     */
    @Export(name="interval", refs={Integer.class}, tree="[0]")
    private Output<Integer> interval;

    /**
     * @return The health check interval. Unit: seconds. Valid values: `60`.
     * 
     */
    public Output<Integer> interval() {
        return this.interval;
    }
    /**
     * The Monitoring node. See `isp_city_node` below for details.
     * 
     */
    @Export(name="ispCityNodes", refs={List.class,MonitorConfigIspCityNode.class}, tree="[0,1]")
    private Output<List<MonitorConfigIspCityNode>> ispCityNodes;

    /**
     * @return The Monitoring node. See `isp_city_node` below for details.
     * 
     */
    public Output<List<MonitorConfigIspCityNode>> ispCityNodes() {
        return this.ispCityNodes;
    }
    /**
     * The lang.
     * 
     */
    @Export(name="lang", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lang;

    /**
     * @return The lang.
     * 
     */
    public Output<Optional<String>> lang() {
        return Codegen.optional(this.lang);
    }
    /**
     * The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).
     * 
     */
    @Export(name="monitorExtendInfo", refs={String.class}, tree="[0]")
    private Output<String> monitorExtendInfo;

    /**
     * @return The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).
     * 
     */
    public Output<String> monitorExtendInfo() {
        return this.monitorExtendInfo;
    }
    /**
     * The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
     * 
     */
    @Export(name="protocolType", refs={String.class}, tree="[0]")
    private Output<String> protocolType;

    /**
     * @return The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
     * 
     */
    public Output<String> protocolType() {
        return this.protocolType;
    }
    /**
     * The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
     * 
     */
    @Export(name="timeout", refs={Integer.class}, tree="[0]")
    private Output<Integer> timeout;

    /**
     * @return The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
     * 
     */
    public Output<Integer> timeout() {
        return this.timeout;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MonitorConfig(String name) {
        this(name, MonitorConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MonitorConfig(String name, MonitorConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MonitorConfig(String name, MonitorConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dns/monitorConfig:MonitorConfig", name, args == null ? MonitorConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MonitorConfig(String name, Output<String> id, @Nullable MonitorConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dns/monitorConfig:MonitorConfig", name, state, makeResourceOptions(options, id));
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
    public static MonitorConfig get(String name, Output<String> id, @Nullable MonitorConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MonitorConfig(name, id, state, options);
    }
}
