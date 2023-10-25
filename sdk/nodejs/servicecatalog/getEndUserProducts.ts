// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Service Catalog End User Product available to the user.[What is End User Product](https://www.alibabacloud.com/help/en/servicecatalog/latest/api-servicecatalog-2021-09-01-listproductsasenduser)
 *
 * > **NOTE:** Available since v1.197.0.
 */
export function getEndUserProducts(args?: GetEndUserProductsArgs, opts?: pulumi.InvokeOptions): Promise<GetEndUserProductsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:servicecatalog/getEndUserProducts:getEndUserProducts", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "sortBy": args.sortBy,
        "sortOrder": args.sortOrder,
    }, opts);
}

/**
 * A collection of arguments for invoking getEndUserProducts.
 */
export interface GetEndUserProductsArgs {
    /**
     * A list of End User Product IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by product name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The field that is used to sort the queried data. The value is fixed as CreateTime, which specifies the creation time of products.
     */
    sortBy?: string;
    /**
     * The order in which you want to sort the queried data. Valid values: `Asc`, `Desc`.
     */
    sortOrder?: string;
}

/**
 * A collection of values returned by getEndUserProducts.
 */
export interface GetEndUserProductsResult {
    /**
     * A list of End User Product Entries. Each element contains the following attributes:
     */
    readonly endUserProducts: outputs.servicecatalog.GetEndUserProductsEndUserProduct[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of End User Product IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    readonly sortBy?: string;
    readonly sortOrder?: string;
}
/**
 * This data source provides Service Catalog End User Product available to the user.[What is End User Product](https://www.alibabacloud.com/help/en/servicecatalog/latest/api-servicecatalog-2021-09-01-listproductsasenduser)
 *
 * > **NOTE:** Available since v1.197.0.
 */
export function getEndUserProductsOutput(args?: GetEndUserProductsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEndUserProductsResult> {
    return pulumi.output(args).apply((a: any) => getEndUserProducts(a, opts))
}

/**
 * A collection of arguments for invoking getEndUserProducts.
 */
export interface GetEndUserProductsOutputArgs {
    /**
     * A list of End User Product IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by product name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The field that is used to sort the queried data. The value is fixed as CreateTime, which specifies the creation time of products.
     */
    sortBy?: pulumi.Input<string>;
    /**
     * The order in which you want to sort the queried data. Valid values: `Asc`, `Desc`.
     */
    sortOrder?: pulumi.Input<string>;
}
