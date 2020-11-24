// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source can query the public IP of the specified KVStore DBInstance.
 *
 * > **NOTE:** Available in v1.101.0+.
 */
export function getConnections(args: GetConnectionsArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectionsResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:kvstore/getConnections:getConnections", {
        "ids": args.ids,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnections.
 */
export interface GetConnectionsArgs {
    /**
     * A list of KVStore DBInstance ids, only support one item.
     */
    readonly ids: string;
    readonly outputFile?: string;
}

/**
 * A collection of values returned by getConnections.
 */
export interface GetConnectionsResult {
    /**
     * Public network details of the specified resource. contains the following attributes:
     */
    readonly connections: outputs.kvstore.GetConnectionsConnection[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of KVStore DBInstance ids.
     */
    readonly ids: string;
    readonly outputFile?: string;
}
