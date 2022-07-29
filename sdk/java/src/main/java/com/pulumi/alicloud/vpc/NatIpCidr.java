// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.NatIpCidrArgs;
import com.pulumi.alicloud.vpc.inputs.NatIpCidrState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a VPC Nat Ip Cidr resource.
 * 
 * For information about VPC Nat Ip Cidr and how to use it, see [What is Nat Ip Cidr](https://www.alibabacloud.com/help/doc-detail/281972.htm).
 * 
 * &gt; **NOTE:** Available in v1.136.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * VPC Nat Ip Cidr can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpc/natIpCidr:NatIpCidr example &lt;nat_gateway_id&gt;:&lt;nat_ip_cidr&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/natIpCidr:NatIpCidr")
public class NatIpCidr extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether to precheck this request only. Valid values: `true` and `false`.
     * 
     */
    @Export(name="dryRun", type=Boolean.class, parameters={})
    private Output<Boolean> dryRun;

    /**
     * @return Specifies whether to precheck this request only. Valid values: `true` and `false`.
     * 
     */
    public Output<Boolean> dryRun() {
        return this.dryRun;
    }
    /**
     * The ID of the Virtual Private Cloud (VPC) NAT gateway where you want to create the NAT CIDR block.
     * 
     */
    @Export(name="natGatewayId", type=String.class, parameters={})
    private Output<String> natGatewayId;

    /**
     * @return The ID of the Virtual Private Cloud (VPC) NAT gateway where you want to create the NAT CIDR block.
     * 
     */
    public Output<String> natGatewayId() {
        return this.natGatewayId;
    }
    /**
     * The NAT CIDR block to be created. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
     * 
     */
    @Export(name="natIpCidr", type=String.class, parameters={})
    private Output</* @Nullable */ String> natIpCidr;

    /**
     * @return The NAT CIDR block to be created. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
     * 
     */
    public Output<Optional<String>> natIpCidr() {
        return Codegen.optional(this.natIpCidr);
    }
    /**
     * The description of the NAT CIDR block. The description must be `2` to `256` characters in length. It must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="natIpCidrDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> natIpCidrDescription;

    /**
     * @return The description of the NAT CIDR block. The description must be `2` to `256` characters in length. It must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> natIpCidrDescription() {
        return Codegen.optional(this.natIpCidrDescription);
    }
    /**
     * The name of the NAT CIDR block. The name must be `2` to `128` characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="natIpCidrName", type=String.class, parameters={})
    private Output</* @Nullable */ String> natIpCidrName;

    /**
     * @return The name of the NAT CIDR block. The name must be `2` to `128` characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> natIpCidrName() {
        return Codegen.optional(this.natIpCidrName);
    }
    /**
     * The status of the CIDR block of the NAT gateway. Valid values: `Available`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the CIDR block of the NAT gateway. Valid values: `Available`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NatIpCidr(String name) {
        this(name, NatIpCidrArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NatIpCidr(String name, NatIpCidrArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NatIpCidr(String name, NatIpCidrArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/natIpCidr:NatIpCidr", name, args == null ? NatIpCidrArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NatIpCidr(String name, Output<String> id, @Nullable NatIpCidrState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/natIpCidr:NatIpCidr", name, state, makeResourceOptions(options, id));
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
    public static NatIpCidr get(String name, Output<String> id, @Nullable NatIpCidrState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NatIpCidr(name, id, state, options);
    }
}
