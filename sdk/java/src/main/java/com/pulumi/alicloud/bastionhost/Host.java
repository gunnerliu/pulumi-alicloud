// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.bastionhost.HostArgs;
import com.pulumi.alicloud.bastionhost.inputs.HostState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Bastion Host Host resource.
 * 
 * For information about Bastion Host Host and how to use it, see [What is Host](https://www.alibabacloud.com/help/en/doc-detail/201330.htm).
 * 
 * &gt; **NOTE:** Available in v1.135.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Bastion Host Host can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:bastionhost/host:Host example &lt;instance_id&gt;:&lt;host_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:bastionhost/host:Host")
public class Host extends com.pulumi.resources.CustomResource {
    /**
     * Specify the new create a host of address types. Valid values: `Public`: the IP address of a Public network. `Private`: Private network address.
     * 
     */
    @Export(name="activeAddressType", type=String.class, parameters={})
    private Output<String> activeAddressType;

    /**
     * @return Specify the new create a host of address types. Valid values: `Public`: the IP address of a Public network. `Private`: Private network address.
     * 
     */
    public Output<String> activeAddressType() {
        return this.activeAddressType;
    }
    /**
     * Specify a host of notes, supports up to 500 characters.
     * 
     */
    @Export(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specify a host of notes, supports up to 500 characters.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The host ID.
     * 
     */
    @Export(name="hostId", type=String.class, parameters={})
    private Output<String> hostId;

    /**
     * @return The host ID.
     * 
     */
    public Output<String> hostId() {
        return this.hostId;
    }
    /**
     * Specify the new create a host name of the supports up to 128 characters.
     * 
     */
    @Export(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    /**
     * @return Specify the new create a host name of the supports up to 128 characters.
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }
    /**
     * Specify the new create a host of the private network address, it is possible to use the domain name or IP ADDRESS. **NOTE:**  This parameter is required if the `active_address_type` parameter is set to `Private`.
     * 
     */
    @Export(name="hostPrivateAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostPrivateAddress;

    /**
     * @return Specify the new create a host of the private network address, it is possible to use the domain name or IP ADDRESS. **NOTE:**  This parameter is required if the `active_address_type` parameter is set to `Private`.
     * 
     */
    public Output<Optional<String>> hostPrivateAddress() {
        return Codegen.optional(this.hostPrivateAddress);
    }
    /**
     * Specify the new create a host of the IP address of a public network, it is possible to use the domain name or IP ADDRESS.
     * 
     */
    @Export(name="hostPublicAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostPublicAddress;

    /**
     * @return Specify the new create a host of the IP address of a public network, it is possible to use the domain name or IP ADDRESS.
     * 
     */
    public Output<Optional<String>> hostPublicAddress() {
        return Codegen.optional(this.hostPublicAddress);
    }
    /**
     * Specify the new create a host where the Bastion host ID of.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return Specify the new create a host where the Bastion host ID of.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The instance region id.
     * 
     */
    @Export(name="instanceRegionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceRegionId;

    /**
     * @return The instance region id.
     * 
     */
    public Output<Optional<String>> instanceRegionId() {
        return Codegen.optional(this.instanceRegionId);
    }
    /**
     * Specify the new create the host&#39;s operating system. Valid values: `Linux`,`Windows`.
     * 
     */
    @Export(name="osType", type=String.class, parameters={})
    private Output<String> osType;

    /**
     * @return Specify the new create the host&#39;s operating system. Valid values: `Linux`,`Windows`.
     * 
     */
    public Output<String> osType() {
        return this.osType;
    }
    /**
     * Specify the new create a host of source. Valid values:
     * * `Local`: localhost
     * * `Ecs`:ECS instance
     * * `Rds`:RDS exclusive cluster host.
     * 
     */
    @Export(name="source", type=String.class, parameters={})
    private Output<String> source;

    /**
     * @return Specify the new create a host of source. Valid values:
     * * `Local`: localhost
     * * `Ecs`:ECS instance
     * * `Rds`:RDS exclusive cluster host.
     * 
     */
    public Output<String> source() {
        return this.source;
    }
    /**
     * Specify the newly created ECS instance ID or dedicated cluster host ID. **NOTE:** This parameter is required if the `source` parameter is set to `Ecs` or `Rds`.
     * 
     */
    @Export(name="sourceInstanceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceInstanceId;

    /**
     * @return Specify the newly created ECS instance ID or dedicated cluster host ID. **NOTE:** This parameter is required if the `source` parameter is set to `Ecs` or `Rds`.
     * 
     */
    public Output<Optional<String>> sourceInstanceId() {
        return Codegen.optional(this.sourceInstanceId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Host(String name) {
        this(name, HostArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Host(String name, HostArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Host(String name, HostArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:bastionhost/host:Host", name, args == null ? HostArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Host(String name, Output<String> id, @Nullable HostState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:bastionhost/host:Host", name, state, makeResourceOptions(options, id));
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
    public static Host get(String name, Output<String> id, @Nullable HostState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Host(name, id, state, options);
    }
}
