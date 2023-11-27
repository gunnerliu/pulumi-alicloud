// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cs.RegistryEnterpriseRepoArgs;
import com.pulumi.alicloud.cs.inputs.RegistryEnterpriseRepoState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource will help you to manager Container Registry Enterprise Edition repositories.
 * 
 * For information about Container Registry Enterprise Edition repository and how to use it, see [Create a Repository](https://www.alibabacloud.com/help/en/acr/developer-reference/api-cr-2018-12-01-createrepository)
 * 
 * &gt; **NOTE:** Available since v1.86.0.
 * 
 * &gt; **NOTE:** You need to set your registry password in Container Registry Enterprise Edition console before use this resource.
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
 * import com.pulumi.alicloud.cr.RegistryEnterpriseInstance;
 * import com.pulumi.alicloud.cr.RegistryEnterpriseInstanceArgs;
 * import com.pulumi.alicloud.cs.RegistryEnterpriseNamespace;
 * import com.pulumi.alicloud.cs.RegistryEnterpriseNamespaceArgs;
 * import com.pulumi.alicloud.cs.RegistryEnterpriseRepo;
 * import com.pulumi.alicloud.cs.RegistryEnterpriseRepoArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;terraform-example&#34;);
 *         var exampleRegistryEnterpriseInstance = new RegistryEnterpriseInstance(&#34;exampleRegistryEnterpriseInstance&#34;, RegistryEnterpriseInstanceArgs.builder()        
 *             .paymentType(&#34;Subscription&#34;)
 *             .period(1)
 *             .renewPeriod(0)
 *             .renewalStatus(&#34;ManualRenewal&#34;)
 *             .instanceType(&#34;Advanced&#34;)
 *             .instanceName(name)
 *             .build());
 * 
 *         var exampleRegistryEnterpriseNamespace = new RegistryEnterpriseNamespace(&#34;exampleRegistryEnterpriseNamespace&#34;, RegistryEnterpriseNamespaceArgs.builder()        
 *             .instanceId(exampleRegistryEnterpriseInstance.id())
 *             .autoCreate(false)
 *             .defaultVisibility(&#34;PUBLIC&#34;)
 *             .build());
 * 
 *         var exampleRegistryEnterpriseRepo = new RegistryEnterpriseRepo(&#34;exampleRegistryEnterpriseRepo&#34;, RegistryEnterpriseRepoArgs.builder()        
 *             .instanceId(exampleRegistryEnterpriseInstance.id())
 *             .namespace(exampleRegistryEnterpriseNamespace.name())
 *             .summary(&#34;this is summary of my new repo&#34;)
 *             .repoType(&#34;PUBLIC&#34;)
 *             .detail(&#34;this is a public repo&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Container Registry Enterprise Edition repository can be imported using the `{instance_id}:{namespace}:{repository}`, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cs/registryEnterpriseRepo:RegistryEnterpriseRepo default `cri-xxx:my-namespace:my-repo`
 * ```
 * 
 */
@ResourceType(type="alicloud:cs/registryEnterpriseRepo:RegistryEnterpriseRepo")
public class RegistryEnterpriseRepo extends com.pulumi.resources.CustomResource {
    /**
     * The repository specific information. MarkDown format is supported, and the length limit is 2000.
     * 
     */
    @Export(name="detail", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> detail;

    /**
     * @return The repository specific information. MarkDown format is supported, and the length limit is 2000.
     * 
     */
    public Output<Optional<String>> detail() {
        return Codegen.optional(this.detail);
    }
    /**
     * ID of Container Registry Enterprise Edition instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return ID of Container Registry Enterprise Edition instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Name of Container Registry Enterprise Edition repository. It can contain 2 to 64 characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of Container Registry Enterprise Edition repository. It can contain 2 to 64 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Name of Container Registry Enterprise Edition namespace where repository is located. It can contain 2 to 30 characters.
     * 
     */
    @Export(name="namespace", refs={String.class}, tree="[0]")
    private Output<String> namespace;

    /**
     * @return Name of Container Registry Enterprise Edition namespace where repository is located. It can contain 2 to 30 characters.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }
    /**
     * The uuid of Container Registry Enterprise Edition repository.
     * 
     */
    @Export(name="repoId", refs={String.class}, tree="[0]")
    private Output<String> repoId;

    /**
     * @return The uuid of Container Registry Enterprise Edition repository.
     * 
     */
    public Output<String> repoId() {
        return this.repoId;
    }
    /**
     * `PUBLIC` or `PRIVATE`, repo&#39;s visibility.
     * 
     */
    @Export(name="repoType", refs={String.class}, tree="[0]")
    private Output<String> repoType;

    /**
     * @return `PUBLIC` or `PRIVATE`, repo&#39;s visibility.
     * 
     */
    public Output<String> repoType() {
        return this.repoType;
    }
    /**
     * The repository general information. It can contain 1 to 100 characters.
     * 
     */
    @Export(name="summary", refs={String.class}, tree="[0]")
    private Output<String> summary;

    /**
     * @return The repository general information. It can contain 1 to 100 characters.
     * 
     */
    public Output<String> summary() {
        return this.summary;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegistryEnterpriseRepo(String name) {
        this(name, RegistryEnterpriseRepoArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegistryEnterpriseRepo(String name, RegistryEnterpriseRepoArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegistryEnterpriseRepo(String name, RegistryEnterpriseRepoArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cs/registryEnterpriseRepo:RegistryEnterpriseRepo", name, args == null ? RegistryEnterpriseRepoArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegistryEnterpriseRepo(String name, Output<String> id, @Nullable RegistryEnterpriseRepoState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cs/registryEnterpriseRepo:RegistryEnterpriseRepo", name, state, makeResourceOptions(options, id));
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
    public static RegistryEnterpriseRepo get(String name, Output<String> id, @Nullable RegistryEnterpriseRepoState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegistryEnterpriseRepo(name, id, state, options);
    }
}
