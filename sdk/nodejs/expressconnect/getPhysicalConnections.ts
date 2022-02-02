// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Express Connect Physical Connections of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.132.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.expressconnect.getPhysicalConnections({
 *     ids: ["pc-2345678"],
 * });
 * export const expressConnectPhysicalConnectionId1 = ids.then(ids => ids.connections?[0]?.id);
 * const nameRegex = alicloud.expressconnect.getPhysicalConnections({
 *     nameRegex: "^my-PhysicalConnection",
 * });
 * export const expressConnectPhysicalConnectionId2 = nameRegex.then(nameRegex => nameRegex.connections?[0]?.id);
 * ```
 */
export function getPhysicalConnections(args?: GetPhysicalConnectionsArgs, opts?: pulumi.InvokeOptions): Promise<GetPhysicalConnectionsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:expressconnect/getPhysicalConnections:getPhysicalConnections", {
        "ids": args.ids,
        "includeReservationData": args.includeReservationData,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getPhysicalConnections.
 */
export interface GetPhysicalConnectionsArgs {
    /**
     * A list of Physical Connection IDs.
     */
    ids?: string[];
    /**
     * The include reservation data.
     */
    includeReservationData?: boolean;
    /**
     * A regex string to filter results by Physical Connection name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * Resources on Behalf of a State of the Resource Attribute Field.
     */
    status?: string;
}

/**
 * A collection of values returned by getPhysicalConnections.
 */
export interface GetPhysicalConnectionsResult {
    readonly connections: outputs.expressconnect.GetPhysicalConnectionsConnection[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly includeReservationData?: boolean;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly status?: string;
}

export function getPhysicalConnectionsOutput(args?: GetPhysicalConnectionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPhysicalConnectionsResult> {
    return pulumi.output(args).apply(a => getPhysicalConnections(a, opts))
}

/**
 * A collection of arguments for invoking getPhysicalConnections.
 */
export interface GetPhysicalConnectionsOutputArgs {
    /**
     * A list of Physical Connection IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The include reservation data.
     */
    includeReservationData?: pulumi.Input<boolean>;
    /**
     * A regex string to filter results by Physical Connection name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * Resources on Behalf of a State of the Resource Attribute Field.
     */
    status?: pulumi.Input<string>;
}
