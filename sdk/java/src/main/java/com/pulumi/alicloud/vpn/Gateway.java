// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpn.GatewayArgs;
import com.pulumi.alicloud.vpn.inputs.GatewayState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * VPN gateway can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpn/gateway:Gateway example vpn-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:vpn/gateway:Gateway")
public class Gateway extends com.pulumi.resources.CustomResource {
    /**
     * Whether to pay automatically. Default value: `true`. Valid values:
     * 
     */
    @Export(name="autoPay", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoPay;

    /**
     * @return Whether to pay automatically. Default value: `true`. Valid values:
     * 
     */
    public Output<Optional<Boolean>> autoPay() {
        return Codegen.optional(this.autoPay);
    }
    /**
     * Specifies whether to automatically advertise BGP routes to the virtual private cloud (VPC). Valid values:
     * 
     */
    @Export(name="autoPropagate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoPropagate;

    /**
     * @return Specifies whether to automatically advertise BGP routes to the virtual private cloud (VPC). Valid values:
     * 
     */
    public Output<Optional<Boolean>> autoPropagate() {
        return Codegen.optional(this.autoPropagate);
    }
    @Export(name="bandwidth", refs={Integer.class}, tree="[0]")
    private Output<Integer> bandwidth;

    public Output<Integer> bandwidth() {
        return this.bandwidth;
    }
    /**
     * The business status of the VPN gateway.
     * 
     */
    @Export(name="businessStatus", refs={String.class}, tree="[0]")
    private Output<String> businessStatus;

    /**
     * @return The business status of the VPN gateway.
     * 
     */
    public Output<String> businessStatus() {
        return this.businessStatus;
    }
    /**
     * The description of the VPN instance.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the VPN instance.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
     * 
     */
    @Export(name="enableIpsec", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableIpsec;

    /**
     * @return Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
     * 
     */
    public Output<Optional<Boolean>> enableIpsec() {
        return Codegen.optional(this.enableIpsec);
    }
    /**
     * Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
     * 
     */
    @Export(name="enableSsl", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableSsl;

    /**
     * @return Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
     * 
     */
    public Output<Optional<Boolean>> enableSsl() {
        return Codegen.optional(this.enableSsl);
    }
    /**
     * The charge type for instance. If it is an international site account, the valid value is PostPaid, otherwise PrePaid.
     * Default to PostPaid.
     * 
     */
    @Export(name="instanceChargeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceChargeType;

    /**
     * @return The charge type for instance. If it is an international site account, the valid value is PostPaid, otherwise PrePaid.
     * Default to PostPaid.
     * 
     */
    public Output<Optional<String>> instanceChargeType() {
        return Codegen.optional(this.instanceChargeType);
    }
    /**
     * The internet ip of the VPN.
     * 
     */
    @Export(name="internetIp", refs={String.class}, tree="[0]")
    private Output<String> internetIp;

    /**
     * @return The internet ip of the VPN.
     * 
     */
    public Output<String> internetIp() {
        return this.internetIp;
    }
    /**
     * The name of the VPN. Defaults to null.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the VPN. Defaults to null.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The network type of the VPN gateway. Value:
     * - public (default): Public VPN gateway.
     * - private: Private VPN gateway.
     * 
     * &gt; **NOTE:** Private VPN gateway can only be purchased by white list users, and the bandwidth only supports 200M or 1000M; In addition, SSL is not supported.
     * 
     */
    @Export(name="networkType", refs={String.class}, tree="[0]")
    private Output<String> networkType;

    /**
     * @return The network type of the VPN gateway. Value:
     * - public (default): Public VPN gateway.
     * - private: Private VPN gateway.
     * 
     * &gt; **NOTE:** Private VPN gateway can only be purchased by white list users, and the bandwidth only supports 200M or 1000M; In addition, SSL is not supported.
     * 
     */
    public Output<String> networkType() {
        return this.networkType;
    }
    /**
     * The filed is only required while the InstanceChargeType is PrePaid. Valid values: [1-9, 12, 24, 36]. Default to 1.
     * 
     */
    @Export(name="period", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> period;

    /**
     * @return The filed is only required while the InstanceChargeType is PrePaid. Valid values: [1-9, 12, 24, 36]. Default to 1.
     * 
     */
    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * The max connections of SSL VPN. Default to 5. The number of connections supported by each account is different.
     * This field is ignored when enable_ssl is false.
     * 
     */
    @Export(name="sslConnections", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> sslConnections;

    /**
     * @return The max connections of SSL VPN. Default to 5. The number of connections supported by each account is different.
     * This field is ignored when enable_ssl is false.
     * 
     */
    public Output<Optional<Integer>> sslConnections() {
        return Codegen.optional(this.sslConnections);
    }
    /**
     * The status of the VPN gateway.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the VPN gateway.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The tags of VPN gateway.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return The tags of VPN gateway.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The VPN belongs the vpc_id, the field can&#39;t be changed.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The VPN belongs the vpc_id, the field can&#39;t be changed.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The VPN belongs the vswitch_id, the field can&#39;t be changed.
     * 
     */
    @Export(name="vswitchId", refs={String.class}, tree="[0]")
    private Output<String> vswitchId;

    /**
     * @return The VPN belongs the vswitch_id, the field can&#39;t be changed.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gateway(String name) {
        this(name, GatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gateway(String name, GatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gateway(String name, GatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpn/gateway:Gateway", name, args == null ? GatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Gateway(String name, Output<String> id, @Nullable GatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpn/gateway:Gateway", name, state, makeResourceOptions(options, id));
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
    public static Gateway get(String name, Output<String> id, @Nullable GatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Gateway(name, id, state, options);
    }
}
