// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.eds.RamDirectoryArgs;
import com.pulumi.alicloud.eds.inputs.RamDirectoryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a ECD Ram Directory resource.
 * 
 * For information about ECD Ram Directory and how to use it, see [What is Ram Directory](https://help.aliyun.com/document_detail/436216.html).
 * 
 * &gt; **NOTE:** Available in v1.174.0+.
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
 * import com.pulumi.alicloud.eds.EdsFunctions;
 * import com.pulumi.alicloud.eds.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.VpcFunctions;
 * import com.pulumi.alicloud.vpc.inputs.GetNetworksArgs;
 * import com.pulumi.alicloud.vpc.inputs.GetSwitchesArgs;
 * import com.pulumi.alicloud.eds.RamDirectory;
 * import com.pulumi.alicloud.eds.RamDirectoryArgs;
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
 *         final var defaultZones = EdsFunctions.getZones();
 * 
 *         final var defaultNetworks = VpcFunctions.getNetworks(GetNetworksArgs.builder()
 *             .nameRegex(&#34;default-NODELETING&#34;)
 *             .build());
 * 
 *         final var defaultSwitches = VpcFunctions.getSwitches(GetSwitchesArgs.builder()
 *             .vpcId(defaultNetworks.applyValue(getNetworksResult -&gt; getNetworksResult.ids()[0]))
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.ids()[0]))
 *             .build());
 * 
 *         var defaultRamDirectory = new RamDirectory(&#34;defaultRamDirectory&#34;, RamDirectoryArgs.builder()        
 *             .desktopAccessType(&#34;INTERNET&#34;)
 *             .enableAdminAccess(&#34;true&#34;)
 *             .enableInternetAccess(&#34;true&#34;)
 *             .ramDirectoryName(var_.name())
 *             .vswitchIds(defaultSwitches.applyValue(getSwitchesResult -&gt; getSwitchesResult.ids()[0]))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ECD Ram Directory can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:eds/ramDirectory:RamDirectory example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:eds/ramDirectory:RamDirectory")
public class RamDirectory extends com.pulumi.resources.CustomResource {
    /**
     * The desktop access type. Valid values: `VPC`, `INTERNET`, `ANY`.
     * 
     */
    @Export(name="desktopAccessType", type=String.class, parameters={})
    private Output<String> desktopAccessType;

    /**
     * @return The desktop access type. Valid values: `VPC`, `INTERNET`, `ANY`.
     * 
     */
    public Output<String> desktopAccessType() {
        return this.desktopAccessType;
    }
    /**
     * Whether to enable public network access.
     * 
     */
    @Export(name="enableAdminAccess", type=Boolean.class, parameters={})
    private Output<Boolean> enableAdminAccess;

    /**
     * @return Whether to enable public network access.
     * 
     */
    public Output<Boolean> enableAdminAccess() {
        return this.enableAdminAccess;
    }
    /**
     * Whether to grant local administrator rights to users who use cloud desktops.
     * 
     */
    @Export(name="enableInternetAccess", type=Boolean.class, parameters={})
    private Output<Boolean> enableInternetAccess;

    /**
     * @return Whether to grant local administrator rights to users who use cloud desktops.
     * 
     */
    public Output<Boolean> enableInternetAccess() {
        return this.enableInternetAccess;
    }
    /**
     * The name of the directory. The name must be 2 to 255 characters in length. It must start with a letter but cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * 
     */
    @Export(name="ramDirectoryName", type=String.class, parameters={})
    private Output<String> ramDirectoryName;

    /**
     * @return The name of the directory. The name must be 2 to 255 characters in length. It must start with a letter but cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * 
     */
    public Output<String> ramDirectoryName() {
        return this.ramDirectoryName;
    }
    /**
     * The status of directory.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of directory.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * List of VSwitch IDs in the directory.
     * 
     */
    @Export(name="vswitchIds", type=List.class, parameters={String.class})
    private Output<List<String>> vswitchIds;

    /**
     * @return List of VSwitch IDs in the directory.
     * 
     */
    public Output<List<String>> vswitchIds() {
        return this.vswitchIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RamDirectory(String name) {
        this(name, RamDirectoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RamDirectory(String name, RamDirectoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RamDirectory(String name, RamDirectoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eds/ramDirectory:RamDirectory", name, args == null ? RamDirectoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RamDirectory(String name, Output<String> id, @Nullable RamDirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eds/ramDirectory:RamDirectory", name, state, makeResourceOptions(options, id));
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
    public static RamDirectory get(String name, Output<String> id, @Nullable RamDirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RamDirectory(name, id, state, options);
    }
}
