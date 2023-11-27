// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.eds.EcdPolicyGroupArgs;
import com.pulumi.alicloud.eds.inputs.EcdPolicyGroupState;
import com.pulumi.alicloud.eds.outputs.EcdPolicyGroupAuthorizeAccessPolicyRule;
import com.pulumi.alicloud.eds.outputs.EcdPolicyGroupAuthorizeSecurityPolicyRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Elastic Desktop Service (ECD) Policy Group resource.
 * 
 * For information about Elastic Desktop Service (ECD) Policy Group and how to use it, see [What is Policy Group](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-ecd-2020-09-30-createpolicygroup).
 * 
 * &gt; **NOTE:** Available since v1.130.0.
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
 * import com.pulumi.alicloud.eds.EcdPolicyGroup;
 * import com.pulumi.alicloud.eds.EcdPolicyGroupArgs;
 * import com.pulumi.alicloud.eds.inputs.EcdPolicyGroupAuthorizeAccessPolicyRuleArgs;
 * import com.pulumi.alicloud.eds.inputs.EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs;
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
 *         var default_ = new EcdPolicyGroup(&#34;default&#34;, EcdPolicyGroupArgs.builder()        
 *             .authorizeAccessPolicyRules(EcdPolicyGroupAuthorizeAccessPolicyRuleArgs.builder()
 *                 .cidrIp(&#34;1.2.3.45/24&#34;)
 *                 .description(&#34;terraform-example&#34;)
 *                 .build())
 *             .authorizeSecurityPolicyRules(EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs.builder()
 *                 .cidrIp(&#34;1.2.3.4/24&#34;)
 *                 .description(&#34;terraform-example&#34;)
 *                 .ipProtocol(&#34;TCP&#34;)
 *                 .policy(&#34;accept&#34;)
 *                 .portRange(&#34;80/80&#34;)
 *                 .priority(&#34;1&#34;)
 *                 .type(&#34;inflow&#34;)
 *                 .build())
 *             .clipboard(&#34;read&#34;)
 *             .localDrive(&#34;read&#34;)
 *             .policyGroupName(&#34;terraform-example&#34;)
 *             .usbRedirect(&#34;off&#34;)
 *             .watermark(&#34;off&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Elastic Desktop Service (ECD) Policy Group can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:eds/ecdPolicyGroup:EcdPolicyGroup example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:eds/ecdPolicyGroup:EcdPolicyGroup")
public class EcdPolicyGroup extends com.pulumi.resources.CustomResource {
    /**
     * The rule of authorize access rule. See `authorize_access_policy_rules` below.
     * 
     */
    @Export(name="authorizeAccessPolicyRules", refs={List.class,EcdPolicyGroupAuthorizeAccessPolicyRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<EcdPolicyGroupAuthorizeAccessPolicyRule>> authorizeAccessPolicyRules;

    /**
     * @return The rule of authorize access rule. See `authorize_access_policy_rules` below.
     * 
     */
    public Output<Optional<List<EcdPolicyGroupAuthorizeAccessPolicyRule>>> authorizeAccessPolicyRules() {
        return Codegen.optional(this.authorizeAccessPolicyRules);
    }
    /**
     * The policy rule. See `authorize_security_policy_rules` below.
     * 
     */
    @Export(name="authorizeSecurityPolicyRules", refs={List.class,EcdPolicyGroupAuthorizeSecurityPolicyRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<EcdPolicyGroupAuthorizeSecurityPolicyRule>> authorizeSecurityPolicyRules;

    /**
     * @return The policy rule. See `authorize_security_policy_rules` below.
     * 
     */
    public Output<Optional<List<EcdPolicyGroupAuthorizeSecurityPolicyRule>>> authorizeSecurityPolicyRules() {
        return Codegen.optional(this.authorizeSecurityPolicyRules);
    }
    /**
     * Whether to enable local camera redirection. Valid values: `on`, `off`.
     * 
     */
    @Export(name="cameraRedirect", refs={String.class}, tree="[0]")
    private Output<String> cameraRedirect;

    /**
     * @return Whether to enable local camera redirection. Valid values: `on`, `off`.
     * 
     */
    public Output<String> cameraRedirect() {
        return this.cameraRedirect;
    }
    /**
     * The clipboard policy. Valid values: `off`, `read`, `readwrite`.
     * 
     */
    @Export(name="clipboard", refs={String.class}, tree="[0]")
    private Output<String> clipboard;

    /**
     * @return The clipboard policy. Valid values: `off`, `read`, `readwrite`.
     * 
     */
    public Output<String> clipboard() {
        return this.clipboard;
    }
    /**
     * The list of domain.
     * 
     */
    @Export(name="domainList", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> domainList;

    /**
     * @return The list of domain.
     * 
     */
    public Output<Optional<String>> domainList() {
        return Codegen.optional(this.domainList);
    }
    /**
     * The access of html5. Valid values: `off`, `on`.
     * 
     */
    @Export(name="htmlAccess", refs={String.class}, tree="[0]")
    private Output<String> htmlAccess;

    /**
     * @return The access of html5. Valid values: `off`, `on`.
     * 
     */
    public Output<String> htmlAccess() {
        return this.htmlAccess;
    }
    /**
     * The html5 file transfer. Valid values: `all`, `download`, `off`, `upload`.
     * 
     */
    @Export(name="htmlFileTransfer", refs={String.class}, tree="[0]")
    private Output<String> htmlFileTransfer;

    /**
     * @return The html5 file transfer. Valid values: `all`, `download`, `off`, `upload`.
     * 
     */
    public Output<String> htmlFileTransfer() {
        return this.htmlFileTransfer;
    }
    /**
     * Local drive redirect policy. Valid values: `  readwrite `, `off`, `read`.
     * 
     */
    @Export(name="localDrive", refs={String.class}, tree="[0]")
    private Output<String> localDrive;

    /**
     * @return Local drive redirect policy. Valid values: `  readwrite `, `off`, `read`.
     * 
     */
    public Output<String> localDrive() {
        return this.localDrive;
    }
    /**
     * The name of policy group.
     * 
     */
    @Export(name="policyGroupName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> policyGroupName;

    /**
     * @return The name of policy group.
     * 
     */
    public Output<Optional<String>> policyGroupName() {
        return Codegen.optional(this.policyGroupName);
    }
    /**
     * Whether to enable screen recording. Valid values: `off`, `all-time`, `period`.
     * 
     */
    @Export(name="recording", refs={String.class}, tree="[0]")
    private Output<String> recording;

    /**
     * @return Whether to enable screen recording. Valid values: `off`, `all-time`, `period`.
     * 
     */
    public Output<String> recording() {
        return this.recording;
    }
    /**
     * The end time of recording, value: `HH:MM:SS`. This return value is meaningful only when the value of `recording` is `period`.
     * 
     */
    @Export(name="recordingEndTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> recordingEndTime;

    /**
     * @return The end time of recording, value: `HH:MM:SS`. This return value is meaningful only when the value of `recording` is `period`.
     * 
     */
    public Output<Optional<String>> recordingEndTime() {
        return Codegen.optional(this.recordingEndTime);
    }
    /**
     * The screen recording video retention. Valid values between 30 and 180. This return value is meaningful only when the value of `recording` is `period` or `all-time`.
     * 
     */
    @Export(name="recordingExpires", refs={Integer.class}, tree="[0]")
    private Output<Integer> recordingExpires;

    /**
     * @return The screen recording video retention. Valid values between 30 and 180. This return value is meaningful only when the value of `recording` is `period` or `all-time`.
     * 
     */
    public Output<Integer> recordingExpires() {
        return this.recordingExpires;
    }
    /**
     * The fps of recording. Valid values: `2`, `5`, `10`, `15`.
     * 
     */
    @Export(name="recordingFps", refs={Integer.class}, tree="[0]")
    private Output<Integer> recordingFps;

    /**
     * @return The fps of recording. Valid values: `2`, `5`, `10`, `15`.
     * 
     */
    public Output<Integer> recordingFps() {
        return this.recordingFps;
    }
    /**
     * The start time of recording, value: `HH:MM:SS`. This return value is meaningful only when the value of `recording` is `period`.
     * 
     */
    @Export(name="recordingStartTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> recordingStartTime;

    /**
     * @return The start time of recording, value: `HH:MM:SS`. This return value is meaningful only when the value of `recording` is `period`.
     * 
     */
    public Output<Optional<String>> recordingStartTime() {
        return Codegen.optional(this.recordingStartTime);
    }
    /**
     * The status of policy.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of policy.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The usb redirect policy. Valid values: `off`, `on`.
     * 
     */
    @Export(name="usbRedirect", refs={String.class}, tree="[0]")
    private Output<String> usbRedirect;

    /**
     * @return The usb redirect policy. Valid values: `off`, `on`.
     * 
     */
    public Output<String> usbRedirect() {
        return this.usbRedirect;
    }
    /**
     * The quality of visual. Valid values: `high`, `lossless`, `low`, `medium`.
     * 
     */
    @Export(name="visualQuality", refs={String.class}, tree="[0]")
    private Output<String> visualQuality;

    /**
     * @return The quality of visual. Valid values: `high`, `lossless`, `low`, `medium`.
     * 
     */
    public Output<String> visualQuality() {
        return this.visualQuality;
    }
    /**
     * The watermark policy. Valid values: `off`, `on`.
     * 
     */
    @Export(name="watermark", refs={String.class}, tree="[0]")
    private Output<String> watermark;

    /**
     * @return The watermark policy. Valid values: `off`, `on`.
     * 
     */
    public Output<String> watermark() {
        return this.watermark;
    }
    /**
     * The watermark transparency. Valid values: `DARK`, `LIGHT`, `MIDDLE`.
     * 
     */
    @Export(name="watermarkTransparency", refs={String.class}, tree="[0]")
    private Output<String> watermarkTransparency;

    /**
     * @return The watermark transparency. Valid values: `DARK`, `LIGHT`, `MIDDLE`.
     * 
     */
    public Output<String> watermarkTransparency() {
        return this.watermarkTransparency;
    }
    /**
     * The type of watemark. Valid values: `EndUserId`, `HostName`.
     * 
     */
    @Export(name="watermarkType", refs={String.class}, tree="[0]")
    private Output<String> watermarkType;

    /**
     * @return The type of watemark. Valid values: `EndUserId`, `HostName`.
     * 
     */
    public Output<String> watermarkType() {
        return this.watermarkType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EcdPolicyGroup(String name) {
        this(name, EcdPolicyGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EcdPolicyGroup(String name, @Nullable EcdPolicyGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EcdPolicyGroup(String name, @Nullable EcdPolicyGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eds/ecdPolicyGroup:EcdPolicyGroup", name, args == null ? EcdPolicyGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EcdPolicyGroup(String name, Output<String> id, @Nullable EcdPolicyGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eds/ecdPolicyGroup:EcdPolicyGroup", name, state, makeResourceOptions(options, id));
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
    public static EcdPolicyGroup get(String name, Output<String> id, @Nullable EcdPolicyGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EcdPolicyGroup(name, id, state, options);
    }
}
