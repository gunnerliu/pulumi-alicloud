// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Global Accelerator (GA) Endpoint Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.113.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ga.getEndpointGroups({
 *     acceleratorId: "example_value",
 *     ids: ["example_value"],
 *     nameRegex: "the_resource_name",
 * });
 * export const firstGaEndpointGroupId = example.then(example => example.groups?[0]?.id);
 * ```
 */
export function getEndpointGroups(args: GetEndpointGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetEndpointGroupsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:ga/getEndpointGroups:getEndpointGroups", {
        "acceleratorId": args.acceleratorId,
        "endpointGroupType": args.endpointGroupType,
        "ids": args.ids,
        "listenerId": args.listenerId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getEndpointGroups.
 */
export interface GetEndpointGroupsArgs {
    /**
     * The ID of the Global Accelerator instance to which the endpoint group will be added.
     */
    acceleratorId: string;
    /**
     * The endpoint group type. Valid values: `default`, `virtual`. Default value is `default`.
     */
    endpointGroupType?: string;
    /**
     * A list of Endpoint Group IDs.
     */
    ids?: string[];
    /**
     * The ID of the listener that is associated with the endpoint group.
     */
    listenerId?: string;
    /**
     * A regex string to filter results by Endpoint Group name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The status of the endpoint group.
     */
    status?: string;
}

/**
 * A collection of values returned by getEndpointGroups.
 */
export interface GetEndpointGroupsResult {
    readonly acceleratorId: string;
    readonly endpointGroupType?: string;
    readonly groups: outputs.ga.GetEndpointGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly listenerId?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly status?: string;
}

export function getEndpointGroupsOutput(args: GetEndpointGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEndpointGroupsResult> {
    return pulumi.output(args).apply(a => getEndpointGroups(a, opts))
}

/**
 * A collection of arguments for invoking getEndpointGroups.
 */
export interface GetEndpointGroupsOutputArgs {
    /**
     * The ID of the Global Accelerator instance to which the endpoint group will be added.
     */
    acceleratorId: pulumi.Input<string>;
    /**
     * The endpoint group type. Valid values: `default`, `virtual`. Default value is `default`.
     */
    endpointGroupType?: pulumi.Input<string>;
    /**
     * A list of Endpoint Group IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the listener that is associated with the endpoint group.
     */
    listenerId?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Endpoint Group name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the endpoint group.
     */
    status?: pulumi.Input<string>;
}
