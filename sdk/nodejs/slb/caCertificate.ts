// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * A Load Balancer CA Certificate is used by the listener of the protocol https.
 *
 * For information about slb and how to use it, see [What is Server Load Balancer](https://www.alibabacloud.com/help/doc-detail/27539.htm).
 *
 * For information about CA Certificate and how to use it, see [Configure CA Certificate](https://www.alibabacloud.com/help/doc-detail/85968.htm).
 *
 * ## Example Usage
 *
 * * using CA certificate content
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * // create a CA certificate
 * const foo = new alicloud.slb.CaCertificate("foo", {
 *     caCertificate: `-----BEGIN CERTIFICATE-----
 * MIIDRjCCAq+gAwIBAgIJAJnI******90EAxEG/bJJyOm5LqoiA=
 * -----END CERTIFICATE-----`,
 *     caCertificateName: "tf-testAccSlbCACertificate",
 * });
 * ```
 *
 * * using CA certificate file
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * from "fs";
 *
 * const foo_file = new alicloud.slb.CaCertificate("foo-file", {
 *     caCertificateName: "tf-testAccSlbCACertificate",
 *     caCertificate: fs.readFileSync(`${path.module}/ca_certificate.pem`),
 * });
 * ```
 *
 * ## Import
 *
 * Server Load balancer CA Certificate can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:slb/caCertificate:CaCertificate example abc123456
 * ```
 */
export class CaCertificate extends pulumi.CustomResource {
    /**
     * Get an existing CaCertificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CaCertificateState, opts?: pulumi.CustomResourceOptions): CaCertificate {
        return new CaCertificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:slb/caCertificate:CaCertificate';

    /**
     * Returns true if the given object is an instance of CaCertificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CaCertificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CaCertificate.__pulumiType;
    }

    /**
     * the content of the CA certificate.
     */
    public readonly caCertificate!: pulumi.Output<string>;
    public readonly caCertificateName!: pulumi.Output<string>;
    /**
     * Field `name` has been deprecated from provider version 1.123.1. New field `caCertificateName` instead
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.123.1. New field 'ca_certificate_name' instead
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Id of resource group which the slbCa certificate belongs.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;

    /**
     * Create a CaCertificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CaCertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CaCertificateArgs | CaCertificateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CaCertificateState | undefined;
            resourceInputs["caCertificate"] = state ? state.caCertificate : undefined;
            resourceInputs["caCertificateName"] = state ? state.caCertificateName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as CaCertificateArgs | undefined;
            if ((!args || args.caCertificate === undefined) && !opts.urn) {
                throw new Error("Missing required property 'caCertificate'");
            }
            resourceInputs["caCertificate"] = args ? args.caCertificate : undefined;
            resourceInputs["caCertificateName"] = args ? args.caCertificateName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CaCertificate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CaCertificate resources.
 */
export interface CaCertificateState {
    /**
     * the content of the CA certificate.
     */
    caCertificate?: pulumi.Input<string>;
    caCertificateName?: pulumi.Input<string>;
    /**
     * Field `name` has been deprecated from provider version 1.123.1. New field `caCertificateName` instead
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.123.1. New field 'ca_certificate_name' instead
     */
    name?: pulumi.Input<string>;
    /**
     * The Id of resource group which the slbCa certificate belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}

/**
 * The set of arguments for constructing a CaCertificate resource.
 */
export interface CaCertificateArgs {
    /**
     * the content of the CA certificate.
     */
    caCertificate: pulumi.Input<string>;
    caCertificateName?: pulumi.Input<string>;
    /**
     * Field `name` has been deprecated from provider version 1.123.1. New field `caCertificateName` instead
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.123.1. New field 'ca_certificate_name' instead
     */
    name?: pulumi.Input<string>;
    /**
     * The Id of resource group which the slbCa certificate belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
