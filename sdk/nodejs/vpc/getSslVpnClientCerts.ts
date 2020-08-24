// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * The SSL-VPN client certificates data source lists lots of SSL-VPN client certificates resource information owned by an Alicloud account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const foo = pulumi.output(alicloud.vpc.getSslVpnClientCerts({
 *     ids: ["fake-cert-id"],
 *     nameRegex: "^foo",
 *     outputFile: "/tmp/clientcert",
 *     sslVpnServerId: "fake-server-id",
 * }, { async: true }));
 * ```
 */
export function getSslVpnClientCerts(args?: GetSslVpnClientCertsArgs, opts?: pulumi.InvokeOptions): Promise<GetSslVpnClientCertsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:vpc/getSslVpnClientCerts:getSslVpnClientCerts", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "sslVpnServerId": args.sslVpnServerId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSslVpnClientCerts.
 */
export interface GetSslVpnClientCertsArgs {
    /**
     * IDs of the SSL-VPN client certificates.
     */
    readonly ids?: string[];
    /**
     * A regex string of SSL-VPN client certificate name.
     */
    readonly nameRegex?: string;
    /**
     * Save the result to the file.
     */
    readonly outputFile?: string;
    /**
     * Use the SSL-VPN server ID as the search key.
     */
    readonly sslVpnServerId?: string;
}

/**
 * A collection of values returned by getSslVpnClientCerts.
 */
export interface GetSslVpnClientCertsResult {
    readonly certs: outputs.vpc.GetSslVpnClientCertsCert[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of SSL-VPN client cert IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of SSL-VPN client cert names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * ID of the SSL-VPN Server.
     */
    readonly sslVpnServerId?: string;
}
