// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.ReservedInstanceArgs;
import com.pulumi.alicloud.ecs.inputs.ReservedInstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Reserved Instance resource.
 * 
 * &gt; **NOTE:** Available in 1.65.0+
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * reservedInstance can be imported using id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecs/reservedInstance:ReservedInstance default ecsri-uf6df4xm0h3licit****
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/reservedInstance:ReservedInstance")
public class ReservedInstance extends com.pulumi.resources.CustomResource {
    /**
     * Description of the RI. 2 to 256 English or Chinese characters. It cannot start with http:// or https://.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the RI. 2 to 256 English or Chinese characters. It cannot start with http:// or https://.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Number of instances allocated to an RI (An RI is a coupon that includes one or more allocated instances.).
     * 
     */
    @Export(name="instanceAmount", type=Integer.class, parameters={})
    private Output<Integer> instanceAmount;

    /**
     * @return Number of instances allocated to an RI (An RI is a coupon that includes one or more allocated instances.).
     * 
     */
    public Output<Integer> instanceAmount() {
        return this.instanceAmount;
    }
    /**
     * Instance type of the RI. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.html).
     * 
     */
    @Export(name="instanceType", type=String.class, parameters={})
    private Output<String> instanceType;

    /**
     * @return Instance type of the RI. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.html).
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * Name of the RI. The name must be a string of 2 to 128 characters in length and can contain letters, numbers, colons (:), underscores (_), and hyphens. It must start with a letter. It cannot start with http:// or https://.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the RI. The name must be a string of 2 to 128 characters in length and can contain letters, numbers, colons (:), underscores (_), and hyphens. It must start with a letter. It cannot start with http:// or https://.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Payment type of the RI. Optional values: `No Upfront`: No upfront payment is required., `Partial Upfront`: A portion of upfront payment is required.`All Upfront`: Full upfront payment is required.
     * 
     */
    @Export(name="offeringType", type=String.class, parameters={})
    private Output</* @Nullable */ String> offeringType;

    /**
     * @return Payment type of the RI. Optional values: `No Upfront`: No upfront payment is required., `Partial Upfront`: A portion of upfront payment is required.`All Upfront`: Full upfront payment is required.
     * 
     */
    public Output<Optional<String>> offeringType() {
        return Codegen.optional(this.offeringType);
    }
    @Export(name="period", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> period;

    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * Term unit. Optional value: Year.
     * 
     */
    @Export(name="periodUnit", type=String.class, parameters={})
    private Output</* @Nullable */ String> periodUnit;

    /**
     * @return Term unit. Optional value: Year.
     * 
     */
    public Output<Optional<String>> periodUnit() {
        return Codegen.optional(this.periodUnit);
    }
    /**
     * The operating system type of the image used by the instance. Optional values: `Windows`, `Linux`. Default is `Linux`.
     * 
     */
    @Export(name="platform", type=String.class, parameters={})
    private Output<String> platform;

    /**
     * @return The operating system type of the image used by the instance. Optional values: `Windows`, `Linux`. Default is `Linux`.
     * 
     */
    public Output<String> platform() {
        return this.platform;
    }
    /**
     * Resource group ID.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output<String> resourceGroupId;

    /**
     * @return Resource group ID.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * Scope of the RI. Optional values: `Region`: region-level, `Zone`: zone-level. Default is `Region`.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    /**
     * @return Scope of the RI. Optional values: `Region`: region-level, `Zone`: zone-level. Default is `Region`.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }
    /**
     * ID of the zone to which the RI belongs. When Scope is set to Zone, this parameter is required. For information about the zone list, see [DescribeZones](https://www.alibabacloud.com/help/doc-detail/25610.html).
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output</* @Nullable */ String> zoneId;

    /**
     * @return ID of the zone to which the RI belongs. When Scope is set to Zone, this parameter is required. For information about the zone list, see [DescribeZones](https://www.alibabacloud.com/help/doc-detail/25610.html).
     * 
     */
    public Output<Optional<String>> zoneId() {
        return Codegen.optional(this.zoneId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReservedInstance(String name) {
        this(name, ReservedInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReservedInstance(String name, ReservedInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReservedInstance(String name, ReservedInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/reservedInstance:ReservedInstance", name, args == null ? ReservedInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReservedInstance(String name, Output<String> id, @Nullable ReservedInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/reservedInstance:ReservedInstance", name, state, makeResourceOptions(options, id));
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
    public static ReservedInstance get(String name, Output<String> id, @Nullable ReservedInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReservedInstance(name, id, state, options);
    }
}
