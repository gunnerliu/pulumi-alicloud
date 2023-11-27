// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dns.AlidnsInstanceArgs;
import com.pulumi.alicloud.dns.inputs.AlidnsInstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Create an Alidns Instance resource.
 * 
 * &gt; **NOTE:** Available since v1.95.0.
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
 * import com.pulumi.alicloud.dns.AlidnsInstance;
 * import com.pulumi.alicloud.dns.AlidnsInstanceArgs;
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
 *         var example = new AlidnsInstance(&#34;example&#34;, AlidnsInstanceArgs.builder()        
 *             .dnsSecurity(&#34;no&#34;)
 *             .domainNumbers(&#34;2&#34;)
 *             .period(1)
 *             .renewPeriod(1)
 *             .renewalStatus(&#34;ManualRenewal&#34;)
 *             .versionCode(&#34;version_personal&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * DNS instance be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:dns/alidnsInstance:AlidnsInstance example dns-cn-v0h1ldjhfff
 * ```
 * 
 */
@ResourceType(type="alicloud:dns/alidnsInstance:AlidnsInstance")
public class AlidnsInstance extends com.pulumi.resources.CustomResource {
    /**
     * Alidns security level. Valid values: `no`, `basic`, `advanced`.
     * 
     */
    @Export(name="dnsSecurity", refs={String.class}, tree="[0]")
    private Output<String> dnsSecurity;

    /**
     * @return Alidns security level. Valid values: `no`, `basic`, `advanced`.
     * 
     */
    public Output<String> dnsSecurity() {
        return this.dnsSecurity;
    }
    /**
     * Number of domain names bound.
     * 
     */
    @Export(name="domainNumbers", refs={String.class}, tree="[0]")
    private Output<String> domainNumbers;

    /**
     * @return Number of domain names bound.
     * 
     */
    public Output<String> domainNumbers() {
        return this.domainNumbers;
    }
    /**
     * The billing method of the Alidns instance. Valid values: `Subscription`. Default to `Subscription`.
     * 
     */
    @Export(name="paymentType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> paymentType;

    /**
     * @return The billing method of the Alidns instance. Valid values: `Subscription`. Default to `Subscription`.
     * 
     */
    public Output<Optional<String>> paymentType() {
        return Codegen.optional(this.paymentType);
    }
    /**
     * Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
     * 
     */
    @Export(name="period", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> period;

    /**
     * @return Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
     * 
     */
    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
     * 
     */
    @Export(name="renewPeriod", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> renewPeriod;

    /**
     * @return Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
     * 
     */
    public Output<Optional<Integer>> renewPeriod() {
        return Codegen.optional(this.renewPeriod);
    }
    /**
     * Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
     * 
     */
    @Export(name="renewalStatus", refs={String.class}, tree="[0]")
    private Output<String> renewalStatus;

    /**
     * @return Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
     * 
     */
    public Output<String> renewalStatus() {
        return this.renewalStatus;
    }
    /**
     * Paid package version. Valid values: `version_personal`, `version_enterprise_basic`, `version_enterprise_advanced`.
     * 
     */
    @Export(name="versionCode", refs={String.class}, tree="[0]")
    private Output<String> versionCode;

    /**
     * @return Paid package version. Valid values: `version_personal`, `version_enterprise_basic`, `version_enterprise_advanced`.
     * 
     */
    public Output<String> versionCode() {
        return this.versionCode;
    }
    /**
     * Paid package version name.
     * 
     */
    @Export(name="versionName", refs={String.class}, tree="[0]")
    private Output<String> versionName;

    /**
     * @return Paid package version name.
     * 
     */
    public Output<String> versionName() {
        return this.versionName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlidnsInstance(String name) {
        this(name, AlidnsInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlidnsInstance(String name, AlidnsInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlidnsInstance(String name, AlidnsInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dns/alidnsInstance:AlidnsInstance", name, args == null ? AlidnsInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AlidnsInstance(String name, Output<String> id, @Nullable AlidnsInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dns/alidnsInstance:AlidnsInstance", name, state, makeResourceOptions(options, id));
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
    public static AlidnsInstance get(String name, Output<String> id, @Nullable AlidnsInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AlidnsInstance(name, id, state, options);
    }
}
