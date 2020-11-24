// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

export function getCiphertext(args: GetCiphertextArgs, opts?: pulumi.InvokeOptions): Promise<GetCiphertextResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
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
     * -
     * (Optional) The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
     */
    readonly encryptionContext?: {[key: string]: string};
    /**
     * The globally unique ID of the CMK.
     */
    readonly keyId: string;
    /**
     * The plaintext to be encrypted which must be encoded in Base64.
     */
    readonly plaintext: string;
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
