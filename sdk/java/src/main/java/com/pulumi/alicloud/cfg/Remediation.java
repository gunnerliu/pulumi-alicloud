// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cfg.RemediationArgs;
import com.pulumi.alicloud.cfg.inputs.RemediationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Config Remediation resource.
 * 
 * For information about Config Remediation and how to use it, see [What is Remediation](https://www.alibabacloud.com/help/en/cloud-config/latest/api-config-2020-09-07-createremediation).
 * 
 * &gt; **NOTE:** Available since v1.204.0.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetRegionsArgs;
 * import com.pulumi.alicloud.oss.Bucket;
 * import com.pulumi.alicloud.oss.BucketArgs;
 * import com.pulumi.alicloud.cfg.Rule;
 * import com.pulumi.alicloud.cfg.RuleArgs;
 * import com.pulumi.alicloud.cfg.Remediation;
 * import com.pulumi.alicloud.cfg.RemediationArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-example-oss&#34;);
 *         final var defaultRegions = AlicloudFunctions.getRegions(GetRegionsArgs.builder()
 *             .current(true)
 *             .build());
 * 
 *         var defaultBucket = new Bucket(&#34;defaultBucket&#34;, BucketArgs.builder()        
 *             .bucket(name)
 *             .acl(&#34;public-read&#34;)
 *             .tags(Map.of(&#34;For&#34;, &#34;example&#34;))
 *             .build());
 * 
 *         var defaultRule = new Rule(&#34;defaultRule&#34;, RuleArgs.builder()        
 *             .description(&#34;If the ACL policy of the OSS bucket denies read access from the Internet, the configuration is considered compliant.&#34;)
 *             .sourceOwner(&#34;ALIYUN&#34;)
 *             .sourceIdentifier(&#34;oss-bucket-public-read-prohibited&#34;)
 *             .riskLevel(1)
 *             .tagKeyScope(&#34;For&#34;)
 *             .tagValueScope(&#34;example&#34;)
 *             .regionIdsScope(defaultRegions.applyValue(getRegionsResult -&gt; getRegionsResult.regions()[0].id()))
 *             .configRuleTriggerTypes(&#34;ConfigurationItemChangeNotification&#34;)
 *             .resourceTypesScopes(&#34;ACS::OSS::Bucket&#34;)
 *             .ruleName(&#34;oss-bucket-public-read-prohibited&#34;)
 *             .build());
 * 
 *         var defaultRemediation = new Remediation(&#34;defaultRemediation&#34;, RemediationArgs.builder()        
 *             .configRuleId(defaultRule.configRuleId())
 *             .remediationTemplateId(&#34;ACS-OSS-PutBucketAcl&#34;)
 *             .remediationSourceType(&#34;ALIYUN&#34;)
 *             .invokeType(&#34;MANUAL_EXECUTION&#34;)
 *             .params(defaultBucket.bucket().applyValue(bucket -&gt; String.format(&#34;{{\&#34;bucketName\&#34;: \&#34;%s\&#34;, \&#34;regionId\&#34;: \&#34;%s\&#34;, \&#34;permissionName\&#34;: \&#34;private\&#34;}}&#34;, bucket,defaultRegions.applyValue(getRegionsResult -&gt; getRegionsResult.regions()[0].id()))))
 *             .remediationType(&#34;OOS&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Config Remediation can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cfg/remediation:Remediation example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cfg/remediation:Remediation")
public class Remediation extends com.pulumi.resources.CustomResource {
    /**
     * Rule ID.
     * 
     */
    @Export(name="configRuleId", refs={String.class}, tree="[0]")
    private Output<String> configRuleId;

    /**
     * @return Rule ID.
     * 
     */
    public Output<String> configRuleId() {
        return this.configRuleId;
    }
    /**
     * Execution type, valid values: `Manual`, `Automatic`.
     * 
     */
    @Export(name="invokeType", refs={String.class}, tree="[0]")
    private Output<String> invokeType;

    /**
     * @return Execution type, valid values: `Manual`, `Automatic`.
     * 
     */
    public Output<String> invokeType() {
        return this.invokeType;
    }
    /**
     * Remediation parameter.
     * 
     */
    @Export(name="params", refs={String.class}, tree="[0]")
    private Output<String> params;

    /**
     * @return Remediation parameter.
     * 
     */
    public Output<String> params() {
        return this.params;
    }
    /**
     * Remediation ID.
     * 
     */
    @Export(name="remediationId", refs={String.class}, tree="[0]")
    private Output<String> remediationId;

    /**
     * @return Remediation ID.
     * 
     */
    public Output<String> remediationId() {
        return this.remediationId;
    }
    /**
     * Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
     * 
     */
    @Export(name="remediationSourceType", refs={String.class}, tree="[0]")
    private Output<String> remediationSourceType;

    /**
     * @return Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
     * 
     */
    public Output<String> remediationSourceType() {
        return this.remediationSourceType;
    }
    /**
     * Remediation template ID.
     * 
     */
    @Export(name="remediationTemplateId", refs={String.class}, tree="[0]")
    private Output<String> remediationTemplateId;

    /**
     * @return Remediation template ID.
     * 
     */
    public Output<String> remediationTemplateId() {
        return this.remediationTemplateId;
    }
    /**
     * Remediation type, valid values: `OOS`, `FC`.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    @Export(name="remediationType", refs={String.class}, tree="[0]")
    private Output<String> remediationType;

    /**
     * @return Remediation type, valid values: `OOS`, `FC`.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    public Output<String> remediationType() {
        return this.remediationType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Remediation(String name) {
        this(name, RemediationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Remediation(String name, RemediationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Remediation(String name, RemediationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cfg/remediation:Remediation", name, args == null ? RemediationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Remediation(String name, Output<String> id, @Nullable RemediationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cfg/remediation:Remediation", name, state, makeResourceOptions(options, id));
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
    public static Remediation get(String name, Output<String> id, @Nullable RemediationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Remediation(name, id, state, options);
    }
}
