// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pvtz;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.pvtz.ZoneArgs;
import com.pulumi.alicloud.pvtz.inputs.ZoneState;
import com.pulumi.alicloud.pvtz.outputs.ZoneUserInfo;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
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
 * import com.pulumi.alicloud.pvtz.Zone;
 * import com.pulumi.alicloud.pvtz.ZoneArgs;
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
 *         var foo = new Zone(&#34;foo&#34;, ZoneArgs.builder()        
 *             .zoneName(&#34;foo.test.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Private Zone can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:pvtz/zone:Zone example abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:pvtz/zone:Zone")
public class Zone extends com.pulumi.resources.CustomResource {
    /**
     * Whether the Private Zone is ptr.
     * 
     */
    @Export(name="isPtr", type=Boolean.class, parameters={})
    private Output<Boolean> isPtr;

    /**
     * @return Whether the Private Zone is ptr.
     * 
     */
    public Output<Boolean> isPtr() {
        return this.isPtr;
    }
    /**
     * The language. Valid values: &#34;zh&#34;, &#34;en&#34;, &#34;jp&#34;.
     * 
     */
    @Export(name="lang", type=String.class, parameters={})
    private Output</* @Nullable */ String> lang;

    /**
     * @return The language. Valid values: &#34;zh&#34;, &#34;en&#34;, &#34;jp&#34;.
     * 
     */
    public Output<Optional<String>> lang() {
        return Codegen.optional(this.lang);
    }
    /**
     * The name of the Private Zone. The `name` has been deprecated from provider version 1.107.0. Please use &#39;zone_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from version 1.107.0. Use &#39;zone_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from version 1.107.0. Use 'zone_name' instead. */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Private Zone. The `name` has been deprecated from provider version 1.107.0. Please use &#39;zone_name&#39; instead.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The recursive DNS proxy. Valid values:
     * - ZONE: indicates that the recursive DNS proxy is disabled.
     * - RECORD: indicates that the recursive DNS proxy is enabled.
     *   Default to &#34;ZONE&#34;.
     * 
     */
    @Export(name="proxyPattern", type=String.class, parameters={})
    private Output</* @Nullable */ String> proxyPattern;

    /**
     * @return The recursive DNS proxy. Valid values:
     * - ZONE: indicates that the recursive DNS proxy is disabled.
     * - RECORD: indicates that the recursive DNS proxy is enabled.
     *   Default to &#34;ZONE&#34;.
     * 
     */
    public Output<Optional<String>> proxyPattern() {
        return Codegen.optional(this.proxyPattern);
    }
    /**
     * The count of the Private Zone Record.
     * 
     */
    @Export(name="recordCount", type=Integer.class, parameters={})
    private Output<Integer> recordCount;

    /**
     * @return The count of the Private Zone Record.
     * 
     */
    public Output<Integer> recordCount() {
        return this.recordCount;
    }
    /**
     * The remark of the Private Zone.
     * 
     */
    @Export(name="remark", type=String.class, parameters={})
    private Output</* @Nullable */ String> remark;

    /**
     * @return The remark of the Private Zone.
     * 
     */
    public Output<Optional<String>> remark() {
        return Codegen.optional(this.remark);
    }
    /**
     * The Id of resource group which the Private Zone belongs.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroupId;

    /**
     * @return The Id of resource group which the Private Zone belongs.
     * 
     */
    public Output<Optional<String>> resourceGroupId() {
        return Codegen.optional(this.resourceGroupId);
    }
    /**
     * The status of the host synchronization task. Valid values:  `ON`,`OFF`. **NOTE:** You can update the `sync_status` to enable/disable the host synchronization task.
     * 
     */
    @Export(name="syncStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> syncStatus;

    /**
     * @return The status of the host synchronization task. Valid values:  `ON`,`OFF`. **NOTE:** You can update the `sync_status` to enable/disable the host synchronization task.
     * 
     */
    public Output<Optional<String>> syncStatus() {
        return Codegen.optional(this.syncStatus);
    }
    /**
     * The IP address of the client.
     * 
     */
    @Export(name="userClientIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> userClientIp;

    /**
     * @return The IP address of the client.
     * 
     */
    public Output<Optional<String>> userClientIp() {
        return Codegen.optional(this.userClientIp);
    }
    /**
     * The user information of the host synchronization task. The details see Block `user_info`.
     * 
     */
    @Export(name="userInfos", type=List.class, parameters={ZoneUserInfo.class})
    private Output<List<ZoneUserInfo>> userInfos;

    /**
     * @return The user information of the host synchronization task. The details see Block `user_info`.
     * 
     */
    public Output<List<ZoneUserInfo>> userInfos() {
        return this.userInfos;
    }
    /**
     * The zone_name of the Private Zone. The `zone_name` is required when the value of the `name`  is Empty.
     * 
     */
    @Export(name="zoneName", type=String.class, parameters={})
    private Output<String> zoneName;

    /**
     * @return The zone_name of the Private Zone. The `zone_name` is required when the value of the `name`  is Empty.
     * 
     */
    public Output<String> zoneName() {
        return this.zoneName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Zone(String name) {
        this(name, ZoneArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Zone(String name, @Nullable ZoneArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Zone(String name, @Nullable ZoneArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:pvtz/zone:Zone", name, args == null ? ZoneArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Zone(String name, Output<String> id, @Nullable ZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:pvtz/zone:Zone", name, state, makeResourceOptions(options, id));
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
    public static Zone get(String name, Output<String> id, @Nullable ZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Zone(name, id, state, options);
    }
}
