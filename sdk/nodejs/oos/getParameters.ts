// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Oos Parameters of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.147.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.oos.getParameters({
 *     ids: ["my-Parameter"],
 * });
 * export const oosParameterId1 = ids.then(ids => ids.parameters?[0]?.id);
 * const nameRegex = alicloud.oos.getParameters({
 *     nameRegex: "^my-Parameter",
 * });
 * export const oosParameterId2 = nameRegex.then(nameRegex => nameRegex.parameters?[0]?.id);
 * const resourceGroupId = alicloud.oos.getParameters({
 *     ids: ["my-Parameter"],
 *     resourceGroupId: "example_value",
 * });
 * export const oosParameterId3 = resourceGroupId.then(resourceGroupId => resourceGroupId.parameters?[0]?.id);
 * const tags = alicloud.oos.getParameters({
 *     ids: ["my-Parameter"],
 *     tags: {
 *         Created: "TF",
 *         For: "OosParameter",
 *     },
 * });
 * export const oosParameterId4 = tags.then(tags => tags.parameters?[0]?.id);
 * ```
 */
export function getParameters(args?: GetParametersArgs, opts?: pulumi.InvokeOptions): Promise<GetParametersResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:oos/getParameters:getParameters", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "parameterName": args.parameterName,
        "resourceGroupId": args.resourceGroupId,
        "sortField": args.sortField,
        "sortOrder": args.sortOrder,
        "tags": args.tags,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getParameters.
 */
export interface GetParametersArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Parameter IDs. Its element value is same as Parameter Name.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Parameter name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The name of the common parameter.
     */
    parameterName?: string;
    /**
     * The ID of the Resource Group.
     */
    resourceGroupId?: string;
    sortField?: string;
    sortOrder?: string;
    /**
     * The tag of the resource.
     */
    tags?: {[key: string]: any};
    /**
     * The data type of the common parameter.
     */
    type?: string;
}

/**
 * A collection of values returned by getParameters.
 */
export interface GetParametersResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly parameterName?: string;
    readonly parameters: outputs.oos.GetParametersParameter[];
    readonly resourceGroupId?: string;
    readonly sortField?: string;
    readonly sortOrder?: string;
    readonly tags?: {[key: string]: any};
    readonly type?: string;
}

export function getParametersOutput(args?: GetParametersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetParametersResult> {
    return pulumi.output(args).apply(a => getParameters(a, opts))
}

/**
 * A collection of arguments for invoking getParameters.
 */
export interface GetParametersOutputArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Parameter IDs. Its element value is same as Parameter Name.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Parameter name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The name of the common parameter.
     */
    parameterName?: pulumi.Input<string>;
    /**
     * The ID of the Resource Group.
     */
    resourceGroupId?: pulumi.Input<string>;
    sortField?: pulumi.Input<string>;
    sortOrder?: pulumi.Input<string>;
    /**
     * The tag of the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The data type of the common parameter.
     */
    type?: pulumi.Input<string>;
}
