// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.scdn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.scdn.DomainArgs;
import com.pulumi.alicloud.scdn.inputs.DomainState;
import com.pulumi.alicloud.scdn.outputs.DomainCertInfo;
import com.pulumi.alicloud.scdn.outputs.DomainSource;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a SCDN Domain resource.
 * 
 * For information about SCDN Domain and how to use it, see [What is Domain](https://help.aliyun.com/document_detail/63672.html).
 * 
 * &gt; **NOTE:** Available in v1.131.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SCDN Domain can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:scdn/domain:Domain example &lt;domain_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:scdn/domain:Domain")
public class Domain extends com.pulumi.resources.CustomResource {
    /**
     * Attribute perm has been deprecated and suggest removing it from your template.
     * 
     * @deprecated
     * Attribute biz_name has been deprecated and suggest removing it from your template.
     * 
     */
    @Deprecated /* Attribute biz_name has been deprecated and suggest removing it from your template. */
    @Export(name="bizName", type=String.class, parameters={})
    private Output</* @Nullable */ String> bizName;

    /**
     * @return Attribute perm has been deprecated and suggest removing it from your template.
     * 
     */
    public Output<Optional<String>> bizName() {
        return Codegen.optional(this.bizName);
    }
    /**
     * Certificate Information. See the following `Block cert_infos`.
     * 
     */
    @Export(name="certInfos", type=List.class, parameters={DomainCertInfo.class})
    private Output</* @Nullable */ List<DomainCertInfo>> certInfos;

    /**
     * @return Certificate Information. See the following `Block cert_infos`.
     * 
     */
    public Output<Optional<List<DomainCertInfo>>> certInfos() {
        return Codegen.optional(this.certInfos);
    }
    /**
     * The health check url.
     * 
     */
    @Export(name="checkUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> checkUrl;

    /**
     * @return The health check url.
     * 
     */
    public Output<Optional<String>> checkUrl() {
        return Codegen.optional(this.checkUrl);
    }
    /**
     * The name of domain.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The name of domain.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * Whether to set certificate forcibly.
     * 
     */
    @Export(name="forceSet", type=String.class, parameters={})
    private Output</* @Nullable */ String> forceSet;

    /**
     * @return Whether to set certificate forcibly.
     * 
     */
    public Output<Optional<String>> forceSet() {
        return Codegen.optional(this.forceSet);
    }
    /**
     * The resource group id.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output<String> resourceGroupId;

    /**
     * @return The resource group id.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * the Origin Server Information. See the following `Block sources`.
     * 
     */
    @Export(name="sources", type=List.class, parameters={DomainSource.class})
    private Output<List<DomainSource>> sources;

    /**
     * @return the Origin Server Information. See the following `Block sources`.
     * 
     */
    public Output<List<DomainSource>> sources() {
        return this.sources;
    }
    /**
     * The status of the resource. Valid values: `offline`, `online`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the resource. Valid values: `offline`, `online`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, DomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:scdn/domain:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:scdn/domain:Domain", name, state, makeResourceOptions(options, id));
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
    public static Domain get(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, state, options);
    }
}
