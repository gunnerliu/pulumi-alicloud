// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.TransitRouterRouteTableAssociationArgs;
import com.pulumi.alicloud.cen.inputs.TransitRouterRouteTableAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CEN transit router route table association resource.[What is Cen Transit Router Route Table Association](https://help.aliyun.com/document_detail/261242.html)
 * 
 * &gt; **NOTE:** Available in 1.126.0+
 * 
 * ## Import
 * 
 * CEN transit router route table association can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cen/transitRouterRouteTableAssociation:TransitRouterRouteTableAssociation default tr-********:tr-attach-********
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/transitRouterRouteTableAssociation:TransitRouterRouteTableAssociation")
public class TransitRouterRouteTableAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The dry run.
     * 
     */
    @Export(name="dryRun", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The associating status of the network.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The associating status of the network.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The ID the transit router attachment.
     * 
     */
    @Export(name="transitRouterAttachmentId", type=String.class, parameters={})
    private Output<String> transitRouterAttachmentId;

    /**
     * @return The ID the transit router attachment.
     * 
     */
    public Output<String> transitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }
    /**
     * The ID of the transit router route table.
     * 
     */
    @Export(name="transitRouterRouteTableId", type=String.class, parameters={})
    private Output<String> transitRouterRouteTableId;

    /**
     * @return The ID of the transit router route table.
     * 
     */
    public Output<String> transitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitRouterRouteTableAssociation(String name) {
        this(name, TransitRouterRouteTableAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitRouterRouteTableAssociation(String name, TransitRouterRouteTableAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitRouterRouteTableAssociation(String name, TransitRouterRouteTableAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterRouteTableAssociation:TransitRouterRouteTableAssociation", name, args == null ? TransitRouterRouteTableAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitRouterRouteTableAssociation(String name, Output<String> id, @Nullable TransitRouterRouteTableAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterRouteTableAssociation:TransitRouterRouteTableAssociation", name, state, makeResourceOptions(options, id));
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
    public static TransitRouterRouteTableAssociation get(String name, Output<String> id, @Nullable TransitRouterRouteTableAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitRouterRouteTableAssociation(name, id, state, options);
    }
}
