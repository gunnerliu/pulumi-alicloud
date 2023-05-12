// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list of KMS KeyVersions in an Alibaba Cloud account according to the specified filters.
 *
 * > NOTE: Available in v1.85.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const alicloudKmsKeyVersionsDs = alicloud.kms.getKeyVersions({
 *     ids: ["d89e8a53-b708-41aa-8c67-6873axxx"],
 *     keyId: "08438c-b4d5-4d05-928c-07b7xxxx",
 * });
 * export const allVersions = alicloudKmsKeyVersionsDs.then(alicloudKmsKeyVersionsDs => alicloudKmsKeyVersionsDs.versions);
 * ```
 */
export function getKeyVersions(args: GetKeyVersionsArgs, opts?: pulumi.InvokeOptions): Promise<GetKeyVersionsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:kms/getKeyVersions:getKeyVersions", {
        "ids": args.ids,
        "keyId": args.keyId,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getKeyVersions.
 */
export interface GetKeyVersionsArgs {
    /**
     * A list of KMS KeyVersion IDs.
     */
    ids?: string[];
    /**
     * The id of kms key.
     */
    keyId: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getKeyVersions.
 */
export interface GetKeyVersionsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of KMS KeyVersion IDs.
     */
    readonly ids: string[];
    /**
     * ID of the key.
     */
    readonly keyId: string;
    readonly outputFile?: string;
    /**
     * A list of KMS KeyVersions. Each element contains the following attributes:
     */
    readonly versions: outputs.kms.GetKeyVersionsVersion[];
}
/**
 * This data source provides a list of KMS KeyVersions in an Alibaba Cloud account according to the specified filters.
 *
 * > NOTE: Available in v1.85.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const alicloudKmsKeyVersionsDs = alicloud.kms.getKeyVersions({
 *     ids: ["d89e8a53-b708-41aa-8c67-6873axxx"],
 *     keyId: "08438c-b4d5-4d05-928c-07b7xxxx",
 * });
 * export const allVersions = alicloudKmsKeyVersionsDs.then(alicloudKmsKeyVersionsDs => alicloudKmsKeyVersionsDs.versions);
 * ```
 */
export function getKeyVersionsOutput(args: GetKeyVersionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKeyVersionsResult> {
    return pulumi.output(args).apply((a: any) => getKeyVersions(a, opts))
}

/**
 * A collection of arguments for invoking getKeyVersions.
 */
export interface GetKeyVersionsOutputArgs {
    /**
     * A list of KMS KeyVersion IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The id of kms key.
     */
    keyId: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
