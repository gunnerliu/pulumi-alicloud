// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.simpleapplicationserver;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.simpleapplicationserver.FirewallRuleArgs;
import com.pulumi.alicloud.simpleapplicationserver.inputs.FirewallRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Simple Application Server Firewall Rule resource.
 * 
 * For information about Simple Application Server Firewall Rule and how to use it, see [What is Firewall Rule](https://www.alibabacloud.com/help/doc-detail/190449.htm).
 * 
 * &gt; **NOTE:** Available in v1.143.0+.
 * 
 * ## Import
 * 
 * Simple Application Server Firewall Rule can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:simpleapplicationserver/firewallRule:FirewallRule example &lt;instance_id&gt;:&lt;firewall_rule_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:simpleapplicationserver/firewallRule:FirewallRule")
public class FirewallRule extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the firewall rule.
     * 
     */
    @Export(name="firewallRuleId", type=String.class, parameters={})
    private Output<String> firewallRuleId;

    /**
     * @return The ID of the firewall rule.
     * 
     */
    public Output<String> firewallRuleId() {
        return this.firewallRuleId;
    }
    /**
     * Alibaba Cloud simple application server instance ID.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return Alibaba Cloud simple application server instance ID.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The port range. Valid values of port numbers: `1` to `65535`. Specify a port range in the format of `&lt;start port number&gt;/&lt;end port number&gt;`. Example: `1024/1055`, which indicates the port range of `1024` through `1055`.
     * 
     */
    @Export(name="port", type=String.class, parameters={})
    private Output<String> port;

    /**
     * @return The port range. Valid values of port numbers: `1` to `65535`. Specify a port range in the format of `&lt;start port number&gt;/&lt;end port number&gt;`. Example: `1024/1055`, which indicates the port range of `1024` through `1055`.
     * 
     */
    public Output<String> port() {
        return this.port;
    }
    /**
     * The remarks of the firewall rule.
     * 
     */
    @Export(name="remark", type=String.class, parameters={})
    private Output</* @Nullable */ String> remark;

    /**
     * @return The remarks of the firewall rule.
     * 
     */
    public Output<Optional<String>> remark() {
        return Codegen.optional(this.remark);
    }
    /**
     * The transport layer protocol. Valid values: `Tcp`, `Udp`, `TcpAndUdp`.
     * 
     */
    @Export(name="ruleProtocol", type=String.class, parameters={})
    private Output<String> ruleProtocol;

    /**
     * @return The transport layer protocol. Valid values: `Tcp`, `Udp`, `TcpAndUdp`.
     * 
     */
    public Output<String> ruleProtocol() {
        return this.ruleProtocol;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallRule(String name) {
        this(name, FirewallRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallRule(String name, FirewallRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallRule(String name, FirewallRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:simpleapplicationserver/firewallRule:FirewallRule", name, args == null ? FirewallRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallRule(String name, Output<String> id, @Nullable FirewallRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:simpleapplicationserver/firewallRule:FirewallRule", name, state, makeResourceOptions(options, id));
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
    public static FirewallRule get(String name, Output<String> id, @Nullable FirewallRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirewallRule(name, id, state, options);
    }
}
