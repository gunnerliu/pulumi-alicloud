// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Vpc Peer Connections of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.186.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.vpc.getPeerConnections({});
 * export const vpcPeerConnectionId1 = ids.then(ids => ids.connections?.[0]?.id);
 * const nameRegex = alicloud.vpc.getPeerConnections({
 *     nameRegex: "^my-PeerConnection",
 * });
 * export const vpcPeerConnectionId2 = nameRegex.then(nameRegex => nameRegex.connections?.[0]?.id);
 * ```
 */
export function getPeerConnections(args?: GetPeerConnectionsArgs, opts?: pulumi.InvokeOptions): Promise<GetPeerConnectionsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:vpc/getPeerConnections:getPeerConnections", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "peerConnectionName": args.peerConnectionName,
        "status": args.status,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPeerConnections.
 */
export interface GetPeerConnectionsArgs {
    /**
     * A list of PeerConnection IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by PeerConnection name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The name of the resource.
     */
    peerConnectionName?: string;
    /**
     * The status of the resource.
     */
    status?: string;
    /**
     * The ID of the requester VPC.
     */
    vpcId?: string;
}

/**
 * A collection of values returned by getPeerConnections.
 */
export interface GetPeerConnectionsResult {
    readonly connections: outputs.vpc.GetPeerConnectionsConnection[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly peerConnectionName?: string;
    readonly status?: string;
    readonly vpcId?: string;
}
/**
 * This data source provides the Vpc Peer Connections of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.186.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.vpc.getPeerConnections({});
 * export const vpcPeerConnectionId1 = ids.then(ids => ids.connections?.[0]?.id);
 * const nameRegex = alicloud.vpc.getPeerConnections({
 *     nameRegex: "^my-PeerConnection",
 * });
 * export const vpcPeerConnectionId2 = nameRegex.then(nameRegex => nameRegex.connections?.[0]?.id);
 * ```
 */
export function getPeerConnectionsOutput(args?: GetPeerConnectionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPeerConnectionsResult> {
    return pulumi.output(args).apply((a: any) => getPeerConnections(a, opts))
}

/**
 * A collection of arguments for invoking getPeerConnections.
 */
export interface GetPeerConnectionsOutputArgs {
    /**
     * A list of PeerConnection IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by PeerConnection name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The name of the resource.
     */
    peerConnectionName?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the requester VPC.
     */
    vpcId?: pulumi.Input<string>;
}
