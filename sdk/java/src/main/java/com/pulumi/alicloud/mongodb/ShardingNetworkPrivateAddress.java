// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mongodb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.mongodb.ShardingNetworkPrivateAddressArgs;
import com.pulumi.alicloud.mongodb.inputs.ShardingNetworkPrivateAddressState;
import com.pulumi.alicloud.mongodb.outputs.ShardingNetworkPrivateAddressNetworkAddress;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a MongoDB Sharding Network Private Address resource.
 * 
 * For information about MongoDB Sharding Network Private Address and how to use it, see [What is Sharding Network Private Address](https://www.alibabacloud.com/help/en/doc-detail/141403.html).
 * 
 * &gt; **NOTE:** Available in v1.157.0+.
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
 * import com.pulumi.alicloud.mongodb.MongodbFunctions;
 * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.VpcFunctions;
 * import com.pulumi.alicloud.cloudconnect.inputs.GetNetworksArgs;
 * import com.pulumi.alicloud.vpc.inputs.GetSwitchesArgs;
 * import com.pulumi.alicloud.mongodb.ShardingInstance;
 * import com.pulumi.alicloud.mongodb.ShardingInstanceArgs;
 * import com.pulumi.alicloud.mongodb.inputs.ShardingInstanceMongoListArgs;
 * import com.pulumi.alicloud.mongodb.inputs.ShardingInstanceShardListArgs;
 * import com.pulumi.alicloud.mongodb.ShardingNetworkPrivateAddress;
 * import com.pulumi.alicloud.mongodb.ShardingNetworkPrivateAddressArgs;
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
 *         final var defaultZones = MongodbFunctions.getZones();
 * 
 *         final var defaultNetworks = VpcFunctions.getNetworks(GetNetworksArgs.builder()
 *             .nameRegex(&#34;default-NODELETING&#34;)
 *             .build());
 * 
 *         final var defaultSwitches = VpcFunctions.getSwitches(GetSwitchesArgs.builder()
 *             .vpcId(defaultNetworks.applyValue(getNetworksResult -&gt; getNetworksResult.ids()[0]))
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var defaultShardingInstance = new ShardingInstance(&#34;defaultShardingInstance&#34;, ShardingInstanceArgs.builder()        
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .vswitchId(defaultSwitches.applyValue(getSwitchesResult -&gt; getSwitchesResult.ids()[0]))
 *             .engineVersion(&#34;3.4&#34;)
 *             .mongoLists(            
 *                 ShardingInstanceMongoListArgs.builder()
 *                     .nodeClass(&#34;dds.mongos.mid&#34;)
 *                     .build(),
 *                 ShardingInstanceMongoListArgs.builder()
 *                     .nodeClass(&#34;dds.mongos.mid&#34;)
 *                     .build())
 *             .shardLists(            
 *                 ShardingInstanceShardListArgs.builder()
 *                     .nodeClass(&#34;dds.shard.mid&#34;)
 *                     .nodeStorage(10)
 *                     .build(),
 *                 ShardingInstanceShardListArgs.builder()
 *                     .nodeClass(&#34;dds.shard.mid&#34;)
 *                     .nodeStorage(10)
 *                     .build())
 *             .build());
 * 
 *         var example = new ShardingNetworkPrivateAddress(&#34;example&#34;, ShardingNetworkPrivateAddressArgs.builder()        
 *             .dbInstanceId(defaultShardingInstance.id())
 *             .nodeId(defaultShardingInstance.shardLists().applyValue(shardLists -&gt; shardLists[0].nodeId()))
 *             .zoneId(defaultShardingInstance.zoneId())
 *             .accountName(&#34;example_value&#34;)
 *             .accountPassword(&#34;YourPassword+12345&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * MongoDB Sharding Network Private Address can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:mongodb/shardingNetworkPrivateAddress:ShardingNetworkPrivateAddress example &lt;db_instance_id&gt;:&lt;node_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:mongodb/shardingNetworkPrivateAddress:ShardingNetworkPrivateAddress")
public class ShardingNetworkPrivateAddress extends com.pulumi.resources.CustomResource {
    /**
     * The name of the account.
     * - The name must be 4 to 16 characters in length and can contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter.
     * - You need to set the account name and password only when you apply for an endpoint for a shard or Configserver node for the first time. In this case, the account name and password are used for all shard and Configserver nodes.
     * - The permissions of this account are fixed to read-only.
     * 
     */
    @Export(name="accountName", type=String.class, parameters={})
    private Output</* @Nullable */ String> accountName;

    /**
     * @return The name of the account.
     * - The name must be 4 to 16 characters in length and can contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter.
     * - You need to set the account name and password only when you apply for an endpoint for a shard or Configserver node for the first time. In this case, the account name and password are used for all shard and Configserver nodes.
     * - The permissions of this account are fixed to read-only.
     * 
     */
    public Output<Optional<String>> accountName() {
        return Codegen.optional(this.accountName);
    }
    /**
     * Account password.
     * - The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!#$%^&amp;*()_+-=`.
     * - The password must be 8 to 32 characters in length.
     * 
     */
    @Export(name="accountPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> accountPassword;

    /**
     * @return Account password.
     * - The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!#$%^&amp;*()_+-=`.
     * - The password must be 8 to 32 characters in length.
     * 
     */
    public Output<Optional<String>> accountPassword() {
        return Codegen.optional(this.accountPassword);
    }
    /**
     * The db instance id.
     * 
     */
    @Export(name="dbInstanceId", type=String.class, parameters={})
    private Output<String> dbInstanceId;

    /**
     * @return The db instance id.
     * 
     */
    public Output<String> dbInstanceId() {
        return this.dbInstanceId;
    }
    /**
     * The endpoint of the instance.
     * 
     */
    @Export(name="networkAddresses", type=List.class, parameters={ShardingNetworkPrivateAddressNetworkAddress.class})
    private Output<List<ShardingNetworkPrivateAddressNetworkAddress>> networkAddresses;

    /**
     * @return The endpoint of the instance.
     * 
     */
    public Output<List<ShardingNetworkPrivateAddressNetworkAddress>> networkAddresses() {
        return this.networkAddresses;
    }
    /**
     * The ID of the Shard node or the ConfigServer node.
     * 
     */
    @Export(name="nodeId", type=String.class, parameters={})
    private Output<String> nodeId;

    /**
     * @return The ID of the Shard node or the ConfigServer node.
     * 
     */
    public Output<String> nodeId() {
        return this.nodeId;
    }
    /**
     * The zone ID of the instance.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The zone ID of the instance.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ShardingNetworkPrivateAddress(String name) {
        this(name, ShardingNetworkPrivateAddressArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ShardingNetworkPrivateAddress(String name, ShardingNetworkPrivateAddressArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ShardingNetworkPrivateAddress(String name, ShardingNetworkPrivateAddressArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:mongodb/shardingNetworkPrivateAddress:ShardingNetworkPrivateAddress", name, args == null ? ShardingNetworkPrivateAddressArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ShardingNetworkPrivateAddress(String name, Output<String> id, @Nullable ShardingNetworkPrivateAddressState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:mongodb/shardingNetworkPrivateAddress:ShardingNetworkPrivateAddress", name, state, makeResourceOptions(options, id));
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
    public static ShardingNetworkPrivateAddress get(String name, Output<String> id, @Nullable ShardingNetworkPrivateAddressState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ShardingNetworkPrivateAddress(name, id, state, options);
    }
}
