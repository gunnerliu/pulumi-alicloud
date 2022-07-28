// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dns.InstanceArgs;
import com.pulumi.alicloud.dns.inputs.InstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * DNS instance be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:dns/instance:Instance example dns-cn-v0h1ldjhfff
 * ```
 * 
 */
@ResourceType(type="alicloud:dns/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * DNS security level. Valid values: `no`, `basic`, `advanced`.
     * 
     */
    @Export(name="dnsSecurity", type=String.class, parameters={})
    private Output<String> dnsSecurity;

    /**
     * @return DNS security level. Valid values: `no`, `basic`, `advanced`.
     * 
     */
    public Output<String> dnsSecurity() {
        return this.dnsSecurity;
    }
    /**
     * Number of domain names bound.
     * 
     */
    @Export(name="domainNumbers", type=String.class, parameters={})
    private Output<String> domainNumbers;

    /**
     * @return Number of domain names bound.
     * 
     */
    public Output<String> domainNumbers() {
        return this.domainNumbers;
    }
    @Export(name="paymentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> paymentType;

    public Output<Optional<String>> paymentType() {
        return Codegen.optional(this.paymentType);
    }
    /**
     * Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
     * 
     */
    @Export(name="period", type=Integer.class, parameters={})
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
    @Export(name="renewPeriod", type=Integer.class, parameters={})
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
    @Export(name="renewalStatus", type=String.class, parameters={})
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
    @Export(name="versionCode", type=String.class, parameters={})
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
    @Export(name="versionName", type=String.class, parameters={})
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
        super("alicloud:dns/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dns/instance:Instance", name, state, makeResourceOptions(options, id));
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
