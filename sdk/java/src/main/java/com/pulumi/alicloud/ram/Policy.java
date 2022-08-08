// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ram.PolicyArgs;
import com.pulumi.alicloud.ram.inputs.PolicyState;
import com.pulumi.alicloud.ram.outputs.PolicyStatement;
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
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.ram.Policy;
 * import com.pulumi.alicloud.ram.PolicyArgs;
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
 *         var policy = new Policy(&#34;policy&#34;, PolicyArgs.builder()        
 *             .description(&#34;this is a policy test&#34;)
 *             .force(true)
 *             .policyDocument(&#34;&#34;&#34;
 *   {
 *     &#34;Statement&#34;: [
 *       {
 *         &#34;Action&#34;: [
 *           &#34;oss:ListObjects&#34;,
 *           &#34;oss:GetObject&#34;
 *         ],
 *         &#34;Effect&#34;: &#34;Allow&#34;,
 *         &#34;Resource&#34;: [
 *           &#34;acs:oss:*:*:mybucket&#34;,
 *           &#34;acs:oss:*:*:mybucket/*&#34;
 *         ]
 *       }
 *     ],
 *       &#34;Version&#34;: &#34;1&#34;
 *   }
 *   
 *             &#34;&#34;&#34;)
 *             .policyName(&#34;policyName&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * RAM policy can be imported using the id or name, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ram/policy:Policy example my-policy
 * ```
 * 
 */
@ResourceType(type="alicloud:ram/policy:Policy")
public class Policy extends com.pulumi.resources.CustomResource {
    /**
     * The policy attachment count.
     * 
     */
    @Export(name="attachmentCount", type=Integer.class, parameters={})
    private Output<Integer> attachmentCount;

    /**
     * @return The policy attachment count.
     * 
     */
    public Output<Integer> attachmentCount() {
        return this.attachmentCount;
    }
    /**
     * The default version of policy.
     * 
     */
    @Export(name="defaultVersion", type=String.class, parameters={})
    private Output<String> defaultVersion;

    /**
     * @return The default version of policy.
     * 
     */
    public Output<String> defaultVersion() {
        return this.defaultVersion;
    }
    /**
     * Description of the RAM policy. This name can have a string of 1 to 1024 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the RAM policy. This name can have a string of 1 to 1024 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * It has been deprecated from provider version 1.114.0 and `policy_document` instead.
     * 
     * @deprecated
     * Field &#39;document&#39; has been deprecated from provider version 1.114.0. New field &#39;policy_document&#39; instead.
     * 
     */
    @Deprecated /* Field 'document' has been deprecated from provider version 1.114.0. New field 'policy_document' instead. */
    @Export(name="document", type=String.class, parameters={})
    private Output<String> document;

    /**
     * @return It has been deprecated from provider version 1.114.0 and `policy_document` instead.
     * 
     */
    public Output<String> document() {
        return this.document;
    }
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     * 
     */
    @Export(name="force", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> force;

    /**
     * @return This parameter is used for resource destroy. Default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * It has been deprecated from provider version 1.114.0 and `policy_name` instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.114.0. New field &#39;policy_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.114.0. New field 'policy_name' instead. */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return It has been deprecated from provider version 1.114.0 and `policy_name` instead.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Document of the RAM policy. It is required when the `statement` is not specified.
     * 
     */
    @Export(name="policyDocument", type=String.class, parameters={})
    private Output<String> policyDocument;

    /**
     * @return Document of the RAM policy. It is required when the `statement` is not specified.
     * 
     */
    public Output<String> policyDocument() {
        return this.policyDocument;
    }
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    @Export(name="policyName", type=String.class, parameters={})
    private Output<String> policyName;

    /**
     * @return Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }
    /**
     * The rotation strategy of the policy. You can use this parameter to delete an early policy version. Valid Values: `None`, `DeleteOldestNonDefaultVersionWhenLimitExceeded`. Default to `None`.
     * 
     */
    @Export(name="rotateStrategy", type=String.class, parameters={})
    private Output</* @Nullable */ String> rotateStrategy;

    /**
     * @return The rotation strategy of the policy. You can use this parameter to delete an early policy version. Valid Values: `None`, `DeleteOldestNonDefaultVersionWhenLimitExceeded`. Default to `None`.
     * 
     */
    public Output<Optional<String>> rotateStrategy() {
        return Codegen.optional(this.rotateStrategy);
    }
    /**
     * (It has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.) Statements of the RAM policy document. It is required when the `document` is not specified.
     * 
     * @deprecated
     * Field &#39;statement&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
     * 
     */
    @Deprecated /* Field 'statement' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
    @Export(name="statements", type=List.class, parameters={PolicyStatement.class})
    private Output<List<PolicyStatement>> statements;

    /**
     * @return (It has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.) Statements of the RAM policy document. It is required when the `document` is not specified.
     * 
     */
    public Output<List<PolicyStatement>> statements() {
        return this.statements;
    }
    /**
     * The policy type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The policy type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * (It has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.) Version of the RAM policy document. Valid value is `1`. Default value is `1`.
     * 
     * @deprecated
     * Field &#39;version&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
     * 
     */
    @Deprecated /* Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return (It has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.) Version of the RAM policy document. Valid value is `1`. Default value is `1`.
     * 
     */
    public Output<Optional<String>> version() {
        return Codegen.optional(this.version);
    }
    /**
     * The ID of default version policy.
     * 
     */
    @Export(name="versionId", type=String.class, parameters={})
    private Output<String> versionId;

    /**
     * @return The ID of default version policy.
     * 
     */
    public Output<String> versionId() {
        return this.versionId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Policy(String name) {
        this(name, PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Policy(String name, @Nullable PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, @Nullable PolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/policy:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Policy(String name, Output<String> id, @Nullable PolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/policy:Policy", name, state, makeResourceOptions(options, id));
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
    public static Policy get(String name, Output<String> id, @Nullable PolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, state, options);
    }
}
