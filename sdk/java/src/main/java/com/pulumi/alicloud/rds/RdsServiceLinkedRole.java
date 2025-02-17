// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.rds.RdsServiceLinkedRoleArgs;
import com.pulumi.alicloud.rds.inputs.RdsServiceLinkedRoleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a RDS Service Linked Role.
 * 
 * For information about RDS Service Linked Role and how to use it, see [What is Service Linked Role.](https://www.alibabacloud.com/help/en/doc-detail/171226.htm).
 * 
 * &gt; **NOTE:** Available since v1.189.0.
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
 * import com.pulumi.alicloud.rds.RdsServiceLinkedRole;
 * import com.pulumi.alicloud.rds.RdsServiceLinkedRoleArgs;
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
 *         var default_ = new RdsServiceLinkedRole(&#34;default&#34;, RdsServiceLinkedRoleArgs.builder()        
 *             .serviceName(&#34;AliyunServiceRoleForRdsPgsqlOnEcs&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * RDS Service Linked Role can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:rds/rdsServiceLinkedRole:RdsServiceLinkedRole default &lt;service_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:rds/rdsServiceLinkedRole:RdsServiceLinkedRole")
public class RdsServiceLinkedRole extends com.pulumi.resources.CustomResource {
    /**
     * The Alibaba Cloud Resource Name (ARN) of the role.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Alibaba Cloud Resource Name (ARN) of the role.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ID of the role.
     * 
     */
    @Export(name="roleId", refs={String.class}, tree="[0]")
    private Output<String> roleId;

    /**
     * @return The ID of the role.
     * 
     */
    public Output<String> roleId() {
        return this.roleId;
    }
    /**
     * The name of the role.
     * 
     */
    @Export(name="roleName", refs={String.class}, tree="[0]")
    private Output<String> roleName;

    /**
     * @return The name of the role.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }
    /**
     * The product name for SLR. RDS can automatically create the following service-linked roles: `AliyunServiceRoleForRdsPgsqlOnEcs`, `AliyunServiceRoleForRDSProxyOnEcs`.
     * 
     */
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return The product name for SLR. RDS can automatically create the following service-linked roles: `AliyunServiceRoleForRdsPgsqlOnEcs`, `AliyunServiceRoleForRDSProxyOnEcs`.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RdsServiceLinkedRole(String name) {
        this(name, RdsServiceLinkedRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RdsServiceLinkedRole(String name, RdsServiceLinkedRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RdsServiceLinkedRole(String name, RdsServiceLinkedRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/rdsServiceLinkedRole:RdsServiceLinkedRole", name, args == null ? RdsServiceLinkedRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RdsServiceLinkedRole(String name, Output<String> id, @Nullable RdsServiceLinkedRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/rdsServiceLinkedRole:RdsServiceLinkedRole", name, state, makeResourceOptions(options, id));
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
    public static RdsServiceLinkedRole get(String name, Output<String> id, @Nullable RdsServiceLinkedRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RdsServiceLinkedRole(name, id, state, options);
    }
}
