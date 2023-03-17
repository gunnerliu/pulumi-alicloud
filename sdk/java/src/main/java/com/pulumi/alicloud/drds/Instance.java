// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.drds;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.drds.InstanceArgs;
import com.pulumi.alicloud.drds.inputs.InstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Distributed Relational Database Service (DRDS) is a lightweight (stateless), flexible, stable, and efficient middleware product independently developed by Alibaba Group to resolve scalability issues with single-host relational databases.
 * With its compatibility with MySQL protocols and syntaxes, DRDS enables database/table sharding, smooth scaling, configuration upgrade/downgrade,
 * transparent read/write splitting, and distributed transactions, providing O&amp;M capabilities for distributed databases throughout their entire lifecycle.
 * 
 * For information about DRDS and how to use it, see [What is DRDS](https://www.alibabacloud.com/help/product/29657.htm).
 * 
 * &gt; **NOTE:** At present, DRDS instance only can be supported in the regions: cn-shenzhen, cn-beijing, cn-hangzhou, cn-hongkong, cn-qingdao, ap-southeast-1.
 * 
 * &gt; **NOTE:** Currently, this resource only support `Domestic Site Account`.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.drds.Instance;
 * import com.pulumi.alicloud.drds.InstanceArgs;
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
 *         var default_ = new Instance(&#34;default&#34;, InstanceArgs.builder()        
 *             .description(&#34;drds instance&#34;)
 *             .instanceChargeType(&#34;PostPaid&#34;)
 *             .instanceSeries(&#34;drds.sn1.4c8g&#34;)
 *             .specification(&#34;drds.sn1.4c8g.8C16G&#34;)
 *             .vswitchId(&#34;vsw-bp1jlu3swk8rq2yoi40ey&#34;)
 *             .zoneId(&#34;cn-hangzhou-e&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Distributed Relational Database Service (DRDS) can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:drds/instance:Instance example drds-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:drds/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * (Available in 1.196.0+) The connection string of the DRDS instance.
     * 
     */
    @Export(name="connectionString", type=String.class, parameters={})
    private Output<String> connectionString;

    /**
     * @return (Available in 1.196.0+) The connection string of the DRDS instance.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
    }
    /**
     * Description of the DRDS instance, This description can have a string of 2 to 256 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the DRDS instance, This description can have a string of 2 to 256 characters.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
     * 
     */
    @Export(name="instanceChargeType", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceChargeType;

    /**
     * @return Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
     * 
     */
    public Output<Optional<String>> instanceChargeType() {
        return Codegen.optional(this.instanceChargeType);
    }
    /**
     * The parameter of the instance series. **NOTE:**  `drds.sn1.4c8g`,`drds.sn1.8c16g`,`drds.sn1.16c32g`,`drds.sn1.32c64g` are no longer supported. Valid values:
     * - `drds.sn2.4c16g` Starter Edition.
     * - `drds.sn2.8c32g` Standard Edition.
     * - `drds.sn2.16c64g` Enterprise Edition.
     * 
     */
    @Export(name="instanceSeries", type=String.class, parameters={})
    private Output<String> instanceSeries;

    /**
     * @return The parameter of the instance series. **NOTE:**  `drds.sn1.4c8g`,`drds.sn1.8c16g`,`drds.sn1.16c32g`,`drds.sn1.32c64g` are no longer supported. Valid values:
     * - `drds.sn2.4c16g` Starter Edition.
     * - `drds.sn2.8c32g` Standard Edition.
     * - `drds.sn2.16c64g` Enterprise Edition.
     * 
     */
    public Output<String> instanceSeries() {
        return this.instanceSeries;
    }
    /**
     * The MySQL version supported by the instance, with the following range of values. `5`: Fully compatible with MySQL 5.x (default) `8`: Fully compatible with MySQL 8.0. This parameter takes effect when the primary instance is created, and the read-only instance has the same MySQL version as the primary instance by default.
     * 
     */
    @Export(name="mysqlVersion", type=Integer.class, parameters={})
    private Output<Integer> mysqlVersion;

    /**
     * @return The MySQL version supported by the instance, with the following range of values. `5`: Fully compatible with MySQL 5.x (default) `8`: Fully compatible with MySQL 8.0. This parameter takes effect when the primary instance is created, and the read-only instance has the same MySQL version as the primary instance by default.
     * 
     */
    public Output<Integer> mysqlVersion() {
        return this.mysqlVersion;
    }
    /**
     * (Available in 1.196.0+) The connection port of the DRDS instance.
     * 
     */
    @Export(name="port", type=String.class, parameters={})
    private Output<String> port;

    /**
     * @return (Available in 1.196.0+) The connection port of the DRDS instance.
     * 
     */
    public Output<String> port() {
        return this.port;
    }
    /**
     * User-defined DRDS instance specification. Value range:
     * - `drds.sn1.4c8g` for DRDS instance Starter version;
     * - value range : `drds.sn1.4c8g.8c16g`, `drds.sn1.4c8g.16c32g`, `drds.sn1.4c8g.32c64g`, `drds.sn1.4c8g.64c128g`
     * - `drds.sn1.8c16g` for DRDS instance Standard edition;
     * - value range : `drds.sn1.8c16g.16c32g`, `drds.sn1.8c16g.32c64g`, `drds.sn1.8c16g.64c128g`
     * - `drds.sn1.16c32g` for DRDS instance Enterprise Edition;
     * - value range : `drds.sn1.16c32g.32c64g`, `drds.sn1.16c32g.64c128g`
     * - `drds.sn1.32c64g` for DRDS instance Extreme Edition;
     * - value range : `drds.sn1.32c64g.128c256g`
     * 
     */
    @Export(name="specification", type=String.class, parameters={})
    private Output<String> specification;

    /**
     * @return User-defined DRDS instance specification. Value range:
     * - `drds.sn1.4c8g` for DRDS instance Starter version;
     * - value range : `drds.sn1.4c8g.8c16g`, `drds.sn1.4c8g.16c32g`, `drds.sn1.4c8g.32c64g`, `drds.sn1.4c8g.64c128g`
     * - `drds.sn1.8c16g` for DRDS instance Standard edition;
     * - value range : `drds.sn1.8c16g.16c32g`, `drds.sn1.8c16g.32c64g`, `drds.sn1.8c16g.64c128g`
     * - `drds.sn1.16c32g` for DRDS instance Enterprise Edition;
     * - value range : `drds.sn1.16c32g.32c64g`, `drds.sn1.16c32g.64c128g`
     * - `drds.sn1.32c64g` for DRDS instance Extreme Edition;
     * - value range : `drds.sn1.32c64g.128c256g`
     * 
     */
    public Output<String> specification() {
        return this.specification;
    }
    /**
     * The id of the VPC.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The id of the VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The VSwitch ID to launch in.
     * 
     */
    @Export(name="vswitchId", type=String.class, parameters={})
    private Output<String> vswitchId;

    /**
     * @return The VSwitch ID to launch in.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }
    /**
     * The Zone to launch the DRDS instance.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The Zone to launch the DRDS instance.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:drds/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:drds/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
