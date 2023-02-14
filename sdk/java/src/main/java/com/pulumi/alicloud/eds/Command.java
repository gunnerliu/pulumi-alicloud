// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.eds.CommandArgs;
import com.pulumi.alicloud.eds.inputs.CommandState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ECD Command resource.
 * 
 * For information about ECD Command and how to use it, see [What is Command](https://help.aliyun.com/document_detail/188382.html).
 * 
 * &gt; **NOTE:** Available in v1.146.0+.
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
 * import com.pulumi.alicloud.eds.EdsFunctions;
 * import com.pulumi.alicloud.eds.inputs.GetBundlesArgs;
 * import com.pulumi.alicloud.eds.EcdPolicyGroup;
 * import com.pulumi.alicloud.eds.EcdPolicyGroupArgs;
 * import com.pulumi.alicloud.eds.inputs.EcdPolicyGroupAuthorizeAccessPolicyRuleArgs;
 * import com.pulumi.alicloud.eds.inputs.EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs;
 * import com.pulumi.alicloud.eds.Desktop;
 * import com.pulumi.alicloud.eds.DesktopArgs;
 * import com.pulumi.alicloud.eds.Command;
 * import com.pulumi.alicloud.eds.CommandArgs;
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
 *         var defaultSimpleOfficeSite = new SimpleOfficeSite(&#34;defaultSimpleOfficeSite&#34;, SimpleOfficeSiteArgs.builder()        
 *             .cidrBlock(&#34;172.16.0.0/12&#34;)
 *             .desktopAccessType(&#34;Internet&#34;)
 *             .officeSiteName(&#34;your_office_site_name&#34;)
 *             .build());
 * 
 *         final var defaultBundles = EdsFunctions.getBundles(GetBundlesArgs.builder()
 *             .bundleType(&#34;SYSTEM&#34;)
 *             .nameRegex(&#34;windows&#34;)
 *             .build());
 * 
 *         var defaultEcdPolicyGroup = new EcdPolicyGroup(&#34;defaultEcdPolicyGroup&#34;, EcdPolicyGroupArgs.builder()        
 *             .policyGroupName(&#34;your_policy_group_name&#34;)
 *             .clipboard(&#34;readwrite&#34;)
 *             .localDrive(&#34;read&#34;)
 *             .authorizeAccessPolicyRules(EcdPolicyGroupAuthorizeAccessPolicyRuleArgs.builder()
 *                 .description(&#34;example_value&#34;)
 *                 .cidrIp(&#34;1.2.3.4/24&#34;)
 *                 .build())
 *             .authorizeSecurityPolicyRules(EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs.builder()
 *                 .type(&#34;inflow&#34;)
 *                 .policy(&#34;accept&#34;)
 *                 .description(&#34;example_value&#34;)
 *                 .portRange(&#34;80/80&#34;)
 *                 .ipProtocol(&#34;TCP&#34;)
 *                 .priority(&#34;1&#34;)
 *                 .cidrIp(&#34;0.0.0.0/0&#34;)
 *                 .build())
 *             .build());
 * 
 *         var defaultDesktop = new Desktop(&#34;defaultDesktop&#34;, DesktopArgs.builder()        
 *             .officeSiteId(defaultSimpleOfficeSite.id())
 *             .policyGroupId(defaultEcdPolicyGroup.id())
 *             .bundleId(defaultBundles.applyValue(getBundlesResult -&gt; getBundlesResult.bundles()[0].id()))
 *             .desktopName(var_.name())
 *             .build());
 * 
 *         var defaultCommand = new Command(&#34;defaultCommand&#34;, CommandArgs.builder()        
 *             .commandContent(&#34;ipconfig&#34;)
 *             .commandType(&#34;RunPowerShellScript&#34;)
 *             .desktopId(defaultDesktop.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ECD Command can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:eds/command:Command example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:eds/command:Command")
public class Command extends com.pulumi.resources.CustomResource {
    /**
     * The Contents of the Script to Base64 Encoded Transmission.
     * 
     */
    @Export(name="commandContent", type=String.class, parameters={})
    private Output<String> commandContent;

    /**
     * @return The Contents of the Script to Base64 Encoded Transmission.
     * 
     */
    public Output<String> commandContent() {
        return this.commandContent;
    }
    /**
     * The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
     * 
     */
    @Export(name="commandType", type=String.class, parameters={})
    private Output<String> commandType;

    /**
     * @return The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
     * 
     */
    public Output<String> commandType() {
        return this.commandType;
    }
    /**
     * That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
     * 
     */
    @Export(name="contentEncoding", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentEncoding;

    /**
     * @return That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
     * 
     */
    public Output<Optional<String>> contentEncoding() {
        return Codegen.optional(this.contentEncoding);
    }
    /**
     * The desktop id of the Desktop.
     * 
     */
    @Export(name="desktopId", type=String.class, parameters={})
    private Output<String> desktopId;

    /**
     * @return The desktop id of the Desktop.
     * 
     */
    public Output<String> desktopId() {
        return this.desktopId;
    }
    /**
     * Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The timeout period for script execution the unit is seconds. Default to: `60`.
     * 
     */
    @Export(name="timeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> timeout;

    /**
     * @return The timeout period for script execution the unit is seconds. Default to: `60`.
     * 
     */
    public Output<Optional<String>> timeout() {
        return Codegen.optional(this.timeout);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Command(String name) {
        this(name, CommandArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Command(String name, CommandArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Command(String name, CommandArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eds/command:Command", name, args == null ? CommandArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Command(String name, Output<String> id, @Nullable CommandState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eds/command:Command", name, state, makeResourceOptions(options, id));
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
    public static Command get(String name, Output<String> id, @Nullable CommandState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Command(name, id, state, options);
    }
}