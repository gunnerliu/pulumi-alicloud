// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud;

import com.pulumi.alicloud.ProviderArgs;
import com.pulumi.alicloud.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the alicloud package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:alicloud")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * The access key for API operations. You can retrieve this from the &#39;Security Management&#39; section of the Alibaba Cloud
     * console.
     * 
     */
    @Export(name="accessKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessKey;

    /**
     * @return The access key for API operations. You can retrieve this from the &#39;Security Management&#39; section of the Alibaba Cloud
     * console.
     * 
     */
    public Output<Optional<String>> accessKey() {
        return Codegen.optional(this.accessKey);
    }
    /**
     * The account ID for some service API operations. You can retrieve this from the &#39;Security Settings&#39; section of the
     * Alibaba Cloud console.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> accountId;

    /**
     * @return The account ID for some service API operations. You can retrieve this from the &#39;Security Settings&#39; section of the
     * Alibaba Cloud console.
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * Use this to mark a terraform configuration file source.
     * 
     */
    @Export(name="configurationSource", type=String.class, parameters={})
    private Output</* @Nullable */ String> configurationSource;

    /**
     * @return Use this to mark a terraform configuration file source.
     * 
     */
    public Output<Optional<String>> configurationSource() {
        return Codegen.optional(this.configurationSource);
    }
    /**
     * The URI of sidecar credentials service.
     * 
     */
    @Export(name="credentialsUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> credentialsUri;

    /**
     * @return The URI of sidecar credentials service.
     * 
     */
    public Output<Optional<String>> credentialsUri() {
        return Codegen.optional(this.credentialsUri);
    }
    /**
     * The RAM Role Name attached on a ECS instance for API operations. You can retrieve this from the &#39;Access Control&#39; section
     * of the Alibaba Cloud console.
     * 
     */
    @Export(name="ecsRoleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> ecsRoleName;

    /**
     * @return The RAM Role Name attached on a ECS instance for API operations. You can retrieve this from the &#39;Access Control&#39; section
     * of the Alibaba Cloud console.
     * 
     */
    public Output<Optional<String>> ecsRoleName() {
        return Codegen.optional(this.ecsRoleName);
    }
    /**
     * @deprecated
     * Field &#39;fc&#39; has been deprecated from provider version 1.28.0. New field &#39;fc&#39; which in nested endpoints instead.
     * 
     */
    @Deprecated /* Field 'fc' has been deprecated from provider version 1.28.0. New field 'fc' which in nested endpoints instead. */
    @Export(name="fc", type=String.class, parameters={})
    private Output</* @Nullable */ String> fc;

    public Output<Optional<String>> fc() {
        return Codegen.optional(this.fc);
    }
    /**
     * @deprecated
     * Field &#39;log_endpoint&#39; has been deprecated from provider version 1.28.0. New field &#39;log&#39; which in nested endpoints instead.
     * 
     */
    @Deprecated /* Field 'log_endpoint' has been deprecated from provider version 1.28.0. New field 'log' which in nested endpoints instead. */
    @Export(name="logEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> logEndpoint;

    public Output<Optional<String>> logEndpoint() {
        return Codegen.optional(this.logEndpoint);
    }
    /**
     * @deprecated
     * Field &#39;mns_endpoint&#39; has been deprecated from provider version 1.28.0. New field &#39;mns&#39; which in nested endpoints instead.
     * 
     */
    @Deprecated /* Field 'mns_endpoint' has been deprecated from provider version 1.28.0. New field 'mns' which in nested endpoints instead. */
    @Export(name="mnsEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> mnsEndpoint;

    public Output<Optional<String>> mnsEndpoint() {
        return Codegen.optional(this.mnsEndpoint);
    }
    /**
     * @deprecated
     * Field &#39;ots_instance_name&#39; has been deprecated from provider version 1.10.0. New field &#39;instance_name&#39; of resource &#39;alicloud_ots_table&#39; instead.
     * 
     */
    @Deprecated /* Field 'ots_instance_name' has been deprecated from provider version 1.10.0. New field 'instance_name' of resource 'alicloud_ots_table' instead. */
    @Export(name="otsInstanceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> otsInstanceName;

    public Output<Optional<String>> otsInstanceName() {
        return Codegen.optional(this.otsInstanceName);
    }
    /**
     * The profile for API operations. If not set, the default profile created with `aliyun configure` will be used.
     * 
     */
    @Export(name="profile", type=String.class, parameters={})
    private Output</* @Nullable */ String> profile;

    /**
     * @return The profile for API operations. If not set, the default profile created with `aliyun configure` will be used.
     * 
     */
    public Output<Optional<String>> profile() {
        return Codegen.optional(this.profile);
    }
    @Export(name="protocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> protocol;

    public Output<Optional<String>> protocol() {
        return Codegen.optional(this.protocol);
    }
    /**
     * The region where Alibaba Cloud operations will take place. Examples are cn-beijing, cn-hangzhou, eu-central-1, etc.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    /**
     * @return The region where Alibaba Cloud operations will take place. Examples are cn-beijing, cn-hangzhou, eu-central-1, etc.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * The secret key for API operations. You can retrieve this from the &#39;Security Management&#39; section of the Alibaba Cloud
     * console.
     * 
     */
    @Export(name="secretKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> secretKey;

    /**
     * @return The secret key for API operations. You can retrieve this from the &#39;Security Management&#39; section of the Alibaba Cloud
     * console.
     * 
     */
    public Output<Optional<String>> secretKey() {
        return Codegen.optional(this.secretKey);
    }
    /**
     * The security transport for the assume role invoking.
     * 
     */
    @Export(name="secureTransport", type=String.class, parameters={})
    private Output</* @Nullable */ String> secureTransport;

    /**
     * @return The security transport for the assume role invoking.
     * 
     */
    public Output<Optional<String>> secureTransport() {
        return Codegen.optional(this.secureTransport);
    }
    /**
     * security token. A security token is only required if you are using Security Token Service.
     * 
     */
    @Export(name="securityToken", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityToken;

    /**
     * @return security token. A security token is only required if you are using Security Token Service.
     * 
     */
    public Output<Optional<String>> securityToken() {
        return Codegen.optional(this.securityToken);
    }
    @Export(name="securityTransport", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityTransport;

    public Output<Optional<String>> securityTransport() {
        return Codegen.optional(this.securityTransport);
    }
    /**
     * The path to the shared credentials file. If not set this defaults to ~/.aliyun/config.json
     * 
     */
    @Export(name="sharedCredentialsFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> sharedCredentialsFile;

    /**
     * @return The path to the shared credentials file. If not set this defaults to ~/.aliyun/config.json
     * 
     */
    public Output<Optional<String>> sharedCredentialsFile() {
        return Codegen.optional(this.sharedCredentialsFile);
    }
    /**
     * The source ip for the assume role invoking.
     * 
     */
    @Export(name="sourceIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceIp;

    /**
     * @return The source ip for the assume role invoking.
     * 
     */
    public Output<Optional<String>> sourceIp() {
        return Codegen.optional(this.sourceIp);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
