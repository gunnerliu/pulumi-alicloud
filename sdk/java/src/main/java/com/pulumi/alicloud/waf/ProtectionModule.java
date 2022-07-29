// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.waf;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.waf.ProtectionModuleArgs;
import com.pulumi.alicloud.waf.inputs.ProtectionModuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Web Application Firewall(WAF) Protection Module resource.
 * 
 * For information about Web Application Firewall(WAF) Protection Module and how to use it, see [What is Protection Module](https://www.alibabacloud.com/help/en/doc-detail/160775.htm).
 * 
 * &gt; **NOTE:** Available in v1.141.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Web Application Firewall(WAF) Protection Module can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:waf/protectionModule:ProtectionModule example &lt;instance_id&gt;:&lt;domain&gt;:&lt;defense_type&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:waf/protectionModule:ProtectionModule")
public class ProtectionModule extends com.pulumi.resources.CustomResource {
    /**
     * The Protection Module. Valid values: `ac_cc`, `antifraud`, `dld`, `normalized`, `waf`.
     * * `waf`: RegEx Protection Engine.
     * * `dld`: Big Data Deep Learning Engine.
     * * `ac_cc`: HTTP Flood Protection.
     * * `antifraud`: Data Risk Control.
     * * `normalized`: Positive Security Model.
     * 
     */
    @Export(name="defenseType", type=String.class, parameters={})
    private Output<String> defenseType;

    /**
     * @return The Protection Module. Valid values: `ac_cc`, `antifraud`, `dld`, `normalized`, `waf`.
     * * `waf`: RegEx Protection Engine.
     * * `dld`: Big Data Deep Learning Engine.
     * * `ac_cc`: HTTP Flood Protection.
     * * `antifraud`: Data Risk Control.
     * * `normalized`: Positive Security Model.
     * 
     */
    public Output<String> defenseType() {
        return this.defenseType;
    }
    /**
     * The domain name that is added to WAF.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The domain name that is added to WAF.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * The ID of the WAF instance.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The ID of the WAF instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The protection mode of the specified protection module. **NOTE:** The value of the Mode parameter varies based on the value of the `defense_type` parameter.
     * * The `defense_type` is `waf`. `0`: block mode. `1`: warn mode.
     * * The `defense_type` is `dld`. `0`: warn mode. `1`: block mode.
     * * The `defense_type` is `ac_cc`. `0`: prevention mode. `1`: protection-emergency mode.
     * * The `defense_type` is `antifraud`. `0`: warn mode. `1`: block mode. `2`: strict interception mode.
     * * The `defense_type` is `normalized`. `0`: warn mode. `1`: block mode.
     * 
     */
    @Export(name="mode", type=Integer.class, parameters={})
    private Output<Integer> mode;

    /**
     * @return The protection mode of the specified protection module. **NOTE:** The value of the Mode parameter varies based on the value of the `defense_type` parameter.
     * * The `defense_type` is `waf`. `0`: block mode. `1`: warn mode.
     * * The `defense_type` is `dld`. `0`: warn mode. `1`: block mode.
     * * The `defense_type` is `ac_cc`. `0`: prevention mode. `1`: protection-emergency mode.
     * * The `defense_type` is `antifraud`. `0`: warn mode. `1`: block mode. `2`: strict interception mode.
     * * The `defense_type` is `normalized`. `0`: warn mode. `1`: block mode.
     * 
     */
    public Output<Integer> mode() {
        return this.mode;
    }
    /**
     * The status of the resource. Valid values: `0`, `1`.
     * * `0`: disables the protection module.
     * * `1`: enables the protection module.
     * 
     */
    @Export(name="status", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> status;

    /**
     * @return The status of the resource. Valid values: `0`, `1`.
     * * `0`: disables the protection module.
     * * `1`: enables the protection module.
     * 
     */
    public Output<Optional<Integer>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProtectionModule(String name) {
        this(name, ProtectionModuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProtectionModule(String name, ProtectionModuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProtectionModule(String name, ProtectionModuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:waf/protectionModule:ProtectionModule", name, args == null ? ProtectionModuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProtectionModule(String name, Output<String> id, @Nullable ProtectionModuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:waf/protectionModule:ProtectionModule", name, state, makeResourceOptions(options, id));
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
    public static ProtectionModule get(String name, Output<String> id, @Nullable ProtectionModuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProtectionModule(name, id, state, options);
    }
}
