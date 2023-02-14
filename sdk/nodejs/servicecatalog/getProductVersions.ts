// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Service Catalog Product Version available to the user.[What is Product Version](https://www.alibabacloud.com/help/en/servicecatalog/latest/api-doc-servicecatalog-2021-09-01-api-doc-listproductversions)
 *
 * > **NOTE:** Available in 1.196.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.servicecatalog.getProductVersions({
 *     nameRegex: "1.0.0",
 *     productId: "prod-bp125x4k29wb7q",
 * });
 * export const alicloudServiceCatalogProductVersionExampleId = _default.then(_default => _default.productVersions?.[0]?.id);
 * ```
 */
export function getProductVersions(args: GetProductVersionsArgs, opts?: pulumi.InvokeOptions): Promise<GetProductVersionsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:servicecatalog/getProductVersions:getProductVersions", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "productId": args.productId,
    }, opts);
}

/**
 * A collection of arguments for invoking getProductVersions.
 */
export interface GetProductVersionsArgs {
    enableDetails?: boolean;
    /**
     * A list of Product Version IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Group Metric Rule name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * Product ID
     */
    productId: string;
}

/**
 * A collection of values returned by getProductVersions.
 */
export interface GetProductVersionsResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Product Version IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of name of Product Versions.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly productId: string;
    /**
     * A list of Product Version Entries. Each element contains the following attributes:
     */
    readonly productVersions: outputs.servicecatalog.GetProductVersionsProductVersion[];
    /**
     * @deprecated Field 'versions' has been deprecated from provider version 1.197.0.
     */
    readonly versions: outputs.servicecatalog.GetProductVersionsVersion[];
}
/**
 * This data source provides Service Catalog Product Version available to the user.[What is Product Version](https://www.alibabacloud.com/help/en/servicecatalog/latest/api-doc-servicecatalog-2021-09-01-api-doc-listproductversions)
 *
 * > **NOTE:** Available in 1.196.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.servicecatalog.getProductVersions({
 *     nameRegex: "1.0.0",
 *     productId: "prod-bp125x4k29wb7q",
 * });
 * export const alicloudServiceCatalogProductVersionExampleId = _default.then(_default => _default.productVersions?.[0]?.id);
 * ```
 */
export function getProductVersionsOutput(args: GetProductVersionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProductVersionsResult> {
    return pulumi.output(args).apply((a: any) => getProductVersions(a, opts))
}

/**
 * A collection of arguments for invoking getProductVersions.
 */
export interface GetProductVersionsOutputArgs {
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Product Version IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Group Metric Rule name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * Product ID
     */
    productId: pulumi.Input<string>;
}