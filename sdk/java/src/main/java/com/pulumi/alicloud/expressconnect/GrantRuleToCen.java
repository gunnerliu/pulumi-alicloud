// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.expressconnect.GrantRuleToCenArgs;
import com.pulumi.alicloud.expressconnect.inputs.GrantRuleToCenState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Express Connect Grant Rule To Cen resource.
 * 
 * For information about Express Connect Grant Rule To Cen and how to use it, see [What is Grant Rule To Cen](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/grantinstancetocen).
 * 
 * &gt; **NOTE:** Available since v1.196.0.
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
 * import com.pulumi.alicloud.expressconnect.ExpressconnectFunctions;
 * import com.pulumi.alicloud.expressconnect.inputs.GetPhysicalConnectionsArgs;
 * import com.pulumi.random.RandomInteger;
 * import com.pulumi.random.RandomIntegerArgs;
 * import com.pulumi.alicloud.expressconnect.VirtualBorderRouter;
 * import com.pulumi.alicloud.expressconnect.VirtualBorderRouterArgs;
 * import com.pulumi.alicloud.cen.Instance;
 * import com.pulumi.alicloud.cen.InstanceArgs;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.expressconnect.GrantRuleToCen;
 * import com.pulumi.alicloud.expressconnect.GrantRuleToCenArgs;
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
 *         final var examplePhysicalConnections = ExpressconnectFunctions.getPhysicalConnections(GetPhysicalConnectionsArgs.builder()
 *             .nameRegex(&#34;^preserved-NODELETING&#34;)
 *             .build());
 * 
 *         var vlanId = new RandomInteger(&#34;vlanId&#34;, RandomIntegerArgs.builder()        
 *             .max(2999)
 *             .min(1)
 *             .build());
 * 
 *         var exampleVirtualBorderRouter = new VirtualBorderRouter(&#34;exampleVirtualBorderRouter&#34;, VirtualBorderRouterArgs.builder()        
 *             .localGatewayIp(&#34;10.0.0.1&#34;)
 *             .peerGatewayIp(&#34;10.0.0.2&#34;)
 *             .peeringSubnetMask(&#34;255.255.255.252&#34;)
 *             .physicalConnectionId(examplePhysicalConnections.applyValue(getPhysicalConnectionsResult -&gt; getPhysicalConnectionsResult.connections()[0].id()))
 *             .virtualBorderRouterName(name)
 *             .vlanId(vlanId.id())
 *             .minRxInterval(1000)
 *             .minTxInterval(1000)
 *             .detectMultiplier(10)
 *             .build());
 * 
 *         var exampleInstance = new Instance(&#34;exampleInstance&#34;, InstanceArgs.builder()        
 *             .cenInstanceName(name)
 *             .build());
 * 
 *         final var default = AlicloudFunctions.getAccount();
 * 
 *         var exampleGrantRuleToCen = new GrantRuleToCen(&#34;exampleGrantRuleToCen&#34;, GrantRuleToCenArgs.builder()        
 *             .cenId(exampleInstance.id())
 *             .cenOwnerId(default_.id())
 *             .instanceId(exampleVirtualBorderRouter.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Express Connect Grant Rule To Cen can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:expressconnect/grantRuleToCen:GrantRuleToCen example &lt;cen_id&gt;:&lt;cen_owner_id&gt;:&lt;instance_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:expressconnect/grantRuleToCen:GrantRuleToCen")
public class GrantRuleToCen extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the CEN instance to which you want to grant permissions.
     * 
     */
    @Export(name="cenId", refs={String.class}, tree="[0]")
    private Output<String> cenId;

    /**
     * @return The ID of the CEN instance to which you want to grant permissions.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }
    /**
     * The user ID (UID) of the Alibaba Cloud account to which the CEN instance belongs.
     * 
     */
    @Export(name="cenOwnerId", refs={Integer.class}, tree="[0]")
    private Output<Integer> cenOwnerId;

    /**
     * @return The user ID (UID) of the Alibaba Cloud account to which the CEN instance belongs.
     * 
     */
    public Output<Integer> cenOwnerId() {
        return this.cenOwnerId;
    }
    /**
     * The ID of the VBR.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The ID of the VBR.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GrantRuleToCen(String name) {
        this(name, GrantRuleToCenArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GrantRuleToCen(String name, GrantRuleToCenArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GrantRuleToCen(String name, GrantRuleToCenArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:expressconnect/grantRuleToCen:GrantRuleToCen", name, args == null ? GrantRuleToCenArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GrantRuleToCen(String name, Output<String> id, @Nullable GrantRuleToCenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:expressconnect/grantRuleToCen:GrantRuleToCen", name, state, makeResourceOptions(options, id));
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
    public static GrantRuleToCen get(String name, Output<String> id, @Nullable GrantRuleToCenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GrantRuleToCen(name, id, state, options);
    }
}
