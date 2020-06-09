// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export class Ciphertext extends pulumi.CustomResource {
    /**
     * Get an existing Ciphertext resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CiphertextState, opts?: pulumi.CustomResourceOptions): Ciphertext {
        return new Ciphertext(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:kms/ciphertext:Ciphertext';

    /**
     * Returns true if the given object is an instance of Ciphertext.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Ciphertext {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Ciphertext.__pulumiType;
    }

    /**
     * The ciphertext of the data key encrypted with the primary CMK version.
     */
    public /*out*/ readonly ciphertextBlob!: pulumi.Output<string>;
    /**
     * -
     * (Optional, ForceNew) The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
     */
    public readonly encryptionContext!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The globally unique ID of the CMK.
     */
    public readonly keyId!: pulumi.Output<string>;
    /**
     * The plaintext to be encrypted which must be encoded in Base64.
     */
    public readonly plaintext!: pulumi.Output<string>;

    /**
     * Create a Ciphertext resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CiphertextArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CiphertextArgs | CiphertextState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as CiphertextState | undefined;
            inputs["ciphertextBlob"] = state ? state.ciphertextBlob : undefined;
            inputs["encryptionContext"] = state ? state.encryptionContext : undefined;
            inputs["keyId"] = state ? state.keyId : undefined;
            inputs["plaintext"] = state ? state.plaintext : undefined;
        } else {
            const args = argsOrState as CiphertextArgs | undefined;
            if (!args || args.keyId === undefined) {
                throw new Error("Missing required property 'keyId'");
            }
            if (!args || args.plaintext === undefined) {
                throw new Error("Missing required property 'plaintext'");
            }
            inputs["encryptionContext"] = args ? args.encryptionContext : undefined;
            inputs["keyId"] = args ? args.keyId : undefined;
            inputs["plaintext"] = args ? args.plaintext : undefined;
            inputs["ciphertextBlob"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Ciphertext.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Ciphertext resources.
 */
export interface CiphertextState {
    /**
     * The ciphertext of the data key encrypted with the primary CMK version.
     */
    readonly ciphertextBlob?: pulumi.Input<string>;
    /**
     * -
     * (Optional, ForceNew) The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
     */
    readonly encryptionContext?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The globally unique ID of the CMK.
     */
    readonly keyId?: pulumi.Input<string>;
    /**
     * The plaintext to be encrypted which must be encoded in Base64.
     */
    readonly plaintext?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Ciphertext resource.
 */
export interface CiphertextArgs {
    /**
     * -
     * (Optional, ForceNew) The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
     */
    readonly encryptionContext?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The globally unique ID of the CMK.
     */
    readonly keyId: pulumi.Input<string>;
    /**
     * The plaintext to be encrypted which must be encoded in Base64.
     */
    readonly plaintext: pulumi.Input<string>;
}
