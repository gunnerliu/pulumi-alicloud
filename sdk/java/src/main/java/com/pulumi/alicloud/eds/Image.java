// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.eds.ImageArgs;
import com.pulumi.alicloud.eds.inputs.ImageState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ECD Image resource.
 * 
 * For information about ECD Image and how to use it, see [What is Image](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-ecd-2020-09-30-createimage).
 * 
 * &gt; **NOTE:** Available since v1.146.0.
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
 * import com.pulumi.alicloud.eds.SimpleOfficeSite;
 * import com.pulumi.alicloud.eds.SimpleOfficeSiteArgs;
 * import com.pulumi.alicloud.eds.EcdPolicyGroup;
 * import com.pulumi.alicloud.eds.EcdPolicyGroupArgs;
 * import com.pulumi.alicloud.eds.inputs.EcdPolicyGroupAuthorizeAccessPolicyRuleArgs;
 * import com.pulumi.alicloud.eds.inputs.EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs;
 * import com.pulumi.alicloud.eds.EdsFunctions;
 * import com.pulumi.alicloud.eds.inputs.GetBundlesArgs;
 * import com.pulumi.alicloud.eds.Desktop;
 * import com.pulumi.alicloud.eds.DesktopArgs;
 * import com.pulumi.alicloud.eds.Image;
 * import com.pulumi.alicloud.eds.ImageArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;terraform-example&#34;);
 *         var defaultSimpleOfficeSite = new SimpleOfficeSite(&#34;defaultSimpleOfficeSite&#34;, SimpleOfficeSiteArgs.builder()        
 *             .cidrBlock(&#34;172.16.0.0/12&#34;)
 *             .enableAdminAccess(true)
 *             .desktopAccessType(&#34;Internet&#34;)
 *             .officeSiteName(name)
 *             .build());
 * 
 *         var defaultEcdPolicyGroup = new EcdPolicyGroup(&#34;defaultEcdPolicyGroup&#34;, EcdPolicyGroupArgs.builder()        
 *             .policyGroupName(name)
 *             .clipboard(&#34;read&#34;)
 *             .localDrive(&#34;read&#34;)
 *             .usbRedirect(&#34;off&#34;)
 *             .watermark(&#34;off&#34;)
 *             .authorizeAccessPolicyRules(EcdPolicyGroupAuthorizeAccessPolicyRuleArgs.builder()
 *                 .description(name)
 *                 .cidrIp(&#34;1.2.3.45/24&#34;)
 *                 .build())
 *             .authorizeSecurityPolicyRules(EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs.builder()
 *                 .type(&#34;inflow&#34;)
 *                 .policy(&#34;accept&#34;)
 *                 .description(name)
 *                 .portRange(&#34;80/80&#34;)
 *                 .ipProtocol(&#34;TCP&#34;)
 *                 .priority(&#34;1&#34;)
 *                 .cidrIp(&#34;1.2.3.4/24&#34;)
 *                 .build())
 *             .build());
 * 
 *         final var defaultBundles = EdsFunctions.getBundles(GetBundlesArgs.builder()
 *             .bundleType(&#34;SYSTEM&#34;)
 *             .build());
 * 
 *         var defaultDesktop = new Desktop(&#34;defaultDesktop&#34;, DesktopArgs.builder()        
 *             .officeSiteId(defaultSimpleOfficeSite.id())
 *             .policyGroupId(defaultEcdPolicyGroup.id())
 *             .bundleId(defaultBundles.applyValue(getBundlesResult -&gt; getBundlesResult.bundles()[1].id()))
 *             .desktopName(name)
 *             .build());
 * 
 *         var defaultImage = new Image(&#34;defaultImage&#34;, ImageArgs.builder()        
 *             .imageName(name)
 *             .desktopId(defaultDesktop.id())
 *             .description(name)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ECD Image can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:eds/image:Image example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:eds/image:Image")
public class Image extends com.pulumi.resources.CustomResource {
    /**
     * The description of the image.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the image.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The desktop id of the desktop.
     * 
     */
    @Export(name="desktopId", refs={String.class}, tree="[0]")
    private Output<String> desktopId;

    /**
     * @return The desktop id of the desktop.
     * 
     */
    public Output<String> desktopId() {
        return this.desktopId;
    }
    /**
     * The name of the image.
     * 
     */
    @Export(name="imageName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> imageName;

    /**
     * @return The name of the image.
     * 
     */
    public Output<Optional<String>> imageName() {
        return Codegen.optional(this.imageName);
    }
    /**
     * The status of the image. Valid values: `Creating`, `Available`, `CreateFailed`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the image. Valid values: `Creating`, `Available`, `CreateFailed`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Image(String name) {
        this(name, ImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Image(String name, ImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Image(String name, ImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eds/image:Image", name, args == null ? ImageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Image(String name, Output<String> id, @Nullable ImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eds/image:Image", name, state, makeResourceOptions(options, id));
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
    public static Image get(String name, Output<String> id, @Nullable ImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Image(name, id, state, options);
    }
}
