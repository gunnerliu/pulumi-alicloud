// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.ForwardEntryArgs;
import com.pulumi.alicloud.vpc.inputs.ForwardEntryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a forward resource.
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
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.vpc.NatGateway;
 * import com.pulumi.alicloud.vpc.NatGatewayArgs;
 * import com.pulumi.alicloud.ecs.EipAddress;
 * import com.pulumi.alicloud.ecs.EipAddressArgs;
 * import com.pulumi.alicloud.ecs.EipAssociation;
 * import com.pulumi.alicloud.ecs.EipAssociationArgs;
 * import com.pulumi.alicloud.vpc.ForwardEntry;
 * import com.pulumi.alicloud.vpc.ForwardEntryArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;forward-entry-example-name&#34;);
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;172.16.0.0/12&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock(&#34;172.16.0.0/21&#34;)
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .vswitchName(name)
 *             .build());
 * 
 *         var defaultNatGateway = new NatGateway(&#34;defaultNatGateway&#34;, NatGatewayArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .internetChargeType(&#34;PayByLcu&#34;)
 *             .natGatewayName(name)
 *             .natType(&#34;Enhanced&#34;)
 *             .vswitchId(defaultSwitch.id())
 *             .build());
 * 
 *         var defaultEipAddress = new EipAddress(&#34;defaultEipAddress&#34;, EipAddressArgs.builder()        
 *             .addressName(name)
 *             .build());
 * 
 *         var defaultEipAssociation = new EipAssociation(&#34;defaultEipAssociation&#34;, EipAssociationArgs.builder()        
 *             .allocationId(defaultEipAddress.id())
 *             .instanceId(defaultNatGateway.id())
 *             .build());
 * 
 *         var defaultForwardEntry = new ForwardEntry(&#34;defaultForwardEntry&#34;, ForwardEntryArgs.builder()        
 *             .forwardTableId(defaultNatGateway.forwardTableIds())
 *             .externalIp(defaultEipAddress.ipAddress())
 *             .externalPort(&#34;80&#34;)
 *             .ipProtocol(&#34;tcp&#34;)
 *             .internalIp(&#34;172.16.0.3&#34;)
 *             .internalPort(&#34;8080&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Forward Entry can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpc/forwardEntry:ForwardEntry foo ftb-1aece3:fwd-232ce2
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/forwardEntry:ForwardEntry")
public class ForwardEntry extends com.pulumi.resources.CustomResource {
    /**
     * The external ip address, the ip must along bandwidth package public ip which `alicloud.vpc.NatGateway` argument `bandwidth_packages`.
     * 
     */
    @Export(name="externalIp", refs={String.class}, tree="[0]")
    private Output<String> externalIp;

    /**
     * @return The external ip address, the ip must along bandwidth package public ip which `alicloud.vpc.NatGateway` argument `bandwidth_packages`.
     * 
     */
    public Output<String> externalIp() {
        return this.externalIp;
    }
    /**
     * The external port, valid value is 1~65535|any.
     * 
     */
    @Export(name="externalPort", refs={String.class}, tree="[0]")
    private Output<String> externalPort;

    /**
     * @return The external port, valid value is 1~65535|any.
     * 
     */
    public Output<String> externalPort() {
        return this.externalPort;
    }
    /**
     * The id of the forward entry on the server.
     * 
     */
    @Export(name="forwardEntryId", refs={String.class}, tree="[0]")
    private Output<String> forwardEntryId;

    /**
     * @return The id of the forward entry on the server.
     * 
     */
    public Output<String> forwardEntryId() {
        return this.forwardEntryId;
    }
    /**
     * The name of forward entry.
     * 
     */
    @Export(name="forwardEntryName", refs={String.class}, tree="[0]")
    private Output<String> forwardEntryName;

    /**
     * @return The name of forward entry.
     * 
     */
    public Output<String> forwardEntryName() {
        return this.forwardEntryName;
    }
    /**
     * The value can get from `alicloud.vpc.NatGateway` Attributes &#34;forward_table_ids&#34;.
     * 
     */
    @Export(name="forwardTableId", refs={String.class}, tree="[0]")
    private Output<String> forwardTableId;

    /**
     * @return The value can get from `alicloud.vpc.NatGateway` Attributes &#34;forward_table_ids&#34;.
     * 
     */
    public Output<String> forwardTableId() {
        return this.forwardTableId;
    }
    /**
     * The internal ip, must a private ip.
     * 
     */
    @Export(name="internalIp", refs={String.class}, tree="[0]")
    private Output<String> internalIp;

    /**
     * @return The internal ip, must a private ip.
     * 
     */
    public Output<String> internalIp() {
        return this.internalIp;
    }
    /**
     * The internal port, valid value is 1~65535|any.
     * 
     */
    @Export(name="internalPort", refs={String.class}, tree="[0]")
    private Output<String> internalPort;

    /**
     * @return The internal port, valid value is 1~65535|any.
     * 
     */
    public Output<String> internalPort() {
        return this.internalPort;
    }
    /**
     * The ip protocol, valid value is tcp|udp|any.
     * 
     */
    @Export(name="ipProtocol", refs={String.class}, tree="[0]")
    private Output<String> ipProtocol;

    /**
     * @return The ip protocol, valid value is tcp|udp|any.
     * 
     */
    public Output<String> ipProtocol() {
        return this.ipProtocol;
    }
    /**
     * Field `name` has been deprecated from provider version 1.119.1. New field `forward_entry_name` instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.119.1. New field &#39;forward_entry_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.119.1. New field 'forward_entry_name' instead. */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Field `name` has been deprecated from provider version 1.119.1. New field `forward_entry_name` instead.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies whether to remove limits on the port range. Default value is `false`.
     * 
     * &gt; **NOTE:** A SNAT entry and a DNAT entry may use the same public IP address. If you want to specify a port number greater than 1024 in this case, set `port_break` to true.
     * 
     */
    @Export(name="portBreak", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> portBreak;

    /**
     * @return Specifies whether to remove limits on the port range. Default value is `false`.
     * 
     * &gt; **NOTE:** A SNAT entry and a DNAT entry may use the same public IP address. If you want to specify a port number greater than 1024 in this case, set `port_break` to true.
     * 
     */
    public Output<Optional<Boolean>> portBreak() {
        return Codegen.optional(this.portBreak);
    }
    /**
     * (Available in 1.119.1+) The status of forward entry.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return (Available in 1.119.1+) The status of forward entry.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ForwardEntry(String name) {
        this(name, ForwardEntryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ForwardEntry(String name, ForwardEntryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ForwardEntry(String name, ForwardEntryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/forwardEntry:ForwardEntry", name, args == null ? ForwardEntryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ForwardEntry(String name, Output<String> id, @Nullable ForwardEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/forwardEntry:ForwardEntry", name, state, makeResourceOptions(options, id));
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
    public static ForwardEntry get(String name, Output<String> id, @Nullable ForwardEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ForwardEntry(name, id, state, options);
    }
}
