// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cs.RegistryEnterpriseSyncRuleArgs;
import com.pulumi.alicloud.cs.inputs.RegistryEnterpriseSyncRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource will help you to manager Container Registry Enterprise Edition sync rules.
 * 
 * For information about Container Registry Enterprise Edition sync rules and how to use it, see [Create a Sync Rule](https://www.alibabacloud.com/help/en/acr/developer-reference/api-cr-2018-12-01-createreposynctaskbyrule)
 * 
 * &gt; **NOTE:** Available since v1.90.0.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetRegionsArgs;
 * import com.pulumi.alicloud.cs.RegistryEnterpriseSyncRule;
 * import com.pulumi.alicloud.cs.RegistryEnterpriseSyncRuleArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-example&#34;);
 *         var sourceRegistryEnterpriseInstance = new RegistryEnterpriseInstance(&#34;sourceRegistryEnterpriseInstance&#34;, RegistryEnterpriseInstanceArgs.builder()        
 *             .paymentType(&#34;Subscription&#34;)
 *             .period(1)
 *             .renewPeriod(0)
 *             .renewalStatus(&#34;ManualRenewal&#34;)
 *             .instanceType(&#34;Advanced&#34;)
 *             .instanceName(String.format(&#34;%s-source&#34;, name))
 *             .build());
 * 
 *         var targetRegistryEnterpriseInstance = new RegistryEnterpriseInstance(&#34;targetRegistryEnterpriseInstance&#34;, RegistryEnterpriseInstanceArgs.builder()        
 *             .paymentType(&#34;Subscription&#34;)
 *             .period(1)
 *             .renewPeriod(0)
 *             .renewalStatus(&#34;ManualRenewal&#34;)
 *             .instanceType(&#34;Advanced&#34;)
 *             .instanceName(String.format(&#34;%s-target&#34;, name))
 *             .build());
 * 
 *         var sourceRegistryEnterpriseNamespace = new RegistryEnterpriseNamespace(&#34;sourceRegistryEnterpriseNamespace&#34;, RegistryEnterpriseNamespaceArgs.builder()        
 *             .instanceId(sourceRegistryEnterpriseInstance.id())
 *             .autoCreate(false)
 *             .defaultVisibility(&#34;PUBLIC&#34;)
 *             .build());
 * 
 *         var targetRegistryEnterpriseNamespace = new RegistryEnterpriseNamespace(&#34;targetRegistryEnterpriseNamespace&#34;, RegistryEnterpriseNamespaceArgs.builder()        
 *             .instanceId(targetRegistryEnterpriseInstance.id())
 *             .autoCreate(false)
 *             .defaultVisibility(&#34;PUBLIC&#34;)
 *             .build());
 * 
 *         var sourceRegistryEnterpriseRepo = new RegistryEnterpriseRepo(&#34;sourceRegistryEnterpriseRepo&#34;, RegistryEnterpriseRepoArgs.builder()        
 *             .instanceId(sourceRegistryEnterpriseInstance.id())
 *             .namespace(sourceRegistryEnterpriseNamespace.name())
 *             .summary(&#34;this is summary of my new repo&#34;)
 *             .repoType(&#34;PUBLIC&#34;)
 *             .detail(&#34;this is a public repo&#34;)
 *             .build());
 * 
 *         var targetRegistryEnterpriseRepo = new RegistryEnterpriseRepo(&#34;targetRegistryEnterpriseRepo&#34;, RegistryEnterpriseRepoArgs.builder()        
 *             .instanceId(targetRegistryEnterpriseInstance.id())
 *             .namespace(targetRegistryEnterpriseNamespace.name())
 *             .summary(&#34;this is summary of my new repo&#34;)
 *             .repoType(&#34;PUBLIC&#34;)
 *             .detail(&#34;this is a public repo&#34;)
 *             .build());
 * 
 *         final var defaultRegions = AlicloudFunctions.getRegions(GetRegionsArgs.builder()
 *             .current(true)
 *             .build());
 * 
 *         var defaultRegistryEnterpriseSyncRule = new RegistryEnterpriseSyncRule(&#34;defaultRegistryEnterpriseSyncRule&#34;, RegistryEnterpriseSyncRuleArgs.builder()        
 *             .instanceId(sourceRegistryEnterpriseInstance.id())
 *             .namespaceName(sourceRegistryEnterpriseNamespace.name())
 *             .targetRegionId(defaultRegions.applyValue(getRegionsResult -&gt; getRegionsResult.regions()[0].id()))
 *             .targetInstanceId(targetRegistryEnterpriseInstance.id())
 *             .targetNamespaceName(targetRegistryEnterpriseNamespace.name())
 *             .tagFilter(&#34;.*&#34;)
 *             .repoName(sourceRegistryEnterpriseRepo.name())
 *             .targetRepoName(targetRegistryEnterpriseRepo.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Container Registry Enterprise Edition sync rule can be imported using the id. Format to `{instance_id}:{namespace_name}:{rule_id}`, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cs/registryEnterpriseSyncRule:RegistryEnterpriseSyncRule default `cri-xxx:my-namespace:crsr-yyy`
 * ```
 * 
 */
@ResourceType(type="alicloud:cs/registryEnterpriseSyncRule:RegistryEnterpriseSyncRule")
public class RegistryEnterpriseSyncRule extends com.pulumi.resources.CustomResource {
    /**
     * ID of Container Registry Enterprise Edition source instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return ID of Container Registry Enterprise Edition source instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Name of Container Registry Enterprise Edition sync rule.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of Container Registry Enterprise Edition sync rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Name of Container Registry Enterprise Edition source namespace. It can contain 2 to 30 characters.
     * 
     */
    @Export(name="namespaceName", refs={String.class}, tree="[0]")
    private Output<String> namespaceName;

    /**
     * @return Name of Container Registry Enterprise Edition source namespace. It can contain 2 to 30 characters.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }
    /**
     * Name of the source repository which should be set together with `target_repo_name`, if empty means that the synchronization scope is the entire namespace level.
     * 
     */
    @Export(name="repoName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> repoName;

    /**
     * @return Name of the source repository which should be set together with `target_repo_name`, if empty means that the synchronization scope is the entire namespace level.
     * 
     */
    public Output<Optional<String>> repoName() {
        return Codegen.optional(this.repoName);
    }
    /**
     * The uuid of Container Registry Enterprise Edition sync rule.
     * 
     */
    @Export(name="ruleId", refs={String.class}, tree="[0]")
    private Output<String> ruleId;

    /**
     * @return The uuid of Container Registry Enterprise Edition sync rule.
     * 
     */
    public Output<String> ruleId() {
        return this.ruleId;
    }
    /**
     * `FROM` or `TO`, the direction of synchronization. `FROM` means source instance, `TO` means target instance.
     * 
     */
    @Export(name="syncDirection", refs={String.class}, tree="[0]")
    private Output<String> syncDirection;

    /**
     * @return `FROM` or `TO`, the direction of synchronization. `FROM` means source instance, `TO` means target instance.
     * 
     */
    public Output<String> syncDirection() {
        return this.syncDirection;
    }
    /**
     * `REPO` or `NAMESPACE`,the scope that the synchronization rule applies.
     * 
     */
    @Export(name="syncScope", refs={String.class}, tree="[0]")
    private Output<String> syncScope;

    /**
     * @return `REPO` or `NAMESPACE`,the scope that the synchronization rule applies.
     * 
     */
    public Output<String> syncScope() {
        return this.syncScope;
    }
    /**
     * The regular expression used to filter image tags for synchronization in the source repository.
     * 
     */
    @Export(name="tagFilter", refs={String.class}, tree="[0]")
    private Output<String> tagFilter;

    /**
     * @return The regular expression used to filter image tags for synchronization in the source repository.
     * 
     */
    public Output<String> tagFilter() {
        return this.tagFilter;
    }
    /**
     * ID of Container Registry Enterprise Edition target instance to be synchronized.
     * 
     */
    @Export(name="targetInstanceId", refs={String.class}, tree="[0]")
    private Output<String> targetInstanceId;

    /**
     * @return ID of Container Registry Enterprise Edition target instance to be synchronized.
     * 
     */
    public Output<String> targetInstanceId() {
        return this.targetInstanceId;
    }
    /**
     * Name of Container Registry Enterprise Edition target namespace to be synchronized. It can contain 2 to 30 characters.
     * 
     */
    @Export(name="targetNamespaceName", refs={String.class}, tree="[0]")
    private Output<String> targetNamespaceName;

    /**
     * @return Name of Container Registry Enterprise Edition target namespace to be synchronized. It can contain 2 to 30 characters.
     * 
     */
    public Output<String> targetNamespaceName() {
        return this.targetNamespaceName;
    }
    /**
     * The target region to be synchronized.
     * 
     */
    @Export(name="targetRegionId", refs={String.class}, tree="[0]")
    private Output<String> targetRegionId;

    /**
     * @return The target region to be synchronized.
     * 
     */
    public Output<String> targetRegionId() {
        return this.targetRegionId;
    }
    /**
     * Name of the target repository.
     * 
     */
    @Export(name="targetRepoName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> targetRepoName;

    /**
     * @return Name of the target repository.
     * 
     */
    public Output<Optional<String>> targetRepoName() {
        return Codegen.optional(this.targetRepoName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegistryEnterpriseSyncRule(String name) {
        this(name, RegistryEnterpriseSyncRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegistryEnterpriseSyncRule(String name, RegistryEnterpriseSyncRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegistryEnterpriseSyncRule(String name, RegistryEnterpriseSyncRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cs/registryEnterpriseSyncRule:RegistryEnterpriseSyncRule", name, args == null ? RegistryEnterpriseSyncRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegistryEnterpriseSyncRule(String name, Output<String> id, @Nullable RegistryEnterpriseSyncRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cs/registryEnterpriseSyncRule:RegistryEnterpriseSyncRule", name, state, makeResourceOptions(options, id));
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
    public static RegistryEnterpriseSyncRule get(String name, Output<String> id, @Nullable RegistryEnterpriseSyncRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegistryEnterpriseSyncRule(name, id, state, options);
    }
}
