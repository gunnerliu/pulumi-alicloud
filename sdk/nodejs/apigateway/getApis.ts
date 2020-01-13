// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the apis of the current Alibaba Cloud user.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * 
 * const dataApigatwayApis = alicloud.apigateway.getApis({
 *     outputFile: "output_ApiGatawayApis",
 * });
 * 
 * export const firstApiId = alicloud_api_gateway_apis_data_apigatway.apis.0.id;
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/api_gateway_apis.html.markdown.
 */
export function getApis(args?: GetApisArgs, opts?: pulumi.InvokeOptions): Promise<GetApisResult> & GetApisResult {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetApisResult> = pulumi.runtime.invoke("alicloud:apigateway/getApis:getApis", {
        "apiId": args.apiId,
        "groupId": args.groupId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getApis.
 */
export interface GetApisArgs {
    /**
     * (It has been deprecated from version 1.52.2, and use field 'ids' to replace.) ID of the specified API.
     */
    readonly apiId?: string;
    /**
     * ID of the specified group.
     */
    readonly groupId?: string;
    /**
     * A list of api IDs. 
     */
    readonly ids?: string[];
    /**
     * A regex string to filter api gateway apis by name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
}

/**
 * A collection of values returned by getApis.
 */
export interface GetApisResult {
    readonly apiId?: string;
    /**
     * A list of apis. Each element contains the following attributes:
     */
    readonly apis: outputs.apigateway.GetApisApi[];
    /**
     * The group id that the apis belong to.
     */
    readonly groupId?: string;
    /**
     * A list of api IDs. 
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of api names. 
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}