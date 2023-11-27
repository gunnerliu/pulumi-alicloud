// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.apigateway.GroupArgs;
import com.pulumi.alicloud.apigateway.inputs.GroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.apigateway.Group;
 * import com.pulumi.alicloud.apigateway.GroupArgs;
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
 *         var default_ = new Group(&#34;default&#34;, GroupArgs.builder()        
 *             .description(&#34;tf_example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Api gateway group can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:apigateway/group:Group example &#34;ab2351f2ce904edaa8d92a0510832b91&#34;
 * ```
 * 
 */
@ResourceType(type="alicloud:apigateway/group:Group")
public class Group extends com.pulumi.resources.CustomResource {
    /**
     * The description of the api gateway group. Defaults to null.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The description of the api gateway group. Defaults to null.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The id of the api gateway.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The id of the api gateway.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The name of the api gateway group. Defaults to null.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the api gateway group. Defaults to null.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * (Available in 1.69.0+)	Second-level domain name automatically assigned to the API group.
     * 
     */
    @Export(name="subDomain", refs={String.class}, tree="[0]")
    private Output<String> subDomain;

    /**
     * @return (Available in 1.69.0+)	Second-level domain name automatically assigned to the API group.
     * 
     */
    public Output<String> subDomain() {
        return this.subDomain;
    }
    /**
     * (Available in 1.69.0+)	Second-level VPC domain name automatically assigned to the API group.
     * 
     */
    @Export(name="vpcDomain", refs={String.class}, tree="[0]")
    private Output<String> vpcDomain;

    /**
     * @return (Available in 1.69.0+)	Second-level VPC domain name automatically assigned to the API group.
     * 
     */
    public Output<String> vpcDomain() {
        return this.vpcDomain;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Group(String name) {
        this(name, GroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Group(String name, GroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Group(String name, GroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:apigateway/group:Group", name, args == null ? GroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Group(String name, Output<String> id, @Nullable GroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:apigateway/group:Group", name, state, makeResourceOptions(options, id));
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
    public static Group get(String name, Output<String> id, @Nullable GroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Group(name, id, state, options);
    }
}
