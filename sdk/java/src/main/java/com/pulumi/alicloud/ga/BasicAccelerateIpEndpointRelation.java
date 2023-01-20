// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ga.BasicAccelerateIpEndpointRelationArgs;
import com.pulumi.alicloud.ga.inputs.BasicAccelerateIpEndpointRelationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Global Accelerator (GA) Basic Accelerate Ip Endpoint Relation resource.
 * 
 * For information about Global Accelerator (GA) Basic Accelerate Ip Endpoint Relation and how to use it, see [What is Basic Accelerate Ip Endpoint Relation](https://help.aliyun.com/document_detail/466842.html).
 * 
 * &gt; **NOTE:** Available in v1.194.0+.
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
 * import com.pulumi.alicloud.ga.BasicAccelerateIpEndpointRelation;
 * import com.pulumi.alicloud.ga.BasicAccelerateIpEndpointRelationArgs;
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
 *         var default_ = new BasicAccelerateIpEndpointRelation(&#34;default&#34;, BasicAccelerateIpEndpointRelationArgs.builder()        
 *             .accelerateIpId(&#34;your_accelerate_ip_id&#34;)
 *             .acceleratorId(&#34;your_accelerator_id&#34;)
 *             .endpointId(&#34;your_endpoint_id&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Global Accelerator (GA) Basic Accelerate Ip Endpoint Relation can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ga/basicAccelerateIpEndpointRelation:BasicAccelerateIpEndpointRelation example &lt;accelerator_id&gt;:&lt;accelerate_ip_id&gt;:&lt;endpoint_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ga/basicAccelerateIpEndpointRelation:BasicAccelerateIpEndpointRelation")
public class BasicAccelerateIpEndpointRelation extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Basic Accelerate IP.
     * 
     */
    @Export(name="accelerateIpId", type=String.class, parameters={})
    private Output<String> accelerateIpId;

    /**
     * @return The ID of the Basic Accelerate IP.
     * 
     */
    public Output<String> accelerateIpId() {
        return this.accelerateIpId;
    }
    /**
     * The ID of the Basic GA instance.
     * 
     */
    @Export(name="acceleratorId", type=String.class, parameters={})
    private Output<String> acceleratorId;

    /**
     * @return The ID of the Basic GA instance.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }
    /**
     * The ID of the Basic Endpoint.
     * 
     */
    @Export(name="endpointId", type=String.class, parameters={})
    private Output<String> endpointId;

    /**
     * @return The ID of the Basic Endpoint.
     * 
     */
    public Output<String> endpointId() {
        return this.endpointId;
    }
    /**
     * The status of the Basic Accelerate Ip Endpoint Relation.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the Basic Accelerate Ip Endpoint Relation.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BasicAccelerateIpEndpointRelation(String name) {
        this(name, BasicAccelerateIpEndpointRelationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BasicAccelerateIpEndpointRelation(String name, BasicAccelerateIpEndpointRelationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BasicAccelerateIpEndpointRelation(String name, BasicAccelerateIpEndpointRelationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/basicAccelerateIpEndpointRelation:BasicAccelerateIpEndpointRelation", name, args == null ? BasicAccelerateIpEndpointRelationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BasicAccelerateIpEndpointRelation(String name, Output<String> id, @Nullable BasicAccelerateIpEndpointRelationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/basicAccelerateIpEndpointRelation:BasicAccelerateIpEndpointRelation", name, state, makeResourceOptions(options, id));
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
    public static BasicAccelerateIpEndpointRelation get(String name, Output<String> id, @Nullable BasicAccelerateIpEndpointRelationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BasicAccelerateIpEndpointRelation(name, id, state, options);
    }
}
