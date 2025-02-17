// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.arms.SyntheticTaskArgs;
import com.pulumi.alicloud.arms.inputs.SyntheticTaskState;
import com.pulumi.alicloud.arms.outputs.SyntheticTaskAvailableAssertion;
import com.pulumi.alicloud.arms.outputs.SyntheticTaskCommonSetting;
import com.pulumi.alicloud.arms.outputs.SyntheticTaskCustomPeriod;
import com.pulumi.alicloud.arms.outputs.SyntheticTaskMonitor;
import com.pulumi.alicloud.arms.outputs.SyntheticTaskMonitorConf;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ARMS Synthetic Task resource. Cloud Synthetic task resources.
 * 
 * For information about ARMS Synthetic Task and how to use it, see [What is Synthetic Task](https://next.api.alibabacloud.com/document/ARMS/2019-08-08/CreateTimingSyntheticTask).
 * 
 * &gt; **NOTE:** Available since v1.215.0.
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
 * import com.pulumi.alicloud.arms.SyntheticTask;
 * import com.pulumi.alicloud.arms.SyntheticTaskArgs;
 * import com.pulumi.alicloud.arms.inputs.SyntheticTaskMonitorArgs;
 * import com.pulumi.alicloud.arms.inputs.SyntheticTaskCustomPeriodArgs;
 * import com.pulumi.alicloud.arms.inputs.SyntheticTaskAvailableAssertionArgs;
 * import com.pulumi.alicloud.arms.inputs.SyntheticTaskMonitorConfArgs;
 * import com.pulumi.alicloud.arms.inputs.SyntheticTaskMonitorConfNetTcpArgs;
 * import com.pulumi.alicloud.arms.inputs.SyntheticTaskMonitorConfNetDnsArgs;
 * import com.pulumi.alicloud.arms.inputs.SyntheticTaskMonitorConfApiHttpArgs;
 * import com.pulumi.alicloud.arms.inputs.SyntheticTaskMonitorConfApiHttpRequestBodyArgs;
 * import com.pulumi.alicloud.arms.inputs.SyntheticTaskMonitorConfWebsiteArgs;
 * import com.pulumi.alicloud.arms.inputs.SyntheticTaskMonitorConfFileDownloadArgs;
 * import com.pulumi.alicloud.arms.inputs.SyntheticTaskMonitorConfStreamArgs;
 * import com.pulumi.alicloud.arms.inputs.SyntheticTaskMonitorConfNetIcmpArgs;
 * import com.pulumi.alicloud.arms.inputs.SyntheticTaskCommonSettingArgs;
 * import com.pulumi.alicloud.arms.inputs.SyntheticTaskCommonSettingCustomHostArgs;
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
 *         final var defaultResourceGroups = ResourcemanagerFunctions.getResourceGroups();
 * 
 *         var defaultSyntheticTask = new SyntheticTask(&#34;defaultSyntheticTask&#34;, SyntheticTaskArgs.builder()        
 *             .monitors(SyntheticTaskMonitorArgs.builder()
 *                 .cityCode(&#34;1200101&#34;)
 *                 .operatorCode(&#34;246&#34;)
 *                 .clientType(&#34;4&#34;)
 *                 .build())
 *             .syntheticTaskName(name)
 *             .customPeriod(SyntheticTaskCustomPeriodArgs.builder()
 *                 .endHour(&#34;12&#34;)
 *                 .startHour(&#34;11&#34;)
 *                 .build())
 *             .availableAssertions(            
 *                 SyntheticTaskAvailableAssertionArgs.builder()
 *                     .type(&#34;IcmpPackLoss&#34;)
 *                     .operator(&#34;neq&#34;)
 *                     .expect(&#34;200&#34;)
 *                     .target(&#34;example&#34;)
 *                     .build(),
 *                 SyntheticTaskAvailableAssertionArgs.builder()
 *                     .type(&#34;IcmpPackAvgLatency&#34;)
 *                     .operator(&#34;lte&#34;)
 *                     .expect(&#34;1000&#34;)
 *                     .build(),
 *                 SyntheticTaskAvailableAssertionArgs.builder()
 *                     .type(&#34;IcmpPackMaxLatency&#34;)
 *                     .operator(&#34;lte&#34;)
 *                     .expect(&#34;10000&#34;)
 *                     .build())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Created&#34;, &#34;TF&#34;),
 *                 Map.entry(&#34;For&#34;, &#34;example&#34;)
 *             ))
 *             .status(&#34;RUNNING&#34;)
 *             .monitorConf(SyntheticTaskMonitorConfArgs.builder()
 *                 .netTcp(SyntheticTaskMonitorConfNetTcpArgs.builder()
 *                     .tracertTimeout(&#34;1050&#34;)
 *                     .targetUrl(&#34;www.aliyun.com&#34;)
 *                     .connectTimes(&#34;6&#34;)
 *                     .interval(&#34;300&#34;)
 *                     .timeout(&#34;3000&#34;)
 *                     .tracertNumMax(&#34;2&#34;)
 *                     .build())
 *                 .netDns(SyntheticTaskMonitorConfNetDnsArgs.builder()
 *                     .queryMethod(&#34;1&#34;)
 *                     .timeout(&#34;5050&#34;)
 *                     .targetUrl(&#34;www.aliyun.com&#34;)
 *                     .dnsServerIpType(&#34;1&#34;)
 *                     .nsServer(&#34;61.128.114.167&#34;)
 *                     .build())
 *                 .apiHttp(SyntheticTaskMonitorConfApiHttpArgs.builder()
 *                     .timeout(&#34;10050&#34;)
 *                     .targetUrl(&#34;https://www.aliyun.com&#34;)
 *                     .method(&#34;POST&#34;)
 *                     .requestHeaders(Map.of(&#34;key1&#34;, &#34;value1&#34;))
 *                     .requestBody(SyntheticTaskMonitorConfApiHttpRequestBodyArgs.builder()
 *                         .content(&#34;example2&#34;)
 *                         .type(&#34;text/html&#34;)
 *                         .build())
 *                     .connectTimeout(&#34;6000&#34;)
 *                     .build())
 *                 .website(SyntheticTaskMonitorConfWebsiteArgs.builder()
 *                     .slowElementThreshold(&#34;5005&#34;)
 *                     .verifyStringBlacklist(&#34;Failed&#34;)
 *                     .elementBlacklist(&#34;a.jpg&#34;)
 *                     .disableCompression(&#34;1&#34;)
 *                     .ignoreCertificateError(&#34;0&#34;)
 *                     .monitorTimeout(&#34;20000&#34;)
 *                     .redirection(&#34;0&#34;)
 *                     .dnsHijackWhitelist(&#34;www.aliyun.com:203.0.3.55&#34;)
 *                     .pageTamper(&#34;www.aliyun.com:|/cc/bb/a.gif&#34;)
 *                     .flowHijackJumpTimes(&#34;10&#34;)
 *                     .customHeader(&#34;1&#34;)
 *                     .disableCache(&#34;1&#34;)
 *                     .verifyStringWhitelist(&#34;Senyuan&#34;)
 *                     .targetUrl(&#34;http://www.aliyun.com&#34;)
 *                     .automaticScrolling(&#34;1&#34;)
 *                     .waitCompletionTime(&#34;5005&#34;)
 *                     .flowHijackLogo(&#34;senyuan1&#34;)
 *                     .customHeaderContent(Map.of(&#34;key1&#34;, &#34;value1&#34;))
 *                     .filterInvalidIp(&#34;0&#34;)
 *                     .build())
 *                 .fileDownload(SyntheticTaskMonitorConfFileDownloadArgs.builder()
 *                     .whiteList(&#34;www.aliyun.com:203.0.3.55&#34;)
 *                     .monitorTimeout(&#34;1050&#34;)
 *                     .ignoreCertificateUntrustworthyError(&#34;0&#34;)
 *                     .redirection(&#34;0&#34;)
 *                     .ignoreCertificateCanceledError(&#34;0&#34;)
 *                     .ignoreCertificateAuthError(&#34;0&#34;)
 *                     .ignoreCertificateOutOfDateError(&#34;0&#34;)
 *                     .ignoreCertificateUsingError(&#34;0&#34;)
 *                     .connectionTimeout(&#34;6090&#34;)
 *                     .ignoreInvalidHostError(&#34;0&#34;)
 *                     .verifyWay(&#34;0&#34;)
 *                     .customHeaderContent(Map.of(&#34;key1&#34;, &#34;value1&#34;))
 *                     .targetUrl(&#34;https://www.aliyun.com&#34;)
 *                     .downloadKernel(&#34;0&#34;)
 *                     .quickProtocol(&#34;2&#34;)
 *                     .ignoreCertificateStatusError(&#34;1&#34;)
 *                     .transmissionSize(&#34;128&#34;)
 *                     .validateKeywords(&#34;senyuan1&#34;)
 *                     .build())
 *                 .stream(SyntheticTaskMonitorConfStreamArgs.builder()
 *                     .streamMonitorTimeout(&#34;10&#34;)
 *                     .streamAddressType(&#34;0&#34;)
 *                     .playerType(&#34;2&#34;)
 *                     .customHeaderContent(Map.of(&#34;key1&#34;, &#34;value1&#34;))
 *                     .whiteList(&#34;www.aliyun.com:203.0.3.55&#34;)
 *                     .targetUrl(&#34;https://acd-assets.alicdn.com:443/2021productweek/week1_s.mp4&#34;)
 *                     .streamType(&#34;1&#34;)
 *                     .build())
 *                 .netIcmp(SyntheticTaskMonitorConfNetIcmpArgs.builder()
 *                     .targetUrl(&#34;www.aliyun.com&#34;)
 *                     .interval(&#34;200&#34;)
 *                     .packageNum(&#34;36&#34;)
 *                     .packageSize(&#34;512&#34;)
 *                     .timeout(&#34;1000&#34;)
 *                     .tracertEnable(&#34;true&#34;)
 *                     .tracertNumMax(&#34;1&#34;)
 *                     .tracertTimeout(&#34;1200&#34;)
 *                     .build())
 *                 .build())
 *             .taskType(&#34;1&#34;)
 *             .frequency(&#34;1h&#34;)
 *             .monitorCategory(&#34;1&#34;)
 *             .commonSetting(SyntheticTaskCommonSettingArgs.builder()
 *                 .xtraceRegion(&#34;cn-beijing&#34;)
 *                 .customHost(SyntheticTaskCommonSettingCustomHostArgs.builder()
 *                     .hosts(                    
 *                         SyntheticTaskCommonSettingCustomHostHostArgs.builder()
 *                             .domain(&#34;www.a.aliyun.com&#34;)
 *                             .ips(&#34;153.3.238.102&#34;)
 *                             .ipType(&#34;0&#34;)
 *                             .build(),
 *                         SyntheticTaskCommonSettingCustomHostHostArgs.builder()
 *                             .domain(&#34;www.shifen.com&#34;)
 *                             .ips(                            
 *                                 &#34;153.3.238.110&#34;,
 *                                 &#34;114.114.114.114&#34;,
 *                                 &#34;127.0.0.1&#34;)
 *                             .ipType(&#34;1&#34;)
 *                             .build(),
 *                         SyntheticTaskCommonSettingCustomHostHostArgs.builder()
 *                             .domain(&#34;www.aliyun.com&#34;)
 *                             .ips(                            
 *                                 &#34;153.3.238.110&#34;,
 *                                 &#34;180.101.50.242&#34;,
 *                                 &#34;180.101.50.188&#34;)
 *                             .ipType(&#34;0&#34;)
 *                             .build())
 *                     .selectType(&#34;1&#34;)
 *                     .build())
 *                 .monitorSamples(&#34;1&#34;)
 *                 .ipType(&#34;1&#34;)
 *                 .isOpenTrace(&#34;true&#34;)
 *                 .traceClientType(&#34;1&#34;)
 *                 .build())
 *             .resourceGroupId(defaultResourceGroups.applyValue(getResourceGroupsResult -&gt; getResourceGroupsResult.ids()[1]))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ARMS Synthetic Task can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:arms/syntheticTask:SyntheticTask example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:arms/syntheticTask:SyntheticTask")
public class SyntheticTask extends com.pulumi.resources.CustomResource {
    /**
     * Assertion List. See `available_assertions` below.
     * 
     */
    @Export(name="availableAssertions", refs={List.class,SyntheticTaskAvailableAssertion.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SyntheticTaskAvailableAssertion>> availableAssertions;

    /**
     * @return Assertion List. See `available_assertions` below.
     * 
     */
    public Output<Optional<List<SyntheticTaskAvailableAssertion>>> availableAssertions() {
        return Codegen.optional(this.availableAssertions);
    }
    /**
     * Common settings. See `common_setting` below.
     * 
     */
    @Export(name="commonSetting", refs={SyntheticTaskCommonSetting.class}, tree="[0]")
    private Output<SyntheticTaskCommonSetting> commonSetting;

    /**
     * @return Common settings. See `common_setting` below.
     * 
     */
    public Output<SyntheticTaskCommonSetting> commonSetting() {
        return this.commonSetting;
    }
    /**
     * Custom Cycle. See `custom_period` below.
     * 
     */
    @Export(name="customPeriod", refs={SyntheticTaskCustomPeriod.class}, tree="[0]")
    private Output</* @Nullable */ SyntheticTaskCustomPeriod> customPeriod;

    /**
     * @return Custom Cycle. See `custom_period` below.
     * 
     */
    public Output<Optional<SyntheticTaskCustomPeriod>> customPeriod() {
        return Codegen.optional(this.customPeriod);
    }
    /**
     * Frequency.
     * 
     */
    @Export(name="frequency", refs={String.class}, tree="[0]")
    private Output<String> frequency;

    /**
     * @return Frequency.
     * 
     */
    public Output<String> frequency() {
        return this.frequency;
    }
    /**
     * Classification of selected monitors.
     * 
     */
    @Export(name="monitorCategory", refs={Integer.class}, tree="[0]")
    private Output<Integer> monitorCategory;

    /**
     * @return Classification of selected monitors.
     * 
     */
    public Output<Integer> monitorCategory() {
        return this.monitorCategory;
    }
    /**
     * Monitoring configuration. See `monitor_conf` below.
     * 
     */
    @Export(name="monitorConf", refs={SyntheticTaskMonitorConf.class}, tree="[0]")
    private Output<SyntheticTaskMonitorConf> monitorConf;

    /**
     * @return Monitoring configuration. See `monitor_conf` below.
     * 
     */
    public Output<SyntheticTaskMonitorConf> monitorConf() {
        return this.monitorConf;
    }
    /**
     * List of selected monitors. See `monitors` below.
     * 
     */
    @Export(name="monitors", refs={List.class,SyntheticTaskMonitor.class}, tree="[0,1]")
    private Output<List<SyntheticTaskMonitor>> monitors;

    /**
     * @return List of selected monitors. See `monitors` below.
     * 
     */
    public Output<List<SyntheticTaskMonitor>> monitors() {
        return this.monitors;
    }
    /**
     * Describes which resource group the resource belongs.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return Describes which resource group the resource belongs.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * task status.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return task status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The name of synthetic task.
     * 
     */
    @Export(name="syntheticTaskName", refs={String.class}, tree="[0]")
    private Output<String> syntheticTaskName;

    /**
     * @return The name of synthetic task.
     * 
     */
    public Output<String> syntheticTaskName() {
        return this.syntheticTaskName;
    }
    /**
     * The list of tags.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return The list of tags.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of synthetic task.
     * 
     */
    @Export(name="taskType", refs={Integer.class}, tree="[0]")
    private Output<Integer> taskType;

    /**
     * @return The type of synthetic task.
     * 
     */
    public Output<Integer> taskType() {
        return this.taskType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SyntheticTask(String name) {
        this(name, SyntheticTaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SyntheticTask(String name, SyntheticTaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SyntheticTask(String name, SyntheticTaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:arms/syntheticTask:SyntheticTask", name, args == null ? SyntheticTaskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SyntheticTask(String name, Output<String> id, @Nullable SyntheticTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:arms/syntheticTask:SyntheticTask", name, state, makeResourceOptions(options, id));
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
    public static SyntheticTask get(String name, Output<String> id, @Nullable SyntheticTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SyntheticTask(name, id, state, options);
    }
}
