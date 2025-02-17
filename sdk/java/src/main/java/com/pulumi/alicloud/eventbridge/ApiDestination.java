// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.eventbridge.ApiDestinationArgs;
import com.pulumi.alicloud.eventbridge.inputs.ApiDestinationState;
import com.pulumi.alicloud.eventbridge.outputs.ApiDestinationHttpApiParameters;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Event Bridge Api Destination resource.
 * 
 * For information about Event Bridge Api Destination and how to use it, see [What is Api Destination](https://www.alibabacloud.com/help/en/eventbridge/latest/api-eventbridge-2020-04-01-createapidestination).
 * 
 * &gt; **NOTE:** Available since v1.211.0.
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
 * import com.pulumi.alicloud.eventbridge.Connection;
 * import com.pulumi.alicloud.eventbridge.ConnectionArgs;
 * import com.pulumi.alicloud.eventbridge.inputs.ConnectionNetworkParametersArgs;
 * import com.pulumi.alicloud.eventbridge.ApiDestination;
 * import com.pulumi.alicloud.eventbridge.ApiDestinationArgs;
 * import com.pulumi.alicloud.eventbridge.inputs.ApiDestinationHttpApiParametersArgs;
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
 *         final var region = config.get(&#34;region&#34;).orElse(&#34;cn-chengdu&#34;);
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;terraform-example&#34;);
 *         var defaultConnection = new Connection(&#34;defaultConnection&#34;, ConnectionArgs.builder()        
 *             .connectionName(name)
 *             .networkParameters(ConnectionNetworkParametersArgs.builder()
 *                 .networkType(&#34;PublicNetwork&#34;)
 *                 .build())
 *             .build());
 * 
 *         var defaultApiDestination = new ApiDestination(&#34;defaultApiDestination&#34;, ApiDestinationArgs.builder()        
 *             .connectionName(defaultConnection.connectionName())
 *             .apiDestinationName(name)
 *             .description(&#34;test-api-destination-connection&#34;)
 *             .httpApiParameters(ApiDestinationHttpApiParametersArgs.builder()
 *                 .endpoint(&#34;http://127.0.0.1:8001&#34;)
 *                 .method(&#34;POST&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Event Bridge Api Destination can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:eventbridge/apiDestination:ApiDestination example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:eventbridge/apiDestination:ApiDestination")
public class ApiDestination extends com.pulumi.resources.CustomResource {
    /**
     * The name of the API destination.
     * 
     */
    @Export(name="apiDestinationName", refs={String.class}, tree="[0]")
    private Output<String> apiDestinationName;

    /**
     * @return The name of the API destination.
     * 
     */
    public Output<String> apiDestinationName() {
        return this.apiDestinationName;
    }
    /**
     * The name of the connection.
     * 
     */
    @Export(name="connectionName", refs={String.class}, tree="[0]")
    private Output<String> connectionName;

    /**
     * @return The name of the connection.
     * 
     */
    public Output<String> connectionName() {
        return this.connectionName;
    }
    /**
     * The creation time of the Api Destination.
     * 
     */
    @Export(name="createTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> createTime;

    /**
     * @return The creation time of the Api Destination.
     * 
     */
    public Output<Integer> createTime() {
        return this.createTime;
    }
    /**
     * The description of the API destination.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the API destination.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The parameters that are configured for the API destination. See `http_api_parameters` below.
     * 
     */
    @Export(name="httpApiParameters", refs={ApiDestinationHttpApiParameters.class}, tree="[0]")
    private Output<ApiDestinationHttpApiParameters> httpApiParameters;

    /**
     * @return The parameters that are configured for the API destination. See `http_api_parameters` below.
     * 
     */
    public Output<ApiDestinationHttpApiParameters> httpApiParameters() {
        return this.httpApiParameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiDestination(String name) {
        this(name, ApiDestinationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiDestination(String name, ApiDestinationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiDestination(String name, ApiDestinationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eventbridge/apiDestination:ApiDestination", name, args == null ? ApiDestinationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiDestination(String name, Output<String> id, @Nullable ApiDestinationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eventbridge/apiDestination:ApiDestination", name, state, makeResourceOptions(options, id));
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
    public static ApiDestination get(String name, Output<String> id, @Nullable ApiDestinationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiDestination(name, id, state, options);
    }
}
