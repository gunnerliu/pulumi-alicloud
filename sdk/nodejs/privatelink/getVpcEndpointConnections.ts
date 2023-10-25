// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Privatelink Vpc Endpoint Connections of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.110.0+.
 */
export function getVpcEndpointConnections(args: GetVpcEndpointConnectionsArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcEndpointConnectionsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:privatelink/getVpcEndpointConnections:getVpcEndpointConnections", {
        "endpointId": args.endpointId,
        "endpointOwnerId": args.endpointOwnerId,
        "outputFile": args.outputFile,
        "serviceId": args.serviceId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcEndpointConnections.
 */
export interface GetVpcEndpointConnectionsArgs {
    /**
     * The ID of the Vpc Endpoint.
     */
    endpointId?: string;
    /**
     * The endpoint owner id.
     */
    endpointOwnerId?: number;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the Vpc Endpoint Service.
     */
    serviceId: string;
    /**
     * The status of Vpc Endpoint Connection.
     */
    status?: string;
}

/**
 * A collection of values returned by getVpcEndpointConnections.
 */
export interface GetVpcEndpointConnectionsResult {
    readonly connections: outputs.privatelink.GetVpcEndpointConnectionsConnection[];
    readonly endpointId?: string;
    readonly endpointOwnerId?: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    readonly serviceId: string;
    readonly status?: string;
}
/**
 * This data source provides the Privatelink Vpc Endpoint Connections of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.110.0+.
 */
export function getVpcEndpointConnectionsOutput(args: GetVpcEndpointConnectionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVpcEndpointConnectionsResult> {
    return pulumi.output(args).apply((a: any) => getVpcEndpointConnections(a, opts))
}

/**
 * A collection of arguments for invoking getVpcEndpointConnections.
 */
export interface GetVpcEndpointConnectionsOutputArgs {
    /**
     * The ID of the Vpc Endpoint.
     */
    endpointId?: pulumi.Input<string>;
    /**
     * The endpoint owner id.
     */
    endpointOwnerId?: pulumi.Input<number>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the Vpc Endpoint Service.
     */
    serviceId: pulumi.Input<string>;
    /**
     * The status of Vpc Endpoint Connection.
     */
    status?: pulumi.Input<string>;
}
