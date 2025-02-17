// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cloudsso.DirectoryArgs;
import com.pulumi.alicloud.cloudsso.inputs.DirectoryState;
import com.pulumi.alicloud.cloudsso.outputs.DirectorySamlIdentityProviderConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud SSO Directory resource.
 * 
 * For information about Cloud SSO Directory and how to use it, see [What is Directory](https://www.alibabacloud.com/help/en/cloudsso/latest/api-cloudsso-2021-05-15-createdirectory).
 * 
 * &gt; **NOTE:** Available since v1.135.0.
 * 
 * &gt; **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
 * 
 * ## Import
 * 
 * Cloud SSO Directory can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cloudsso/directory:Directory example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cloudsso/directory:Directory")
public class Directory extends com.pulumi.resources.CustomResource {
    /**
     * The name of the CloudSSO directory. The length is 2-64 characters, and it can contain lowercase letters, numbers, and dashes (-). It cannot start or end with a dash and cannot have two consecutive dashes. Need to be globally unique, and capitalization is not supported. Cannot start with `d-`.
     * 
     */
    @Export(name="directoryName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> directoryName;

    /**
     * @return The name of the CloudSSO directory. The length is 2-64 characters, and it can contain lowercase letters, numbers, and dashes (-). It cannot start or end with a dash and cannot have two consecutive dashes. Need to be globally unique, and capitalization is not supported. Cannot start with `d-`.
     * 
     */
    public Output<Optional<String>> directoryName() {
        return Codegen.optional(this.directoryName);
    }
    /**
     * The mfa authentication status. Valid values: `Enabled` or `Disabled`. Default to `Enabled`.
     * 
     */
    @Export(name="mfaAuthenticationStatus", refs={String.class}, tree="[0]")
    private Output<String> mfaAuthenticationStatus;

    /**
     * @return The mfa authentication status. Valid values: `Enabled` or `Disabled`. Default to `Enabled`.
     * 
     */
    public Output<String> mfaAuthenticationStatus() {
        return this.mfaAuthenticationStatus;
    }
    /**
     * The saml identity provider configuration. See `saml_identity_provider_configuration` below.
     * 
     * &gt; **NOTE:** The `saml_identity_provider_configuration` will be removed automatically when the resource is deleted, please operate with caution. If there are left more configuration in the directory, please remove them before deleting the directory.
     * 
     */
    @Export(name="samlIdentityProviderConfiguration", refs={DirectorySamlIdentityProviderConfiguration.class}, tree="[0]")
    private Output<DirectorySamlIdentityProviderConfiguration> samlIdentityProviderConfiguration;

    /**
     * @return The saml identity provider configuration. See `saml_identity_provider_configuration` below.
     * 
     * &gt; **NOTE:** The `saml_identity_provider_configuration` will be removed automatically when the resource is deleted, please operate with caution. If there are left more configuration in the directory, please remove them before deleting the directory.
     * 
     */
    public Output<DirectorySamlIdentityProviderConfiguration> samlIdentityProviderConfiguration() {
        return this.samlIdentityProviderConfiguration;
    }
    /**
     * The scim synchronization status. Valid values: `Enabled` or `Disabled`. Default to `Disabled`.
     * 
     */
    @Export(name="scimSynchronizationStatus", refs={String.class}, tree="[0]")
    private Output<String> scimSynchronizationStatus;

    /**
     * @return The scim synchronization status. Valid values: `Enabled` or `Disabled`. Default to `Disabled`.
     * 
     */
    public Output<String> scimSynchronizationStatus() {
        return this.scimSynchronizationStatus;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Directory(String name) {
        this(name, DirectoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Directory(String name, @Nullable DirectoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Directory(String name, @Nullable DirectoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudsso/directory:Directory", name, args == null ? DirectoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Directory(String name, Output<String> id, @Nullable DirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudsso/directory:Directory", name, state, makeResourceOptions(options, id));
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
    public static Directory get(String name, Output<String> id, @Nullable DirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Directory(name, id, state, options);
    }
}
