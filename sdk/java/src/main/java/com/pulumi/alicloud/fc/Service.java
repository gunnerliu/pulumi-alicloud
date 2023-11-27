// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.fc.ServiceArgs;
import com.pulumi.alicloud.fc.inputs.ServiceState;
import com.pulumi.alicloud.fc.outputs.ServiceLogConfig;
import com.pulumi.alicloud.fc.outputs.ServiceNasConfig;
import com.pulumi.alicloud.fc.outputs.ServiceTracingConfig;
import com.pulumi.alicloud.fc.outputs.ServiceVpcConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="alicloud:fc/service:Service")
public class Service extends com.pulumi.resources.CustomResource {
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="internetAccess", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> internetAccess;

    public Output<Optional<Boolean>> internetAccess() {
        return Codegen.optional(this.internetAccess);
    }
    @Export(name="lastModified", refs={String.class}, tree="[0]")
    private Output<String> lastModified;

    public Output<String> lastModified() {
        return this.lastModified;
    }
    @Export(name="logConfig", refs={ServiceLogConfig.class}, tree="[0]")
    private Output</* @Nullable */ ServiceLogConfig> logConfig;

    public Output<Optional<ServiceLogConfig>> logConfig() {
        return Codegen.optional(this.logConfig);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="namePrefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> namePrefix;

    public Output<Optional<String>> namePrefix() {
        return Codegen.optional(this.namePrefix);
    }
    @Export(name="nasConfig", refs={ServiceNasConfig.class}, tree="[0]")
    private Output</* @Nullable */ ServiceNasConfig> nasConfig;

    public Output<Optional<ServiceNasConfig>> nasConfig() {
        return Codegen.optional(this.nasConfig);
    }
    @Export(name="publish", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> publish;

    public Output<Optional<Boolean>> publish() {
        return Codegen.optional(this.publish);
    }
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> role;

    public Output<Optional<String>> role() {
        return Codegen.optional(this.role);
    }
    @Export(name="serviceId", refs={String.class}, tree="[0]")
    private Output<String> serviceId;

    public Output<String> serviceId() {
        return this.serviceId;
    }
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tracingConfig", refs={ServiceTracingConfig.class}, tree="[0]")
    private Output</* @Nullable */ ServiceTracingConfig> tracingConfig;

    public Output<Optional<ServiceTracingConfig>> tracingConfig() {
        return Codegen.optional(this.tracingConfig);
    }
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    public Output<String> version() {
        return this.version;
    }
    @Export(name="vpcConfig", refs={ServiceVpcConfig.class}, tree="[0]")
    private Output</* @Nullable */ ServiceVpcConfig> vpcConfig;

    public Output<Optional<ServiceVpcConfig>> vpcConfig() {
        return Codegen.optional(this.vpcConfig);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, @Nullable ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, @Nullable ServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:fc/service:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Service(String name, Output<String> id, @Nullable ServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:fc/service:Service", name, state, makeResourceOptions(options, id));
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
    public static Service get(String name, Output<String> id, @Nullable ServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, state, options);
    }
}
