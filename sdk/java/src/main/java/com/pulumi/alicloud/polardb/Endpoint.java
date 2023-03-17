// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.polardb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.polardb.EndpointArgs;
import com.pulumi.alicloud.polardb.inputs.EndpointState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a PolarDB endpoint resource to manage endpoint of PolarDB cluster.
 * 
 * &gt; **NOTE:** After v1.80.0 and before v1.121.0, you can only use this resource to manage the custom endpoint. Since v1.121.0, you also can import the primary endpoint and the cluster endpoint, to modify their ssl status and so on.
 * 
 * &gt; **NOTE:** The primary endpoint and the default cluster endpoint can not be created or deleted manually.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.polardb.Cluster;
 * import com.pulumi.alicloud.polardb.ClusterArgs;
 * import com.pulumi.alicloud.polardb.Endpoint;
 * import com.pulumi.alicloud.polardb.EndpointArgs;
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
 *         final var creation = config.get(&#34;creation&#34;).orElse(&#34;PolarDB&#34;);
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;polardbconnectionbasic&#34;);
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(creation)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;172.16.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock(&#34;172.16.0.0/24&#34;)
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .vswitchName(name)
 *             .build());
 * 
 *         var defaultCluster = new Cluster(&#34;defaultCluster&#34;, ClusterArgs.builder()        
 *             .dbType(&#34;MySQL&#34;)
 *             .dbVersion(&#34;8.0&#34;)
 *             .payType(&#34;PostPaid&#34;)
 *             .dbNodeClass(&#34;polar.mysql.x4.large&#34;)
 *             .vswitchId(defaultSwitch.id())
 *             .description(name)
 *             .build());
 * 
 *         var endpoint = new Endpoint(&#34;endpoint&#34;, EndpointArgs.builder()        
 *             .dbClusterId(defaultCluster.id())
 *             .endpointType(&#34;Custom&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Argument Reference
 * 
 * The following arguments are supported:
 * 
 * * `db_cluster_id` - (Required, ForceNew) The Id of cluster that can run database.
 * * `endpoint_type` - (Optional, ForceNew) Type of the endpoint. Before v1.121.0, it only can be `Custom`. since v1.121.0, `Custom`, `Cluster`, `Primary` are valid, default to `Custom`. However when creating a new endpoint, it also only can be `Custom`.
 * * `read_write_mode` - (Optional) Read or write mode. Valid values are `ReadWrite`, `ReadOnly`. When creating a new custom endpoint, default to `ReadOnly`.
 * * `nodes` - (Optional) Node id list for endpoint configuration. At least 2 nodes if specified, or if the cluster has more than 3 nodes, read-only endpoint is allowed to mount only one node. Default is all nodes.
 * * `auto_add_new_nodes` - (Optional) Whether the new node automatically joins the default cluster address. Valid values are `Enable`, `Disable`. When creating a new custom endpoint, default to `Disable`.
 * * `endpoint_config` - (Optional) The advanced settings of the endpoint of Apsara PolarDB clusters are in JSON format. Including the settings of consistency level, transaction splitting, connection pool, and offload reads from primary node. For more details, see the [description of EndpointConfig in the Request parameters table for details](https://www.alibabacloud.com/help/doc-detail/116593.htm).
 * * `ssl_enabled` - (Optional, Available in v1.121.0+) Specifies how to modify the SSL encryption status. Valid values: `Disable`, `Enable`, `Update`.
 * * `net_type` - (Optional, Available in v1.121.0+) The network type of the endpoint address.
 * * `ssl_auto_rotate` - (Available in v1.132.0+) Specifies whether automatic rotation of SSL certificates is enabled. Valid values: `Enable`,`Disable`.
 * * `ssl_certificate_url` - (Available in v1.132.0+) Specifies SSL certificate download link.\
 *     **NOTE:** For a PolarDB for MySQL cluster, this parameter is required, and only one connection string in each endpoint can enable the ssl, for other notes, see [Configure SSL encryption](https://www.alibabacloud.com/help/doc-detail/153182.htm).\
 *     For a PolarDB for PostgreSQL cluster or a PolarDB-O cluster, this parameter is not required, by default, SSL encryption is enabled for all endpoints.
 * * `db_endpoint_description` - (Optional, Available in v1.201.0+) The name of the endpoint.
 * 
 * ## Import
 * 
 * PolarDB endpoint can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:polardb/endpoint:Endpoint example pc-abc123456:pe-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:polardb/endpoint:Endpoint")
public class Endpoint extends com.pulumi.resources.CustomResource {
    @Export(name="autoAddNewNodes", type=String.class, parameters={})
    private Output<String> autoAddNewNodes;

    public Output<String> autoAddNewNodes() {
        return this.autoAddNewNodes;
    }
    @Export(name="dbClusterId", type=String.class, parameters={})
    private Output<String> dbClusterId;

    public Output<String> dbClusterId() {
        return this.dbClusterId;
    }
    @Export(name="dbEndpointDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> dbEndpointDescription;

    public Output<Optional<String>> dbEndpointDescription() {
        return Codegen.optional(this.dbEndpointDescription);
    }
    /**
     * (Available in v1.161.0+) The ID of the cluster endpoint.
     * 
     */
    @Export(name="dbEndpointId", type=String.class, parameters={})
    private Output<String> dbEndpointId;

    /**
     * @return (Available in v1.161.0+) The ID of the cluster endpoint.
     * 
     */
    public Output<String> dbEndpointId() {
        return this.dbEndpointId;
    }
    @Export(name="endpointConfig", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> endpointConfig;

    public Output<Map<String,Object>> endpointConfig() {
        return this.endpointConfig;
    }
    /**
     * Type of endpoint.
     * 
     */
    @Export(name="endpointType", type=String.class, parameters={})
    private Output</* @Nullable */ String> endpointType;

    /**
     * @return Type of endpoint.
     * 
     */
    public Output<Optional<String>> endpointType() {
        return Codegen.optional(this.endpointType);
    }
    @Export(name="netType", type=String.class, parameters={})
    private Output</* @Nullable */ String> netType;

    public Output<Optional<String>> netType() {
        return Codegen.optional(this.netType);
    }
    @Export(name="nodes", type=List.class, parameters={String.class})
    private Output<List<String>> nodes;

    public Output<List<String>> nodes() {
        return this.nodes;
    }
    @Export(name="readWriteMode", type=String.class, parameters={})
    private Output<String> readWriteMode;

    public Output<String> readWriteMode() {
        return this.readWriteMode;
    }
    @Export(name="sslAutoRotate", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslAutoRotate;

    public Output<Optional<String>> sslAutoRotate() {
        return Codegen.optional(this.sslAutoRotate);
    }
    @Export(name="sslCertificateUrl", type=String.class, parameters={})
    private Output<String> sslCertificateUrl;

    public Output<String> sslCertificateUrl() {
        return this.sslCertificateUrl;
    }
    /**
     * (Available in v1.121.0+) The SSL connection string.
     * 
     */
    @Export(name="sslConnectionString", type=String.class, parameters={})
    private Output<String> sslConnectionString;

    /**
     * @return (Available in v1.121.0+) The SSL connection string.
     * 
     */
    public Output<String> sslConnectionString() {
        return this.sslConnectionString;
    }
    @Export(name="sslEnabled", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslEnabled;

    public Output<Optional<String>> sslEnabled() {
        return Codegen.optional(this.sslEnabled);
    }
    /**
     * (Available in v1.121.0+) The time when the SSL certificate expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
     * 
     */
    @Export(name="sslExpireTime", type=String.class, parameters={})
    private Output<String> sslExpireTime;

    /**
     * @return (Available in v1.121.0+) The time when the SSL certificate expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
     * 
     */
    public Output<String> sslExpireTime() {
        return this.sslExpireTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Endpoint(String name) {
        this(name, EndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Endpoint(String name, EndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Endpoint(String name, EndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:polardb/endpoint:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Endpoint(String name, Output<String> id, @Nullable EndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:polardb/endpoint:Endpoint", name, state, makeResourceOptions(options, id));
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
    public static Endpoint get(String name, Output<String> id, @Nullable EndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, state, options);
    }
}
