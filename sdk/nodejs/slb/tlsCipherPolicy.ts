// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a SLB Tls Cipher Policy resource.
 *
 * For information about SLB Tls Cipher Policy and how to use it, see [What is Tls Cipher Policy](https://www.alibabacloud.com/help/doc-detail/196714.htm).
 *
 * > **NOTE:** Available in v1.135.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.slb.TlsCipherPolicy("example", {
 *     ciphers: [
 *         "AES256-SHA256",
 *         "AES128-GCM-SHA256",
 *     ],
 *     tlsCipherPolicyName: "Test-example_value",
 *     tlsVersions: ["TLSv1.2"],
 * });
 * ```
 *
 * ## Import
 *
 * SLB Tls Cipher Policy can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:slb/tlsCipherPolicy:TlsCipherPolicy example <id>
 * ```
 */
export class TlsCipherPolicy extends pulumi.CustomResource {
    /**
     * Get an existing TlsCipherPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TlsCipherPolicyState, opts?: pulumi.CustomResourceOptions): TlsCipherPolicy {
        return new TlsCipherPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:slb/tlsCipherPolicy:TlsCipherPolicy';

    /**
     * Returns true if the given object is an instance of TlsCipherPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TlsCipherPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TlsCipherPolicy.__pulumiType;
    }

    /**
     * The encryption algorithms supported. It depends on the value of `tlsVersions`.
     */
    public readonly ciphers!: pulumi.Output<string[]>;
    /**
     * TLS policy instance state.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * TLS policy name. Length is from 2 to 128, or in both the English and Chinese characters must be with an uppercase/lowercase letter or a Chinese character and the beginning, may contain numbers, in dot `.`, underscore `_` or dash `-`.
     */
    public readonly tlsCipherPolicyName!: pulumi.Output<string>;
    /**
     * The version of TLS protocol. You can find the corresponding value description in the document center [What is Tls Cipher Policy](https://www.alibabacloud.com/help/doc-detail/196714.htm).
     */
    public readonly tlsVersions!: pulumi.Output<string[]>;

    /**
     * Create a TlsCipherPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TlsCipherPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TlsCipherPolicyArgs | TlsCipherPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TlsCipherPolicyState | undefined;
            resourceInputs["ciphers"] = state ? state.ciphers : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tlsCipherPolicyName"] = state ? state.tlsCipherPolicyName : undefined;
            resourceInputs["tlsVersions"] = state ? state.tlsVersions : undefined;
        } else {
            const args = argsOrState as TlsCipherPolicyArgs | undefined;
            if ((!args || args.ciphers === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ciphers'");
            }
            if ((!args || args.tlsCipherPolicyName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tlsCipherPolicyName'");
            }
            if ((!args || args.tlsVersions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tlsVersions'");
            }
            resourceInputs["ciphers"] = args ? args.ciphers : undefined;
            resourceInputs["tlsCipherPolicyName"] = args ? args.tlsCipherPolicyName : undefined;
            resourceInputs["tlsVersions"] = args ? args.tlsVersions : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TlsCipherPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TlsCipherPolicy resources.
 */
export interface TlsCipherPolicyState {
    /**
     * The encryption algorithms supported. It depends on the value of `tlsVersions`.
     */
    ciphers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * TLS policy instance state.
     */
    status?: pulumi.Input<string>;
    /**
     * TLS policy name. Length is from 2 to 128, or in both the English and Chinese characters must be with an uppercase/lowercase letter or a Chinese character and the beginning, may contain numbers, in dot `.`, underscore `_` or dash `-`.
     */
    tlsCipherPolicyName?: pulumi.Input<string>;
    /**
     * The version of TLS protocol. You can find the corresponding value description in the document center [What is Tls Cipher Policy](https://www.alibabacloud.com/help/doc-detail/196714.htm).
     */
    tlsVersions?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a TlsCipherPolicy resource.
 */
export interface TlsCipherPolicyArgs {
    /**
     * The encryption algorithms supported. It depends on the value of `tlsVersions`.
     */
    ciphers: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * TLS policy name. Length is from 2 to 128, or in both the English and Chinese characters must be with an uppercase/lowercase letter or a Chinese character and the beginning, may contain numbers, in dot `.`, underscore `_` or dash `-`.
     */
    tlsCipherPolicyName: pulumi.Input<string>;
    /**
     * The version of TLS protocol. You can find the corresponding value description in the document center [What is Tls Cipher Policy](https://www.alibabacloud.com/help/doc-detail/196714.htm).
     */
    tlsVersions: pulumi.Input<pulumi.Input<string>[]>;
}
