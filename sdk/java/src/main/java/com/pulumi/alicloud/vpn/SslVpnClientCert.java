// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpn.SslVpnClientCertArgs;
import com.pulumi.alicloud.vpn.inputs.SslVpnClientCertState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.vpn.SslVpnClientCert;
 * import com.pulumi.alicloud.vpn.SslVpnClientCertArgs;
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
 *         var foo = new SslVpnClientCert(&#34;foo&#34;, SslVpnClientCertArgs.builder()        
 *             .sslVpnServerId(&#34;ssl_vpn_server_fake_id&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * SSL-VPN client certificates can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpn/sslVpnClientCert:SslVpnClientCert example vsc-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:vpn/sslVpnClientCert:SslVpnClientCert")
public class SslVpnClientCert extends com.pulumi.resources.CustomResource {
    /**
     * The client ca cert.
     * 
     */
    @Export(name="caCert", type=String.class, parameters={})
    private Output<String> caCert;

    /**
     * @return The client ca cert.
     * 
     */
    public Output<String> caCert() {
        return this.caCert;
    }
    /**
     * The client cert.
     * 
     */
    @Export(name="clientCert", type=String.class, parameters={})
    private Output<String> clientCert;

    /**
     * @return The client cert.
     * 
     */
    public Output<String> clientCert() {
        return this.clientCert;
    }
    /**
     * The vpn client config.
     * 
     */
    @Export(name="clientConfig", type=String.class, parameters={})
    private Output<String> clientConfig;

    /**
     * @return The vpn client config.
     * 
     */
    public Output<String> clientConfig() {
        return this.clientConfig;
    }
    /**
     * The client key.
     * 
     */
    @Export(name="clientKey", type=String.class, parameters={})
    private Output<String> clientKey;

    /**
     * @return The client key.
     * 
     */
    public Output<String> clientKey() {
        return this.clientKey;
    }
    /**
     * The name of the client certificate.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the client certificate.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the SSL-VPN server.
     * 
     */
    @Export(name="sslVpnServerId", type=String.class, parameters={})
    private Output<String> sslVpnServerId;

    /**
     * @return The ID of the SSL-VPN server.
     * 
     */
    public Output<String> sslVpnServerId() {
        return this.sslVpnServerId;
    }
    /**
     * The status of the client certificate.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the client certificate.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SslVpnClientCert(String name) {
        this(name, SslVpnClientCertArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SslVpnClientCert(String name, SslVpnClientCertArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SslVpnClientCert(String name, SslVpnClientCertArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpn/sslVpnClientCert:SslVpnClientCert", name, args == null ? SslVpnClientCertArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SslVpnClientCert(String name, Output<String> id, @Nullable SslVpnClientCertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpn/sslVpnClientCert:SslVpnClientCert", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "caCert",
                "clientCert",
                "clientConfig",
                "clientKey"
            ))
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
    public static SslVpnClientCert get(String name, Output<String> id, @Nullable SslVpnClientCertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SslVpnClientCert(name, id, state, options);
    }
}
