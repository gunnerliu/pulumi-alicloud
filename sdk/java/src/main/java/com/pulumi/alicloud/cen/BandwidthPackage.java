// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.BandwidthPackageArgs;
import com.pulumi.alicloud.cen.inputs.BandwidthPackageState;
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
 * ## Import
 * 
 * CEN bandwidth package can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cen/bandwidthPackage:BandwidthPackage example cenbwp-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/bandwidthPackage:BandwidthPackage")
public class BandwidthPackage extends com.pulumi.resources.CustomResource {
    /**
     * The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
     * 
     */
    @Export(name="bandwidth", refs={Integer.class}, tree="[0]")
    private Output<Integer> bandwidth;

    /**
     * @return The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
     * 
     */
    public Output<Integer> bandwidth() {
        return this.bandwidth;
    }
    /**
     * The name of the bandwidth package. Defaults to null.
     * 
     * -&gt;**NOTE:** PrePaid mode will deduct fees from the account directly and the bandwidth package can&#39;t be deleted before expired time.
     * 
     * -&gt;**NOTE:** The PostPaid mode is only for test. Please open a ticket if you need.
     * 
     */
    @Export(name="cenBandwidthPackageName", refs={String.class}, tree="[0]")
    private Output<String> cenBandwidthPackageName;

    /**
     * @return The name of the bandwidth package. Defaults to null.
     * 
     * -&gt;**NOTE:** PrePaid mode will deduct fees from the account directly and the bandwidth package can&#39;t be deleted before expired time.
     * 
     * -&gt;**NOTE:** The PostPaid mode is only for test. Please open a ticket if you need.
     * 
     */
    public Output<String> cenBandwidthPackageName() {
        return this.cenBandwidthPackageName;
    }
    /**
     * Field `charge_type` has been deprecated from version 1.97.0. Use `payment_type` and instead.
     * 
     * @deprecated
     * Field &#39;charge_type&#39; has been deprecated from version 1.98.0. Use &#39;payment_type&#39; and instead.
     * 
     */
    @Deprecated /* Field 'charge_type' has been deprecated from version 1.98.0. Use 'payment_type' and instead. */
    @Export(name="chargeType", refs={String.class}, tree="[0]")
    private Output<String> chargeType;

    /**
     * @return Field `charge_type` has been deprecated from version 1.97.0. Use `payment_type` and instead.
     * 
     */
    public Output<String> chargeType() {
        return this.chargeType;
    }
    /**
     * The description of the bandwidth package. Default to null.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the bandwidth package. Default to null.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The time of the bandwidth package to expire.
     * 
     */
    @Export(name="expiredTime", refs={String.class}, tree="[0]")
    private Output<String> expiredTime;

    /**
     * @return The time of the bandwidth package to expire.
     * 
     */
    public Output<String> expiredTime() {
        return this.expiredTime;
    }
    /**
     * The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
     * 
     */
    @Export(name="geographicRegionAId", refs={String.class}, tree="[0]")
    private Output<String> geographicRegionAId;

    /**
     * @return The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
     * 
     */
    public Output<String> geographicRegionAId() {
        return this.geographicRegionAId;
    }
    /**
     * The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
     * 
     */
    @Export(name="geographicRegionBId", refs={String.class}, tree="[0]")
    private Output<String> geographicRegionBId;

    /**
     * @return The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
     * 
     */
    public Output<String> geographicRegionBId() {
        return this.geographicRegionBId;
    }
    /**
     * Field `geographic_region_ids` has been deprecated from version 1.97.0. Use `geographic_region_a_id` and `geographic_region_b_id` instead.
     * 
     * @deprecated
     * Field &#39;geographic_region_ids&#39; has been deprecated from version 1.98.0. Use &#39;geographic_region_a_id&#39; and &#39;geographic_region_b_id&#39; instead.
     * 
     */
    @Deprecated /* Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead. */
    @Export(name="geographicRegionIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> geographicRegionIds;

    /**
     * @return Field `geographic_region_ids` has been deprecated from version 1.97.0. Use `geographic_region_a_id` and `geographic_region_b_id` instead.
     * 
     */
    public Output<List<String>> geographicRegionIds() {
        return this.geographicRegionIds;
    }
    /**
     * Field `name` has been deprecated from version 1.97.0. Use `cen_bandwidth_package_name` and instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from version 1.98.0. Use &#39;cen_bandwidth_package_name&#39; and instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from version 1.98.0. Use 'cen_bandwidth_package_name' and instead. */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Field `name` has been deprecated from version 1.97.0. Use `cen_bandwidth_package_name` and instead.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PrePaid`. If set to PrePaid, the bandwidth package can&#39;t be deleted before expired time.
     * 
     */
    @Export(name="paymentType", refs={String.class}, tree="[0]")
    private Output<String> paymentType;

    /**
     * @return The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PrePaid`. If set to PrePaid, the bandwidth package can&#39;t be deleted before expired time.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }
    /**
     * The purchase period in month. Valid value: `1`, `2`, `3`, `6`, `12`.
     * &gt; **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
     * 
     */
    @Export(name="period", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> period;

    /**
     * @return The purchase period in month. Valid value: `1`, `2`, `3`, `6`, `12`.
     * &gt; **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
     * 
     */
    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * The association status of the bandwidth package.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The association status of the bandwidth package.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BandwidthPackage(String name) {
        this(name, BandwidthPackageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BandwidthPackage(String name, BandwidthPackageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BandwidthPackage(String name, BandwidthPackageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/bandwidthPackage:BandwidthPackage", name, args == null ? BandwidthPackageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BandwidthPackage(String name, Output<String> id, @Nullable BandwidthPackageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/bandwidthPackage:BandwidthPackage", name, state, makeResourceOptions(options, id));
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
    public static BandwidthPackage get(String name, Output<String> id, @Nullable BandwidthPackageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BandwidthPackage(name, id, state, options);
    }
}
