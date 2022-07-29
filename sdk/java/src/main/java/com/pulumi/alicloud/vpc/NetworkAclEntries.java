// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.NetworkAclEntriesArgs;
import com.pulumi.alicloud.vpc.inputs.NetworkAclEntriesState;
import com.pulumi.alicloud.vpc.outputs.NetworkAclEntriesEgress;
import com.pulumi.alicloud.vpc.outputs.NetworkAclEntriesIngress;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 */
@ResourceType(type="alicloud:vpc/networkAclEntries:NetworkAclEntries")
public class NetworkAclEntries extends com.pulumi.resources.CustomResource {
    /**
     * List of the egress entries of the network acl. The order of the egress entries determines the priority. The details see Block Egress.
     * 
     */
    @Export(name="egresses", type=List.class, parameters={NetworkAclEntriesEgress.class})
    private Output</* @Nullable */ List<NetworkAclEntriesEgress>> egresses;

    /**
     * @return List of the egress entries of the network acl. The order of the egress entries determines the priority. The details see Block Egress.
     * 
     */
    public Output<Optional<List<NetworkAclEntriesEgress>>> egresses() {
        return Codegen.optional(this.egresses);
    }
    /**
     * List of the ingress entries of the network acl. The order of the ingress entries determines the priority. The details see Block Ingress.
     * 
     */
    @Export(name="ingresses", type=List.class, parameters={NetworkAclEntriesIngress.class})
    private Output</* @Nullable */ List<NetworkAclEntriesIngress>> ingresses;

    /**
     * @return List of the ingress entries of the network acl. The order of the ingress entries determines the priority. The details see Block Ingress.
     * 
     */
    public Output<Optional<List<NetworkAclEntriesIngress>>> ingresses() {
        return Codegen.optional(this.ingresses);
    }
    /**
     * The id of the network acl, the field can&#39;t be changed.
     * 
     */
    @Export(name="networkAclId", type=String.class, parameters={})
    private Output<String> networkAclId;

    /**
     * @return The id of the network acl, the field can&#39;t be changed.
     * 
     */
    public Output<String> networkAclId() {
        return this.networkAclId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkAclEntries(String name) {
        this(name, NetworkAclEntriesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkAclEntries(String name, NetworkAclEntriesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkAclEntries(String name, NetworkAclEntriesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/networkAclEntries:NetworkAclEntries", name, args == null ? NetworkAclEntriesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkAclEntries(String name, Output<String> id, @Nullable NetworkAclEntriesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/networkAclEntries:NetworkAclEntries", name, state, makeResourceOptions(options, id));
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
    public static NetworkAclEntries get(String name, Output<String> id, @Nullable NetworkAclEntriesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkAclEntries(name, id, state, options);
    }
}
