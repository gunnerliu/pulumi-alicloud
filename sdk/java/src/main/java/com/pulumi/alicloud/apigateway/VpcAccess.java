// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.apigateway.VpcAccessArgs;
import com.pulumi.alicloud.apigateway.inputs.VpcAccessState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
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
 * import com.pulumi.alicloud.apigateway.VpcAccess;
 * import com.pulumi.alicloud.apigateway.VpcAccessArgs;
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
 *         var foo = new VpcAccess(&#34;foo&#34;, VpcAccessArgs.builder()        
 *             .instanceId(&#34;i-kai2ks92kzkw92ka&#34;)
 *             .port(8080)
 *             .vpcId(&#34;vpc-awkcj192ka9zalz&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Api gateway app can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:apigateway/vpcAccess:VpcAccess example &#34;APiGatewayVpc:vpc-aswcj19ajsz:i-ajdjfsdlf:8080&#34;
 * ```
 * 
 */
@ResourceType(type="alicloud:apigateway/vpcAccess:VpcAccess")
public class VpcAccess extends com.pulumi.resources.CustomResource {
    /**
     * ID of the instance in VPC (ECS/Server Load Balance).
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return ID of the instance in VPC (ECS/Server Load Balance).
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The name of the vpc authorization.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the vpc authorization.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * ID of the port corresponding to the instance.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return ID of the port corresponding to the instance.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * The vpc id of the vpc authorization.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The vpc id of the vpc authorization.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcAccess(String name) {
        this(name, VpcAccessArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcAccess(String name, VpcAccessArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcAccess(String name, VpcAccessArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:apigateway/vpcAccess:VpcAccess", name, args == null ? VpcAccessArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcAccess(String name, Output<String> id, @Nullable VpcAccessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:apigateway/vpcAccess:VpcAccess", name, state, makeResourceOptions(options, id));
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
    public static VpcAccess get(String name, Output<String> id, @Nullable VpcAccessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcAccess(name, id, state, options);
    }
}
