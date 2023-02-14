// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cloudfirewall.InstanceArgs;
import com.pulumi.alicloud.cloudfirewall.inputs.InstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Firewall Instance resource.
 * 
 * For information about Cloud Firewall Instance and how to use it, see [What is Instance](https://www.alibabacloud.com/help/en/product/90174.htm).
 * 
 * &gt; **NOTE:** Available in v1.139.0+.
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
 * import com.pulumi.alicloud.cloudfirewall.Instance;
 * import com.pulumi.alicloud.cloudfirewall.InstanceArgs;
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
 *         var example = new Instance(&#34;example&#34;, InstanceArgs.builder()        
 *             .bandWidth(10)
 *             .cfwLog(false)
 *             .cfwLogStorage(1000)
 *             .cfwService(false)
 *             .ipNumber(20)
 *             .paymentType(&#34;Subscription&#34;)
 *             .period(6)
 *             .spec(&#34;premium_version&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud Firewall Instance can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cloudfirewall/instance:Instance example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cloudfirewall/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * Public network processing capability. Valid values: 10 to 15000. Unit: Mbps.
     * 
     */
    @Export(name="bandWidth", type=Integer.class, parameters={})
    private Output<Integer> bandWidth;

    /**
     * @return Public network processing capability. Valid values: 10 to 15000. Unit: Mbps.
     * 
     */
    public Output<Integer> bandWidth() {
        return this.bandWidth;
    }
    /**
     * Whether to use log audit. Valid values: `true`, `false`.
     * 
     */
    @Export(name="cfwLog", type=Boolean.class, parameters={})
    private Output<Boolean> cfwLog;

    /**
     * @return Whether to use log audit. Valid values: `true`, `false`.
     * 
     */
    public Output<Boolean> cfwLog() {
        return this.cfwLog;
    }
    /**
     * The log storage capacity.
     * 
     */
    @Export(name="cfwLogStorage", type=Integer.class, parameters={})
    private Output<Integer> cfwLogStorage;

    /**
     * @return The log storage capacity.
     * 
     */
    public Output<Integer> cfwLogStorage() {
        return this.cfwLogStorage;
    }
    /**
     * Whether to use expert service. Valid values: `true`, `false`.
     * 
     */
    @Export(name="cfwService", type=Boolean.class, parameters={})
    private Output<Boolean> cfwService;

    /**
     * @return Whether to use expert service. Valid values: `true`, `false`.
     * 
     */
    public Output<Boolean> cfwService() {
        return this.cfwService;
    }
    /**
     * The creation time.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The end time.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return The end time.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * The number of protected VPCs. Valid values between 2 and 500.
     * 
     */
    @Export(name="fwVpcNumber", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> fwVpcNumber;

    /**
     * @return The number of protected VPCs. Valid values between 2 and 500.
     * 
     */
    public Output<Optional<Integer>> fwVpcNumber() {
        return Codegen.optional(this.fwVpcNumber);
    }
    /**
     * The number of assets.
     * 
     */
    @Export(name="instanceCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> instanceCount;

    /**
     * @return The number of assets.
     * 
     */
    public Output<Optional<Integer>> instanceCount() {
        return Codegen.optional(this.instanceCount);
    }
    /**
     * The number of public IPs that can be protected. Valid values: 20 to 4000.
     * 
     */
    @Export(name="ipNumber", type=Integer.class, parameters={})
    private Output<Integer> ipNumber;

    /**
     * @return The number of public IPs that can be protected. Valid values: 20 to 4000.
     * 
     */
    public Output<Integer> ipNumber() {
        return this.ipNumber;
    }
    /**
     * The logistics.
     * 
     */
    @Export(name="logistics", type=String.class, parameters={})
    private Output</* @Nullable */ String> logistics;

    /**
     * @return The logistics.
     * 
     */
    public Output<Optional<String>> logistics() {
        return Codegen.optional(this.logistics);
    }
    /**
     * The modify type. Valid values: `Upgrade`, `Downgrade`.  **NOTE:** The `modify_type` is required when you execute an update operation.
     * 
     */
    @Export(name="modifyType", type=String.class, parameters={})
    private Output</* @Nullable */ String> modifyType;

    /**
     * @return The modify type. Valid values: `Upgrade`, `Downgrade`.  **NOTE:** The `modify_type` is required when you execute an update operation.
     * 
     */
    public Output<Optional<String>> modifyType() {
        return Codegen.optional(this.modifyType);
    }
    /**
     * The payment type of the resource. Valid values: `Subscription`.
     * 
     */
    @Export(name="paymentType", type=String.class, parameters={})
    private Output<String> paymentType;

    /**
     * @return The payment type of the resource. Valid values: `Subscription`.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }
    /**
     * The prepaid period. Valid values: `6`, `12`, `24`, `36`.
     * 
     */
    @Export(name="period", type=Integer.class, parameters={})
    private Output<Integer> period;

    /**
     * @return The prepaid period. Valid values: `6`, `12`, `24`, `36`.
     * 
     */
    public Output<Integer> period() {
        return this.period;
    }
    /**
     * The release time.
     * 
     */
    @Export(name="releaseTime", type=String.class, parameters={})
    private Output<String> releaseTime;

    /**
     * @return The release time.
     * 
     */
    public Output<String> releaseTime() {
        return this.releaseTime;
    }
    /**
     * Automatic renewal period. **NOTE:** The `renew_period` is required under the condition that renewal_status is `AutoRenewal`.
     * 
     */
    @Export(name="renewPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> renewPeriod;

    /**
     * @return Automatic renewal period. **NOTE:** The `renew_period` is required under the condition that renewal_status is `AutoRenewal`.
     * 
     */
    public Output<Optional<Integer>> renewPeriod() {
        return Codegen.optional(this.renewPeriod);
    }
    /**
     * Automatic renewal period unit. Valid values: `Month`,`Year`.
     * 
     */
    @Export(name="renewalDurationUnit", type=String.class, parameters={})
    private Output<String> renewalDurationUnit;

    /**
     * @return Automatic renewal period unit. Valid values: `Month`,`Year`.
     * 
     */
    public Output<String> renewalDurationUnit() {
        return this.renewalDurationUnit;
    }
    /**
     * Automatic renewal status. Valid values: `AutoRenewal`,`ManualRenewal`. Default Value: `ManualRenewal`.
     * 
     */
    @Export(name="renewalStatus", type=String.class, parameters={})
    private Output<String> renewalStatus;

    /**
     * @return Automatic renewal status. Valid values: `AutoRenewal`,`ManualRenewal`. Default Value: `ManualRenewal`.
     * 
     */
    public Output<String> renewalStatus() {
        return this.renewalStatus;
    }
    /**
     * Current version. Valid values: `premium_version`, `enterprise_version`,`ultimate_version`.
     * 
     */
    @Export(name="spec", type=String.class, parameters={})
    private Output<String> spec;

    /**
     * @return Current version. Valid values: `premium_version`, `enterprise_version`,`ultimate_version`.
     * 
     */
    public Output<String> spec() {
        return this.spec;
    }
    /**
     * The status of Instance.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of Instance.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudfirewall/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudfirewall/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}