// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getCiphertext(args: GetCiphertextArgs, opts?: pulumi.InvokeOptions): Promise<GetCiphertextResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:kms/getCiphertext:getCiphertext", {
        "encryptionContext": args.encryptionContext,
        "keyId": args.keyId,
        "plaintext": args.plaintext,
    }, opts);
}

/**
 * A collection of arguments for invoking getCiphertext.
 */
export interface GetCiphertextArgs {
    /**
     * The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
     */
    encryptionContext?: {[key: string]: string};
    /**
     * The globally unique ID of the CMK.
     */
    keyId: string;
    /**
     * The plaintext to be encrypted which must be encoded in Base64.
     */
    plaintext: string;
}

/**
 * A collection of values returned by getCiphertext.
 */
export interface GetCiphertextResult {
    /**
     * The ciphertext of the data key encrypted with the primary CMK version.
     */
    readonly ciphertextBlob: string;
    readonly encryptionContext?: {[key: string]: string};
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly keyId: string;
    readonly plaintext: string;
}
export function getCiphertextOutput(args: GetCiphertextOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCiphertextResult> {
    return pulumi.output(args).apply((a: any) => getCiphertext(a, opts))
}

/**
 * A collection of arguments for invoking getCiphertext.
 */
export interface GetCiphertextOutputArgs {
    /**
     * The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
     */
    encryptionContext?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The globally unique ID of the CMK.
     */
    keyId: pulumi.Input<string>;
    /**
     * The plaintext to be encrypted which must be encoded in Base64.
     */
    plaintext: pulumi.Input<string>;
}
