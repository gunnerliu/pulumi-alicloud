// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ros.ChangeSetArgs;
import com.pulumi.alicloud.ros.inputs.ChangeSetState;
import com.pulumi.alicloud.ros.outputs.ChangeSetParameter;
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
 * Provides a ROS Change Set resource.
 * 
 * For information about ROS Change Set and how to use it, see [What is Change Set](https://www.alibabacloud.com/help/doc-detail/131051.htm).
 * 
 * &gt; **NOTE:** Available in v1.105.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ROS Change Set can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ros/changeSet:ChangeSet example &lt;change_set_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ros/changeSet:ChangeSet")
public class ChangeSet extends com.pulumi.resources.CustomResource {
    /**
     * The name of the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
     * 
     */
    @Export(name="changeSetName", type=String.class, parameters={})
    private Output<String> changeSetName;

    /**
     * @return The name of the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
     * 
     */
    public Output<String> changeSetName() {
        return this.changeSetName;
    }
    /**
     * The type of the change set. Valid values:  CREATE: creates a change set for a new stack. UPDATE: creates a change set for an existing stack. IMPORT: creates a change set for a new stack or an existing stack to import non-ROS-managed resources. If you create a change set for a new stack, ROS creates a stack that has a unique stack ID. The stack is in the REVIEW_IN_PROGRESS state until you execute the change set.  You cannot use the UPDATE type to create a change set for a new stack or the CREATE type to create a change set for an existing stack.
     * 
     */
    @Export(name="changeSetType", type=String.class, parameters={})
    private Output</* @Nullable */ String> changeSetType;

    /**
     * @return The type of the change set. Valid values:  CREATE: creates a change set for a new stack. UPDATE: creates a change set for an existing stack. IMPORT: creates a change set for a new stack or an existing stack to import non-ROS-managed resources. If you create a change set for a new stack, ROS creates a stack that has a unique stack ID. The stack is in the REVIEW_IN_PROGRESS state until you execute the change set.  You cannot use the UPDATE type to create a change set for a new stack or the CREATE type to create a change set for an existing stack.
     * 
     */
    public Output<Optional<String>> changeSetType() {
        return Codegen.optional(this.changeSetType);
    }
    /**
     * The description of the change set. The description can be up to 1,024 bytes in length.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the change set. The description can be up to 1,024 bytes in length.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies whether to disable rollback on stack creation failure. Default value: false.  Valid values:  true: disables rollback on stack creation failure. false: enables rollback on stack creation failure. Note This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.
     * 
     */
    @Export(name="disableRollback", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableRollback;

    /**
     * @return Specifies whether to disable rollback on stack creation failure. Default value: false.  Valid values:  true: disables rollback on stack creation failure. false: enables rollback on stack creation failure. Note This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.
     * 
     */
    public Output<Optional<Boolean>> disableRollback() {
        return Codegen.optional(this.disableRollback);
    }
    /**
     * The notification urls.
     * 
     */
    @Export(name="notificationUrls", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> notificationUrls;

    /**
     * @return The notification urls.
     * 
     */
    public Output<Optional<List<String>>> notificationUrls() {
        return Codegen.optional(this.notificationUrls);
    }
    /**
     * Parameters.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={ChangeSetParameter.class})
    private Output<List<ChangeSetParameter>> parameters;

    /**
     * @return Parameters.
     * 
     */
    public Output<List<ChangeSetParameter>> parameters() {
        return this.parameters;
    }
    /**
     * The ram role name.
     * 
     */
    @Export(name="ramRoleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> ramRoleName;

    /**
     * @return The ram role name.
     * 
     */
    public Output<Optional<String>> ramRoleName() {
        return Codegen.optional(this.ramRoleName);
    }
    /**
     * The replacement option.
     * 
     */
    @Export(name="replacementOption", type=String.class, parameters={})
    private Output</* @Nullable */ String> replacementOption;

    /**
     * @return The replacement option.
     * 
     */
    public Output<Optional<String>> replacementOption() {
        return Codegen.optional(this.replacementOption);
    }
    /**
     * The ID of the stack for which you want to create the change set. ROS generates the change set by comparing the stack information with the information that you submit, such as a modified template or different inputs.
     * 
     */
    @Export(name="stackId", type=String.class, parameters={})
    private Output<String> stackId;

    /**
     * @return The ID of the stack for which you want to create the change set. ROS generates the change set by comparing the stack information with the information that you submit, such as a modified template or different inputs.
     * 
     */
    public Output<String> stackId() {
        return this.stackId;
    }
    /**
     * The name of the stack for which you want to create the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.  Note This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.
     * 
     */
    @Export(name="stackName", type=String.class, parameters={})
    private Output</* @Nullable */ String> stackName;

    /**
     * @return The name of the stack for which you want to create the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.  Note This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.
     * 
     */
    public Output<Optional<String>> stackName() {
        return Codegen.optional(this.stackName);
    }
    /**
     * The stack policy body.
     * 
     */
    @Export(name="stackPolicyBody", type=String.class, parameters={})
    private Output</* @Nullable */ String> stackPolicyBody;

    /**
     * @return The stack policy body.
     * 
     */
    public Output<Optional<String>> stackPolicyBody() {
        return Codegen.optional(this.stackPolicyBody);
    }
    /**
     * The stack policy during update body.
     * 
     */
    @Export(name="stackPolicyDuringUpdateBody", type=String.class, parameters={})
    private Output</* @Nullable */ String> stackPolicyDuringUpdateBody;

    /**
     * @return The stack policy during update body.
     * 
     */
    public Output<Optional<String>> stackPolicyDuringUpdateBody() {
        return Codegen.optional(this.stackPolicyDuringUpdateBody);
    }
    /**
     * The stack policy during update url.
     * 
     */
    @Export(name="stackPolicyDuringUpdateUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> stackPolicyDuringUpdateUrl;

    /**
     * @return The stack policy during update url.
     * 
     */
    public Output<Optional<String>> stackPolicyDuringUpdateUrl() {
        return Codegen.optional(this.stackPolicyDuringUpdateUrl);
    }
    /**
     * The stack policy url.
     * 
     */
    @Export(name="stackPolicyUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> stackPolicyUrl;

    /**
     * @return The stack policy url.
     * 
     */
    public Output<Optional<String>> stackPolicyUrl() {
        return Codegen.optional(this.stackPolicyUrl);
    }
    /**
     * The status of the change set.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the change set.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You can specify one of TemplateBody or TemplateURL parameters, but you cannot specify both of them.
     * 
     */
    @Export(name="templateBody", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateBody;

    /**
     * @return The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You can specify one of TemplateBody or TemplateURL parameters, but you cannot specify both of them.
     * 
     */
    public Output<Optional<String>> templateBody() {
        return Codegen.optional(this.templateBody);
    }
    /**
     * The template url.
     * 
     */
    @Export(name="templateUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateUrl;

    /**
     * @return The template url.
     * 
     */
    public Output<Optional<String>> templateUrl() {
        return Codegen.optional(this.templateUrl);
    }
    /**
     * Timeout In Minutes.
     * 
     */
    @Export(name="timeoutInMinutes", type=Integer.class, parameters={})
    private Output<Integer> timeoutInMinutes;

    /**
     * @return Timeout In Minutes.
     * 
     */
    public Output<Integer> timeoutInMinutes() {
        return this.timeoutInMinutes;
    }
    /**
     * The use previous parameters.
     * 
     */
    @Export(name="usePreviousParameters", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> usePreviousParameters;

    /**
     * @return The use previous parameters.
     * 
     */
    public Output<Optional<Boolean>> usePreviousParameters() {
        return Codegen.optional(this.usePreviousParameters);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ChangeSet(String name) {
        this(name, ChangeSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ChangeSet(String name, ChangeSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ChangeSet(String name, ChangeSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ros/changeSet:ChangeSet", name, args == null ? ChangeSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ChangeSet(String name, Output<String> id, @Nullable ChangeSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ros/changeSet:ChangeSet", name, state, makeResourceOptions(options, id));
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
    public static ChangeSet get(String name, Output<String> id, @Nullable ChangeSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ChangeSet(name, id, state, options);
    }
}
