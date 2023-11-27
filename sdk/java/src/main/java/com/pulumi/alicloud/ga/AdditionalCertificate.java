// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ga.AdditionalCertificateArgs;
import com.pulumi.alicloud.ga.inputs.AdditionalCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Global Accelerator (GA) Additional Certificate resource.
 * 
 * For information about Global Accelerator (GA) Additional Certificate and how to use it, see [What is Additional Certificate](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-associateadditionalcertificateswithlistener).
 * 
 * &gt; **NOTE:** Available since v1.150.0.
 * 
 * ## Import
 * 
 * Global Accelerator (GA) Additional Certificate can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ga/additionalCertificate:AdditionalCertificate example &lt;accelerator_id&gt;:&lt;listener_id&gt;:&lt;domain&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ga/additionalCertificate:AdditionalCertificate")
public class AdditionalCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the GA instance.
     * 
     */
    @Export(name="acceleratorId", refs={String.class}, tree="[0]")
    private Output<String> acceleratorId;

    /**
     * @return The ID of the GA instance.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }
    /**
     * The Certificate ID. **NOTE:** From version 1.209.1, `certificate_id` can be modified.
     * 
     */
    @Export(name="certificateId", refs={String.class}, tree="[0]")
    private Output<String> certificateId;

    /**
     * @return The Certificate ID. **NOTE:** From version 1.209.1, `certificate_id` can be modified.
     * 
     */
    public Output<String> certificateId() {
        return this.certificateId;
    }
    /**
     * The domain name specified by the certificate. **NOTE:** You can associate each domain name with only one additional certificate.
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output<String> domain;

    /**
     * @return The domain name specified by the certificate. **NOTE:** You can associate each domain name with only one additional certificate.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * The ID of the listener. **NOTE:** Only HTTPS listeners support this parameter.
     * 
     */
    @Export(name="listenerId", refs={String.class}, tree="[0]")
    private Output<String> listenerId;

    /**
     * @return The ID of the listener. **NOTE:** Only HTTPS listeners support this parameter.
     * 
     */
    public Output<String> listenerId() {
        return this.listenerId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AdditionalCertificate(String name) {
        this(name, AdditionalCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AdditionalCertificate(String name, AdditionalCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AdditionalCertificate(String name, AdditionalCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/additionalCertificate:AdditionalCertificate", name, args == null ? AdditionalCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AdditionalCertificate(String name, Output<String> id, @Nullable AdditionalCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/additionalCertificate:AdditionalCertificate", name, state, makeResourceOptions(options, id));
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
    public static AdditionalCertificate get(String name, Output<String> id, @Nullable AdditionalCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AdditionalCertificate(name, id, state, options);
    }
}
