// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.EcsDeploymentSetArgs;
import com.pulumi.alicloud.ecs.inputs.EcsDeploymentSetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ECS Deployment Set resource.
 * 
 * For information about ECS Deployment Set and how to use it, see [What is Deployment Set](https://www.alibabacloud.com/help/en/doc-detail/91269.htm).
 * 
 * &gt; **NOTE:** Available in v1.140.0+.
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
 * import com.pulumi.alicloud.ecs.EcsDeploymentSet;
 * import com.pulumi.alicloud.ecs.EcsDeploymentSetArgs;
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
 *         var default_ = new EcsDeploymentSet(&#34;default&#34;, EcsDeploymentSetArgs.builder()        
 *             .deploymentSetName(&#34;example_value&#34;)
 *             .description(&#34;example_value&#34;)
 *             .domain(&#34;Default&#34;)
 *             .granularity(&#34;Host&#34;)
 *             .strategy(&#34;Availability&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ECS Deployment Set can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ecs/ecsDeploymentSet:EcsDeploymentSet example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/ecsDeploymentSet:EcsDeploymentSet")
public class EcsDeploymentSet extends com.pulumi.resources.CustomResource {
    /**
     * The name of the deployment set. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="deploymentSetName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deploymentSetName;

    /**
     * @return The name of the deployment set. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> deploymentSetName() {
        return Codegen.optional(this.deploymentSetName);
    }
    /**
     * The description of the deployment set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the deployment set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The deployment domain. Valid values: `Default`.
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> domain;

    /**
     * @return The deployment domain. Valid values: `Default`.
     * 
     */
    public Output<Optional<String>> domain() {
        return Codegen.optional(this.domain);
    }
    /**
     * The deployment granularity. Valid values: `Host`.
     * 
     */
    @Export(name="granularity", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> granularity;

    /**
     * @return The deployment granularity. Valid values: `Host`.
     * 
     */
    public Output<Optional<String>> granularity() {
        return Codegen.optional(this.granularity);
    }
    /**
     * The on unable to redeploy failed instance. Valid values: `CancelMembershipAndStart`, `KeepStopped`.
     * 
     */
    @Export(name="onUnableToRedeployFailedInstance", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onUnableToRedeployFailedInstance;

    /**
     * @return The on unable to redeploy failed instance. Valid values: `CancelMembershipAndStart`, `KeepStopped`.
     * 
     */
    public Output<Optional<String>> onUnableToRedeployFailedInstance() {
        return Codegen.optional(this.onUnableToRedeployFailedInstance);
    }
    /**
     * The deployment strategy. Valid values: `Availability`.
     * 
     */
    @Export(name="strategy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> strategy;

    /**
     * @return The deployment strategy. Valid values: `Availability`.
     * 
     */
    public Output<Optional<String>> strategy() {
        return Codegen.optional(this.strategy);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EcsDeploymentSet(String name) {
        this(name, EcsDeploymentSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EcsDeploymentSet(String name, @Nullable EcsDeploymentSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EcsDeploymentSet(String name, @Nullable EcsDeploymentSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsDeploymentSet:EcsDeploymentSet", name, args == null ? EcsDeploymentSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EcsDeploymentSet(String name, Output<String> id, @Nullable EcsDeploymentSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsDeploymentSet:EcsDeploymentSet", name, state, makeResourceOptions(options, id));
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
    public static EcsDeploymentSet get(String name, Output<String> id, @Nullable EcsDeploymentSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EcsDeploymentSet(name, id, state, options);
    }
}
