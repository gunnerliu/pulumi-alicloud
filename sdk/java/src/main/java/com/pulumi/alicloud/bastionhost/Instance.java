// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.bastionhost.InstanceArgs;
import com.pulumi.alicloud.bastionhost.inputs.InstanceState;
import com.pulumi.alicloud.bastionhost.outputs.InstanceAdAuthServer;
import com.pulumi.alicloud.bastionhost.outputs.InstanceLdapAuthServer;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Yundun_bastionhost instance can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:bastionhost/instance:Instance example bastionhost-exampe123456
 * ```
 * 
 */
@ResourceType(type="alicloud:bastionhost/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * The AD auth server of the Instance. See the following `Block ad_auth_server`.
     * 
     */
    @Export(name="adAuthServers", type=List.class, parameters={InstanceAdAuthServer.class})
    private Output<List<InstanceAdAuthServer>> adAuthServers;

    /**
     * @return The AD auth server of the Instance. See the following `Block ad_auth_server`.
     * 
     */
    public Output<List<InstanceAdAuthServer>> adAuthServers() {
        return this.adAuthServers;
    }
    /**
     * Description of the instance. This name can have a string of 1 to 63 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the instance. This name can have a string of 1 to 63 characters.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Whether to Enable the public internet access to a specified Bastionhost instance. The valid values: `true`, `false`.
     * 
     */
    @Export(name="enablePublicAccess", type=Boolean.class, parameters={})
    private Output<Boolean> enablePublicAccess;

    /**
     * @return Whether to Enable the public internet access to a specified Bastionhost instance. The valid values: `true`, `false`.
     * 
     */
    public Output<Boolean> enablePublicAccess() {
        return this.enablePublicAccess;
    }
    /**
     * The LDAP auth server of the Instance. See the following `Block ldap_auth_server`.
     * 
     */
    @Export(name="ldapAuthServers", type=List.class, parameters={InstanceLdapAuthServer.class})
    private Output<List<InstanceLdapAuthServer>> ldapAuthServers;

    /**
     * @return The LDAP auth server of the Instance. See the following `Block ldap_auth_server`.
     * 
     */
    public Output<List<InstanceLdapAuthServer>> ldapAuthServers() {
        return this.ldapAuthServers;
    }
    /**
     * The package type of Cloud Bastionhost instance. You can query more supported types through the [DescribePricingModule](https://help.aliyun.com/document_detail/96469.html).
     * 
     */
    @Export(name="licenseCode", type=String.class, parameters={})
    private Output<String> licenseCode;

    /**
     * @return The package type of Cloud Bastionhost instance. You can query more supported types through the [DescribePricingModule](https://help.aliyun.com/document_detail/96469.html).
     * 
     */
    public Output<String> licenseCode() {
        return this.licenseCode;
    }
    @Export(name="period", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> period;

    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * The Id of resource group which the Bastionhost Instance belongs. If not set, the resource is created in the default resource group.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroupId;

    /**
     * @return The Id of resource group which the Bastionhost Instance belongs. If not set, the resource is created in the default resource group.
     * 
     */
    public Output<Optional<String>> resourceGroupId() {
        return Codegen.optional(this.resourceGroupId);
    }
    @Export(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output<List<String>> securityGroupIds;

    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * VSwitch ID configured to Bastionhost.
     * 
     */
    @Export(name="vswitchId", type=String.class, parameters={})
    private Output<String> vswitchId;

    /**
     * @return VSwitch ID configured to Bastionhost.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
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
        super("alicloud:bastionhost/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:bastionhost/instance:Instance", name, state, makeResourceOptions(options, id));
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
